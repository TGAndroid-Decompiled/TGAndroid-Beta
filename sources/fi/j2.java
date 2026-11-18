package fi;

import android.view.View;
import c8.ma;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.z40;
import org.telegram.ui.rm;
public final class j2 implements kg {
    public final z3 f12143a;

    public j2(z3 z3Var) {
        this.f12143a = z3Var;
    }

    @Override
    public final void B2() {
        this.f12143a.N0();
    }

    @Override
    public final boolean E0() {
        return true;
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        boolean z11;
        z3 z3Var = this.f12143a;
        if (z3Var.f12862q2) {
            org.telegram.messenger.g0.h3(new bi.y3(this, j3, 4), 200L);
            return;
        }
        if (j3 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        z3Var.i0(z11);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        c1 c1Var;
        boolean z10;
        z3 z3Var = this.f12143a;
        if (z3Var.f12893y1.f12724f) {
            f9 f9Var = z3Var.f12872t0;
            if (f9Var != null && (c1Var = f9Var.B0) != null) {
                TLRPC.GroupCall groupCall = c1Var.f11798w;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return null;
                }
            }
            return z3Var.f12895y3;
        }
        return null;
    }

    @Override
    public final void Q(float f10, int i7) {
        z40 z40Var = this.f12143a.f12874t2;
        if (z40Var != null) {
            z40Var.b(f10, i7);
        }
    }

    @Override
    public final int b1() {
        return this.f12143a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem c1() {
        return this.f12143a.f12893y1.f12720a;
    }

    @Override
    public final boolean e1(long j3) {
        z3 z3Var = this.f12143a;
        x3 x3Var = z3Var.f12893y1;
        TL_stories.StoryItem storyItem = x3Var.f12720a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) x3Var.f12720a.media).call;
            savedefaultsendas.send_as = mp.u1(z3Var.f12847m2).l1(j3);
            ConnectionsManager.getInstance(z3Var.f12847m2).sendRequest(savedefaultsendas, null);
            c1 c1Var = z3Var.f12872t0.B0;
            if (c1Var != null) {
                TLRPC.Peer B1 = mp.u1(z3Var.f12847m2).B1(j3);
                TLRPC.GroupCall groupCall = c1Var.f11798w;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, 2097152, true);
                    c1Var.f11798w.default_send_as = B1;
                }
            }
            z3Var.p0(true);
            z3Var.L1.t2(true);
            z3Var.L1.P(true);
            z3Var.d1(false);
        }
        return true;
    }

    @Override
    public final boolean g1() {
        z40 z40Var = this.f12143a.f12874t2;
        if (z40Var != null && !z40Var.f42782j0) {
            return true;
        }
        return false;
    }

    @Override
    public final void j1(CharSequence charSequence, boolean z10, boolean z11) {
        z3 z3Var = this.f12143a;
        if (z3Var.N2 == null) {
            k2 k2Var = new k2(z3Var, z3Var.getContext(), z3Var.l1, z3Var.f12872t0.f11966f, z3Var.f12843l0);
            z3Var.N2 = k2Var;
            k2Var.p(new m2(z3Var));
            z3Var.addView(z3Var.N2, ma.e(-1, -1, 83));
        }
        if (z3Var.N2.getAdapter() != null) {
            z3Var.N2.setDialogId(z3Var.l1);
            if (z3Var.f12893y1.f12724f) {
                jg.h1 adapter = z3Var.N2.getAdapter();
                if (adapter.f17513k0 == 0 && adapter.f17526v0 == 0 && adapter.f17525u0 == 0 && adapter.F0 == 0) {
                    adapter.f17530x0 = null;
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
                    ArrayList arrayList3 = adapter.f17531y;
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
                jg.h1 adapter2 = z3Var.N2.getAdapter();
                mp.u1(z3Var.f12847m2).c2(Long.valueOf(z3Var.l1));
                TLRPC.Chat O0 = mp.u1(z3Var.f12847m2).O0(Long.valueOf(-z3Var.l1));
                adapter2.getClass();
                adapter2.m0 = O0;
                z3Var.N2.getAdapter().U(charSequence, z3Var.L1.getCursorPosition(), null, false, false);
            }
        }
        z3Var.invalidate();
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void l1() {
        z40 z40Var = this.f12143a.f12874t2;
        if (z40Var != null) {
            z40Var.k();
        }
    }

    @Override
    public final rm m0() {
        return null;
    }

    @Override
    public final boolean m1() {
        TLRPC.User c22;
        z3 z3Var = this.f12143a;
        if (z3Var.l1 < 0 || (c22 = mp.u1(z3Var.f12847m2).c2(Long.valueOf(z3Var.l1))) == null || o10.C(c22) || c22.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final void m2() {
        String str;
        int i7;
        z3 z3Var = this.f12143a;
        if (z3Var.f12853o1) {
            z3.f0(z3Var);
            return;
        }
        if (z3Var.G2 == null) {
            j30 j30Var = new j30(9, z3Var.getContext(), z3Var.f12843l0, false);
            z3Var.G2 = j30Var;
            j30Var.setVisibility(8);
            z3Var.addView(z3Var.G2, ma.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (z3Var.l1 >= 0) {
            str = o10.k(mp.u1(z3Var.f12847m2).c2(Long.valueOf(z3Var.l1)), true);
        } else {
            TLRPC.Chat O0 = mp.u1(z3Var.f12847m2).O0(Long.valueOf(-z3Var.l1));
            if (O0 != null) {
                str = O0.title;
            } else {
                str = "";
            }
        }
        j30 j30Var2 = z3Var.G2;
        if (z3Var.L1.f32567d1) {
            i7 = 2131743357;
        } else {
            i7 = 2131743283;
        }
        j30Var2.setText(org.telegram.messenger.g0.W2(gd.a0(null, null, i7, str)));
        z3Var.G2.c(z3Var.L1.getAudioVideoButtonContainer());
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void n1() {
        this.f12143a.M0();
    }

    @Override
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        z3 z3Var = this.f12143a;
        boolean z11 = false;
        if (z3Var.f12874t2 == null && CameraView.isCameraAllowed()) {
            z3Var.f12874t2 = new z40(z3Var.getContext(), new v2(z3Var), z3Var.f12843l0, false);
            z3Var.addView(z3Var.f12874t2, Math.min(z3Var.indexOfChild(z3Var.L1.getRecordCircle()), z3Var.indexOfChild(z3Var.L1.C2)), ma.e(-1, -1, 51));
        }
        z40 z40Var = z3Var.f12874t2;
        if (z40Var != null) {
            if (i7 == 0) {
                z40Var.j(false);
            } else if (i7 != 1 && i7 != 3 && i7 != 4) {
                if (i7 == 2 || i7 == 5) {
                    if (i7 == 2) {
                        z11 = true;
                    }
                    z40Var.a(z11);
                }
            } else {
                z40Var.h(i7, i10, i11, j3, j10, z10);
            }
        }
    }

    @Override
    public final void q1() {
        this.f12143a.requestLayout();
    }

    @Override
    public final TLRPC.Peer t() {
        c1 c1Var;
        boolean z10;
        f9 f9Var = this.f12143a.f12872t0;
        if (f9Var != null && (c1Var = f9Var.B0) != null) {
            TLRPC.GroupCall groupCall = c1Var.f11798w;
            if (groupCall == null) {
                z10 = false;
            } else {
                z10 = !groupCall.messages_enabled;
            }
            if (!z10) {
                return c1Var.i();
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
    public final void D() {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void b0() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void g() {
    }

    @Override
    public final void i2() {
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
    public final void u() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void A(boolean z10) {
    }

    @Override
    public final void a0(boolean z10) {
    }

    @Override
    public final void a1(int i7) {
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
    public final void x(float f10) {
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }
}
