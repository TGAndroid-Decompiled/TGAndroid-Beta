package ei;

import android.view.View;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.uf;
import org.telegram.ui.mm;
public final class t2 implements uf {
    public final j4 f11039a;

    public t2(j4 j4Var) {
        this.f11039a = j4Var;
    }

    @Override
    public final void G(CharSequence charSequence, boolean z10, int i3, int i10, long j10) {
        boolean z11;
        j4 j4Var = this.f11039a;
        if (j4Var.f10496q2) {
            org.telegram.messenger.g0.i3(new ci.e3(this, j10, 3), 200L);
            return;
        }
        if (j10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        j4Var.i0(z11);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers M() {
        g1 g1Var;
        boolean z10;
        j4 j4Var = this.f11039a;
        if (j4Var.f10527y1.f10362f) {
            r9 r9Var = j4Var.f10506t0;
            if (r9Var != null && (g1Var = r9Var.B0) != null) {
                TLRPC.GroupCall groupCall = g1Var.f10304w;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return null;
                }
            }
            return j4Var.f10529y3;
        }
        return null;
    }

    @Override
    public final void O(float f10, int i3) {
        k40 k40Var = this.f11039a.f10508t2;
        if (k40Var != null) {
            k40Var.b(f10, i3);
        }
    }

    @Override
    public final int O0() {
        return this.f11039a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem R0() {
        return this.f11039a.f10527y1.f10358a;
    }

    @Override
    public final boolean T0(long j10) {
        j4 j4Var = this.f11039a;
        h4 h4Var = j4Var.f10527y1;
        TL_stories.StoryItem storyItem = h4Var.f10358a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) h4Var.f10358a.media).call;
            savedefaultsendas.send_as = hp.s1(j4Var.f10480m2).j1(j10);
            ConnectionsManager.getInstance(j4Var.f10480m2).sendRequest(savedefaultsendas, null);
            g1 g1Var = j4Var.f10506t0.B0;
            if (g1Var != null) {
                TLRPC.Peer z12 = hp.s1(j4Var.f10480m2).z1(j10);
                TLRPC.GroupCall groupCall = g1Var.f10304w;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, 2097152, true);
                    g1Var.f10304w.default_send_as = z12;
                }
            }
            j4Var.p0(true);
            j4Var.L1.Q1(true);
            j4Var.L1.E(true);
            j4Var.d1(false);
        }
        return true;
    }

    @Override
    public final boolean V0() {
        k40 k40Var = this.f11039a.f10508t2;
        if (k40Var != null && !k40Var.f35284j0) {
            return true;
        }
        return false;
    }

    @Override
    public final void Y0(CharSequence charSequence, boolean z10, boolean z11) {
        j4 j4Var = this.f11039a;
        if (j4Var.N2 == null) {
            u2 u2Var = new u2(j4Var, j4Var.getContext(), j4Var.f10477l1, j4Var.f10506t0.f10922f, j4Var.f10476l0);
            j4Var.N2 = u2Var;
            u2Var.p(new w2(j4Var));
            j4Var.addView(j4Var.N2, mf.e(-1, -1, 83));
        }
        if (j4Var.N2.getAdapter() != null) {
            j4Var.N2.setDialogId(j4Var.f10477l1);
            if (j4Var.f10527y1.f10362f) {
                kg.e1 adapter = j4Var.N2.getAdapter();
                if (adapter.f17003k0 == 0 && adapter.f17016v0 == 0 && adapter.f17015u0 == 0 && adapter.F0 == 0) {
                    adapter.f17020x0 = null;
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
                    ArrayList arrayList3 = adapter.f17021y;
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
                kg.e1 adapter2 = j4Var.N2.getAdapter();
                hp.s1(j4Var.f10480m2).a2(Long.valueOf(j4Var.f10477l1));
                TLRPC.Chat M0 = hp.s1(j4Var.f10480m2).M0(Long.valueOf(-j4Var.f10477l1));
                adapter2.getClass();
                adapter2.m0 = M0;
                j4Var.N2.getAdapter().U(charSequence, j4Var.L1.getCursorPosition(), null, false, false);
            }
        }
        j4Var.invalidate();
    }

    @Override
    public final void Z0() {
        k40 k40Var = this.f11039a.f10508t2;
        if (k40Var != null) {
            k40Var.j();
        }
    }

    @Override
    public final boolean a1() {
        TLRPC.User a22;
        j4 j4Var = this.f11039a;
        if (j4Var.f10477l1 < 0 || (a22 = hp.s1(j4Var.f10480m2).a2(Long.valueOf(j4Var.f10477l1))) == null || l10.B(a22) || a22.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final void b1() {
        this.f11039a.M0();
    }

    @Override
    public final void b2() {
        String str;
        int i3;
        j4 j4Var = this.f11039a;
        if (j4Var.f10487o1) {
            j4.f0(j4Var);
            return;
        }
        if (j4Var.G2 == null) {
            u20 u20Var = new u20(9, j4Var.getContext(), j4Var.f10476l0, false);
            j4Var.G2 = u20Var;
            u20Var.setVisibility(8);
            j4Var.addView(j4Var.G2, mf.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (j4Var.f10477l1 >= 0) {
            str = l10.j(hp.s1(j4Var.f10480m2).a2(Long.valueOf(j4Var.f10477l1)), true);
        } else {
            TLRPC.Chat M0 = hp.s1(j4Var.f10480m2).M0(Long.valueOf(-j4Var.f10477l1));
            if (M0 != null) {
                str = M0.title;
            } else {
                str = "";
            }
        }
        u20 u20Var2 = j4Var.G2;
        if (j4Var.L1.f31104d1) {
            i3 = 2131743604;
        } else {
            i3 = 2131743530;
        }
        u20Var2.setText(org.telegram.messenger.g0.X2(bd.a0(null, null, i3, str)));
        j4Var.G2.c(j4Var.L1.getAudioVideoButtonContainer());
    }

    @Override
    public final void d2(int i3, int i10, int i11, long j10, long j11, boolean z10) {
        j4 j4Var = this.f11039a;
        boolean z11 = false;
        if (j4Var.f10508t2 == null && CameraView.isCameraAllowed()) {
            j4Var.f10508t2 = new k40(j4Var.getContext(), new f3(j4Var), j4Var.f10476l0, false);
            j4Var.addView(j4Var.f10508t2, Math.min(j4Var.indexOfChild(j4Var.L1.getRecordCircle()), j4Var.indexOfChild(j4Var.L1.P1)), mf.e(-1, -1, 51));
        }
        k40 k40Var = j4Var.f10508t2;
        if (k40Var != null) {
            if (i3 == 0) {
                k40Var.i(false);
            } else if (i3 != 1 && i3 != 3 && i3 != 4) {
                if (i3 == 2 || i3 == 5) {
                    if (i3 == 2) {
                        z11 = true;
                    }
                    k40Var.a(z11);
                }
            } else {
                k40Var.g(i3, i10, i11, j10, j11, z10);
            }
        }
    }

    @Override
    public final void g1() {
        this.f11039a.requestLayout();
    }

    @Override
    public final mm i0() {
        return null;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean k1() {
        return false;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final void r2() {
        this.f11039a.N0();
    }

    @Override
    public final TLRPC.Peer t() {
        g1 g1Var;
        boolean z10;
        r9 r9Var = this.f11039a.f10506t0;
        if (r9Var != null && (g1Var = r9Var.B0) != null) {
            TLRPC.GroupCall groupCall = g1Var.f10304w;
            if (groupCall == null) {
                z10 = false;
            } else {
                z10 = !groupCall.messages_enabled;
            }
            if (!z10) {
                return g1Var.i();
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean u0() {
        return true;
    }

    @Override
    public final void A(boolean z10) {
    }

    @Override
    public final void M0(int i3) {
    }

    @Override
    public final void T1(int i3) {
    }

    @Override
    public final void c0(boolean z10) {
    }

    @Override
    public final void c2(boolean z10) {
    }

    @Override
    public final void j1(CharSequence charSequence) {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void E() {
    }

    @Override
    public final void F() {
    }

    @Override
    public final void F0() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void O1() {
    }

    @Override
    public final void a0() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void e1() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void g0() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void m1() {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void h1(View view, CharSequence charSequence, boolean z10) {
    }
}
