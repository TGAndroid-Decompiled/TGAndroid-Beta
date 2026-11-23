package ki;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import c8.na;
import hi.nb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tr0;
public final class r0 {
    public static final HashMap f18888g = new HashMap();
    public final Context f18889a;
    public final int f18890b;
    public final long f18891c;
    public boolean d;
    public boolean f18892e;
    public final HashSet f18893f;

    public r0(Context context, int i7, long j3) {
        HashSet hashSet = new HashSet();
        this.f18893f = hashSet;
        this.f18889a = context;
        this.f18890b = i7;
        this.f18891c = j3;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i7, 0);
        this.d = sharedPreferences.getBoolean(j3 + "_requested", false);
        boolean z10 = sharedPreferences.getBoolean(j3 + "_granted", false);
        this.f18892e = z10;
        if (z10 && !a()) {
            this.f18892e = false;
            this.d = false;
            k();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public static void c() {
        Context context = org.telegram.messenger.t0.f26931b;
        if (context == null) {
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            context.getSharedPreferences("botlocation_" + i7, 0).edit().clear().apply();
        }
        f18888g.clear();
    }

    public static r0 e(Context context, int i7, long j3) {
        Pair pair = new Pair(Integer.valueOf(i7), Long.valueOf(j3));
        HashMap hashMap = f18888g;
        r0 r0Var = (r0) hashMap.get(pair);
        if (r0Var == null) {
            r0 r0Var2 = new r0(context, i7, j3);
            hashMap.put(pair, r0Var2);
            return r0Var2;
        }
        return r0Var;
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
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 26) {
                jSONObject.put("horizontal_accuracy", location.getAccuracy());
            } else {
                jSONObject.put("horizontal_accuracy", (Object) null);
            }
            jSONObject.put("altitude", location.getAltitude());
            if (i7 >= 26) {
                jSONObject.put("vertical_accuracy", location.getVerticalAccuracyMeters());
            } else {
                jSONObject.put("vertical_accuracy", (Object) null);
            }
            jSONObject.put("course", location.getBearing());
            if (i7 >= 26) {
                jSONObject.put("course_accuracy", location.getBearingAccuracyDegrees());
            } else {
                jSONObject.put("course_accuracy", (Object) null);
            }
            jSONObject.put("speed", location.getSpeed());
            if (i7 >= 26) {
                jSONObject.put("speed_accuracy", location.getSpeedAccuracyMetersPerSecond());
                return jSONObject;
            }
            jSONObject.put("speed_accuracy", (Object) null);
            return jSONObject;
        } catch (Exception e10) {
            a8.g(e10, true);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity f10 = f();
        if (f10 != null) {
            if (f10.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || f10.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
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
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(this.f18889a);
        }
        if (activity == null) {
            return org.telegram.messenger.g0.W(org.telegram.messenger.t0.f26931b);
        }
        return activity;
    }

    public final boolean g() {
        if (a() && this.f18892e) {
            return true;
        }
        return false;
    }

    public final void i(final org.telegram.ui.web.o oVar) {
        Activity f10;
        Activity f11 = f();
        if (f11 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            oVar.a(bool, bool);
        } else if (a() && (this.d || this.f18892e)) {
            oVar.a(Boolean.FALSE, Boolean.TRUE);
        } else {
            final boolean[] zArr = new boolean[1];
            int i7 = this.f18890b;
            TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(this.f18891c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f11, null);
            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131753045, p10.q(c22), p10.q(c22)));
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.U = W2;
            q0 q0Var = new q0(this.f18889a, k10.i(i7).f(), c22);
            int i10 = m6.L5;
            int x02 = m6.x0(null, i10, false);
            t1Var.f30017c0 = q0Var;
            t1Var.f30019d0 = x02;
            t1Var.f30022e0 = -1;
            alertDialog$Builder.n(i10, null);
            if (!a() && (f10 = f()) != null && (!f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || !f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(hd.N0(2131753041, null), new a3.h(f11, zArr, oVar, 13));
            } else {
                alertDialog$Builder.k(hd.N0(2131753047, null), new org.telegram.ui.ActionBar.q1(this) {
                    public final r0 f18837b;

                    {
                        this.f18837b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                        switch (r4) {
                            case 0:
                                r0 r0Var = this.f18837b;
                                r0Var.getClass();
                                zArr[0] = true;
                                boolean a10 = r0Var.a();
                                org.telegram.ui.web.o oVar2 = oVar;
                                if (!a10) {
                                    na.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.y1(26, r0Var, oVar2));
                                    return;
                                }
                                r0Var.d = true;
                                r0Var.f18892e = true;
                                r0Var.k();
                                Iterator it = r0Var.f18893f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                oVar2.a(bool2, bool2);
                                return;
                            default:
                                r0 r0Var2 = this.f18837b;
                                r0Var2.getClass();
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    zArr2[0] = true;
                                    r0Var2.d = true;
                                    r0Var2.f18892e = false;
                                    r0Var2.k();
                                    Iterator it2 = r0Var2.f18893f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    oVar.a(Boolean.TRUE, Boolean.FALSE);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            alertDialog$Builder.h(hd.N0(2131753046, null), new org.telegram.ui.ActionBar.q1(this) {
                public final r0 f18837b;

                {
                    this.f18837b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                    switch (r4) {
                        case 0:
                            r0 r0Var = this.f18837b;
                            r0Var.getClass();
                            zArr[0] = true;
                            boolean a10 = r0Var.a();
                            org.telegram.ui.web.o oVar2 = oVar;
                            if (!a10) {
                                na.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.y1(26, r0Var, oVar2));
                                return;
                            }
                            r0Var.d = true;
                            r0Var.f18892e = true;
                            r0Var.k();
                            Iterator it = r0Var.f18893f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            oVar2.a(bool2, bool2);
                            return;
                        default:
                            r0 r0Var2 = this.f18837b;
                            r0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                r0Var2.d = true;
                                r0Var2.f18892e = false;
                                r0Var2.k();
                                Iterator it2 = r0Var2.f18893f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                oVar.a(Boolean.TRUE, Boolean.FALSE);
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.j(new bi.k(this, zArr, oVar, 2));
            alertDialog$Builder.p();
        }
    }

    public final void j(y10 y10Var) {
        JSONObject jSONObject = new JSONObject();
        if (this.f18892e && a() && d()) {
            LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f26931b.getSystemService("location");
            List<String> providers = locationManager.getProviders(true);
            Location location = null;
            for (int size = providers.size() - 1; size >= 0; size--) {
                location = locationManager.getLastKnownLocation(providers.get(size));
                if (location != null) {
                    break;
                }
            }
            if (location == null && !locationManager.isProviderEnabled("gps")) {
                Context context = LaunchActivity.H1;
                if (context == null) {
                    context = org.telegram.messenger.t0.f26931b;
                }
                if (context != null) {
                    try {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        int i7 = m6.L5;
                        alertDialog$Builder.m(2131624120, 72, m6.x0(null, i7, false), null);
                        alertDialog$Builder.n(i7, null);
                        alertDialog$Builder.f28777a.U = hd.N0(2131749354, null);
                        alertDialog$Builder.k(hd.N0(2131751148, null), new nb(context, 1));
                        alertDialog$Builder.h(hd.N0(2131752577, null), null);
                        alertDialog$Builder.p();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                y10Var.a(h(null));
                return;
            } else if (location != null) {
                y10Var.a(h(location));
                return;
            } else {
                try {
                    p0 p0Var = new p0(this, locationManager, r0, y10Var);
                    LocationListener[] locationListenerArr = {p0Var};
                    locationManager.requestLocationUpdates("gps", 1L, 0.0f, p0Var);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    y10Var.a(h(null));
                    return;
                }
            }
        }
        try {
            jSONObject.put("available", false);
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        y10Var.a(jSONObject);
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f18889a.getSharedPreferences("botlocation_" + this.f18890b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j3 = this.f18891c;
        edit.putBoolean(a8.p0.r(sb2, j3, "_granted"), this.f18892e);
        edit.putBoolean(j3 + "_requested", this.d);
        edit.apply();
    }

    public final void l(boolean z10, final tr0 tr0Var) {
        this.d = true;
        if (z10 && !a()) {
            Activity f10 = f();
            if (f10 == null) {
                return;
            }
            int i7 = this.f18890b;
            TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(this.f18891c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f(), null);
            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131753045, p10.q(c22), p10.q(c22)));
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.U = W2;
            q0 q0Var = new q0(this.f18889a, k10.i(i7).f(), c22);
            int i10 = m6.L5;
            int x02 = m6.x0(null, i10, false);
            t1Var.f30017c0 = q0Var;
            t1Var.f30019d0 = x02;
            t1Var.f30022e0 = -1;
            alertDialog$Builder.n(i10, null);
            Activity f11 = f();
            if (f11 == null || (f11.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f11.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(hd.N0(2131753047, null), new org.telegram.ui.ActionBar.q1(this) {
                    public final r0 f18822b;

                    {
                        this.f18822b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                        switch (r3) {
                            case 0:
                                r0 r0Var = this.f18822b;
                                if (!r0Var.a()) {
                                    na.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.y1(27, r0Var, tr0Var));
                                    return;
                                }
                                r0Var.d = true;
                                r0Var.f18892e = true;
                                r0Var.k();
                                Iterator it = r0Var.f18893f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            default:
                                r0 r0Var2 = this.f18822b;
                                r0Var2.d = true;
                                r0Var2.f18892e = false;
                                r0Var2.k();
                                Iterator it2 = r0Var2.f18893f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                Runnable runnable = tr0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
            } else {
                alertDialog$Builder.k(hd.N0(2131753041, null), new m0(f10, 0));
            }
            alertDialog$Builder.h(hd.N0(2131753046, null), new org.telegram.ui.ActionBar.q1(this) {
                public final r0 f18822b;

                {
                    this.f18822b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                    switch (r3) {
                        case 0:
                            r0 r0Var = this.f18822b;
                            if (!r0Var.a()) {
                                na.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.y1(27, r0Var, tr0Var));
                                return;
                            }
                            r0Var.d = true;
                            r0Var.f18892e = true;
                            r0Var.k();
                            Iterator it = r0Var.f18893f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            return;
                        default:
                            r0 r0Var2 = this.f18822b;
                            r0Var2.d = true;
                            r0Var2.f18892e = false;
                            r0Var2.k();
                            Iterator it2 = r0Var2.f18893f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            Runnable runnable = tr0Var;
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
            this.f18892e = z10;
            Iterator it = this.f18893f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (tr0Var != null) {
                tr0Var.run();
            }
        }
        k();
    }
}
