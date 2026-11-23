package fi;

import android.view.View;
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.z40;
import org.telegram.ui.rm;
public final class j2 implements mg {
    public final z3 f12140a;

    public j2(z3 z3Var) {
        this.f12140a = z3Var;
    }

    @Override
    public final void G(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        boolean z11;
        z3 z3Var = this.f12140a;
        if (z3Var.f12868q2) {
            org.telegram.messenger.g0.h3(new bi.e4(this, j3, 4), 200L);
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
    public final TLRPC.TL_channels_sendAsPeers H() {
        c1 c1Var;
        boolean z10;
        z3 z3Var = this.f12140a;
        if (z3Var.f12899y1.f12731f) {
            f9 f9Var = z3Var.f12878t0;
            if (f9Var != null && (c1Var = f9Var.B0) != null) {
                TLRPC.GroupCall groupCall = c1Var.f11806w;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return null;
                }
            }
            return z3Var.f12901y3;
        }
        return null;
    }

    @Override
    public final void K(float f10, int i7) {
        z40 z40Var = this.f12140a.f12880t2;
        if (z40Var != null) {
            z40Var.b(f10, i7);
        }
    }

    @Override
    public final int X0() {
        return this.f12140a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem Y0() {
        return this.f12140a.f12899y1.f12727a;
    }

    @Override
    public final rm a0() {
        return null;
    }

    @Override
    public final boolean b1(long j3) {
        z3 z3Var = this.f12140a;
        x3 x3Var = z3Var.f12899y1;
        TL_stories.StoryItem storyItem = x3Var.f12727a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) x3Var.f12727a.media).call;
            savedefaultsendas.send_as = mp.u1(z3Var.f12853m2).l1(j3);
            ConnectionsManager.getInstance(z3Var.f12853m2).sendRequest(savedefaultsendas, null);
            c1 c1Var = z3Var.f12878t0.B0;
            if (c1Var != null) {
                TLRPC.Peer B1 = mp.u1(z3Var.f12853m2).B1(j3);
                TLRPC.GroupCall groupCall = c1Var.f11806w;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, 2097152, true);
                    c1Var.f11806w.default_send_as = B1;
                }
            }
            z3Var.p0(true);
            z3Var.L1.z2(true);
            z3Var.L1.P(true);
            z3Var.d1(false);
        }
        return true;
    }

    @Override
    public final boolean d1() {
        z40 z40Var = this.f12140a.f12880t2;
        if (z40Var != null && !z40Var.f42677j0) {
            return true;
        }
        return false;
    }

    @Override
    public final void i1(CharSequence charSequence, boolean z10, boolean z11) {
        z3 z3Var = this.f12140a;
        if (z3Var.N2 == null) {
            k2 k2Var = new k2(z3Var, z3Var.getContext(), z3Var.l1, z3Var.f12878t0.f11972f, z3Var.f12849l0);
            z3Var.N2 = k2Var;
            k2Var.p(new m2(z3Var));
            z3Var.addView(z3Var.N2, na.e(-1, -1, 83));
        }
        if (z3Var.N2.getAdapter() != null) {
            z3Var.N2.setDialogId(z3Var.l1);
            if (z3Var.f12899y1.f12731f) {
                jg.h1 adapter = z3Var.N2.getAdapter();
                if (adapter.f17609k0 == 0 && adapter.f17622v0 == 0 && adapter.f17621u0 == 0 && adapter.F0 == 0) {
                    adapter.f17626x0 = null;
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
                    ArrayList arrayList3 = adapter.f17627y;
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
                mp.u1(z3Var.f12853m2).c2(Long.valueOf(z3Var.l1));
                TLRPC.Chat O0 = mp.u1(z3Var.f12853m2).O0(Long.valueOf(-z3Var.l1));
                adapter2.getClass();
                adapter2.m0 = O0;
                z3Var.N2.getAdapter().U(charSequence, z3Var.L1.getCursorPosition(), null, false, false);
            }
        }
        z3Var.invalidate();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void j1() {
        z40 z40Var = this.f12140a.f12880t2;
        if (z40Var != null) {
            z40Var.k();
        }
    }

    @Override
    public final boolean l1() {
        TLRPC.User c22;
        z3 z3Var = this.f12140a;
        if (z3Var.l1 < 0 || (c22 = mp.u1(z3Var.f12853m2).c2(Long.valueOf(z3Var.l1))) == null || n10.C(c22) || c22.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final void m2() {
        String str;
        int i7;
        z3 z3Var = this.f12140a;
        if (z3Var.f12859o1) {
            z3.f0(z3Var);
            return;
        }
        if (z3Var.G2 == null) {
            j30 j30Var = new j30(9, z3Var.getContext(), z3Var.f12849l0, false);
            z3Var.G2 = j30Var;
            j30Var.setVisibility(8);
            z3Var.addView(z3Var.G2, na.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (z3Var.l1 >= 0) {
            str = n10.k(mp.u1(z3Var.f12853m2).c2(Long.valueOf(z3Var.l1)), true);
        } else {
            TLRPC.Chat O0 = mp.u1(z3Var.f12853m2).O0(Long.valueOf(-z3Var.l1));
            if (O0 != null) {
                str = O0.title;
            } else {
                str = "";
            }
        }
        j30 j30Var2 = z3Var.G2;
        if (z3Var.L1.f32662d1) {
            i7 = 2131743347;
        } else {
            i7 = 2131743270;
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
        this.f12140a.M0();
    }

    @Override
    public final TLRPC.Peer o() {
        c1 c1Var;
        boolean z10;
        f9 f9Var = this.f12140a.f12878t0;
        if (f9Var != null && (c1Var = f9Var.B0) != null) {
            TLRPC.GroupCall groupCall = c1Var.f11806w;
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
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        z3 z3Var = this.f12140a;
        boolean z11 = false;
        if (z3Var.f12880t2 == null && CameraView.isCameraAllowed()) {
            z3Var.f12880t2 = new z40(z3Var.getContext(), new v2(z3Var), z3Var.f12849l0, false);
            z3Var.addView(z3Var.f12880t2, Math.min(z3Var.indexOfChild(z3Var.L1.getRecordCircle()), z3Var.indexOfChild(z3Var.L1.E2)), na.e(-1, -1, 51));
        }
        z40 z40Var = z3Var.f12880t2;
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
        this.f12140a.requestLayout();
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final void v2() {
        this.f12140a.N0();
    }

    @Override
    public final boolean w0() {
        return true;
    }

    @Override
    public final void E() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void g0() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void t2() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void Q(boolean z10) {
    }

    @Override
    public final void U0(int i7) {
    }

    @Override
    public final void i2(int i7) {
    }

    @Override
    public final void n2(boolean z10) {
    }

    @Override
    public final void u(float f10) {
    }

    @Override
    public final void u1(CharSequence charSequence) {
    }

    @Override
    public final void w(boolean z10) {
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }
}
