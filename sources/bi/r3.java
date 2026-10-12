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
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.v40;
import org.telegram.ui.un;
public final class r3 implements pg {
    public final q5 f3606a;

    public r3(q5 q5Var) {
        this.f3606a = q5Var;
    }

    @Override
    public final boolean B0() {
        return true;
    }

    @Override
    public final void J(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        boolean z11;
        q5 q5Var = this.f3606a;
        if (q5Var.G2) {
            AndroidUtilities.runOnUIThread(new g(this, j10, 1), 200L);
            return;
        }
        if (j10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        q5Var.k0(z11);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers K() {
        t1 t1Var;
        boolean z10;
        q5 q5Var = this.f3606a;
        if (q5Var.O1.f3416f) {
            sb sbVar = q5Var.J0;
            if (sbVar != null && (t1Var = sbVar.A0) != null) {
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
            return q5Var.O3;
        }
        return null;
    }

    @Override
    public final void U(float f7, int i10) {
        p60 p60Var = this.f3606a.J2;
        if (p60Var != null) {
            p60Var.b(f7, i10);
        }
    }

    @Override
    public final int Y0() {
        return this.f3606a.getHeight();
    }

    @Override
    public final void Y1() {
        String str;
        int i10;
        q5 q5Var = this.f3606a;
        if (q5Var.E1) {
            q5.h0(q5Var);
            return;
        }
        if (q5Var.W2 == null) {
            v40 v40Var = new v40(9, q5Var.getContext(), q5Var.B0, false);
            q5Var.W2 = v40Var;
            v40Var.setVisibility(8);
            q5Var.addView(q5Var.W2, w7.a6.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
        }
        if (q5Var.B1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(q5Var.B1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(q5Var.C2).getChat(Long.valueOf(-q5Var.B1));
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
        }
        v40 v40Var2 = q5Var.W2;
        if (q5Var.f3508b2.f22865c1) {
            i10 = R.string.VideoMessagesRestrictedByPrivacy;
        } else {
            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
        }
        v40Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, str)));
        q5Var.W2.f(q5Var.f3508b2.getAudioVideoButtonContainer(), true);
    }

    @Override
    public final TL_stories.StoryItem a1() {
        return this.f3606a.O1.f3413a;
    }

    @Override
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        q5 q5Var = this.f3606a;
        boolean z11 = false;
        if (q5Var.J2 == null && CameraView.isCameraAllowed()) {
            q5Var.J2 = new p60(q5Var.getContext(), new g4(q5Var), q5Var.B0, false);
            q5Var.addView(q5Var.J2, Math.min(q5Var.indexOfChild(q5Var.f3508b2.getRecordCircle()), q5Var.indexOfChild(q5Var.f3508b2.O1)), w7.a6.e(-1, -1, 51));
        }
        p60 p60Var = q5Var.J2;
        if (p60Var != null) {
            if (i10 == 0) {
                p60Var.h(false);
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z11 = true;
                    }
                    p60Var.a(z11);
                }
            } else {
                p60Var.f(i10, i11, i12, j10, j11, z10);
            }
        }
    }

    @Override
    public final boolean b1(long j10) {
        boolean z10;
        q5 q5Var = this.f3606a;
        o5 o5Var = q5Var.O1;
        TL_stories.StoryItem storyItem = o5Var.f3413a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) o5Var.f3413a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(q5Var.C2).getInputPeer(j10);
            ConnectionsManager.getInstance(q5Var.C2).sendRequest(savedefaultsendas, null);
            t1 t1Var = q5Var.J0.A0;
            if (t1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(q5Var.C2).getPeer(j10);
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
            q5Var.r0(true);
            q5Var.f3508b2.O1(true);
            q5Var.f3508b2.I(true);
            q5Var.f1(false);
        }
        return true;
    }

    @Override
    public final boolean e1() {
        p60 p60Var = this.f3606a.J2;
        if (p60Var != null && !p60Var.f28177j0) {
            return true;
        }
        return false;
    }

    @Override
    public final void g1(CharSequence charSequence, boolean z10, boolean z11) {
        q5 q5Var = this.f3606a;
        if (q5Var.f3517d3 == null) {
            s3 s3Var = new s3(q5Var, q5Var.getContext(), q5Var.B1, q5Var.J0.f3673f, q5Var.B0);
            q5Var.f3517d3 = s3Var;
            s3Var.p(new v3(q5Var));
            q5Var.addView(q5Var.f3517d3, w7.a6.e(-1, -1, 83));
        }
        if (q5Var.f3517d3.getAdapter() != null) {
            q5Var.f3517d3.setDialogId(q5Var.B1);
            if (q5Var.O1.f3416f) {
                hg.j1 adapter = q5Var.f3517d3.getAdapter();
                if (adapter.f10622j0 == 0 && adapter.f10635u0 == 0 && adapter.f10634t0 == 0 && adapter.E0 == 0) {
                    adapter.f10638w0 = null;
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
                    ArrayList arrayList3 = adapter.f10639x;
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
                hg.j1 adapter2 = q5Var.f3517d3.getAdapter();
                MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(q5Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(q5Var.C2).getChat(Long.valueOf(-q5Var.B1));
                adapter2.getClass();
                adapter2.f10624l0 = chat;
                q5Var.f3517d3.getAdapter().U(charSequence, q5Var.f3508b2.getCursorPosition(), null, false, false);
            }
        }
        q5Var.invalidate();
    }

    @Override
    public final void i1() {
        p60 p60Var = this.f3606a.J2;
        if (p60Var != null) {
            p60Var.i();
        }
    }

    @Override
    public final boolean j1() {
        TLRPC.User user;
        q5 q5Var = this.f3606a;
        if (q5Var.B1 < 0 || (user = MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(q5Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void l1() {
        this.f3606a.O0();
    }

    @Override
    public final void n1() {
        this.f3606a.requestLayout();
    }

    @Override
    public final un p0() {
        return null;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final void q2() {
        this.f3606a.P0();
    }

    @Override
    public final boolean r1() {
        return false;
    }

    @Override
    public final TLRPC.Peer x() {
        t1 t1Var;
        boolean z10;
        sb sbVar = this.f3606a.J0;
        if (sbVar != null && (t1Var = sbVar.A0) != null) {
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
    public final void F0() {
    }

    @Override
    public final void G() {
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
    public final void X() {
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
    public final void D0(int i10, int i11) {
    }

    @Override
    public final void o1(View view, CharSequence charSequence, boolean z10) {
    }
}
