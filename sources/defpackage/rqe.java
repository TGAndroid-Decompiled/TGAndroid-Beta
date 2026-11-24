package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public abstract class rqe {
    public static int a = 1500;

    public static boolean a() {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = gl.W(a.b);
        }
        if (activity == null) {
            return false;
        }
        return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
    }

    public static void b(String[] strArr, String[] strArr2, p8c p8cVar) {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = gl.W(a.b);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) != 0) {
                for (String str2 : strArr) {
                    if (activity.shouldShowRequestPermissionRationale(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, activity);
                        int i = bkb.K5;
                        alertDialog$Builder.l(2131624117, 72, bkb.w0(null, i, false), null);
                        alertDialog$Builder.m(i, null);
                        alertDialog$Builder.a.U = gl.T2(k96.M0(2131747116, null));
                        alertDialog$Builder.j(k96.M0(2131747107, null), new mh(activity, (byte) 3));
                        alertDialog$Builder.g(k96.M0(2131751760, null), null);
                        alertDialog$Builder.a.show();
                        p8cVar.a(Boolean.FALSE);
                        return;
                    }
                }
                e(strArr2, new i38(strArr2, activity, p8cVar, (byte) 1));
                return;
            }
        }
        p8cVar.a(Boolean.TRUE);
    }

    public static void c(int i, int i2, String[] strArr, String[] strArr2, p8c p8cVar) {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = gl.W(a.b);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) == 0) {
                p8cVar.a(Boolean.TRUE);
                return;
            }
        }
        for (String str2 : strArr) {
            if (!activity.shouldShowRequestPermissionRationale(str2)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, activity);
                int i3 = bkb.K5;
                alertDialog$Builder.l(i, 72, bkb.w0(null, i3, false), null);
                alertDialog$Builder.m(i3, null);
                alertDialog$Builder.a.U = gl.T2(k96.M0(i2, null));
                alertDialog$Builder.j(k96.M0(2131747107, null), new mh(activity, (byte) 2));
                alertDialog$Builder.g(k96.M0(2131751760, null), null);
                alertDialog$Builder.a.show();
                p8cVar.a(Boolean.FALSE);
                return;
            }
        }
        e(strArr2, new i38(strArr2, activity, p8cVar, (byte) 0));
    }

    public static boolean d(String str) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = gl.W(a.b);
        }
        if (context != null && context.checkSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static void e(String[] strArr, p8c p8cVar) {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = gl.W(a.b);
        }
        if (activity == null) {
            return;
        }
        int i = a;
        a = i + 1;
        gk7[] gk7VarArr = {new j38(i, p8cVar, gk7VarArr)};
        kk7.e().a(gk7VarArr[0], kk7.r5);
        activity.requestPermissions(strArr, i);
    }

    public static void f() {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = gl.W(a.b);
        }
        if (activity == null) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + a.b.getPackageName()));
        try {
            activity.startActivity(intent);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
