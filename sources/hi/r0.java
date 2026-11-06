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
import c8.ia;
import fi.qb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn0;
public final class r0 {
    public static final HashMap f14916g = new HashMap();
    public final Context f14917a;
    public final int f14918b;
    public final long f14919c;
    public boolean d;
    public boolean f14920e;
    public final HashSet f14921f;

    public r0(Context context, int i7, long j3) {
        HashSet hashSet = new HashSet();
        this.f14921f = hashSet;
        this.f14917a = context;
        this.f14918b = i7;
        this.f14919c = j3;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i7, 0);
        this.d = sharedPreferences.getBoolean(j3 + "_requested", false);
        boolean z9 = sharedPreferences.getBoolean(j3 + "_granted", false);
        this.f14920e = z9;
        if (z9 && !a()) {
            this.f14920e = false;
            this.d = false;
            k();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public static void c() {
        Context context = org.telegram.messenger.t0.f25563b;
        if (context == null) {
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            context.getSharedPreferences("botlocation_" + i7, 0).edit().clear().apply();
        }
        f14916g.clear();
    }

    public static r0 e(Context context, int i7, long j3) {
        Pair pair = new Pair(Integer.valueOf(i7), Long.valueOf(j3));
        HashMap hashMap = f14916g;
        r0 r0Var = (r0) hashMap.get(pair);
        if (r0Var == null) {
            r0 r0Var2 = new r0(context, i7, j3);
            hashMap.put(pair, r0Var2);
            return r0Var2;
        }
        return r0Var;
    }

    public static JSONObject h(Location location) {
        boolean z9;
        JSONObject jSONObject = new JSONObject();
        if (location != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        try {
            jSONObject.put("available", z9);
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
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(this.f14917a);
        }
        if (activity == null) {
            return org.telegram.messenger.g0.W(org.telegram.messenger.t0.f25563b);
        }
        return activity;
    }

    public final boolean g() {
        if (a() && this.f14920e) {
            return true;
        }
        return false;
    }

    public final void i(final org.telegram.ui.web.n nVar) {
        Activity f10;
        Activity f11 = f();
        if (f11 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            nVar.a(bool, bool);
        } else if (a() && (this.d || this.f14920e)) {
            nVar.a(Boolean.FALSE, Boolean.TRUE);
        } else {
            final boolean[] zArr = new boolean[1];
            int i7 = this.f14918b;
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(this.f14919c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f11, null);
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131753057, t10.p(a22), t10.p(a22)));
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
            u1Var.T = X2;
            q0 q0Var = new q0(this.f14917a, p10.i(i7).f(), a22);
            int i10 = k6.L5;
            int x02 = k6.x0(null, i10, false);
            u1Var.f28552b0 = q0Var;
            u1Var.f28555c0 = x02;
            u1Var.f28557d0 = -1;
            alertDialog$Builder.n(i10, null);
            if (!a() && (f10 = f()) != null && (!f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || !f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(hd.M0(2131753053, null), new a3.h(f11, zArr, nVar, 11));
            } else {
                alertDialog$Builder.k(hd.M0(2131753059, null), new org.telegram.ui.ActionBar.r1(this) {
                    public final r0 f14801b;

                    {
                        this.f14801b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                        switch (r4) {
                            case 0:
                                r0 r0Var = this.f14801b;
                                r0Var.getClass();
                                zArr[0] = true;
                                boolean a10 = r0Var.a();
                                org.telegram.ui.web.n nVar2 = nVar;
                                if (!a10) {
                                    ia.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.f1(16, r0Var, nVar2));
                                    return;
                                }
                                r0Var.d = true;
                                r0Var.f14920e = true;
                                r0Var.k();
                                Iterator it = r0Var.f14921f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                nVar2.a(bool2, bool2);
                                return;
                            default:
                                r0 r0Var2 = this.f14801b;
                                r0Var2.getClass();
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    zArr2[0] = true;
                                    r0Var2.d = true;
                                    r0Var2.f14920e = false;
                                    r0Var2.k();
                                    Iterator it2 = r0Var2.f14921f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    nVar.a(Boolean.TRUE, Boolean.FALSE);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            alertDialog$Builder.h(hd.M0(2131753058, null), new org.telegram.ui.ActionBar.r1(this) {
                public final r0 f14801b;

                {
                    this.f14801b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                    switch (r4) {
                        case 0:
                            r0 r0Var = this.f14801b;
                            r0Var.getClass();
                            zArr[0] = true;
                            boolean a10 = r0Var.a();
                            org.telegram.ui.web.n nVar2 = nVar;
                            if (!a10) {
                                ia.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.f1(16, r0Var, nVar2));
                                return;
                            }
                            r0Var.d = true;
                            r0Var.f14920e = true;
                            r0Var.k();
                            Iterator it = r0Var.f14921f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            nVar2.a(bool2, bool2);
                            return;
                        default:
                            r0 r0Var2 = this.f14801b;
                            r0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                r0Var2.d = true;
                                r0Var2.f14920e = false;
                                r0Var2.k();
                                Iterator it2 = r0Var2.f14921f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                nVar.a(Boolean.TRUE, Boolean.FALSE);
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.j(new o0(this, zArr, nVar, 0));
            alertDialog$Builder.p();
        }
    }

    public final void j(c20 c20Var) {
        JSONObject jSONObject = new JSONObject();
        if (this.f14920e && a() && d()) {
            LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f25563b.getSystemService("location");
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
                    context = org.telegram.messenger.t0.f25563b;
                }
                if (context != null) {
                    try {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        int i7 = k6.L5;
                        alertDialog$Builder.m(2131624119, 72, k6.x0(null, i7, false), null);
                        alertDialog$Builder.n(i7, null);
                        alertDialog$Builder.f27293a.T = hd.M0(2131749529, null);
                        alertDialog$Builder.k(hd.M0(2131751161, null), new qb(context, 1));
                        alertDialog$Builder.h(hd.M0(2131752589, null), null);
                        alertDialog$Builder.p();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                c20Var.a(h(null));
                return;
            } else if (location != null) {
                c20Var.a(h(location));
                return;
            } else {
                try {
                    p0 p0Var = new p0(this, locationManager, r0, c20Var);
                    LocationListener[] locationListenerArr = {p0Var};
                    locationManager.requestLocationUpdates("gps", 1L, 0.0f, p0Var);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    c20Var.a(h(null));
                    return;
                }
            }
        }
        try {
            jSONObject.put("available", false);
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        c20Var.a(jSONObject);
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f14917a.getSharedPreferences("botlocation_" + this.f14918b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j3 = this.f14919c;
        edit.putBoolean(a8.p0.r(sb2, j3, "_granted"), this.f14920e);
        edit.putBoolean(j3 + "_requested", this.d);
        edit.apply();
    }

    public final void l(boolean z9, final qn0 qn0Var) {
        this.d = true;
        if (z9 && !a()) {
            Activity f10 = f();
            if (f10 == null) {
                return;
            }
            int i7 = this.f14918b;
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(this.f14919c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f(), null);
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131753057, t10.p(a22), t10.p(a22)));
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
            u1Var.T = X2;
            q0 q0Var = new q0(this.f14917a, p10.i(i7).f(), a22);
            int i10 = k6.L5;
            int x02 = k6.x0(null, i10, false);
            u1Var.f28552b0 = q0Var;
            u1Var.f28555c0 = x02;
            u1Var.f28557d0 = -1;
            alertDialog$Builder.n(i10, null);
            Activity f11 = f();
            if (f11 == null || (f11.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f11.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(hd.M0(2131753059, null), new org.telegram.ui.ActionBar.r1(this) {
                    public final r0 f14786b;

                    {
                        this.f14786b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                        switch (r3) {
                            case 0:
                                r0 r0Var = this.f14786b;
                                if (!r0Var.a()) {
                                    ia.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.f1(17, r0Var, qn0Var));
                                    return;
                                }
                                r0Var.d = true;
                                r0Var.f14920e = true;
                                r0Var.k();
                                Iterator it = r0Var.f14921f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            default:
                                r0 r0Var2 = this.f14786b;
                                r0Var2.d = true;
                                r0Var2.f14920e = false;
                                r0Var2.k();
                                Iterator it2 = r0Var2.f14921f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                Runnable runnable = qn0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
            } else {
                alertDialog$Builder.k(hd.M0(2131753053, null), new l0(f10, 0));
            }
            alertDialog$Builder.h(hd.M0(2131753058, null), new org.telegram.ui.ActionBar.r1(this) {
                public final r0 f14786b;

                {
                    this.f14786b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                    switch (r3) {
                        case 0:
                            r0 r0Var = this.f14786b;
                            if (!r0Var.a()) {
                                ia.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.f1(17, r0Var, qn0Var));
                                return;
                            }
                            r0Var.d = true;
                            r0Var.f14920e = true;
                            r0Var.k();
                            Iterator it = r0Var.f14921f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            return;
                        default:
                            r0 r0Var2 = this.f14786b;
                            r0Var2.d = true;
                            r0Var2.f14920e = false;
                            r0Var2.k();
                            Iterator it2 = r0Var2.f14921f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            Runnable runnable = qn0Var;
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
            this.f14920e = z9;
            Iterator it = this.f14921f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (qn0Var != null) {
                qn0Var.run();
            }
        }
        k();
    }
}
