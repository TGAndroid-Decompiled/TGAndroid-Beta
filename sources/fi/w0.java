package fi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import di.ld;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.de0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rx0;
public final class w0 {
    public static final HashMap f10051g = new HashMap();
    public final Context f10052a;
    public final int f10053b;
    public final long f10054c;
    public boolean d;
    public boolean f10055e;
    public final HashSet f10056f;

    public w0(Context context, int i10, long j3) {
        HashSet hashSet = new HashSet();
        this.f10056f = hashSet;
        this.f10052a = context;
        this.f10053b = i10;
        this.f10054c = j3;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i10, 0);
        this.d = sharedPreferences.getBoolean(j3 + "_requested", false);
        boolean z10 = sharedPreferences.getBoolean(j3 + "_granted", false);
        this.f10055e = z10;
        if (z10 && !a()) {
            this.f10055e = false;
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
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("botlocation_" + i10, 0).edit().clear().apply();
        }
        f10051g.clear();
    }

    public static w0 e(Context context, int i10, long j3) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j3));
        HashMap hashMap = f10051g;
        w0 w0Var = (w0) hashMap.get(pair);
        if (w0Var == null) {
            w0 w0Var2 = new w0(context, i10, j3);
            hashMap.put(pair, w0Var2);
            return w0Var2;
        }
        return w0Var;
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
        } catch (Exception e7) {
            FileLog.e(e7);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity f7 = f();
        if (Build.VERSION.SDK_INT >= 23) {
            if (f7 != null) {
                if (f7.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0 && f7.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
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
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(this.f10052a);
        }
        if (activity == null) {
            return AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        return activity;
    }

    public final boolean g() {
        if (a() && this.f10055e) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        Activity f7;
        if (Build.VERSION.SDK_INT < 23 || (f7 = f()) == null) {
            return false;
        }
        if (f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        return true;
    }

    public final void j(final org.telegram.ui.web.s sVar) {
        Activity f7 = f();
        if (f7 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            sVar.run(bool, bool);
        } else if (a() && (this.d || this.f10055e)) {
            sVar.run(Boolean.FALSE, Boolean.TRUE);
        } else {
            final boolean[] zArr = new boolean[1];
            int i10 = this.f10053b;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.f10054c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f7, 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
            b2Var.T = replaceTags;
            v0 v0Var = new v0(this.f10052a, UserConfig.getInstance(i10).getCurrentUser(), user);
            int w02 = j6.w0(null, j6.L5, false);
            b2Var.f20228b0 = v0Var;
            b2Var.f20231c0 = w02;
            if (!a() && i()) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new androidx.car.app.utils.a(f7, zArr, sVar, 7));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.a2(this) {
                    public final w0 f9947b;

                    {
                        this.f9947b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                        switch (r4) {
                            case 0:
                                w0 w0Var = this.f9947b;
                                w0Var.getClass();
                                zArr[0] = true;
                                boolean a2 = w0Var.a();
                                org.telegram.ui.web.s sVar2 = sVar;
                                if (!a2) {
                                    de0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new di.m2(8, w0Var, sVar2));
                                    return;
                                }
                                w0Var.d = true;
                                w0Var.f10055e = true;
                                w0Var.l();
                                Iterator it = w0Var.f10056f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                sVar2.run(bool2, bool2);
                                return;
                            default:
                                w0 w0Var2 = this.f9947b;
                                w0Var2.getClass();
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    zArr2[0] = true;
                                    w0Var2.d = true;
                                    w0Var2.f10055e = false;
                                    w0Var2.l();
                                    Iterator it2 = w0Var2.f10056f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    sVar.run(Boolean.TRUE, Boolean.FALSE);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.a2(this) {
                public final w0 f9947b;

                {
                    this.f9947b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                    switch (r4) {
                        case 0:
                            w0 w0Var = this.f9947b;
                            w0Var.getClass();
                            zArr[0] = true;
                            boolean a2 = w0Var.a();
                            org.telegram.ui.web.s sVar2 = sVar;
                            if (!a2) {
                                de0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new di.m2(8, w0Var, sVar2));
                                return;
                            }
                            w0Var.d = true;
                            w0Var.f10055e = true;
                            w0Var.l();
                            Iterator it = w0Var.f10056f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            sVar2.run(bool2, bool2);
                            return;
                        default:
                            w0 w0Var2 = this.f9947b;
                            w0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                w0Var2.d = true;
                                w0Var2.f10055e = false;
                                w0Var2.l();
                                Iterator it2 = w0Var2.f10056f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                sVar.run(Boolean.TRUE, Boolean.FALSE);
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.j(new t0(this, zArr, sVar, 0));
            alertDialog$Builder.o();
        }
    }

    public final void k(Utilities.Callback callback) {
        JSONObject jSONObject = new JSONObject();
        if (this.f10055e && a() && d()) {
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
                Context context = LaunchActivity.G1;
                if (context == null) {
                    context = ApplicationLoader.applicationContext;
                }
                if (context != null) {
                    try {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.m(R.raw.permission_request_location, 72, j6.w0(null, j6.L5, false), null);
                        alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ld(context, 1));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.o();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                callback.run(h(null));
                return;
            } else if (location != null) {
                callback.run(h(location));
                return;
            } else {
                try {
                    u0 u0Var = new u0(this, locationManager, r0, callback);
                    LocationListener[] locationListenerArr = {u0Var};
                    locationManager.requestLocationUpdates("gps", 1L, 0.0f, u0Var);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    callback.run(h(null));
                    return;
                }
            }
        }
        try {
            jSONObject.put("available", false);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        callback.run(jSONObject);
    }

    public final void l() {
        SharedPreferences.Editor edit = this.f10052a.getSharedPreferences("botlocation_" + this.f10053b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j3 = this.f10054c;
        edit.putBoolean(a4.a.r(sb2, j3, "_granted"), this.f10055e);
        edit.putBoolean(j3 + "_requested", this.d);
        edit.apply();
    }

    public final void m(boolean z10, final rx0 rx0Var) {
        this.d = true;
        if (z10 && !a()) {
            Activity f7 = f();
            if (f7 == null) {
                return;
            }
            int i10 = this.f10053b;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.f10054c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f(), 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
            b2Var.T = replaceTags;
            v0 v0Var = new v0(this.f10052a, UserConfig.getInstance(i10).getCurrentUser(), user);
            int w02 = j6.w0(null, j6.L5, false);
            b2Var.f20228b0 = v0Var;
            b2Var.f20231c0 = w02;
            if (i()) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new q0(f7, 0));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.a2(this) {
                    public final w0 f9918b;

                    {
                        this.f9918b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                        switch (r3) {
                            case 0:
                                w0 w0Var = this.f9918b;
                                if (!w0Var.a()) {
                                    de0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new di.m2(9, w0Var, rx0Var));
                                    return;
                                }
                                w0Var.d = true;
                                w0Var.f10055e = true;
                                w0Var.l();
                                Iterator it = w0Var.f10056f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            default:
                                w0 w0Var2 = this.f9918b;
                                w0Var2.d = true;
                                w0Var2.f10055e = false;
                                w0Var2.l();
                                Iterator it2 = w0Var2.f10056f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                Runnable runnable = rx0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.a2(this) {
                public final w0 f9918b;

                {
                    this.f9918b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                    switch (r3) {
                        case 0:
                            w0 w0Var = this.f9918b;
                            if (!w0Var.a()) {
                                de0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new di.m2(9, w0Var, rx0Var));
                                return;
                            }
                            w0Var.d = true;
                            w0Var.f10055e = true;
                            w0Var.l();
                            Iterator it = w0Var.f10056f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            return;
                        default:
                            w0 w0Var2 = this.f9918b;
                            w0Var2.d = true;
                            w0Var2.f10055e = false;
                            w0Var2.l();
                            Iterator it2 = w0Var2.f10056f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            Runnable runnable = rx0Var;
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
            this.f10055e = z10;
            Iterator it = this.f10056f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (rx0Var != null) {
                rx0Var.run();
            }
        }
        l();
    }
}
