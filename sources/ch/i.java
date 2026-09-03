package ch;

import android.view.View;
import cg.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.r1;
import r0.m1;
import xd.k;
import xd.l;
public final class i implements g, f, d {
    public View B;
    public int C;
    public int D;
    public final xd.c f2589a;
    public final Runnable h;
    public boolean f2593n;
    public m1 f2594r;
    public int v;
    public int f2596w;
    public e f2598y;
    public final k f2590b = new k(0.0f);
    public final l f2591c = new l();
    public final l d = new l();
    public final AnimationNotificationsLocker e = new AnimationNotificationsLocker();
    public final c f2592f = new c(new h0(this, 1));
    public int f2595s = 1;
    public final h f2597x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.f2589a = new xd.c(0, new af.c(this, runnable, false, 20), r1.f20518w, 250L);
    }

    @Override
    public final void J() {
        View view = this.B;
        if (view != null) {
            view.postOnAnimation(new h(this, 1));
        }
    }

    @Override
    public final View N() {
        return this.B;
    }

    public final void a() {
        boolean z4 = this.f2589a.f46966g;
        boolean z10 = this.f2593n;
        AnimationNotificationsLocker animationNotificationsLocker = this.e;
        if (!z10 && z4) {
            this.f2593n = true;
            animationNotificationsLocker.lock();
        }
        if (this.f2593n && !z4) {
            this.f2593n = false;
            animationNotificationsLocker.unlock();
        }
    }

    public final float b() {
        e eVar = this.f2598y;
        l lVar = this.d;
        if (eVar != null && this.D > 0) {
            return Math.max(this.C, lVar.d.f46981a);
        }
        return lVar.d.f46981a;
    }

    public final float c() {
        e eVar = this.f2598y;
        l lVar = this.f2591c;
        if (eVar != null && this.D > 0) {
            return Math.max(this.C, lVar.d.f46981a);
        }
        return lVar.d.f46981a;
    }

    public final int d() {
        if (this.f2598y != null && this.D > 0) {
            return Math.max(this.C, Math.max(e(527).d, this.v));
        }
        return Math.max(e(527).d, this.v);
    }

    public final i0.b e(int i10) {
        m1 m1Var = this.f2594r;
        if (m1Var != null) {
            return m1Var.f43154a.f(i10);
        }
        return i0.b.e;
    }

    public final void f(int i10) {
        if (this.v == i10 && this.f2595s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f2597x);
        this.f2596w = Math.max(this.v, i10);
        this.v = i10;
        this.f2595s = 0;
        i(this.f2594r);
    }

    public final void g(int i10) {
        if (i10 > 0) {
            f(i10 + AndroidUtilities.navigationBarHeight);
        } else {
            h(true);
        }
    }

    public final void h(boolean z4) {
        int i10;
        if (this.v != 0) {
            h hVar = this.f2597x;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            if (z4) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f2595s = i10;
            i(this.f2594r);
            if (z4) {
                AndroidUtilities.runOnUIThread(hVar, 1000L);
            }
        }
    }

    public final void i(m1 m1Var) {
        boolean z4;
        if (this.f2594r != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        j(m1Var, z4);
    }

    public final void j(m1 m1Var, boolean z4) {
        i0.b bVar;
        boolean z10;
        b bVar2;
        float f10;
        int i10;
        xd.c cVar;
        float f11;
        this.f2594r = m1Var;
        i0.b bVar3 = i0.b.e;
        if (m1Var != null) {
            bVar = m1Var.f43154a.g(647);
        } else {
            bVar = bVar3;
        }
        if (m1Var != null) {
            bVar3 = m1Var.f43154a.f(8);
        }
        c cVar2 = this.f2592f;
        b bVar4 = cVar2.f2583c;
        if (bVar3.d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z4) {
            if (z10) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f2578a;
            }
        } else if (z10) {
            bVar2 = b.f2580c;
        } else {
            bVar2 = b.f2579b;
        }
        if (bVar4 != bVar2) {
            cVar2.a(bVar2, false);
        }
        int i11 = this.f2595s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && bVar3.d > 0) {
            this.v = 0;
        }
        i0.b a2 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.v));
        int i12 = a2.f7198c;
        int i13 = a2.f7197b;
        int i14 = a2.f7196a;
        int i15 = a2.d;
        i0.b a10 = i0.b.a(bVar, a2);
        int i16 = a10.d;
        int i17 = a10.f7198c;
        int i18 = a10.f7197b;
        int i19 = a10.f7196a;
        Runnable runnable = this.h;
        xd.c cVar3 = this.f2589a;
        l lVar = this.d;
        l lVar2 = this.f2591c;
        k kVar = this.f2590b;
        if (z4) {
            if (i15 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!kVar.b(f10)) {
                cVar = cVar3;
                i10 = i17;
                if (!lVar2.b(i19, i18, i17, i16) && !lVar.b(i14, i13, i12, i15)) {
                    if (bVar4 != bVar2) {
                        runnable.run();
                    }
                }
            } else {
                i10 = i17;
                cVar = cVar3;
            }
            cVar.b();
            kVar.c(false);
            lVar2.c(false);
            lVar.c(false);
            if (i15 > 0) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            kVar.f46983c = f11;
            lVar2.e(i19, i18, i10, i16);
            lVar.e(i14, i13, i12, i15);
            xd.c cVar4 = cVar;
            cVar4.c(0.0f);
            cVar4.a(1.0f);
        } else {
            float f12 = 0.0f;
            cVar3.b();
            if (i15 > 0) {
                f12 = 1.0f;
            }
            kVar.d(f12);
            lVar2.d(i19, i18, i17, i16);
            lVar.d(i14, i13, i12, i15);
            runnable.run();
        }
        a();
    }

    @Override
    public final void k(m1 m1Var) {
        this.C = m1Var.f43154a.f(8).d;
        this.h.run();
    }

    @Override
    public final void t() {
        this.D++;
    }
}
