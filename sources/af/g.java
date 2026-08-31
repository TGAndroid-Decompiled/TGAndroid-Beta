package af;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.o3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b3;
import org.telegram.ui.dz;
import org.telegram.ui.l4;
import org.telegram.ui.p3;
import org.telegram.ui.web.x0;
public abstract class g {
    public static f7.b f182a;
    public static f7.b f183b;
    public static jf.a f184c;
    public static String d;
    public static WeakReference f185e;
    public static Pattern f186f;

    public static java.lang.String a(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: af.g.a(java.lang.String):java.lang.String");
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
            Matcher matcher = LaunchActivity.f34134y1.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static f7.b c() {
        f7.b bVar = f183b;
        f7.b bVar2 = null;
        if (bVar == null) {
            f182a = null;
        } else if (f182a == null) {
            cb.b bVar3 = new cb.b(1);
            hf.e eVar = (hf.e) bVar.f6120b;
            hf.b bVar4 = new hf.b(bVar3);
            try {
                if (((hf.c) eVar).E0(bVar4)) {
                    bVar2 = new f7.b(8, bVar4, (ComponentName) bVar.f6121c);
                }
            } catch (RemoteException unused) {
            }
            f182a = bVar2;
            new WeakReference(bVar2);
        }
        return f182a;
    }

    public static boolean d(android.content.Context r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: af.g.d(android.content.Context, java.lang.String):boolean");
    }

    public static boolean e() {
        dz sheetFragment;
        p2 U = LaunchActivity.U();
        if (U != null && (U.getParentLayout() instanceof ActionBarLayout) && (sheetFragment = ((ActionBarLayout) U.getParentLayout()).getSheetFragment()) != null && sheetFragment.getArticleViewer() != null) {
            return true;
        }
        if (U != null && U.getArticleViewer() != null) {
            return true;
        }
        return false;
    }

    public static boolean f(Uri uri, boolean z4, boolean[] zArr) {
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
            Matcher matcher = LaunchActivity.f34134y1.matcher(str);
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
                        if (!z4) {
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
                    if ((!"telegram.org".equals(str) || uri.getPath() == null || !uri.getPath().startsWith("/blog/")) && (!z4 || (!str.endsWith("telegram.org") && !str.endsWith("telegra.ph") && !str.endsWith("telesco.pe")))) {
                    }
                } else {
                    String path2 = uri.getPath();
                    if (path2 != null && path2.length() > 1) {
                        if (!z4) {
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
        } catch (Exception e6) {
            FileLog.e(e6);
            return false;
        }
    }

    public static boolean h(String str, boolean z4, boolean z10) {
        String str2;
        if (z4) {
            if (!str.equals("telegra.ph") && !str.equals("te.legra.ph") && !str.equals("graph.org")) {
                return false;
            }
            return true;
        }
        StringBuilder sb = new StringBuilder("^(https");
        if (z10) {
            str2 = "";
        } else {
            str2 = "?";
        }
        sb.append(str2);
        sb.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb.toString());
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
        if (f186f == null) {
            f186f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            matches = f186f.matcher(hostAuthority).matches();
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite")) {
                matches = f186f.matcher(parse.getScheme()).matches();
            } else {
                return false;
            }
        }
        return !matches;
    }

    public static boolean k(Context context, String str, boolean z4, boolean z10, f fVar) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (AndroidUtilities.findActivity(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) AndroidUtilities.findActivity(context);
        } else {
            launchActivity = LaunchActivity.D1;
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
        intent.putExtra("force_not_internal_apps", z4);
        intent.putExtra("force_request", z10);
        launchActivity.e0(intent, fVar);
        return true;
    }

    public static boolean l(android.content.Context r5, java.lang.String r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: af.g.l(android.content.Context, java.lang.String, boolean):boolean");
    }

    public static boolean m(Context context, String str, boolean z4, String str2) {
        boolean z10;
        Intent intent;
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                if (parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || z4) {
                    if (z10) {
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
            } catch (Exception e6) {
                FileLog.e(e6);
                return false;
            }
        }
        return false;
    }

    public static void n(String str) {
        o3 P;
        n3 n3Var;
        String openURL;
        p3[] p3VarArr;
        p3 p3Var;
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null && (P = launchActivity.P()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<n3> tabs = P.getTabs();
                for (int i10 = 0; i10 < tabs.size(); i10++) {
                    n3Var = tabs.get(i10);
                    l4 l4Var = n3Var.H;
                    if (l4Var != null && !l4Var.f38603a0.isEmpty()) {
                        Object i11 = l.d.i(1, n3Var.H.f38603a0);
                        if (i11 instanceof b3) {
                            x0 x0Var = ((b3) i11).f22161b;
                            if (x0Var == null && (p3VarArr = n3Var.H.f38619r0) != null && (p3Var = p3VarArr[0]) != null) {
                                x0Var = p3Var.getWebView();
                            }
                            if (x0Var != null) {
                                if (x0Var.canGoBack()) {
                                    openURL = x0Var.getUrl();
                                } else {
                                    openURL = x0Var.getOpenURL();
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

    public static void o(Activity activity, String str, boolean z4) {
        if (activity != null && str != null) {
            p(activity, Uri.parse(str), z4, true);
        }
    }

    public static void p(Context context, Uri uri, boolean z4, boolean z10) {
        r(context, uri, z4, z10, false, null, null, false, true, false);
    }

    public static void q(Context context, Uri uri, boolean z4, boolean z10, f fVar) {
        r(context, uri, z4, z10, false, fVar, null, false, true, false);
    }

    public static void r(android.content.Context r18, android.net.Uri r19, boolean r20, boolean r21, boolean r22, af.f r23, java.lang.String r24, boolean r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: af.g.r(android.content.Context, android.net.Uri, boolean, boolean, boolean, af.f, java.lang.String, boolean, boolean, boolean):void");
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

    public static String w(Uri uri, String str) {
        return v(uri, null, null, str, null);
    }

    public static void x(Activity activity) {
        Activity activity2;
        if (f184c == null) {
            return;
        }
        WeakReference weakReference = f185e;
        if (weakReference == null) {
            activity2 = null;
        } else {
            activity2 = (Activity) weakReference.get();
        }
        if (activity2 == activity) {
            f185e.clear();
        }
        try {
            activity.unbindService(f184c);
        } catch (Exception unused) {
        }
        f183b = null;
        f182a = null;
    }

    public static boolean y(String str) {
        if (!h(str, false, true) && !str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") && !str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") && !str.matches("^(https://)?fragment\\.com(/.*|$)")) {
            return false;
        }
        return true;
    }
}
