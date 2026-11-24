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
public final class ygc implements sa8 {
    public static ygc h;
    public xa8 a;
    public h91 b;
    public long c;
    public boolean d;
    public final xia e = new xia(this, (byte) 14);
    public boolean f;

    public static void b() {
        boolean z;
        ?? r5;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z2 = true;
        if (hgc.m1 == null && xgc.d() == null) {
            z = false;
        } else {
            z = true;
        }
        xgc xgcVar = null;
        if (sharedInstance != null && z) {
            ygc ygcVar = h;
            if (ygcVar == null) {
                ygcVar = new ygc();
                h = ygcVar;
            }
            xa8 xa8Var = ygcVar.a;
            if (xa8Var == null || !xa8Var.e()) {
                ygcVar.a = mb3.c().k(ygcVar);
            }
            xa8 xa8Var2 = ygcVar.a;
            if (xa8Var2.c == 2) {
                xa8Var2.d();
                return;
            }
            if (hgc.m1 == null) {
                xgcVar = xgc.d();
            }
            xa8 xa8Var3 = ygcVar.a;
            if (xgcVar != null) {
                r5 = 1;
            } else {
                r5 = 0;
            }
            if (xgcVar == null || !xgcVar.e) {
                z2 = false;
            }
            byte b = xa8Var3.c;
            if (b != 3) {
                xa8Var3.f = r5;
                xa8Var3.g = z2;
                if (b == 2) {
                    xa8Var3.d = r5;
                } else {
                    xa8Var3.c = r5;
                }
                xa8Var3.b.d();
            }
            ygcVar.a.d();
            return;
        }
        ygc ygcVar2 = h;
        if (ygcVar2 != null) {
            h = null;
            xa8 xa8Var4 = ygcVar2.a;
            if (xa8Var4 != null) {
                ygcVar2.a = null;
                xa8Var4.g();
            }
        }
    }

    @Override
    public final View C0() {
        return null;
    }

    @Override
    public final boolean F2() {
        return true;
    }

    @Override
    public final boolean G0() {
        hgc hgcVar = hgc.m1;
        if (hgcVar != null && hgcVar.d0.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    @Override
    public final void G2(int i) {
        b91.b(i, false);
        gl.d3(new cza((byte) 8), 300L);
    }

    @Override
    public final void L1(View view) {
        boolean z;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z = true;
        } else {
            z = false;
        }
        b91.a = z;
        h91 h91Var = (h91) view;
        this.b = h91Var;
        h91Var.b();
        this.c = b91.c();
        this.d = h91.a(VoIPService.getSharedInstance());
        xia xiaVar = this.e;
        gl.r(xiaVar);
        gl.d3(xiaVar, 500L);
        this.f = false;
        if (hgc.m1 == null && xgc.d() != null) {
            xgc d = xgc.d();
            aic aicVar = this.b.a;
            d.getClass();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setSinks(d.r.d, aicVar.d);
            }
            try {
                d.c.removeView(d.a);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override
    public final int Q0() {
        int i;
        if (!h91.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        zhc a = a();
        if (a != null && (i = a.rotatedFrameWidth) > 0) {
            return i;
        }
        return 9;
    }

    @Override
    public final int S1() {
        int i;
        if (!h91.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        zhc a = a();
        if (a != null && (i = a.rotatedFrameHeight) > 0) {
            return i;
        }
        return 16;
    }

    @Override
    public final boolean U() {
        return true;
    }

    public final zhc a() {
        aic aicVar;
        h91 h91Var = this.b;
        if (h91Var != null) {
            zhc zhcVar = h91Var.a.d;
            if (zhcVar.rotatedFrameWidth > 0) {
                return zhcVar;
            }
        }
        hgc hgcVar = hgc.m1;
        if (hgcVar != null && (aicVar = hgcVar.d0) != null) {
            return aicVar.d;
        }
        xgc d = xgc.d();
        if (d != null) {
            return d.s.d;
        }
        return null;
    }

    @Override
    public final boolean a0(boolean z, float f, iv9 iv9Var) {
        return false;
    }

    @Override
    public final boolean a1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !sharedInstance.isHangingUp() && sharedInstance.getCallState() != 11 && sharedInstance.getCallState() != 10) {
            return true;
        }
        return false;
    }

    @Override
    public final float a2() {
        return 0.0f;
    }

    @Override
    public final boolean b0() {
        return false;
    }

    @Override
    public final boolean d1() {
        return false;
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final oc8 k1() {
        return null;
    }

    @Override
    public final long m() {
        return 0L;
    }

    @Override
    public final void n(View view) {
        b91.a = false;
        gl.r(this.e);
        this.b = null;
        hgc hgcVar = hgc.m1;
        if (hgcVar != null) {
            try {
                if (hgcVar.u0.getParent() == null) {
                    agc agcVar = hgcVar.u0;
                    agcVar.getClass();
                    ((WindowManager) hgcVar.b.getSystemService("window")).addView(agcVar, eic.a());
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            hgcVar.l1 = false;
            hgcVar.k1 = null;
            hgcVar.y();
            hgcVar.u0.invalidate();
        } else if (xgc.d() != null) {
            xgc d = xgc.d();
            gw9 gw9Var = d.a;
            try {
                if (gw9Var.getParent() == null) {
                    d.c.addView(gw9Var, d.d);
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.setSinks(d.r.d, d.s.d);
            }
        }
    }

    @Override
    public final void n0(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final void o2(int i, ArrayList arrayList) {
        b91.a(i, arrayList, false);
    }

    @Override
    public final View p0(LaunchActivity launchActivity) {
        return new h91(launchActivity);
    }

    @Override
    public final boolean p1() {
        return false;
    }

    @Override
    public final void q0(View view) {
        gl.r(this.e);
        if (this.b == view) {
            this.b = null;
        }
        h91 h91Var = (h91) view;
        h91Var.f.b();
        h91Var.a.d.release();
    }

    @Override
    public final int u() {
        return 10;
    }

    @Override
    public final void u1() {
        this.a = null;
        if (h == this) {
            h = null;
        }
        hgc hgcVar = hgc.m1;
        if (hgcVar != null) {
            hgcVar.G0 = true;
            hgcVar.d0.d.release();
            hgcVar.e0.d.release();
            hgcVar.c0.release();
            hgcVar.b();
            hgcVar.u0.d();
            hgc.m1 = null;
            b();
        }
        xgc.b();
    }

    @Override
    public final void y(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        surfaceTexture.release();
    }

    @Override
    public final void y0(View view) {
        h91 h91Var;
        hgc hgcVar = hgc.m1;
        if (hgcVar != null && (h91Var = this.b) == view && !this.f) {
            this.f = true;
            h91Var.getClass();
            h91Var.r = SystemClock.elapsedRealtime();
            h91Var.b();
            hgcVar.k1 = this.b.a;
            hgcVar.l1 = true;
            hgcVar.y();
            try {
                ((WindowManager) hgcVar.b.getSystemService("window")).removeView(hgcVar.u0);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void P1() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void H0(ya8 ya8Var) {
    }

    @Override
    public final void S0(float f) {
    }

    @Override
    public final void f(long j) {
    }

    @Override
    public final void r2(Canvas canvas, int i, int i2) {
    }
}
