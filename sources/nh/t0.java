package nh;

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
import lh.nc;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zs0;

public final class t0 {

    public static final HashMap f18963g = new HashMap();

    public final Context f18964a;

    public final int f18965b;

    public final long f18966c;
    public boolean d;

    public boolean f18967e;

    public final HashSet f18968f;

    public t0(Context context, int i10, long j10) {
        HashSet hashSet = new HashSet();
        this.f18968f = hashSet;
        this.f18964a = context;
        this.f18965b = i10;
        this.f18966c = j10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i10, 0);
        this.d = sharedPreferences.getBoolean(j10 + "_requested", false);
        boolean z10 = sharedPreferences.getBoolean(j10 + "_granted", false);
        this.f18967e = z10;
        if (!z10 || a()) {
            return;
        }
        this.f18967e = false;
        this.d = false;
        l();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public static void c() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("botlocation_" + i10, 0).edit().clear().apply();
        }
        f18963g.clear();
    }

    public static t0 e(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap map = f18963g;
        t0 t0Var = (t0) map.get(pair);
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0(context, i10, j10);
        map.put(pair, t0Var2);
        return t0Var2;
    }

    public static JSONObject h(Location location) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("available", location != null);
            if (location == null) {
                return jSONObject;
            }
            jSONObject.put("latitude", location.getLatitude());
            jSONObject.put("longitude", location.getLongitude());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                jSONObject.put("horizontal_accuracy", location.getAccuracy());
            } else {
                jSONObject.put("horizontal_accuracy", (Object) null);
            }
            jSONObject.put("altitude", location.getAltitude());
            if (i10 >= 26) {
                jSONObject.put("vertical_accuracy", location.getVerticalAccuracyMeters());
            } else {
                jSONObject.put("vertical_accuracy", (Object) null);
            }
            jSONObject.put("course", location.getBearing());
            if (i10 >= 26) {
                jSONObject.put("course_accuracy", location.getBearingAccuracyDegrees());
            } else {
                jSONObject.put("course_accuracy", (Object) null);
            }
            jSONObject.put("speed", location.getSpeed());
            if (i10 >= 26) {
                jSONObject.put("speed_accuracy", location.getSpeedAccuracyMetersPerSecond());
                return jSONObject;
            }
            jSONObject.put("speed_accuracy", (Object) null);
            return jSONObject;
        } catch (Exception e9) {
            FileLog.e(e9);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity activityF = f();
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (activityF != null) {
            return activityF.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || activityF.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        }
        return false;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean d() {
        return f() != null && f().getPackageManager().hasSystemFeature("android.hardware.location.gps");
    }

    public final Activity f() {
        Activity activityFindActivity = LaunchActivity.C1;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(this.f18964a);
        }
        return activityFindActivity == null ? AndroidUtilities.findActivity(ApplicationLoader.applicationContext) : activityFindActivity;
    }

    public final boolean g() {
        return a() && this.f18967e;
    }

    public final boolean i() {
        Activity activityF;
        if (Build.VERSION.SDK_INT >= 23 && (activityF = f()) != null) {
            return (activityF.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && activityF.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) ? false : true;
        }
        return false;
    }

    public final void j(final org.telegram.ui.web.s sVar) {
        Activity activityF = f();
        if (activityF == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            sVar.run(bool, bool);
            return;
        }
        if (a() && (this.d || this.f18967e)) {
            sVar.run(Boolean.FALSE, Boolean.TRUE);
            return;
        }
        final int i10 = 1;
        final boolean[] zArr = new boolean[1];
        int i11 = this.f18965b;
        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.f18966c));
        final int i12 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activityF, 0, null);
        int i13 = 2;
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.P = spannableStringBuilderReplaceTags;
        s0 s0Var = new s0(this.f18964a, UserConfig.getInstance(i11).getCurrentUser(), user);
        int iW0 = g6.w0(null, g6.L5, false);
        b2Var.X = s0Var;
        b2Var.Y = iW0;
        if (a() || !i()) {
            alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.a2(this) {

                public final t0 f18896b;

                {
                    this.f18896b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i14) {
                    switch (i12) {
                        case 0:
                            t0 t0Var = this.f18896b;
                            t0Var.getClass();
                            zArr[0] = true;
                            boolean zA = t0Var.a();
                            org.telegram.ui.web.s sVar2 = sVar;
                            if (!zA) {
                                pd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new gh.d1(17, t0Var, sVar2));
                            } else {
                                t0Var.d = true;
                                t0Var.f18967e = true;
                                t0Var.l();
                                Iterator it = t0Var.f18968f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                sVar2.run(bool2, bool2);
                            }
                            break;
                        default:
                            t0 t0Var2 = this.f18896b;
                            t0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                t0Var2.d = true;
                                t0Var2.f18967e = false;
                                t0Var2.l();
                                Iterator it2 = t0Var2.f18968f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                sVar.run(Boolean.TRUE, Boolean.FALSE);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new ag.l0(activityF, zArr, sVar, 13));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.a2(this) {

            public final t0 f18896b;

            {
                this.f18896b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i14) {
                switch (i10) {
                    case 0:
                        t0 t0Var = this.f18896b;
                        t0Var.getClass();
                        zArr[0] = true;
                        boolean zA = t0Var.a();
                        org.telegram.ui.web.s sVar2 = sVar;
                        if (!zA) {
                            pd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new gh.d1(17, t0Var, sVar2));
                        } else {
                            t0Var.d = true;
                            t0Var.f18967e = true;
                            t0Var.l();
                            Iterator it = t0Var.f18968f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            sVar2.run(bool2, bool2);
                        }
                        break;
                    default:
                        t0 t0Var2 = this.f18896b;
                        t0Var2.getClass();
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            t0Var2.d = true;
                            t0Var2.f18967e = false;
                            t0Var2.l();
                            Iterator it2 = t0Var2.f18968f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            sVar.run(Boolean.TRUE, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        alertDialog$Builder.j(new gh.j(this, zArr, sVar, i13));
        alertDialog$Builder.o();
    }

    public final void k(Utilities.Callback callback) {
        JSONObject jSONObject = new JSONObject();
        if (!this.f18967e || !a() || !d()) {
            try {
                jSONObject.put("available", false);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            callback.run(jSONObject);
            return;
        }
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        List<String> providers = locationManager.getProviders(true);
        Location lastKnownLocation = null;
        for (int size = providers.size() - 1; size >= 0; size--) {
            lastKnownLocation = locationManager.getLastKnownLocation(providers.get(size));
            if (lastKnownLocation != null) {
                break;
            }
        }
        if (lastKnownLocation != null || locationManager.isProviderEnabled("gps")) {
            if (lastKnownLocation != null) {
                callback.run(h(lastKnownLocation));
                return;
            }
            try {
                r0 r0Var = new r0(this, locationManager, new LocationListener[]{r0Var}, callback);
                locationManager.requestLocationUpdates("gps", 1L, 0.0f, r0Var);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                callback.run(h(null));
                return;
            }
        }
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            try {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.m(R.raw.permission_request_location, 72, g6.w0(null, g6.L5, false), null);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new nc(context, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.o();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        callback.run(h(null));
    }

    public final void l() {
        SharedPreferences.Editor editorEdit = this.f18964a.getSharedPreferences("botlocation_" + this.f18965b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f18966c;
        editorEdit.putBoolean(a9.p.o(sb2, j10, "_granted"), this.f18967e);
        editorEdit.putBoolean(j10 + "_requested", this.d);
        editorEdit.apply();
    }

    public final void m(boolean z10, final zs0 zs0Var) {
        final int i10 = 1;
        this.d = true;
        if (!z10 || a()) {
            this.f18967e = z10;
            Iterator it = this.f18968f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (zs0Var != null) {
                zs0Var.run();
            }
        } else {
            Activity activityF = f();
            if (activityF == null) {
                return;
            }
            int i11 = this.f18965b;
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.f18966c));
            final int i12 = 0;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f(), 0, null);
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.P = spannableStringBuilderReplaceTags;
            s0 s0Var = new s0(this.f18964a, UserConfig.getInstance(i11).getCurrentUser(), user);
            int iW0 = g6.w0(null, g6.L5, false);
            b2Var.X = s0Var;
            b2Var.Y = iW0;
            if (i()) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new o0(activityF, i12));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.a2(this) {

                    public final t0 f18865b;

                    {
                        this.f18865b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
                        switch (i12) {
                            case 0:
                                t0 t0Var = this.f18865b;
                                if (!t0Var.a()) {
                                    pd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new gh.d1(18, t0Var, zs0Var));
                                } else {
                                    t0Var.d = true;
                                    t0Var.f18967e = true;
                                    t0Var.l();
                                    Iterator it2 = t0Var.f18968f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                }
                                break;
                            default:
                                t0 t0Var2 = this.f18865b;
                                t0Var2.d = true;
                                t0Var2.f18967e = false;
                                t0Var2.l();
                                Iterator it3 = t0Var2.f18968f.iterator();
                                while (it3.hasNext()) {
                                    ((Runnable) it3.next()).run();
                                }
                                Runnable runnable = zs0Var;
                                if (runnable != null) {
                                    runnable.run();
                                }
                                break;
                        }
                    }
                });
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.a2(this) {

                public final t0 f18865b;

                {
                    this.f18865b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
                    switch (i10) {
                        case 0:
                            t0 t0Var = this.f18865b;
                            if (!t0Var.a()) {
                                pd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new gh.d1(18, t0Var, zs0Var));
                            } else {
                                t0Var.d = true;
                                t0Var.f18967e = true;
                                t0Var.l();
                                Iterator it2 = t0Var.f18968f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                            }
                            break;
                        default:
                            t0 t0Var2 = this.f18865b;
                            t0Var2.d = true;
                            t0Var2.f18967e = false;
                            t0Var2.l();
                            Iterator it3 = t0Var2.f18968f.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                            Runnable runnable = zs0Var;
                            if (runnable != null) {
                                runnable.run();
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        l();
    }
}
