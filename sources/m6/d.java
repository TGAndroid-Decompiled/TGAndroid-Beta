package m6;

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
import com.google.android.gms.common.api.internal.o0;
import e0.q;
import k2.p1;
import p6.s;
import p6.t;
public final class d extends e {
    public static final Object d = new Object();
    public static final d f19186e = new Object();
    public r6.d f19187c;

    public static o0 g(Context context, c6.i iVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        o0 o0Var = new o0(iVar);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            f0.b.b(context, o0Var, intentFilter);
        } else if (i3 >= 26) {
            f0.b.a(context, o0Var, intentFilter);
        } else {
            context.registerReceiver(o0Var, intentFilter, null, null);
        }
        o0Var.f6728b = context;
        if (!g.c(context)) {
            iVar.C();
            o0Var.b();
            return null;
        }
        return o0Var;
    }

    @Override
    public final int c(Context context) {
        return d(context, e.f19188a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i3, GoogleApiActivity googleApiActivity2) {
        t tVar = new t(super.b(i3, googleApiActivity, "d"), googleApiActivity);
        AlertDialog alertDialog = null;
        AlertDialog.Builder builder = null;
        if (i3 != 0) {
            TypedValue typedValue = new TypedValue();
            googleApiActivity.getTheme().resolveAttribute(16843529, typedValue, true);
            if ("Theme.Dialog.Alert".equals(googleApiActivity.getResources().getResourceEntryName(typedValue.resourceId))) {
                builder = new AlertDialog.Builder(googleApiActivity, 5);
            }
            if (builder == null) {
                builder = new AlertDialog.Builder(googleApiActivity);
            }
            builder.setMessage(s.b(googleApiActivity, i3));
            if (googleApiActivity2 != null) {
                builder.setOnCancelListener(googleApiActivity2);
            }
            String c2 = s.c(googleApiActivity, i3);
            if (c2 != null) {
                builder.setPositiveButton(c2, tVar);
            }
            String a10 = s.a(googleApiActivity, i3);
            if (a10 != null) {
                builder.setTitle(a10);
            }
            Log.w("GoogleApiAvailability", p1.i(i3, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
            alertDialog = builder.create();
        }
        if (alertDialog == null) {
            return;
        }
        FragmentManager fragmentManager = googleApiActivity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        p6.m.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f19180a = alertDialog;
        if (googleApiActivity2 != null) {
            dialogFragment.f19181b = googleApiActivity2;
        }
        dialogFragment.show(fragmentManager, "GooglePlayServicesErrorDialog");
    }

    public final void f(Context context, int i3, PendingIntent pendingIntent) {
        String a10;
        String e10;
        int i10;
        Log.w("GoogleApiAvailability", p1.j(i3, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i3 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i3 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (i3 == 6) {
                a10 = s.f(context, "common_google_play_services_resolution_required_title");
            } else {
                a10 = s.a(context, i3);
            }
            if (a10 == null) {
                a10 = context.getResources().getString(2131689566);
            }
            if (i3 != 6 && i3 != 19) {
                e10 = s.b(context, i3);
            } else {
                e10 = s.e(context, "common_google_play_services_resolution_required_text", s.d(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            p6.m.g(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            q qVar = new q(context, null);
            qVar.f9295t = true;
            qVar.h(16, true);
            qVar.f9281e = q.d(a10);
            e0.l lVar = new e0.l(false);
            lVar.f9270f = q.d(e10);
            qVar.n(lVar);
            PackageManager packageManager = context.getPackageManager();
            if (w6.b.f57392b == null) {
                w6.b.f57392b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            int i11 = 17301642;
            if (w6.b.f57392b.booleanValue()) {
                int i12 = context.getApplicationInfo().icon;
                if (i12 != 0) {
                    i11 = i12;
                }
                qVar.F.icon = i11;
                qVar.f9285j = 2;
                if (w6.b.f(context)) {
                    qVar.a(2131231009, pendingIntent, resources.getString(2131689574));
                } else {
                    qVar.f9283g = pendingIntent;
                }
            } else {
                qVar.F.icon = 17301642;
                qVar.p(resources.getString(2131689566));
                qVar.F.when = System.currentTimeMillis();
                qVar.f9283g = pendingIntent;
                qVar.f(e10);
            }
            if (w6.b.d()) {
                p6.m.j(w6.b.d());
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
                qVar.f9299y = "com.google.android.gms.availability";
            }
            Notification b10 = qVar.b();
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                i10 = 39789;
            } else {
                g.f19191a.set(false);
                i10 = 10436;
            }
            notificationManager.notify(i10, b10);
        }
    }
}
