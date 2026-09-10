package k6;

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
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.k0;
import androidx.fragment.app.v;
import com.google.android.gms.common.api.GoogleApiActivity;
import e0.t;
import n6.q;
import n6.r;
public final class d extends e {
    public static final Object f12353c = new Object();
    public static final d d = new Object();

    public static AlertDialog f(Activity activity, int i10, r rVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
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
        builder.setMessage(q.c(activity, i10));
        builder.setOnCancelListener(onCancelListener);
        String b10 = q.b(activity, i10);
        if (b10 != null) {
            builder.setPositiveButton(b10, rVar);
        }
        String d10 = q.d(activity, i10);
        if (d10 != null) {
            builder.setTitle(d10);
        }
        Log.w("GoogleApiAvailability", hc.b.j(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof v) {
                k0 s10 = ((v) activity).s();
                i iVar = new i();
                n6.l.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                iVar.A0 = alertDialog;
                iVar.B0 = onCancelListener;
                iVar.f1178x0 = false;
                iVar.f1179y0 = true;
                s10.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(s10);
                aVar.f1074o = true;
                aVar.f(0, iVar, str);
                aVar.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        n6.l.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f12347a = alertDialog;
        dialogFragment.f12348b = onCancelListener;
        dialogFragment.show(fragmentManager, str);
    }

    @Override
    public final int c(Context context) {
        return d(context, e.f12354a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog f7 = f(googleApiActivity, i10, new r(super.b(googleApiActivity, "d", i10), googleApiActivity, 0), googleApiActivity2);
        if (f7 == null) {
            return;
        }
        g(googleApiActivity, f7, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void h(Context context, int i10, PendingIntent pendingIntent) {
        String d10;
        String e;
        int i11;
        Log.w("GoogleApiAvailability", hc.b.k(i10, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (i10 == 6) {
                d10 = q.f(context, "common_google_play_services_resolution_required_title");
            } else {
                d10 = q.d(context, i10);
            }
            if (d10 == null) {
                d10 = context.getResources().getString(2131689565);
            }
            if (i10 != 6 && i10 != 19) {
                e = q.c(context, i10);
            } else {
                e = q.e(context, "common_google_play_services_resolution_required_text", q.a(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            n6.l.h(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            t tVar = new t(context, null);
            tVar.f7151t = true;
            tVar.h(16, true);
            tVar.e = t.d(d10);
            e0.o oVar = new e0.o(false);
            oVar.f7121f = t.d(e);
            tVar.n(oVar);
            PackageManager packageManager = context.getPackageManager();
            if (u6.b.f42597b == null) {
                u6.b.f42597b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (u6.b.f42597b.booleanValue()) {
                tVar.E.icon = context.getApplicationInfo().icon;
                tVar.f7141j = 2;
                if (u6.b.f(context)) {
                    tVar.a(2131230970, resources.getString(2131689573), pendingIntent);
                } else {
                    tVar.f7139g = pendingIntent;
                }
            } else {
                tVar.E.icon = 17301642;
                tVar.p(resources.getString(2131689565));
                tVar.E.when = System.currentTimeMillis();
                tVar.f7139g = pendingIntent;
                tVar.f(e);
            }
            if (u6.b.d()) {
                n6.l.k(u6.b.d());
                synchronized (f12353c) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(2131689564);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                tVar.f7155y = "com.google.android.gms.availability";
            }
            Notification b10 = tVar.b();
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                i11 = 39789;
            } else {
                g.f12357a.set(false);
                i11 = 10436;
            }
            notificationManager.notify(i11, b10);
        }
    }

    public final void i(Activity activity, com.google.android.gms.common.api.internal.m mVar, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog f7 = f(activity, i10, new r(super.b(activity, "d", i10), mVar, 1), onCancelListener);
        if (f7 == null) {
            return;
        }
        g(activity, f7, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
