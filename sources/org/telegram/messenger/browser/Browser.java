package org.telegram.messenger.browser;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.IDN;
import java.net.URISyntaxException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.support.customtabs.CustomTabsCallback;
import org.telegram.messenger.support.customtabs.CustomTabsClient;
import org.telegram.messenger.support.customtabs.CustomTabsServiceConnection;
import org.telegram.messenger.support.customtabs.CustomTabsSession;
import org.telegram.messenger.support.customtabsclient.shared.CustomTabsHelper;
import org.telegram.messenger.support.customtabsclient.shared.ServiceConnection;
import org.telegram.messenger.support.customtabsclient.shared.ServiceConnectionCallback;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.LaunchActivity;

public abstract class Browser {
    private static WeakReference currentCustomTabsActivity;
    private static CustomTabsClient customTabsClient;
    private static WeakReference customTabsCurrentSession;
    private static String customTabsPackageToBind;
    private static CustomTabsServiceConnection customTabsServiceConnection;
    private static CustomTabsSession customTabsSession;
    private static Pattern domainPattern;

    private static void setCurrentSession(CustomTabsSession customTabsSession2) {
        customTabsCurrentSession = new WeakReference(customTabsSession2);
    }

    private static CustomTabsSession getSession() {
        CustomTabsClient customTabsClient2 = customTabsClient;
        if (customTabsClient2 == null) {
            customTabsSession = null;
        } else if (customTabsSession == null) {
            CustomTabsSession customTabsSessionNewSession = customTabsClient2.newSession(new NavigationCallback());
            customTabsSession = customTabsSessionNewSession;
            setCurrentSession(customTabsSessionNewSession);
        }
        return customTabsSession;
    }

    public static void bindCustomTabsService(Activity activity) {
        WeakReference weakReference = currentCustomTabsActivity;
        Activity activity2 = weakReference == null ? null : (Activity) weakReference.get();
        if (activity2 != null && activity2 != activity) {
            unbindCustomTabsService(activity2);
        }
        if (customTabsClient != null) {
            return;
        }
        currentCustomTabsActivity = new WeakReference(activity);
        try {
            if (TextUtils.isEmpty(customTabsPackageToBind)) {
                String packageNameToUse = CustomTabsHelper.getPackageNameToUse(activity);
                customTabsPackageToBind = packageNameToUse;
                if (packageNameToUse == null) {
                    return;
                }
            }
            ServiceConnection serviceConnection = new ServiceConnection(new ServiceConnectionCallback() {
                @Override
                public void onServiceConnected(CustomTabsClient customTabsClient2) {
                    CustomTabsClient unused = Browser.customTabsClient = customTabsClient2;
                    if (!SharedConfig.customTabs || Browser.customTabsClient == null) {
                        return;
                    }
                    try {
                        Browser.customTabsClient.warmup(0L);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }

                @Override
                public void onServiceDisconnected() {
                    CustomTabsClient unused = Browser.customTabsClient = null;
                }
            });
            customTabsServiceConnection = serviceConnection;
            if (CustomTabsClient.bindCustomTabsService(activity, customTabsPackageToBind, serviceConnection)) {
                return;
            }
            customTabsServiceConnection = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void unbindCustomTabsService(Activity activity) {
        if (customTabsServiceConnection == null) {
            return;
        }
        WeakReference weakReference = currentCustomTabsActivity;
        if ((weakReference == null ? null : (Activity) weakReference.get()) == activity) {
            currentCustomTabsActivity.clear();
        }
        try {
            activity.unbindService(customTabsServiceConnection);
        } catch (Exception unused) {
        }
        customTabsClient = null;
        customTabsSession = null;
    }

    private static class NavigationCallback extends CustomTabsCallback {
        @Override
        public void onNavigationEvent(int i, Bundle bundle) {
        }

        private NavigationCallback() {
        }
    }

    public static void openUrl(Context context, String str) {
        if (str == null) {
            return;
        }
        openUrl(context, Uri.parse(str), true);
    }

    public static void openUrlInSystemBrowser(Context context, String str) {
        if (str == null) {
            return;
        }
        openUrl(context, Uri.parse(str), false, true, false, null, null, false, false, false);
    }

    public static void openUrl(Context context, Uri uri) {
        openUrl(context, uri, true);
    }

    public static void openUrl(Context context, String str, boolean z) {
        if (context == null || str == null) {
            return;
        }
        openUrl(context, Uri.parse(str), z);
    }

    public static void openUrl(Context context, Uri uri, boolean z) {
        openUrl(context, uri, z, true);
    }

    public static void openUrl(Context context, String str, boolean z, boolean z2) {
        openUrl(context, Uri.parse(str), z, z2);
    }

    public static boolean isTelegraphUrl(String str, boolean z) {
        return isTelegraphUrl(str, z, false);
    }

    public static boolean isTelegraphUrl(String str, boolean z, boolean z2) {
        if (z) {
            return str.equals("telegra.ph") || str.equals("te.legra.ph") || str.equals("graph.org");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^(https");
        sb.append(z2 ? "" : "?");
        sb.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb.toString());
    }

    public static String extractUsername(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            if (str.startsWith("@")) {
                return str.substring(1);
            }
            if (str.startsWith("t.me/")) {
                return str.substring(5);
            }
            if (str.startsWith("http://t.me/")) {
                return str.substring(12);
            }
            if (str.startsWith("https://t.me/")) {
                return str.substring(13);
            }
            Matcher matcher = LaunchActivity.PREFIX_T_ME_PATTERN.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static boolean urlMustNotHaveConfirmation(String str) {
        return isTelegraphUrl(str, false, true) || str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") || str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") || str.matches("^(https://)?fragment\\.com(/.*|$)");
    }

    public static class Progress {
        private Runnable onCancelListener;
        private Runnable onEndListener;
        private Runnable onInitListener;

        public Progress() {
        }

        public Progress(Runnable runnable, Runnable runnable2) {
            this.onInitListener = runnable;
            this.onEndListener = runnable2;
        }

        public void init() {
            Runnable runnable = this.onInitListener;
            if (runnable != null) {
                runnable.run();
                this.onInitListener = null;
            }
        }

        public void end() {
            end(false);
        }

        public void end(boolean z) {
            Runnable runnable = this.onEndListener;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void cancel() {
            cancel(false);
        }

        public void cancel(boolean z) {
            Runnable runnable = this.onCancelListener;
            if (runnable != null) {
                runnable.run();
            }
            end(z);
        }

        public Progress onCancel(Runnable runnable) {
            this.onCancelListener = runnable;
            return this;
        }

        public Progress onEnd(Runnable runnable) {
            this.onEndListener = runnable;
            return this;
        }
    }

    public static void openUrl(Context context, Uri uri, boolean z, boolean z2) {
        openUrl(context, uri, z, z2, false, null, null, false, true, false);
    }

    public static void openUrl(Context context, Uri uri, boolean z, boolean z2, Progress progress) {
        openUrl(context, uri, z, z2, false, progress, null, false, true, false);
    }

    public static void openUrl(final android.content.Context r20, final android.net.Uri r21, boolean r22, boolean r23, boolean r24, final org.telegram.messenger.browser.Browser.Progress r25, java.lang.String r26, boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.browser.Browser.openUrl(android.content.Context, android.net.Uri, boolean, boolean, boolean, org.telegram.messenger.browser.Browser$Progress, java.lang.String, boolean, boolean, boolean):void");
    }

    public static void lambda$openUrl$1(final Progress progress, final AlertDialog[] alertDialogArr, final int i, final Uri uri, final Context context, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Browser.lambda$openUrl$0(progress, alertDialogArr, tLObject, i, uri, context, z);
            }
        });
    }

    public static void lambda$openUrl$0(Progress progress, AlertDialog[] alertDialogArr, TLObject tLObject, int i, Uri uri, Context context, boolean z) {
        if (progress != null) {
            progress.end();
        } else {
            try {
                alertDialogArr[0].dismiss();
            } catch (Throwable unused) {
            }
            alertDialogArr[0] = null;
        }
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(i).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(i).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                if ((webPage instanceof TLRPC.TL_webPage) && webPage.cached_page != null) {
                    NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, tL_messageMediaWebPage.webpage, uri.toString());
                    return;
                }
            }
        }
        openUrl(context, uri, z, false);
    }

    public static void lambda$openUrl$3(AlertDialog[] alertDialogArr, final int i) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        try {
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    Browser.lambda$openUrl$2(i, dialogInterface);
                }
            });
            alertDialogArr[0].show();
        } catch (Exception unused) {
        }
    }

    public static void lambda$openUrl$2(int i, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i, true);
    }

    public static boolean openAsInternalIntent(Context context, String str) {
        return openAsInternalIntent(context, str, false, false, null);
    }

    public static boolean openAsInternalIntent(Context context, String str, boolean z, boolean z2, Progress progress) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (AndroidUtilities.findActivity(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) AndroidUtilities.findActivity(context);
        } else {
            launchActivity = LaunchActivity.instance;
            if (launchActivity == null) {
                return false;
            }
        }
        if (launchActivity == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setComponent(new ComponentName(context.getPackageName(), LaunchActivity.class.getName()));
        intent.putExtra("create_new_tab", true);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("force_not_internal_apps", z);
        intent.putExtra("force_request", z2);
        launchActivity.onNewIntent(intent, progress);
        return true;
    }

    public static boolean openInTelegramBrowser(Context context, String str, Progress progress) throws NoSuchFieldException, InterruptedException, Resources.NotFoundException, PackageManager.NameNotFoundException, SecurityException, UnsupportedEncodingException {
        BottomSheetTabs bottomSheetTabs;
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null && (bottomSheetTabs = launchActivity.getBottomSheetTabs()) != null && bottomSheetTabs.tryReopenTab(str) != null) {
            return true;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null && (safeLastFragment.getParentLayout() instanceof ActionBarLayout)) {
            safeLastFragment = ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment();
        }
        if (safeLastFragment == null) {
            return false;
        }
        safeLastFragment.createArticleViewer(false).open(str, progress);
        return true;
    }

    public static boolean openInExternalBrowser(Context context, String str, boolean z) {
        return openInExternalBrowser(context, str, z, null);
    }

    public static boolean openInExternalBrowser(Context context, String str, boolean z, String str2) throws URISyntaxException {
        Intent intent;
        if (str == null) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            boolean z2 = uri.getScheme() != null && uri.getScheme().equalsIgnoreCase("intent");
            if (z2 && !z) {
                return false;
            }
            if (z2) {
                intent = Intent.parseUri(uri.toString(), 1);
            } else {
                intent = new Intent("android.intent.action.VIEW", uri);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.setPackage(str2);
            }
            intent.putExtra("create_new_tab", true);
            intent.putExtra("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static boolean isTonsite(String str) {
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            return true;
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() != null && uri.getScheme().equalsIgnoreCase("tonsite");
    }

    public static boolean isTonsitePunycode(String str) {
        boolean zMatches;
        if (domainPattern == null) {
            domainPattern = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            zMatches = domainPattern.matcher(hostAuthority).matches();
        } else {
            Uri uri = Uri.parse(str);
            if (uri.getScheme() == null || !uri.getScheme().equalsIgnoreCase("tonsite")) {
                return false;
            }
            zMatches = domainPattern.matcher(uri.getScheme()).matches();
        }
        return !zMatches;
    }

    public static boolean openInExternalApp(Context context, String str, boolean z) throws URISyntaxException {
        Intent intent;
        if (str == null) {
            return false;
        }
        try {
            if (!isTonsite(str) && !isInternalUrl(str, null)) {
                Uri uri = Uri.parse(str);
                String strReplace = replace(uri, uri.getScheme() == null ? "https" : uri.getScheme(), null, uri.getHost() != null ? uri.getHost().toLowerCase() : uri.getHost(), TextUtils.isEmpty(uri.getPath()) ? "/" : uri.getPath());
                Uri uri2 = Uri.parse(strReplace);
                boolean z2 = strReplace.startsWith("intent://") || (uri2.getScheme() != null && uri2.getScheme().equalsIgnoreCase("intent"));
                if (z2 && !z) {
                    return false;
                }
                if (z2) {
                    intent = Intent.parseUri(uri2.toString(), 1);
                } else {
                    intent = new Intent("android.intent.action.VIEW", uri2);
                }
                if (!z2 && Build.VERSION.SDK_INT >= 30) {
                    intent.addCategory("android.intent.category.BROWSABLE");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.addFlags(268435456);
                    intent.addFlags(1024);
                } else if (!z2 && !hasAppToOpen(context, strReplace)) {
                    return false;
                }
                context.startActivity(intent);
                return true;
            }
            return false;
        } catch (ActivityNotFoundException e) {
            FileLog.e((Throwable) e, false);
            return false;
        } catch (Exception e2) {
            FileLog.e(e2);
            return false;
        }
    }

    public static boolean hasAppToOpen(Context context, String str) {
        String[] strArr;
        List<ResolveInfo> listQueryIntentActivities;
        if (str == null) {
            return false;
        }
        List<ResolveInfo> listQueryIntentActivities2 = null;
        try {
            listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 0);
        } catch (Exception unused) {
        }
        if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
            strArr = null;
        } else {
            strArr = new String[listQueryIntentActivities.size()];
            for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                try {
                    strArr[i] = listQueryIntentActivities.get(i).activityInfo.packageName;
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("default browser name = " + strArr[i]);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        try {
            listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
            if (strArr != null) {
                int i2 = 0;
                while (i2 < listQueryIntentActivities2.size()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= strArr.length) {
                            break;
                        }
                        if (strArr[i3].equals(listQueryIntentActivities2.get(i2).activityInfo.packageName)) {
                            listQueryIntentActivities2.remove(i2);
                            i2--;
                            break;
                        }
                        i3++;
                    }
                    i2++;
                }
            } else {
                int i4 = 0;
                while (i4 < listQueryIntentActivities2.size()) {
                    if (isBrowserPackageName(listQueryIntentActivities2.get(i4).activityInfo.packageName.toLowerCase())) {
                        listQueryIntentActivities2.remove(i4);
                        i4--;
                    }
                    i4++;
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                for (int i5 = 0; i5 < listQueryIntentActivities2.size(); i5++) {
                    FileLog.d("device has " + listQueryIntentActivities2.get(i5).activityInfo.packageName + " to open " + str);
                }
            }
        } catch (Exception unused3) {
        }
        return (listQueryIntentActivities2 == null || listQueryIntentActivities2.isEmpty()) ? false : true;
    }

    public static boolean isInternalUrl(String str, boolean[] zArr) {
        return isInternalUri(Uri.parse(str), false, zArr);
    }

    public static boolean isInternalUrl(String str, boolean z, boolean[] zArr) {
        return isInternalUri(Uri.parse(str), z, zArr);
    }

    public static boolean isPassportUrl(String str) {
        String lowerCase;
        if (str == null) {
            return false;
        }
        try {
            lowerCase = str.toLowerCase();
        } catch (Throwable unused) {
        }
        if (lowerCase.startsWith("tg:passport") || lowerCase.startsWith("tg://passport") || lowerCase.startsWith("tg:secureid")) {
            return true;
        }
        if (lowerCase.contains("resolve")) {
            if (lowerCase.contains("domain=telegrampassport")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTMe(String str) {
        try {
            return TextUtils.equals(AndroidUtilities.getHostAuthority(str), MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix);
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static boolean isInternalUri(Uri uri, boolean[] zArr) {
        return isInternalUri(uri, false, zArr);
    }

    public static boolean isInternalUri(Uri uri, boolean z, boolean[] zArr) {
        String str;
        String str2;
        String hostAuthority = AndroidUtilities.getHostAuthority(uri);
        String lowerCase = "";
        String lowerCase2 = hostAuthority != null ? hostAuthority.toLowerCase() : "";
        if (MessagesController.getInstance(UserConfig.selectedAccount).authDomains.contains(lowerCase2)) {
            if (zArr != null) {
                zArr[0] = true;
            }
            return false;
        }
        Matcher matcher = LaunchActivity.PREFIX_T_ME_PATTERN.matcher(lowerCase2);
        if (matcher.find()) {
            StringBuilder sb = new StringBuilder();
            sb.append("https://t.me/");
            sb.append(matcher.group(1));
            if (TextUtils.isEmpty(uri.getPath())) {
                str = "";
            } else {
                str = "/" + uri.getPath();
            }
            sb.append(str);
            if (TextUtils.isEmpty(uri.getQuery())) {
                str2 = "";
            } else {
                str2 = "?" + uri.getQuery();
            }
            sb.append(str2);
            uri = Uri.parse(sb.toString());
            String host = uri.getHost();
            if (host != null) {
                lowerCase = host.toLowerCase();
            }
        } else {
            lowerCase = lowerCase2;
        }
        if ("ton".equals(uri.getScheme())) {
            try {
                List<ResolveInfo> listQueryIntentActivities = ApplicationLoader.applicationContext.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
                if (listQueryIntentActivities != null) {
                    if (listQueryIntentActivities.size() >= 1) {
                        return false;
                    }
                }
            } catch (Exception unused) {
            }
            return true;
        }
        if ("tg".equals(uri.getScheme())) {
            return true;
        }
        if ("telegram.dog".equals(lowerCase)) {
            String path = uri.getPath();
            if (path != null && path.length() > 1) {
                if (z) {
                    return true;
                }
                String lowerCase3 = path.substring(1).toLowerCase();
                if (!lowerCase3.startsWith("blog") && !lowerCase3.equals("iv") && !lowerCase3.startsWith("faq") && !lowerCase3.equals("apps") && !lowerCase3.startsWith("s/")) {
                    return true;
                }
                if (zArr != null) {
                    zArr[0] = true;
                }
                return false;
            }
        } else if ("telegram.me".equals(lowerCase) || "t.me".equals(lowerCase)) {
            String path2 = uri.getPath();
            if (path2 != null && path2.length() > 1) {
                if (z) {
                    return true;
                }
                String lowerCase4 = path2.substring(1).toLowerCase();
                if (!lowerCase4.equals("iv") && !lowerCase4.startsWith("s/")) {
                    return true;
                }
                if (zArr != null) {
                    zArr[0] = true;
                }
            }
        } else {
            if ("telegram.org".equals(lowerCase) && uri.getPath() != null && uri.getPath().startsWith("/blog/")) {
                return true;
            }
            if (z && (lowerCase.endsWith("telegram.org") || lowerCase.endsWith("telegra.ph") || lowerCase.endsWith("telesco.pe"))) {
                return true;
            }
        }
        return false;
    }

    public static String getBrowserPackageName(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    public static boolean isBrowserPackageName(String str) {
        return str != null && (str.contains("browser") || str.contains("chrome") || str.contains("firefox") || "com.microsoft.emmx".equals(str) || "com.opera.mini.native".equals(str) || "com.duckduckgo.mobile.android".equals(str) || "com.UCMobile.intl".equals(str));
    }

    public static boolean isPunycodeAllowed(String str) {
        if (str == null) {
            return true;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length <= 0) {
            return true;
        }
        return strArrSplit[strArrSplit.length - 1].startsWith("xn--");
    }

    public static String IDN_toUnicode(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!isPunycodeAllowed(str)) {
            return str;
        }
        try {
            return IDN.toUnicode(str, 1);
        } catch (Exception e2) {
            FileLog.e(e2);
            return str;
        }
    }

    public static String replaceHostname(Uri uri, String str, String str2) {
        return replace(uri, str2, null, str, null);
    }

    public static String replace(Uri uri, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = uri.getScheme();
        }
        if (str != null) {
            sb.append(str);
            sb.append("://");
        }
        if (str2 == null) {
            if (uri.getUserInfo() != null) {
                sb.append(uri.getUserInfo());
                sb.append("@");
            }
        } else if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
            sb.append("@");
        }
        if (str3 == null) {
            if (uri.getHost() != null) {
                sb.append(uri.getHost());
            }
        } else {
            sb.append(str3);
        }
        if (uri.getPort() != -1) {
            sb.append(":");
            sb.append(uri.getPort());
        }
        if (str4 != null) {
            sb.append(str4);
        } else if (uri.getPath() != null) {
            sb.append(uri.getPath());
        }
        if (uri.getQuery() != null) {
            sb.append("?");
            sb.append(uri.getQuery());
        }
        if (uri.getFragment() != null) {
            sb.append("#");
            sb.append(uri.getFragment());
        }
        return sb.toString();
    }
}
