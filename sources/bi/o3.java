package bi;

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
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.w50;
import org.telegram.ui.sn;
public final class o3 implements og {
    public final o5 f3425a;

    public o3(o5 o5Var) {
        this.f3425a = o5Var;
    }

    @Override
    public final void G(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        boolean z11;
        o5 o5Var = this.f3425a;
        if (o5Var.G2) {
            AndroidUtilities.runOnUIThread(new g(this, j3, 1), 200L);
            return;
        }
        if (j3 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        o5Var.k0(z11);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers H() {
        t1 t1Var;
        boolean z10;
        o5 o5Var = this.f3425a;
        if (o5Var.O1.f3341f) {
            pb pbVar = o5Var.J0;
            if (pbVar != null && (t1Var = pbVar.A0) != null) {
                TLRPC.GroupCall groupCall = t1Var.v;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return null;
                }
            }
            return o5Var.O3;
        }
        return null;
    }

    @Override
    public final void J(float f7, int i10) {
        w50 w50Var = this.f3425a.J2;
        if (w50Var != null) {
            w50Var.e(f7, i10);
        }
    }

    @Override
    public final int W0() {
        return this.f3425a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem Y0() {
        return this.f3425a.O1.f3337a;
    }

    @Override
    public final boolean a1(long j3) {
        boolean z10;
        o5 o5Var = this.f3425a;
        m5 m5Var = o5Var.O1;
        TL_stories.StoryItem storyItem = m5Var.f3337a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) m5Var.f3337a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(o5Var.C2).getInputPeer(j3);
            ConnectionsManager.getInstance(o5Var.C2).sendRequest(savedefaultsendas, null);
            t1 t1Var = o5Var.J0.A0;
            if (t1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(o5Var.C2).getPeer(j3);
                TLRPC.GroupCall groupCall = t1Var.v;
                if (groupCall != null) {
                    int i10 = groupCall.flags;
                    if (peer != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    groupCall.flags = TLObject.setFlag(i10, 2097152, z10);
                    t1Var.v.default_send_as = peer;
                }
            }
            o5Var.r0(true);
            o5Var.f3433b2.P1(true);
            o5Var.f3433b2.K(true);
            o5Var.f1(false);
        }
        return true;
    }

    @Override
    public final void a2() {
        String str;
        int i10;
        o5 o5Var = this.f3425a;
        if (o5Var.E1) {
            o5.h0(o5Var);
            return;
        }
        if (o5Var.W2 == null) {
            i40 i40Var = new i40(9, o5Var.getContext(), o5Var.B0, false);
            o5Var.W2 = i40Var;
            i40Var.setVisibility(8);
            o5Var.addView(o5Var.W2, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (o5Var.B1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(o5Var.C2).getChat(Long.valueOf(-o5Var.B1));
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
        }
        i40 i40Var2 = o5Var.W2;
        if (o5Var.f3433b2.f23704c1) {
            i10 = R.string.VideoMessagesRestrictedByPrivacy;
        } else {
            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
        }
        i40Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, str)));
        o5Var.W2.f(o5Var.f3433b2.getAudioVideoButtonContainer(), true);
    }

    @Override
    public final void c2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        o5 o5Var = this.f3425a;
        boolean z11 = false;
        if (o5Var.J2 == null && CameraView.isCameraAllowed()) {
            o5Var.J2 = new w50(o5Var.getContext(), new d4(o5Var), o5Var.B0, false);
            o5Var.addView(o5Var.J2, Math.min(o5Var.indexOfChild(o5Var.f3433b2.getRecordCircle()), o5Var.indexOfChild(o5Var.f3433b2.N1)), w7.x5.e(-1, -1, 51));
        }
        w50 w50Var = o5Var.J2;
        if (w50Var != null) {
            if (i10 == 0) {
                w50Var.l(false);
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z11 = true;
                    }
                    w50Var.d(z11);
                }
            } else {
                w50Var.k(i10, i11, i12, j3, j10, z10);
            }
        }
    }

    @Override
    public final boolean d1() {
        w50 w50Var = this.f3425a.J2;
        if (w50Var != null && !w50Var.f32161e0) {
            return true;
        }
        return false;
    }

    @Override
    public final void f1(CharSequence charSequence, boolean z10, boolean z11) {
        o5 o5Var = this.f3425a;
        if (o5Var.f3442d3 == null) {
            p3 p3Var = new p3(o5Var, o5Var.getContext(), o5Var.B1, o5Var.J0.f3572f, o5Var.B0);
            o5Var.f3442d3 = p3Var;
            p3Var.p(new s3(o5Var));
            o5Var.addView(o5Var.f3442d3, w7.x5.e(-1, -1, 83));
        }
        if (o5Var.f3442d3.getAdapter() != null) {
            o5Var.f3442d3.setDialogId(o5Var.B1);
            if (o5Var.O1.f3341f) {
                hg.k1 adapter = o5Var.f3442d3.getAdapter();
                if (adapter.f11166j0 == 0 && adapter.f11179u0 == 0 && adapter.f11178t0 == 0 && adapter.E0 == 0) {
                    adapter.f11182w0 = null;
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
                    ArrayList arrayList3 = adapter.f11183x;
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
                hg.k1 adapter2 = o5Var.f3442d3.getAdapter();
                MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(o5Var.C2).getChat(Long.valueOf(-o5Var.B1));
                adapter2.getClass();
                adapter2.f11168l0 = chat;
                o5Var.f3442d3.getAdapter().U(charSequence, o5Var.f3433b2.getCursorPosition(), null, false, false);
            }
        }
        o5Var.invalidate();
    }

    @Override
    public final void h1() {
        w50 w50Var = this.f3425a.J2;
        if (w50Var != null) {
            w50Var.q();
        }
    }

    @Override
    public final boolean i1() {
        TLRPC.User user;
        o5 o5Var = this.f3425a;
        if (o5Var.B1 < 0 || (user = MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final void k1() {
        this.f3425a.O0();
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void m1() {
        this.f3425a.requestLayout();
    }

    @Override
    public final sn o0() {
        return null;
    }

    @Override
    public final int p() {
        return 0;
    }

    @Override
    public final TLRPC.Peer q() {
        t1 t1Var;
        boolean z10;
        pb pbVar = this.f3425a.J0;
        if (pbVar != null && (t1Var = pbVar.A0) != null) {
            TLRPC.GroupCall groupCall = t1Var.v;
            if (groupCall == null) {
                z10 = false;
            } else {
                z10 = !groupCall.messages_enabled;
            }
            if (!z10) {
                return t1Var.i();
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final void r2() {
        this.f3425a.P0();
    }

    @Override
    public final boolean z0() {
        return true;
    }

    @Override
    public final void C() {
    }

    @Override
    public final void D0() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void P0() {
    }

    @Override
    public final void U() {
    }

    @Override
    public final void V1() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void l0() {
    }

    @Override
    public final void l1() {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void x1() {
    }

    @Override
    public final void V0(int i10) {
    }

    @Override
    public final void W(boolean z10) {
    }

    @Override
    public final void X1(int i10) {
    }

    @Override
    public final void b2(boolean z10) {
    }

    @Override
    public final void p1(CharSequence charSequence) {
    }

    @Override
    public final void x(float f7) {
    }

    @Override
    public final void z(boolean z10) {
    }

    @Override
    public final void B0(int i10, int i11) {
    }

    @Override
    public final void n1(View view, CharSequence charSequence, boolean z10) {
    }
}
