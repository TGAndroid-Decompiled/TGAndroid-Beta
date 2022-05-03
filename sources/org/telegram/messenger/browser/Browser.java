package org.telegram.messenger.browser;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
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
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.ui.ActionBar.AlertDialog;

public class Browser {
    private static WeakReference<Activity> currentCustomTabsActivity;
    private static CustomTabsClient customTabsClient;
    private static String customTabsPackageToBind;
    private static CustomTabsServiceConnection customTabsServiceConnection;
    private static CustomTabsSession customTabsSession;

    private static void setCurrentSession(CustomTabsSession customTabsSession2) {
        new WeakReference(customTabsSession2);
    }

    private static CustomTabsSession getSession() {
        CustomTabsClient customTabsClient2 = customTabsClient;
        if (customTabsClient2 == null) {
            customTabsSession = null;
        } else if (customTabsSession == null) {
            CustomTabsSession newSession = customTabsClient2.newSession(new NavigationCallback());
            customTabsSession = newSession;
            setCurrentSession(newSession);
        }
        return customTabsSession;
    }

    public static void bindCustomTabsService(Activity activity) {
        WeakReference<Activity> weakReference = currentCustomTabsActivity;
        Activity activity2 = weakReference == null ? null : weakReference.get();
        if (!(activity2 == null || activity2 == activity)) {
            unbindCustomTabsService(activity2);
        }
        if (customTabsClient == null) {
            currentCustomTabsActivity = new WeakReference<>(activity);
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
                        if (SharedConfig.customTabs && Browser.customTabsClient != null) {
                            try {
                                Browser.customTabsClient.warmup(0L);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                    }

                    @Override
                    public void onServiceDisconnected() {
                        CustomTabsClient unused = Browser.customTabsClient = null;
                    }
                });
                customTabsServiceConnection = serviceConnection;
                if (!CustomTabsClient.bindCustomTabsService(activity, customTabsPackageToBind, serviceConnection)) {
                    customTabsServiceConnection = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void unbindCustomTabsService(Activity activity) {
        if (customTabsServiceConnection != null) {
            WeakReference<Activity> weakReference = currentCustomTabsActivity;
            if ((weakReference == null ? null : weakReference.get()) == activity) {
                currentCustomTabsActivity.clear();
            }
            try {
                activity.unbindService(customTabsServiceConnection);
            } catch (Exception unused) {
            }
            customTabsClient = null;
            customTabsSession = null;
        }
    }

    public static class NavigationCallback extends CustomTabsCallback {
        @Override
        public void onNavigationEvent(int i, Bundle bundle) {
        }

        private NavigationCallback() {
        }
    }

    public static void openUrl(Context context, String str) {
        if (str != null) {
            openUrl(context, Uri.parse(str), true);
        }
    }

    public static void openUrl(Context context, Uri uri) {
        openUrl(context, uri, true);
    }

    public static void openUrl(Context context, String str, boolean z) {
        if (context != null && str != null) {
            openUrl(context, Uri.parse(str), z);
        }
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
        sb.append("://)?(te\\.?legra\\.ph|graph\\.org).*");
        return str.matches(sb.toString());
    }

    public static boolean urlMustNotHaveConfirmation(String str) {
        return isTelegraphUrl(str, false, true) || str.matches("^(https://)?t\\.me/iv\\??.*") || str.matches("^(https://)?telegram\\.org/(blog|tour)/?.*");
    }

    public static void openUrl(final android.content.Context r16, final android.net.Uri r17, final boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.browser.Browser.openUrl(android.content.Context, android.net.Uri, boolean, boolean):void");
    }

    public static void lambda$openUrl$1(final AlertDialog[] alertDialogArr, final int i, final Uri uri, final Context context, final boolean z, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Browser.lambda$openUrl$0(alertDialogArr, tLObject, i, uri, context, z);
            }
        });
    }

    public static void lambda$openUrl$0(org.telegram.ui.ActionBar.AlertDialog[] r3, org.telegram.tgnet.TLObject r4, int r5, android.net.Uri r6, android.content.Context r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.browser.Browser.lambda$openUrl$0(org.telegram.ui.ActionBar.AlertDialog[], org.telegram.tgnet.TLObject, int, android.net.Uri, android.content.Context, boolean):void");
    }

    public static void lambda$openUrl$3(AlertDialog[] alertDialogArr, final int i) {
        if (alertDialogArr[0] != null) {
            try {
                alertDialogArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        Browser.lambda$openUrl$2(i, dialogInterface);
                    }
                });
                alertDialogArr[0].show();
            } catch (Exception unused) {
            }
        }
    }

    public static void lambda$openUrl$2(int i, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i, true);
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

    public static boolean isInternalUri(Uri uri, boolean[] zArr) {
        return isInternalUri(uri, false, zArr);
    }

    public static boolean isInternalUri(Uri uri, boolean z, boolean[] zArr) {
        String host = uri.getHost();
        String lowerCase = host != null ? host.toLowerCase() : "";
        if ("ton".equals(uri.getScheme())) {
            try {
                List<ResolveInfo> queryIntentActivities = ApplicationLoader.applicationContext.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
                if (queryIntentActivities != null) {
                    if (queryIntentActivities.size() > 1) {
                        return false;
                    }
                }
            } catch (Exception unused) {
            }
            return true;
        } else if ("tg".equals(uri.getScheme())) {
            return true;
        } else {
            if ("telegram.dog".equals(lowerCase)) {
                String path = uri.getPath();
                if (path != null && path.length() > 1) {
                    if (z) {
                        return true;
                    }
                    String lowerCase2 = path.substring(1).toLowerCase();
                    if (!lowerCase2.startsWith("blog") && !lowerCase2.equals("iv") && !lowerCase2.startsWith("faq") && !lowerCase2.equals("apps") && !lowerCase2.startsWith("s/")) {
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
                    String lowerCase3 = path2.substring(1).toLowerCase();
                    if (!lowerCase3.equals("iv") && !lowerCase3.startsWith("s/")) {
                        return true;
                    }
                    if (zArr != null) {
                        zArr[0] = true;
                    }
                }
            } else if (z && (lowerCase.endsWith("telegram.org") || lowerCase.endsWith("telegra.ph") || lowerCase.endsWith("telesco.pe"))) {
                return true;
            }
            return false;
        }
    }
}
