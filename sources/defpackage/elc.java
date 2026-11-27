package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
public final class elc implements je8 {
    public static elc h;
    public me8 a;
    public q91 b;
    public long c;
    public boolean d;
    public final bva e = new bva(this, (byte) 13);
    public boolean f;

    public static void c() {
        boolean z;
        ?? r5;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z2 = true;
        if (mkc.m1 == null && dlc.d() == null) {
            z = false;
        } else {
            z = true;
        }
        dlc dlcVar = null;
        if (sharedInstance != null && z) {
            elc elcVar = h;
            if (elcVar == null) {
                elcVar = new elc();
                h = elcVar;
            }
            me8 me8Var = elcVar.a;
            if (me8Var == null || !me8Var.f()) {
                elcVar.a = fc3.b().k(elcVar);
            }
            me8 me8Var2 = elcVar.a;
            if (me8Var2.c == 2) {
                me8Var2.e();
                return;
            }
            if (mkc.m1 == null) {
                dlcVar = dlc.d();
            }
            me8 me8Var3 = elcVar.a;
            if (dlcVar != null) {
                r5 = 1;
            } else {
                r5 = 0;
            }
            if (dlcVar == null || !dlcVar.e) {
                z2 = false;
            }
            byte b = me8Var3.c;
            if (b != 3) {
                me8Var3.g = r5;
                me8Var3.h = z2;
                if (b == 2) {
                    me8Var3.d = r5;
                } else {
                    me8Var3.c = r5;
                }
                me8Var3.b.d();
            }
            elcVar.a.e();
            return;
        }
        elc elcVar2 = h;
        if (elcVar2 != null) {
            h = null;
            me8 me8Var4 = elcVar2.a;
            if (me8Var4 != null) {
                elcVar2.a = null;
                me8Var4.h();
            }
        }
    }

    @Override
    public final boolean A0() {
        return true;
    }

    @Override
    public final boolean E() {
        return true;
    }

    @Override
    public final boolean E0() {
        return true;
    }

    @Override
    public final boolean G(boolean z, float f, cz9 cz9Var) {
        return false;
    }

    @Override
    public final void G0(int i) {
        k91.b(i, false);
        hl.d3(new osa((byte) 11), 300L);
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final void J(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View K(LaunchActivity launchActivity) {
        return new q91(launchActivity);
    }

    @Override
    public final void L(View view) {
        hl.r(this.e);
        if (this.b == view) {
            this.b = null;
        }
        q91 q91Var = (q91) view;
        q91Var.f.b();
        q91Var.a.d.e();
    }

    @Override
    public final void N(View view) {
        q91 q91Var;
        mkc mkcVar = mkc.m1;
        if (mkcVar != null && (q91Var = this.b) == view && !this.f) {
            this.f = true;
            q91Var.getClass();
            q91Var.r = SystemClock.elapsedRealtime();
            q91Var.b();
            mkcVar.k1 = this.b.a;
            mkcVar.l1 = true;
            mkcVar.y();
            try {
                ((WindowManager) mkcVar.b.getSystemService("window")).removeView(mkcVar.u0);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public final View P() {
        return null;
    }

    @Override
    public final boolean Q() {
        mkc mkcVar = mkc.m1;
        if (mkcVar != null && mkcVar.d0.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    @Override
    public final int S() {
        return 0;
    }

    @Override
    public final int U() {
        int i;
        if (!q91.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        gmc a = a();
        if (a != null && (i = a.e) > 0) {
            return i;
        }
        return 9;
    }

    @Override
    public final boolean X() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !sharedInstance.isHangingUp() && sharedInstance.getCallState() != 11 && sharedInstance.getCallState() != 10) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y() {
        return false;
    }

    public final gmc a() {
        hmc hmcVar;
        q91 q91Var = this.b;
        if (q91Var != null) {
            gmc gmcVar = q91Var.a.d;
            if (gmcVar.e > 0) {
                return gmcVar;
            }
        }
        mkc mkcVar = mkc.m1;
        if (mkcVar != null && (hmcVar = mkcVar.d0) != null) {
            return hmcVar.d;
        }
        dlc d = dlc.d();
        if (d != null) {
            return d.s.d;
        }
        return null;
    }

    @Override
    public final dg8 a0() {
        return null;
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final void g0() {
        this.a = null;
        if (h == this) {
            h = null;
        }
        mkc mkcVar = mkc.m1;
        if (mkcVar != null) {
            mkcVar.G0 = true;
            mkcVar.d0.d.e();
            mkcVar.e0.d.e();
            mkcVar.c0.e();
            mkcVar.b();
            mkcVar.u0.d();
            mkc.m1 = null;
            c();
        }
        dlc.b();
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final long k() {
        return 0L;
    }

    @Override
    public final void l(View view) {
        k91.a = false;
        hl.r(this.e);
        this.b = null;
        mkc mkcVar = mkc.m1;
        if (mkcVar != null) {
            try {
                if (mkcVar.u0.getParent() == null) {
                    fkc fkcVar = mkcVar.u0;
                    fkcVar.getClass();
                    ((WindowManager) mkcVar.b.getSystemService("window")).addView(fkcVar, qmc.a());
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            mkcVar.l1 = false;
            mkcVar.k1 = null;
            mkcVar.y();
            mkcVar.u0.invalidate();
        } else if (dlc.d() != null) {
            dlc d = dlc.d();
            iy9 iy9Var = d.a;
            try {
                if (iy9Var.getParent() == null) {
                    d.c.addView(iy9Var, d.d);
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.setSinks(d.r.d, d.s.d);
            }
        }
    }

    @Override
    public final void o0(View view) {
        boolean z;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z = true;
        } else {
            z = false;
        }
        k91.a = z;
        q91 q91Var = (q91) view;
        this.b = q91Var;
        q91Var.b();
        this.c = k91.c();
        this.d = q91.a(VoIPService.getSharedInstance());
        bva bvaVar = this.e;
        hl.r(bvaVar);
        hl.d3(bvaVar, 500L);
        this.f = false;
        if (mkc.m1 == null && dlc.d() != null) {
            dlc d = dlc.d();
            hmc hmcVar = this.b.a;
            d.getClass();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setSinks(d.r.d, hmcVar.d);
            }
            try {
                d.c.removeView(d.a);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public final int q() {
        return 10;
    }

    @Override
    public final int q0() {
        int i;
        if (!q91.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        gmc a = a();
        if (a != null && (i = a.f) > 0) {
            return i;
        }
        return 16;
    }

    @Override
    public final float r0() {
        return 0.0f;
    }

    @Override
    public final void s(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        surfaceTexture.release();
    }

    @Override
    public final void u0(int i, ArrayList arrayList) {
        k91.a(i, arrayList, false);
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void T() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void p0() {
    }

    @Override
    public final void R(ne8 ne8Var) {
    }

    @Override
    public final void V(float f) {
    }

    @Override
    public final void g(long j) {
    }

    @Override
    public final void v0(Canvas canvas, int i, int i2) {
    }
}
