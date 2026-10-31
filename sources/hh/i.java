package hh;

import ag.l;
import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import fe.n;
import fe.o;
import org.telegram.messenger.i0;
import org.telegram.messenger.w0;
import org.telegram.ui.ActionBar.m1;
import r0.g1;
import r0.j1;
public class i implements g, f, d {
    public e D;
    public View E;
    public int F;
    public int G;
    public final fe.f f7695a;
    public final n f7696b = new n(0.0f);
    public final o f7697c = new o();
    public final o d = new o();
    public final e2.f e = new e2.f(null);
    public final c f7698f;
    public final Runnable h;
    public boolean f7699n;
    public j1 f7700r;
    public int f7701s;
    public int f7702w;
    public int f7703x;
    public final h f7704y;

    public i(Runnable runnable) {
        l lVar = new l(this, 10);
        ?? obj = new Object();
        obj.f7689c = b.f7684a;
        obj.d = new gg.c((Object) obj, 2);
        obj.f7688b = lVar;
        Typeface typeface = i0.f15999a;
        float f7 = 1.0f;
        try {
            f7 = Settings.Global.getFloat(w0.f19025b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        obj.f7687a = f7 * 250.0f * 1.1f;
        this.f7698f = obj;
        this.f7701s = 1;
        this.f7704y = new h(this, 0);
        this.h = runnable;
        this.f7695a = new fe.f(0, new hf.b(this, runnable, false, 22), m1.f20561w, 250L);
    }

    @Override
    public final void P() {
        View view = this.E;
        if (view != null) {
            view.postOnAnimation(new h(this, 1));
        }
    }

    @Override
    public final View R() {
        return this.E;
    }

    public final void a() {
        boolean z10 = this.f7695a.h;
        boolean z11 = this.f7699n;
        e2.f fVar = this.e;
        if (!z11 && z10) {
            this.f7699n = true;
            fVar.d();
        }
        if (this.f7699n && !z10) {
            this.f7699n = false;
            fVar.e();
        }
    }

    public final float c() {
        e eVar = this.D;
        o oVar = this.d;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, oVar.d.f7048a);
        }
        return oVar.d.f7048a;
    }

    public final float d() {
        e eVar = this.D;
        o oVar = this.f7697c;
        if (eVar != null && this.G > 0) {
            return Math.max(this.F, oVar.d.f7048a);
        }
        return oVar.d.f7048a;
    }

    public final int e() {
        if (this.D != null && this.G > 0) {
            return Math.max(this.F, Math.max(f(527).d, this.f7702w));
        }
        return Math.max(f(527).d, this.f7702w);
    }

    public final i0.c f(int i10) {
        j1 j1Var = this.f7700r;
        if (j1Var != null) {
            return j1Var.f46132a.f(i10);
        }
        return i0.c.e;
    }

    public final void g(int i10) {
        if (this.f7702w == i10 && this.f7701s == 0) {
            return;
        }
        i0.r(this.f7704y);
        this.f7703x = Math.max(this.f7702w, i10);
        this.f7702w = i10;
        this.f7701s = 0;
        j(this.f7700r);
    }

    public final void h(int i10) {
        if (i10 > 0) {
            g(i10 + i0.f16021n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z10) {
        int i10;
        if (this.f7702w != 0) {
            h hVar = this.f7704y;
            i0.r(hVar);
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f7701s = i10;
            j(this.f7700r);
            if (z10) {
                i0.h3(hVar, 1000L);
            }
        }
    }

    public final void j(j1 j1Var) {
        boolean z10;
        if (this.f7700r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k(j1Var, z10);
    }

    public final void k(j1 j1Var, boolean z10) {
        i0.c cVar;
        boolean z11;
        b bVar;
        float f7;
        int i10;
        fe.f fVar;
        float f10;
        j1 b10 = b(j1Var);
        this.f7700r = b10;
        i0.c cVar2 = i0.c.e;
        if (b10 != null) {
            g1 g1Var = b10.f46132a;
            cVar = i0.c.a(g1Var.f(647), g1Var.g(647));
        } else {
            cVar = cVar2;
        }
        if (b10 != null) {
            cVar2 = b10.f46132a.f(8);
        }
        c cVar3 = this.f7698f;
        b bVar2 = (b) cVar3.f7689c;
        if (cVar2.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar = b.d;
            } else {
                bVar = b.f7684a;
            }
        } else if (z11) {
            bVar = b.f7686c;
        } else {
            bVar = b.f7685b;
        }
        if (bVar2 != bVar) {
            cVar3.a(bVar, false);
        }
        int i11 = this.f7701s;
        if (i11 == 2) {
            this.f7702w = 0;
        }
        if (i11 == 3 && cVar2.d > 0) {
            this.f7702w = 0;
        }
        i0.c a2 = i0.c.a(cVar2, i0.c.b(0, 0, 0, this.f7702w));
        int i12 = a2.f7767c;
        int i13 = a2.f7766b;
        int i14 = a2.f7765a;
        int i15 = a2.d;
        i0.c a10 = i0.c.a(cVar, a2);
        int i16 = a10.d;
        int i17 = a10.f7767c;
        int i18 = a10.f7766b;
        int i19 = a10.f7765a;
        Runnable runnable = this.h;
        fe.f fVar2 = this.f7695a;
        o oVar = this.d;
        o oVar2 = this.f7697c;
        n nVar = this.f7696b;
        if (z10) {
            if (i15 > 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (!nVar.b(f7)) {
                fVar = fVar2;
                i10 = i17;
                if (!oVar2.b(i19, i18, i17, i16) && !oVar.b(i14, i13, i12, i15)) {
                    if (bVar2 != bVar) {
                        runnable.run();
                    }
                }
            } else {
                i10 = i17;
                fVar = fVar2;
            }
            fVar.b();
            nVar.c(false);
            oVar2.c(false);
            oVar.c(false);
            if (i15 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            nVar.f7050c = f10;
            oVar2.e(i19, i18, i10, i16);
            oVar.e(i14, i13, i12, i15);
            fe.f fVar3 = fVar;
            fVar3.c(0.0f);
            fVar3.a(1.0f);
        } else {
            float f11 = 0.0f;
            fVar2.b();
            if (i15 > 0) {
                f11 = 1.0f;
            }
            nVar.d(f11);
            oVar2.d(i19, i18, i17, i16);
            oVar.d(i14, i13, i12, i15);
            runnable.run();
        }
        a();
    }

    @Override
    public final void l(j1 j1Var) {
        int i10;
        j1 b10 = b(j1Var);
        if (b10 != null) {
            i10 = b10.f46132a.f(8).d;
        } else {
            i10 = 0;
        }
        this.F = i10;
        this.h.run();
    }

    @Override
    public final void w() {
        this.G++;
    }

    public j1 b(j1 j1Var) {
        return j1Var;
    }
}
