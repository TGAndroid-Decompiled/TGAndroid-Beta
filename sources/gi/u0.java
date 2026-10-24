package gi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import ei.rc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lv0;
public final class u0 {
    public static final HashMap f11519g = new HashMap();
    public final Context f11520a;
    public final int f11521b;
    public final long f11522c;
    public boolean d;
    public boolean e;
    public final HashSet f11523f;

    public u0(Context context, int i10, long j10) {
        HashSet hashSet = new HashSet();
        this.f11523f = hashSet;
        this.f11520a = context;
        this.f11521b = i10;
        this.f11522c = j10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i10, 0);
        this.d = sharedPreferences.getBoolean(j10 + "_requested", false);
        boolean z10 = sharedPreferences.getBoolean(j10 + "_granted", false);
        this.e = z10;
        if (z10 && !a()) {
            this.e = false;
            this.d = false;
            k();
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
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("botlocation_" + i10, 0).edit().clear().apply();
        }
        f11519g.clear();
    }

    public static u0 e(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = f11519g;
        u0 u0Var = (u0) hashMap.get(pair);
        if (u0Var == null) {
            u0 u0Var2 = new u0(context, i10, j10);
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
        } catch (Exception e) {
            FileLog.e(e);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity f7 = f();
        if (f7 != null) {
            if (f7.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || f7.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                return true;
            }
            return false;
        }
        return false;
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
        Activity activity = LaunchActivity.I1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(this.f11520a);
        }
        if (activity == null) {
            return AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        return activity;
    }

    public final boolean g() {
        if (a() && this.e) {
            return true;
        }
        return false;
    }

    public final void i(final org.telegram.ui.web.r rVar) {
        Activity f7;
        Activity f10 = f();
        if (f10 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            rVar.run(bool, bool);
        } else if (a() && (this.d || this.e)) {
            rVar.run(Boolean.FALSE, Boolean.TRUE);
        } else {
            final boolean[] zArr = new boolean[1];
            int i10 = this.f11521b;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.f11522c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f10, 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.T = replaceTags;
            t0 t0Var = new t0(this.f11520a, UserConfig.getInstance(i10).getCurrentUser(), user);
            int i11 = k6.L5;
            int x02 = k6.x0(null, i11, false);
            c2Var.f20747b0 = t0Var;
            c2Var.f20750c0 = x02;
            c2Var.f20752d0 = -1;
            alertDialog$Builder.n(i11, null);
            if (!a() && (f7 = f()) != null && (!f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || !f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new ai.u2(f10, zArr, rVar, 8));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.z1(this) {
                    public final u0 f11415b;

                    {
                        this.f11415b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i12) {
                        switch (r4) {
                            case 0:
                                u0 u0Var = this.f11415b;
                                u0Var.getClass();
                                zArr[0] = true;
                                boolean a2 = u0Var.a();
                                org.telegram.ui.web.r rVar2 = rVar;
                                if (!a2) {
                                    ze0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.o2(15, u0Var, rVar2));
                                    return;
                                }
                                u0Var.d = true;
                                u0Var.e = true;
                                u0Var.k();
                                Iterator it = u0Var.f11523f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                rVar2.run(bool2, bool2);
                                return;
                            default:
                                u0 u0Var2 = this.f11415b;
                                u0Var2.getClass();
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    zArr2[0] = true;
                                    u0Var2.d = true;
                                    u0Var2.e = false;
                                    u0Var2.k();
                                    Iterator it2 = u0Var2.f11523f.iterator();
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
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.z1(this) {
                public final u0 f11415b;

                {
                    this.f11415b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i12) {
                    switch (r4) {
                        case 0:
                            u0 u0Var = this.f11415b;
                            u0Var.getClass();
                            zArr[0] = true;
                            boolean a2 = u0Var.a();
                            org.telegram.ui.web.r rVar2 = rVar;
                            if (!a2) {
                                ze0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.o2(15, u0Var, rVar2));
                                return;
                            }
                            u0Var.d = true;
                            u0Var.e = true;
                            u0Var.k();
                            Iterator it = u0Var.f11523f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            rVar2.run(bool2, bool2);
                            return;
                        default:
                            u0 u0Var2 = this.f11415b;
                            u0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                u0Var2.d = true;
                                u0Var2.e = false;
                                u0Var2.k();
                                Iterator it2 = u0Var2.f11523f.iterator();
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
            alertDialog$Builder.j(new r0(this, zArr, rVar, 0));
            alertDialog$Builder.p();
        }
    }

    public final void j(Utilities.Callback callback) {
        JSONObject jSONObject = new JSONObject();
        if (this.e && a() && d()) {
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
                Context context = LaunchActivity.I1;
                if (context == null) {
                    context = ApplicationLoader.applicationContext;
                }
                if (context != null) {
                    try {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        int i10 = R.raw.permission_request_location;
                        int i11 = k6.L5;
                        alertDialog$Builder.m(i10, 72, k6.x0(null, i11, false), null);
                        alertDialog$Builder.n(i11, null);
                        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new rc(context, 1));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.p();
                    } catch (Exception e) {
                        FileLog.e(e);
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    callback.run(h(null));
                    return;
                }
            }
        }
        try {
            jSONObject.put("available", false);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        callback.run(jSONObject);
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f11520a.getSharedPreferences("botlocation_" + this.f11521b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f11522c;
        edit.putBoolean(a1.g.r(sb2, j10, "_granted"), this.e);
        edit.putBoolean(j10 + "_requested", this.d);
        edit.apply();
    }

    public final void l(boolean z10, final lv0 lv0Var) {
        this.d = true;
        if (z10 && !a()) {
            Activity f7 = f();
            if (f7 == null) {
                return;
            }
            int i10 = this.f11521b;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.f11522c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f(), 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.T = replaceTags;
            t0 t0Var = new t0(this.f11520a, UserConfig.getInstance(i10).getCurrentUser(), user);
            int i11 = k6.L5;
            int x02 = k6.x0(null, i11, false);
            c2Var.f20747b0 = t0Var;
            c2Var.f20750c0 = x02;
            c2Var.f20752d0 = -1;
            alertDialog$Builder.n(i11, null);
            Activity f10 = f();
            if (f10 == null || (f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.z1(this) {
                    public final u0 f11401b;

                    {
                        this.f11401b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i12) {
                        switch (r3) {
                            case 0:
                                u0 u0Var = this.f11401b;
                                if (!u0Var.a()) {
                                    ze0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.o2(16, u0Var, lv0Var));
                                    return;
                                }
                                u0Var.d = true;
                                u0Var.e = true;
                                u0Var.k();
                                Iterator it = u0Var.f11523f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            default:
                                u0 u0Var2 = this.f11401b;
                                u0Var2.d = true;
                                u0Var2.e = false;
                                u0Var2.k();
                                Iterator it2 = u0Var2.f11523f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                Runnable runnable = lv0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new o0(f7, 0));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.z1(this) {
                public final u0 f11401b;

                {
                    this.f11401b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i12) {
                    switch (r3) {
                        case 0:
                            u0 u0Var = this.f11401b;
                            if (!u0Var.a()) {
                                ze0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.o2(16, u0Var, lv0Var));
                                return;
                            }
                            u0Var.d = true;
                            u0Var.e = true;
                            u0Var.k();
                            Iterator it = u0Var.f11523f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            return;
                        default:
                            u0 u0Var2 = this.f11401b;
                            u0Var2.d = true;
                            u0Var2.e = false;
                            u0Var2.k();
                            Iterator it2 = u0Var2.f11523f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            Runnable runnable = lv0Var;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.p();
        } else {
            this.e = z10;
            Iterator it = this.f11523f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (lv0Var != null) {
                lv0Var.run();
            }
        }
        k();
    }
}
