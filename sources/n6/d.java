package n6;

import ab.e0;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import e0.q;
import q6.s;
import q6.t;
public final class d extends e {
    public static final Object d = new Object();
    public static final d f20498e = new Object();
    public s6.d f20499c;

    public static e0 g(Context context, cb.c cVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        e0 e0Var = new e0(cVar);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            f0.b.b(context, e0Var, intentFilter);
        } else if (i7 >= 26) {
            f0.b.a(context, e0Var, intentFilter);
        } else {
            context.registerReceiver(e0Var, intentFilter, null, null);
        }
        e0Var.f921b = context;
        if (!g.c(context)) {
            cVar.D();
            e0Var.b();
            return null;
        }
        return e0Var;
    }

    @Override
    public final int c(Context context) {
        return d(context, e.f20500a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i7, GoogleApiActivity googleApiActivity2) {
        t tVar = new t(super.b(i7, googleApiActivity, "d"), googleApiActivity);
        AlertDialog alertDialog = null;
        AlertDialog.Builder builder = null;
        if (i7 != 0) {
            TypedValue typedValue = new TypedValue();
            googleApiActivity.getTheme().resolveAttribute(16843529, typedValue, true);
            if ("Theme.Dialog.Alert".equals(googleApiActivity.getResources().getResourceEntryName(typedValue.resourceId))) {
                builder = new AlertDialog.Builder(googleApiActivity, 5);
            }
            if (builder == null) {
                builder = new AlertDialog.Builder(googleApiActivity);
            }
            builder.setMessage(s.b(googleApiActivity, i7));
            if (googleApiActivity2 != null) {
                builder.setOnCancelListener(googleApiActivity2);
            }
            String c10 = s.c(googleApiActivity, i7);
            if (c10 != null) {
                builder.setPositiveButton(c10, tVar);
            }
            String a10 = s.a(googleApiActivity, i7);
            if (a10 != null) {
                builder.setTitle(a10);
            }
            Log.w("GoogleApiAvailability", jg.g.j(i7, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
            alertDialog = builder.create();
        }
        if (alertDialog == null) {
            return;
        }
        FragmentManager fragmentManager = googleApiActivity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        q6.m.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f20492a = alertDialog;
        if (googleApiActivity2 != null) {
            dialogFragment.f20493b = googleApiActivity2;
        }
        dialogFragment.show(fragmentManager, "GooglePlayServicesErrorDialog");
    }

    public final void f(Context context, int i7, PendingIntent pendingIntent) {
        String a10;
        String e10;
        int i10;
        Log.w("GoogleApiAvailability", jg.g.k(i7, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i7 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (i7 == 6) {
                a10 = s.f(context, "common_google_play_services_resolution_required_title");
            } else {
                a10 = s.a(context, i7);
            }
            if (a10 == null) {
                a10 = context.getResources().getString(2131689566);
            }
            if (i7 != 6 && i7 != 19) {
                e10 = s.b(context, i7);
            } else {
                e10 = s.e(context, "common_google_play_services_resolution_required_text", s.d(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            q6.m.g(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            q qVar = new q(context, null);
            qVar.f10111t = true;
            qVar.h(16, true);
            qVar.f10097e = q.d(a10);
            e0.l lVar = new e0.l(false);
            lVar.f10087f = q.d(e10);
            qVar.n(lVar);
            PackageManager packageManager = context.getPackageManager();
            if (x6.b.f58635b == null) {
                x6.b.f58635b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            int i11 = 17301642;
            if (x6.b.f58635b.booleanValue()) {
                int i12 = context.getApplicationInfo().icon;
                if (i12 != 0) {
                    i11 = i12;
                }
                qVar.F.icon = i11;
                qVar.f10101j = 2;
                if (x6.b.f(context)) {
                    qVar.a(2131231009, pendingIntent, resources.getString(2131689574));
                } else {
                    qVar.f10099g = pendingIntent;
                }
            } else {
                qVar.F.icon = 17301642;
                qVar.p(resources.getString(2131689566));
                qVar.F.when = System.currentTimeMillis();
                qVar.f10099g = pendingIntent;
                qVar.f(e10);
            }
            if (x6.b.d()) {
                q6.m.j(x6.b.d());
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
                qVar.f10115y = "com.google.android.gms.availability";
            }
            Notification b10 = qVar.b();
            if (i7 != 1 && i7 != 2 && i7 != 3) {
                i10 = 39789;
            } else {
                g.f20503a.set(false);
                i10 = 10436;
            }
            notificationManager.notify(i10, b10);
        }
    }
}
