package org.telegram.messenger.browser;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.net.IDN;
import java.net.URLEncoder;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CustomTabsCopyReceiver;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.ShareBroadcastReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.support.customtabs.CustomTabsCallback;
import org.telegram.messenger.support.customtabs.CustomTabsClient;
import org.telegram.messenger.support.customtabs.CustomTabsIntent;
import org.telegram.messenger.support.customtabs.CustomTabsServiceConnection;
import org.telegram.messenger.support.customtabs.CustomTabsSession;
import org.telegram.messenger.support.customtabsclient.shared.CustomTabsHelper;
import org.telegram.messenger.support.customtabsclient.shared.ServiceConnection;
import org.telegram.messenger.support.customtabsclient.shared.ServiceConnectionCallback;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.EmptyBaseFragment;
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
                    if (!MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() || Browser.customTabsClient == null) {
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

    public static void openUrl(final Context context, final Uri uri, boolean z, boolean z2, boolean z3, Progress progress, String str, boolean z4, boolean z5, boolean z6) {
        final boolean z7;
        boolean z8;
        final Progress progress2;
        boolean z9;
        Uri uriNormalizeScheme;
        String stringExtra;
        LaunchActivity launchActivity;
        String hostAuthority;
        char c;
        if (context == null || uri == null) {
            return;
        }
        final int i = UserConfig.selectedAccount;
        boolean[] zArr = {false};
        boolean zIsInternalUri = isInternalUri(uri, zArr);
        String browserPackageName = getBrowserPackageName(str);
        if (browserPackageName != null) {
            z8 = false;
            z7 = false;
        } else {
            z7 = z;
            z8 = z2;
        }
        if (z8) {
            try {
                String hostAuthority2 = AndroidUtilities.getHostAuthority(uri);
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser() == null || !(isTelegraphUrl(hostAuthority2, true) || ("telegram.org".equalsIgnoreCase(hostAuthority2) && (uri.toString().toLowerCase().contains("telegram.org/faq") || uri.toString().toLowerCase().contains("telegram.org/privacy") || uri.toString().toLowerCase().contains("telegram.org/blog"))))) {
                    progress2 = progress;
                } else {
                    final AlertDialog[] alertDialogArr = {new AlertDialog(context, 3)};
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = uri.toString();
                    progress2 = progress;
                    try {
                        final int iSendRequest = ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(getwebpagepreview, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        Browser.m1100$r8$lambda$r0CCMiFnrGCwmVQpGqtZgRrTxo(progress, alertDialogArr, tLObject, i, uri, context, z);
                                    }
                                });
                            }
                        });
                        if (progress2 != null) {
                            progress2.init();
                            return;
                        }
                        Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                Browser.$r8$lambda$7LZ2gk4KysH4NPPJAO6oZpWQocA(alertDialogArr, iSendRequest);
                            }
                        };
                        z9 = false;
                        try {
                            AndroidUtilities.runOnUIThread(runnable, 1000L);
                            return;
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        z9 = false;
                    }
                }
            } catch (Exception unused3) {
            }
            z9 = false;
        } else {
            progress2 = progress;
            z9 = false;
        }
        try {
            String lowerCase = uri.getScheme() != null ? uri.getScheme().toLowerCase() : "";
            if (lowerCase == null || !lowerCase.contains(".")) {
                if ("http".equals(lowerCase) || "https".equals(lowerCase)) {
                    try {
                        uriNormalizeScheme = uri.normalizeScheme();
                    } catch (Exception e) {
                        FileLog.e(e);
                        uriNormalizeScheme = uri;
                        hostAuthority = AndroidUtilities.getHostAuthority(uriNormalizeScheme.toString().toLowerCase());
                        if (AccountInstance.getInstance(i).getMessagesController().autologinDomains.contains(hostAuthority)) {
                            try {
                                c = 0;
                                try {
                                    uriNormalizeScheme = uriNormalizeScheme.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().autologinToken, "UTF-8")).build();
                                } catch (Exception e2) {
                                    e = e2;
                                    z9 = false;
                                    FileLog.e(e);
                                }
                            } catch (Exception e3) {
                                e = e3;
                            }
                        } else {
                            c = 0;
                        }
                        if (z7) {
                            if (!isInstantViewOpen()) {
                                if (MessagesController.getInstance(i).authDomains.contains(hostAuthority)) {
                                    Intent intent = new Intent("android.intent.action.VIEW", uriNormalizeScheme);
                                    intent.addFlags(268435456);
                                    ApplicationLoader.applicationContext.startActivity(intent);
                                    return;
                                }
                                Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShareBroadcastReceiver.class);
                                intent2.setAction("android.intent.action.SEND");
                                PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(getSession());
                                builder.addMenuItem(LocaleController.getString(R.string.CopyLink), broadcast);
                                builder.setToolbarColor(Theme.getColor(Theme.key_actionBarBrowser));
                                builder.setShowTitle(true);
                                z9 = false;
                                builder.setActionButton(BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout), LocaleController.getString(R.string.ShareFile), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent2, 33554432), true);
                                CustomTabsIntent customTabsIntentBuild = builder.build();
                                customTabsIntentBuild.setUseNewTask();
                                customTabsIntentBuild.launchUrl(context, uriNormalizeScheme);
                                return;
                                FileLog.e(e);
                                if (z5) {
                                    try {
                                        if (BubbleActivity.instance != null) {
                                            if (isTonsite(uriNormalizeScheme.toString())) {
                                                z9 = true;
                                            }
                                        } else if (isTonsite(uriNormalizeScheme.toString())) {
                                            z9 = true;
                                        }
                                    } catch (Exception e4) {
                                        FileLog.e(e4);
                                        return;
                                    }
                                } else if (isTonsite(uriNormalizeScheme.toString())) {
                                    z9 = true;
                                }
                                if (uriNormalizeScheme.getScheme() != null) {
                                    uriNormalizeScheme.getScheme().equalsIgnoreCase("intent");
                                }
                                if (!zIsInternalUri) {
                                }
                                if (z9) {
                                    if (openInExternalApp(context, uriNormalizeScheme.toString(), z4)) {
                                        return;
                                    }
                                    if (uriNormalizeScheme.getScheme() != null) {
                                        stringExtra = Intent.parseUri(uriNormalizeScheme.toString(), 1).getStringExtra("browser_fallback_url");
                                        if (!TextUtils.isEmpty(stringExtra)) {
                                            uriNormalizeScheme = Uri.parse(stringExtra);
                                        }
                                    }
                                    openInTelegramBrowser(context, uriNormalizeScheme.toString(), progress2);
                                    return;
                                }
                                openInExternalBrowser(context, uriNormalizeScheme.toString(), z4, browserPackageName);
                            }
                        }
                        z9 = false;
                        if (z5) {
                            if (BubbleActivity.instance != null) {
                                if (isTonsite(uriNormalizeScheme.toString())) {
                                    z9 = true;
                                }
                            } else if (isTonsite(uriNormalizeScheme.toString())) {
                                z9 = true;
                            }
                        } else if (isTonsite(uriNormalizeScheme.toString())) {
                            z9 = true;
                        }
                        if (uriNormalizeScheme.getScheme() != null) {
                            uriNormalizeScheme.getScheme().equalsIgnoreCase("intent");
                        }
                        if (!zIsInternalUri) {
                        }
                        if (z9) {
                            if (openInExternalApp(context, uriNormalizeScheme.toString(), z4)) {
                                if (uriNormalizeScheme.getScheme() != null) {
                                    stringExtra = Intent.parseUri(uriNormalizeScheme.toString(), 1).getStringExtra("browser_fallback_url");
                                    if (!TextUtils.isEmpty(stringExtra)) {
                                        uriNormalizeScheme = Uri.parse(stringExtra);
                                    }
                                }
                                openInTelegramBrowser(context, uriNormalizeScheme.toString(), progress2);
                                return;
                            }
                            return;
                        }
                        openInExternalBrowser(context, uriNormalizeScheme.toString(), z4, browserPackageName);
                    }
                } else {
                    uriNormalizeScheme = uri;
                }
                try {
                    hostAuthority = AndroidUtilities.getHostAuthority(uriNormalizeScheme.toString().toLowerCase());
                    if (AccountInstance.getInstance(i).getMessagesController().autologinDomains.contains(hostAuthority)) {
                        c = 0;
                        uriNormalizeScheme = uriNormalizeScheme.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().autologinToken, "UTF-8")).build();
                    } else {
                        c = 0;
                    }
                    if (z7 && (uriNormalizeScheme == null || !MessagesController.getInstance(i).isWebBrowserOpenInApp(uriNormalizeScheme.toString()))) {
                        if (!isInstantViewOpen() && MessagesController.getInstance(i).isWebBrowserUseCustomTabs() && !zIsInternalUri && !lowerCase.equals("tel") && !isTonsite(uriNormalizeScheme.toString()) && (zArr[c] || !openInExternalApp(context, uriNormalizeScheme.toString(), false) || !hasAppToOpen(context, uriNormalizeScheme.toString()))) {
                            if (MessagesController.getInstance(i).authDomains.contains(hostAuthority)) {
                                Intent intent3 = new Intent("android.intent.action.VIEW", uriNormalizeScheme);
                                intent3.addFlags(268435456);
                                ApplicationLoader.applicationContext.startActivity(intent3);
                                return;
                            }
                            Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShareBroadcastReceiver.class);
                            intent4.setAction("android.intent.action.SEND");
                            PendingIntent broadcast2 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                            CustomTabsIntent.Builder builder2 = new CustomTabsIntent.Builder(getSession());
                            builder2.addMenuItem(LocaleController.getString(R.string.CopyLink), broadcast2);
                            builder2.setToolbarColor(Theme.getColor(Theme.key_actionBarBrowser));
                            builder2.setShowTitle(true);
                            z9 = false;
                            builder2.setActionButton(BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout), LocaleController.getString(R.string.ShareFile), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent4, 33554432), true);
                            CustomTabsIntent customTabsIntentBuild2 = builder2.build();
                            customTabsIntentBuild2.setUseNewTask();
                            customTabsIntentBuild2.launchUrl(context, uriNormalizeScheme);
                            return;
                        }
                    }
                    z9 = false;
                } catch (Exception e5) {
                    e = e5;
                }
                if (z5) {
                    if (BubbleActivity.instance != null && (((uriNormalizeScheme != null && MessagesController.getInstance(i).isWebBrowserOpenInApp(uriNormalizeScheme.toString())) || isInstantViewOpen()) && TextUtils.isEmpty(browserPackageName) && (uriNormalizeScheme.getScheme() == null || r10.equals(uriNormalizeScheme.getScheme()) || "http".equals(uriNormalizeScheme.getScheme()) || "tonsite".equals(uriNormalizeScheme.getScheme())))) {
                        z9 = true;
                    } else if (isTonsite(uriNormalizeScheme.toString())) {
                        z9 = true;
                    }
                } else if (isTonsite(uriNormalizeScheme.toString())) {
                    z9 = true;
                }
                if (uriNormalizeScheme.getScheme() != null) {
                    uriNormalizeScheme.getScheme().equalsIgnoreCase("intent");
                }
                if (!zIsInternalUri && (launchActivity = LaunchActivity.instance) != null) {
                    openAsInternalIntent(launchActivity, uriNormalizeScheme.toString(), z3, z6, progress2);
                    return;
                }
                if (z9) {
                    if (openInExternalApp(context, uriNormalizeScheme.toString(), z4)) {
                        if (uriNormalizeScheme.getScheme() != null && uriNormalizeScheme.getScheme().equalsIgnoreCase("intent")) {
                            stringExtra = Intent.parseUri(uriNormalizeScheme.toString(), 1).getStringExtra("browser_fallback_url");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                uriNormalizeScheme = Uri.parse(stringExtra);
                            }
                        }
                        openInTelegramBrowser(context, uriNormalizeScheme.toString(), progress2);
                        return;
                    }
                    return;
                }
                openInExternalBrowser(context, uriNormalizeScheme.toString(), z4, browserPackageName);
            }
            return;
        } catch (Exception e6) {
            e = e6;
            uriNormalizeScheme = uri;
        }
        FileLog.e(e);
        if (z5) {
            if (BubbleActivity.instance != null) {
                if (isTonsite(uriNormalizeScheme.toString())) {
                    z9 = true;
                }
            } else if (isTonsite(uriNormalizeScheme.toString())) {
                z9 = true;
            }
        } else if (isTonsite(uriNormalizeScheme.toString())) {
            z9 = true;
        }
        if (uriNormalizeScheme.getScheme() != null) {
            uriNormalizeScheme.getScheme().equalsIgnoreCase("intent");
        }
        if (!zIsInternalUri) {
        }
        if (z9) {
            if (openInExternalApp(context, uriNormalizeScheme.toString(), z4)) {
                if (uriNormalizeScheme.getScheme() != null) {
                    stringExtra = Intent.parseUri(uriNormalizeScheme.toString(), 1).getStringExtra("browser_fallback_url");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        uriNormalizeScheme = Uri.parse(stringExtra);
                    }
                }
                openInTelegramBrowser(context, uriNormalizeScheme.toString(), progress2);
                return;
            }
            return;
        }
        openInExternalBrowser(context, uriNormalizeScheme.toString(), z4, browserPackageName);
    }

    public static void m1100$r8$lambda$r0CCMiFnrGCwmVQpGqtZgRrTxo(Progress progress, AlertDialog[] alertDialogArr, TLObject tLObject, int i, Uri uri, Context context, boolean z) {
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
                    NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.openArticle, tL_messageMediaWebPage.webpage, uri.toString());
                    return;
                }
            }
        }
        openUrl(context, uri, z, false);
    }

    public static void $r8$lambda$7LZ2gk4KysH4NPPJAO6oZpWQocA(AlertDialog[] alertDialogArr, final int i) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        try {
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i, true);
                }
            });
            alertDialogArr[0].show();
        } catch (Exception unused) {
        }
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

    public static boolean isInstantViewOpen() {
        EmptyBaseFragment sheetFragment;
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null || !(safeLastFragment.getParentLayout() instanceof ActionBarLayout) || (sheetFragment = ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment()) == null || sheetFragment.getArticleViewer() == null) {
            return (safeLastFragment == null || safeLastFragment.getArticleViewer() == null) ? false : true;
        }
        return true;
    }

    public static boolean openInTelegramBrowser(Context context, String str, Progress progress) {
        BottomSheetTabs bottomSheetTabs;
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null && (bottomSheetTabs = launchActivity.getBottomSheetTabs()) != null && bottomSheetTabs.tryReopenTab(str) != null) {
            return true;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null && safeLastFragment.getArticleViewer() != null) {
            safeLastFragment.getArticleViewer().open(str, progress);
            return true;
        }
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

    public static boolean openInExternalBrowser(Context context, String str, boolean z, String str2) {
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

    public static boolean openInExternalApp(Context context, String str, boolean z) {
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
        if (str == null) {
            return false;
        }
        List<ResolveInfo> listQueryIntentActivities = null;
        try {
            List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 0);
            if (listQueryIntentActivities2 == null || listQueryIntentActivities2.isEmpty()) {
                strArr = null;
            } else {
                strArr = new String[listQueryIntentActivities2.size()];
                for (int i = 0; i < listQueryIntentActivities2.size(); i++) {
                    try {
                        strArr[i] = listQueryIntentActivities2.get(i).activityInfo.packageName;
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("default browser name = " + strArr[i]);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
        try {
            listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
            if (strArr != null) {
                int i2 = 0;
                while (i2 < listQueryIntentActivities.size()) {
                    for (String str2 : strArr) {
                        if (str2.equals(listQueryIntentActivities.get(i2).activityInfo.packageName)) {
                            listQueryIntentActivities.remove(i2);
                            i2--;
                            break;
                        }
                    }
                    i2++;
                }
            } else {
                int i3 = 0;
                while (i3 < listQueryIntentActivities.size()) {
                    if (isBrowserPackageName(listQueryIntentActivities.get(i3).activityInfo.packageName.toLowerCase())) {
                        listQueryIntentActivities.remove(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                for (int i4 = 0; i4 < listQueryIntentActivities.size(); i4++) {
                    FileLog.d("device has " + listQueryIntentActivities.get(i4).activityInfo.packageName + " to open " + str);
                }
            }
        } catch (Exception unused3) {
        }
        return (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    public static boolean isInternalUrl(String str, boolean[] zArr) {
        return isInternalUri(Uri.parse(str), false, zArr);
    }

    public static boolean isInternalUrl(String str, boolean z, boolean[] zArr) {
        return isInternalUri(Uri.parse(str), z, zArr);
    }

    public static boolean isPassportUrl(String str) {
        if (str == null) {
            return false;
        }
        try {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("tg:passport") || lowerCase.startsWith("tg://passport") || lowerCase.startsWith("tg:secureid")) {
                return true;
            }
            if (lowerCase.contains("resolve") && lowerCase.contains("domain=telegrampassport")) {
                return true;
            }
        } catch (Throwable unused) {
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
                return listQueryIntentActivities == null || listQueryIntentActivities.size() < 1;
            } catch (Exception unused) {
            }
        } else {
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
    }

    public static String getBrowserPackageName(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "brave-browser":
            case "brave":
                return "com.brave.browser";
            case "google-chrome":
            case "chrome":
                return "com.android.chrome";
            case "microsoft-edge":
            case "edge":
                return "com.microsoft.emmx";
            case "tor-browser":
            case "tor":
                return "org.torproject.torbrowser";
            case "duckduckgo-browser":
            case "duckduckgo":
                return "com.duckduckgo.mobile.android";
            case "firefox":
            case "mozilla-firefox":
                return "org.mozilla.firefox";
            case "samsung-browser":
            case "samsung":
                return "com.sec.android.app.sbrowser";
            case "kiwi-browser":
            case "kiwi":
                return "com.kiwibrowser.browser";
            case "opera-mini":
                return "com.opera.mini.native";
            case "uc":
            case "uc-browser":
                return "com.UCMobile.intl";
            case "opera":
                return "com.opera.browser";
            case "vivaldi":
            case "vivaldi-browser":
                return "com.vivaldi.browser";
            default:
                return null;
        }
    }

    public static boolean isBrowserPackageName(String str) {
        if (str != null) {
            return str.contains("browser") || str.contains("chrome") || str.contains("firefox") || "com.microsoft.emmx".equals(str) || "com.opera.mini.native".equals(str) || "com.duckduckgo.mobile.android".equals(str) || "com.UCMobile.intl".equals(str);
        }
        return false;
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
