package defpackage;

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
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;
public abstract class m01 {
    public static lh2 a;
    public static qx6 b;
    public static t8a c;
    public static String d;
    public static WeakReference e;
    public static Pattern f;

    public static boolean A(String str) {
        if (!j(str, false, true) && !str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") && !str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") && !str.matches("^(https://)?fragment\\.com(/.*|$)")) {
            return false;
        }
        return true;
    }

    public static String B(String str) {
        String[] split;
        String substring;
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        boolean z2 = false;
        for (String str2 : str.split("&", -1)) {
            int indexOf = str2.indexOf(61);
            if (indexOf < 0) {
                substring = str2;
            } else {
                substring = str2.substring(0, indexOf);
            }
            int i = 0;
            while (i < 4) {
                String decode = Uri.decode(substring);
                if (TextUtils.equals(decode, substring)) {
                    break;
                }
                i++;
                substring = decode;
            }
            while (substring.startsWith("?")) {
                substring = substring.substring(1);
            }
            String lowerCase = substring.toLowerCase();
            if (!lowerCase.startsWith("tgwebauth") && !lowerCase.equals("autologin_token")) {
                if (!z) {
                    sb.append('&');
                }
                sb.append(str2);
                z = false;
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            return null;
        }
        return sb.toString();
    }

    public static android.net.Uri C(android.net.Uri r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m01.C(android.net.Uri):android.net.Uri");
    }

    public static java.lang.String a(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m01.a(java.lang.String):java.lang.String");
    }

    public static String b(String str) {
        if (str.indexOf(37) >= 0) {
            String decode = Uri.decode(str);
            if (decode.indexOf(65533) < 0) {
                StringBuilder sb = new StringBuilder(decode.length());
                int i = 0;
                while (i < decode.length()) {
                    int codePointAt = decode.codePointAt(i);
                    int charCount = Character.charCount(codePointAt);
                    if (!Character.isISOControl(codePointAt) && Character.getType(codePointAt) != 16) {
                        sb.append((CharSequence) decode, i, i + charCount);
                    } else {
                        sb.append(Uri.encode(decode.substring(i, i + charCount)));
                    }
                    i += charCount;
                }
                return sb.toString();
            }
        }
        return str;
    }

    public static String c(String str) {
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

    public static String d(String str, boolean z) {
        String host;
        if (str == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse.getHost() == null) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            if (parse.getScheme() != null) {
                sb.append(parse.getScheme());
                sb.append("://");
            }
            if (parse.getEncodedUserInfo() != null) {
                sb.append(parse.getEncodedUserInfo());
                sb.append("@");
            }
            if (z) {
                host = a(parse.getHost());
            } else {
                host = parse.getHost();
            }
            sb.append(host);
            if (parse.getPort() != -1) {
                sb.append(":");
                sb.append(parse.getPort());
            }
            if (parse.getEncodedPath() != null) {
                sb.append(b(parse.getEncodedPath()));
            }
            if (parse.getEncodedQuery() != null) {
                sb.append("?");
                sb.append(b(parse.getEncodedQuery()));
            }
            if (parse.getEncodedFragment() != null) {
                sb.append("#");
                sb.append(b(parse.getEncodedFragment()));
            }
            return sb.toString();
        } catch (Exception e2) {
            cc4.g(e2, false);
            return str;
        }
    }

    public static lh2 e() {
        qx6 qx6Var = b;
        lh2 lh2Var = null;
        if (qx6Var == null) {
            a = null;
        } else if (a == null) {
            z3f z3fVar = new z3f((byte) 14);
            bj5 bj5Var = (bj5) qx6Var.b;
            p53 p53Var = new p53(z3fVar);
            try {
                if (((zi5) bj5Var).a(p53Var)) {
                    lh2Var = new lh2(p53Var, (ComponentName) qx6Var.c, (byte) 20);
                }
            } catch (RemoteException unused) {
            }
            a = lh2Var;
            new WeakReference(lh2Var);
        }
        return a;
    }

    public static boolean f(android.content.Context r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m01.f(android.content.Context, java.lang.String):boolean");
    }

    public static boolean g(Uri uri, boolean z, boolean[] zArr) {
        String J0;
        String str;
        String str2;
        String str3;
        Typeface typeface = hl.a;
        if (uri == null) {
            J0 = null;
        } else {
            J0 = hl.J0(uri.toString(), false);
        }
        String str4 = "";
        if (J0 == null) {
            str = "";
        } else {
            str = J0.toLowerCase();
        }
        if (uc7.s1(yac.t0).l4.J3.f.contains(str)) {
            if (zArr != null) {
                zArr[0] = true;
                return false;
            }
        } else {
            Matcher matcher = LaunchActivity.D1.matcher(str);
            if (matcher.find()) {
                StringBuilder sb = new StringBuilder("https://t.me/");
                sb.append(matcher.group(1));
                if (TextUtils.isEmpty(uri.getPath())) {
                    str2 = "";
                } else {
                    str2 = "/" + uri.getPath();
                }
                sb.append(str2);
                if (TextUtils.isEmpty(uri.getQuery())) {
                    str3 = "";
                } else {
                    str3 = "?" + uri.getQuery();
                }
                sb.append(str3);
                uri = Uri.parse(sb.toString());
                String host = uri.getHost();
                if (host != null) {
                    str4 = host.toLowerCase();
                }
                str = str4;
            }
            if ("ton".equals(uri.getScheme())) {
                try {
                    List<ResolveInfo> queryIntentActivities = a.b.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
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
                        if (!z) {
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
                    if ((!"telegram.org".equals(str) || uri.getPath() == null || !uri.getPath().startsWith("/blog/")) && (!z || (!str.endsWith("telegram.org") && !str.endsWith("telegra.ph") && !str.endsWith("telesco.pe")))) {
                    }
                } else {
                    String path2 = uri.getPath();
                    if (path2 != null && path2.length() > 1) {
                        if (!z) {
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

    public static boolean h(String str) {
        return g(Uri.parse(str), false, null);
    }

    public static boolean i(String str) {
        try {
            return TextUtils.equals(hl.J0(str, false), uc7.s1(yac.t0).N2);
        } catch (Exception e2) {
            cc4.g(e2, true);
            return false;
        }
    }

    public static boolean j(String str, boolean z, boolean z2) {
        String str2;
        if (z) {
            if (!str.equals("telegra.ph") && !str.equals("te.legra.ph") && !str.equals("graph.org")) {
                return false;
            }
            return true;
        }
        StringBuilder sb = new StringBuilder("^(https");
        if (z2) {
            str2 = "";
        } else {
            str2 = "?";
        }
        sb.append(str2);
        sb.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb.toString());
    }

    public static boolean k(String str) {
        String J0 = hl.J0(str, true);
        if (J0 != null && (J0.endsWith(".ton") || J0.endsWith(".adnl"))) {
            return true;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite")) {
            return true;
        }
        return false;
    }

    public static boolean l(String str) {
        boolean matches;
        if (f == null) {
            f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String J0 = hl.J0(str, true);
        if (J0 != null && (J0.endsWith(".ton") || J0.endsWith(".adnl"))) {
            matches = f.matcher(J0).matches();
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite")) {
                matches = f.matcher(parse.getScheme()).matches();
            } else {
                return false;
            }
        }
        return !matches;
    }

    public static boolean m(Context context, String str, boolean z, boolean z2, l01 l01Var) {
        LaunchActivity launchActivity;
        if (str != null) {
            if (hl.W(context) instanceof LaunchActivity) {
                launchActivity = (LaunchActivity) hl.W(context);
            } else {
                launchActivity = LaunchActivity.H1;
                if (launchActivity == null) {
                    return false;
                }
            }
            if (launchActivity != null) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setComponent(new ComponentName(context.getPackageName(), LaunchActivity.class.getName()));
                intent.putExtra("create_new_tab", true);
                intent.putExtra("com.android.browser.application_id", context.getPackageName());
                intent.putExtra("force_not_internal_apps", z);
                intent.putExtra("force_request", z2);
                launchActivity.f0(intent, l01Var);
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean n(android.content.Context r6, java.lang.String r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m01.n(android.content.Context, java.lang.String, boolean):boolean");
    }

    public static boolean o(Context context, String str, boolean z, String str2) {
        Intent intent;
        if (str != null) {
            ea4.g.G(str);
            try {
                Uri parse = Uri.parse(str);
                if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent")) {
                    if (z) {
                        intent = Intent.parseUri(parse.toString(), 1);
                        intent.addCategory("android.intent.category.BROWSABLE");
                        intent.setComponent(null);
                        Intent selector = intent.getSelector();
                        if (selector != null) {
                            selector.addCategory("android.intent.category.BROWSABLE");
                            selector.setComponent(null);
                        }
                    }
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
            } catch (Exception e2) {
                cc4.g(e2, true);
                return false;
            }
        }
        return false;
    }

    public static void p(String str) {
        yx0 O;
        xx0 xx0Var;
        String openURL;
        m[] mVarArr;
        m mVar;
        ea4.g.G(str);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (O = launchActivity.O()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<xx0> tabs = O.getTabs();
                for (int i = 0; i < tabs.size(); i++) {
                    xx0Var = tabs.get(i);
                    o oVar = xx0Var.J;
                    if (oVar != null && !oVar.e0.isEmpty()) {
                        Object g = c00.g(1, xx0Var.J.e0);
                        if (g instanceof aw) {
                            nv0 nv0Var = ((aw) g).b;
                            if (nv0Var == null && (mVarArr = xx0Var.J.v0) != null && (mVar = mVarArr[0]) != null) {
                                nv0Var = mVar.getWebView();
                            }
                            if (nv0Var != null) {
                                if (nv0Var.canGoBack()) {
                                    openURL = nv0Var.getUrl();
                                } else {
                                    openURL = nv0Var.getOpenURL();
                                }
                                if (TextUtils.equals(yx0.p(openURL), yx0.p(str))) {
                                    O.e(xx0Var);
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
            xx0Var = null;
            if (xx0Var != null) {
                return;
            }
        }
        e S = LaunchActivity.S();
        if (S != null) {
            if (S.getArticleViewer() != null) {
                S.getArticleViewer().L(null, null, null, str);
                return;
            } else if (S.getParentLayout() instanceof ActionBarLayout) {
                S = ((ActionBarLayout) S.getParentLayout()).getSheetFragment();
            }
        }
        if (S == null) {
            return;
        }
        S.createArticleViewer(false).L(null, null, null, str);
    }

    public static void q(Activity activity, String str, boolean z) {
        if (activity != null && str != null) {
            r(activity, Uri.parse(str), z, true);
        }
    }

    public static void r(Context context, Uri uri, boolean z, boolean z2) {
        t(context, uri, z, z2, false, null, null, false, true, false, false);
    }

    public static void s(Context context, Uri uri, boolean z, boolean z2, l01 l01Var) {
        t(context, uri, z, z2, false, l01Var, null, false, true, false, false);
    }

    public static void t(android.content.Context r18, android.net.Uri r19, boolean r20, boolean r21, boolean r22, defpackage.l01 r23, java.lang.String r24, boolean r25, boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m01.t(android.content.Context, android.net.Uri, boolean, boolean, boolean, l01, java.lang.String, boolean, boolean, boolean, boolean):void");
    }

    public static void u(Context context, String str) {
        if (str == null) {
            return;
        }
        r(context, Uri.parse(str), true, true);
    }

    public static void v(LaunchActivity launchActivity, Uri uri) {
        r(launchActivity, uri, true, true);
    }

    public static void w(Context context, String str, boolean z) {
        if (str == null) {
            return;
        }
        t(context, Uri.parse(str), false, true, false, null, null, false, false, false, z);
    }

    public static String x(Uri uri, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = uri.getScheme();
        }
        if (str != null) {
            sb.append(str);
            sb.append("://");
        }
        if (str2 == null) {
            if (uri.getEncodedUserInfo() != null) {
                sb.append(uri.getEncodedUserInfo());
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
        } else if (uri.getEncodedPath() != null) {
            sb.append(uri.getEncodedPath());
        }
        if (uri.getEncodedQuery() != null) {
            sb.append("?");
            sb.append(uri.getEncodedQuery());
        }
        if (uri.getEncodedFragment() != null) {
            sb.append("#");
            sb.append(uri.getEncodedFragment());
        }
        return sb.toString();
    }

    public static String y(Uri uri, String str) {
        return x(uri, null, null, str, null);
    }

    public static void z(Activity activity) {
        Activity activity2;
        if (c == null) {
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
            activity.unbindService(c);
        } catch (Exception unused) {
        }
        b = null;
        a = null;
    }
}
