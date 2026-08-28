package ih;

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
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.s30;
import org.telegram.ui.gn;
public final class q2 implements eg {
    public final i4 f11997a;

    public q2(i4 i4Var) {
        this.f11997a = i4Var;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers A() {
        f1 f1Var;
        boolean z10;
        i4 i4Var = this.f11997a;
        if (i4Var.K1.f11470f) {
            m9 m9Var = i4Var.F0;
            if (m9Var != null && (f1Var = m9Var.f11831w0) != null) {
                TLRPC.GroupCall groupCall = f1Var.v;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return null;
                }
            }
            return i4Var.K3;
        }
        return null;
    }

    @Override
    public final void B(float f10, int i9) {
        f50 f50Var = this.f11997a.F2;
        if (f50Var != null) {
            f50Var.e(f10, i9);
        }
    }

    @Override
    public final int N0() {
        return this.f11997a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem P0() {
        return this.f11997a.K1.f11466a;
    }

    @Override
    public final void Q1() {
        String str;
        int i9;
        i4 i4Var = this.f11997a;
        if (i4Var.A1) {
            i4.h0(i4Var);
            return;
        }
        if (i4Var.S2 == null) {
            s30 s30Var = new s30(9, i4Var.getContext(), i4Var.f11603x0, false);
            i4Var.S2 = s30Var;
            s30Var.setVisibility(8);
            i4Var.addView(i4Var.S2, g7.e6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (i4Var.f11604x1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(i4Var.f11609y2).getUser(Long.valueOf(i4Var.f11604x1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i4Var.f11609y2).getChat(Long.valueOf(-i4Var.f11604x1));
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
        }
        s30 s30Var2 = i4Var.S2;
        if (i4Var.X1.Y0) {
            i9 = R.string.VideoMessagesRestrictedByPrivacy;
        } else {
            i9 = R.string.VoiceMessagesRestrictedByPrivacy;
        }
        s30Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i9, str)));
        i4Var.S2.f(i4Var.X1.getAudioVideoButtonContainer(), true);
    }

    @Override
    public final gn T() {
        return null;
    }

    @Override
    public final boolean T0(long j10) {
        boolean z10;
        i4 i4Var = this.f11997a;
        g4 g4Var = i4Var.K1;
        TL_stories.StoryItem storyItem = g4Var.f11466a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) g4Var.f11466a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(i4Var.f11609y2).getInputPeer(j10);
            ConnectionsManager.getInstance(i4Var.f11609y2).sendRequest(savedefaultsendas, null);
            f1 f1Var = i4Var.F0.f11831w0;
            if (f1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(i4Var.f11609y2).getPeer(j10);
                TLRPC.GroupCall groupCall = f1Var.v;
                if (groupCall != null) {
                    int i9 = groupCall.flags;
                    if (peer != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    groupCall.flags = TLObject.setFlag(i9, 2097152, z10);
                    f1Var.v.default_send_as = peer;
                }
            }
            i4Var.r0(true);
            i4Var.X1.P1(true);
            i4Var.X1.J(true);
            i4Var.f1(false);
        }
        return true;
    }

    @Override
    public final void U1(int i9, int i10, int i11, long j10, long j11, boolean z10) {
        i4 i4Var = this.f11997a;
        boolean z11 = false;
        if (i4Var.F2 == null && CameraView.isCameraAllowed()) {
            i4Var.F2 = new f50(i4Var.getContext(), new d3(i4Var), i4Var.f11603x0, false);
            i4Var.addView(i4Var.F2, Math.min(i4Var.indexOfChild(i4Var.X1.getRecordCircle()), i4Var.indexOfChild(i4Var.X1.J1)), g7.e6.e(-1, -1, 51));
        }
        f50 f50Var = i4Var.F2;
        if (f50Var != null) {
            if (i9 == 0) {
                f50Var.l(false);
            } else if (i9 != 1 && i9 != 3 && i9 != 4) {
                if (i9 == 2 || i9 == 5) {
                    if (i9 == 2) {
                        z11 = true;
                    }
                    f50Var.d(z11);
                }
            } else {
                f50Var.k(i9, i10, i11, j10, j11, z10);
            }
        }
    }

    @Override
    public final boolean X0() {
        f50 f50Var = this.f11997a.F2;
        if (f50Var != null && !f50Var.f28273a0) {
            return true;
        }
        return false;
    }

    @Override
    public final void b1(CharSequence charSequence, boolean z10, boolean z11) {
        i4 i4Var = this.f11997a;
        if (i4Var.Z2 == null) {
            r2 r2Var = new r2(i4Var, i4Var.getContext(), i4Var.f11604x1, i4Var.F0.f11797f, i4Var.f11603x0);
            i4Var.Z2 = r2Var;
            r2Var.p(new t2(i4Var));
            i4Var.addView(i4Var.Z2, g7.e6.e(-1, -1, 83));
        }
        if (i4Var.Z2.getAdapter() != null) {
            i4Var.Z2.setDialogId(i4Var.f11604x1);
            if (i4Var.K1.f11470f) {
                of.f1 adapter = i4Var.Z2.getAdapter();
                if (adapter.f19328f0 == 0 && adapter.f19339q0 == 0 && adapter.f19338p0 == 0 && adapter.A0 == 0) {
                    adapter.f19343s0 = null;
                    adapter.B = null;
                    ArrayList arrayList = adapter.f19348w0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.N;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.P = null;
                    adapter.Q = null;
                    ArrayList arrayList3 = adapter.f19349x;
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
                of.f1 adapter2 = i4Var.Z2.getAdapter();
                MessagesController.getInstance(i4Var.f11609y2).getUser(Long.valueOf(i4Var.f11604x1));
                TLRPC.Chat chat = MessagesController.getInstance(i4Var.f11609y2).getChat(Long.valueOf(-i4Var.f11604x1));
                adapter2.getClass();
                adapter2.f19330h0 = chat;
                i4Var.Z2.getAdapter().U(charSequence, i4Var.X1.getCursorPosition(), null, false, false);
            }
        }
        i4Var.invalidate();
    }

    @Override
    public final void c1() {
        f50 f50Var = this.f11997a.F2;
        if (f50Var != null) {
            f50Var.q();
        }
    }

    @Override
    public final void d2() {
        this.f11997a.P0();
    }

    @Override
    public final boolean f1() {
        TLRPC.User user;
        i4 i4Var = this.f11997a;
        if (i4Var.f11604x1 < 0 || (user = MessagesController.getInstance(i4Var.f11609y2).getUser(Long.valueOf(i4Var.f11604x1))) == null || UserObject.isUserSelf(user) || user.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h1() {
        this.f11997a.O0();
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final void j1() {
        this.f11997a.requestLayout();
    }

    @Override
    public final TLRPC.Peer k() {
        f1 f1Var;
        boolean z10;
        m9 m9Var = this.f11997a.F0;
        if (m9Var != null && (f1Var = m9Var.f11831w0) != null) {
            TLRPC.GroupCall groupCall = f1Var.v;
            if (groupCall == null) {
                z10 = false;
            } else {
                z10 = !groupCall.messages_enabled;
            }
            if (!z10) {
                return f1Var.i();
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean n0() {
        return true;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final void y(CharSequence charSequence, boolean z10, int i9, int i10, long j10) {
        boolean z11;
        i4 i4Var = this.f11997a;
        if (i4Var.C2) {
            AndroidUtilities.runOnUIThread(new bg.i2(this, j10, 4), 200L);
            return;
        }
        if (j10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        i4Var.k0(z11);
    }

    @Override
    public final void G() {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void J1() {
    }

    @Override
    public final void Q() {
    }

    @Override
    public final void X1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void c2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void h0() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void u1() {
    }

    @Override
    public final void x0() {
    }

    @Override
    public final void H(boolean z10) {
    }

    @Override
    public final void K1(int i9) {
    }

    @Override
    public final void L0(int i9) {
    }

    @Override
    public final void T1(boolean z10) {
    }

    @Override
    public final void m1(CharSequence charSequence) {
    }

    @Override
    public final void o(float f10) {
    }

    @Override
    public final void p(boolean z10) {
    }

    @Override
    public final void p0(int i9, int i10) {
    }

    @Override
    public final void k1(View view, CharSequence charSequence, boolean z10) {
    }
}
