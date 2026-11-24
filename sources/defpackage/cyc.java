package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.utils.twidget.b;
import org.telegram.utils.twidget.z;
public final class cyc {
    public long A;
    public int B;
    public long C;
    public final String a;
    public final String b;
    public final Context c;
    public f8e d;
    public z e;
    public lyc f;
    public hyc g;
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

    public cyc(Context context, String str, String str2) {
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
            zVar = new z(this.c, this.b, nyc.d(this.l), null, null);
        } else {
            Context context = this.c;
            String str2 = this.b;
            if (str == null) {
                str = nyc.d(this.l);
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
                zVar.d = new qxc(optJSONObject);
            } catch (Exception unused) {
                zVar.d = new qxc(null);
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
        iyc.a.execute(new zrc(zVar, this.i, (byte) 2));
    }

    public final void b(int i, String str, long j) {
        boolean z;
        byte[] bytes;
        z zVar = this.e;
        if (zVar != null) {
            qxc qxcVar = zVar.d;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            synchronized (qxcVar) {
                if (qxcVar.j && z) {
                    qxcVar.h = SystemClock.elapsedRealtime();
                }
                qxcVar.j = false;
                qxcVar.i = false;
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
            lyc lycVar = zVar.N;
            if (lycVar == null || (((i = zVar.M) != 0 && Math.abs(lycVar.d - i) > 1) || !lycVar.a())) {
                zVar.K = true;
                zVar.c.g(zVar.v);
            }
        }
    }

    public final lyc d() {
        lyc lycVar;
        z zVar = this.e;
        if (zVar == null) {
            lycVar = null;
        } else {
            lycVar = zVar.N;
        }
        if (lycVar != null && (this.f == null || zVar.B)) {
            return lycVar;
        }
        lyc lycVar2 = this.f;
        if (lycVar2 != null && Math.abs(lycVar2.d - this.i) <= 1) {
            return this.f;
        }
        if (lycVar != null) {
            return lycVar;
        }
        return this.f;
    }

    public final boolean e() {
        lyc lycVar;
        z zVar = this.e;
        if (zVar != null && (lycVar = zVar.N) != null) {
            if (lycVar.h || zVar.F) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean f() {
        z zVar;
        lyc lycVar;
        if (this.q != this.p && (zVar = this.e) != null && (lycVar = zVar.N) != null) {
            if (lycVar.h || zVar.F) {
                this.q = this.p;
                if (this.d != null) {
                    wxc.b();
                    txc g = wxc.g(this);
                    if (g != null) {
                        wxc.s(g);
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
            fc4.d("widget " + this.a + ": " + str);
        }
        hyc hycVar = this.g;
        if (hycVar != null) {
            hycVar.a.f();
        }
    }

    public final void h(z zVar) {
        lyc lycVar;
        Object[] objArr;
        txc g;
        hyc hycVar;
        if (zVar == this.e && (lycVar = zVar.N) != null) {
            if (this.f == null || zVar.B) {
                this.f = null;
                this.j = lycVar.d;
                boolean z = lycVar.i;
                boolean z2 = false;
                if (z != this.k) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                this.k = z;
                int max = Math.max(1, lycVar.e);
                if (max != this.h) {
                    z2 = true;
                }
                this.h = max;
                hyc hycVar2 = this.g;
                if (hycVar2 != null) {
                    gyc gycVar = hycVar2.a;
                    if (z2) {
                        gycVar.h();
                    }
                    gycVar.f();
                }
                if ((z2 || objArr != null) && this.d != null && (g = wxc.g(this)) != null && this.h > 0) {
                    int e = wxc.e(this.j);
                    int max2 = Math.max(50, Math.min(600, wxc.e(this.h)));
                    boolean z3 = this.k;
                    if (e > 0 && g.f == 0 && !g.k && !g.o && wxc.k(g.a()).a(e, max2, z3)) {
                        cf7 Y = cf7.Y(g.b);
                        Y.a.c(new ce7(Y, g.c, g.d, e, max2, z3 ? 1 : 0, (byte) 1));
                    }
                    al9 al9Var = g.w;
                    if (al9Var != null) {
                        al9Var.o0("frame off screen");
                    }
                }
                if (f() && !z2 && (hycVar = this.g) != null) {
                    gyc gycVar2 = hycVar.a;
                    gycVar2.h();
                    gycVar2.f();
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
        gm.c3(new byc(this, (byte) 0));
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
            lyc d = d();
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
                    lyc lycVar = zVar.O;
                    if (lycVar != null) {
                        lycVar.a.b();
                    }
                    zVar.O = null;
                    zVar.P = null;
                }
                long j = zVar.v;
                zVar.v = 0L;
                if (j != 0) {
                    iyc.a.execute(new toa(zVar, j, (byte) 10));
                }
            }
            this.e = null;
            if (this.z) {
                this.z = false;
                f8e f8eVar = this.d;
                if (f8eVar != null) {
                    f8eVar.getClass();
                    wxc.F();
                }
            }
        }
    }
}
