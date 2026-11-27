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
public final class i58 implements xy1 {
    public final o68 a;

    public i58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override
    public final void B(float f, int i) {
        q qVar = this.a.t2;
        if (qVar != null) {
            qVar.h(f, i);
        }
    }

    @Override
    public final void D1() {
        String str;
        int i;
        o68 o68Var = this.a;
        if (o68Var.o1) {
            o68Var.Y0();
            return;
        }
        if (o68Var.G2 == null) {
            lg5 lg5Var = new lg5(9, o68Var.l0, o68Var.getContext(), false);
            o68Var.G2 = lg5Var;
            lg5Var.setVisibility(8);
            o68Var.addView(o68Var.G2, tre.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        int i2 = (o68Var.l1 > 0L ? 1 : (o68Var.l1 == 0L ? 0 : -1));
        int i3 = o68Var.m2;
        if (i2 >= 0) {
            str = lbc.k(uc7.s1(i3).X1(Long.valueOf(o68Var.l1)), true);
        } else {
            TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-o68Var.l1));
            if (M0 != null) {
                str = M0.title;
            } else {
                str = "";
            }
        }
        lg5 lg5Var2 = o68Var.G2;
        if (o68Var.L1.d1) {
            i = 2131743249;
        } else {
            i = 2131743172;
        }
        lg5Var2.setText(hl.S2(ob6.a0(null, null, i, str)));
        o68Var.G2.c(o68Var.L1.getAudioVideoButtonContainer());
    }

    @Override
    public final int E0() {
        return this.a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem F0() {
        return this.a.y1.a;
    }

    @Override
    public final boolean H0(long j) {
        o68 o68Var = this.a;
        n68 n68Var = o68Var.y1;
        TL_stories.StoryItem storyItem = n68Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) n68Var.a.media).call;
            savedefaultsendas.send_as = uc7.s1(o68Var.m2).j1(j);
            ConnectionsManager.getInstance(o68Var.m2).sendRequest(savedefaultsendas, null);
            w96 w96Var = o68Var.t0.B0;
            if (w96Var != null) {
                TLRPC.Peer y1 = uc7.s1(o68Var.m2).y1(j);
                TLRPC.GroupCall groupCall = w96Var.s;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, 2097152, true);
                    w96Var.s.default_send_as = y1;
                }
            }
            o68Var.h0(true);
            o68Var.L1.I2(true);
            o68Var.L1.P(true);
            o68Var.c1(false);
        }
        return true;
    }

    @Override
    public final void H1(int i, int i2, int i3, long j, long j2, boolean z) {
        o68 o68Var = this.a;
        boolean z2 = false;
        if (o68Var.t2 == null && CameraView.isCameraAllowed()) {
            o68Var.t2 = new q(o68Var.getContext(), new q58(o68Var), o68Var.l0, false);
            o68Var.addView(o68Var.t2, Math.min(o68Var.indexOfChild(o68Var.L1.getRecordCircle()), o68Var.indexOfChild(o68Var.L1.D2)), tre.e(-1, -1, 51));
        }
        q qVar = o68Var.t2;
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
    public final boolean L0() {
        ip9 ip9Var;
        q qVar = this.a.t2;
        if (qVar != null && (ip9Var = qVar.S) != null) {
            int i = ip9Var.a;
            if (i == 4 || i == 5 || i == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final ou1 R() {
        return null;
    }

    @Override
    public final void R0(CharSequence charSequence, boolean z, boolean z2) {
        o68 o68Var = this.a;
        if (o68Var.N2 == null) {
            j58 j58Var = new j58(o68Var, o68Var.getContext(), o68Var.l1, o68Var.t0.f, o68Var.l0);
            o68Var.N2 = j58Var;
            j58Var.p(new k58(o68Var));
            o68Var.addView(o68Var.N2, tre.e(-1, -1, 83));
        }
        if (o68Var.N2.getAdapter() != null) {
            o68Var.N2.setDialogId(o68Var.l1);
            boolean z3 = o68Var.y1.f;
            j58 j58Var2 = o68Var.N2;
            if (z3) {
                r17 adapter = j58Var2.getAdapter();
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
                r17 adapter2 = j58Var2.getAdapter();
                uc7.s1(o68Var.m2).X1(Long.valueOf(o68Var.l1));
                TLRPC.Chat M0 = uc7.s1(o68Var.m2).M0(Long.valueOf(-o68Var.l1));
                adapter2.getClass();
                adapter2.m0 = M0;
                o68Var.N2.getAdapter().U(charSequence, o68Var.L1.getCursorPosition(), null, false, false);
            }
        }
        o68Var.invalidate();
    }

    @Override
    public final void S0() {
        q qVar = this.a.t2;
        if (qVar != null) {
            qVar.y();
        }
    }

    @Override
    public final void S1() {
        this.a.J0();
    }

    @Override
    public final boolean T0() {
        TLRPC.User X1;
        o68 o68Var = this.a;
        if (o68Var.l1 >= 0 && (X1 = uc7.s1(o68Var.m2).X1(Long.valueOf(o68Var.l1))) != null && !lbc.D(X1) && !X1.bot) {
            return true;
        }
        return false;
    }

    @Override
    public final void W0() {
        this.a.H0();
    }

    @Override
    public final void Z0() {
        this.a.requestLayout();
    }

    @Override
    public final boolean e0() {
        return true;
    }

    @Override
    public final boolean e1() {
        return false;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final TLRPC.Peer k() {
        w96 w96Var;
        boolean z;
        lcb lcbVar = this.a.t0;
        if (lcbVar != null && (w96Var = lcbVar.B0) != null) {
            TLRPC.GroupCall groupCall = w96Var.s;
            if (groupCall == null) {
                z = false;
            } else {
                z = !groupCall.messages_enabled;
            }
            if (!z) {
                return w96Var.l();
            }
            return null;
        }
        return null;
    }

    @Override
    public final void x(CharSequence charSequence, boolean z, int i, int i2, long j) {
        boolean z2;
        o68 o68Var = this.a;
        if (o68Var.q2) {
            hl.d3(new kt(this, j, (byte) 23), 200L);
            return;
        }
        if (j <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        o68Var.a0(z2);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers y() {
        w96 w96Var;
        boolean z;
        o68 o68Var = this.a;
        if (o68Var.y1.f) {
            lcb lcbVar = o68Var.t0;
            if (lcbVar != null && (w96Var = lcbVar.B0) != null) {
                TLRPC.GroupCall groupCall = w96Var.s;
                if (groupCall == null) {
                    z = false;
                } else {
                    z = !groupCall.messages_enabled;
                }
                if (z) {
                    return null;
                }
            }
            return o68Var.x3;
        }
        return null;
    }

    @Override
    public final void B1() {
    }

    @Override
    public final void C() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void O1() {
    }

    @Override
    public final void P1() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void X0() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f0() {
    }

    @Override
    public final void g1() {
    }

    @Override
    public final void i0() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void C1(int i) {
    }

    @Override
    public final void D(boolean z) {
    }

    @Override
    public final void E1(boolean z) {
    }

    @Override
    public final void d1(CharSequence charSequence) {
    }

    @Override
    public final void o(float f) {
    }

    @Override
    public final void p(boolean z) {
    }

    @Override
    public final void z0(int i) {
    }

    @Override
    public final void b1(View view, CharSequence charSequence, boolean z) {
    }
}
