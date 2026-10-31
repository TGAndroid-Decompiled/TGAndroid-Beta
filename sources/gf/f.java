package gf;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h4;
import org.telegram.ui.l3;
import org.telegram.ui.web.v0;
import org.telegram.ui.x2;
public abstract class f {
    public static m5.e f7487a;
    public static m4.c f7488b;
    public static a9.d f7489c;
    public static String d;
    public static WeakReference e;
    public static Pattern f7490f;

    public static java.lang.String a(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: gf.f.a(java.lang.String):java.lang.String");
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
            Matcher matcher = LaunchActivity.D1.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static m5.e c() {
        m4.c cVar = f7488b;
        m5.e eVar = null;
        if (cVar == null) {
            f7487a = null;
        } else if (f7487a == null) {
            jb.b bVar = new jb.b(8);
            pf.e eVar2 = (pf.e) cVar.f12705b;
            pf.b bVar2 = new pf.b(bVar);
            try {
                if (((pf.c) eVar2).H0(bVar2)) {
                    eVar = new m5.e(18, bVar2, (ComponentName) cVar.f12706c);
                }
            } catch (RemoteException unused) {
            }
            f7487a = eVar;
            new WeakReference(eVar);
        }
        return f7487a;
    }

    public static boolean d(android.content.Context r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: gf.f.d(android.content.Context, java.lang.String):boolean");
    }

    public static boolean e(Uri uri, boolean z10, boolean[] zArr) {
        String K0;
        String str;
        String str2;
        String str3;
        Typeface typeface = i0.f15999a;
        if (uri == null) {
            K0 = null;
        } else {
            K0 = i0.K0(uri.toString(), false);
        }
        String str4 = "";
        if (K0 == null) {
            str = "";
        } else {
            str = K0.toLowerCase();
        }
        if (vp.r1(d20.f15147s0).f18792g4.contains(str)) {
            if (zArr != null) {
                zArr[0] = true;
                return false;
            }
        } else {
            Matcher matcher = LaunchActivity.D1.matcher(str);
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
                    List<ResolveInfo> queryIntentActivities = w0.f19025b.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
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

    public static boolean f(String str) {
        try {
            return TextUtils.equals(i0.K0(str, false), vp.r1(d20.f15147s0).U2);
        } catch (Exception e7) {
            f8.g(e7, true);
            return false;
        }
    }

    public static boolean g(String str, boolean z10, boolean z11) {
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

    public static boolean h(String str) {
        String K0 = i0.K0(str, true);
        if (K0 != null && (K0.endsWith(".ton") || K0.endsWith(".adnl"))) {
            return true;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite")) {
            return true;
        }
        return false;
    }

    public static boolean i(String str) {
        boolean matches;
        if (f7490f == null) {
            f7490f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String K0 = i0.K0(str, true);
        if (K0 != null && (K0.endsWith(".ton") || K0.endsWith(".adnl"))) {
            matches = f7490f.matcher(K0).matches();
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite")) {
                matches = f7490f.matcher(parse.getScheme()).matches();
            } else {
                return false;
            }
        }
        return !matches;
    }

    public static boolean j(Context context, String str, boolean z10, boolean z11, e eVar) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (i0.W(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) i0.W(context);
        } else {
            launchActivity = LaunchActivity.I1;
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
        launchActivity.f0(intent, eVar);
        return true;
    }

    public static boolean k(android.content.Context r6, java.lang.String r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: gf.f.k(android.content.Context, java.lang.String, boolean):boolean");
    }

    public static boolean l(Context context, String str, boolean z10, String str2) {
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
                f8.g(e7, true);
                return false;
            }
        }
        return false;
    }

    public static void m(String str) {
        i3 O;
        h3 h3Var;
        String openURL;
        l3[] l3VarArr;
        l3 l3Var;
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && (O = launchActivity.O()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<h3> tabs = O.getTabs();
                for (int i10 = 0; i10 < tabs.size(); i10++) {
                    h3Var = tabs.get(i10);
                    h4 h4Var = h3Var.J;
                    if (h4Var != null && !h4Var.f37730d0.isEmpty()) {
                        Object g10 = i0.a.g(1, h3Var.J.f37730d0);
                        if (g10 instanceof x2) {
                            v0 v0Var = ((x2) g10).f20355b;
                            if (v0Var == null && (l3VarArr = h3Var.J.f37746u0) != null && (l3Var = l3VarArr[0]) != null) {
                                v0Var = l3Var.getWebView();
                            }
                            if (v0Var != null) {
                                if (v0Var.canGoBack()) {
                                    openURL = v0Var.getUrl();
                                } else {
                                    openURL = v0Var.getOpenURL();
                                }
                                if (TextUtils.equals(i3.p(openURL), i3.p(str))) {
                                    O.e(h3Var);
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
            h3Var = null;
            if (h3Var != null) {
                return;
            }
        }
        k2 T = LaunchActivity.T();
        if (T != null && T.getArticleViewer() != null) {
            T.getArticleViewer().L(null, null, null, str);
            return;
        }
        if (T != null && (T.getParentLayout() instanceof ActionBarLayout)) {
            T = ((ActionBarLayout) T.getParentLayout()).getSheetFragment();
        }
        if (T == null) {
            return;
        }
        T.createArticleViewer(false).L(null, null, null, str);
    }

    public static void n(Activity activity, String str, boolean z10) {
        if (activity != null && str != null) {
            q(activity, Uri.parse(str), z10, true, false, null, null, false, true, false);
        }
    }

    public static void o(Context context, Uri uri) {
        q(context, uri, true, true, false, null, null, false, true, false);
    }

    public static void p(Context context, Uri uri, boolean z10, boolean z11, e eVar) {
        q(context, uri, z10, z11, false, eVar, null, false, true, false);
    }

    public static void q(android.content.Context r19, android.net.Uri r20, boolean r21, boolean r22, boolean r23, gf.e r24, java.lang.String r25, boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: gf.f.q(android.content.Context, android.net.Uri, boolean, boolean, boolean, gf.e, java.lang.String, boolean, boolean, boolean):void");
    }

    public static void r(Context context, String str) {
        if (str == null) {
            return;
        }
        q(context, Uri.parse(str), true, true, false, null, null, false, true, false);
    }

    public static void s(LaunchActivity launchActivity, Uri uri) {
        o(launchActivity, uri);
    }

    public static void t(Context context, String str) {
        if (str == null) {
            return;
        }
        q(context, Uri.parse(str), false, true, false, null, null, false, false, false);
    }

    public static String u(Uri uri, String str, String str2, String str3, String str4) {
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

    public static String v(Uri uri, String str) {
        return u(uri, null, null, str, null);
    }

    public static void w(Activity activity) {
        Activity activity2;
        if (f7489c == null) {
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
            activity.unbindService(f7489c);
        } catch (Exception unused) {
        }
        f7488b = null;
        f7487a = null;
    }

    public static boolean x(String str) {
        if (!g(str, false, true) && !str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") && !str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") && !str.matches("^(https://)?fragment\\.com(/.*|$)")) {
            return false;
        }
        return true;
    }
}
