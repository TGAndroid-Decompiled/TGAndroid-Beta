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
public final class tr0 {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public boolean d;
    public boolean e;
    public final HashSet f;

    public tr0(Context context, int i, long j) {
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

    public static tr0 d(Context context, int i, long j) {
        Pair pair = new Pair(Integer.valueOf(i), Long.valueOf(j));
        HashMap hashMap = g;
        tr0 tr0Var = (tr0) hashMap.get(pair);
        if (tr0Var == null) {
            tr0 tr0Var2 = new tr0(context, i, j);
            hashMap.put(pair, tr0Var2);
            return tr0Var2;
        }
        return tr0Var;
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
            fc4.g(e, true);
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
            activity = gm.W(this.a);
        }
        if (activity == null) {
            return gm.W(a.b);
        }
        return activity;
    }

    public final boolean f() {
        if (a() && this.e) {
            return true;
        }
        return false;
    }

    public final void h(final yu0 yu0Var) {
        Activity e;
        Activity e2 = e();
        if (e2 == null) {
            return;
        }
        if (!c()) {
            Boolean bool = Boolean.FALSE;
            yu0Var.a(bool, bool);
        } else if (a() && (this.d || this.e)) {
            yu0Var.a(Boolean.FALSE, Boolean.TRUE);
        } else {
            final boolean[] zArr = new boolean[1];
            int i = this.b;
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(this.c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, e2);
            SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, 2131753013, m9c.r(W1), m9c.r(W1)));
            he heVar = alertDialog$Builder.a;
            heVar.U = S2;
            sr0 sr0Var = new sr0(this.a, z8c.h(i).f(), W1);
            int i2 = cmb.K5;
            int w0 = cmb.w0(null, i2, false);
            heVar.c0 = sr0Var;
            heVar.d0 = w0;
            heVar.e0 = -1;
            alertDialog$Builder.m(i2, null);
            if (!a() && (e = e()) != null && (!e.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || !e.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.j(jb6.M0(2131753009, null), new jf(e2, zArr, yu0Var, (byte) 5));
            } else {
                alertDialog$Builder.j(jb6.M0(2131753015, null), new ee(this) {
                    public final tr0 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void r(he heVar2, int i3) {
                        byte b = r4;
                        yu0 yu0Var2 = yu0Var;
                        boolean[] zArr2 = zArr;
                        tr0 tr0Var = this.b;
                        tr0Var.getClass();
                        switch (b) {
                            case 0:
                                zArr2[0] = true;
                                if (!tr0Var.a()) {
                                    use.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new x0(tr0Var, yu0Var2, (byte) 5));
                                    return;
                                }
                                tr0Var.d = true;
                                tr0Var.e = true;
                                tr0Var.j();
                                Iterator it = tr0Var.f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                yu0Var2.a(bool2, bool2);
                                return;
                            default:
                                if (!zArr2[0]) {
                                    zArr2[0] = true;
                                    tr0Var.d = true;
                                    tr0Var.e = false;
                                    tr0Var.j();
                                    Iterator it2 = tr0Var.f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    yu0Var2.a(Boolean.TRUE, Boolean.FALSE);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            alertDialog$Builder.g(jb6.M0(2131753014, null), new ee(this) {
                public final tr0 b;

                {
                    this.b = this;
                }

                @Override
                public final void r(he heVar2, int i3) {
                    byte b = r4;
                    yu0 yu0Var2 = yu0Var;
                    boolean[] zArr2 = zArr;
                    tr0 tr0Var = this.b;
                    tr0Var.getClass();
                    switch (b) {
                        case 0:
                            zArr2[0] = true;
                            if (!tr0Var.a()) {
                                use.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new x0(tr0Var, yu0Var2, (byte) 5));
                                return;
                            }
                            tr0Var.d = true;
                            tr0Var.e = true;
                            tr0Var.j();
                            Iterator it = tr0Var.f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            yu0Var2.a(bool2, bool2);
                            return;
                        default:
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                tr0Var.d = true;
                                tr0Var.e = false;
                                tr0Var.j();
                                Iterator it2 = tr0Var.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                yu0Var2.a(Boolean.TRUE, Boolean.FALSE);
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.i(new ah(this, zArr, yu0Var, (byte) 3));
            alertDialog$Builder.o();
        }
    }

    public final void i(qac qacVar) {
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
                            int i = cmb.K5;
                            alertDialog$Builder.l(2131624120, 72, cmb.w0(null, i, false), null);
                            alertDialog$Builder.m(i, null);
                            alertDialog$Builder.a.U = jb6.M0(2131749304, null);
                            alertDialog$Builder.j(jb6.M0(2131751097, null), new oe(context, (byte) 2));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.o();
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                    }
                    qacVar.a(g(null));
                    return;
                }
                try {
                    rr0 rr0Var = new rr0(this, locationManager, r0, qacVar);
                    LocationListener[] locationListenerArr = {rr0Var};
                    locationManager.requestLocationUpdates("gps", 1L, 0.0f, rr0Var);
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    qacVar.a(g(null));
                    return;
                }
            }
            qacVar.a(g(location));
            return;
        }
        try {
            jSONObject.put("available", false);
        } catch (Exception e3) {
            fc4.g(e3, true);
        }
        qacVar.a(jSONObject);
    }

    public final void j() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botlocation_" + this.b, 0).edit();
        StringBuilder sb = new StringBuilder();
        long j = this.c;
        edit.putBoolean(kt6.q(sb, j, "_granted"), this.e);
        edit.putBoolean(j + "_requested", this.d);
        edit.apply();
    }

    public final void k(boolean z, final mn8 mn8Var) {
        this.d = true;
        if (z && !a()) {
            Activity e = e();
            if (e == null) {
                return;
            }
            int i = this.b;
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(this.c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, e());
            SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, 2131753013, m9c.r(W1), m9c.r(W1)));
            he heVar = alertDialog$Builder.a;
            heVar.U = S2;
            sr0 sr0Var = new sr0(this.a, z8c.h(i).f(), W1);
            int i2 = cmb.K5;
            int w0 = cmb.w0(null, i2, false);
            heVar.c0 = sr0Var;
            heVar.d0 = w0;
            heVar.e0 = -1;
            alertDialog$Builder.m(i2, null);
            Activity e2 = e();
            if (e2 == null || (e2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && e2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.j(jb6.M0(2131753015, null), new ee(this) {
                    public final tr0 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void r(he heVar2, int i3) {
                        byte b = r3;
                        mn8 mn8Var2 = mn8Var;
                        tr0 tr0Var = this.b;
                        switch (b) {
                            case 0:
                                if (!tr0Var.a()) {
                                    use.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new x0(tr0Var, mn8Var2, (byte) 6));
                                    return;
                                }
                                tr0Var.d = true;
                                tr0Var.e = true;
                                tr0Var.j();
                                Iterator it = tr0Var.f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            default:
                                tr0Var.d = true;
                                tr0Var.e = false;
                                tr0Var.j();
                                Iterator it2 = tr0Var.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                if (mn8Var2 != null) {
                                    mn8Var2.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
            } else {
                alertDialog$Builder.j(jb6.M0(2131753009, null), new mi(e, (byte) 1));
            }
            alertDialog$Builder.g(jb6.M0(2131753014, null), new ee(this) {
                public final tr0 b;

                {
                    this.b = this;
                }

                @Override
                public final void r(he heVar2, int i3) {
                    byte b = r3;
                    mn8 mn8Var2 = mn8Var;
                    tr0 tr0Var = this.b;
                    switch (b) {
                        case 0:
                            if (!tr0Var.a()) {
                                use.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new x0(tr0Var, mn8Var2, (byte) 6));
                                return;
                            }
                            tr0Var.d = true;
                            tr0Var.e = true;
                            tr0Var.j();
                            Iterator it = tr0Var.f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            return;
                        default:
                            tr0Var.d = true;
                            tr0Var.e = false;
                            tr0Var.j();
                            Iterator it2 = tr0Var.f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            if (mn8Var2 != null) {
                                mn8Var2.run();
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
            if (mn8Var != null) {
                mn8Var.run();
            }
        }
        j();
    }
}
