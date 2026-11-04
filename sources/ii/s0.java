package ii;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import b8.nf;
import gi.qb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hk0;
public final class s0 {
    public static final HashMap f15210g = new HashMap();
    public final Context f15211a;
    public final int f15212b;
    public final long f15213c;
    public boolean d;
    public boolean f15214e;
    public final HashSet f15215f;

    public s0(Context context, int i3, long j10) {
        HashSet hashSet = new HashSet();
        this.f15215f = hashSet;
        this.f15211a = context;
        this.f15212b = i3;
        this.f15213c = j10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i3, 0);
        this.d = sharedPreferences.getBoolean(j10 + "_requested", false);
        boolean z10 = sharedPreferences.getBoolean(j10 + "_granted", false);
        this.f15214e = z10;
        if (z10 && !a()) {
            this.f15214e = false;
            this.d = false;
            k();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public static void c() {
        Context context = org.telegram.messenger.t0.f25457b;
        if (context == null) {
            return;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            context.getSharedPreferences("botlocation_" + i3, 0).edit().clear().apply();
        }
        f15210g.clear();
    }

    public static s0 e(Context context, int i3, long j10) {
        Pair pair = new Pair(Integer.valueOf(i3), Long.valueOf(j10));
        HashMap hashMap = f15210g;
        s0 s0Var = (s0) hashMap.get(pair);
        if (s0Var == null) {
            s0 s0Var2 = new s0(context, i3, j10);
            hashMap.put(pair, s0Var2);
            return s0Var2;
        }
        return s0Var;
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
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 26) {
                jSONObject.put("horizontal_accuracy", location.getAccuracy());
            } else {
                jSONObject.put("horizontal_accuracy", (Object) null);
            }
            jSONObject.put("altitude", location.getAltitude());
            if (i3 >= 26) {
                jSONObject.put("vertical_accuracy", location.getVerticalAccuracyMeters());
            } else {
                jSONObject.put("vertical_accuracy", (Object) null);
            }
            jSONObject.put("course", location.getBearing());
            if (i3 >= 26) {
                jSONObject.put("course_accuracy", location.getBearingAccuracyDegrees());
            } else {
                jSONObject.put("course_accuracy", (Object) null);
            }
            jSONObject.put("speed", location.getSpeed());
            if (i3 >= 26) {
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
        Activity activity = LaunchActivity.K1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(this.f15211a);
        }
        if (activity == null) {
            return org.telegram.messenger.g0.W(org.telegram.messenger.t0.f25457b);
        }
        return activity;
    }

    public final boolean g() {
        if (a() && this.f15214e) {
            return true;
        }
        return false;
    }

    public final void i(final org.telegram.ui.web.p pVar) {
        Activity f10;
        Activity f11 = f();
        if (f11 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            pVar.a(bool, bool);
        } else if (a() && (this.d || this.f15214e)) {
            pVar.a(Boolean.FALSE, Boolean.TRUE);
        } else {
            final boolean[] zArr = new boolean[1];
            int i3 = this.f15212b;
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(this.f15213c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f11, null);
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131753057, l10.p(a22), l10.p(a22)));
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.U = X2;
            r0 r0Var = new r0(this.f15211a, h10.i(i3).f(), a22);
            int i10 = k6.L5;
            int x02 = k6.x0(null, i10, false);
            s1Var.f28530c0 = r0Var;
            s1Var.f28532d0 = x02;
            s1Var.f28535e0 = -1;
            alertDialog$Builder.n(i10, null);
            if (!a() && (f10 = f()) != null && (!f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || !f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(bd.M0(2131753053, null), new aa.a(f11, zArr, pVar, 8));
            } else {
                alertDialog$Builder.k(bd.M0(2131753059, null), new org.telegram.ui.ActionBar.p1(this) {
                    public final s0 f15136b;

                    {
                        this.f15136b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i11) {
                        switch (r4) {
                            case 0:
                                s0 s0Var = this.f15136b;
                                s0Var.getClass();
                                zArr[0] = true;
                                boolean a10 = s0Var.a();
                                org.telegram.ui.web.p pVar2 = pVar;
                                if (!a10) {
                                    nf.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.o1(20, s0Var, pVar2));
                                    return;
                                }
                                s0Var.d = true;
                                s0Var.f15214e = true;
                                s0Var.k();
                                Iterator it = s0Var.f15215f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                pVar2.a(bool2, bool2);
                                return;
                            default:
                                s0 s0Var2 = this.f15136b;
                                s0Var2.getClass();
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    zArr2[0] = true;
                                    s0Var2.d = true;
                                    s0Var2.f15214e = false;
                                    s0Var2.k();
                                    Iterator it2 = s0Var2.f15215f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    pVar.a(Boolean.TRUE, Boolean.FALSE);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            alertDialog$Builder.h(bd.M0(2131753058, null), new org.telegram.ui.ActionBar.p1(this) {
                public final s0 f15136b;

                {
                    this.f15136b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i11) {
                    switch (r4) {
                        case 0:
                            s0 s0Var = this.f15136b;
                            s0Var.getClass();
                            zArr[0] = true;
                            boolean a10 = s0Var.a();
                            org.telegram.ui.web.p pVar2 = pVar;
                            if (!a10) {
                                nf.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.o1(20, s0Var, pVar2));
                                return;
                            }
                            s0Var.d = true;
                            s0Var.f15214e = true;
                            s0Var.k();
                            Iterator it = s0Var.f15215f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            pVar2.a(bool2, bool2);
                            return;
                        default:
                            s0 s0Var2 = this.f15136b;
                            s0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                s0Var2.d = true;
                                s0Var2.f15214e = false;
                                s0Var2.k();
                                Iterator it2 = s0Var2.f15215f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                pVar.a(Boolean.TRUE, Boolean.FALSE);
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.j(new ai.o(this, zArr, pVar, 2));
            alertDialog$Builder.p();
        }
    }

    public final void j(u10 u10Var) {
        JSONObject jSONObject = new JSONObject();
        if (this.f15214e && a() && d()) {
            LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f25457b.getSystemService("location");
            List<String> providers = locationManager.getProviders(true);
            Location location = null;
            for (int size = providers.size() - 1; size >= 0; size--) {
                location = locationManager.getLastKnownLocation(providers.get(size));
                if (location != null) {
                    break;
                }
            }
            if (location == null && !locationManager.isProviderEnabled("gps")) {
                Context context = LaunchActivity.K1;
                if (context == null) {
                    context = org.telegram.messenger.t0.f25457b;
                }
                if (context != null) {
                    try {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        int i3 = k6.L5;
                        alertDialog$Builder.m(2131624119, 72, k6.x0(null, i3, false), null);
                        alertDialog$Builder.n(i3, null);
                        alertDialog$Builder.f27343a.U = bd.M0(2131749538, null);
                        alertDialog$Builder.k(bd.M0(2131751161, null), new qb(context, 1));
                        alertDialog$Builder.h(bd.M0(2131752589, null), null);
                        alertDialog$Builder.p();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                u10Var.a(h(null));
                return;
            } else if (location != null) {
                u10Var.a(h(location));
                return;
            } else {
                try {
                    q0 q0Var = new q0(this, locationManager, r0, u10Var);
                    LocationListener[] locationListenerArr = {q0Var};
                    locationManager.requestLocationUpdates("gps", 1L, 0.0f, q0Var);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    u10Var.a(h(null));
                    return;
                }
            }
        }
        try {
            jSONObject.put("available", false);
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        u10Var.a(jSONObject);
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f15211a.getSharedPreferences("botlocation_" + this.f15212b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f15213c;
        edit.putBoolean(a1.g.r(sb2, j10, "_granted"), this.f15214e);
        edit.putBoolean(j10 + "_requested", this.d);
        edit.apply();
    }

    public final void l(boolean z10, final hk0 hk0Var) {
        this.d = true;
        if (z10 && !a()) {
            Activity f10 = f();
            if (f10 == null) {
                return;
            }
            int i3 = this.f15212b;
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(this.f15213c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f(), null);
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131753057, l10.p(a22), l10.p(a22)));
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.U = X2;
            r0 r0Var = new r0(this.f15211a, h10.i(i3).f(), a22);
            int i10 = k6.L5;
            int x02 = k6.x0(null, i10, false);
            s1Var.f28530c0 = r0Var;
            s1Var.f28532d0 = x02;
            s1Var.f28535e0 = -1;
            alertDialog$Builder.n(i10, null);
            Activity f11 = f();
            if (f11 == null || (f11.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f11.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(bd.M0(2131753059, null), new org.telegram.ui.ActionBar.p1(this) {
                    public final s0 f15123b;

                    {
                        this.f15123b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i11) {
                        switch (r3) {
                            case 0:
                                s0 s0Var = this.f15123b;
                                if (!s0Var.a()) {
                                    nf.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.o1(21, s0Var, hk0Var));
                                    return;
                                }
                                s0Var.d = true;
                                s0Var.f15214e = true;
                                s0Var.k();
                                Iterator it = s0Var.f15215f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            default:
                                s0 s0Var2 = this.f15123b;
                                s0Var2.d = true;
                                s0Var2.f15214e = false;
                                s0Var2.k();
                                Iterator it2 = s0Var2.f15215f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                Runnable runnable = hk0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
            } else {
                alertDialog$Builder.k(bd.M0(2131753053, null), new n0(f10, 0));
            }
            alertDialog$Builder.h(bd.M0(2131753058, null), new org.telegram.ui.ActionBar.p1(this) {
                public final s0 f15123b;

                {
                    this.f15123b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i11) {
                    switch (r3) {
                        case 0:
                            s0 s0Var = this.f15123b;
                            if (!s0Var.a()) {
                                nf.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.o1(21, s0Var, hk0Var));
                                return;
                            }
                            s0Var.d = true;
                            s0Var.f15214e = true;
                            s0Var.k();
                            Iterator it = s0Var.f15215f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            return;
                        default:
                            s0 s0Var2 = this.f15123b;
                            s0Var2.d = true;
                            s0Var2.f15214e = false;
                            s0Var2.k();
                            Iterator it2 = s0Var2.f15215f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            Runnable runnable = hk0Var;
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
            this.f15214e = z10;
            Iterator it = this.f15215f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (hk0Var != null) {
                hk0Var.run();
            }
        }
        k();
    }
}
