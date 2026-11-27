package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.utils.twidget.z;
public final class x0d implements Runnable {
    public final byte a;
    public final z b;

    public x0d(z zVar, byte b) {
        this.a = b;
        this.b = zVar;
    }

    private final void a() {
        a1d a1dVar;
        JSONObject jSONObject;
        q0d q0dVar;
        q0d q0dVar2;
        v0d v0dVar;
        z zVar;
        boolean z;
        String str;
        h0d g;
        int i;
        double d;
        int i2;
        int i3;
        z zVar2 = this.b;
        synchronized (zVar2.s) {
            a1dVar = zVar2.O;
            zVar2.O = null;
            jSONObject = zVar2.P;
            zVar2.P = null;
            zVar2.Q = false;
        }
        if (zVar2.A) {
            if (a1dVar != null) {
                a1dVar.a.b();
                return;
            }
            return;
        }
        if (a1dVar != null && (i3 = zVar2.M) != 0 && Math.abs(a1dVar.d - i3) > 1) {
            a1dVar.a.b();
            zVar2.K = false;
            a1dVar = null;
        }
        if (a1dVar != null) {
            zVar2.N = a1dVar;
            zVar2.K = false;
            q0d q0dVar3 = zVar2.R;
            if (q0dVar3 != null) {
                q0dVar3.h(zVar2);
            }
        }
        if (jSONObject != null && (q0dVar = zVar2.R) != null) {
            String str2 = q0dVar.a;
            if (q0dVar.d != null) {
                h0d g2 = k0d.g(q0dVar);
                if (f11.a && g2 != null) {
                    int optInt = jSONObject.optInt("throttled");
                    double optDouble = jSONObject.optDouble("jsMs", 0.0d);
                    double optDouble2 = jSONObject.optDouble("validatorMs", 0.0d);
                    z = true;
                    str = str2;
                    double optDouble3 = jSONObject.optDouble("queryMs", 0.0d);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i4 = g2.F;
                    int i5 = q0dVar.p;
                    if (i4 == i5 && optInt >= (i2 = g2.G)) {
                        d = optDouble3;
                        i = i2;
                        q0dVar2 = q0dVar;
                    } else {
                        g2.F = i5;
                        i = 0;
                        g2.G = 0;
                        q0dVar2 = q0dVar;
                        d = optDouble3;
                        g2.J = 0.0d;
                        g2.I = 0.0d;
                        g2.H = 0.0d;
                        g2.K = elapsedRealtime;
                    }
                    if (optInt > i) {
                        if (elapsedRealtime - g2.K >= 5000) {
                            StringBuilder p = ik8.p("widget ", str, " held by the CPU quota: ");
                            p.append(optInt - g2.G);
                            p.append(" tasks deferred in ");
                            p.append(elapsedRealtime - g2.K);
                            p.append(" ms (JavaScript ");
                            p.append(Math.round(optDouble - g2.H));
                            p.append(" ms, validator ");
                            p.append(Math.round(optDouble2 - g2.I));
                            p.append(" ms, layout queries ");
                            p.append(Math.round(d - g2.J));
                            p.append(" ms; ");
                            p.append(optInt);
                            p.append(" deferred in all); last: ");
                            p.append(jSONObject.optString("throttle"));
                            cc4.b(p.toString());
                            g2.G = optInt;
                        }
                    }
                    g2.H = optDouble;
                    g2.I = optDouble2;
                    g2.J = d;
                    g2.K = elapsedRealtime;
                } else {
                    q0dVar2 = q0dVar;
                    z = true;
                    str = str2;
                }
                String optString = jSONObject.optString("dead");
                if (!TextUtils.isEmpty(optString) && (g = k0d.g(q0dVar2)) != null) {
                    int i6 = g.E;
                    int i7 = q0dVar2.p;
                    if (i6 != i7) {
                        g.E = i7;
                        g.D++;
                        g.L = z;
                        StringBuilder p2 = ik8.p("widget ", str, " stopped (");
                        p2.append(g.D);
                        p2.append("): ");
                        p2.append(optString);
                        cc4.b(p2.toString());
                        k0d.s(g);
                        k0d.b();
                    }
                }
            } else {
                q0dVar2 = q0dVar;
            }
            if (jSONObject.optBoolean("loaded") && q0dVar2.f != null && (zVar = q0dVar2.e) != null) {
                q0dVar2.h(zVar);
            } else if (q0dVar2.f() && (v0dVar = q0dVar2.g) != null) {
                u0d u0dVar = v0dVar.a;
                u0dVar.h();
                u0dVar.f();
            }
        }
    }

    @Override
    public final void run() {
        HashMap hashMap;
        h0d g;
        String str;
        switch (this.a) {
            case 0:
                a();
                return;
            case 1:
                this.b.e();
                return;
            case 2:
                z zVar = this.b;
                zVar.r.set(true);
                zVar.e();
                return;
            case 3:
                z zVar2 = this.b;
                zVar2.a0 = false;
                long j = zVar2.v;
                if (!zVar2.A && j != 0 && zVar2.o.get()) {
                    if (zVar2.L && SystemClock.uptimeMillis() - zVar2.Z > 15000) {
                        zVar2.c.f(j);
                        return;
                    }
                    zVar2.a0 = true;
                    zVar2.a.postDelayed(zVar2.b0, 5000L);
                    return;
                }
                return;
            case 4:
                z zVar3 = this.b;
                long j2 = zVar3.v;
                long nanoTime = System.nanoTime();
                long max = (long) (1.0E9d / Math.max(30.0f, hl.r));
                if (!zVar3.A && j2 != 0 && zVar3.L && zVar3.p.get() && nanoTime - zVar3.c0 >= (max * 9) / 10 && zVar3.o.compareAndSet(false, true)) {
                    zVar3.p.set(false);
                    zVar3.c0 = nanoTime;
                    zVar3.Z = SystemClock.uptimeMillis();
                    if (!zVar3.a0) {
                        zVar3.a0 = true;
                        zVar3.a.postDelayed(zVar3.b0, 5000L);
                    }
                    zVar3.c.j(j2, ((float) (nanoTime - zVar3.m)) / 1000000.0f, true, false, false);
                    return;
                }
                zVar3.e();
                return;
            case 5:
                z zVar4 = this.b;
                zVar4.y.set(false);
                float f = zVar4.x;
                if (!zVar4.A) {
                    zVar4.a.removeCallbacks(zVar4.X);
                    int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                    if (i > 0) {
                        zVar4.a.postDelayed(zVar4.X, (long) Math.ceil(Math.min(f, 3600000.0f)));
                        return;
                    } else if (i == 0) {
                        zVar4.e();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                z zVar5 = this.b;
                synchronized (zVar5.w) {
                    hashMap = new HashMap(zVar5.w);
                    zVar5.w.clear();
                }
                if (zVar5.T != null) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        q0d q0dVar = zVar5.T;
                        String str2 = (String) entry.getKey();
                        JSONObject jSONObject = (JSONObject) entry.getValue();
                        if (q0dVar.d != null && (g = k0d.g(q0dVar)) != null) {
                            String a = g.a();
                            JSONObject jSONObject2 = (JSONObject) k0d.c.get(a);
                            if (jSONObject2 == null) {
                                jSONObject2 = new JSONObject();
                            }
                            try {
                                jSONObject2.put(str2, jSONObject);
                            } catch (Exception unused) {
                            }
                            k0d.c.put(a, jSONObject2);
                            for (h0d h0dVar : k0d.a.values()) {
                                if (h0dVar.v != null && a.equals(h0dVar.a())) {
                                    q0d q0dVar2 = h0dVar.v;
                                    try {
                                        str = ob6.D0().y.toLanguageTag();
                                    } catch (Exception unused2) {
                                        str = null;
                                    }
                                    String jSONObject3 = jSONObject2.toString();
                                    q0dVar2.s = str;
                                    q0dVar2.t = jSONObject3;
                                }
                            }
                            if ("local".equals(str2)) {
                                k0d.d.put(a, g);
                                osa osaVar = k0d.e;
                                hl.r(osaVar);
                                hl.d3(osaVar, 1000L);
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }
}
