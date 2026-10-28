package l6;

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
import androidx.fragment.app.j0;
import androidx.fragment.app.u;
import com.google.android.gms.common.api.GoogleApiActivity;
import o6.q;
import o6.r;
public final class d extends e {
    public static final Object f16929c = new Object();
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
        Log.w("GoogleApiAvailability", ic.a.i(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof u) {
                j0 s10 = ((u) activity).s();
                i iVar = new i();
                o6.l.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                iVar.A0 = alertDialog;
                iVar.B0 = onCancelListener;
                iVar.f2697x0 = false;
                iVar.f2698y0 = true;
                s10.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(s10);
                aVar.f2599o = true;
                aVar.f(0, iVar, str);
                aVar.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        o6.l.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f16923a = alertDialog;
        dialogFragment.f16924b = onCancelListener;
        dialogFragment.show(fragmentManager, str);
    }

    @Override
    public final int c(Context context) {
        return d(context, e.f16930a);
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
        Log.w("GoogleApiAvailability", ic.a.j(i10, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
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
            o6.l.h(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            e0.q qVar = new e0.q(context, null);
            qVar.f9591t = true;
            qVar.h(16, true);
            qVar.e = e0.q.d(d10);
            e0.l lVar = new e0.l(false);
            lVar.f9563f = e0.q.d(e);
            qVar.n(lVar);
            PackageManager packageManager = context.getPackageManager();
            if (v6.b.f50110b == null) {
                v6.b.f50110b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (v6.b.f50110b.booleanValue()) {
                qVar.F.icon = context.getApplicationInfo().icon;
                qVar.f9581j = 2;
                if (v6.b.f(context)) {
                    qVar.a(2131231010, resources.getString(2131689573), pendingIntent);
                } else {
                    qVar.f9579g = pendingIntent;
                }
            } else {
                qVar.F.icon = 17301642;
                qVar.p(resources.getString(2131689565));
                qVar.F.when = System.currentTimeMillis();
                qVar.f9579g = pendingIntent;
                qVar.f(e);
            }
            if (v6.b.d()) {
                o6.l.k(v6.b.d());
                synchronized (f16929c) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(2131689564);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                qVar.f9595y = "com.google.android.gms.availability";
            }
            Notification b10 = qVar.b();
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                i11 = 39789;
            } else {
                g.f16933a.set(false);
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
