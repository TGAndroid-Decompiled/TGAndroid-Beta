package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.utils.twidget.z;
public final class iwc implements Runnable {
    public final byte a;
    public final z b;

    public iwc(z zVar, byte b) {
        this.a = b;
        this.b = zVar;
    }

    private final void a() {
        kwc kwcVar;
        JSONObject jSONObject;
        bwc bwcVar;
        bwc bwcVar2;
        gwc gwcVar;
        z zVar;
        boolean z;
        String str;
        svc g;
        int i;
        double d;
        int i2;
        int i3;
        z zVar2 = this.b;
        synchronized (zVar2.s) {
            kwcVar = zVar2.O;
            zVar2.O = null;
            jSONObject = zVar2.P;
            zVar2.P = null;
            zVar2.Q = false;
        }
        if (zVar2.A) {
            if (kwcVar != null) {
                kwcVar.a.b();
                return;
            }
            return;
        }
        if (kwcVar != null && (i3 = zVar2.M) != 0 && Math.abs(kwcVar.d - i3) > 1) {
            kwcVar.a.b();
            zVar2.K = false;
            kwcVar = null;
        }
        if (kwcVar != null) {
            zVar2.N = kwcVar;
            zVar2.K = false;
            bwc bwcVar3 = zVar2.R;
            if (bwcVar3 != null) {
                bwcVar3.g(zVar2);
            }
        }
        if (jSONObject != null && (bwcVar = zVar2.R) != null) {
            String str2 = bwcVar.a;
            if (bwcVar.d != null) {
                svc g2 = vvc.g(bwcVar);
                if (w01.a && g2 != null) {
                    int optInt = jSONObject.optInt("throttled");
                    double optDouble = jSONObject.optDouble("jsMs", 0.0d);
                    double optDouble2 = jSONObject.optDouble("validatorMs", 0.0d);
                    z = true;
                    str = str2;
                    double optDouble3 = jSONObject.optDouble("queryMs", 0.0d);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i4 = g2.D;
                    int i5 = bwcVar.p;
                    if (i4 == i5 && optInt >= (i2 = g2.E)) {
                        d = optDouble3;
                        i = i2;
                        bwcVar2 = bwcVar;
                    } else {
                        g2.D = i5;
                        i = 0;
                        g2.E = 0;
                        bwcVar2 = bwcVar;
                        d = optDouble3;
                        g2.H = 0.0d;
                        g2.G = 0.0d;
                        g2.F = 0.0d;
                        g2.I = elapsedRealtime;
                    }
                    if (optInt > i) {
                        if (elapsedRealtime - g2.I >= 5000) {
                            StringBuilder p = ug8.p("widget ", str, " held by the CPU quota: ");
                            p.append(optInt - g2.E);
                            p.append(" tasks deferred in ");
                            p.append(elapsedRealtime - g2.I);
                            p.append(" ms (JavaScript ");
                            p.append(Math.round(optDouble - g2.F));
                            p.append(" ms, validator ");
                            p.append(Math.round(optDouble2 - g2.G));
                            p.append(" ms, layout queries ");
                            p.append(Math.round(d - g2.H));
                            p.append(" ms; ");
                            p.append(optInt);
                            p.append(" deferred in all); last: ");
                            p.append(jSONObject.optString("throttle"));
                            fa4.b(p.toString());
                            g2.E = optInt;
                        }
                    }
                    g2.F = optDouble;
                    g2.G = optDouble2;
                    g2.H = d;
                    g2.I = elapsedRealtime;
                } else {
                    bwcVar2 = bwcVar;
                    z = true;
                    str = str2;
                }
                String optString = jSONObject.optString("dead");
                if (!TextUtils.isEmpty(optString) && (g = vvc.g(bwcVar2)) != null) {
                    int i6 = g.C;
                    int i7 = bwcVar2.p;
                    if (i6 != i7) {
                        g.C = i7;
                        g.B++;
                        g.J = z;
                        StringBuilder p2 = ug8.p("widget ", str, " stopped (");
                        p2.append(g.B);
                        p2.append("): ");
                        p2.append(optString);
                        fa4.b(p2.toString());
                        vvc.s(g);
                        vvc.b();
                    }
                }
            } else {
                bwcVar2 = bwcVar;
            }
            if (jSONObject.optBoolean("loaded") && bwcVar2.f != null && (zVar = bwcVar2.e) != null) {
                bwcVar2.g(zVar);
            } else if (bwcVar2.e() && (gwcVar = bwcVar2.g) != null) {
                fwc fwcVar = gwcVar.a;
                fwcVar.j();
                fwcVar.g();
            }
        }
    }

    @Override
    public final void run() {
        HashMap hashMap;
        svc g;
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
                long max = (long) (1.0E9d / Math.max(30.0f, gl.r));
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
                        bwc bwcVar = zVar5.T;
                        String str2 = (String) entry.getKey();
                        JSONObject jSONObject = (JSONObject) entry.getValue();
                        if (bwcVar.d != null && (g = vvc.g(bwcVar)) != null) {
                            String a = g.a();
                            JSONObject jSONObject2 = (JSONObject) vvc.c.get(a);
                            if (jSONObject2 == null) {
                                jSONObject2 = new JSONObject();
                            }
                            try {
                                jSONObject2.put(str2, jSONObject);
                            } catch (Exception unused) {
                            }
                            vvc.c.put(a, jSONObject2);
                            for (svc svcVar : vvc.a.values()) {
                                if (svcVar.t != null && a.equals(svcVar.a())) {
                                    bwc bwcVar2 = svcVar.t;
                                    try {
                                        str = k96.D0().y.toLanguageTag();
                                    } catch (Exception unused2) {
                                        str = null;
                                    }
                                    String jSONObject3 = jSONObject2.toString();
                                    bwcVar2.s = str;
                                    bwcVar2.t = jSONObject3;
                                }
                            }
                            if ("local".equals(str2)) {
                                vvc.d.put(a, g);
                                cza czaVar = vvc.e;
                                gl.r(czaVar);
                                gl.d3(czaVar, 1000L);
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }
}
