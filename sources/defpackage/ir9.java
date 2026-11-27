package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
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
public final class ir9 implements je8, fn7 {
    public static ir9 w;
    public me8 a;
    public TLRPC.GroupCallParticipant c;
    public boolean d;
    public ke8 e;
    public hr9 f;
    public gr9 h;
    public final int r;
    public long s;
    public final fr9 b = new fr9(this);
    public final li7 n = new li7(this, (byte) 22);

    public ir9(int i) {
        this.r = i;
        jn7.f(i).a(this, jn7.w2);
        jn7.f(i).a(this, jn7.B2);
    }

    public static vc2 c() {
        vc2 vc2Var;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            vc2Var = sharedInstance.groupCall;
        } else {
            vc2Var = null;
        }
        if (sharedInstance == null || vc2Var == null || (groupCall = vc2Var.b) == null || !groupCall.rtmp_stream || sharedInstance.isHangingUp()) {
            return null;
        }
        return vc2Var;
    }

    public static boolean d() {
        me8 me8Var;
        ir9 ir9Var = w;
        if (ir9Var != null && (me8Var = ir9Var.a) != null && me8Var.g()) {
            return true;
        }
        return false;
    }

    public static void e(Activity activity) {
        ne8 i;
        int i2;
        if (c() != null) {
            ir9 ir9Var = w;
            if (ir9Var == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    i2 = sharedInstance.getAccount();
                } else {
                    i2 = yac.t0;
                }
                ir9 ir9Var2 = new ir9(i2);
                w = ir9Var2;
                ir9Var = ir9Var2;
            }
            me8 me8Var = ir9Var.a;
            if (me8Var == null || !me8Var.f()) {
                ir9Var.a = fc3.b().k(ir9Var);
            }
            me8 me8Var2 = ir9Var.a;
            if (me8Var2.c != 0 || (i = me8Var2.i(activity, null, true)) == null) {
                return;
            }
            ke8 ke8Var = new ke8(i);
            ir9Var.e = ke8Var;
            ir9Var.b.a = ke8Var;
            ir9Var.a();
            ir9Var.s = SystemClock.elapsedRealtime();
            li7 li7Var = ir9Var.n;
            hl.r(li7Var);
            hl.d3(li7Var, 700L);
            j95 j95Var = j95.s5;
            if (j95Var != null) {
                j95Var.dismiss();
            }
            er9 er9Var = er9.Q0;
            if (er9Var != null) {
                er9Var.dismiss();
            }
            hl.c3(new pg6((byte) 22));
        }
    }

    public static void h(boolean z) {
        int i;
        j95 j95Var = j95.s5;
        int i2 = 0;
        if (j95Var != null && j95Var.getWindow() != null) {
            View decorView = j95Var.getWindow().getDecorView();
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            decorView.setVisibility(i);
        }
        er9 er9Var = er9.Q0;
        if (er9Var != null && er9Var.getWindow() != null) {
            View decorView2 = er9Var.getWindow().getDecorView();
            if (z) {
                i2 = 4;
            }
            decorView2.setVisibility(i2);
        }
    }

    public static void m() {
        int i;
        vc2 c = c();
        ir9 ir9Var = w;
        if (c == null) {
            if (ir9Var != null) {
                w = null;
                int i2 = ir9Var.r;
                jn7.f(i2).n(ir9Var, jn7.w2);
                jn7.f(i2).n(ir9Var, jn7.B2);
                me8 me8Var = ir9Var.a;
                if (me8Var != null) {
                    ir9Var.a = null;
                    me8Var.h();
                }
                ir9Var.f();
                return;
            }
            return;
        }
        if (ir9Var == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                i = sharedInstance.getAccount();
            } else {
                i = yac.t0;
            }
            ir9Var = new ir9(i);
            w = ir9Var;
        }
        me8 me8Var2 = ir9Var.a;
        if (me8Var2 == null || !me8Var2.f()) {
            ir9Var.a = fc3.b().k(ir9Var);
        }
        w.a();
        w.a.e();
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
        return false;
    }

    @Override
    public final boolean G(boolean z, float f, cz9 cz9Var) {
        return false;
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
        return new hr9(this, launchActivity);
    }

    @Override
    public final void L(View view) {
        if (view == this.f) {
            h(false);
        }
        hr9 hr9Var = this.f;
        if (view == hr9Var) {
            hr9Var.b = false;
            hl.r(hr9Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
        hr9 hr9Var2 = (hr9) view;
        hr9Var2.b = false;
        hl.r(hr9Var2.e);
        hr9Var2.a.d.e();
    }

    @Override
    public final void N(View view) {
        h(true);
    }

    @Override
    public final View P() {
        return null;
    }

    @Override
    public final boolean Q() {
        if (er9.Q0 != null && j95.t5) {
            return true;
        }
        return false;
    }

    @Override
    public final void R(ne8 ne8Var) {
        ke8 ke8Var = new ke8(ne8Var);
        this.e = ke8Var;
        this.b.a = ke8Var;
        a();
        this.s = SystemClock.elapsedRealtime();
        li7 li7Var = this.n;
        hl.r(li7Var);
        hl.d3(li7Var, 700L);
    }

    @Override
    public final int S() {
        return 0;
    }

    @Override
    public final int U() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir9.U():int");
    }

    @Override
    public final boolean X() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y() {
        return false;
    }

    public final void a() {
        boolean z;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        vc2 c = c();
        boolean z2 = false;
        if (this.b.a == null && this.b.b == null) {
            z = false;
        } else {
            z = true;
        }
        if (z && c != null && !c.f.isEmpty()) {
            wc2 wc2Var = (wc2) c.f.get(0);
            groupCallParticipant = wc2Var.a;
            z2 = wc2Var.b;
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
                if (f11.a) {
                    cc4.b("rtmp pip: ".concat(sb2));
                }
            }
        }
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
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.w2 || i == jn7.B2) {
            a();
            hr9 hr9Var = this.f;
            if (hr9Var != null) {
                hr9Var.a();
            }
        }
    }

    public final void f() {
        hl.r(this.n);
        gr9 gr9Var = this.h;
        if (gr9Var != null) {
            gr9Var.a.K();
            VideoFrame videoFrame = gr9Var.b;
            if (videoFrame != null) {
                videoFrame.release();
                gr9Var.b = null;
            }
            this.h = null;
        }
        this.b.a = null;
        this.b.b = null;
        ke8 ke8Var = this.e;
        if (ke8Var != null) {
            ke8Var.a();
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
    public final void g0() {
        this.a = null;
        if (this.f != null) {
            h(false);
        }
        f();
        hl.c3(new pg6((byte) 22));
        hl.c3(new pg6((byte) 21));
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
        h(false);
        hr9 hr9Var = this.f;
        if (view == hr9Var) {
            hr9Var.b = false;
            hl.r(hr9Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
    }

    @Override
    public final void o0(View view) {
        hr9 hr9Var = (hr9) view;
        this.f = hr9Var;
        if (!hr9Var.b) {
            hr9Var.b = true;
            hl.d3(hr9Var.e, 500L);
        }
        hr9Var.a();
        this.b.b = this.f.a.d;
        a();
    }

    @Override
    public final void p0() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (sharedInstance != null && launchActivity != null && c() != null) {
            if (j95.s5 == null && er9.Q0 == null) {
                j95.T0(launchActivity, k5.a(sharedInstance.getAccount()), null, null, false, null);
            }
            if (this.a != null) {
                ke8 ke8Var = this.e;
                this.e = null;
                this.b.a = null;
                this.a.a(new v35(this, ke8Var, (byte) 29));
                hl.c3(new pg6((byte) 22));
                return;
            }
            return;
        }
        me8 me8Var = this.a;
        if (me8Var != null) {
            me8Var.b();
        }
    }

    @Override
    public final int q() {
        return 10;
    }

    @Override
    public final int q0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir9.q0():int");
    }

    @Override
    public final float r0() {
        return 0.0f;
    }

    @Override
    public final void s(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        ke8 ke8Var = this.e;
        this.e = null;
        this.b.a = null;
        a();
        if (ke8Var != null) {
            ke8Var.a();
        }
        surfaceTexture.release();
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
    public final void G0(int i) {
    }

    @Override
    public final void V(float f) {
    }

    @Override
    public final void g(long j) {
    }

    @Override
    public final void u0(int i, ArrayList arrayList) {
    }

    @Override
    public final void v0(Canvas canvas, int i, int i2) {
    }
}
