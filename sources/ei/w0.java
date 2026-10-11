package ei;

import ai.r5;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import ci.id;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tt0;
public final class w0 {
    public static final HashMap f9450g = new HashMap();
    public final Context f9451a;
    public final int f9452b;
    public final long f9453c;
    public boolean d;
    public boolean f9454e;
    public final HashSet f9455f;

    public w0(Context context, int i10, long j3) {
        HashSet hashSet = new HashSet();
        this.f9455f = hashSet;
        this.f9451a = context;
        this.f9452b = i10;
        this.f9453c = j3;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i10, 0);
        this.d = sharedPreferences.getBoolean(j3 + "_requested", false);
        boolean z10 = sharedPreferences.getBoolean(j3 + "_granted", false);
        this.f9454e = z10;
        if (z10 && !a()) {
            this.f9454e = false;
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
        f9450g.clear();
    }

    public static w0 e(Context context, int i10, long j3) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j3));
        HashMap hashMap = f9450g;
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
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(this.f9451a);
        }
        if (activity == null) {
            return AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        return activity;
    }

    public final boolean g() {
        if (a() && this.f9454e) {
            return true;
        }
        return false;
    }

    public final void i(final org.telegram.ui.web.q qVar) {
        Activity f7;
        Activity f10 = f();
        if (f10 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            qVar.run(bool, bool);
        } else if (a() && (this.d || this.f9454e)) {
            qVar.run(Boolean.FALSE, Boolean.TRUE);
        } else {
            final boolean[] zArr = new boolean[1];
            int i10 = this.f9452b;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.f9453c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f10, 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
            a2Var.T = replaceTags;
            v0 v0Var = new v0(this.f9451a, UserConfig.getInstance(i10).getCurrentUser(), user);
            int x02 = h6.x0(null, h6.L5, false);
            a2Var.f20417b0 = v0Var;
            a2Var.f20420c0 = x02;
            if (!a() && (f7 = f()) != null && (!f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || !f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new r5(f10, zArr, qVar, 7));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.z1(this) {
                    public final w0 f9341b;

                    {
                        this.f9341b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i11) {
                        switch (r4) {
                            case 0:
                                w0 w0Var = this.f9341b;
                                w0Var.getClass();
                                zArr[0] = true;
                                boolean a2 = w0Var.a();
                                org.telegram.ui.web.q qVar2 = qVar;
                                if (!a2) {
                                    ff0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.h3(9, w0Var, qVar2));
                                    return;
                                }
                                w0Var.d = true;
                                w0Var.f9454e = true;
                                w0Var.k();
                                Iterator it = w0Var.f9455f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                qVar2.run(bool2, bool2);
                                return;
                            default:
                                w0 w0Var2 = this.f9341b;
                                w0Var2.getClass();
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    zArr2[0] = true;
                                    w0Var2.d = true;
                                    w0Var2.f9454e = false;
                                    w0Var2.k();
                                    Iterator it2 = w0Var2.f9455f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    qVar.run(Boolean.TRUE, Boolean.FALSE);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.z1(this) {
                public final w0 f9341b;

                {
                    this.f9341b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i11) {
                    switch (r4) {
                        case 0:
                            w0 w0Var = this.f9341b;
                            w0Var.getClass();
                            zArr[0] = true;
                            boolean a2 = w0Var.a();
                            org.telegram.ui.web.q qVar2 = qVar;
                            if (!a2) {
                                ff0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.h3(9, w0Var, qVar2));
                                return;
                            }
                            w0Var.d = true;
                            w0Var.f9454e = true;
                            w0Var.k();
                            Iterator it = w0Var.f9455f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            qVar2.run(bool2, bool2);
                            return;
                        default:
                            w0 w0Var2 = this.f9341b;
                            w0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                w0Var2.d = true;
                                w0Var2.f9454e = false;
                                w0Var2.k();
                                Iterator it2 = w0Var2.f9455f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                qVar.run(Boolean.TRUE, Boolean.FALSE);
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.j(new t0(this, zArr, qVar, 0));
            alertDialog$Builder.o();
        }
    }

    public final void j(Utilities.Callback callback) {
        JSONObject jSONObject = new JSONObject();
        if (this.f9454e && a() && d()) {
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
                        alertDialog$Builder.m(R.raw.permission_request_location, 72, h6.x0(null, h6.L5, false), null);
                        alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new id(context, 1));
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

    public final void k() {
        SharedPreferences.Editor edit = this.f9451a.getSharedPreferences("botlocation_" + this.f9452b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j3 = this.f9453c;
        edit.putBoolean(a1.g.s(sb2, j3, "_granted"), this.f9454e);
        edit.putBoolean(j3 + "_requested", this.d);
        edit.apply();
    }

    public final void l(boolean z10, final tt0 tt0Var) {
        this.d = true;
        if (z10 && !a()) {
            Activity f7 = f();
            if (f7 == null) {
                return;
            }
            int i10 = this.f9452b;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.f9453c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f(), 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
            a2Var.T = replaceTags;
            v0 v0Var = new v0(this.f9451a, UserConfig.getInstance(i10).getCurrentUser(), user);
            int x02 = h6.x0(null, h6.L5, false);
            a2Var.f20417b0 = v0Var;
            a2Var.f20420c0 = x02;
            Activity f10 = f();
            if (f10 == null || (f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.z1(this) {
                    public final w0 f9324b;

                    {
                        this.f9324b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i11) {
                        switch (r3) {
                            case 0:
                                w0 w0Var = this.f9324b;
                                if (!w0Var.a()) {
                                    ff0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.h3(10, w0Var, tt0Var));
                                    return;
                                }
                                w0Var.d = true;
                                w0Var.f9454e = true;
                                w0Var.k();
                                Iterator it = w0Var.f9455f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            default:
                                w0 w0Var2 = this.f9324b;
                                w0Var2.d = true;
                                w0Var2.f9454e = false;
                                w0Var2.k();
                                Iterator it2 = w0Var2.f9455f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                Runnable runnable = tt0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new q0(f7, 0));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.z1(this) {
                public final w0 f9324b;

                {
                    this.f9324b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i11) {
                    switch (r3) {
                        case 0:
                            w0 w0Var = this.f9324b;
                            if (!w0Var.a()) {
                                ff0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.h3(10, w0Var, tt0Var));
                                return;
                            }
                            w0Var.d = true;
                            w0Var.f9454e = true;
                            w0Var.k();
                            Iterator it = w0Var.f9455f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            return;
                        default:
                            w0 w0Var2 = this.f9324b;
                            w0Var2.d = true;
                            w0Var2.f9454e = false;
                            w0Var2.k();
                            Iterator it2 = w0Var2.f9455f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            Runnable runnable = tt0Var;
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
            this.f9454e = z10;
            Iterator it = this.f9455f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (tt0Var != null) {
                tt0Var.run();
            }
        }
        k();
    }
}
