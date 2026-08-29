package lh;

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
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.s50;
import org.telegram.ui.jn;
public final class o2 implements hg {
    public final d4 f16013a;

    public o2(d4 d4Var) {
        this.f16013a = d4Var;
    }

    @Override
    public final boolean C0() {
        return true;
    }

    @Override
    public final void D(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        boolean z11;
        d4 d4Var = this.f16013a;
        if (d4Var.C2) {
            AndroidUtilities.runOnUIThread(new eg.z1(this, j10, 5), 200L);
            return;
        }
        if (j10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d4Var.k0(z11);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers G() {
        d1 d1Var;
        boolean z10;
        d4 d4Var = this.f16013a;
        if (d4Var.K1.f15378f) {
            i9 i9Var = d4Var.F0;
            if (i9Var != null && (d1Var = i9Var.f15790w0) != null) {
                TLRPC.GroupCall groupCall = d1Var.v;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return null;
                }
            }
            return d4Var.K3;
        }
        return null;
    }

    @Override
    public final void I(float f9, int i10) {
        s50 s50Var = this.f16013a.F2;
        if (s50Var != null) {
            s50Var.e(f9, i10);
        }
    }

    @Override
    public final int b1() {
        return this.f16013a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem d1() {
        return this.f16013a.K1.f15374a;
    }

    @Override
    public final boolean f1(long j10) {
        boolean z10;
        d4 d4Var = this.f16013a;
        b4 b4Var = d4Var.K1;
        TL_stories.StoryItem storyItem = b4Var.f15374a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) b4Var.f15374a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(d4Var.f15545y2).getInputPeer(j10);
            ConnectionsManager.getInstance(d4Var.f15545y2).sendRequest(savedefaultsendas, null);
            d1 d1Var = d4Var.F0.f15790w0;
            if (d1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(d4Var.f15545y2).getPeer(j10);
                TLRPC.GroupCall groupCall = d1Var.v;
                if (groupCall != null) {
                    int i10 = groupCall.flags;
                    if (peer != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    groupCall.flags = TLObject.setFlag(i10, 2097152, z10);
                    d1Var.v.default_send_as = peer;
                }
            }
            d4Var.r0(true);
            d4Var.X1.P1(true);
            d4Var.X1.J(true);
            d4Var.f1(false);
        }
        return true;
    }

    @Override
    public final boolean i1() {
        s50 s50Var = this.f16013a.F2;
        if (s50Var != null && !s50Var.f32494a0) {
            return true;
        }
        return false;
    }

    @Override
    public final void i2() {
        String str;
        int i10;
        d4 d4Var = this.f16013a;
        if (d4Var.A1) {
            d4.h0(d4Var);
            return;
        }
        if (d4Var.S2 == null) {
            g40 g40Var = new g40(9, d4Var.getContext(), d4Var.f15539x0, false);
            d4Var.S2 = g40Var;
            g40Var.setVisibility(8);
            d4Var.addView(d4Var.S2, i7.f6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (d4Var.f15540x1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(d4Var.f15545y2).getUser(Long.valueOf(d4Var.f15540x1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(d4Var.f15545y2).getChat(Long.valueOf(-d4Var.f15540x1));
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
        }
        g40 g40Var2 = d4Var.S2;
        if (d4Var.X1.Y0) {
            i10 = R.string.VideoMessagesRestrictedByPrivacy;
        } else {
            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
        }
        g40Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, str)));
        d4Var.S2.f(d4Var.X1.getAudioVideoButtonContainer(), true);
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        d4 d4Var = this.f16013a;
        if (d4Var.Z2 == null) {
            p2 p2Var = new p2(d4Var, d4Var.getContext(), d4Var.f15540x1, d4Var.F0.f15756f, d4Var.f15539x0);
            d4Var.Z2 = p2Var;
            p2Var.p(new r2(d4Var));
            d4Var.addView(d4Var.Z2, i7.f6.e(-1, -1, 83));
        }
        if (d4Var.Z2.getAdapter() != null) {
            d4Var.Z2.setDialogId(d4Var.f15540x1);
            if (d4Var.K1.f15378f) {
                rf.v0 adapter = d4Var.Z2.getAdapter();
                if (adapter.f47370f0 == 0 && adapter.f47381q0 == 0 && adapter.f47380p0 == 0 && adapter.A0 == 0) {
                    adapter.f47385s0 = null;
                    adapter.B = null;
                    ArrayList arrayList = adapter.f47390w0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.N;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.P = null;
                    adapter.Q = null;
                    ArrayList arrayList3 = adapter.f47391x;
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
                rf.v0 adapter2 = d4Var.Z2.getAdapter();
                MessagesController.getInstance(d4Var.f15545y2).getUser(Long.valueOf(d4Var.f15540x1));
                TLRPC.Chat chat = MessagesController.getInstance(d4Var.f15545y2).getChat(Long.valueOf(-d4Var.f15540x1));
                adapter2.getClass();
                adapter2.f47372h0 = chat;
                d4Var.Z2.getAdapter().U(charSequence, d4Var.X1.getCursorPosition(), null, false, false);
            }
        }
        d4Var.invalidate();
    }

    @Override
    public final void l2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        d4 d4Var = this.f16013a;
        boolean z11 = false;
        if (d4Var.F2 == null && CameraView.isCameraAllowed()) {
            d4Var.F2 = new s50(d4Var.getContext(), new b3(d4Var), d4Var.f15539x0, false);
            d4Var.addView(d4Var.F2, Math.min(d4Var.indexOfChild(d4Var.X1.getRecordCircle()), d4Var.indexOfChild(d4Var.X1.J1)), i7.f6.e(-1, -1, 51));
        }
        s50 s50Var = d4Var.F2;
        if (s50Var != null) {
            if (i10 == 0) {
                s50Var.l(false);
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z11 = true;
                    }
                    s50Var.d(z11);
                }
            } else {
                s50Var.k(i10, i11, i12, j10, j11, z10);
            }
        }
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final void n1() {
        s50 s50Var = this.f16013a.F2;
        if (s50Var != null) {
            s50Var.q();
        }
    }

    @Override
    public final jn o0() {
        return null;
    }

    @Override
    public final boolean o1() {
        TLRPC.User user;
        d4 d4Var = this.f16013a;
        if (d4Var.f15540x1 < 0 || (user = MessagesController.getInstance(d4Var.f15545y2).getUser(Long.valueOf(d4Var.f15540x1))) == null || UserObject.isUserSelf(user) || user.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final TLRPC.Peer q() {
        d1 d1Var;
        boolean z10;
        i9 i9Var = this.f16013a.F0;
        if (i9Var != null && (d1Var = i9Var.f15790w0) != null) {
            TLRPC.GroupCall groupCall = d1Var.v;
            if (groupCall == null) {
                z10 = false;
            } else {
                z10 = !groupCall.messages_enabled;
            }
            if (!z10) {
                return d1Var.i();
            }
            return null;
        }
        return null;
    }

    @Override
    public final void q1() {
        this.f16013a.O0();
    }

    @Override
    public final void s1() {
        this.f16013a.requestLayout();
    }

    @Override
    public final boolean w1() {
        return false;
    }

    @Override
    public final void z2() {
        this.f16013a.P0();
    }

    @Override
    public final void B() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void M() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void k0() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void v2() {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void U(boolean z10) {
    }

    @Override
    public final void a1(int i10) {
    }

    @Override
    public final void f2(int i10) {
    }

    @Override
    public final void k2(boolean z10) {
    }

    @Override
    public final void v(float f9) {
    }

    @Override
    public final void v1(CharSequence charSequence) {
    }

    @Override
    public final void x(boolean z10) {
    }

    @Override
    public final void E0(int i10, int i11) {
    }

    @Override
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }
}
