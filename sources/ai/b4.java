package ai;

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
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.w50;
import org.telegram.ui.rn;
public final class b4 implements mg {
    public final f6 f575a;

    public b4(f6 f6Var) {
        this.f575a = f6Var;
    }

    @Override
    public final void A2() {
        this.f575a.P0();
    }

    @Override
    public final boolean C0() {
        return true;
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        boolean z11;
        f6 f6Var = this.f575a;
        if (f6Var.G2) {
            AndroidUtilities.runOnUIThread(new j(this, j3, 1), 200L);
            return;
        }
        if (j3 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        f6Var.k0(z11);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        d2 d2Var;
        boolean z10;
        f6 f6Var = this.f575a;
        if (f6Var.O1.f706f) {
            jc jcVar = f6Var.J0;
            if (jcVar != null && (d2Var = jcVar.A0) != null) {
                TLRPC.GroupCall groupCall = d2Var.v;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return null;
                }
            }
            return f6Var.O3;
        }
        return null;
    }

    @Override
    public final void K(float f7, int i10) {
        w50 w50Var = this.f575a.J2;
        if (w50Var != null) {
            w50Var.e(f7, i10);
        }
    }

    @Override
    public final int b1() {
        return this.f575a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem d1() {
        return this.f575a.O1.f703a;
    }

    @Override
    public final boolean f1(long j3) {
        boolean z10;
        f6 f6Var = this.f575a;
        d6 d6Var = f6Var.O1;
        TL_stories.StoryItem storyItem = d6Var.f703a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) d6Var.f703a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(f6Var.C2).getInputPeer(j3);
            ConnectionsManager.getInstance(f6Var.C2).sendRequest(savedefaultsendas, null);
            d2 d2Var = f6Var.J0.A0;
            if (d2Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(f6Var.C2).getPeer(j3);
                TLRPC.GroupCall groupCall = d2Var.v;
                if (groupCall != null) {
                    int i10 = groupCall.flags;
                    if (peer != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    groupCall.flags = TLObject.setFlag(i10, 2097152, z10);
                    d2Var.v.default_send_as = peer;
                }
            }
            f6Var.r0(true);
            f6Var.f797b2.Q1(true);
            f6Var.f797b2.L(true);
            f6Var.f1(false);
        }
        return true;
    }

    @Override
    public final boolean i1() {
        w50 w50Var = this.f575a.J2;
        if (w50Var != null && !w50Var.f29580e0) {
            return true;
        }
        return false;
    }

    @Override
    public final void i2() {
        String str;
        int i10;
        f6 f6Var = this.f575a;
        if (f6Var.E1) {
            f6.h0(f6Var);
            return;
        }
        if (f6Var.W2 == null) {
            i40 i40Var = new i40(9, f6Var.getContext(), f6Var.B0, false);
            f6Var.W2 = i40Var;
            i40Var.setVisibility(8);
            f6Var.addView(f6Var.W2, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (f6Var.B1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(f6Var.C2).getChat(Long.valueOf(-f6Var.B1));
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
        }
        i40 i40Var2 = f6Var.W2;
        if (f6Var.f797b2.f21743c1) {
            i10 = R.string.VideoMessagesRestrictedByPrivacy;
        } else {
            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
        }
        i40Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, str)));
        f6Var.W2.f(f6Var.f797b2.getAudioVideoButtonContainer(), true);
    }

    @Override
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        f6 f6Var = this.f575a;
        boolean z11 = false;
        if (f6Var.J2 == null && CameraView.isCameraAllowed()) {
            f6Var.J2 = new w50(f6Var.getContext(), new r4(f6Var), f6Var.B0, false);
            f6Var.addView(f6Var.J2, Math.min(f6Var.indexOfChild(f6Var.f797b2.getRecordCircle()), f6Var.indexOfChild(f6Var.f797b2.N1)), w7.x5.e(-1, -1, 51));
        }
        w50 w50Var = f6Var.J2;
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
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        f6 f6Var = this.f575a;
        if (f6Var.f806d3 == null) {
            c4 c4Var = new c4(f6Var, f6Var.getContext(), f6Var.B1, f6Var.J0.f1077f, f6Var.B0);
            f6Var.f806d3 = c4Var;
            c4Var.p(new f4(f6Var));
            f6Var.addView(f6Var.f806d3, w7.x5.e(-1, -1, 83));
        }
        if (f6Var.f806d3.getAdapter() != null) {
            f6Var.f806d3.setDialogId(f6Var.B1);
            if (f6Var.O1.f706f) {
                gg.k1 adapter = f6Var.f806d3.getAdapter();
                if (adapter.f9822j0 == 0 && adapter.f9835u0 == 0 && adapter.f9834t0 == 0 && adapter.E0 == 0) {
                    adapter.f9838w0 = null;
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
                    ArrayList arrayList3 = adapter.f9839x;
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
                gg.k1 adapter2 = f6Var.f806d3.getAdapter();
                MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(f6Var.C2).getChat(Long.valueOf(-f6Var.B1));
                adapter2.getClass();
                adapter2.f9824l0 = chat;
                f6Var.f806d3.getAdapter().U(charSequence, f6Var.f797b2.getCursorPosition(), null, false, false);
            }
        }
        f6Var.invalidate();
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void n1() {
        w50 w50Var = this.f575a.J2;
        if (w50Var != null) {
            w50Var.q();
        }
    }

    @Override
    public final boolean o1() {
        TLRPC.User user;
        f6 f6Var = this.f575a;
        if (f6Var.B1 < 0 || (user = MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final rn p0() {
        return null;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final void q1() {
        this.f575a.O0();
    }

    @Override
    public final void s1() {
        this.f575a.requestLayout();
    }

    @Override
    public final TLRPC.Peer v() {
        d2 d2Var;
        boolean z10;
        jc jcVar = this.f575a.J0;
        if (jcVar != null && (d2Var = jcVar.A0) != null) {
            TLRPC.GroupCall groupCall = d2Var.v;
            if (groupCall == null) {
                z10 = false;
            } else {
                z10 = !groupCall.messages_enabled;
            }
            if (!z10) {
                return d2Var.i();
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean w1() {
        return false;
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void E1() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void W() {
    }

    @Override
    public final void X(boolean z10) {
    }

    @Override
    public final void a1(int i10) {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void f2(int i10) {
    }

    @Override
    public final void g() {
    }

    @Override
    public final void j2(boolean z10) {
    }

    @Override
    public final void l() {
    }

    @Override
    public final void m0() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void v1(CharSequence charSequence) {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void y(float f7) {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void E0(int i10, int i11) {
    }

    @Override
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }
}
