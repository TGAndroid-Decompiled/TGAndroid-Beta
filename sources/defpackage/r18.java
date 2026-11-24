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
public final class r18 implements hy1 {
    public final y28 a;

    public r18(y28 y28Var) {
        this.a = y28Var;
    }

    @Override
    public final void C0(CharSequence charSequence, boolean z, boolean z2) {
        y28 y28Var = this.a;
        if (y28Var.T2 == null) {
            s18 s18Var = new s18(y28Var, y28Var.getContext(), y28Var.r1, y28Var.z0.f, y28Var.r0);
            y28Var.T2 = s18Var;
            s18Var.p(new t18(y28Var));
            y28Var.addView(y28Var.T2, nme.e(-1, -1, 83));
        }
        if (y28Var.T2.getAdapter() != null) {
            y28Var.T2.setDialogId(y28Var.r1);
            boolean z3 = y28Var.E1.f;
            s18 s18Var2 = y28Var.T2;
            if (z3) {
                kz6 adapter = s18Var2.getAdapter();
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
                kz6 adapter2 = s18Var2.getAdapter();
                na7.q1(y28Var.s2).V1(Long.valueOf(y28Var.r1));
                TLRPC.Chat K0 = na7.q1(y28Var.s2).K0(Long.valueOf(-y28Var.r1));
                adapter2.getClass();
                adapter2.m0 = K0;
                y28Var.T2.getAdapter().U(charSequence, y28Var.R1.getCursorPosition(), null, false, false);
            }
        }
        y28Var.invalidate();
    }

    @Override
    public final bu1 D() {
        return null;
    }

    @Override
    public final void G0() {
        q qVar = this.a.z2;
        if (qVar != null) {
            qVar.y();
        }
    }

    @Override
    public final boolean H0() {
        TLRPC.User V1;
        y28 y28Var = this.a;
        if (y28Var.r1 >= 0 && (V1 = na7.q1(y28Var.s2).V1(Long.valueOf(y28Var.r1))) != null && !l7c.D(V1) && !V1.bot) {
            return true;
        }
        return false;
    }

    @Override
    public final void I0() {
        this.a.H0();
    }

    @Override
    public final void L0() {
        this.a.requestLayout();
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final boolean Q0() {
        return false;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void g1() {
        String str;
        int i;
        y28 y28Var = this.a;
        if (y28Var.u1) {
            y28Var.Y0();
            return;
        }
        if (y28Var.M2 == null) {
            ke5 ke5Var = new ke5(9, y28Var.r0, y28Var.getContext(), false);
            y28Var.M2 = ke5Var;
            ke5Var.setVisibility(8);
            y28Var.addView(y28Var.M2, nme.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        int i2 = (y28Var.r1 > 0L ? 1 : (y28Var.r1 == 0L ? 0 : -1));
        int i3 = y28Var.s2;
        if (i2 >= 0) {
            str = l7c.k(na7.q1(i3).V1(Long.valueOf(y28Var.r1)), true);
        } else {
            TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-y28Var.r1));
            if (K0 != null) {
                str = K0.title;
            } else {
                str = "";
            }
        }
        ke5 ke5Var2 = y28Var.M2;
        if (y28Var.R1.d1) {
            i = 2131743355;
        } else {
            i = 2131743278;
        }
        ke5Var2.setText(gl.S2(k96.a0(null, null, i, str)));
        y28Var.M2.c(y28Var.R1.getAudioVideoButtonContainer());
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final TLRPC.Peer i() {
        t76 t76Var;
        boolean z;
        m8b m8bVar = this.a.z0;
        if (m8bVar != null && (t76Var = m8bVar.B0) != null) {
            TLRPC.GroupCall groupCall = t76Var.s;
            if (groupCall == null) {
                z = false;
            } else {
                z = !groupCall.messages_enabled;
            }
            if (!z) {
                return t76Var.l();
            }
            return null;
        }
        return null;
    }

    @Override
    public final void k1(int i, int i2, int i3, long j, long j2, boolean z) {
        y28 y28Var = this.a;
        boolean z2 = false;
        if (y28Var.z2 == null && CameraView.isCameraAllowed()) {
            y28Var.z2 = new q(y28Var.getContext(), new z18(y28Var), y28Var.r0, false);
            y28Var.addView(y28Var.z2, Math.min(y28Var.indexOfChild(y28Var.R1.getRecordCircle()), y28Var.indexOfChild(y28Var.R1.E2)), nme.e(-1, -1, 51));
        }
        q qVar = y28Var.z2;
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
    public final int o0() {
        return this.a.getHeight();
    }

    @Override
    public final void s1() {
        this.a.J0();
    }

    @Override
    public final TL_stories.StoryItem t0() {
        return this.a.E1.a;
    }

    @Override
    public final void u(CharSequence charSequence, boolean z, int i, int i2, long j) {
        boolean z2;
        y28 y28Var = this.a;
        if (y28Var.w2) {
            gl.d3(new et(this, j, (byte) 23), 200L);
            return;
        }
        if (j <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        y28Var.a0(z2);
    }

    @Override
    public final boolean u0(long j) {
        y28 y28Var = this.a;
        x28 x28Var = y28Var.E1;
        TL_stories.StoryItem storyItem = x28Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) x28Var.a.media).call;
            savedefaultsendas.send_as = na7.q1(y28Var.s2).h1(j);
            ConnectionsManager.getInstance(y28Var.s2).sendRequest(savedefaultsendas, null);
            t76 t76Var = y28Var.z0.B0;
            if (t76Var != null) {
                TLRPC.Peer w1 = na7.q1(y28Var.s2).w1(j);
                TLRPC.GroupCall groupCall = t76Var.s;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, 2097152, true);
                    t76Var.s.default_send_as = w1;
                }
            }
            y28Var.h0(true);
            y28Var.R1.v2(true);
            y28Var.R1.N(true);
            y28Var.c1(false);
        }
        return true;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers v() {
        t76 t76Var;
        boolean z;
        y28 y28Var = this.a;
        if (y28Var.E1.f) {
            m8b m8bVar = y28Var.z0;
            if (m8bVar != null && (t76Var = m8bVar.B0) != null) {
                TLRPC.GroupCall groupCall = t76Var.s;
                if (groupCall == null) {
                    z = false;
                } else {
                    z = !groupCall.messages_enabled;
                }
                if (z) {
                    return null;
                }
            }
            return y28Var.D3;
        }
        return null;
    }

    @Override
    public final void w(float f, int i) {
        q qVar = this.a.z2;
        if (qVar != null) {
            qVar.h(f, i);
        }
    }

    @Override
    public final boolean y0() {
        tl9 tl9Var;
        q qVar = this.a.z2;
        if (qVar != null && (tl9Var = qVar.S) != null) {
            int i = tl9Var.a;
            if (i == 4 || i == 5 || i == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void B() {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void R0() {
    }

    @Override
    public final void S() {
    }

    @Override
    public final void U() {
    }

    @Override
    public final void W0() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void e1() {
    }

    @Override
    public final void g0() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void P0(CharSequence charSequence) {
    }

    @Override
    public final void f1(int i) {
    }

    @Override
    public final void j1(boolean z) {
    }

    @Override
    public final void k(float f) {
    }

    @Override
    public final void m(boolean z) {
    }

    @Override
    public final void n0(int i) {
    }

    @Override
    public final void z(boolean z) {
    }

    @Override
    public final void O0(View view, CharSequence charSequence, boolean z) {
    }
}
