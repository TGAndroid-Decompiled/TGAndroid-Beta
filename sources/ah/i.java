package ah;

import ag.i0;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.q1;
import r0.m1;
import vd.l;
import vd.m;
public final class i implements g, f, d {
    public View A;
    public int B;
    public int C;
    public final vd.c f749a;
    public final Runnable h;
    public boolean f754n;
    public m1 f755r;
    public int v;
    public int f757w;
    public e f759y;
    public final l f750b = new l(0.0f);
    public final m f751c = new m();
    public final m d = new m();
    public final AnimationNotificationsLocker f752e = new AnimationNotificationsLocker();
    public final c f753f = new c(new i0(this, 1));
    public int f756s = 1;
    public final h f758x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.f749a = new vd.c(0, new ze.b(this, runnable, false), q1.f23735w, 250L);
    }

    @Override
    public final void I() {
        View view = this.A;
        if (view != null) {
            view.postOnAnimation(new h(this, 1));
        }
    }

    @Override
    public final View M() {
        return this.A;
    }

    public final void a() {
        boolean z10 = this.f749a.f49512g;
        boolean z11 = this.f754n;
        AnimationNotificationsLocker animationNotificationsLocker = this.f752e;
        if (!z11 && z10) {
            this.f754n = true;
            animationNotificationsLocker.lock();
        }
        if (this.f754n && !z10) {
            this.f754n = false;
            animationNotificationsLocker.unlock();
        }
    }

    public final float b() {
        e eVar = this.f759y;
        m mVar = this.d;
        if (eVar != null && this.C > 0) {
            return Math.max(this.B, mVar.d.f49531a);
        }
        return mVar.d.f49531a;
    }

    public final float c() {
        e eVar = this.f759y;
        m mVar = this.f751c;
        if (eVar != null && this.C > 0) {
            return Math.max(this.B, mVar.d.f49531a);
        }
        return mVar.d.f49531a;
    }

    public final int d() {
        if (this.f759y != null && this.C > 0) {
            return Math.max(this.B, Math.max(e(527).d, this.v));
        }
        return Math.max(e(527).d, this.v);
    }

    public final i0.b e(int i10) {
        m1 m1Var = this.f755r;
        if (m1Var != null) {
            return m1Var.f46843a.f(i10);
        }
        return i0.b.f8185e;
    }

    public final void f(int i10) {
        if (this.v == i10 && this.f756s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f758x);
        this.f757w = Math.max(this.v, i10);
        this.v = i10;
        this.f756s = 0;
        i(this.f755r);
    }

    public final void g(int i10) {
        if (i10 > 0) {
            f(i10 + AndroidUtilities.navigationBarHeight);
        } else {
            h(true);
        }
    }

    public final void h(boolean z10) {
        int i10;
        if (this.v != 0) {
            h hVar = this.f758x;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f756s = i10;
            i(this.f755r);
            if (z10) {
                AndroidUtilities.runOnUIThread(hVar, 1000L);
            }
        }
    }

    public final void i(m1 m1Var) {
        boolean z10;
        if (this.f755r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        j(m1Var, z10);
    }

    public final void j(m1 m1Var, boolean z10) {
        i0.b bVar;
        boolean z11;
        b bVar2;
        float f9;
        int i10;
        vd.c cVar;
        float f10;
        this.f755r = m1Var;
        i0.b bVar3 = i0.b.f8185e;
        if (m1Var != null) {
            bVar = m1Var.f46843a.g(647);
        } else {
            bVar = bVar3;
        }
        if (m1Var != null) {
            bVar3 = m1Var.f46843a.f(8);
        }
        c cVar2 = this.f753f;
        b bVar4 = cVar2.f742c;
        if (bVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f736a;
            }
        } else if (z11) {
            bVar2 = b.f738c;
        } else {
            bVar2 = b.f737b;
        }
        if (bVar4 != bVar2) {
            cVar2.a(bVar2, false);
        }
        int i11 = this.f756s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && bVar3.d > 0) {
            this.v = 0;
        }
        i0.b a2 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.v));
        int i12 = a2.f8188c;
        int i13 = a2.f8187b;
        int i14 = a2.f8186a;
        int i15 = a2.d;
        i0.b a10 = i0.b.a(bVar, a2);
        int i16 = a10.d;
        int i17 = a10.f8188c;
        int i18 = a10.f8187b;
        int i19 = a10.f8186a;
        Runnable runnable = this.h;
        vd.c cVar3 = this.f749a;
        m mVar = this.d;
        m mVar2 = this.f751c;
        l lVar = this.f750b;
        if (z10) {
            if (i15 > 0) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            if (!lVar.b(f9)) {
                cVar = cVar3;
                i10 = i17;
                if (!mVar2.b(i19, i18, i17, i16) && !mVar.b(i14, i13, i12, i15)) {
                    if (bVar4 != bVar2) {
                        runnable.run();
                    }
                }
            } else {
                i10 = i17;
                cVar = cVar3;
            }
            cVar.b();
            lVar.c(false);
            mVar2.c(false);
            mVar.c(false);
            if (i15 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            lVar.f49533c = f10;
            mVar2.e(i19, i18, i10, i16);
            mVar.e(i14, i13, i12, i15);
            vd.c cVar4 = cVar;
            cVar4.c(0.0f);
            cVar4.a(1.0f);
        } else {
            float f11 = 0.0f;
            cVar3.b();
            if (i15 > 0) {
                f11 = 1.0f;
            }
            lVar.d(f11);
            mVar2.d(i19, i18, i17, i16);
            mVar.d(i14, i13, i12, i15);
            runnable.run();
        }
        a();
    }

    @Override
    public final void k(m1 m1Var) {
        this.B = m1Var.f46843a.f(8).d;
        this.h.run();
    }

    @Override
    public final void t() {
        this.C++;
    }
}
