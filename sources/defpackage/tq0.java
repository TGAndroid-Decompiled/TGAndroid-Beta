package defpackage;

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
import org.json.JSONObject;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class tq0 {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public boolean d;
    public boolean e;
    public final HashSet f;

    public tq0(Context context, int i, long j) {
        HashSet hashSet = new HashSet();
        this.f = hashSet;
        this.a = context;
        this.b = i;
        this.c = j;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i, 0);
        this.d = sharedPreferences.getBoolean(j + "_requested", false);
        boolean z = sharedPreferences.getBoolean(j + "_granted", false);
        this.e = z;
        if (z && !a()) {
            this.e = false;
            this.d = false;
            j();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public static void b() {
        Context context = a.b;
        if (context == null) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            context.getSharedPreferences("botlocation_" + i, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static tq0 d(Context context, int i, long j) {
        Pair pair = new Pair(Integer.valueOf(i), Long.valueOf(j));
        HashMap hashMap = g;
        tq0 tq0Var = (tq0) hashMap.get(pair);
        if (tq0Var == null) {
            tq0 tq0Var2 = new tq0(context, i, j);
            hashMap.put(pair, tq0Var2);
            return tq0Var2;
        }
        return tq0Var;
    }

    public static JSONObject g(Location location) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        if (location != null) {
            z = true;
        } else {
            z = false;
        }
        try {
            jSONObject.put("available", z);
            if (location == null) {
                return jSONObject;
            }
            jSONObject.put("latitude", location.getLatitude());
            jSONObject.put("longitude", location.getLongitude());
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                jSONObject.put("horizontal_accuracy", location.getAccuracy());
            } else {
                jSONObject.put("horizontal_accuracy", (Object) null);
            }
            jSONObject.put("altitude", location.getAltitude());
            if (i >= 26) {
                jSONObject.put("vertical_accuracy", location.getVerticalAccuracyMeters());
            } else {
                jSONObject.put("vertical_accuracy", (Object) null);
            }
            jSONObject.put("course", location.getBearing());
            if (i >= 26) {
                jSONObject.put("course_accuracy", location.getBearingAccuracyDegrees());
            } else {
                jSONObject.put("course_accuracy", (Object) null);
            }
            jSONObject.put("speed", location.getSpeed());
            if (i >= 26) {
                jSONObject.put("speed_accuracy", location.getSpeedAccuracyMetersPerSecond());
                return jSONObject;
            }
            jSONObject.put("speed_accuracy", (Object) null);
            return jSONObject;
        } catch (Exception e) {
            fa4.g(e, true);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity e = e();
        if (e != null) {
            if (e.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || e.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean c() {
        if (e() != null && e().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            return true;
        }
        return false;
    }

    public final Activity e() {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = gl.W(this.a);
        }
        if (activity == null) {
            return gl.W(a.b);
        }
        return activity;
    }

    public final boolean f() {
        if (a() && this.e) {
            return true;
        }
        return false;
    }

    public final void h(final pt0 pt0Var) {
        Activity e;
        Activity e2 = e();
        if (e2 == null) {
            return;
        }
        if (!c()) {
            Boolean bool = Boolean.FALSE;
            pt0Var.a(bool, bool);
        } else if (a() && (this.d || this.e)) {
            pt0Var.a(Boolean.FALSE, Boolean.TRUE);
        } else {
            final boolean[] zArr = new boolean[1];
            int i = this.b;
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(this.c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, e2);
            SpannableStringBuilder S2 = gl.S2(k96.a0(null, null, 2131753045, l7c.r(V1), l7c.r(V1)));
            hd hdVar = alertDialog$Builder.a;
            hdVar.U = S2;
            sq0 sq0Var = new sq0(this.a, y6c.h(i).f(), V1);
            int i2 = bkb.K5;
            int w0 = bkb.w0(null, i2, false);
            hdVar.c0 = sq0Var;
            hdVar.d0 = w0;
            hdVar.e0 = -1;
            alertDialog$Builder.m(i2, null);
            if (!a() && (e = e()) != null && (!e.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || !e.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.j(k96.M0(2131753041, null), new ie(e2, zArr, pt0Var, (byte) 5));
            } else {
                alertDialog$Builder.j(k96.M0(2131753047, null), new ed(this) {
                    public final tq0 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void u(hd hdVar2, int i3) {
                        byte b = r4;
                        pt0 pt0Var2 = pt0Var;
                        boolean[] zArr2 = zArr;
                        tq0 tq0Var = this.b;
                        tq0Var.getClass();
                        switch (b) {
                            case 0:
                                zArr2[0] = true;
                                if (!tq0Var.a()) {
                                    rqe.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new x0(tq0Var, pt0Var2, (byte) 4));
                                    return;
                                }
                                tq0Var.d = true;
                                tq0Var.e = true;
                                tq0Var.j();
                                Iterator it = tq0Var.f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                pt0Var2.a(bool2, bool2);
                                return;
                            default:
                                if (!zArr2[0]) {
                                    zArr2[0] = true;
                                    tq0Var.d = true;
                                    tq0Var.e = false;
                                    tq0Var.j();
                                    Iterator it2 = tq0Var.f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    pt0Var2.a(Boolean.TRUE, Boolean.FALSE);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            alertDialog$Builder.g(k96.M0(2131753046, null), new ed(this) {
                public final tq0 b;

                {
                    this.b = this;
                }

                @Override
                public final void u(hd hdVar2, int i3) {
                    byte b = r4;
                    pt0 pt0Var2 = pt0Var;
                    boolean[] zArr2 = zArr;
                    tq0 tq0Var = this.b;
                    tq0Var.getClass();
                    switch (b) {
                        case 0:
                            zArr2[0] = true;
                            if (!tq0Var.a()) {
                                rqe.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new x0(tq0Var, pt0Var2, (byte) 4));
                                return;
                            }
                            tq0Var.d = true;
                            tq0Var.e = true;
                            tq0Var.j();
                            Iterator it = tq0Var.f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            pt0Var2.a(bool2, bool2);
                            return;
                        default:
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                tq0Var.d = true;
                                tq0Var.e = false;
                                tq0Var.j();
                                Iterator it2 = tq0Var.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                pt0Var2.a(Boolean.TRUE, Boolean.FALSE);
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.i(new ag(this, zArr, pt0Var, (byte) 3));
            alertDialog$Builder.o();
        }
    }

    public final void i(p8c p8cVar) {
        JSONObject jSONObject = new JSONObject();
        if (this.e && a() && c()) {
            LocationManager locationManager = (LocationManager) a.b.getSystemService("location");
            List<String> providers = locationManager.getProviders(true);
            Location location = null;
            for (int size = providers.size() - 1; size >= 0; size--) {
                location = locationManager.getLastKnownLocation(providers.get(size));
                if (location != null) {
                    break;
                }
            }
            if (location == null) {
                if (!locationManager.isProviderEnabled("gps")) {
                    Context context = LaunchActivity.H1;
                    if (context == null) {
                        context = a.b;
                    }
                    if (context != null) {
                        try {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            int i = bkb.K5;
                            alertDialog$Builder.l(2131624120, 72, bkb.w0(null, i, false), null);
                            alertDialog$Builder.m(i, null);
                            alertDialog$Builder.a.U = k96.M0(2131749355, null);
                            alertDialog$Builder.j(k96.M0(2131751148, null), new od(context, (byte) 2));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.o();
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                    }
                    p8cVar.a(g(null));
                    return;
                }
                try {
                    rq0 rq0Var = new rq0(this, locationManager, r0, p8cVar);
                    LocationListener[] locationListenerArr = {rq0Var};
                    locationManager.requestLocationUpdates("gps", 1L, 0.0f, rq0Var);
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    p8cVar.a(g(null));
                    return;
                }
            }
            p8cVar.a(g(location));
            return;
        }
        try {
            jSONObject.put("available", false);
        } catch (Exception e3) {
            fa4.g(e3, true);
        }
        p8cVar.a(jSONObject);
    }

    public final void j() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botlocation_" + this.b, 0).edit();
        StringBuilder sb = new StringBuilder();
        long j = this.c;
        edit.putBoolean(ls6.p(sb, j, "_granted"), this.e);
        edit.putBoolean(j + "_requested", this.d);
        edit.apply();
    }

    public final void k(boolean z, final ll8 ll8Var) {
        this.d = true;
        if (z && !a()) {
            Activity e = e();
            if (e == null) {
                return;
            }
            int i = this.b;
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(this.c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, e());
            SpannableStringBuilder S2 = gl.S2(k96.a0(null, null, 2131753045, l7c.r(V1), l7c.r(V1)));
            hd hdVar = alertDialog$Builder.a;
            hdVar.U = S2;
            sq0 sq0Var = new sq0(this.a, y6c.h(i).f(), V1);
            int i2 = bkb.K5;
            int w0 = bkb.w0(null, i2, false);
            hdVar.c0 = sq0Var;
            hdVar.d0 = w0;
            hdVar.e0 = -1;
            alertDialog$Builder.m(i2, null);
            Activity e2 = e();
            if (e2 == null || (e2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && e2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.j(k96.M0(2131753047, null), new ed(this) {
                    public final tq0 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void u(hd hdVar2, int i3) {
                        byte b = r3;
                        ll8 ll8Var2 = ll8Var;
                        tq0 tq0Var = this.b;
                        switch (b) {
                            case 0:
                                if (!tq0Var.a()) {
                                    rqe.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new x0(tq0Var, ll8Var2, (byte) 5));
                                    return;
                                }
                                tq0Var.d = true;
                                tq0Var.e = true;
                                tq0Var.j();
                                Iterator it = tq0Var.f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            default:
                                tq0Var.d = true;
                                tq0Var.e = false;
                                tq0Var.j();
                                Iterator it2 = tq0Var.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                if (ll8Var2 != null) {
                                    ll8Var2.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
            } else {
                alertDialog$Builder.j(k96.M0(2131753041, null), new mh(e, (byte) 1));
            }
            alertDialog$Builder.g(k96.M0(2131753046, null), new ed(this) {
                public final tq0 b;

                {
                    this.b = this;
                }

                @Override
                public final void u(hd hdVar2, int i3) {
                    byte b = r3;
                    ll8 ll8Var2 = ll8Var;
                    tq0 tq0Var = this.b;
                    switch (b) {
                        case 0:
                            if (!tq0Var.a()) {
                                rqe.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new x0(tq0Var, ll8Var2, (byte) 5));
                                return;
                            }
                            tq0Var.d = true;
                            tq0Var.e = true;
                            tq0Var.j();
                            Iterator it = tq0Var.f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            return;
                        default:
                            tq0Var.d = true;
                            tq0Var.e = false;
                            tq0Var.j();
                            Iterator it2 = tq0Var.f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            if (ll8Var2 != null) {
                                ll8Var2.run();
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
        } else {
            this.e = z;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (ll8Var != null) {
                ll8Var.run();
            }
        }
        j();
    }
}
