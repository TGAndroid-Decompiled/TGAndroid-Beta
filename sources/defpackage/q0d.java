package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.utils.twidget.b;
import org.telegram.utils.twidget.z;
public final class q0d {
    public long A;
    public int B;
    public long C;
    public final String a;
    public final String b;
    public final Context c;
    public z3f d;
    public z e;
    public a1d f;
    public v0d g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public String r;
    public String s;
    public String t;
    public volatile String w;
    public boolean x;
    public boolean y;
    public boolean z;
    public String u = "{}";
    public String v = "{}";
    public boolean l = false;

    public q0d(Context context, String str, String str2) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = str2;
    }

    public final void a() {
        z zVar;
        boolean z;
        if (this.n || z.a()) {
            return;
        }
        this.n = true;
        z zVar2 = this.e;
        if (zVar2 != null) {
            zVar2.I = true;
            return;
        }
        String str = this.r;
        if (str == null && this.s == null && this.t == null) {
            zVar = new z(this.c, this.b, c1d.d(this.l), null, null);
        } else {
            Context context = this.c;
            String str2 = this.b;
            if (str == null) {
                str = c1d.d(this.l);
            }
            zVar = new z(context, str2, str, this.s, this.t);
        }
        String str3 = "{\"data\":" + this.u + ",\"context\":" + this.v + "}";
        boolean z2 = false;
        if (str3 != null) {
            zVar.j = str3;
            try {
                JSONObject optJSONObject = new JSONObject(str3).optJSONObject("context");
                if (optJSONObject != null && "profile".equals(optJSONObject.optString("surface"))) {
                    z = true;
                } else {
                    z = false;
                }
                zVar.e0 = z;
                zVar.d = new e0d(optJSONObject);
            } catch (Exception unused) {
                zVar.d = new e0d(null);
            }
        }
        zVar.f(this.w);
        zVar.z = this.A;
        zVar.R = this;
        zVar.T = this;
        if (this.m && !this.o) {
            z2 = true;
        }
        zVar.g(z2);
        this.e = zVar;
        this.p++;
        w0d.a.execute(new zsc(zVar, this.i, (byte) 3));
    }

    public final void b(int i, String str, long j) {
        boolean z;
        byte[] bytes;
        z zVar = this.e;
        if (zVar != null) {
            e0d e0dVar = zVar.d;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            synchronized (e0dVar) {
                if (e0dVar.j && z) {
                    e0dVar.h = SystemClock.elapsedRealtime();
                }
                e0dVar.j = false;
                e0dVar.i = false;
            }
            long j2 = zVar.v;
            if (!zVar.A && j2 != 0) {
                b bVar = zVar.c;
                if (str == null) {
                    bytes = null;
                } else {
                    bytes = str.getBytes(StandardCharsets.UTF_8);
                }
                bVar.a(j2, j, i, bytes);
            }
        }
    }

    public final void c() {
        int i;
        z zVar = this.e;
        if (zVar != null && !zVar.A && zVar.v != 0 && !zVar.K) {
            a1d a1dVar = zVar.N;
            if (a1dVar == null || (((i = zVar.M) != 0 && Math.abs(a1dVar.d - i) > 1) || !a1dVar.a())) {
                zVar.K = true;
                zVar.c.g(zVar.v);
            }
        }
    }

    public final a1d d() {
        a1d a1dVar;
        z zVar = this.e;
        if (zVar == null) {
            a1dVar = null;
        } else {
            a1dVar = zVar.N;
        }
        if (a1dVar != null && (this.f == null || zVar.B)) {
            return a1dVar;
        }
        a1d a1dVar2 = this.f;
        if (a1dVar2 != null && Math.abs(a1dVar2.d - this.i) <= 1) {
            return this.f;
        }
        if (a1dVar != null) {
            return a1dVar;
        }
        return this.f;
    }

    public final boolean e() {
        a1d a1dVar;
        z zVar = this.e;
        if (zVar != null && (a1dVar = zVar.N) != null) {
            if (a1dVar.h || zVar.F) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean f() {
        z zVar;
        a1d a1dVar;
        if (this.q != this.p && (zVar = this.e) != null && (a1dVar = zVar.N) != null) {
            if (a1dVar.h || zVar.F) {
                this.q = this.p;
                if (this.d != null) {
                    k0d.b();
                    h0d g = k0d.g(this);
                    if (g != null) {
                        k0d.s(g);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g(String str) {
        if (this.d != null) {
            cc4.d("widget " + this.a + ": " + str);
        }
        v0d v0dVar = this.g;
        if (v0dVar != null) {
            v0dVar.a.f();
        }
    }

    public final void h(z zVar) {
        a1d a1dVar;
        Object[] objArr;
        h0d g;
        v0d v0dVar;
        if (zVar == this.e && (a1dVar = zVar.N) != null) {
            if (this.f == null || zVar.B) {
                this.f = null;
                this.j = a1dVar.d;
                boolean z = a1dVar.i;
                boolean z2 = false;
                if (z != this.k) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                this.k = z;
                int max = Math.max(1, a1dVar.e);
                if (max != this.h) {
                    z2 = true;
                }
                this.h = max;
                v0d v0dVar2 = this.g;
                if (v0dVar2 != null) {
                    u0d u0dVar = v0dVar2.a;
                    if (z2) {
                        u0dVar.h();
                    }
                    u0dVar.f();
                }
                if ((z2 || objArr != null) && this.d != null && (g = k0d.g(this)) != null && this.h > 0) {
                    int e = k0d.e(this.j);
                    int max2 = Math.max(50, Math.min(600, k0d.e(this.h)));
                    boolean z3 = this.k;
                    if (e > 0 && g.f == 0 && !g.k && !g.o && k0d.k(g.a()).a(e, max2, z3)) {
                        jf7 Y = jf7.Y(g.b);
                        Y.a.c(new zc7(Y, g.c, g.d, e, max2, z3 ? 1 : 0, (byte) 2));
                    }
                    nm9 nm9Var = g.w;
                    if (nm9Var != null) {
                        nm9Var.o0("frame off screen");
                    }
                }
                if (f() && !z2 && (v0dVar = this.g) != null) {
                    u0d u0dVar2 = v0dVar.a;
                    u0dVar2.h();
                    u0dVar2.f();
                }
            }
        }
    }

    public final void i(String str) {
        if (str != null && !str.equals(this.u)) {
            this.u = str;
            z zVar = this.e;
            if (zVar != null) {
                long j = zVar.v;
                if (!zVar.A && j != 0) {
                    zVar.c.c(j, str.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    public final synchronized void j(float f, float f2, boolean z) {
        boolean z2;
        if (f > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (this.x && z2 == this.y) {
                return;
            }
        }
        this.x = z;
        this.y = z2;
        String format = String.format(Locale.US, "{\"top\":0,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":%.2f}", Float.valueOf(f), Float.valueOf(f2));
        if (format.equals(this.w)) {
            return;
        }
        this.w = format;
        hl.c3(new p0d(this, (byte) 0));
    }

    public final void k(String str) {
        if (str != null && !str.equals(this.r)) {
            this.r = str;
            this.l = str.contains("\"dark\"");
            z zVar = this.e;
            if (zVar != null && !zVar.A && str != null && !str.equals(zVar.H)) {
                zVar.H = str;
                str.contains("\"dark\"");
                long j = zVar.v;
                if (j != 0) {
                    zVar.c.i(j, str.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    public final void l(boolean z) {
        boolean z2;
        this.m = z;
        z zVar = this.e;
        if (zVar != null) {
            if (z && !this.o) {
                z2 = true;
            } else {
                z2 = false;
            }
            zVar.g(z2);
        }
    }

    public final void m(int i) {
        if (i > 0 && i != this.i) {
            this.i = i;
            z zVar = this.e;
            if (zVar != null && i > 0 && i != zVar.M && !zVar.A) {
                zVar.M = i;
                long j = zVar.v;
                if (j != 0) {
                    zVar.c.m(j, i / zVar.l);
                }
            }
        }
    }

    public final void n() {
        this.n = false;
        if (this.e != null) {
            a1d d = d();
            if (d != null) {
                this.f = d;
            }
            z zVar = this.e;
            if (!zVar.A) {
                zVar.A = true;
                zVar.R = null;
                zVar.a.removeCallbacks(zVar.W);
                zVar.a.removeCallbacks(zVar.V);
                zVar.a.removeCallbacks(zVar.X);
                zVar.a.removeCallbacks(zVar.b0);
                if (zVar.J) {
                    Choreographer.getInstance().removeFrameCallback(zVar.Y);
                }
                zVar.J = false;
                synchronized (zVar.s) {
                    a1d a1dVar = zVar.O;
                    if (a1dVar != null) {
                        a1dVar.a.b();
                    }
                    zVar.O = null;
                    zVar.P = null;
                }
                long j = zVar.v;
                zVar.v = 0L;
                if (j != 0) {
                    w0d.a.execute(new pqa(zVar, j, (byte) 9));
                }
            }
            this.e = null;
            if (this.z) {
                this.z = false;
                z3f z3fVar = this.d;
                if (z3fVar != null) {
                    z3fVar.getClass();
                    k0d.F();
                }
            }
        }
    }
}
