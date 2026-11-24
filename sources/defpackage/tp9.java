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
public final class tp9 implements vc8, jm7 {
    public static tp9 w;
    public ad8 a;
    public TLRPC.GroupCallParticipant c;
    public boolean d;
    public wc8 e;
    public sp9 f;
    public rp9 h;
    public final int r;
    public long s;
    public final qp9 b = new qp9(this);
    public final ei7 n = new ei7(this, (byte) 22);

    public tp9(int i) {
        this.r = i;
        nm7.f(i).a(this, nm7.w2);
        nm7.f(i).a(this, nm7.B2);
    }

    public static qd2 b() {
        qd2 qd2Var;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            qd2Var = sharedInstance.groupCall;
        } else {
            qd2Var = null;
        }
        if (sharedInstance == null || qd2Var == null || (groupCall = qd2Var.b) == null || !groupCall.rtmp_stream || sharedInstance.isHangingUp()) {
            return null;
        }
        return qd2Var;
    }

    public static boolean d() {
        ad8 ad8Var;
        tp9 tp9Var = w;
        if (tp9Var != null && (ad8Var = tp9Var.a) != null && ad8Var.f()) {
            return true;
        }
        return false;
    }

    public static void f(Activity activity) {
        bd8 h;
        int i;
        if (b() != null) {
            tp9 tp9Var = w;
            if (tp9Var == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    i = sharedInstance.getAccount();
                } else {
                    i = z8c.t0;
                }
                tp9 tp9Var2 = new tp9(i);
                w = tp9Var2;
                tp9Var = tp9Var2;
            }
            ad8 ad8Var = tp9Var.a;
            if (ad8Var == null || !ad8Var.e()) {
                tp9Var.a = yc3.c().k(tp9Var);
            }
            ad8 ad8Var2 = tp9Var.a;
            if (ad8Var2.c != 0 || (h = ad8Var2.h(activity, null, true)) == null) {
                return;
            }
            wc8 wc8Var = new wc8(h);
            tp9Var.e = wc8Var;
            tp9Var.b.a = wc8Var;
            tp9Var.a();
            tp9Var.s = SystemClock.elapsedRealtime();
            ei7 ei7Var = tp9Var.n;
            gm.r(ei7Var);
            gm.d3(ei7Var, 700L);
            g95 g95Var = g95.s5;
            if (g95Var != null) {
                g95Var.dismiss();
            }
            pp9 pp9Var = pp9.Q0;
            if (pp9Var != null) {
                pp9Var.dismiss();
            }
            gm.c3(new bo6((byte) 19));
        }
    }

    public static void h(boolean z) {
        int i;
        g95 g95Var = g95.s5;
        int i2 = 0;
        if (g95Var != null && g95Var.getWindow() != null) {
            View decorView = g95Var.getWindow().getDecorView();
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            decorView.setVisibility(i);
        }
        pp9 pp9Var = pp9.Q0;
        if (pp9Var != null && pp9Var.getWindow() != null) {
            View decorView2 = pp9Var.getWindow().getDecorView();
            if (z) {
                i2 = 4;
            }
            decorView2.setVisibility(i2);
        }
    }

    public static void m() {
        int i;
        qd2 b = b();
        tp9 tp9Var = w;
        if (b == null) {
            if (tp9Var != null) {
                w = null;
                int i2 = tp9Var.r;
                nm7.f(i2).n(tp9Var, nm7.w2);
                nm7.f(i2).n(tp9Var, nm7.B2);
                ad8 ad8Var = tp9Var.a;
                if (ad8Var != null) {
                    tp9Var.a = null;
                    ad8Var.g();
                }
                tp9Var.g();
                return;
            }
            return;
        }
        if (tp9Var == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                i = sharedInstance.getAccount();
            } else {
                i = z8c.t0;
            }
            tp9Var = new tp9(i);
            w = tp9Var;
        }
        ad8 ad8Var2 = tp9Var.a;
        if (ad8Var2 == null || !ad8Var2.e()) {
            tp9Var.a = yc3.c().k(tp9Var);
        }
        w.a();
        w.a.d();
    }

    @Override
    public final boolean A0() {
        return false;
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
        return new sp9(this, launchActivity);
    }

    @Override
    public final void K(View view) {
        if (view == this.f) {
            h(false);
        }
        sp9 sp9Var = this.f;
        if (view == sp9Var) {
            sp9Var.b = false;
            gm.r(sp9Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
        sp9 sp9Var2 = (sp9) view;
        sp9Var2.b = false;
        gm.r(sp9Var2.e);
        sp9Var2.a.d.release();
    }

    @Override
    public final void M(View view) {
        h(true);
    }

    @Override
    public final View O() {
        return null;
    }

    @Override
    public final boolean P() {
        if (pp9.Q0 != null && g95.t5) {
            return true;
        }
        return false;
    }

    @Override
    public final void Q(bd8 bd8Var) {
        wc8 wc8Var = new wc8(bd8Var);
        this.e = wc8Var;
        this.b.a = wc8Var;
        a();
        this.s = SystemClock.elapsedRealtime();
        ei7 ei7Var = this.n;
        gm.r(ei7Var);
        gm.d3(ei7Var, 700L);
    }

    @Override
    public final int S() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp9.S():int");
    }

    @Override
    public final boolean V() {
        if (b() != null) {
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

    public final void a() {
        boolean z;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        qd2 b = b();
        boolean z2 = false;
        if (this.b.a == null && this.b.b == null) {
            z = false;
        } else {
            z = true;
        }
        if (z && b != null && !b.f.isEmpty()) {
            rd2 rd2Var = (rd2) b.f.get(0);
            groupCallParticipant = rd2Var.a;
            z2 = rd2Var.b;
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
                if (e21.a) {
                    fc4.b("rtmp pip: ".concat(sb2));
                }
            }
        }
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.w2 || i == nm7.B2) {
            a();
            sp9 sp9Var = this.f;
            if (sp9Var != null) {
                sp9Var.a();
            }
        }
    }

    @Override
    public final void e0() {
        this.a = null;
        if (this.f != null) {
            h(false);
        }
        g();
        gm.c3(new bo6((byte) 19));
        gm.c3(new bo6((byte) 18));
    }

    public final void g() {
        gm.r(this.n);
        rp9 rp9Var = this.h;
        if (rp9Var != null) {
            rp9Var.a.K();
            VideoFrame videoFrame = rp9Var.b;
            if (videoFrame != null) {
                videoFrame.release();
                rp9Var.b = null;
            }
            this.h = null;
        }
        this.b.a = null;
        this.b.b = null;
        wc8 wc8Var = this.e;
        if (wc8Var != null) {
            wc8Var.a();
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
        sp9 sp9Var = this.f;
        if (view == sp9Var) {
            sp9Var.b = false;
            gm.r(sp9Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
    }

    @Override
    public final void m0(View view) {
        sp9 sp9Var = (sp9) view;
        this.f = sp9Var;
        if (!sp9Var.b) {
            sp9Var.b = true;
            gm.d3(sp9Var.e, 500L);
        }
        sp9Var.a();
        this.b.b = this.f.a.d;
        a();
    }

    @Override
    public final void n0() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (sharedInstance != null && launchActivity != null && b() != null) {
            if (g95.s5 == null && pp9.Q0 == null) {
                g95.S0(launchActivity, j5.a(sharedInstance.getAccount()), null, null, false, null);
            }
            if (this.a != null) {
                wc8 wc8Var = this.e;
                this.e = null;
                this.b.a = null;
                this.a.a(new u35(this, wc8Var, (byte) 29));
                gm.c3(new bo6((byte) 19));
                return;
            }
            return;
        }
        ad8 ad8Var = this.a;
        if (ad8Var != null) {
            ad8Var.b();
        }
    }

    @Override
    public final int o0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp9.o0():int");
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
    public final void r(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        wc8 wc8Var = this.e;
        this.e = null;
        this.b.a = null;
        a();
        if (wc8Var != null) {
            wc8Var.a();
        }
        surfaceTexture.release();
    }

    @Override
    public final void B0(int i) {
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
    public final void q0(int i, ArrayList arrayList) {
    }

    @Override
    public final void u0(Canvas canvas, int i, int i2) {
    }
}
