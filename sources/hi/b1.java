package hi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import fi.nc;
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
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fy0;
public final class b1 {
    public static final HashMap f12884g = new HashMap();
    public final Context f12885a;
    public final int f12886b;
    public final long f12887c;
    public boolean d;
    public boolean e;
    public final HashSet f12888f;

    public b1(Context context, int i10, long j10) {
        HashSet hashSet = new HashSet();
        this.f12888f = hashSet;
        this.f12885a = context;
        this.f12886b = i10;
        this.f12887c = j10;
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
        f12884g.clear();
    }

    public static b1 e(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = f12884g;
        b1 b1Var = (b1) hashMap.get(pair);
        if (b1Var == null) {
            b1 b1Var2 = new b1(context, i10, j10);
            hashMap.put(pair, b1Var2);
            return b1Var2;
        }
        return b1Var;
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
            activity = AndroidUtilities.findActivity(this.f12885a);
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
            int i10 = this.f12886b;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.f12887c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f10, 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
            e2Var.T = replaceTags;
            a1 a1Var = new a1(this.f12885a, UserConfig.getInstance(i10).getCurrentUser(), user);
            int i11 = y6.L5;
            int x02 = y6.x0(null, i11, false);
            e2Var.f22557b0 = a1Var;
            e2Var.f22560c0 = x02;
            e2Var.f22562d0 = -1;
            alertDialog$Builder.n(i11, null);
            if (!a() && (f7 = f()) != null && (!f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || !f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new androidx.car.app.utils.a(f10, zArr, rVar, 8));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.b2(this) {
                    public final b1 f13354b;

                    {
                        this.f13354b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i12) {
                        switch (r4) {
                            case 0:
                                b1 b1Var = this.f13354b;
                                b1Var.getClass();
                                zArr[0] = true;
                                boolean a2 = b1Var.a();
                                org.telegram.ui.web.r rVar2 = rVar;
                                if (!a2) {
                                    xe0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.n1(17, b1Var, rVar2));
                                    return;
                                }
                                b1Var.d = true;
                                b1Var.e = true;
                                b1Var.k();
                                Iterator it = b1Var.f12888f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                rVar2.run(bool2, bool2);
                                return;
                            default:
                                b1 b1Var2 = this.f13354b;
                                b1Var2.getClass();
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    zArr2[0] = true;
                                    b1Var2.d = true;
                                    b1Var2.e = false;
                                    b1Var2.k();
                                    Iterator it2 = b1Var2.f12888f.iterator();
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
                public final b1 f13354b;

                {
                    this.f13354b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i12) {
                    switch (r4) {
                        case 0:
                            b1 b1Var = this.f13354b;
                            b1Var.getClass();
                            zArr[0] = true;
                            boolean a2 = b1Var.a();
                            org.telegram.ui.web.r rVar2 = rVar;
                            if (!a2) {
                                xe0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.n1(17, b1Var, rVar2));
                                return;
                            }
                            b1Var.d = true;
                            b1Var.e = true;
                            b1Var.k();
                            Iterator it = b1Var.f12888f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            rVar2.run(bool2, bool2);
                            return;
                        default:
                            b1 b1Var2 = this.f13354b;
                            b1Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                b1Var2.d = true;
                                b1Var2.e = false;
                                b1Var2.k();
                                Iterator it2 = b1Var2.f12888f.iterator();
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
            alertDialog$Builder.j(new y0(this, zArr, rVar, 0));
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
                        int i11 = y6.L5;
                        alertDialog$Builder.m(i10, 72, y6.x0(null, i11, false), null);
                        alertDialog$Builder.n(i11, null);
                        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new nc(context, 1));
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
                    z0 z0Var = new z0(this, locationManager, r0, callback);
                    LocationListener[] locationListenerArr = {z0Var};
                    locationManager.requestLocationUpdates("gps", 1L, 0.0f, z0Var);
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
        SharedPreferences.Editor edit = this.f12885a.getSharedPreferences("botlocation_" + this.f12886b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f12887c;
        edit.putBoolean(a1.g.r(sb2, j10, "_granted"), this.e);
        edit.putBoolean(j10 + "_requested", this.d);
        edit.apply();
    }

    public final void l(boolean z10, final fy0 fy0Var) {
        this.d = true;
        if (z10 && !a()) {
            Activity f7 = f();
            if (f7 == null) {
                return;
            }
            int i10 = this.f12886b;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.f12887c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f(), 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
            e2Var.T = replaceTags;
            a1 a1Var = new a1(this.f12885a, UserConfig.getInstance(i10).getCurrentUser(), user);
            int i11 = y6.L5;
            int x02 = y6.x0(null, i11, false);
            e2Var.f22557b0 = a1Var;
            e2Var.f22560c0 = x02;
            e2Var.f22562d0 = -1;
            alertDialog$Builder.n(i11, null);
            Activity f10 = f();
            if (f10 == null || (f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.b2(this) {
                    public final b1 f13343b;

                    {
                        this.f13343b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i12) {
                        switch (r3) {
                            case 0:
                                b1 b1Var = this.f13343b;
                                if (!b1Var.a()) {
                                    xe0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.n1(18, b1Var, fy0Var));
                                    return;
                                }
                                b1Var.d = true;
                                b1Var.e = true;
                                b1Var.k();
                                Iterator it = b1Var.f12888f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            default:
                                b1 b1Var2 = this.f13343b;
                                b1Var2.d = true;
                                b1Var2.e = false;
                                b1Var2.k();
                                Iterator it2 = b1Var2.f12888f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                Runnable runnable = fy0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new v0(f7, 0));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.b2(this) {
                public final b1 f13343b;

                {
                    this.f13343b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i12) {
                    switch (r3) {
                        case 0:
                            b1 b1Var = this.f13343b;
                            if (!b1Var.a()) {
                                xe0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.n1(18, b1Var, fy0Var));
                                return;
                            }
                            b1Var.d = true;
                            b1Var.e = true;
                            b1Var.k();
                            Iterator it = b1Var.f12888f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            return;
                        default:
                            b1 b1Var2 = this.f13343b;
                            b1Var2.d = true;
                            b1Var2.e = false;
                            b1Var2.k();
                            Iterator it2 = b1Var2.f12888f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            Runnable runnable = fy0Var;
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
            Iterator it = this.f12888f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (fy0Var != null) {
                fy0Var.run();
            }
        }
        k();
    }
}
