package org.telegram.messenger.browser;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.zzcc;
import com.android.billingclient.api.zzcs;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import com.stripe.android.Stripe;
import java.lang.ref.WeakReference;
import java.net.IDN;
import java.net.URLEncoder;
import java.util.ArrayList;
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
import org.telegram.messenger.R;
import org.telegram.messenger.ShareBroadcastReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.support.customtabs.CustomTabsClient$2;
import org.telegram.messenger.support.customtabs.ICustomTabsService;
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
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda19;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda25;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.EmptyBaseFragment;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer;

public abstract class Browser {
    public static WeakReference currentCustomTabsActivity;
    public static Stripe customTabsClient;
    public static String customTabsPackageToBind;
    public static zzcc customTabsServiceConnection;
    public static Stripe customTabsSession;
    public static Pattern domainPattern;

    public final class AnonymousClass1 {
    }

    public class Progress {
        private Runnable onCancelListener;
        private Runnable onEndListener;
        private Runnable onInitListener;

        public Progress(Runnable runnable, Runnable runnable2) {
            this.onInitListener = runnable;
            this.onEndListener = runnable2;
        }

        public void cancel() {
            cancel(false);
        }

        public void end() {
            end(false);
        }

        public void init() {
            Runnable runnable = this.onInitListener;
            if (runnable != null) {
                runnable.run();
                this.onInitListener = null;
            }
        }

        public Progress onCancel(Runnable runnable) {
            this.onCancelListener = runnable;
            return this;
        }

        public Progress onEnd(Runnable runnable) {
            this.onEndListener = runnable;
            return this;
        }

        public void cancel(boolean z) {
            Runnable runnable = this.onCancelListener;
            if (runnable != null) {
                runnable.run();
            }
            end(z);
        }

        public void end(boolean z) {
            Runnable runnable = this.onEndListener;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static String IDN_toUnicode(String str) {
        boolean zStartsWith;
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (str == null) {
            zStartsWith = true;
        } else {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length <= 0) {
                zStartsWith = true;
            } else {
                zStartsWith = strArrSplit[strArrSplit.length - 1].startsWith("xn--");
            }
        }
        if (!zStartsWith) {
            return str;
        }
        try {
            return IDN.toUnicode(str, 1);
        } catch (Exception e2) {
            FileLog.e(e2);
            return str;
        }
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

    public static Stripe getSession() {
        Stripe stripe = customTabsClient;
        Stripe stripe2 = null;
        if (stripe == null) {
            customTabsSession = null;
        } else if (customTabsSession == null) {
            CustomTabsClient$2 customTabsClient$2 = new CustomTabsClient$2(new zzcs(22));
            try {
                if (((ICustomTabsService.Stub.Proxy) ((ICustomTabsService) stripe.tokenCreator)).newSession(customTabsClient$2)) {
                    stripe2 = new Stripe(14, customTabsClient$2, (ComponentName) stripe.defaultPublishableKey);
                }
            } catch (RemoteException unused) {
            }
            customTabsSession = stripe2;
            new WeakReference(stripe2);
        }
        return customTabsSession;
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
                    String lowerCase = listQueryIntentActivities.get(i3).activityInfo.packageName.toLowerCase();
                    if (lowerCase != null && (lowerCase.contains("browser") || lowerCase.contains("chrome") || lowerCase.contains("firefox") || "com.microsoft.emmx".equals(lowerCase) || "com.opera.mini.native".equals(lowerCase) || "com.duckduckgo.mobile.android".equals(lowerCase) || "com.UCMobile.intl".equals(lowerCase))) {
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

    public static boolean isInternalUri(Uri uri, boolean z, boolean[] zArr) {
        String str;
        String str2;
        String hostAuthority = AndroidUtilities.getHostAuthority(uri);
        String lowerCase = "";
        String lowerCase2 = hostAuthority != null ? hostAuthority.toLowerCase() : "";
        if (!MessagesController.getInstance(UserConfig.selectedAccount).authDomains.contains(lowerCase2)) {
            Matcher matcher = LaunchActivity.PREFIX_T_ME_PATTERN.matcher(lowerCase2);
            if (matcher.find()) {
                StringBuilder sb = new StringBuilder("https://t.me/");
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
            if (!"ton".equals(uri.getScheme())) {
                if (!"tg".equals(uri.getScheme())) {
                    if ("telegram.dog".equals(lowerCase)) {
                        String path = uri.getPath();
                        if (path != null && path.length() > 1) {
                            if (!z) {
                                String lowerCase3 = path.substring(1).toLowerCase();
                                if (lowerCase3.startsWith("blog") || lowerCase3.equals("iv") || lowerCase3.startsWith("faq") || lowerCase3.equals("apps") || lowerCase3.startsWith("s/")) {
                                    if (zArr != null) {
                                        zArr[0] = true;
                                        return false;
                                    }
                                }
                            }
                        }
                    } else if ("telegram.me".equals(lowerCase) || "t.me".equals(lowerCase)) {
                        String path2 = uri.getPath();
                        if (path2 != null && path2.length() > 1) {
                            if (!z) {
                                String lowerCase4 = path2.substring(1).toLowerCase();
                                if (lowerCase4.equals("iv") || lowerCase4.startsWith("s/")) {
                                    if (zArr != null) {
                                        zArr[0] = true;
                                    }
                                }
                            }
                        }
                    } else if ((!"telegram.org".equals(lowerCase) || uri.getPath() == null || !uri.getPath().startsWith("/blog/")) && (!z || (!lowerCase.endsWith("telegram.org") && !lowerCase.endsWith("telegra.ph") && !lowerCase.endsWith("telesco.pe")))) {
                    }
                }
                return true;
            }
            try {
                List<ResolveInfo> listQueryIntentActivities = ApplicationLoader.applicationContext.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
                if (listQueryIntentActivities == null || listQueryIntentActivities.size() < 1) {
                    return true;
                }
            } catch (Exception unused) {
            }
        } else if (zArr != null) {
            zArr[0] = true;
            return false;
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

    public static boolean isTelegraphUrl(String str, boolean z, boolean z2) {
        if (z) {
            return str.equals("telegra.ph") || str.equals("te.legra.ph") || str.equals("graph.org");
        }
        StringBuilder sb = new StringBuilder("^(https");
        sb.append(z2 ? "" : "?");
        sb.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb.toString());
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
        if (hostAuthority == null || !(hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            Uri uri = Uri.parse(str);
            if (uri.getScheme() == null || !uri.getScheme().equalsIgnoreCase("tonsite")) {
                return false;
            }
            zMatches = domainPattern.matcher(uri.getScheme()).matches();
        } else {
            zMatches = domainPattern.matcher(hostAuthority).matches();
        }
        return !zMatches;
    }

    public static void openAsInternalIntent(Context context, String str, boolean z, boolean z2, Progress progress) {
        LaunchActivity launchActivity;
        if (str == null) {
            return;
        }
        if (AndroidUtilities.findActivity(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) AndroidUtilities.findActivity(context);
        } else {
            launchActivity = LaunchActivity.instance;
            if (launchActivity == null) {
                return;
            }
        }
        if (launchActivity == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setComponent(new ComponentName(context.getPackageName(), LaunchActivity.class.getName()));
        intent.putExtra("create_new_tab", true);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("force_not_internal_apps", z);
        intent.putExtra("force_request", z2);
        launchActivity.onNewIntent(intent, progress);
    }

    public static boolean openInExternalApp(Context context, String str, boolean z) {
        if (str != null) {
            try {
                if (!isTonsite(str) && !isInternalUri(Uri.parse(str), false, null)) {
                    Uri uri = Uri.parse(str);
                    String strReplace = replace(uri, uri.getScheme() == null ? "https" : uri.getScheme(), null, uri.getHost() != null ? uri.getHost().toLowerCase() : uri.getHost(), TextUtils.isEmpty(uri.getPath()) ? "/" : uri.getPath());
                    Uri uri2 = Uri.parse(strReplace);
                    boolean z2 = strReplace.startsWith("intent://") || (uri2.getScheme() != null && uri2.getScheme().equalsIgnoreCase("intent"));
                    if (!z2 || z) {
                        Intent uri3 = z2 ? Intent.parseUri(uri2.toString(), 1) : new Intent("android.intent.action.VIEW", uri2);
                        if (!z2 && Build.VERSION.SDK_INT >= 30) {
                            uri3.addCategory("android.intent.category.BROWSABLE");
                            uri3.addCategory("android.intent.category.DEFAULT");
                            uri3.addFlags(268435456);
                            uri3.addFlags(1024);
                        } else if (!z2 && !hasAppToOpen(context, strReplace)) {
                        }
                        context.startActivity(uri3);
                        return true;
                    }
                }
            } catch (ActivityNotFoundException e) {
                FileLog.e((Throwable) e, false);
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        return false;
    }

    public static void openInExternalBrowser(Context context, String str, boolean z, String str2) {
        if (str == null) {
            return;
        }
        try {
            Uri uri = Uri.parse(str);
            boolean z2 = uri.getScheme() != null && uri.getScheme().equalsIgnoreCase("intent");
            if (!z2 || z) {
                Intent uri2 = z2 ? Intent.parseUri(uri.toString(), 1) : new Intent("android.intent.action.VIEW", uri);
                if (!TextUtils.isEmpty(str2)) {
                    uri2.setPackage(str2);
                }
                uri2.putExtra("create_new_tab", true);
                uri2.putExtra("com.android.browser.application_id", context.getPackageName());
                context.startActivity(uri2);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void openInTelegramBrowser(String str, Progress progress) {
        BottomSheetTabs bottomSheetTabs;
        String strSubstring;
        ArticleViewer.PageLayout[] pageLayoutArr;
        ArticleViewer.PageLayout pageLayout;
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null && (bottomSheetTabs = launchActivity.getBottomSheetTabs()) != null) {
            BottomSheetTabs.WebTabData webTabData = null;
            if (!TextUtils.isEmpty(str)) {
                ArrayList<BottomSheetTabs.WebTabData> tabs = bottomSheetTabs.getTabs();
                for (int i = 0; i < tabs.size(); i++) {
                    BottomSheetTabs.WebTabData webTabData2 = tabs.get(i);
                    ArticleViewer articleViewer = webTabData2.articleViewer;
                    if (articleViewer != null && !articleViewer.pagesStack.isEmpty()) {
                        Object objM = zzin.m(1, webTabData2.articleViewer.pagesStack);
                        if (objM instanceof ArticleViewer.CachedWeb) {
                            BotWebViewContainer.MyWebView webView = ((ArticleViewer.CachedWeb) objM).webView;
                            if (webView == null && (pageLayoutArr = webTabData2.articleViewer.pages) != null && (pageLayout = pageLayoutArr[0]) != null) {
                                webView = pageLayout.getWebView();
                            }
                            if (webView != null) {
                                String url = webView.canGoBack() ? webView.getUrl() : webView.getOpenURL();
                                if (url == null) {
                                    url = null;
                                } else {
                                    int iIndexOf = url.indexOf(35);
                                    if (iIndexOf >= 0) {
                                        url = url.substring(0, iIndexOf + 1);
                                    }
                                }
                                if (str == null) {
                                    strSubstring = null;
                                } else {
                                    int iIndexOf2 = str.indexOf(35);
                                    strSubstring = iIndexOf2 >= 0 ? str.substring(0, iIndexOf2 + 1) : str;
                                }
                                if (TextUtils.equals(url, strSubstring)) {
                                    bottomSheetTabs.openTab(webTabData2);
                                    webTabData = webTabData2;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (webTabData != null) {
                return;
            }
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null && safeLastFragment.getArticleViewer() != null) {
            safeLastFragment.getArticleViewer().open(str, progress);
            return;
        }
        if (safeLastFragment != null && (safeLastFragment.getParentLayout() instanceof ActionBarLayout)) {
            safeLastFragment = ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment();
        }
        if (safeLastFragment == null) {
            return;
        }
        safeLastFragment.createArticleViewer(false).open(str, progress);
    }

    public static void openUrl(Context context, String str) {
        if (str == null) {
            return;
        }
        openUrl(context, Uri.parse(str), true, true);
    }

    public static void openUrlInSystemBrowser(Context context, String str) {
        if (str == null) {
            return;
        }
        openUrl(context, Uri.parse(str), false, true, false, null, null, false, false, false);
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
        if (str3 != null) {
            sb.append(str3);
        } else if (uri.getHost() != null) {
            sb.append(uri.getHost());
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

    public static String replaceHostname(Uri uri, String str) {
        return replace(uri, null, null, str, null);
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

    public static void openUrl(Activity activity, String str, boolean z) {
        if (activity == null || str == null) {
            return;
        }
        openUrl(activity, Uri.parse(str), z, true);
    }

    public static void openUrl(LaunchActivity launchActivity, Uri uri) {
        openUrl(launchActivity, uri, true, true);
    }

    public static void openUrl(Context context, Uri uri, boolean z, boolean z2) {
        openUrl(context, uri, z, z2, false, null, null, false, true, false);
    }

    public static void openUrl(Context context, Uri uri, boolean z, boolean z2, Progress progress) {
        openUrl(context, uri, z, z2, false, progress, null, false, true, false);
    }

    public static void openUrl(final Context context, final Uri uri, boolean z, boolean z2, boolean z3, Progress progress, String str, boolean z4, boolean z5, boolean z6) {
        String str2;
        boolean z7;
        boolean z8;
        char c;
        final Progress progress2;
        final boolean z9;
        Uri uriNormalizeScheme;
        BaseFragment safeLastFragment;
        EmptyBaseFragment sheetFragment;
        boolean z10;
        String stringExtra;
        LaunchActivity launchActivity;
        String lowerCase;
        String hostAuthority;
        BaseFragment safeLastFragment2;
        Stripe session;
        Intent intent;
        CustomTabsClient$2 customTabsClient$2;
        EmptyBaseFragment sheetFragment2;
        String str3;
        int i = 2;
        if (context == null || uri == null) {
            return;
        }
        final int i2 = UserConfig.selectedAccount;
        boolean[] zArr = {false};
        boolean zIsInternalUri = isInternalUri(uri, false, zArr);
        if (str != null) {
            switch (str) {
                case "brave-browser":
                case "brave":
                    str3 = "com.brave.browser";
                    str2 = str3;
                    break;
                case "google-chrome":
                case "chrome":
                    str3 = "com.android.chrome";
                    str2 = str3;
                    break;
                case "microsoft-edge":
                case "edge":
                    str3 = "com.microsoft.emmx";
                    str2 = str3;
                    break;
                case "tor-browser":
                case "tor":
                    str3 = "org.torproject.torbrowser";
                    str2 = str3;
                    break;
                case "duckduckgo-browser":
                case "duckduckgo":
                    str3 = "com.duckduckgo.mobile.android";
                    str2 = str3;
                    break;
                case "firefox":
                case "mozilla-firefox":
                    str3 = "org.mozilla.firefox";
                    str2 = str3;
                    break;
                case "samsung-browser":
                case "samsung":
                    str3 = "com.sec.android.app.sbrowser";
                    str2 = str3;
                    break;
                case "kiwi-browser":
                case "kiwi":
                    str3 = "com.kiwibrowser.browser";
                    str2 = str3;
                    break;
                case "opera-mini":
                    str3 = "com.opera.mini.native";
                    str2 = str3;
                    break;
                case "uc":
                case "uc-browser":
                    str3 = "com.UCMobile.intl";
                    str2 = str3;
                    break;
                case "opera":
                    str3 = "com.opera.browser";
                    str2 = str3;
                    break;
                case "vivaldi":
                case "vivaldi-browser":
                    str3 = "com.vivaldi.browser";
                    str2 = str3;
                    break;
                default:
                    str2 = null;
                    break;
            }
        } else {
            str2 = null;
        }
        if (str2 != null) {
            z8 = false;
            z7 = false;
        } else {
            z7 = z;
            z8 = z2;
        }
        if (z8) {
            try {
                String hostAuthority2 = AndroidUtilities.getHostAuthority(uri);
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser() != null) {
                    if (isTelegraphUrl(hostAuthority2, true, false)) {
                        c = 0;
                    } else {
                        c = 0;
                        try {
                            if (!"telegram.org".equalsIgnoreCase(hostAuthority2) || (!uri.toString().toLowerCase().contains("telegram.org/faq") && !uri.toString().toLowerCase().contains("telegram.org/privacy") && !uri.toString().toLowerCase().contains("telegram.org/blog"))) {
                                progress2 = progress;
                                z9 = z7;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    final AlertDialog[] alertDialogArr = new AlertDialog[1];
                    alertDialogArr[c] = new AlertDialog(context, 3, null);
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = uri.toString();
                    progress2 = progress;
                    z9 = z7;
                    try {
                        int iSendRequest = ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(getwebpagepreview, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda25(progress2, alertDialogArr, tLObject, i2, uri, context, z9));
                            }
                        });
                        if (progress2 != null) {
                            progress2.init();
                            return;
                        } else {
                            AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda19(alertDialogArr, iSendRequest, i), 1000L);
                            return;
                        }
                    } catch (Exception unused2) {
                    }
                } else {
                    progress2 = progress;
                    z9 = z7;
                    c = 0;
                }
            } catch (Exception unused3) {
            }
        } else {
            progress2 = progress;
            z9 = z7;
            c = 0;
        }
        try {
            if (uri.getScheme() == null) {
                lowerCase = "";
            } else {
                try {
                    lowerCase = uri.getScheme().toLowerCase();
                } catch (Exception e) {
                    e = e;
                    uriNormalizeScheme = uri;
                    FileLog.e(e);
                    if (z5) {
                        try {
                            if (BubbleActivity.instance != null) {
                                if (isTonsite(uriNormalizeScheme.toString())) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else if (isTonsite(uriNormalizeScheme.toString())) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } catch (Exception e2) {
                            FileLog.e(e2);
                            return;
                        }
                    } else if (isTonsite(uriNormalizeScheme.toString())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (uriNormalizeScheme.getScheme() != null) {
                        uriNormalizeScheme.getScheme().equalsIgnoreCase("intent");
                    }
                    if (!zIsInternalUri) {
                    }
                    if (z10) {
                        if (openInExternalApp(context, uriNormalizeScheme.toString(), z4)) {
                            return;
                        }
                        if (uriNormalizeScheme.getScheme() != null) {
                            stringExtra = Intent.parseUri(uriNormalizeScheme.toString(), 1).getStringExtra("browser_fallback_url");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                uriNormalizeScheme = Uri.parse(stringExtra);
                            }
                        }
                        openInTelegramBrowser(uriNormalizeScheme.toString(), progress2);
                        return;
                    }
                    openInExternalBrowser(context, uriNormalizeScheme.toString(), z4, str2);
                }
            }
            String str4 = lowerCase;
            if (str4 == null || !str4.contains(".")) {
                if ("http".equals(str4) || "https".equals(str4)) {
                    try {
                        uriNormalizeScheme = uri.normalizeScheme();
                    } catch (Exception e3) {
                        FileLog.e(e3);
                        uriNormalizeScheme = uri;
                        hostAuthority = AndroidUtilities.getHostAuthority(uriNormalizeScheme.toString().toLowerCase());
                        if (AccountInstance.getInstance(i2).getMessagesController().autologinDomains.contains(hostAuthority)) {
                            uriNormalizeScheme = uriNormalizeScheme.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().autologinToken, "UTF-8")).build();
                        }
                        if (z9) {
                            safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                            if (safeLastFragment2 != null) {
                                if (MessagesController.getInstance(i2).isWebBrowserUseCustomTabs()) {
                                    if (MessagesController.getInstance(i2).authDomains.contains(hostAuthority)) {
                                        Intent intent2 = new Intent("android.intent.action.VIEW", uriNormalizeScheme);
                                        intent2.addFlags(268435456);
                                        ApplicationLoader.applicationContext.startActivity(intent2);
                                        return;
                                    }
                                    Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShareBroadcastReceiver.class);
                                    intent3.setAction("android.intent.action.SEND");
                                    PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                                    session = getSession();
                                    intent = new Intent("android.intent.action.VIEW");
                                    if (session != null) {
                                        intent.setPackage(((ComponentName) session.defaultPublishableKey).getPackageName());
                                    }
                                    Bundle bundle = new Bundle();
                                    if (session == null) {
                                        customTabsClient$2 = null;
                                    } else {
                                        customTabsClient$2 = (CustomTabsClient$2) session.tokenCreator;
                                    }
                                    bundle.putBinder("android.support.customtabs.extra.SESSION", customTabsClient$2);
                                    intent.putExtras(bundle);
                                    String string = LocaleController.getString(R.string.CopyLink);
                                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", string);
                                    bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
                                    arrayList.add(bundle2);
                                    intent.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", Theme.getColor(null, Theme.key_actionBarBrowser, false));
                                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                    Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout);
                                    String string2 = LocaleController.getString(R.string.ShareFile);
                                    try {
                                        PendingIntent broadcast2 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent3, 33554432);
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putInt("android.support.customtabs.customaction.ID", 0);
                                        bundle3.putParcelable("android.support.customtabs.customaction.ICON", bitmapDecodeResource);
                                        bundle3.putString("android.support.customtabs.customaction.DESCRIPTION", string2);
                                        bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast2);
                                        intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle3);
                                        intent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
                                        intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
                                        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                                        intent.addFlags(268435456);
                                        intent.setData(uriNormalizeScheme);
                                        context.startActivity(intent, null);
                                        return;
                                    } catch (Exception e4) {
                                        e = e4;
                                    }
                                }
                            } else if (MessagesController.getInstance(i2).isWebBrowserUseCustomTabs()) {
                                if (MessagesController.getInstance(i2).authDomains.contains(hostAuthority)) {
                                    Intent intent4 = new Intent("android.intent.action.VIEW", uriNormalizeScheme);
                                    intent4.addFlags(268435456);
                                    ApplicationLoader.applicationContext.startActivity(intent4);
                                    return;
                                }
                                Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShareBroadcastReceiver.class);
                                intent5.setAction("android.intent.action.SEND");
                                PendingIntent broadcast3 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                                session = getSession();
                                intent = new Intent("android.intent.action.VIEW");
                                if (session != null) {
                                    intent.setPackage(((ComponentName) session.defaultPublishableKey).getPackageName());
                                }
                                Bundle bundle4 = new Bundle();
                                if (session == null) {
                                    customTabsClient$2 = null;
                                } else {
                                    customTabsClient$2 = (CustomTabsClient$2) session.tokenCreator;
                                }
                                bundle4.putBinder("android.support.customtabs.extra.SESSION", customTabsClient$2);
                                intent.putExtras(bundle4);
                                String string3 = LocaleController.getString(R.string.CopyLink);
                                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                                Bundle bundle5 = new Bundle();
                                bundle5.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", string3);
                                bundle5.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast3);
                                arrayList2.add(bundle5);
                                intent.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", Theme.getColor(null, Theme.key_actionBarBrowser, false));
                                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout);
                                String string4 = LocaleController.getString(R.string.ShareFile);
                                PendingIntent broadcast4 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent5, 33554432);
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("android.support.customtabs.customaction.ID", 0);
                                bundle6.putParcelable("android.support.customtabs.customaction.ICON", bitmapDecodeResource2);
                                bundle6.putString("android.support.customtabs.customaction.DESCRIPTION", string4);
                                bundle6.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast4);
                                intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle6);
                                intent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
                                intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList2);
                                intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                                intent.addFlags(268435456);
                                intent.setData(uriNormalizeScheme);
                                context.startActivity(intent, null);
                                return;
                            }
                        }
                        i2 = i2;
                        if (z5) {
                            if (BubbleActivity.instance != null) {
                                if (isTonsite(uriNormalizeScheme.toString())) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else if (isTonsite(uriNormalizeScheme.toString())) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else if (isTonsite(uriNormalizeScheme.toString())) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (uriNormalizeScheme.getScheme() != null) {
                            uriNormalizeScheme.getScheme().equalsIgnoreCase("intent");
                        }
                        if (!zIsInternalUri) {
                        }
                        if (z10) {
                            if (openInExternalApp(context, uriNormalizeScheme.toString(), z4)) {
                                if (uriNormalizeScheme.getScheme() != null) {
                                    stringExtra = Intent.parseUri(uriNormalizeScheme.toString(), 1).getStringExtra("browser_fallback_url");
                                    if (!TextUtils.isEmpty(stringExtra)) {
                                        uriNormalizeScheme = Uri.parse(stringExtra);
                                    }
                                }
                                openInTelegramBrowser(uriNormalizeScheme.toString(), progress2);
                                return;
                            }
                            return;
                        }
                        openInExternalBrowser(context, uriNormalizeScheme.toString(), z4, str2);
                    }
                } else {
                    uriNormalizeScheme = uri;
                }
                try {
                    hostAuthority = AndroidUtilities.getHostAuthority(uriNormalizeScheme.toString().toLowerCase());
                    if (AccountInstance.getInstance(i2).getMessagesController().autologinDomains.contains(hostAuthority)) {
                        uriNormalizeScheme = uriNormalizeScheme.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().autologinToken, "UTF-8")).build();
                    }
                    if (z9 && (uriNormalizeScheme == null || !MessagesController.getInstance(i2).isWebBrowserOpenInApp(uriNormalizeScheme.toString()))) {
                        safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                        if ((safeLastFragment2 != null || !(safeLastFragment2.getParentLayout() instanceof ActionBarLayout) || (sheetFragment2 = ((ActionBarLayout) safeLastFragment2.getParentLayout()).getSheetFragment()) == null || sheetFragment2.getArticleViewer() == null) && (safeLastFragment2 == null || safeLastFragment2.getArticleViewer() == null)) {
                            if (MessagesController.getInstance(i2).isWebBrowserUseCustomTabs() && !zIsInternalUri && !str4.equals("tel") && !isTonsite(uriNormalizeScheme.toString()) && (zArr[c] || !openInExternalApp(context, uriNormalizeScheme.toString(), false) || !hasAppToOpen(context, uriNormalizeScheme.toString()))) {
                                if (MessagesController.getInstance(i2).authDomains.contains(hostAuthority)) {
                                    Intent intent6 = new Intent("android.intent.action.VIEW", uriNormalizeScheme);
                                    intent6.addFlags(268435456);
                                    ApplicationLoader.applicationContext.startActivity(intent6);
                                    return;
                                }
                                Intent intent7 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShareBroadcastReceiver.class);
                                intent7.setAction("android.intent.action.SEND");
                                PendingIntent broadcast5 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                                session = getSession();
                                intent = new Intent("android.intent.action.VIEW");
                                if (session != null) {
                                    intent.setPackage(((ComponentName) session.defaultPublishableKey).getPackageName());
                                }
                                Bundle bundle7 = new Bundle();
                                if (session == null) {
                                    customTabsClient$2 = null;
                                } else {
                                    customTabsClient$2 = (CustomTabsClient$2) session.tokenCreator;
                                }
                                bundle7.putBinder("android.support.customtabs.extra.SESSION", customTabsClient$2);
                                intent.putExtras(bundle7);
                                String string5 = LocaleController.getString(R.string.CopyLink);
                                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                                Bundle bundle8 = new Bundle();
                                bundle8.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", string5);
                                bundle8.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast5);
                                arrayList3.add(bundle8);
                                intent.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", Theme.getColor(null, Theme.key_actionBarBrowser, false));
                                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                Bitmap bitmapDecodeResource3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout);
                                String string6 = LocaleController.getString(R.string.ShareFile);
                                PendingIntent broadcast6 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent7, 33554432);
                                Bundle bundle9 = new Bundle();
                                bundle9.putInt("android.support.customtabs.customaction.ID", 0);
                                bundle9.putParcelable("android.support.customtabs.customaction.ICON", bitmapDecodeResource3);
                                bundle9.putString("android.support.customtabs.customaction.DESCRIPTION", string6);
                                bundle9.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast6);
                                intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle9);
                                intent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
                                intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList3);
                                intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                                intent.addFlags(268435456);
                                intent.setData(uriNormalizeScheme);
                                context.startActivity(intent, null);
                                return;
                            }
                        }
                    }
                    i2 = i2;
                } catch (Exception e5) {
                    e = e5;
                }
                if (z5) {
                    if (BubbleActivity.instance != null && ((uriNormalizeScheme != null && MessagesController.getInstance(i2).isWebBrowserOpenInApp(uriNormalizeScheme.toString())) || (((safeLastFragment = LaunchActivity.getSafeLastFragment()) != null && (safeLastFragment.getParentLayout() instanceof ActionBarLayout) && (sheetFragment = ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment()) != null && sheetFragment.getArticleViewer() != null) || (safeLastFragment != null && safeLastFragment.getArticleViewer() != null)))) {
                        if (TextUtils.isEmpty(str2) && (uriNormalizeScheme.getScheme() == null || "https".equals(uriNormalizeScheme.getScheme()) || "http".equals(uriNormalizeScheme.getScheme()) || "tonsite".equals(uriNormalizeScheme.getScheme()))) {
                            z10 = true;
                        } else if (isTonsite(uriNormalizeScheme.toString())) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if (isTonsite(uriNormalizeScheme.toString())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (isTonsite(uriNormalizeScheme.toString())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (uriNormalizeScheme.getScheme() != null) {
                    uriNormalizeScheme.getScheme().equalsIgnoreCase("intent");
                }
                if (!zIsInternalUri && (launchActivity = LaunchActivity.instance) != null) {
                    openAsInternalIntent(launchActivity, uriNormalizeScheme.toString(), z3, z6, progress2);
                    return;
                }
                if (z10) {
                    if (openInExternalApp(context, uriNormalizeScheme.toString(), z4)) {
                        if (uriNormalizeScheme.getScheme() != null && uriNormalizeScheme.getScheme().equalsIgnoreCase("intent")) {
                            stringExtra = Intent.parseUri(uriNormalizeScheme.toString(), 1).getStringExtra("browser_fallback_url");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                uriNormalizeScheme = Uri.parse(stringExtra);
                            }
                        }
                        openInTelegramBrowser(uriNormalizeScheme.toString(), progress2);
                        return;
                    }
                    return;
                }
                openInExternalBrowser(context, uriNormalizeScheme.toString(), z4, str2);
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
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (isTonsite(uriNormalizeScheme.toString())) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (isTonsite(uriNormalizeScheme.toString())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (uriNormalizeScheme.getScheme() != null) {
            uriNormalizeScheme.getScheme().equalsIgnoreCase("intent");
        }
        if (!zIsInternalUri) {
        }
        if (z10) {
            if (openInExternalApp(context, uriNormalizeScheme.toString(), z4)) {
                if (uriNormalizeScheme.getScheme() != null) {
                    stringExtra = Intent.parseUri(uriNormalizeScheme.toString(), 1).getStringExtra("browser_fallback_url");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        uriNormalizeScheme = Uri.parse(stringExtra);
                    }
                }
                openInTelegramBrowser(uriNormalizeScheme.toString(), progress2);
                return;
            }
            return;
        }
        openInExternalBrowser(context, uriNormalizeScheme.toString(), z4, str2);
    }
}
