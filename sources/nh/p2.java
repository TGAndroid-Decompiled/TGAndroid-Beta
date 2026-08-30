package nh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.x50;
import org.telegram.ui.nn;
public final class p2 implements eg {
    public final d4 f15742a;

    public p2(d4 d4Var) {
        this.f15742a = d4Var;
    }

    @Override
    public final void D(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        boolean z10;
        d4 d4Var = this.f15742a;
        if (d4Var.D2) {
            AndroidUtilities.runOnUIThread(new gg.y1(this, j10, 5), 200L);
            return;
        }
        if (j10 <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d4Var.k0(z10);
    }

    @Override
    public final void E2() {
        this.f15742a.P0();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers G() {
        e1 e1Var;
        boolean z4;
        d4 d4Var = this.f15742a;
        if (d4Var.L1.f15114f) {
            i9 i9Var = d4Var.G0;
            if (i9Var != null && (e1Var = i9Var.f15498x0) != null) {
                TLRPC.GroupCall groupCall = e1Var.v;
                if (groupCall == null) {
                    z4 = false;
                } else {
                    z4 = !groupCall.messages_enabled;
                }
                if (z4) {
                    return null;
                }
            }
            return d4Var.L3;
        }
        return null;
    }

    @Override
    public final boolean G0() {
        return true;
    }

    @Override
    public final void H(float f10, int i10) {
        x50 x50Var = this.f15742a.G2;
        if (x50Var != null) {
            x50Var.e(f10, i10);
        }
    }

    @Override
    public final int c1() {
        return this.f15742a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem e1() {
        return this.f15742a.L1.f15111a;
    }

    @Override
    public final boolean g1(long j10) {
        boolean z4;
        d4 d4Var = this.f15742a;
        b4 b4Var = d4Var.L1;
        TL_stories.StoryItem storyItem = b4Var.f15111a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) b4Var.f15111a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(d4Var.f15263z2).getInputPeer(j10);
            ConnectionsManager.getInstance(d4Var.f15263z2).sendRequest(savedefaultsendas, null);
            e1 e1Var = d4Var.G0.f15498x0;
            if (e1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(d4Var.f15263z2).getPeer(j10);
                TLRPC.GroupCall groupCall = e1Var.v;
                if (groupCall != null) {
                    int i10 = groupCall.flags;
                    if (peer != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    groupCall.flags = TLObject.setFlag(i10, 2097152, z4);
                    e1Var.v.default_send_as = peer;
                }
            }
            d4Var.r0(true);
            d4Var.Y1.P1(true);
            d4Var.Y1.J(true);
            d4Var.f1(false);
        }
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean k1() {
        x50 x50Var = this.f15742a.G2;
        if (x50Var != null && !x50Var.f30549b0) {
            return true;
        }
        return false;
    }

    @Override
    public final int l() {
        return 0;
    }

    @Override
    public final void m2() {
        String str;
        int i10;
        d4 d4Var = this.f15742a;
        if (d4Var.B1) {
            d4.h0(d4Var);
            return;
        }
        if (d4Var.T2 == null) {
            k40 k40Var = new k40(9, d4Var.getContext(), d4Var.f15257y0, false);
            d4Var.T2 = k40Var;
            k40Var.setVisibility(8);
            d4Var.addView(d4Var.T2, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (d4Var.f15258y1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(d4Var.f15263z2).getUser(Long.valueOf(d4Var.f15258y1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(d4Var.f15263z2).getChat(Long.valueOf(-d4Var.f15258y1));
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
        }
        k40 k40Var2 = d4Var.T2;
        if (d4Var.Y1.Z0) {
            i10 = R.string.VideoMessagesRestrictedByPrivacy;
        } else {
            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
        }
        k40Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, str)));
        d4Var.T2.f(d4Var.Y1.getAudioVideoButtonContainer(), true);
    }

    @Override
    public final void n1(CharSequence charSequence, boolean z4, boolean z10) {
        d4 d4Var = this.f15742a;
        if (d4Var.f15183a3 == null) {
            q2 q2Var = new q2(d4Var, d4Var.getContext(), d4Var.f15258y1, d4Var.G0.f15461f, d4Var.f15257y0);
            d4Var.f15183a3 = q2Var;
            q2Var.p(new s2(d4Var));
            d4Var.addView(d4Var.f15183a3, k7.b6.e(-1, -1, 83));
        }
        if (d4Var.f15183a3.getAdapter() != null) {
            d4Var.f15183a3.setDialogId(d4Var.f15258y1);
            if (d4Var.L1.f15114f) {
                tf.u0 adapter = d4Var.f15183a3.getAdapter();
                if (adapter.f44845g0 == 0 && adapter.f44857r0 == 0 && adapter.f44855q0 == 0 && adapter.B0 == 0) {
                    adapter.f44860t0 = null;
                    adapter.C = null;
                    ArrayList arrayList = adapter.f44866x0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.O;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.Q = null;
                    adapter.R = null;
                    ArrayList arrayList3 = adapter.f44865x;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    ArrayList arrayList4 = adapter.F;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                    ArrayList arrayList5 = adapter.G;
                    if (arrayList5 != null) {
                        arrayList5.clear();
                    }
                    ArrayList arrayList6 = adapter.J;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    ArrayList arrayList7 = adapter.K;
                    if (arrayList7 != null) {
                        arrayList7.clear();
                    }
                    adapter.l();
                }
            } else {
                tf.u0 adapter2 = d4Var.f15183a3.getAdapter();
                MessagesController.getInstance(d4Var.f15263z2).getUser(Long.valueOf(d4Var.f15258y1));
                TLRPC.Chat chat = MessagesController.getInstance(d4Var.f15263z2).getChat(Long.valueOf(-d4Var.f15258y1));
                adapter2.getClass();
                adapter2.f44847i0 = chat;
                d4Var.f15183a3.getAdapter().U(charSequence, d4Var.Y1.getCursorPosition(), null, false, false);
            }
        }
        d4Var.invalidate();
    }

    @Override
    public final void o2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
        d4 d4Var = this.f15742a;
        boolean z10 = false;
        if (d4Var.G2 == null && CameraView.isCameraAllowed()) {
            d4Var.G2 = new x50(d4Var.getContext(), new c3(d4Var), d4Var.f15257y0, false);
            d4Var.addView(d4Var.G2, Math.min(d4Var.indexOfChild(d4Var.Y1.getRecordCircle()), d4Var.indexOfChild(d4Var.Y1.K1)), k7.b6.e(-1, -1, 51));
        }
        x50 x50Var = d4Var.G2;
        if (x50Var != null) {
            if (i10 == 0) {
                x50Var.l(false);
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z10 = true;
                    }
                    x50Var.d(z10);
                }
            } else {
                x50Var.k(i10, i11, i12, j10, j11, z4);
            }
        }
    }

    @Override
    public final TLRPC.Peer p() {
        e1 e1Var;
        boolean z4;
        i9 i9Var = this.f15742a.G0;
        if (i9Var != null && (e1Var = i9Var.f15498x0) != null) {
            TLRPC.GroupCall groupCall = e1Var.v;
            if (groupCall == null) {
                z4 = false;
            } else {
                z4 = !groupCall.messages_enabled;
            }
            if (!z4) {
                return e1Var.i();
            }
            return null;
        }
        return null;
    }

    @Override
    public final void p1() {
        x50 x50Var = this.f15742a.G2;
        if (x50Var != null) {
            x50Var.q();
        }
    }

    @Override
    public final boolean q1() {
        TLRPC.User user;
        d4 d4Var = this.f15742a;
        if (d4Var.f15258y1 < 0 || (user = MessagesController.getInstance(d4Var.f15263z2).getUser(Long.valueOf(d4Var.f15258y1))) == null || UserObject.isUserSelf(user) || user.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final nn r0() {
        return null;
    }

    @Override
    public final void s1() {
        this.f15742a.O0();
    }

    @Override
    public final void u1() {
        this.f15742a.requestLayout();
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void C() {
    }

    @Override
    public final void C1() {
    }

    @Override
    public final void H1() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void N0() {
    }

    @Override
    public final void V0() {
    }

    @Override
    public final void Y() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void o0() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void z2() {
    }

    @Override
    public final void b0(boolean z4) {
    }

    @Override
    public final void b1(int i10) {
    }

    @Override
    public final void j2(int i10) {
    }

    @Override
    public final void n2(boolean z4) {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void y1(CharSequence charSequence) {
    }

    @Override
    public final void z(boolean z4) {
    }

    @Override
    public final void I0(int i10, int i11) {
    }

    @Override
    public final void v1(View view, CharSequence charSequence, boolean z4) {
    }
}
