package fi;

import android.view.View;
import c8.ja;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.r40;
import org.telegram.ui.qm;
public final class l2 implements cg {
    public final b4 f11985a;

    public l2(b4 b4Var) {
        this.f11985a = b4Var;
    }

    @Override
    public final void B2() {
        this.f11985a.N0();
    }

    @Override
    public final boolean E0() {
        return true;
    }

    @Override
    public final void M(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        boolean z11;
        b4 b4Var = this.f11985a;
        if (b4Var.f11512q2) {
            org.telegram.messenger.g0.i3(new di.x2(this, j3, 3), 200L);
            return;
        }
        if (j3 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        b4Var.i0(z11);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers O() {
        e1 e1Var;
        boolean z10;
        b4 b4Var = this.f11985a;
        if (b4Var.f11543y1.f12583f) {
            i9 i9Var = b4Var.f11522t0;
            if (i9Var != null && (e1Var = i9Var.B0) != null) {
                TLRPC.GroupCall groupCall = e1Var.f11661w;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return null;
                }
            }
            return b4Var.f11545y3;
        }
        return null;
    }

    @Override
    public final void W(float f10, int i7) {
        r40 r40Var = this.f11985a.f11524t2;
        if (r40Var != null) {
            r40Var.b(f10, i7);
        }
    }

    @Override
    public final int b1() {
        return this.f11985a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem c1() {
        return this.f11985a.f11543y1.f12579a;
    }

    @Override
    public final boolean e1(long j3) {
        b4 b4Var = this.f11985a;
        z3 z3Var = b4Var.f11543y1;
        TL_stories.StoryItem storyItem = z3Var.f12579a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) z3Var.f12579a.media).call;
            savedefaultsendas.send_as = np.s1(b4Var.f11497m2).j1(j3);
            ConnectionsManager.getInstance(b4Var.f11497m2).sendRequest(savedefaultsendas, null);
            e1 e1Var = b4Var.f11522t0.B0;
            if (e1Var != null) {
                TLRPC.Peer z12 = np.s1(b4Var.f11497m2).z1(j3);
                TLRPC.GroupCall groupCall = e1Var.f11661w;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, 2097152, true);
                    e1Var.f11661w.default_send_as = z12;
                }
            }
            b4Var.p0(true);
            b4Var.L1.j2(true);
            b4Var.L1.N(true);
            b4Var.d1(false);
        }
        return true;
    }

    @Override
    public final boolean g1() {
        r40 r40Var = this.f11985a.f11524t2;
        if (r40Var != null && !r40Var.f38856j0) {
            return true;
        }
        return false;
    }

    @Override
    public final void j1(CharSequence charSequence, boolean z10, boolean z11) {
        b4 b4Var = this.f11985a;
        if (b4Var.N2 == null) {
            m2 m2Var = new m2(b4Var, b4Var.getContext(), b4Var.l1, b4Var.f11522t0.f11844f, b4Var.f11493l0);
            b4Var.N2 = m2Var;
            m2Var.p(new o2(b4Var));
            b4Var.addView(b4Var.N2, ja.e(-1, -1, 83));
        }
        if (b4Var.N2.getAdapter() != null) {
            b4Var.N2.setDialogId(b4Var.l1);
            if (b4Var.f11543y1.f12583f) {
                jg.h1 adapter = b4Var.N2.getAdapter();
                if (adapter.f17130k0 == 0 && adapter.f17143v0 == 0 && adapter.f17142u0 == 0 && adapter.F0 == 0) {
                    adapter.f17147x0 = null;
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
                    ArrayList arrayList3 = adapter.f17148y;
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
                jg.h1 adapter2 = b4Var.N2.getAdapter();
                np.s1(b4Var.f11497m2).a2(Long.valueOf(b4Var.l1));
                TLRPC.Chat M0 = np.s1(b4Var.f11497m2).M0(Long.valueOf(-b4Var.l1));
                adapter2.getClass();
                adapter2.m0 = M0;
                b4Var.N2.getAdapter().U(charSequence, b4Var.L1.getCursorPosition(), null, false, false);
            }
        }
        b4Var.invalidate();
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void l1() {
        r40 r40Var = this.f11985a.f11524t2;
        if (r40Var != null) {
            r40Var.k();
        }
    }

    @Override
    public final boolean m1() {
        TLRPC.User a22;
        b4 b4Var = this.f11985a;
        if (b4Var.l1 < 0 || (a22 = np.s1(b4Var.f11497m2).a2(Long.valueOf(b4Var.l1))) == null || q10.B(a22) || a22.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final void m2() {
        String str;
        int i7;
        b4 b4Var = this.f11985a;
        if (b4Var.f11503o1) {
            b4.f0(b4Var);
            return;
        }
        if (b4Var.G2 == null) {
            b30 b30Var = new b30(9, b4Var.getContext(), b4Var.f11493l0, false);
            b4Var.G2 = b30Var;
            b30Var.setVisibility(8);
            b4Var.addView(b4Var.G2, ja.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (b4Var.l1 >= 0) {
            str = q10.j(np.s1(b4Var.f11497m2).a2(Long.valueOf(b4Var.l1)), true);
        } else {
            TLRPC.Chat M0 = np.s1(b4Var.f11497m2).M0(Long.valueOf(-b4Var.l1));
            if (M0 != null) {
                str = M0.title;
            } else {
                str = "";
            }
        }
        b30 b30Var2 = b4Var.G2;
        if (b4Var.L1.f32178d1) {
            i7 = 2131743594;
        } else {
            i7 = 2131743520;
        }
        b30Var2.setText(org.telegram.messenger.g0.X2(hd.a0(null, null, i7, str)));
        b4Var.G2.c(b4Var.L1.getAudioVideoButtonContainer());
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void n1() {
        this.f11985a.M0();
    }

    @Override
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        b4 b4Var = this.f11985a;
        boolean z11 = false;
        if (b4Var.f11524t2 == null && CameraView.isCameraAllowed()) {
            b4Var.f11524t2 = new r40(b4Var.getContext(), new x2(b4Var), b4Var.f11493l0, false);
            b4Var.addView(b4Var.f11524t2, Math.min(b4Var.indexOfChild(b4Var.L1.getRecordCircle()), b4Var.indexOfChild(b4Var.L1.f32310w2)), ja.e(-1, -1, 51));
        }
        r40 r40Var = b4Var.f11524t2;
        if (r40Var != null) {
            if (i7 == 0) {
                r40Var.j(false);
            } else if (i7 != 1 && i7 != 3 && i7 != 4) {
                if (i7 == 2 || i7 == 5) {
                    if (i7 == 2) {
                        z11 = true;
                    }
                    r40Var.a(z11);
                }
            } else {
                r40Var.h(i7, i10, i11, j3, j10, z10);
            }
        }
    }

    @Override
    public final qm p0() {
        return null;
    }

    @Override
    public final void q1() {
        this.f11985a.requestLayout();
    }

    @Override
    public final TLRPC.Peer s() {
        e1 e1Var;
        boolean z10;
        i9 i9Var = this.f11985a.f11522t0;
        if (i9Var != null && (e1Var = i9Var.B0) != null) {
            TLRPC.GroupCall groupCall = e1Var.f11661w;
            if (groupCall == null) {
                z10 = false;
            } else {
                z10 = !groupCall.messages_enabled;
            }
            if (!z10) {
                return e1Var.i();
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void a1(int i7) {
    }

    @Override
    public final void b0(boolean z10) {
    }

    @Override
    public final void k2(int i7) {
    }

    @Override
    public final void n2(boolean z10) {
    }

    @Override
    public final void u1(CharSequence charSequence) {
    }

    @Override
    public final void y(float f10) {
    }

    @Override
    public final void E() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void I() {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void Y() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void m0() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }
}
