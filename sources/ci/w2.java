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
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.r40;
import org.telegram.ui.in;
public final class w2 implements og {
    public final q4 f6111a;

    public w2(q4 q4Var) {
        this.f6111a = q4Var;
    }

    @Override
    public final boolean B0() {
        return true;
    }

    @Override
    public final void L(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        boolean z11;
        q4 q4Var = this.f6111a;
        if (q4Var.G2) {
            AndroidUtilities.runOnUIThread(new ai.r3(this, j10, 3), 200L);
            return;
        }
        if (j10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        q4Var.k0(z11);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers O() {
        h1 h1Var;
        boolean z10;
        q4 q4Var = this.f6111a;
        if (q4Var.O1.f5694f) {
            aa aaVar = q4Var.J0;
            if (aaVar != null && (h1Var = aaVar.A0) != null) {
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
            return q4Var.O3;
        }
        return null;
    }

    @Override
    public final void U(float f7, int i10) {
        m60 m60Var = this.f6111a.J2;
        if (m60Var != null) {
            m60Var.b(f7, i10);
        }
    }

    @Override
    public final int Y0() {
        return this.f6111a.getHeight();
    }

    @Override
    public final void Y1() {
        String str;
        int i10;
        q4 q4Var = this.f6111a;
        if (q4Var.E1) {
            q4.h0(q4Var);
            return;
        }
        if (q4Var.W2 == null) {
            r40 r40Var = new r40(9, q4Var.getContext(), q4Var.B0, false);
            q4Var.W2 = r40Var;
            r40Var.setVisibility(8);
            q4Var.addView(q4Var.W2, w7.z5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
        }
        if (q4Var.B1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(q4Var.C2).getUser(Long.valueOf(q4Var.B1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(q4Var.C2).getChat(Long.valueOf(-q4Var.B1));
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
        }
        r40 r40Var2 = q4Var.W2;
        if (q4Var.f5769b2.f23927c1) {
            i10 = R.string.VideoMessagesRestrictedByPrivacy;
        } else {
            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
        }
        r40Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, str)));
        q4Var.W2.f(q4Var.f5769b2.getAudioVideoButtonContainer(), true);
    }

    @Override
    public final TL_stories.StoryItem a1() {
        return this.f6111a.O1.f5691a;
    }

    @Override
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        q4 q4Var = this.f6111a;
        boolean z11 = false;
        if (q4Var.J2 == null && CameraView.isCameraAllowed()) {
            q4Var.J2 = new m60(q4Var.getContext(), new k3(q4Var), q4Var.B0, false);
            q4Var.addView(q4Var.J2, Math.min(q4Var.indexOfChild(q4Var.f5769b2.getRecordCircle()), q4Var.indexOfChild(q4Var.f5769b2.O1)), w7.z5.e(-1, -1, 51));
        }
        m60 m60Var = q4Var.J2;
        if (m60Var != null) {
            if (i10 == 0) {
                m60Var.h(false);
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z11 = true;
                    }
                    m60Var.a(z11);
                }
            } else {
                m60Var.f(i10, i11, i12, j10, j11, z10);
            }
        }
    }

    @Override
    public final boolean b1(long j10) {
        boolean z10;
        q4 q4Var = this.f6111a;
        o4 o4Var = q4Var.O1;
        TL_stories.StoryItem storyItem = o4Var.f5691a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) o4Var.f5691a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(q4Var.C2).getInputPeer(j10);
            ConnectionsManager.getInstance(q4Var.C2).sendRequest(savedefaultsendas, null);
            h1 h1Var = q4Var.J0.A0;
            if (h1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(q4Var.C2).getPeer(j10);
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
            q4Var.r0(true);
            q4Var.f5769b2.O1(true);
            q4Var.f5769b2.I(true);
            q4Var.f1(false);
        }
        return true;
    }

    @Override
    public final boolean e1() {
        m60 m60Var = this.f6111a.J2;
        if (m60Var != null && !m60Var.f28436j0) {
            return true;
        }
        return false;
    }

    @Override
    public final void g1(CharSequence charSequence, boolean z10, boolean z11) {
        q4 q4Var = this.f6111a;
        if (q4Var.f5778d3 == null) {
            x2 x2Var = new x2(q4Var, q4Var.getContext(), q4Var.B1, q4Var.J0.f5190f, q4Var.B0);
            q4Var.f5778d3 = x2Var;
            x2Var.p(new a3(q4Var));
            q4Var.addView(q4Var.f5778d3, w7.z5.e(-1, -1, 83));
        }
        if (q4Var.f5778d3.getAdapter() != null) {
            q4Var.f5778d3.setDialogId(q4Var.B1);
            if (q4Var.O1.f5694f) {
                hg.j1 adapter = q4Var.f5778d3.getAdapter();
                if (adapter.f11933j0 == 0 && adapter.f11946u0 == 0 && adapter.f11945t0 == 0 && adapter.E0 == 0) {
                    adapter.f11949w0 = null;
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
                    ArrayList arrayList3 = adapter.f11950x;
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
                hg.j1 adapter2 = q4Var.f5778d3.getAdapter();
                MessagesController.getInstance(q4Var.C2).getUser(Long.valueOf(q4Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(q4Var.C2).getChat(Long.valueOf(-q4Var.B1));
                adapter2.getClass();
                adapter2.f11935l0 = chat;
                q4Var.f5778d3.getAdapter().U(charSequence, q4Var.f5769b2.getCursorPosition(), null, false, false);
            }
        }
        q4Var.invalidate();
    }

    @Override
    public final void i1() {
        m60 m60Var = this.f6111a.J2;
        if (m60Var != null) {
            m60Var.i();
        }
    }

    @Override
    public final boolean j1() {
        TLRPC.User user;
        q4 q4Var = this.f6111a;
        if (q4Var.B1 < 0 || (user = MessagesController.getInstance(q4Var.C2).getUser(Long.valueOf(q4Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final void l1() {
        this.f6111a.O0();
    }

    @Override
    public final void n1() {
        this.f6111a.requestLayout();
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
        this.f6111a.P0();
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
        aa aaVar = this.f6111a.J0;
        if (aaVar != null && (h1Var = aaVar.A0) != null) {
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
    public final void V1(int i10) {
    }

    @Override
    public final void X0(int i10) {
    }

    @Override
    public final void Y() {
    }

    @Override
    public final void Z1(boolean z10) {
    }

    @Override
    public final void a0(boolean z10) {
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
    public final void q1(CharSequence charSequence) {
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
    public final void z(float f7) {
    }

    @Override
    public final void D0(int i10, int i11) {
    }

    @Override
    public final void o1(View view, CharSequence charSequence, boolean z10) {
    }
}
