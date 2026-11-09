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
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.wf;
import org.telegram.ui.Components.z20;
import org.telegram.ui.sm;
public final class p2 implements wf {
    public final j4 f9494a;

    public p2(j4 j4Var) {
        this.f9494a = j4Var;
    }

    @Override
    public final void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        boolean z10;
        j4 j4Var = this.f9494a;
        if (j4Var.f9214p2) {
            org.telegram.messenger.g0.i3(new bi.r3(this, j3, 3), 200L);
            return;
        }
        if (j3 <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        j4Var.i0(z10);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers I() {
        g1 g1Var;
        boolean z9;
        j4 j4Var = this.f9494a;
        if (j4Var.f9245x1.f9068f) {
            q9 q9Var = j4Var.f9224s0;
            if (q9Var != null && (g1Var = q9Var.A0) != null) {
                TLRPC.GroupCall groupCall = g1Var.f9005w;
                if (groupCall == null) {
                    z9 = false;
                } else {
                    z9 = !groupCall.messages_enabled;
                }
                if (z9) {
                    return null;
                }
            }
            return j4Var.f9247x3;
        }
        return null;
    }

    @Override
    public final void M(float f10, int i7) {
        p40 p40Var = this.f9494a.f9226s2;
        if (p40Var != null) {
            p40Var.b(f10, i7);
        }
    }

    @Override
    public final int S0() {
        return this.f9494a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem T0() {
        return this.f9494a.f9245x1.f9064a;
    }

    @Override
    public final boolean V0(long j3) {
        j4 j4Var = this.f9494a;
        h4 h4Var = j4Var.f9245x1;
        TL_stories.StoryItem storyItem = h4Var.f9064a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) h4Var.f9064a.media).call;
            savedefaultsendas.send_as = qp.s1(j4Var.f9200l2).j1(j3);
            ConnectionsManager.getInstance(j4Var.f9200l2).sendRequest(savedefaultsendas, null);
            g1 g1Var = j4Var.f9224s0.A0;
            if (g1Var != null) {
                TLRPC.Peer z12 = qp.s1(j4Var.f9200l2).z1(j3);
                TLRPC.GroupCall groupCall = g1Var.f9005w;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, 2097152, true);
                    g1Var.f9005w.default_send_as = z12;
                }
            }
            j4Var.p0(true);
            j4Var.K1.R1(true);
            j4Var.K1.E(true);
            j4Var.d1(false);
        }
        return true;
    }

    @Override
    public final boolean X0() {
        p40 p40Var = this.f9494a.f9226s2;
        if (p40Var != null && !p40Var.f36901i0) {
            return true;
        }
        return false;
    }

    @Override
    public final void X1() {
        String str;
        int i7;
        j4 j4Var = this.f9494a;
        if (j4Var.n1) {
            j4.f0(j4Var);
            return;
        }
        if (j4Var.F2 == null) {
            z20 z20Var = new z20(9, j4Var.getContext(), j4Var.f9195k0, false);
            j4Var.F2 = z20Var;
            z20Var.setVisibility(8);
            j4Var.addView(j4Var.F2, ha.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (j4Var.f9196k1 >= 0) {
            str = t10.j(qp.s1(j4Var.f9200l2).a2(Long.valueOf(j4Var.f9196k1)), true);
        } else {
            TLRPC.Chat M0 = qp.s1(j4Var.f9200l2).M0(Long.valueOf(-j4Var.f9196k1));
            if (M0 != null) {
                str = M0.title;
            } else {
                str = "";
            }
        }
        z20 z20Var2 = j4Var.F2;
        if (j4Var.K1.f31034c1) {
            i7 = 2131743594;
        } else {
            i7 = 2131743520;
        }
        z20Var2.setText(org.telegram.messenger.g0.X2(id.a0(null, null, i7, str)));
        j4Var.F2.c(j4Var.K1.getAudioVideoButtonContainer());
    }

    @Override
    public final void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        j4 j4Var = this.f9494a;
        boolean z10 = false;
        if (j4Var.f9226s2 == null && CameraView.isCameraAllowed()) {
            j4Var.f9226s2 = new p40(j4Var.getContext(), new c3(j4Var), j4Var.f9195k0, false);
            j4Var.addView(j4Var.f9226s2, Math.min(j4Var.indexOfChild(j4Var.K1.getRecordCircle()), j4Var.indexOfChild(j4Var.K1.O1)), ha.e(-1, -1, 51));
        }
        p40 p40Var = j4Var.f9226s2;
        if (p40Var != null) {
            if (i7 == 0) {
                p40Var.j(false);
            } else if (i7 != 1 && i7 != 3 && i7 != 4) {
                if (i7 == 2 || i7 == 5) {
                    if (i7 == 2) {
                        z10 = true;
                    }
                    p40Var.a(z10);
                }
            } else {
                p40Var.h(i7, i10, i11, j3, j10, z9);
            }
        }
    }

    @Override
    public final void a1(CharSequence charSequence, boolean z9, boolean z10) {
        j4 j4Var = this.f9494a;
        if (j4Var.M2 == null) {
            q2 q2Var = new q2(j4Var, j4Var.getContext(), j4Var.f9196k1, j4Var.f9224s0.f9608f, j4Var.f9195k0);
            j4Var.M2 = q2Var;
            q2Var.p(new t2(j4Var));
            j4Var.addView(j4Var.M2, ha.e(-1, -1, 83));
        }
        if (j4Var.M2.getAdapter() != null) {
            j4Var.M2.setDialogId(j4Var.f9196k1);
            if (j4Var.f9245x1.f9068f) {
                jg.i1 adapter = j4Var.M2.getAdapter();
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
                jg.i1 adapter2 = j4Var.M2.getAdapter();
                qp.s1(j4Var.f9200l2).a2(Long.valueOf(j4Var.f9196k1));
                TLRPC.Chat M0 = qp.s1(j4Var.f9200l2).M0(Long.valueOf(-j4Var.f9196k1));
                adapter2.getClass();
                adapter2.f16788l0 = M0;
                j4Var.M2.getAdapter().U(charSequence, j4Var.K1.getCursorPosition(), null, false, false);
            }
        }
        j4Var.invalidate();
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void c1() {
        p40 p40Var = this.f9494a.f9226s2;
        if (p40Var != null) {
            p40Var.k();
        }
    }

    @Override
    public final boolean d1() {
        TLRPC.User a22;
        j4 j4Var = this.f9494a;
        if (j4Var.f9196k1 < 0 || (a22 = qp.s1(j4Var.f9200l2).a2(Long.valueOf(j4Var.f9196k1))) == null || t10.B(a22) || a22.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final void e1() {
        this.f9494a.M0();
    }

    @Override
    public final void h1() {
        this.f9494a.requestLayout();
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
        this.f9494a.N0();
    }

    @Override
    public final sm o0() {
        return null;
    }

    @Override
    public final TLRPC.Peer s() {
        g1 g1Var;
        boolean z9;
        q9 q9Var = this.f9494a.f9224s0;
        if (q9Var != null && (g1Var = q9Var.A0) != null) {
            TLRPC.GroupCall groupCall = g1Var.f9005w;
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
