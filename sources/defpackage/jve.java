package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public abstract class jve {
    public static int a = 1500;

    public static boolean a() {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = hl.W(a.b);
        }
        if (activity == null) {
            return false;
        }
        return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
    }

    public static void b(String[] strArr, String[] strArr2, pcc pccVar) {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = hl.W(a.b);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) != 0) {
                for (String str2 : strArr) {
                    if (activity.shouldShowRequestPermissionRationale(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, activity);
                        int i = aob.L5;
                        alertDialog$Builder.l(2131624117, 72, aob.w0(null, i, false), null);
                        alertDialog$Builder.m(i, null);
                        alertDialog$Builder.a.U = hl.S2(ob6.M0(2131747036, null));
                        alertDialog$Builder.j(ob6.M0(2131747027, null), new oe(activity, (byte) 3));
                        alertDialog$Builder.g(ob6.M0(2131751737, null), null);
                        alertDialog$Builder.a.show();
                        pccVar.a(Boolean.FALSE);
                        return;
                    }
                }
                e(strArr2, new y68(strArr2, activity, pccVar, (byte) 1));
                return;
            }
        }
        pccVar.a(Boolean.TRUE);
    }

    public static void c(int i, int i2, String[] strArr, String[] strArr2, pcc pccVar) {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = hl.W(a.b);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) == 0) {
                pccVar.a(Boolean.TRUE);
                return;
            }
        }
        for (String str2 : strArr) {
            if (!activity.shouldShowRequestPermissionRationale(str2)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, activity);
                int i3 = aob.L5;
                alertDialog$Builder.l(i, 72, aob.w0(null, i3, false), null);
                alertDialog$Builder.m(i3, null);
                alertDialog$Builder.a.U = hl.S2(ob6.M0(i2, null));
                alertDialog$Builder.j(ob6.M0(2131747027, null), new oe(activity, (byte) 2));
                alertDialog$Builder.g(ob6.M0(2131751737, null), null);
                alertDialog$Builder.a.show();
                pccVar.a(Boolean.FALSE);
                return;
            }
        }
        e(strArr2, new y68(strArr2, activity, pccVar, (byte) 0));
    }

    public static boolean d(String str) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = hl.W(a.b);
        }
        if (context != null && context.checkSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static void e(String[] strArr, pcc pccVar) {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = hl.W(a.b);
        }
        if (activity == null) {
            return;
        }
        int i = a;
        a = i + 1;
        fn7[] fn7VarArr = {new z68(i, pccVar, fn7VarArr)};
        jn7.e().a(fn7VarArr[0], jn7.s5);
        activity.requestPermissions(strArr, i);
    }

    public static void f() {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = hl.W(a.b);
        }
        if (activity == null) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + a.b.getPackageName()));
        try {
            activity.startActivity(intent);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
