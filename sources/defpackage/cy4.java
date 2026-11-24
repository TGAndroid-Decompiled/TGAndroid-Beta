package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
public final class cy4 extends dy4 {
    public static final Object d = new Object();
    public static final cy4 e = new Object();
    public u84 c;

    public static AlertDialog e(Activity activity, int i, t2d t2dVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(activity, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(p2d.b(activity, i));
        builder.setOnCancelListener(onCancelListener);
        String c = p2d.c(activity, i);
        if (c != null) {
            builder.setPositiveButton(c, t2dVar);
        }
        String a = p2d.a(activity, i);
        if (a != null) {
            builder.setTitle(a);
        }
        Log.w("GoogleApiAvailability", de9.k(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof en4) {
                ho4 u = ((en4) activity).u();
                ubb ubbVar = new ubb();
                fre.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                ubbVar.B0 = alertDialog;
                ubbVar.C0 = onCancelListener;
                ubbVar.y0 = false;
                ubbVar.z0 = true;
                u.getClass();
                id0 id0Var = new id0(u);
                id0Var.o = true;
                id0Var.f(0, ubbVar, str);
                id0Var.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        fre.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.a = alertDialog;
        dialogFragment.b = onCancelListener;
        dialogFragment.show(fragmentManager, str);
    }

    @Override
    public final Intent a(int i, Context context, String str) {
        return super.a(i, context, str);
    }

    @Override
    public final int b(Context context) {
        return super.c(context, dy4.a);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog e2 = e(googleApiActivity, i, new t2d(super.a(i, googleApiActivity, "d"), googleApiActivity, (byte) 0), googleApiActivity2);
        if (e2 == null) {
            return;
        }
        h(googleApiActivity, e2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Activity activity, c16 c16Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e2 = e(activity, i, new t2d(super.a(i, activity, "d"), c16Var, (byte) 1), onCancelListener);
        if (e2 == null) {
            return;
        }
        h(activity, e2, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) {
        String a;
        String e2;
        int i2;
        Log.w("GoogleApiAvailability", tb4.n(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new l2d(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (i == 6) {
                a = p2d.f(context, "common_google_play_services_resolution_required_title");
            } else {
                a = p2d.a(context, i);
            }
            if (a == null) {
                a = context.getResources().getString(2131689566);
            }
            if (i != 6 && i != 19) {
                e2 = p2d.b(context, i);
            } else {
                e2 = p2d.e(context, "common_google_play_services_resolution_required_text", p2d.d(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            fre.h(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            xk7 xk7Var = new xk7(context, null);
            xk7Var.t = true;
            xk7Var.f(16, true);
            xk7Var.e = xk7.c(a);
            sk7 sk7Var = new sk7((byte) 0);
            sk7Var.f = xk7.c(e2);
            xk7Var.i(sk7Var);
            PackageManager packageManager = context.getPackageManager();
            Boolean bool = mde.a;
            if (bool == null) {
                bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                mde.a = bool;
            }
            int i3 = 17301642;
            if (bool.booleanValue()) {
                int i4 = context.getApplicationInfo().icon;
                if (i4 != 0) {
                    i3 = i4;
                }
                xk7Var.F.icon = i3;
                xk7Var.j = 2;
                if (mde.a(context)) {
                    xk7Var.a(2131231011, pendingIntent, resources.getString(2131689574));
                } else {
                    xk7Var.g = pendingIntent;
                }
            } else {
                xk7Var.F.icon = 17301642;
                xk7Var.k(resources.getString(2131689566));
                xk7Var.F.when = System.currentTimeMillis();
                xk7Var.g = pendingIntent;
                xk7Var.d(e2);
            }
            if (xqe.a()) {
                fre.k(xqe.a());
                synchronized (d) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(2131689565);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                xk7Var.y = "com.google.android.gms.availability";
            }
            Notification b = xk7Var.b();
            if (i != 1 && i != 2 && i != 3) {
                i2 = 39789;
            } else {
                yy4.a.set(false);
                i2 = 10436;
            }
            notificationManager.notify(i2, b);
        }
    }
}
