package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.utils.twidget.b;
import org.telegram.utils.twidget.z;
public final class bwc {
    public long A;
    public int B;
    public long C;
    public final String a;
    public final String b;
    public final Context c;
    public c6e d;
    public z e;
    public kwc f;
    public gwc g;
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

    public bwc(Context context, String str, String str2) {
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
            zVar = new z(this.c, this.b, mwc.d(this.l), null, null);
        } else {
            Context context = this.c;
            String str2 = this.b;
            if (str == null) {
                str = mwc.d(this.l);
            }
            zVar = new z(context, str2, str, this.s, this.t);
        }
        String str3 = "{\"data\":" + this.u + ",\"context\":" + this.v + "}";
        if (str3 != null) {
            zVar.j = str3;
            try {
                zVar.d = new pvc(new JSONObject(str3).optJSONObject("context"));
            } catch (Exception unused) {
                zVar.d = new pvc(null);
            }
        }
        zVar.f(this.w);
        zVar.z = this.A;
        zVar.R = this;
        zVar.T = this;
        if (this.m && !this.o) {
            z = true;
        } else {
            z = false;
        }
        zVar.g(z);
        this.e = zVar;
        this.p++;
        hwc.a.execute(new awc(zVar, this.i, (byte) 0));
    }

    public final void b(int i, String str, long j) {
        boolean z;
        byte[] bytes;
        z zVar = this.e;
        if (zVar != null) {
            pvc pvcVar = zVar.d;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            synchronized (pvcVar) {
                if (pvcVar.j && z) {
                    pvcVar.h = SystemClock.elapsedRealtime();
                }
                pvcVar.j = false;
                pvcVar.i = false;
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
            kwc kwcVar = zVar.N;
            if (kwcVar == null || (((i = zVar.M) != 0 && Math.abs(kwcVar.d - i) > 1) || !kwcVar.a())) {
                zVar.K = true;
                zVar.c.g(zVar.v);
            }
        }
    }

    public final kwc d() {
        kwc kwcVar;
        z zVar = this.e;
        if (zVar == null) {
            kwcVar = null;
        } else {
            kwcVar = zVar.N;
        }
        if (kwcVar != null && (this.f == null || zVar.B)) {
            return kwcVar;
        }
        kwc kwcVar2 = this.f;
        if (kwcVar2 != null && Math.abs(kwcVar2.d - this.i) <= 1) {
            return this.f;
        }
        if (kwcVar != null) {
            return kwcVar;
        }
        return this.f;
    }

    public final boolean e() {
        z zVar;
        kwc kwcVar;
        if (this.q != this.p && (zVar = this.e) != null && (kwcVar = zVar.N) != null) {
            if (kwcVar.h || zVar.F) {
                this.q = this.p;
                if (this.d != null) {
                    vvc.b();
                    svc g = vvc.g(this);
                    if (g != null) {
                        vvc.s(g);
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

    public final void f(String str) {
        if (this.d != null) {
            fa4.d("widget " + this.a + ": " + str);
        }
        gwc gwcVar = this.g;
        if (gwcVar != null) {
            gwcVar.a.g();
        }
    }

    public final void g(z zVar) {
        kwc kwcVar;
        Object[] objArr;
        svc g;
        gwc gwcVar;
        if (zVar == this.e && (kwcVar = zVar.N) != null) {
            if (this.f == null || zVar.B) {
                this.f = null;
                this.j = kwcVar.d;
                boolean z = kwcVar.i;
                boolean z2 = false;
                if (z != this.k) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                this.k = z;
                int max = Math.max(1, kwcVar.e);
                if (max != this.h) {
                    z2 = true;
                }
                this.h = max;
                gwc gwcVar2 = this.g;
                if (gwcVar2 != null) {
                    fwc fwcVar = gwcVar2.a;
                    if (z2) {
                        fwcVar.j();
                    }
                    fwcVar.g();
                }
                if ((z2 || objArr != null) && this.d != null && (g = vvc.g(this)) != null && this.h > 0) {
                    int e = vvc.e(this.j);
                    int max2 = Math.max(50, Math.min(600, vvc.e(this.h)));
                    boolean z3 = this.k;
                    if (e > 0 && g.f == 0 && !g.k && vvc.k(g.a()).a(e, max2, z3)) {
                        ad7 Y = ad7.Y(g.b);
                        Y.a.c(new ac7(Y, g.c, g.d, e, max2, z3 ? 1 : 0, (byte) 1));
                    }
                    zi9 zi9Var = g.u;
                    if (zi9Var != null) {
                        zi9Var.p0("frame off screen");
                    }
                }
                if (e() && !z2 && (gwcVar = this.g) != null) {
                    fwc fwcVar2 = gwcVar.a;
                    fwcVar2.j();
                    fwcVar2.g();
                }
            }
        }
    }

    public final void h(String str) {
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

    public final synchronized void i(float f, float f2, boolean z) {
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
        gl.d3(new frc(this, (byte) 9));
    }

    public final void j(String str) {
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

    public final void k(boolean z) {
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

    public final void l(int i) {
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

    public final void m() {
        this.n = false;
        if (this.e != null) {
            kwc d = d();
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
                    kwc kwcVar = zVar.O;
                    if (kwcVar != null) {
                        kwcVar.a.b();
                    }
                    zVar.O = null;
                    zVar.P = null;
                }
                long j = zVar.v;
                zVar.v = 0L;
                if (j != 0) {
                    hwc.a.execute(new sma(zVar, j, (byte) 10));
                }
            }
            this.e = null;
            if (this.z) {
                this.z = false;
                c6e c6eVar = this.d;
                if (c6eVar != null) {
                    c6eVar.getClass();
                    vvc.E();
                }
            }
        }
    }
}
