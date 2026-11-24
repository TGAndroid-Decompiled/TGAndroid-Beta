package defpackage;

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
public final class a95 implements sa8 {
    public static a95 e;
    public xa8 a;
    public w85 b;
    public float c;
    public String d;

    public static ArrayList a(long j, fc2 fc2Var) {
        e55 e55Var;
        ArrayList arrayList = fc2Var.f;
        ArrayList arrayList2 = new ArrayList();
        h75 h75Var = h75.s5;
        gc2 gc2Var = null;
        if (h75Var != null && (e55Var = h75Var.T3) != null && e55Var.b) {
            gc2Var = e55Var.e;
        }
        if (gc2Var != null && b(fc2Var, gc2Var, j)) {
            arrayList2.add(gc2Var);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            gc2 gc2Var2 = (gc2) arrayList.get(i);
            if (gc2Var2 != gc2Var && b(fc2Var, gc2Var2, j)) {
                arrayList2.add(gc2Var2);
            }
        }
        return arrayList2;
    }

    public static boolean b(fc2 fc2Var, gc2 gc2Var, long j) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        String str;
        if (gc2Var != fc2Var.z && (groupCallParticipant = gc2Var.a) != null && !groupCallParticipant.self) {
            long B1 = k27.B1(groupCallParticipant.peer);
            if (B1 != j && fc2Var.d.f(B1) != null) {
                boolean z = gc2Var.b;
                TLRPC.GroupCallParticipant groupCallParticipant2 = gc2Var.a;
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

    public static void c() {
        xa8 xa8Var;
        ?? r4;
        a95 a95Var = e;
        if (a95Var != null && (xa8Var = a95Var.a) != null && xa8Var.d()) {
            o85 o85Var = o85.f0;
            xa8 xa8Var2 = e.a;
            boolean z = false;
            if (o85Var != null) {
                r4 = 1;
            } else {
                r4 = 0;
            }
            if (o85Var != null && o85Var.r) {
                z = true;
            }
            byte b = xa8Var2.c;
            if (b != 3) {
                xa8Var2.f = r4;
                xa8Var2.g = z;
                if (b == 2) {
                    xa8Var2.d = r4;
                } else {
                    xa8Var2.c = r4;
                }
                xa8Var2.b.d();
            }
        }
    }

    public static void d() {
        float f;
        String str;
        sn9.i();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        fc2 fc2Var = null;
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            a95 a95Var = e;
            a95 a95Var2 = a95Var;
            if (a95Var == null) {
                ?? obj = new Object();
                obj.c = 1.0f;
                e = obj;
                a95Var2 = obj;
            }
            xa8 xa8Var = a95Var2.a;
            if (xa8Var == null || !xa8Var.d()) {
                e.a = mb3.c().k(e);
                c();
            }
            a95 a95Var3 = e;
            if (a95Var3.b == null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    fc2Var = sharedInstance3.groupCall;
                }
                if (sharedInstance2 != null && fc2Var != null) {
                    ArrayList a = a(sharedInstance2.getSelfId(), fc2Var);
                    int max = Math.max(1, a.size());
                    float[] fArr = new float[max];
                    float[] fArr2 = new float[max];
                    Arrays.fill(fArr2, 1.0f);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < a.size(); i++) {
                        gc2 gc2Var = (gc2) a.get(i);
                        float f2 = gc2Var.c;
                        if (f2 <= 0.0f) {
                            f2 = 0.0f;
                        }
                        fArr[i] = f2;
                        boolean z = gc2Var.b;
                        if (z) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        fArr2[i] = f;
                        TLRPC.GroupCallParticipant groupCallParticipant = gc2Var.a;
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
                    if (!sb2.equals(a95Var3.d)) {
                        a95Var3.d = sb2;
                        a95Var3.c = dpe.a(fArr, fArr2, 0.45f, 2.35f, null, 0.0f).a;
                    }
                }
            }
            e.a.c();
            return;
        }
        a95 a95Var4 = e;
        if (a95Var4 != null) {
            e = null;
            xa8 xa8Var2 = a95Var4.a;
            if (xa8Var2 != null) {
                a95Var4.a = null;
                xa8Var2.f();
            }
        }
    }

    @Override
    public final void A0(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
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
        if (h75.s5 != null && h75.t5) {
            return true;
        }
        return false;
    }

    @Override
    public final void G2(int i) {
        b91.b(i, true);
        gl.e3(new ql3((byte) 14), 300L);
    }

    @Override
    public final void L1(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z = false;
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z = true;
        }
        b91.a = z;
        this.b = (w85) view;
        h75 h75Var = h75.s5;
        if (h75Var != null) {
            h75Var.m1();
            if (h75Var.getWindow() != null) {
                h75Var.getWindow().getDecorView().setVisibility(4);
            }
        }
        w85 w85Var = this.b;
        if (!w85Var.w) {
            w85Var.w = true;
            w85Var.x = SystemClock.elapsedRealtime();
            VoIPService.getSharedInstance();
            w85Var.H = b91.c();
            w85Var.f.a();
            w85Var.i(true);
            gl.e3(w85Var.J, 250L);
        }
        o85.k(view.getContext());
    }

    @Override
    public final int Q0() {
        float f;
        w85 w85Var = this.b;
        if (w85Var != null) {
            f = w85Var.n;
        } else {
            f = this.c;
        }
        return Math.round(f * 1000.0f);
    }

    @Override
    public final int S1() {
        return 1000;
    }

    @Override
    public final boolean T() {
        return true;
    }

    @Override
    public final boolean Z(boolean z, float f, iv9 iv9Var) {
        return false;
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final boolean a1() {
        fc2 fc2Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (sharedInstance2 != null) {
            fc2Var = sharedInstance2.groupCall;
        } else {
            fc2Var = null;
        }
        if (sharedInstance != null && fc2Var != null && !sharedInstance.isHangingUp() && !fc2Var.k()) {
            TLRPC.GroupCall groupCall = fc2Var.b;
            if (groupCall == null || !groupCall.rtmp_stream) {
                return true;
            }
            return false;
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
        b91.a = false;
        ((w85) view).h();
        w85 w85Var = this.b;
        if (w85Var == view) {
            this.c = w85Var.n;
            this.b = null;
        }
        h75 h75Var = h75.s5;
        if (h75Var != null) {
            if (h75Var.getWindow() != null) {
                h75Var.getWindow().getDecorView().setVisibility(0);
            }
            h75Var.n1();
        }
        o85.k(view.getContext());
    }

    @Override
    public final View o0(LaunchActivity launchActivity) {
        return new w85(this, launchActivity);
    }

    @Override
    public final void o2(int i, ArrayList arrayList) {
        b91.a(i, arrayList, true);
    }

    @Override
    public final void p0(View view) {
        ((w85) view).h();
        if (this.b == view) {
            this.b = null;
        }
    }

    @Override
    public final boolean p1() {
        return true;
    }

    @Override
    public final int u() {
        return 10;
    }

    @Override
    public final void u1() {
        this.a = null;
        h75 h75Var = h75.s5;
        if (h75Var != null && h75Var.getWindow() != null) {
            h75Var.getWindow().getDecorView().setVisibility(0);
        }
        gl.d3(new ql3((byte) 14));
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
    public final void x0(View view) {
    }

    @Override
    public final void r2(Canvas canvas, int i, int i2) {
    }
}
