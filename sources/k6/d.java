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
import androidx.fragment.app.l0;
import androidx.fragment.app.v;
import com.google.android.gms.common.api.GoogleApiActivity;
import n6.r;
import n6.s;
public final class d extends e {
    public static final Object f14704c = new Object();
    public static final d d = new Object();

    public static AlertDialog f(Activity activity, int i10, s sVar, DialogInterface.OnCancelListener onCancelListener) {
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
        builder.setMessage(r.c(activity, i10));
        builder.setOnCancelListener(onCancelListener);
        String b10 = r.b(activity, i10);
        if (b10 != null) {
            builder.setPositiveButton(b10, sVar);
        }
        String d10 = r.d(activity, i10);
        if (d10 != null) {
            builder.setTitle(d10);
        }
        Log.w("GoogleApiAvailability", hg.c.h(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof v) {
                l0 s10 = ((v) activity).s();
                i iVar = new i();
                n6.m.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                iVar.A0 = alertDialog;
                iVar.B0 = onCancelListener;
                iVar.f2752x0 = false;
                iVar.f2753y0 = true;
                s10.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(s10);
                aVar.f2651o = true;
                aVar.f(0, iVar, str);
                aVar.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        n6.m.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f14698a = alertDialog;
        dialogFragment.f14699b = onCancelListener;
        dialogFragment.show(fragmentManager, str);
    }

    @Override
    public final int c(Context context) {
        return d(context, e.f14705a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog f7 = f(googleApiActivity, i10, new s(super.b(googleApiActivity, "d", i10), googleApiActivity, 0), googleApiActivity2);
        if (f7 == null) {
            return;
        }
        g(googleApiActivity, f7, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void h(Context context, int i10, PendingIntent pendingIntent) {
        String d10;
        String e7;
        int i11;
        Log.w("GoogleApiAvailability", hg.c.i(i10, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (i10 == 6) {
                d10 = r.f(context, "common_google_play_services_resolution_required_title");
            } else {
                d10 = r.d(context, i10);
            }
            if (d10 == null) {
                d10 = context.getResources().getString(2131689565);
            }
            if (i10 != 6 && i10 != 19) {
                e7 = r.c(context, i10);
            } else {
                e7 = r.e(context, "common_google_play_services_resolution_required_text", r.a(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            n6.m.h(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            e0.r rVar = new e0.r(context, null);
            rVar.f8482t = true;
            rVar.h(16, true);
            rVar.f8468e = e0.r.d(d10);
            e0.m mVar = new e0.m(false);
            mVar.f8450f = e0.r.d(e7);
            rVar.n(mVar);
            PackageManager packageManager = context.getPackageManager();
            if (u6.b.f48941b == null) {
                u6.b.f48941b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (u6.b.f48941b.booleanValue()) {
                rVar.E.icon = context.getApplicationInfo().icon;
                rVar.f8472j = 2;
                if (u6.b.f(context)) {
                    rVar.a(2131230973, resources.getString(2131689573), pendingIntent);
                } else {
                    rVar.f8470g = pendingIntent;
                }
            } else {
                rVar.E.icon = 17301642;
                rVar.p(resources.getString(2131689565));
                rVar.E.when = System.currentTimeMillis();
                rVar.f8470g = pendingIntent;
                rVar.f(e7);
            }
            if (u6.b.d()) {
                n6.m.k(u6.b.d());
                synchronized (f14704c) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(2131689564);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                rVar.f8486y = "com.google.android.gms.availability";
            }
            Notification b10 = rVar.b();
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                i11 = 39789;
            } else {
                g.f14708a.set(false);
                i11 = 10436;
            }
            notificationManager.notify(i11, b10);
        }
    }

    public final void i(Activity activity, com.google.android.gms.common.api.internal.m mVar, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog f7 = f(activity, i10, new s(super.b(activity, "d", i10), mVar, 1), onCancelListener);
        if (f7 == null) {
            return;
        }
        g(activity, f7, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
