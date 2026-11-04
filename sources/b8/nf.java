package b8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.LaunchActivity;
public abstract class nf {
    public static int f2849a = 1500;

    public static boolean a() {
        Activity activity = LaunchActivity.K1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f25457b);
        }
        if (activity == null) {
            return false;
        }
        return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
    }

    public static void b(String[] strArr, u10 u10Var) {
        Activity activity = LaunchActivity.K1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f25457b);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) != 0) {
                for (String str2 : strArr) {
                    if (activity.shouldShowRequestPermissionRationale(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, null);
                        int i3 = org.telegram.ui.ActionBar.k6.L5;
                        alertDialog$Builder.m(2131624116, 72, org.telegram.ui.ActionBar.k6.x0(null, i3, false), null);
                        alertDialog$Builder.n(i3, null);
                        alertDialog$Builder.f27343a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747317, null));
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new ic0(activity, 1));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
                        alertDialog$Builder.f27343a.show();
                        u10Var.a(Boolean.FALSE);
                        return;
                    }
                }
                e(strArr, new jc0(strArr, activity, u10Var, 1));
                return;
            }
        }
        u10Var.a(Boolean.TRUE);
    }

    public static void c(int i3, int i10, String[] strArr, String[] strArr2, u10 u10Var) {
        Activity activity = LaunchActivity.K1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f25457b);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) == 0) {
                u10Var.a(Boolean.TRUE);
                return;
            }
        }
        for (String str2 : strArr) {
            if (!activity.shouldShowRequestPermissionRationale(str2)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, null);
                int i11 = org.telegram.ui.ActionBar.k6.L5;
                alertDialog$Builder.m(i3, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
                alertDialog$Builder.n(i11, null);
                alertDialog$Builder.f27343a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i10, null));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new ic0(activity, 0));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
                alertDialog$Builder.f27343a.show();
                u10Var.a(Boolean.FALSE);
                return;
            }
        }
        e(strArr2, new jc0(strArr2, activity, u10Var, 0));
    }

    public static boolean d(String str) {
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f25457b);
        }
        if (context != null && context.checkSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static void e(String[] strArr, u10 u10Var) {
        Activity activity = LaunchActivity.K1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f25457b);
        }
        if (activity == null) {
            return;
        }
        int i3 = f2849a;
        f2849a = i3 + 1;
        cs[] csVarArr = {new kc0(i3, u10Var, csVarArr)};
        hs.e().b(csVarArr[0], hs.f23285p5);
        activity.requestPermissions(strArr, i3);
    }

    public static void f() {
        Activity activity = LaunchActivity.K1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f25457b);
        }
        if (activity == null) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
        try {
            activity.startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
