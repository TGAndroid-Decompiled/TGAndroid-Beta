package ci;

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
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.r40;
import org.telegram.ui.in;
public final class v2 implements og {
    public final p4 f6013a;

    public v2(p4 p4Var) {
        this.f6013a = p4Var;
    }

    @Override
    public final boolean B0() {
        return true;
    }

    @Override
    public final void L(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        boolean z11;
        p4 p4Var = this.f6013a;
        if (p4Var.G2) {
            AndroidUtilities.runOnUIThread(new ai.v3(this, j10, 3), 200L);
            return;
        }
        if (j10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        p4Var.j0(z11);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers O() {
        h1 h1Var;
        boolean z10;
        p4 p4Var = this.f6013a;
        if (p4Var.O1.f5598f) {
            z9 z9Var = p4Var.J0;
            if (z9Var != null && (h1Var = z9Var.A0) != null) {
                TLRPC.GroupCall groupCall = h1Var.v;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return null;
                }
            }
            return p4Var.O3;
        }
        return null;
    }

    @Override
    public final void U(float f7, int i10) {
        n60 n60Var = this.f6013a.J2;
        if (n60Var != null) {
            n60Var.b(f7, i10);
        }
    }

    @Override
    public final int Y0() {
        return this.f6013a.getHeight();
    }

    @Override
    public final void Y1() {
        String str;
        int i10;
        p4 p4Var = this.f6013a;
        if (p4Var.E1) {
            p4.g0(p4Var);
            return;
        }
        if (p4Var.W2 == null) {
            r40 r40Var = new r40(9, p4Var.getContext(), p4Var.B0, false);
            p4Var.W2 = r40Var;
            r40Var.setVisibility(8);
            p4Var.addView(p4Var.W2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (p4Var.B1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(p4Var.C2).getChat(Long.valueOf(-p4Var.B1));
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
        }
        r40 r40Var2 = p4Var.W2;
        if (p4Var.f5653b2.f24066c1) {
            i10 = R.string.VideoMessagesRestrictedByPrivacy;
        } else {
            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
        }
        r40Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, str)));
        p4Var.W2.f(p4Var.f5653b2.getAudioVideoButtonContainer(), true);
    }

    @Override
    public final TL_stories.StoryItem a1() {
        return this.f6013a.O1.f5595a;
    }

    @Override
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        p4 p4Var = this.f6013a;
        boolean z11 = false;
        if (p4Var.J2 == null && CameraView.isCameraAllowed()) {
            p4Var.J2 = new n60(p4Var.getContext(), new j3(p4Var), p4Var.B0, false);
            p4Var.addView(p4Var.J2, Math.min(p4Var.indexOfChild(p4Var.f5653b2.getRecordCircle()), p4Var.indexOfChild(p4Var.f5653b2.O1)), w7.z5.e(-1, -1, 51));
        }
        n60 n60Var = p4Var.J2;
        if (n60Var != null) {
            if (i10 == 0) {
                n60Var.h(false);
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z11 = true;
                    }
                    n60Var.a(z11);
                }
            } else {
                n60Var.f(i10, i11, i12, j10, j11, z10);
            }
        }
    }

    @Override
    public final boolean b1(long j10) {
        boolean z10;
        p4 p4Var = this.f6013a;
        n4 n4Var = p4Var.O1;
        TL_stories.StoryItem storyItem = n4Var.f5595a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) n4Var.f5595a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(p4Var.C2).getInputPeer(j10);
            ConnectionsManager.getInstance(p4Var.C2).sendRequest(savedefaultsendas, null);
            h1 h1Var = p4Var.J0.A0;
            if (h1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(p4Var.C2).getPeer(j10);
                TLRPC.GroupCall groupCall = h1Var.v;
                if (groupCall != null) {
                    int i10 = groupCall.flags;
                    if (peer != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    groupCall.flags = TLObject.setFlag(i10, 2097152, z10);
                    h1Var.v.default_send_as = peer;
                }
            }
            p4Var.q0(true);
            p4Var.f5653b2.M1(true);
            p4Var.f5653b2.F(true);
            p4Var.e1(false);
        }
        return true;
    }

    @Override
    public final boolean e1() {
        n60 n60Var = this.f6013a.J2;
        if (n60Var != null && !n60Var.f28863j0) {
            return true;
        }
        return false;
    }

    @Override
    public final void g1(CharSequence charSequence, boolean z10, boolean z11) {
        p4 p4Var = this.f6013a;
        if (p4Var.f5662d3 == null) {
            w2 w2Var = new w2(p4Var, p4Var.getContext(), p4Var.B1, p4Var.J0.f6233f, p4Var.B0);
            p4Var.f5662d3 = w2Var;
            w2Var.p(new z2(p4Var));
            p4Var.addView(p4Var.f5662d3, w7.z5.e(-1, -1, 83));
        }
        if (p4Var.f5662d3.getAdapter() != null) {
            p4Var.f5662d3.setDialogId(p4Var.B1);
            if (p4Var.O1.f5598f) {
                hg.j1 adapter = p4Var.f5662d3.getAdapter();
                if (adapter.f11958j0 == 0 && adapter.f11971u0 == 0 && adapter.f11970t0 == 0 && adapter.E0 == 0) {
                    adapter.f11974w0 = null;
                    adapter.F = null;
                    ArrayList arrayList = adapter.A0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.R;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.T = null;
                    adapter.U = null;
                    ArrayList arrayList3 = adapter.f11975x;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    ArrayList arrayList4 = adapter.I;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                    ArrayList arrayList5 = adapter.J;
                    if (arrayList5 != null) {
                        arrayList5.clear();
                    }
                    ArrayList arrayList6 = adapter.M;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    ArrayList arrayList7 = adapter.N;
                    if (arrayList7 != null) {
                        arrayList7.clear();
                    }
                    adapter.l();
                }
            } else {
                hg.j1 adapter2 = p4Var.f5662d3.getAdapter();
                MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(p4Var.C2).getChat(Long.valueOf(-p4Var.B1));
                adapter2.getClass();
                adapter2.f11960l0 = chat;
                p4Var.f5662d3.getAdapter().U(charSequence, p4Var.f5653b2.getCursorPosition(), null, false, false);
            }
        }
        p4Var.invalidate();
    }

    @Override
    public final void i1() {
        n60 n60Var = this.f6013a.J2;
        if (n60Var != null) {
            n60Var.i();
        }
    }

    @Override
    public final boolean j1() {
        TLRPC.User user;
        p4 p4Var = this.f6013a;
        if (p4Var.B1 < 0 || (user = MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final void l1() {
        this.f6013a.N0();
    }

    @Override
    public final void n1() {
        this.f6013a.requestLayout();
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final in p0() {
        return null;
    }

    @Override
    public final void q2() {
        this.f6013a.O0();
    }

    @Override
    public final boolean r1() {
        return false;
    }

    @Override
    public final int u() {
        return 0;
    }

    @Override
    public final TLRPC.Peer x() {
        h1 h1Var;
        boolean z10;
        z9 z9Var = this.f6013a.J0;
        if (z9Var != null && (h1Var = z9Var.A0) != null) {
            TLRPC.GroupCall groupCall = h1Var.v;
            if (groupCall == null) {
                z10 = false;
            } else {
                z10 = !groupCall.messages_enabled;
            }
            if (!z10) {
                return h1Var.i();
            }
            return null;
        }
        return null;
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void V1(int i10) {
    }

    @Override
    public final void X0(int i10) {
    }

    @Override
    public final void Z1(boolean z10) {
    }

    @Override
    public final void a0(boolean z10) {
    }

    @Override
    public final void q1(CharSequence charSequence) {
    }

    @Override
    public final void z(float f7) {
    }

    @Override
    public final void F0() {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void T1() {
    }

    @Override
    public final void Y() {
    }

    @Override
    public final void e2() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void m0() {
    }

    @Override
    public final void m1() {
    }

    @Override
    public final void m2() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void u1() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void y1() {
    }

    @Override
    public final void D0(int i10, int i11) {
    }

    @Override
    public final void o1(View view, CharSequence charSequence, boolean z10) {
    }
}
