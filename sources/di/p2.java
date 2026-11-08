package di;

import android.view.View;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.wf;
import org.telegram.ui.Components.y20;
import org.telegram.ui.qm;
public final class p2 implements wf {
    public final i4 f9505a;

    public p2(i4 i4Var) {
        this.f9505a = i4Var;
    }

    @Override
    public final void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        boolean z10;
        i4 i4Var = this.f9505a;
        if (i4Var.f9182p2) {
            org.telegram.messenger.g0.i3(new bi.r3(this, j3, 3), 200L);
            return;
        }
        if (j3 <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i4Var.i0(z10);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers I() {
        g1 g1Var;
        boolean z9;
        i4 i4Var = this.f9505a;
        if (i4Var.f9213x1.f9042f) {
            p9 p9Var = i4Var.f9192s0;
            if (p9Var != null && (g1Var = p9Var.A0) != null) {
                TLRPC.GroupCall groupCall = g1Var.f9030w;
                if (groupCall == null) {
                    z9 = false;
                } else {
                    z9 = !groupCall.messages_enabled;
                }
                if (z9) {
                    return null;
                }
            }
            return i4Var.f9215x3;
        }
        return null;
    }

    @Override
    public final void M(float f10, int i7) {
        o40 o40Var = this.f9505a.f9194s2;
        if (o40Var != null) {
            o40Var.b(f10, i7);
        }
    }

    @Override
    public final int S0() {
        return this.f9505a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem T0() {
        return this.f9505a.f9213x1.f9038a;
    }

    @Override
    public final boolean V0(long j3) {
        i4 i4Var = this.f9505a;
        g4 g4Var = i4Var.f9213x1;
        TL_stories.StoryItem storyItem = g4Var.f9038a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) g4Var.f9038a.media).call;
            savedefaultsendas.send_as = qp.s1(i4Var.f9168l2).j1(j3);
            ConnectionsManager.getInstance(i4Var.f9168l2).sendRequest(savedefaultsendas, null);
            g1 g1Var = i4Var.f9192s0.A0;
            if (g1Var != null) {
                TLRPC.Peer z12 = qp.s1(i4Var.f9168l2).z1(j3);
                TLRPC.GroupCall groupCall = g1Var.f9030w;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, 2097152, true);
                    g1Var.f9030w.default_send_as = z12;
                }
            }
            i4Var.p0(true);
            i4Var.K1.R1(true);
            i4Var.K1.E(true);
            i4Var.d1(false);
        }
        return true;
    }

    @Override
    public final boolean X0() {
        o40 o40Var = this.f9505a.f9194s2;
        if (o40Var != null && !o40Var.f36552i0) {
            return true;
        }
        return false;
    }

    @Override
    public final void X1() {
        String str;
        int i7;
        i4 i4Var = this.f9505a;
        if (i4Var.n1) {
            i4.f0(i4Var);
            return;
        }
        if (i4Var.F2 == null) {
            y20 y20Var = new y20(9, i4Var.getContext(), i4Var.f9163k0, false);
            i4Var.F2 = y20Var;
            y20Var.setVisibility(8);
            i4Var.addView(i4Var.F2, ha.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (i4Var.f9164k1 >= 0) {
            str = t10.j(qp.s1(i4Var.f9168l2).a2(Long.valueOf(i4Var.f9164k1)), true);
        } else {
            TLRPC.Chat M0 = qp.s1(i4Var.f9168l2).M0(Long.valueOf(-i4Var.f9164k1));
            if (M0 != null) {
                str = M0.title;
            } else {
                str = "";
            }
        }
        y20 y20Var2 = i4Var.F2;
        if (i4Var.K1.f31029c1) {
            i7 = 2131743597;
        } else {
            i7 = 2131743523;
        }
        y20Var2.setText(org.telegram.messenger.g0.X2(id.a0(null, null, i7, str)));
        i4Var.F2.c(i4Var.K1.getAudioVideoButtonContainer());
    }

    @Override
    public final void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        i4 i4Var = this.f9505a;
        boolean z10 = false;
        if (i4Var.f9194s2 == null && CameraView.isCameraAllowed()) {
            i4Var.f9194s2 = new o40(i4Var.getContext(), new c3(i4Var), i4Var.f9163k0, false);
            i4Var.addView(i4Var.f9194s2, Math.min(i4Var.indexOfChild(i4Var.K1.getRecordCircle()), i4Var.indexOfChild(i4Var.K1.O1)), ha.e(-1, -1, 51));
        }
        o40 o40Var = i4Var.f9194s2;
        if (o40Var != null) {
            if (i7 == 0) {
                o40Var.j(false);
            } else if (i7 != 1 && i7 != 3 && i7 != 4) {
                if (i7 == 2 || i7 == 5) {
                    if (i7 == 2) {
                        z10 = true;
                    }
                    o40Var.a(z10);
                }
            } else {
                o40Var.h(i7, i10, i11, j3, j10, z9);
            }
        }
    }

    @Override
    public final void a1(CharSequence charSequence, boolean z9, boolean z10) {
        i4 i4Var = this.f9505a;
        if (i4Var.M2 == null) {
            q2 q2Var = new q2(i4Var, i4Var.getContext(), i4Var.f9164k1, i4Var.f9192s0.f9543f, i4Var.f9163k0);
            i4Var.M2 = q2Var;
            q2Var.p(new t2(i4Var));
            i4Var.addView(i4Var.M2, ha.e(-1, -1, 83));
        }
        if (i4Var.M2.getAdapter() != null) {
            i4Var.M2.setDialogId(i4Var.f9164k1);
            if (i4Var.f9213x1.f9042f) {
                jg.i1 adapter = i4Var.M2.getAdapter();
                if (adapter.f16786j0 == 0 && adapter.f16799u0 == 0 && adapter.f16798t0 == 0 && adapter.E0 == 0) {
                    adapter.f16802w0 = null;
                    adapter.F = null;
                    ArrayList arrayList = adapter.A0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.R;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.T = null;
                    adapter.U = null;
                    ArrayList arrayList3 = adapter.f16805y;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    ArrayList arrayList4 = adapter.I;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                    ArrayList arrayList5 = adapter.J;
                    if (arrayList5 != null) {
                        arrayList5.clear();
                    }
                    ArrayList arrayList6 = adapter.M;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    ArrayList arrayList7 = adapter.N;
                    if (arrayList7 != null) {
                        arrayList7.clear();
                    }
                    adapter.f();
                }
            } else {
                jg.i1 adapter2 = i4Var.M2.getAdapter();
                qp.s1(i4Var.f9168l2).a2(Long.valueOf(i4Var.f9164k1));
                TLRPC.Chat M0 = qp.s1(i4Var.f9168l2).M0(Long.valueOf(-i4Var.f9164k1));
                adapter2.getClass();
                adapter2.f16788l0 = M0;
                i4Var.M2.getAdapter().U(charSequence, i4Var.K1.getCursorPosition(), null, false, false);
            }
        }
        i4Var.invalidate();
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void c1() {
        o40 o40Var = this.f9505a.f9194s2;
        if (o40Var != null) {
            o40Var.k();
        }
    }

    @Override
    public final boolean d1() {
        TLRPC.User a22;
        i4 i4Var = this.f9505a;
        if (i4Var.f9164k1 < 0 || (a22 = qp.s1(i4Var.f9168l2).a2(Long.valueOf(i4Var.f9164k1))) == null || t10.B(a22) || a22.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final void e1() {
        this.f9505a.M0();
    }

    @Override
    public final void h1() {
        this.f9505a.requestLayout();
    }

    @Override
    public final int l() {
        return 0;
    }

    @Override
    public final boolean l1() {
        return false;
    }

    @Override
    public final void l2() {
        this.f9505a.N0();
    }

    @Override
    public final qm o0() {
        return null;
    }

    @Override
    public final TLRPC.Peer s() {
        g1 g1Var;
        boolean z9;
        p9 p9Var = this.f9505a.f9192s0;
        if (p9Var != null && (g1Var = p9Var.A0) != null) {
            TLRPC.GroupCall groupCall = g1Var.f9030w;
            if (groupCall == null) {
                z9 = false;
            } else {
                z9 = !groupCall.messages_enabled;
            }
            if (!z9) {
                return g1Var.i();
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean v0() {
        return true;
    }

    @Override
    public final void B(boolean z9) {
    }

    @Override
    public final void R0(int i7) {
    }

    @Override
    public final void V1(int i7) {
    }

    @Override
    public final void Y(boolean z9) {
    }

    @Override
    public final void Y1(boolean z9) {
    }

    @Override
    public final void k1(CharSequence charSequence) {
    }

    @Override
    public final void w(float f10) {
    }

    @Override
    public final void C0() {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void E() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void T1() {
    }

    @Override
    public final void W() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void f1() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void j0() {
    }

    @Override
    public final void m1() {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void i1(View view, CharSequence charSequence, boolean z9) {
    }
}
