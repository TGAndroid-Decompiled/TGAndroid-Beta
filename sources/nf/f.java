package nf;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n7.a1;
import og.u0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a3;
import org.telegram.ui.j4;
import org.telegram.ui.jz;
import org.telegram.ui.n3;
import org.telegram.ui.web.y0;
public abstract class f {
    public static u0 f14042a;
    public static a1 f14043b;
    public static a9.d f14044c;
    public static String d;
    public static WeakReference e;
    public static Pattern f14045f;

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

    public static u0 c() {
        a1 a1Var = f14043b;
        u0 u0Var = null;
        if (a1Var == null) {
            f14042a = null;
        } else if (f14042a == null) {
            ?? obj = new Object();
            uf.e eVar = (uf.e) a1Var.f13938b;
            uf.b bVar = new uf.b(obj);
            try {
                if (((uf.c) eVar).G0(bVar)) {
                    u0Var = new u0(18, bVar, (ComponentName) a1Var.f13939c);
                }
            } catch (RemoteException unused) {
            }
            f14042a = u0Var;
            new WeakReference(u0Var);
        }
        return f14042a;
    }

    public static boolean d(android.content.Context r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: nf.f.d(android.content.Context, java.lang.String):boolean");
    }

    public static boolean e() {
        jz sheetFragment;
        p2 U = LaunchActivity.U();
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
        if (f14045f == null) {
            f14045f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            matches = f14045f.matcher(hostAuthority).matches();
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite")) {
                matches = f14045f.matcher(parse.getScheme()).matches();
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
        q3 P;
        p3 p3Var;
        String openURL;
        n3[] n3VarArr;
        n3 n3Var;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (P = launchActivity.P()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<p3> tabs = P.getTabs();
                for (int i10 = 0; i10 < tabs.size(); i10++) {
                    p3Var = tabs.get(i10);
                    j4 j4Var = p3Var.J;
                    if (j4Var != null && !j4Var.f33904d0.isEmpty()) {
                        Object i11 = hc.b.i(1, p3Var.J.f33904d0);
                        if (i11 instanceof a3) {
                            y0 y0Var = ((a3) i11).f18541b;
                            if (y0Var == null && (n3VarArr = p3Var.J.f33920u0) != null && (n3Var = n3VarArr[0]) != null) {
                                y0Var = n3Var.getWebView();
                            }
                            if (y0Var != null) {
                                if (y0Var.canGoBack()) {
                                    openURL = y0Var.getUrl();
                                } else {
                                    openURL = y0Var.getOpenURL();
                                }
                                if (TextUtils.equals(q3.p(openURL), q3.p(str))) {
                                    P.e(p3Var);
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
            p3Var = null;
            if (p3Var != null) {
                return;
            }
        }
        p2 U = LaunchActivity.U();
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
        if (f14044c == null) {
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
            activity.unbindService(f14044c);
        } catch (Exception unused) {
        }
        f14043b = null;
        f14042a = null;
    }

    public static boolean y(String str) {
        if (!h(str, false, true) && !str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") && !str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") && !str.matches("^(https://)?fragment\\.com(/.*|$)")) {
            return false;
        }
        return true;
    }
}
