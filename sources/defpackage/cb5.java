package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class cb5 implements je8 {
    public static cb5 e;
    public me8 a;
    public za5 b;
    public float c;
    public String d;

    public static ArrayList a(long j, vc2 vc2Var) {
        g75 g75Var;
        ArrayList arrayList = vc2Var.f;
        ArrayList arrayList2 = new ArrayList();
        j95 j95Var = j95.s5;
        wc2 wc2Var = null;
        if (j95Var != null && (g75Var = j95Var.T3) != null && g75Var.b) {
            wc2Var = g75Var.e;
        }
        if (wc2Var != null && c(vc2Var, wc2Var, j)) {
            arrayList2.add(wc2Var);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            wc2 wc2Var2 = (wc2) arrayList.get(i);
            if (wc2Var2 != wc2Var && c(vc2Var, wc2Var2, j)) {
                arrayList2.add(wc2Var2);
            }
        }
        return arrayList2;
    }

    public static boolean c(vc2 vc2Var, wc2 wc2Var, long j) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        String str;
        if (wc2Var != vc2Var.z && (groupCallParticipant = wc2Var.a) != null && !groupCallParticipant.self) {
            long B1 = r47.B1(groupCallParticipant.peer);
            if (B1 != j && vc2Var.d.f(B1) != null) {
                boolean z = wc2Var.b;
                TLRPC.GroupCallParticipant groupCallParticipant2 = wc2Var.a;
                if (z) {
                    tL_groupCallParticipantVideo = groupCallParticipant2.presentation;
                } else {
                    tL_groupCallParticipantVideo = groupCallParticipant2.video;
                }
                if (tL_groupCallParticipantVideo != null) {
                    if (z) {
                        str = groupCallParticipant2.presentationEndpoint;
                    } else {
                        str = groupCallParticipant2.videoEndpoint;
                    }
                    if (str != null) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void d() {
        me8 me8Var;
        ?? r4;
        cb5 cb5Var = e;
        if (cb5Var != null && (me8Var = cb5Var.a) != null && me8Var.f()) {
            ra5 ra5Var = ra5.f0;
            me8 me8Var2 = e.a;
            boolean z = false;
            if (ra5Var != null) {
                r4 = 1;
            } else {
                r4 = 0;
            }
            if (ra5Var != null && ra5Var.r) {
                z = true;
            }
            byte b = me8Var2.c;
            if (b != 3) {
                me8Var2.g = r4;
                me8Var2.h = z;
                if (b == 2) {
                    me8Var2.d = r4;
                } else {
                    me8Var2.c = r4;
                }
                me8Var2.b.d();
            }
        }
    }

    public static void e() {
        float f;
        String str;
        ir9.m();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        vc2 vc2Var = null;
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            cb5 cb5Var = e;
            cb5 cb5Var2 = cb5Var;
            if (cb5Var == null) {
                ?? obj = new Object();
                obj.c = 1.0f;
                e = obj;
                cb5Var2 = obj;
            }
            me8 me8Var = cb5Var2.a;
            if (me8Var == null || !me8Var.f()) {
                e.a = fc3.b().k(e);
                d();
            }
            cb5 cb5Var3 = e;
            if (cb5Var3.b == null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    vc2Var = sharedInstance3.groupCall;
                }
                if (sharedInstance2 != null && vc2Var != null) {
                    ArrayList a = a(sharedInstance2.getSelfId(), vc2Var);
                    int max = Math.max(1, a.size());
                    float[] fArr = new float[max];
                    float[] fArr2 = new float[max];
                    Arrays.fill(fArr2, 1.0f);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < a.size(); i++) {
                        wc2 wc2Var = (wc2) a.get(i);
                        float f2 = wc2Var.c;
                        if (f2 <= 0.0f) {
                            f2 = 0.0f;
                        }
                        fArr[i] = f2;
                        boolean z = wc2Var.b;
                        if (z) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        fArr2[i] = f;
                        TLRPC.GroupCallParticipant groupCallParticipant = wc2Var.a;
                        if (z) {
                            str = groupCallParticipant.presentationEndpoint;
                        } else {
                            str = groupCallParticipant.videoEndpoint;
                        }
                        sb.append(str);
                        sb.append(':');
                        sb.append(Math.round(fArr[i] * 100.0f));
                        sb.append(';');
                    }
                    String sb2 = sb.toString();
                    if (!sb2.equals(cb5Var3.d)) {
                        cb5Var3.d = sb2;
                        cb5Var3.c = xte.a(fArr, fArr2, 0.45f, 2.35f, null, 0.0f).a;
                    }
                }
            }
            e.a.e();
            return;
        }
        cb5 cb5Var4 = e;
        if (cb5Var4 != null) {
            e = null;
            me8 me8Var2 = cb5Var4.a;
            if (me8Var2 != null) {
                cb5Var4.a = null;
                me8Var2.h();
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
        k91.b(i, true);
        hl.d3(new jm3((byte) 16), 300L);
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
        return new za5(this, launchActivity);
    }

    @Override
    public final void L(View view) {
        ((za5) view).h();
        if (this.b == view) {
            this.b = null;
        }
    }

    @Override
    public final View P() {
        return null;
    }

    @Override
    public final boolean Q() {
        if (j95.s5 != null && j95.t5) {
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
        float f;
        za5 za5Var = this.b;
        if (za5Var != null) {
            f = za5Var.n;
        } else {
            f = this.c;
        }
        return Math.round(f * 1000.0f);
    }

    @Override
    public final boolean X() {
        vc2 vc2Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (sharedInstance2 != null) {
            vc2Var = sharedInstance2.groupCall;
        } else {
            vc2Var = null;
        }
        if (sharedInstance != null && vc2Var != null && !sharedInstance.isHangingUp() && !vc2Var.k()) {
            TLRPC.GroupCall groupCall = vc2Var.b;
            if (groupCall == null || !groupCall.rtmp_stream) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean Y() {
        return false;
    }

    @Override
    public final dg8 a0() {
        return null;
    }

    @Override
    public final boolean d0() {
        return true;
    }

    @Override
    public final void g0() {
        this.a = null;
        j95 j95Var = j95.s5;
        if (j95Var != null && j95Var.getWindow() != null) {
            j95Var.getWindow().getDecorView().setVisibility(0);
        }
        hl.c3(new jm3((byte) 16));
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
        ((za5) view).h();
        za5 za5Var = this.b;
        if (za5Var == view) {
            this.c = za5Var.n;
            this.b = null;
        }
        j95 j95Var = j95.s5;
        if (j95Var != null) {
            if (j95Var.getWindow() != null) {
                j95Var.getWindow().getDecorView().setVisibility(0);
            }
            j95Var.o1();
        }
        ra5.k(view.getContext());
    }

    @Override
    public final void o0(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z = false;
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z = true;
        }
        k91.a = z;
        this.b = (za5) view;
        j95 j95Var = j95.s5;
        if (j95Var != null) {
            j95Var.n1();
            if (j95Var.getWindow() != null) {
                j95Var.getWindow().getDecorView().setVisibility(4);
            }
        }
        za5 za5Var = this.b;
        if (!za5Var.w) {
            za5Var.w = true;
            za5Var.x = SystemClock.elapsedRealtime();
            VoIPService.getSharedInstance();
            za5Var.H = k91.c();
            za5Var.f.a();
            za5Var.i(true);
            hl.d3(za5Var.J, 250L);
        }
        ra5.k(view.getContext());
    }

    @Override
    public final int q() {
        return 10;
    }

    @Override
    public final int q0() {
        return 1000;
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
        k91.a(i, arrayList, true);
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
    public final void N(View view) {
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
