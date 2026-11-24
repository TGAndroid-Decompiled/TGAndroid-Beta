package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.q;
public final class u38 implements uz1 {
    public final a58 a;

    public u38(a58 a58Var) {
        this.a = a58Var;
    }

    @Override
    public final void A1() {
        String str;
        int i;
        a58 a58Var = this.a;
        if (a58Var.u1) {
            a58Var.Y0();
            return;
        }
        if (a58Var.M2 == null) {
            ig5 ig5Var = new ig5(9, a58Var.r0, a58Var.getContext(), false);
            a58Var.M2 = ig5Var;
            ig5Var.setVisibility(8);
            a58Var.addView(a58Var.M2, qoe.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        int i2 = (a58Var.r1 > 0L ? 1 : (a58Var.r1 == 0L ? 0 : -1));
        int i3 = a58Var.s2;
        if (i2 >= 0) {
            str = m9c.k(oc7.r1(i3).W1(Long.valueOf(a58Var.r1)), true);
        } else {
            TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(-a58Var.r1));
            if (L0 != null) {
                str = L0.title;
            } else {
                str = "";
            }
        }
        ig5 ig5Var2 = a58Var.M2;
        if (a58Var.R1.d1) {
            i = 2131743281;
        } else {
            i = 2131743204;
        }
        ig5Var2.setText(gm.S2(jb6.a0(null, null, i, str)));
        a58Var.M2.c(a58Var.R1.getAudioVideoButtonContainer());
    }

    @Override
    public final int B0() {
        return this.a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem C0() {
        return this.a.E1.a;
    }

    @Override
    public final boolean E0(long j) {
        a58 a58Var = this.a;
        z48 z48Var = a58Var.E1;
        TL_stories.StoryItem storyItem = z48Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) z48Var.a.media).call;
            savedefaultsendas.send_as = oc7.r1(a58Var.s2).i1(j);
            ConnectionsManager.getInstance(a58Var.s2).sendRequest(savedefaultsendas, null);
            s96 s96Var = a58Var.z0.B0;
            if (s96Var != null) {
                TLRPC.Peer x1 = oc7.r1(a58Var.s2).x1(j);
                TLRPC.GroupCall groupCall = s96Var.s;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, 2097152, true);
                    s96Var.s.default_send_as = x1;
                }
            }
            a58Var.h0(true);
            a58Var.R1.A2(true);
            a58Var.R1.M(true);
            a58Var.c1(false);
        }
        return true;
    }

    @Override
    public final void F1(int i, int i2, int i3, long j, long j2, boolean z) {
        a58 a58Var = this.a;
        boolean z2 = false;
        if (a58Var.z2 == null && CameraView.isCameraAllowed()) {
            a58Var.z2 = new q(a58Var.getContext(), new c48(a58Var), a58Var.r0, false);
            a58Var.addView(a58Var.z2, Math.min(a58Var.indexOfChild(a58Var.R1.getRecordCircle()), a58Var.indexOfChild(a58Var.R1.E2)), qoe.e(-1, -1, 51));
        }
        q qVar = a58Var.z2;
        if (qVar != null) {
            if (i == 0) {
                qVar.v();
            } else if (i != 1 && i != 3 && i != 4) {
                if (i != 2) {
                    if (i != 5) {
                        return;
                    }
                } else {
                    z2 = true;
                }
                qVar.f(z2);
            } else {
                qVar.u(i, i2, i3, j, j2, z);
            }
        }
    }

    @Override
    public final boolean G0() {
        tn9 tn9Var;
        q qVar = this.a.z2;
        if (qVar != null && (tn9Var = qVar.S) != null) {
            int i = tn9Var.a;
            if (i == 4 || i == 5 || i == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void H0(CharSequence charSequence, boolean z, boolean z2) {
        a58 a58Var = this.a;
        if (a58Var.T2 == null) {
            v38 v38Var = new v38(a58Var, a58Var.getContext(), a58Var.r1, a58Var.z0.f, a58Var.r0);
            a58Var.T2 = v38Var;
            v38Var.p(new w38(a58Var));
            a58Var.addView(a58Var.T2, qoe.e(-1, -1, 83));
        }
        if (a58Var.T2.getAdapter() != null) {
            a58Var.T2.setDialogId(a58Var.r1);
            boolean z3 = a58Var.E1.f;
            v38 v38Var2 = a58Var.T2;
            if (z3) {
                k17 adapter = v38Var2.getAdapter();
                if (adapter.k0 == 0 && adapter.v0 == 0 && adapter.u0 == 0 && adapter.F0 == 0) {
                    adapter.x0 = null;
                    adapter.G = null;
                    ArrayList arrayList = adapter.B0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.S;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.U = null;
                    adapter.V = null;
                    ArrayList arrayList3 = adapter.y;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    ArrayList arrayList4 = adapter.J;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                    ArrayList arrayList5 = adapter.K;
                    if (arrayList5 != null) {
                        arrayList5.clear();
                    }
                    ArrayList arrayList6 = adapter.N;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    ArrayList arrayList7 = adapter.O;
                    if (arrayList7 != null) {
                        arrayList7.clear();
                    }
                    adapter.f();
                }
            } else {
                k17 adapter2 = v38Var2.getAdapter();
                oc7.r1(a58Var.s2).W1(Long.valueOf(a58Var.r1));
                TLRPC.Chat L0 = oc7.r1(a58Var.s2).L0(Long.valueOf(-a58Var.r1));
                adapter2.getClass();
                adapter2.m0 = L0;
                a58Var.T2.getAdapter().U(charSequence, a58Var.R1.getCursorPosition(), null, false, false);
            }
        }
        a58Var.invalidate();
    }

    @Override
    public final void I0() {
        q qVar = this.a.z2;
        if (qVar != null) {
            qVar.y();
        }
    }

    @Override
    public final nv1 J() {
        return null;
    }

    @Override
    public final boolean K0() {
        TLRPC.User W1;
        a58 a58Var = this.a;
        if (a58Var.r1 >= 0 && (W1 = oc7.r1(a58Var.s2).W1(Long.valueOf(a58Var.r1))) != null && !m9c.D(W1) && !W1.bot) {
            return true;
        }
        return false;
    }

    @Override
    public final void O0() {
        this.a.H0();
    }

    @Override
    public final void R1() {
        this.a.J0();
    }

    @Override
    public final void Y0() {
        this.a.requestLayout();
    }

    @Override
    public final boolean b0() {
        return true;
    }

    @Override
    public final boolean d1() {
        return false;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final TLRPC.Peer l() {
        s96 s96Var;
        boolean z;
        oab oabVar = this.a.z0;
        if (oabVar != null && (s96Var = oabVar.B0) != null) {
            TLRPC.GroupCall groupCall = s96Var.s;
            if (groupCall == null) {
                z = false;
            } else {
                z = !groupCall.messages_enabled;
            }
            if (!z) {
                return s96Var.l();
            }
            return null;
        }
        return null;
    }

    @Override
    public final void w(CharSequence charSequence, boolean z, int i, int i2, long j) {
        boolean z2;
        a58 a58Var = this.a;
        if (a58Var.w2) {
            gm.d3(new fu(this, j, (byte) 23), 200L);
            return;
        }
        if (j <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        a58Var.a0(z2);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers x() {
        s96 s96Var;
        boolean z;
        a58 a58Var = this.a;
        if (a58Var.E1.f) {
            oab oabVar = a58Var.z0;
            if (oabVar != null && (s96Var = oabVar.B0) != null) {
                TLRPC.GroupCall groupCall = s96Var.s;
                if (groupCall == null) {
                    z = false;
                } else {
                    z = !groupCall.messages_enabled;
                }
                if (z) {
                    return null;
                }
            }
            return a58Var.D3;
        }
        return null;
    }

    @Override
    public final void y(float f, int i) {
        q qVar = this.a.z2;
        if (qVar != null) {
            qVar.h(f, i);
        }
    }

    @Override
    public final void B() {
    }

    @Override
    public final void C(boolean z) {
    }

    @Override
    public final void E1(boolean z) {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void H1() {
    }

    @Override
    public final void I() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void W0() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c0() {
    }

    @Override
    public final void c1(CharSequence charSequence) {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void e1() {
    }

    @Override
    public final void f0() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void n0() {
    }

    @Override
    public final void o(float f) {
    }

    @Override
    public final void p(boolean z) {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void v1(int i) {
    }

    @Override
    public final void z0(int i) {
    }

    @Override
    public final void a1(View view, CharSequence charSequence, boolean z) {
    }
}
