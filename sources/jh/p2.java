package jh;

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
import org.telegram.ui.Components.ag;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.x30;
import org.telegram.ui.hn;

public final class p2 implements ag {

    public final e4 f13817a;

    public p2(e4 e4Var) {
        this.f13817a = e4Var;
    }

    @Override
    public final void A(float f10, int i10) {
        k50 k50Var = this.f13817a.F2;
        if (k50Var != null) {
            k50Var.e(f10, i10);
        }
    }

    @Override
    public final hn P() {
        return null;
    }

    @Override
    public final int P0() {
        return this.f13817a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem T0() {
        return this.f13817a.K1.f13141a;
    }

    @Override
    public final void U1() {
        String firstName;
        e4 e4Var = this.f13817a;
        if (e4Var.A1) {
            e4.h0(e4Var);
            return;
        }
        if (e4Var.S2 == null) {
            x30 x30Var = new x30(9, e4Var.getContext(), e4Var.f13290x0, false);
            e4Var.S2 = x30Var;
            x30Var.setVisibility(8);
            e4Var.addView(e4Var.S2, h7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (e4Var.f13291x1 >= 0) {
            firstName = UserObject.getFirstName(MessagesController.getInstance(e4Var.f13296y2).getUser(Long.valueOf(e4Var.f13291x1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(e4Var.f13296y2).getChat(Long.valueOf(-e4Var.f13291x1));
            firstName = chat != null ? chat.title : "";
        }
        e4Var.S2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(e4Var.X1.Y0 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, firstName)));
        e4Var.S2.f(e4Var.X1.getAudioVideoButtonContainer(), true);
    }

    @Override
    public final boolean X0(long j10) {
        e4 e4Var = this.f13817a;
        c4 c4Var = e4Var.K1;
        TL_stories.StoryItem storyItem = c4Var.f13141a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) c4Var.f13141a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(e4Var.f13296y2).getInputPeer(j10);
            ConnectionsManager.getInstance(e4Var.f13296y2).sendRequest(savedefaultsendas, null);
            d1 d1Var = e4Var.F0.f13512w0;
            if (d1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(e4Var.f13296y2).getPeer(j10);
                TLRPC.GroupCall groupCall = d1Var.v;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, 2097152, peer != null);
                    d1Var.v.default_send_as = peer;
                }
            }
            e4Var.r0(true);
            e4Var.X1.O1(true);
            e4Var.X1.K(true);
            e4Var.f1(false);
        }
        return true;
    }

    @Override
    public final void X1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        e4 e4Var = this.f13817a;
        if (e4Var.F2 == null && CameraView.isCameraAllowed()) {
            e4Var.F2 = new k50(e4Var.getContext(), new c3(e4Var), e4Var.f13290x0, false);
            e4Var.addView(e4Var.F2, Math.min(e4Var.indexOfChild(e4Var.X1.getRecordCircle()), e4Var.indexOfChild(e4Var.X1.J1)), h7.z5.e(-1, -1, 51));
        }
        k50 k50Var = e4Var.F2;
        if (k50Var != null) {
            if (i10 == 0) {
                k50Var.l(false);
                return;
            }
            if (i10 == 1 || i10 == 3 || i10 == 4) {
                k50Var.k(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                k50Var.d(i10 == 2);
            }
        }
    }

    @Override
    public final boolean b1() {
        k50 k50Var = this.f13817a.F2;
        return (k50Var == null || k50Var.f29968a0) ? false : true;
    }

    @Override
    public final void c1(CharSequence charSequence, boolean z10, boolean z11) {
        e4 e4Var = this.f13817a;
        if (e4Var.Z2 == null) {
            q2 q2Var = new q2(e4Var, e4Var.getContext(), e4Var.f13291x1, e4Var.F0.f13478f, e4Var.f13290x0);
            e4Var.Z2 = q2Var;
            q2Var.p(new s2(e4Var));
            e4Var.addView(e4Var.Z2, h7.z5.e(-1, -1, 83));
        }
        if (e4Var.Z2.getAdapter() != null) {
            e4Var.Z2.setDialogId(e4Var.f13291x1);
            if (e4Var.K1.f13145f) {
                pf.u0 adapter = e4Var.Z2.getAdapter();
                if (adapter.f45929f0 == 0 && adapter.f45940q0 == 0 && adapter.f45939p0 == 0 && adapter.A0 == 0) {
                    adapter.f45944s0 = null;
                    adapter.B = null;
                    ArrayList arrayList = adapter.f45949w0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.N;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.P = null;
                    adapter.Q = null;
                    ArrayList arrayList3 = adapter.f45950x;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    ArrayList arrayList4 = adapter.E;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                    ArrayList arrayList5 = adapter.F;
                    if (arrayList5 != null) {
                        arrayList5.clear();
                    }
                    ArrayList arrayList6 = adapter.I;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    ArrayList arrayList7 = adapter.J;
                    if (arrayList7 != null) {
                        arrayList7.clear();
                    }
                    adapter.l();
                }
            } else {
                pf.u0 adapter2 = e4Var.Z2.getAdapter();
                MessagesController.getInstance(e4Var.f13296y2).getUser(Long.valueOf(e4Var.f13291x1));
                TLRPC.Chat chat = MessagesController.getInstance(e4Var.f13296y2).getChat(Long.valueOf(-e4Var.f13291x1));
                adapter2.getClass();
                adapter2.f45931h0 = chat;
                e4Var.Z2.getAdapter().U(charSequence, e4Var.X1.getCursorPosition(), null, false, false);
            }
        }
        e4Var.invalidate();
    }

    @Override
    public final void f1() {
        k50 k50Var = this.f13817a.F2;
        if (k50Var != null) {
            k50Var.q();
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final boolean g1() {
        TLRPC.User user;
        e4 e4Var = this.f13817a;
        return (e4Var.f13291x1 < 0 || (user = MessagesController.getInstance(e4Var.f13296y2).getUser(Long.valueOf(e4Var.f13291x1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final void i1() {
        this.f13817a.O0();
    }

    @Override
    public final void k1() {
        this.f13817a.requestLayout();
    }

    @Override
    public final TLRPC.Peer l() {
        d1 d1Var;
        i9 i9Var = this.f13817a.F0;
        if (i9Var == null || (d1Var = i9Var.f13512w0) == null) {
            return null;
        }
        TLRPC.GroupCall groupCall = d1Var.v;
        if (groupCall == null ? false : !groupCall.messages_enabled) {
            return null;
        }
        return d1Var.i();
    }

    @Override
    public final boolean n0() {
        return true;
    }

    @Override
    public final boolean o1() {
        return false;
    }

    @Override
    public final void q2() {
        this.f13817a.P0();
    }

    @Override
    public final void w(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        e4 e4Var = this.f13817a;
        if (e4Var.C2) {
            AndroidUtilities.runOnUIThread(new cg.b2(this, j10, 5), 200L);
        } else {
            e4Var.k0(j10 <= 0);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers y() {
        d1 d1Var;
        e4 e4Var = this.f13817a;
        if (!e4Var.K1.f13145f) {
            return null;
        }
        i9 i9Var = e4Var.F0;
        if (i9Var != null && (d1Var = i9Var.f13512w0) != null) {
            TLRPC.GroupCall groupCall = d1Var.v;
            if (groupCall == null ? false : !groupCall.messages_enabled) {
                return null;
            }
        }
        return e4Var.K3;
    }

    @Override
    public final void F() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void N1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void e2() {
    }

    @Override
    public final void g0() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void l2() {
    }

    @Override
    public final void m() {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void G(boolean z10) {
    }

    @Override
    public final void N0(int i10) {
    }

    @Override
    public final void S1(int i10) {
    }

    @Override
    public final void W1(boolean z10) {
    }

    @Override
    public final void n(float f10) {
    }

    @Override
    public final void n1(CharSequence charSequence) {
    }

    @Override
    public final void r(boolean z10) {
    }

    @Override
    public final void o0(int i10, int i11) {
    }

    @Override
    public final void l1(View view, CharSequence charSequence, boolean z10) {
    }
}
