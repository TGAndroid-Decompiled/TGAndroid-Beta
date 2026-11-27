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
public final class i05 extends j05 {
    public static final Object d = new Object();
    public static final i05 e = new Object();
    public qa4 c;

    public static AlertDialog e(Activity activity, int i, k7d k7dVar, DialogInterface.OnCancelListener onCancelListener) {
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
        builder.setMessage(g7d.b(activity, i));
        builder.setOnCancelListener(onCancelListener);
        String c = g7d.c(activity, i);
        if (c != null) {
            builder.setPositiveButton(c, k7dVar);
        }
        String a = g7d.a(activity, i);
        if (a != null) {
            builder.setTitle(a);
        }
        Log.w("GoogleApiAvailability", uh9.k(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof jp4) {
                lq4 u = ((jp4) activity).u();
                qfb qfbVar = new qfb();
                xve.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                qfbVar.B0 = alertDialog;
                qfbVar.C0 = onCancelListener;
                qfbVar.y0 = false;
                qfbVar.z0 = true;
                u.getClass();
                kd0 kd0Var = new kd0(u);
                kd0Var.o = true;
                kd0Var.f(0, qfbVar, str);
                kd0Var.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        xve.i(alertDialog, "Cannot display null dialog");
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
        return super.c(context, j05.a);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog e2 = e(googleApiActivity, i, new k7d(super.a(i, googleApiActivity, "d"), googleApiActivity, (byte) 0), googleApiActivity2);
        if (e2 == null) {
            return;
        }
        h(googleApiActivity, e2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Activity activity, g36 g36Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e2 = e(activity, i, new k7d(super.a(i, activity, "d"), g36Var, (byte) 1), onCancelListener);
        if (e2 == null) {
            return;
        }
        h(activity, e2, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) {
        String a;
        String e2;
        int i2;
        Log.w("GoogleApiAvailability", qd4.n(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new c7d(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (i == 6) {
                a = g7d.f(context, "common_google_play_services_resolution_required_title");
            } else {
                a = g7d.a(context, i);
            }
            if (a == null) {
                a = context.getResources().getString(2131689566);
            }
            if (i != 6 && i != 19) {
                e2 = g7d.b(context, i);
            } else {
                e2 = g7d.e(context, "common_google_play_services_resolution_required_text", g7d.d(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            xve.h(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            wn7 wn7Var = new wn7(context, null);
            wn7Var.t = true;
            wn7Var.f(16, true);
            wn7Var.e = wn7.c(a);
            rn7 rn7Var = new rn7((byte) 0);
            rn7Var.f = wn7.c(e2);
            wn7Var.i(rn7Var);
            PackageManager packageManager = context.getPackageManager();
            Boolean bool = die.a;
            if (bool == null) {
                bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                die.a = bool;
            }
            int i3 = 17301642;
            if (bool.booleanValue()) {
                int i4 = context.getApplicationInfo().icon;
                if (i4 != 0) {
                    i3 = i4;
                }
                wn7Var.F.icon = i3;
                wn7Var.j = 2;
                if (die.a(context)) {
                    wn7Var.a(2131231011, pendingIntent, resources.getString(2131689574));
                } else {
                    wn7Var.g = pendingIntent;
                }
            } else {
                wn7Var.F.icon = 17301642;
                wn7Var.k(resources.getString(2131689566));
                wn7Var.F.when = System.currentTimeMillis();
                wn7Var.g = pendingIntent;
                wn7Var.d(e2);
            }
            if (rve.a()) {
                xve.k(rve.a());
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
                wn7Var.y = "com.google.android.gms.availability";
            }
            Notification b = wn7Var.b();
            if (i != 1 && i != 2 && i != 3) {
                i2 = 39789;
            } else {
                c15.a.set(false);
                i2 = 10436;
            }
            notificationManager.notify(i2, b);
        }
    }
}
