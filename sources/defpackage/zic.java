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
public final class zic implements vc8 {
    public static zic h;
    public ad8 a;
    public qa1 b;
    public long c;
    public boolean d;
    public final zka e = new zka(this, (byte) 14);
    public boolean f;

    public static void b() {
        boolean z;
        ?? r5;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z2 = true;
        if (iic.m1 == null && yic.d() == null) {
            z = false;
        } else {
            z = true;
        }
        yic yicVar = null;
        if (sharedInstance != null && z) {
            zic zicVar = h;
            if (zicVar == null) {
                zicVar = new zic();
                h = zicVar;
            }
            ad8 ad8Var = zicVar.a;
            if (ad8Var == null || !ad8Var.e()) {
                zicVar.a = yc3.c().k(zicVar);
            }
            ad8 ad8Var2 = zicVar.a;
            if (ad8Var2.c == 2) {
                ad8Var2.d();
                return;
            }
            if (iic.m1 == null) {
                yicVar = yic.d();
            }
            ad8 ad8Var3 = zicVar.a;
            if (yicVar != null) {
                r5 = 1;
            } else {
                r5 = 0;
            }
            if (yicVar == null || !yicVar.e) {
                z2 = false;
            }
            byte b = ad8Var3.c;
            if (b != 3) {
                ad8Var3.f = r5;
                ad8Var3.g = z2;
                if (b == 2) {
                    ad8Var3.d = r5;
                } else {
                    ad8Var3.c = r5;
                }
                ad8Var3.b.d();
            }
            zicVar.a.d();
            return;
        }
        zic zicVar2 = h;
        if (zicVar2 != null) {
            h = null;
            ad8 ad8Var4 = zicVar2.a;
            if (ad8Var4 != null) {
                zicVar2.a = null;
                ad8Var4.g();
            }
        }
    }

    @Override
    public final boolean A0() {
        return true;
    }

    @Override
    public final void B0(int i) {
        ka1.b(i, false);
        gm.d3(new e1b((byte) 8), 300L);
    }

    @Override
    public final boolean D() {
        return true;
    }

    @Override
    public final boolean F(boolean z, float f, lx9 lx9Var) {
        return false;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void I(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View J(LaunchActivity launchActivity) {
        return new qa1(launchActivity);
    }

    @Override
    public final void K(View view) {
        gm.r(this.e);
        if (this.b == view) {
            this.b = null;
        }
        qa1 qa1Var = (qa1) view;
        qa1Var.f.b();
        qa1Var.a.d.release();
    }

    @Override
    public final void M(View view) {
        qa1 qa1Var;
        iic iicVar = iic.m1;
        if (iicVar != null && (qa1Var = this.b) == view && !this.f) {
            this.f = true;
            qa1Var.getClass();
            qa1Var.r = SystemClock.elapsedRealtime();
            qa1Var.b();
            iicVar.k1 = this.b.a;
            iicVar.l1 = true;
            iicVar.y();
            try {
                ((WindowManager) iicVar.b.getSystemService("window")).removeView(iicVar.u0);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final View O() {
        return null;
    }

    @Override
    public final boolean P() {
        iic iicVar = iic.m1;
        if (iicVar != null && iicVar.d0.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    @Override
    public final int S() {
        int i;
        if (!qa1.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        zjc a = a();
        if (a != null && (i = a.rotatedFrameWidth) > 0) {
            return i;
        }
        return 9;
    }

    @Override
    public final boolean V() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !sharedInstance.isHangingUp() && sharedInstance.getCallState() != 11 && sharedInstance.getCallState() != 10) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean W() {
        return false;
    }

    @Override
    public final re8 Y() {
        return null;
    }

    public final zjc a() {
        akc akcVar;
        qa1 qa1Var = this.b;
        if (qa1Var != null) {
            zjc zjcVar = qa1Var.a.d;
            if (zjcVar.rotatedFrameWidth > 0) {
                return zjcVar;
            }
        }
        iic iicVar = iic.m1;
        if (iicVar != null && (akcVar = iicVar.d0) != null) {
            return akcVar.d;
        }
        yic d = yic.d();
        if (d != null) {
            return d.s.d;
        }
        return null;
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final void e0() {
        this.a = null;
        if (h == this) {
            h = null;
        }
        iic iicVar = iic.m1;
        if (iicVar != null) {
            iicVar.G0 = true;
            iicVar.d0.d.release();
            iicVar.e0.d.release();
            iicVar.c0.release();
            iicVar.b();
            iicVar.u0.d();
            iic.m1 = null;
            b();
        }
        yic.b();
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
        ka1.a = false;
        gm.r(this.e);
        this.b = null;
        iic iicVar = iic.m1;
        if (iicVar != null) {
            try {
                if (iicVar.u0.getParent() == null) {
                    bic bicVar = iicVar.u0;
                    bicVar.getClass();
                    ((WindowManager) iicVar.b.getSystemService("window")).addView(bicVar, ekc.a());
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            iicVar.l1 = false;
            iicVar.k1 = null;
            iicVar.y();
            iicVar.u0.invalidate();
        } else if (yic.d() != null) {
            yic d = yic.d();
            qw9 qw9Var = d.a;
            try {
                if (qw9Var.getParent() == null) {
                    d.c.addView(qw9Var, d.d);
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.setSinks(d.r.d, d.s.d);
            }
        }
    }

    @Override
    public final void m0(View view) {
        boolean z;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z = true;
        } else {
            z = false;
        }
        ka1.a = z;
        qa1 qa1Var = (qa1) view;
        this.b = qa1Var;
        qa1Var.b();
        this.c = ka1.c();
        this.d = qa1.a(VoIPService.getSharedInstance());
        zka zkaVar = this.e;
        gm.r(zkaVar);
        gm.d3(zkaVar, 500L);
        this.f = false;
        if (iic.m1 == null && yic.d() != null) {
            yic d = yic.d();
            akc akcVar = this.b.a;
            d.getClass();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setSinks(d.r.d, akcVar.d);
            }
            try {
                d.c.removeView(d.a);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final int o0() {
        int i;
        if (!qa1.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        zjc a = a();
        if (a != null && (i = a.rotatedFrameHeight) > 0) {
            return i;
        }
        return 16;
    }

    @Override
    public final int p() {
        return 10;
    }

    @Override
    public final float p0() {
        return 0.0f;
    }

    @Override
    public final void q0(int i, ArrayList arrayList) {
        ka1.a(i, arrayList, false);
    }

    @Override
    public final void r(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        surfaceTexture.release();
    }

    @Override
    public final void Q(bd8 bd8Var) {
    }

    @Override
    public final void R() {
    }

    @Override
    public final void T(float f) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void e(long j) {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void n0() {
    }

    @Override
    public final void u0(Canvas canvas, int i, int i2) {
    }
}
