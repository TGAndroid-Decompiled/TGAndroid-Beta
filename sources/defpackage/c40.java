package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class c40 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public c40(Context context, byte b) {
        switch (b) {
            case 2:
                this.b = context;
                this.c = r00.f;
                return;
            default:
                this.d = e40.a;
                this.a = true;
                this.g = h40.H;
                this.b = context;
                return;
        }
    }

    public static void n(nv4 nv4Var) {
        ?? obj = new Object();
        obj.b = new dw2(obj, (byte) 0);
        obj.d = nv4Var;
        int i = z8c.t0;
        obj.g = new xf2(obj, (byte) 14);
        obj.f = bw2.r(i);
        obj.e = nm7.f(i);
        obj.c = new Handler(Looper.myLooper());
        if (!obj.o(false)) {
            ((nm7) obj.e).a((dw2) obj.b, nm7.N);
            ((Handler) obj.c).postDelayed((xf2) obj.g, 1000L);
        }
    }

    public final c40 a(y6a y6aVar) {
        c40 c40Var;
        c40[] c40VarArr = (c40[]) this.e;
        y6aVar.getClass();
        lw5 lw5Var = (lw5) this.c;
        v0d b = n0f.b(lw5Var, y6aVar);
        char c = b.a;
        m41 m41Var = (m41) this.b;
        m41Var.k(c);
        m41Var.b = true;
        String str = (String) this.f;
        if (str != null) {
            String str2 = (String) this.g;
            if (str2 == null) {
                str2 = y6aVar.a();
            }
            m41Var.j();
            m41Var.m(str);
            m41Var.k(':');
            k(str2);
            this.f = null;
            this.g = null;
        }
        if (((v0d) this.d) == b) {
            return this;
        }
        if (c40VarArr != null && (c40Var = c40VarArr[b.ordinal()]) != null) {
            return c40Var;
        }
        return new c40(m41Var, lw5Var, b, c40VarArr);
    }

    public final cb3 b() {
        boolean z;
        r00 r00Var;
        Context context = (Context) this.b;
        boolean z2 = true;
        jte.p(!this.a);
        this.a = true;
        if (((mx6) this.d) == null) {
            this.d = new mx6(new p30[0]);
        }
        l50 l50Var = (l50) this.f;
        ya3 ya3Var = (ya3) this.g;
        if (l50Var == null) {
            if (ya3Var == null) {
                this.g = new ya3(context);
            }
            if (((kg7) this.e) == null) {
                this.e = kg7.b;
            }
            xvc xvcVar = new xvc(context);
            if (context != null) {
                r00Var = null;
            } else {
                r00Var = (r00) this.c;
            }
            Context context2 = (Context) xvcVar.b;
            if (context2 == null) {
                xvcVar.e = r00Var;
            }
            ya3 ya3Var2 = (ya3) this.g;
            xvcVar.c = ya3Var2;
            xvcVar.d = (kg7) this.e;
            if (ya3Var2 == null) {
                xvcVar.c = new ya3(context2);
            }
            this.f = new l50(xvcVar);
        } else {
            if (ya3Var == null) {
                z = true;
            } else {
                z = false;
            }
            jte.p(z);
            if (((kg7) this.e) != null) {
                z2 = false;
            }
            jte.p(z2);
        }
        return new cb3(this);
    }

    public final void c(y6a y6aVar, int i) {
        m41 m41Var = (m41) this.b;
        y6aVar.getClass();
        int ordinal = ((v0d) this.d).ordinal();
        boolean z = true;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (!m41Var.b) {
                        m41Var.k(',');
                    }
                    m41Var.j();
                    mcd.a((lw5) this.c, y6aVar);
                    k(y6aVar.g(i));
                    m41Var.k(':');
                    m41Var.n();
                    return;
                }
                if (i == 0) {
                    this.a = true;
                }
                if (i == 1) {
                    m41Var.k(',');
                    m41Var.n();
                    this.a = false;
                    return;
                }
                return;
            } else if (!m41Var.b) {
                if (i % 2 == 0) {
                    m41Var.k(',');
                    m41Var.j();
                } else {
                    m41Var.k(':');
                    m41Var.n();
                    z = false;
                }
                this.a = z;
                return;
            } else {
                this.a = true;
                m41Var.j();
                return;
            }
        }
        if (!m41Var.b) {
            m41Var.k(',');
        }
        m41Var.j();
    }

    public final void d(int i) {
        if (this.a) {
            k(String.valueOf(i));
        } else {
            ((vk1) ((m41) this.b).c).c(String.valueOf(i));
        }
    }

    public final void e(long j) {
        if (this.a) {
            k(String.valueOf(j));
        } else {
            ((vk1) ((m41) this.b).c).c(String.valueOf(j));
        }
    }

    public final void f(y6a y6aVar, int i, long j) {
        y6aVar.getClass();
        c(y6aVar, i);
        e(j);
    }

    public final void g() {
        ((vk1) ((m41) this.b).c).c("null");
    }

    public final void h(y6a y6aVar, int i, cx5 cx5Var, Object obj) {
        y6aVar.getClass();
        cx5Var.getClass();
        y6aVar.getClass();
        cx5Var.getClass();
        c(y6aVar, i);
        if (cx5Var.d().c()) {
            j(cx5Var, obj);
        } else if (obj == null) {
            g();
        } else {
            j(cx5Var, obj);
        }
    }

    public final void i(y6a y6aVar, int i, cx5 cx5Var, Object obj) {
        y6aVar.getClass();
        cx5Var.getClass();
        c(y6aVar, i);
        j(cx5Var, obj);
    }

    public final void j(defpackage.cx5 r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c40.j(cx5, java.lang.Object):void");
    }

    public final void k(String str) {
        str.getClass();
        ((m41) this.b).m(str);
    }

    public final void l(y6a y6aVar) {
        y6aVar.getClass();
        m41 m41Var = (m41) this.b;
        m41Var.b = false;
        m41Var.k(((v0d) this.d).b);
    }

    public final void m() {
        ArrayList arrayList = (ArrayList) this.g;
        for (int i = 0; i < arrayList.size(); i++) {
            ((View) arrayList.get(i)).invalidate();
        }
    }

    public final boolean o(boolean z) {
        if (!this.a) {
            if (((bw2) this.f).h || z) {
                nm7 nm7Var = (nm7) this.e;
                if (nm7Var != null) {
                    nm7Var.n((dw2) this.b, nm7.N);
                }
                Handler handler = (Handler) this.c;
                if (handler != null) {
                    handler.removeCallbacks((xf2) this.g);
                }
                this.a = true;
                nv4 nv4Var = (nv4) this.d;
                Intent intent = (Intent) nv4Var.c;
                String str = LaunchActivity.C1;
                ((LaunchActivity) nv4Var.b).V(intent, true, false, false, null, true, false);
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean p(y6a y6aVar) {
        return false;
    }

    public c40(m41 m41Var, lw5 lw5Var, v0d v0dVar, c40[] c40VarArr) {
        this.b = m41Var;
        this.c = lw5Var;
        this.d = v0dVar;
        this.e = c40VarArr;
        int ordinal = v0dVar.ordinal();
        if (c40VarArr != null) {
            c40 c40Var = c40VarArr[ordinal];
            if (c40Var == null && c40Var == this) {
                return;
            }
            c40VarArr[ordinal] = this;
        }
    }
}
