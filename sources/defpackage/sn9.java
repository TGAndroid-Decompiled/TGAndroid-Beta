package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.webrtc.VideoFrame;
public final class sn9 implements sa8, gk7 {
    public static sn9 w;
    public xa8 a;
    public TLRPC.GroupCallParticipant c;
    public boolean d;
    public ta8 e;
    public rn9 f;
    public qn9 h;
    public final int r;
    public long s;
    public final pn9 b = new pn9(this);
    public final bg7 n = new bg7(this, (byte) 22);

    public sn9(int i) {
        this.r = i;
        kk7.f(i).a(this, kk7.v2);
        kk7.f(i).a(this, kk7.A2);
    }

    public static fc2 b() {
        fc2 fc2Var;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            fc2Var = sharedInstance.groupCall;
        } else {
            fc2Var = null;
        }
        if (sharedInstance == null || fc2Var == null || (groupCall = fc2Var.b) == null || !groupCall.rtmp_stream || sharedInstance.isHangingUp()) {
            return null;
        }
        return fc2Var;
    }

    public static boolean c() {
        xa8 xa8Var;
        sn9 sn9Var = w;
        if (sn9Var != null && (xa8Var = sn9Var.a) != null && xa8Var.e()) {
            return true;
        }
        return false;
    }

    public static void d(Activity activity) {
        ya8 g;
        int i;
        if (b() != null) {
            sn9 sn9Var = w;
            if (sn9Var == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    i = sharedInstance.getAccount();
                } else {
                    i = y6c.t0;
                }
                sn9 sn9Var2 = new sn9(i);
                w = sn9Var2;
                sn9Var = sn9Var2;
            }
            xa8 xa8Var = sn9Var.a;
            if (xa8Var == null || !xa8Var.d()) {
                sn9Var.a = mb3.c().k(sn9Var);
            }
            xa8 xa8Var2 = sn9Var.a;
            if (xa8Var2.c != 0 || (g = xa8Var2.g(activity, null, true)) == null) {
                return;
            }
            ta8 ta8Var = new ta8(g);
            sn9Var.e = ta8Var;
            sn9Var.b.a = ta8Var;
            sn9Var.a();
            sn9Var.s = SystemClock.elapsedRealtime();
            bg7 bg7Var = sn9Var.n;
            gl.r(bg7Var);
            gl.e3(bg7Var, 700L);
            h75 h75Var = h75.s5;
            if (h75Var != null) {
                h75Var.dismiss();
            }
            on9 on9Var = on9.Q0;
            if (on9Var != null) {
                on9Var.dismiss();
            }
            gl.d3(new am6((byte) 19));
        }
    }

    public static void h(boolean z) {
        int i;
        h75 h75Var = h75.s5;
        int i2 = 0;
        if (h75Var != null && h75Var.getWindow() != null) {
            View decorView = h75Var.getWindow().getDecorView();
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            decorView.setVisibility(i);
        }
        on9 on9Var = on9.Q0;
        if (on9Var != null && on9Var.getWindow() != null) {
            View decorView2 = on9Var.getWindow().getDecorView();
            if (z) {
                i2 = 4;
            }
            decorView2.setVisibility(i2);
        }
    }

    public static void i() {
        int i;
        fc2 b = b();
        sn9 sn9Var = w;
        if (b == null) {
            if (sn9Var != null) {
                w = null;
                int i2 = sn9Var.r;
                kk7.f(i2).n(sn9Var, kk7.v2);
                kk7.f(i2).n(sn9Var, kk7.A2);
                xa8 xa8Var = sn9Var.a;
                if (xa8Var != null) {
                    sn9Var.a = null;
                    xa8Var.f();
                }
                sn9Var.g();
                return;
            }
            return;
        }
        if (sn9Var == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                i = sharedInstance.getAccount();
            } else {
                i = y6c.t0;
            }
            sn9Var = new sn9(i);
            w = sn9Var;
        }
        xa8 xa8Var2 = sn9Var.a;
        if (xa8Var2 == null || !xa8Var2.d()) {
            sn9Var.a = mb3.c().k(sn9Var);
        }
        w.a();
        w.a.c();
    }

    @Override
    public final void A0(SurfaceTexture surfaceTexture) {
        ta8 ta8Var = this.e;
        this.e = null;
        this.b.a = null;
        a();
        if (ta8Var != null) {
            ta8Var.a();
        }
        surfaceTexture.release();
    }

    @Override
    public final View C0() {
        return null;
    }

    @Override
    public final boolean F2() {
        return false;
    }

    @Override
    public final boolean G0() {
        if (on9.Q0 != null && h75.t5) {
            return true;
        }
        return false;
    }

    @Override
    public final void H0(ya8 ya8Var) {
        ta8 ta8Var = new ta8(ya8Var);
        this.e = ta8Var;
        this.b.a = ta8Var;
        a();
        this.s = SystemClock.elapsedRealtime();
        bg7 bg7Var = this.n;
        gl.r(bg7Var);
        gl.e3(bg7Var, 700L);
    }

    @Override
    public final void L1(View view) {
        rn9 rn9Var = (rn9) view;
        this.f = rn9Var;
        if (!rn9Var.b) {
            rn9Var.b = true;
            gl.e3(rn9Var.e, 500L);
        }
        rn9Var.a();
        this.b.b = this.f.a.d;
        a();
    }

    @Override
    public final void P1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (sharedInstance != null && launchActivity != null && b() != null) {
            if (h75.s5 == null && on9.Q0 == null) {
                h75.S0(launchActivity, j5.a(sharedInstance.getAccount()), null, null, false, null);
            }
            if (this.a != null) {
                ta8 ta8Var = this.e;
                this.e = null;
                this.b.a = null;
                this.a.a(new x15(this, ta8Var, (byte) 28));
                gl.d3(new am6((byte) 19));
                return;
            }
            return;
        }
        xa8 xa8Var = this.a;
        if (xa8Var != null) {
            xa8Var.b();
        }
    }

    @Override
    public final int Q0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn9.Q0():int");
    }

    @Override
    public final int S1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn9.S1():int");
    }

    @Override
    public final boolean T() {
        return true;
    }

    @Override
    public final boolean Z(boolean z, float f, iv9 iv9Var) {
        return false;
    }

    public final void a() {
        boolean z;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        fc2 b = b();
        boolean z2 = false;
        if (this.b.a == null && this.b.b == null) {
            z = false;
        } else {
            z = true;
        }
        if (z && b != null && !b.f.isEmpty()) {
            gc2 gc2Var = (gc2) b.f.get(0);
            groupCallParticipant = gc2Var.a;
            z2 = gc2Var.b;
        } else {
            groupCallParticipant = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.c;
        if (groupCallParticipant != groupCallParticipant2 || z2 != this.d) {
            if (groupCallParticipant2 != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null) {
                    sharedInstance2.removeExtraRemoteSink(this.c, this.d, this.b);
                }
                this.c = null;
            }
            if (groupCallParticipant != null && sharedInstance != null && sharedInstance.addExtraRemoteSink(groupCallParticipant, z2, this.b)) {
                this.c = groupCallParticipant;
                this.d = z2;
                StringBuilder sb = new StringBuilder("bound ");
                if (z2) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                sb.append(str);
                String sb2 = sb.toString();
                if (w01.a) {
                    fa4.b("rtmp pip: ".concat(sb2));
                }
            }
        }
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final boolean a1() {
        if (b() != null) {
            return true;
        }
        return false;
    }

    @Override
    public final float a2() {
        return 0.0f;
    }

    @Override
    public final boolean d1() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.v2 || i == kk7.A2) {
            a();
            rn9 rn9Var = this.f;
            if (rn9Var != null) {
                rn9Var.a();
            }
        }
    }

    public final void g() {
        gl.r(this.n);
        qn9 qn9Var = this.h;
        if (qn9Var != null) {
            qn9Var.a.K();
            VideoFrame videoFrame = qn9Var.b;
            if (videoFrame != null) {
                videoFrame.release();
                qn9Var.b = null;
            }
            this.h = null;
        }
        this.b.a = null;
        this.b.b = null;
        ta8 ta8Var = this.e;
        if (ta8Var != null) {
            ta8Var.a();
            this.e = null;
        }
        if (this.c != null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.removeExtraRemoteSink(this.c, this.d, this.b);
            }
            this.c = null;
        }
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
    public final void m0(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final void n(View view) {
        h(false);
        rn9 rn9Var = this.f;
        if (view == rn9Var) {
            rn9Var.b = false;
            gl.r(rn9Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
    }

    @Override
    public final View o0(LaunchActivity launchActivity) {
        return new rn9(this, launchActivity);
    }

    @Override
    public final void p0(View view) {
        if (view == this.f) {
            h(false);
        }
        rn9 rn9Var = this.f;
        if (view == rn9Var) {
            rn9Var.b = false;
            gl.r(rn9Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
        rn9 rn9Var2 = (rn9) view;
        rn9Var2.b = false;
        gl.r(rn9Var2.e);
        rn9Var2.a.d.release();
    }

    @Override
    public final boolean p1() {
        return false;
    }

    @Override
    public final int u() {
        return 10;
    }

    @Override
    public final void u1() {
        this.a = null;
        if (this.f != null) {
            h(false);
        }
        g();
        gl.d3(new am6((byte) 19));
        gl.d3(new am6((byte) 18));
    }

    @Override
    public final void x0(View view) {
        h(true);
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void G2(int i) {
    }

    @Override
    public final void S0(float f) {
    }

    @Override
    public final void f(long j) {
    }

    @Override
    public final void o2(int i, ArrayList arrayList) {
    }

    @Override
    public final void r2(Canvas canvas, int i, int i2) {
    }
}
