package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class c30 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public c30(Context context, byte b) {
        switch (b) {
            case 2:
                this.b = context;
                this.c = rz.f;
                return;
            default:
                this.d = e30.a;
                this.a = true;
                this.g = h30.H;
                this.b = context;
                return;
        }
    }

    public static void n(h45 h45Var) {
        ?? obj = new Object();
        obj.b = new su2(obj, (byte) 0);
        obj.d = h45Var;
        int i = y6c.t0;
        obj.g = new mk2(obj, (byte) 9);
        obj.f = qu2.r(i);
        obj.e = kk7.f(i);
        obj.c = new Handler(Looper.myLooper());
        if (!obj.o(false)) {
            ((kk7) obj.e).a((su2) obj.b, kk7.N);
            ((Handler) obj.c).postDelayed((mk2) obj.g, 1000L);
        }
    }

    public final c30 a(w4a w4aVar) {
        c30 c30Var;
        c30[] c30VarArr = (c30[]) this.e;
        w4aVar.getClass();
        lu5 lu5Var = (lu5) this.c;
        uyc b = lye.b(lu5Var, w4aVar);
        char c = b.a;
        e31 e31Var = (e31) this.b;
        e31Var.l(c);
        e31Var.b = true;
        String str = (String) this.f;
        if (str != null) {
            String str2 = (String) this.g;
            if (str2 == null) {
                str2 = w4aVar.a();
            }
            e31Var.k();
            e31Var.m(str);
            e31Var.l(':');
            k(str2);
            this.f = null;
            this.g = null;
        }
        if (((uyc) this.d) == b) {
            return this;
        }
        if (c30VarArr != null && (c30Var = c30VarArr[b.ordinal()]) != null) {
            return c30Var;
        }
        return new c30(e31Var, lu5Var, b, c30VarArr);
    }

    public final q93 b() {
        boolean z;
        Context context;
        Context context2 = (Context) this.b;
        boolean z2 = true;
        gre.p(!this.a);
        this.a = true;
        if (((mv6) this.d) == null) {
            this.d = new mv6(new p20[0]);
        }
        l40 l40Var = (l40) this.f;
        m93 m93Var = (m93) this.g;
        if (l40Var == null) {
            if (m93Var == null) {
                this.g = new m93(context2);
            }
            if (((ie7) this.e) == null) {
                this.e = ie7.b;
            }
            ?? obj = new Object();
            rz rzVar = null;
            if (context2 != null) {
                context = context2.getApplicationContext();
            } else {
                context = null;
            }
            obj.a = context;
            obj.c = ie7.b;
            if (context2 == null) {
                obj.d = rz.f;
            }
            if (context2 == null) {
                rzVar = (rz) this.c;
            }
            Context context3 = (Context) obj.a;
            if (context3 == null) {
                obj.d = rzVar;
            }
            m93 m93Var2 = (m93) this.g;
            obj.b = m93Var2;
            obj.c = (ie7) this.e;
            if (m93Var2 == null) {
                obj.b = new m93(context3);
            }
            this.f = new l40(obj);
        } else {
            if (m93Var == null) {
                z = true;
            } else {
                z = false;
            }
            gre.p(z);
            if (((ie7) this.e) != null) {
                z2 = false;
            }
            gre.p(z2);
        }
        return new q93(this);
    }

    public final void c(w4a w4aVar, int i) {
        e31 e31Var = (e31) this.b;
        w4aVar.getClass();
        int ordinal = ((uyc) this.d).ordinal();
        boolean z = true;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (!e31Var.b) {
                        e31Var.l(',');
                    }
                    e31Var.k();
                    kad.a((lu5) this.c, w4aVar);
                    k(w4aVar.g(i));
                    e31Var.l(':');
                    e31Var.n();
                    return;
                }
                if (i == 0) {
                    this.a = true;
                }
                if (i == 1) {
                    e31Var.l(',');
                    e31Var.n();
                    this.a = false;
                    return;
                }
                return;
            } else if (!e31Var.b) {
                if (i % 2 == 0) {
                    e31Var.l(',');
                    e31Var.k();
                } else {
                    e31Var.l(':');
                    e31Var.n();
                    z = false;
                }
                this.a = z;
                return;
            } else {
                this.a = true;
                e31Var.k();
                return;
            }
        }
        if (!e31Var.b) {
            e31Var.l(',');
        }
        e31Var.k();
    }

    public final void d(int i) {
        if (this.a) {
            k(String.valueOf(i));
        } else {
            ((nj1) ((e31) this.b).c).c(String.valueOf(i));
        }
    }

    public final void e(long j) {
        if (this.a) {
            k(String.valueOf(j));
        } else {
            ((nj1) ((e31) this.b).c).c(String.valueOf(j));
        }
    }

    public final void f(w4a w4aVar, int i, long j) {
        w4aVar.getClass();
        c(w4aVar, i);
        e(j);
    }

    public final void g() {
        ((nj1) ((e31) this.b).c).c("null");
    }

    public final void h(w4a w4aVar, int i, cv5 cv5Var, Object obj) {
        w4aVar.getClass();
        cv5Var.getClass();
        w4aVar.getClass();
        cv5Var.getClass();
        c(w4aVar, i);
        if (cv5Var.d().c()) {
            j(cv5Var, obj);
        } else if (obj == null) {
            g();
        } else {
            j(cv5Var, obj);
        }
    }

    public final void i(w4a w4aVar, int i, cv5 cv5Var, Object obj) {
        w4aVar.getClass();
        cv5Var.getClass();
        c(w4aVar, i);
        j(cv5Var, obj);
    }

    public final void j(defpackage.cv5 r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c30.j(cv5, java.lang.Object):void");
    }

    public final void k(String str) {
        str.getClass();
        ((e31) this.b).m(str);
    }

    public final void l(w4a w4aVar) {
        w4aVar.getClass();
        e31 e31Var = (e31) this.b;
        e31Var.b = false;
        e31Var.l(((uyc) this.d).b);
    }

    public final void m() {
        ArrayList arrayList = (ArrayList) this.g;
        for (int i = 0; i < arrayList.size(); i++) {
            ((View) arrayList.get(i)).invalidate();
        }
    }

    public final boolean o(boolean z) {
        if (!this.a) {
            if (((qu2) this.f).h || z) {
                kk7 kk7Var = (kk7) this.e;
                if (kk7Var != null) {
                    kk7Var.n((su2) this.b, kk7.N);
                }
                Handler handler = (Handler) this.c;
                if (handler != null) {
                    handler.removeCallbacks((mk2) this.g);
                }
                this.a = true;
                h45 h45Var = (h45) this.d;
                Intent intent = (Intent) h45Var.c;
                String str = LaunchActivity.C1;
                ((LaunchActivity) h45Var.b).V(intent, true, false, false, null, true, false);
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean p(w4a w4aVar) {
        return false;
    }

    public c30(e31 e31Var, lu5 lu5Var, uyc uycVar, c30[] c30VarArr) {
        this.b = e31Var;
        this.c = lu5Var;
        this.d = uycVar;
        this.e = c30VarArr;
        int ordinal = uycVar.ordinal();
        if (c30VarArr != null) {
            c30 c30Var = c30VarArr[ordinal];
            if (c30Var == null && c30Var == this) {
                return;
            }
            c30VarArr[ordinal] = this;
        }
    }
}
