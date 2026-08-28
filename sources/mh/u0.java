package mh;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kh.rc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ys0;
public final class u0 {
    public static final HashMap f18148g = new HashMap();
    public final Context f18149a;
    public final int f18150b;
    public final long f18151c;
    public boolean d;
    public boolean f18152e;
    public final HashSet f18153f;

    public u0(Context context, int i9, long j10) {
        HashSet hashSet = new HashSet();
        this.f18153f = hashSet;
        this.f18149a = context;
        this.f18150b = i9;
        this.f18151c = j10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i9, 0);
        this.d = sharedPreferences.getBoolean(j10 + "_requested", false);
        boolean z10 = sharedPreferences.getBoolean(j10 + "_granted", false);
        this.f18152e = z10;
        if (z10 && !a()) {
            this.f18152e = false;
            this.d = false;
            l();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public static void c() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i9 = 0; i9 < 4; i9++) {
            context.getSharedPreferences("botlocation_" + i9, 0).edit().clear().apply();
        }
        f18148g.clear();
    }

    public static u0 e(Context context, int i9, long j10) {
        Pair pair = new Pair(Integer.valueOf(i9), Long.valueOf(j10));
        HashMap hashMap = f18148g;
        u0 u0Var = (u0) hashMap.get(pair);
        if (u0Var == null) {
            u0 u0Var2 = new u0(context, i9, j10);
            hashMap.put(pair, u0Var2);
            return u0Var2;
        }
        return u0Var;
    }

    public static JSONObject h(Location location) {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        if (location != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            jSONObject.put("available", z10);
            if (location == null) {
                return jSONObject;
            }
            jSONObject.put("latitude", location.getLatitude());
            jSONObject.put("longitude", location.getLongitude());
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 26) {
                jSONObject.put("horizontal_accuracy", location.getAccuracy());
            } else {
                jSONObject.put("horizontal_accuracy", (Object) null);
            }
            jSONObject.put("altitude", location.getAltitude());
            if (i9 >= 26) {
                jSONObject.put("vertical_accuracy", location.getVerticalAccuracyMeters());
            } else {
                jSONObject.put("vertical_accuracy", (Object) null);
            }
            jSONObject.put("course", location.getBearing());
            if (i9 >= 26) {
                jSONObject.put("course_accuracy", location.getBearingAccuracyDegrees());
            } else {
                jSONObject.put("course_accuracy", (Object) null);
            }
            jSONObject.put("speed", location.getSpeed());
            if (i9 >= 26) {
                jSONObject.put("speed_accuracy", location.getSpeedAccuracyMetersPerSecond());
                return jSONObject;
            }
            jSONObject.put("speed_accuracy", (Object) null);
            return jSONObject;
        } catch (Exception e10) {
            FileLog.e(e10);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity f10 = f();
        if (Build.VERSION.SDK_INT >= 23) {
            if (f10 != null) {
                if (f10.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0 && f10.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean d() {
        if (f() != null && f().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            return true;
        }
        return false;
    }

    public final Activity f() {
        Activity activity = LaunchActivity.C1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(this.f18149a);
        }
        if (activity == null) {
            return AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        return activity;
    }

    public final boolean g() {
        if (a() && this.f18152e) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        Activity f10;
        if (Build.VERSION.SDK_INT < 23 || (f10 = f()) == null) {
            return false;
        }
        if (f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        return true;
    }

    public final void j(final org.telegram.ui.web.r rVar) {
        Activity f10 = f();
        if (f10 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            rVar.run(bool, bool);
        } else if (a() && (this.d || this.f18152e)) {
            rVar.run(Boolean.FALSE, Boolean.TRUE);
        } else {
            final boolean[] zArr = new boolean[1];
            int i9 = this.f18150b;
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(this.f18151c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f10, 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.P = replaceTags;
            t0 t0Var = new t0(this.f18149a, UserConfig.getInstance(i9).getCurrentUser(), user);
            int w02 = f6.w0(null, f6.L5, false);
            c2Var.X = t0Var;
            c2Var.Y = w02;
            if (!a() && i()) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new androidx.car.app.utils.a(f10, zArr, rVar, 12));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.b2(this) {
                    public final u0 f18070b;

                    {
                        this.f18070b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i10) {
                        switch (r4) {
                            case 0:
                                u0 u0Var = this.f18070b;
                                u0Var.getClass();
                                zArr[0] = true;
                                boolean a2 = u0Var.a();
                                org.telegram.ui.web.r rVar2 = rVar;
                                if (!a2) {
                                    kd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new fh.f1(17, u0Var, rVar2));
                                    return;
                                }
                                u0Var.d = true;
                                u0Var.f18152e = true;
                                u0Var.l();
                                Iterator it = u0Var.f18153f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                rVar2.run(bool2, bool2);
                                return;
                            default:
                                u0 u0Var2 = this.f18070b;
                                u0Var2.getClass();
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    zArr2[0] = true;
                                    u0Var2.d = true;
                                    u0Var2.f18152e = false;
                                    u0Var2.l();
                                    Iterator it2 = u0Var2.f18153f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    rVar.run(Boolean.TRUE, Boolean.FALSE);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.b2(this) {
                public final u0 f18070b;

                {
                    this.f18070b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i10) {
                    switch (r4) {
                        case 0:
                            u0 u0Var = this.f18070b;
                            u0Var.getClass();
                            zArr[0] = true;
                            boolean a2 = u0Var.a();
                            org.telegram.ui.web.r rVar2 = rVar;
                            if (!a2) {
                                kd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new fh.f1(17, u0Var, rVar2));
                                return;
                            }
                            u0Var.d = true;
                            u0Var.f18152e = true;
                            u0Var.l();
                            Iterator it = u0Var.f18153f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            rVar2.run(bool2, bool2);
                            return;
                        default:
                            u0 u0Var2 = this.f18070b;
                            u0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                u0Var2.d = true;
                                u0Var2.f18152e = false;
                                u0Var2.l();
                                Iterator it2 = u0Var2.f18153f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                rVar.run(Boolean.TRUE, Boolean.FALSE);
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.j(new fh.j(this, zArr, rVar, 2));
            alertDialog$Builder.o();
        }
    }

    public final void k(Utilities.Callback callback) {
        JSONObject jSONObject = new JSONObject();
        if (this.f18152e && a() && d()) {
            LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
            List<String> providers = locationManager.getProviders(true);
            Location location = null;
            for (int size = providers.size() - 1; size >= 0; size--) {
                location = locationManager.getLastKnownLocation(providers.get(size));
                if (location != null) {
                    break;
                }
            }
            if (location == null && !locationManager.isProviderEnabled("gps")) {
                Context context = LaunchActivity.C1;
                if (context == null) {
                    context = ApplicationLoader.applicationContext;
                }
                if (context != null) {
                    try {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.m(R.raw.permission_request_location, 72, f6.w0(null, f6.L5, false), null);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new rc(context, 1));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.o();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                callback.run(h(null));
                return;
            } else if (location != null) {
                callback.run(h(location));
                return;
            } else {
                try {
                    s0 s0Var = new s0(this, locationManager, r0, callback);
                    LocationListener[] locationListenerArr = {s0Var};
                    locationManager.requestLocationUpdates("gps", 1L, 0.0f, s0Var);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    callback.run(h(null));
                    return;
                }
            }
        }
        try {
            jSONObject.put("available", false);
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        callback.run(jSONObject);
    }

    public final void l() {
        SharedPreferences.Editor edit = this.f18149a.getSharedPreferences("botlocation_" + this.f18150b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f18151c;
        edit.putBoolean(aa.d.q(sb2, j10, "_granted"), this.f18152e);
        edit.putBoolean(j10 + "_requested", this.d);
        edit.apply();
    }

    public final void m(boolean z10, final ys0 ys0Var) {
        this.d = true;
        if (z10 && !a()) {
            Activity f10 = f();
            if (f10 == null) {
                return;
            }
            int i9 = this.f18150b;
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(this.f18151c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f(), 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.P = replaceTags;
            t0 t0Var = new t0(this.f18149a, UserConfig.getInstance(i9).getCurrentUser(), user);
            int w02 = f6.w0(null, f6.L5, false);
            c2Var.X = t0Var;
            c2Var.Y = w02;
            if (i()) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new p0(f10, 0));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.b2(this) {
                    public final u0 f18049b;

                    {
                        this.f18049b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i10) {
                        switch (r3) {
                            case 0:
                                u0 u0Var = this.f18049b;
                                if (!u0Var.a()) {
                                    kd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new fh.f1(18, u0Var, ys0Var));
                                    return;
                                }
                                u0Var.d = true;
                                u0Var.f18152e = true;
                                u0Var.l();
                                Iterator it = u0Var.f18153f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            default:
                                u0 u0Var2 = this.f18049b;
                                u0Var2.d = true;
                                u0Var2.f18152e = false;
                                u0Var2.l();
                                Iterator it2 = u0Var2.f18153f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                Runnable runnable = ys0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.b2(this) {
                public final u0 f18049b;

                {
                    this.f18049b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i10) {
                    switch (r3) {
                        case 0:
                            u0 u0Var = this.f18049b;
                            if (!u0Var.a()) {
                                kd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new fh.f1(18, u0Var, ys0Var));
                                return;
                            }
                            u0Var.d = true;
                            u0Var.f18152e = true;
                            u0Var.l();
                            Iterator it = u0Var.f18153f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            return;
                        default:
                            u0 u0Var2 = this.f18049b;
                            u0Var2.d = true;
                            u0Var2.f18152e = false;
                            u0Var2.l();
                            Iterator it2 = u0Var2.f18153f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            Runnable runnable = ys0Var;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
        } else {
            this.f18152e = z10;
            Iterator it = this.f18153f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (ys0Var != null) {
                ys0Var.run();
            }
        }
        l();
    }
}
