package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public abstract class use {
    public static int a = 1500;

    public static boolean a() {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = gm.W(a.b);
        }
        if (activity == null) {
            return false;
        }
        return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
    }

    public static void b(String[] strArr, String[] strArr2, qac qacVar) {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = gm.W(a.b);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) != 0) {
                for (String str2 : strArr) {
                    if (activity.shouldShowRequestPermissionRationale(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, activity);
                        int i = cmb.K5;
                        alertDialog$Builder.l(2131624117, 72, cmb.w0(null, i, false), null);
                        alertDialog$Builder.m(i, null);
                        alertDialog$Builder.a.U = gm.S2(jb6.M0(2131747042, null));
                        alertDialog$Builder.j(jb6.M0(2131747033, null), new mi(activity, (byte) 3));
                        alertDialog$Builder.g(jb6.M0(2131751709, null), null);
                        alertDialog$Builder.a.show();
                        qacVar.a(Boolean.FALSE);
                        return;
                    }
                }
                e(strArr2, new k58(strArr2, activity, qacVar, (byte) 1));
                return;
            }
        }
        qacVar.a(Boolean.TRUE);
    }

    public static void c(int i, int i2, String[] strArr, String[] strArr2, qac qacVar) {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = gm.W(a.b);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) == 0) {
                qacVar.a(Boolean.TRUE);
                return;
            }
        }
        for (String str2 : strArr) {
            if (!activity.shouldShowRequestPermissionRationale(str2)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, activity);
                int i3 = cmb.K5;
                alertDialog$Builder.l(i, 72, cmb.w0(null, i3, false), null);
                alertDialog$Builder.m(i3, null);
                alertDialog$Builder.a.U = gm.S2(jb6.M0(i2, null));
                alertDialog$Builder.j(jb6.M0(2131747033, null), new mi(activity, (byte) 2));
                alertDialog$Builder.g(jb6.M0(2131751709, null), null);
                alertDialog$Builder.a.show();
                qacVar.a(Boolean.FALSE);
                return;
            }
        }
        e(strArr2, new k58(strArr2, activity, qacVar, (byte) 0));
    }

    public static boolean d(String str) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = gm.W(a.b);
        }
        if (context != null && context.checkSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static void e(String[] strArr, qac qacVar) {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = gm.W(a.b);
        }
        if (activity == null) {
            return;
        }
        int i = a;
        a = i + 1;
        jm7[] jm7VarArr = {new l58(i, qacVar, jm7VarArr)};
        nm7.e().a(jm7VarArr[0], nm7.t5);
        activity.requestPermissions(strArr, i);
    }

    public static void f() {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = gm.W(a.b);
        }
        if (activity == null) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + a.b.getPackageName()));
        try {
            activity.startActivity(intent);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
