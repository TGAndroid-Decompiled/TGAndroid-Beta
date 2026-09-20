package nf;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import hg.k0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.o3;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h4;
import org.telegram.ui.hz;
import org.telegram.ui.l3;
import org.telegram.ui.web.z0;
import org.telegram.ui.y2;
public abstract class f {
    public static f3 f15431a;
    public static m5.e f15432b;
    public static a9.d f15433c;
    public static String d;
    public static WeakReference e;
    public static Pattern f15434f;

    public static java.lang.String a(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: nf.f.a(java.lang.String):java.lang.String");
    }

    public static String b(String str) {
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
            Matcher matcher = LaunchActivity.B1.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static f3 c() {
        m5.e eVar = f15432b;
        f3 f3Var = null;
        if (eVar == null) {
            f15431a = null;
        } else if (f15431a == null) {
            ?? obj = new Object();
            vf.e eVar2 = (vf.e) eVar.f14953b;
            vf.b bVar = new vf.b(obj);
            try {
                if (((vf.c) eVar2).G0(bVar)) {
                    f3Var = new f3(bVar, (ComponentName) eVar.f14954c, false, 17);
                }
            } catch (RemoteException unused) {
            }
            f15431a = f3Var;
            new WeakReference(f3Var);
        }
        return f15431a;
    }

    public static boolean d(android.content.Context r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: nf.f.d(android.content.Context, java.lang.String):boolean");
    }

    public static boolean e() {
        hz sheetFragment;
        n2 U = LaunchActivity.U();
        if (U != null && (U.getParentLayout() instanceof ActionBarLayout) && (sheetFragment = ((ActionBarLayout) U.getParentLayout()).getSheetFragment()) != null && sheetFragment.getArticleViewer() != null) {
            return true;
        }
        if (U != null && U.getArticleViewer() != null) {
            return true;
        }
        return false;
    }

    public static boolean f(Uri uri, boolean z10, boolean[] zArr) {
        String str;
        String str2;
        String str3;
        String hostAuthority = AndroidUtilities.getHostAuthority(uri);
        String str4 = "";
        if (hostAuthority == null) {
            str = "";
        } else {
            str = hostAuthority.toLowerCase();
        }
        if (MessagesController.getInstance(UserConfig.selectedAccount).authDomains.contains(str)) {
            if (zArr != null) {
                zArr[0] = true;
                return false;
            }
        } else {
            Matcher matcher = LaunchActivity.B1.matcher(str);
            if (matcher.find()) {
                StringBuilder sb2 = new StringBuilder("https://t.me/");
                sb2.append(matcher.group(1));
                if (TextUtils.isEmpty(uri.getPath())) {
                    str2 = "";
                } else {
                    str2 = "/" + uri.getPath();
                }
                sb2.append(str2);
                if (TextUtils.isEmpty(uri.getQuery())) {
                    str3 = "";
                } else {
                    str3 = "?" + uri.getQuery();
                }
                sb2.append(str3);
                uri = Uri.parse(sb2.toString());
                String host = uri.getHost();
                if (host != null) {
                    str4 = host.toLowerCase();
                }
                str = str4;
            }
            if ("ton".equals(uri.getScheme())) {
                try {
                    List<ResolveInfo> queryIntentActivities = ApplicationLoader.applicationContext.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
                    if (queryIntentActivities != null) {
                        if (queryIntentActivities.size() >= 1) {
                        }
                    }
                } catch (Exception unused) {
                }
                return true;
            }
            if (!"tg".equals(uri.getScheme())) {
                if ("telegram.dog".equals(str)) {
                    String path = uri.getPath();
                    if (path != null && path.length() > 1) {
                        if (!z10) {
                            String lowerCase = path.substring(1).toLowerCase();
                            if (lowerCase.startsWith("blog") || lowerCase.equals("iv") || lowerCase.startsWith("faq") || lowerCase.equals("apps") || lowerCase.startsWith("s/")) {
                                if (zArr != null) {
                                    zArr[0] = true;
                                    return false;
                                }
                            }
                        }
                    }
                } else if (!"telegram.me".equals(str) && !"t.me".equals(str)) {
                    if ((!"telegram.org".equals(str) || uri.getPath() == null || !uri.getPath().startsWith("/blog/")) && (!z10 || (!str.endsWith("telegram.org") && !str.endsWith("telegra.ph") && !str.endsWith("telesco.pe")))) {
                    }
                } else {
                    String path2 = uri.getPath();
                    if (path2 != null && path2.length() > 1) {
                        if (!z10) {
                            String lowerCase2 = path2.substring(1).toLowerCase();
                            if (lowerCase2.equals("iv") || lowerCase2.startsWith("s/")) {
                                if (zArr != null) {
                                    zArr[0] = true;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        try {
            return TextUtils.equals(AndroidUtilities.getHostAuthority(str), MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix);
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
    }

    public static boolean h(String str, boolean z10, boolean z11) {
        String str2;
        if (z10) {
            if (!str.equals("telegra.ph") && !str.equals("te.legra.ph") && !str.equals("graph.org")) {
                return false;
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder("^(https");
        if (z11) {
            str2 = "";
        } else {
            str2 = "?";
        }
        sb2.append(str2);
        sb2.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb2.toString());
    }

    public static boolean i(String str) {
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            return true;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite")) {
            return true;
        }
        return false;
    }

    public static boolean j(String str) {
        boolean matches;
        if (f15434f == null) {
            f15434f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            matches = f15434f.matcher(hostAuthority).matches();
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite")) {
                matches = f15434f.matcher(parse.getScheme()).matches();
            } else {
                return false;
            }
        }
        return !matches;
    }

    public static boolean k(Context context, String str, boolean z10, boolean z11, e eVar) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (AndroidUtilities.findActivity(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) AndroidUtilities.findActivity(context);
        } else {
            launchActivity = LaunchActivity.G1;
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
        intent.putExtra("force_not_internal_apps", z10);
        intent.putExtra("force_request", z11);
        launchActivity.e0(intent, eVar);
        return true;
    }

    public static boolean l(android.content.Context r5, java.lang.String r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: nf.f.l(android.content.Context, java.lang.String, boolean):boolean");
    }

    public static boolean m(Context context, String str, boolean z10, String str2) {
        boolean z11;
        Intent intent;
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || z10) {
                    if (z11) {
                        intent = Intent.parseUri(parse.toString(), 1);
                    } else {
                        intent = new Intent("android.intent.action.VIEW", parse);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setPackage(str2);
                    }
                    intent.putExtra("create_new_tab", true);
                    intent.putExtra("com.android.browser.application_id", context.getPackageName());
                    context.startActivity(intent);
                    return true;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                return false;
            }
        }
        return false;
    }

    public static void n(String str) {
        o3 P;
        n3 n3Var;
        String openURL;
        l3[] l3VarArr;
        l3 l3Var;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (P = launchActivity.P()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<n3> tabs = P.getTabs();
                for (int i10 = 0; i10 < tabs.size(); i10++) {
                    n3Var = tabs.get(i10);
                    h4 h4Var = n3Var.J;
                    if (h4Var != null && !h4Var.f34098d0.isEmpty()) {
                        Object g10 = k0.g(1, n3Var.J.f34098d0);
                        if (g10 instanceof y2) {
                            z0 z0Var = ((y2) g10).f19647b;
                            if (z0Var == null && (l3VarArr = n3Var.J.f34114u0) != null && (l3Var = l3VarArr[0]) != null) {
                                z0Var = l3Var.getWebView();
                            }
                            if (z0Var != null) {
                                if (z0Var.canGoBack()) {
                                    openURL = z0Var.getUrl();
                                } else {
                                    openURL = z0Var.getOpenURL();
                                }
                                if (TextUtils.equals(o3.p(openURL), o3.p(str))) {
                                    P.e(n3Var);
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
            n3Var = null;
            if (n3Var != null) {
                return;
            }
        }
        n2 U = LaunchActivity.U();
        if (U != null && U.getArticleViewer() != null) {
            U.getArticleViewer().N(null, null, null, str);
            return;
        }
        if (U != null && (U.getParentLayout() instanceof ActionBarLayout)) {
            U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
        }
        if (U == null) {
            return;
        }
        U.createArticleViewer(false).N(null, null, null, str);
    }

    public static void o(Activity activity, String str, boolean z10) {
        if (activity != null && str != null) {
            p(activity, Uri.parse(str), z10, true);
        }
    }

    public static void p(Context context, Uri uri, boolean z10, boolean z11) {
        r(context, uri, z10, z11, false, null, null, false, true, false);
    }

    public static void q(Context context, Uri uri, boolean z10, boolean z11, e eVar) {
        r(context, uri, z10, z11, false, eVar, null, false, true, false);
    }

    public static void r(android.content.Context r19, android.net.Uri r20, boolean r21, boolean r22, boolean r23, nf.e r24, java.lang.String r25, boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: nf.f.r(android.content.Context, android.net.Uri, boolean, boolean, boolean, nf.e, java.lang.String, boolean, boolean, boolean):void");
    }

    public static void s(Context context, String str) {
        if (str == null) {
            return;
        }
        p(context, Uri.parse(str), true, true);
    }

    public static void t(LaunchActivity launchActivity, Uri uri) {
        p(launchActivity, uri, true, true);
    }

    public static void u(Context context, String str) {
        if (str == null) {
            return;
        }
        r(context, Uri.parse(str), false, true, false, null, null, false, false, false);
    }

    public static String v(Uri uri, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = uri.getScheme();
        }
        if (str != null) {
            sb2.append(str);
            sb2.append("://");
        }
        if (str2 == null) {
            if (uri.getUserInfo() != null) {
                sb2.append(uri.getUserInfo());
                sb2.append("@");
            }
        } else if (!TextUtils.isEmpty(str2)) {
            sb2.append(str2);
            sb2.append("@");
        }
        if (str3 == null) {
            if (uri.getHost() != null) {
                sb2.append(uri.getHost());
            }
        } else {
            sb2.append(str3);
        }
        if (uri.getPort() != -1) {
            sb2.append(":");
            sb2.append(uri.getPort());
        }
        if (str4 != null) {
            sb2.append(str4);
        } else if (uri.getPath() != null) {
            sb2.append(uri.getPath());
        }
        if (uri.getQuery() != null) {
            sb2.append("?");
            sb2.append(uri.getQuery());
        }
        if (uri.getFragment() != null) {
            sb2.append("#");
            sb2.append(uri.getFragment());
        }
        return sb2.toString();
    }

    public static String w(Uri uri, String str) {
        return v(uri, null, null, str, null);
    }

    public static void x(Activity activity) {
        Activity activity2;
        if (f15433c == null) {
            return;
        }
        WeakReference weakReference = e;
        if (weakReference == null) {
            activity2 = null;
        } else {
            activity2 = (Activity) weakReference.get();
        }
        if (activity2 == activity) {
            e.clear();
        }
        try {
            activity.unbindService(f15433c);
        } catch (Exception unused) {
        }
        f15432b = null;
        f15431a = null;
    }

    public static boolean y(String str) {
        if (!h(str, false, true) && !str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") && !str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") && !str.matches("^(https://)?fragment\\.com(/.*|$)")) {
            return false;
        }
        return true;
    }
}
