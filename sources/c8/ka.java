package c8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.LaunchActivity;
public abstract class ka {
    public static int f4576a = 1500;

    public static boolean a() {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f26609b);
        }
        if (activity == null) {
            return false;
        }
        return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
    }

    public static void b(String[] strArr, z10 z10Var) {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f26609b);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) != 0) {
                for (String str2 : strArr) {
                    if (activity.shouldShowRequestPermissionRationale(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, null);
                        int i7 = org.telegram.ui.ActionBar.j6.L5;
                        alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.j6.x0(null, i7, false), null);
                        alertDialog$Builder.n(i7, null);
                        alertDialog$Builder.f28392a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747309, null));
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747300, null), new oc0(activity, 1));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
                        alertDialog$Builder.f28392a.show();
                        z10Var.a(Boolean.FALSE);
                        return;
                    }
                }
                e(strArr, new pc0(strArr, activity, z10Var, 1));
                return;
            }
        }
        z10Var.a(Boolean.TRUE);
    }

    public static void c(int i7, int i10, String[] strArr, String[] strArr2, z10 z10Var) {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f26609b);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) == 0) {
                z10Var.a(Boolean.TRUE);
                return;
            }
        }
        for (String str2 : strArr) {
            if (!activity.shouldShowRequestPermissionRationale(str2)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, null);
                int i11 = org.telegram.ui.ActionBar.j6.L5;
                alertDialog$Builder.m(i7, 72, org.telegram.ui.ActionBar.j6.x0(null, i11, false), null);
                alertDialog$Builder.n(i11, null);
                alertDialog$Builder.f28392a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i10, null));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747300, null), new oc0(activity, 0));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
                alertDialog$Builder.f28392a.show();
                z10Var.a(Boolean.FALSE);
                return;
            }
        }
        e(strArr2, new pc0(strArr2, activity, z10Var, 0));
    }

    public static boolean d(String str) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f26609b);
        }
        if (context != null && context.checkSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static void e(String[] strArr, z10 z10Var) {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f26609b);
        }
        if (activity == null) {
            return;
        }
        int i7 = f4576a;
        f4576a = i7 + 1;
        is[] isVarArr = {new qc0(i7, z10Var, isVarArr)};
        ns.e().b(isVarArr[0], ns.f25553p5);
        activity.requestPermissions(strArr, i7);
    }

    public static void f() {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f26609b);
        }
        if (activity == null) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26609b.getPackageName()));
        try {
            activity.startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
