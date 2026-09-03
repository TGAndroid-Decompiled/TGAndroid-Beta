package oh;

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
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.z50;
import org.telegram.ui.nn;
public final class q2 implements eg {
    public final f4 f17653a;

    public q2(f4 f4Var) {
        this.f17653a = f4Var;
    }

    @Override
    public final void C(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        boolean z10;
        f4 f4Var = this.f17653a;
        if (f4Var.D2) {
            AndroidUtilities.runOnUIThread(new hg.y1(this, j10, 5), 200L);
            return;
        }
        if (j10 <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f4Var.k0(z10);
    }

    @Override
    public final boolean D1() {
        return false;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers F() {
        e1 e1Var;
        boolean z4;
        f4 f4Var = this.f17653a;
        if (f4Var.L1.f16967f) {
            i9 i9Var = f4Var.G0;
            if (i9Var != null && (e1Var = i9Var.f17305x0) != null) {
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
            return f4Var.L3;
        }
        return null;
    }

    @Override
    public final void G(float f10, int i10) {
        z50 z50Var = this.f17653a.G2;
        if (z50Var != null) {
            z50Var.e(f10, i10);
        }
    }

    @Override
    public final boolean H0() {
        return true;
    }

    @Override
    public final void J2() {
        this.f17653a.P0();
    }

    @Override
    public final int f1() {
        return this.f17653a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem h1() {
        return this.f17653a.L1.f16963a;
    }

    @Override
    public final boolean j1(long j10) {
        boolean z4;
        f4 f4Var = this.f17653a;
        d4 d4Var = f4Var.L1;
        TL_stories.StoryItem storyItem = d4Var.f16963a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) d4Var.f16963a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(f4Var.f17135z2).getInputPeer(j10);
            ConnectionsManager.getInstance(f4Var.f17135z2).sendRequest(savedefaultsendas, null);
            e1 e1Var = f4Var.G0.f17305x0;
            if (e1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(f4Var.f17135z2).getPeer(j10);
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
            f4Var.r0(true);
            f4Var.Y1.P1(true);
            f4Var.Y1.J(true);
            f4Var.f1(false);
        }
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final int l() {
        return 0;
    }

    @Override
    public final boolean n1() {
        z50 z50Var = this.f17653a.G2;
        if (z50Var != null && !z50Var.f33773b0) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.Peer p() {
        e1 e1Var;
        boolean z4;
        i9 i9Var = this.f17653a.G0;
        if (i9Var != null && (e1Var = i9Var.f17305x0) != null) {
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
    public final nn r0() {
        return null;
    }

    @Override
    public final void r1(CharSequence charSequence, boolean z4, boolean z10) {
        f4 f4Var = this.f17653a;
        if (f4Var.f17055a3 == null) {
            r2 r2Var = new r2(f4Var, f4Var.getContext(), f4Var.f17130y1, f4Var.G0.f17268f, f4Var.f17129y0);
            f4Var.f17055a3 = r2Var;
            r2Var.p(new t2(f4Var));
            f4Var.addView(f4Var.f17055a3, k7.c6.e(-1, -1, 83));
        }
        if (f4Var.f17055a3.getAdapter() != null) {
            f4Var.f17055a3.setDialogId(f4Var.f17130y1);
            if (f4Var.L1.f16967f) {
                uf.u0 adapter = f4Var.f17055a3.getAdapter();
                if (adapter.f48738g0 == 0 && adapter.f48750r0 == 0 && adapter.f48748q0 == 0 && adapter.B0 == 0) {
                    adapter.f48753t0 = null;
                    adapter.C = null;
                    ArrayList arrayList = adapter.f48759x0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.O;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.Q = null;
                    adapter.R = null;
                    ArrayList arrayList3 = adapter.f48758x;
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
                uf.u0 adapter2 = f4Var.f17055a3.getAdapter();
                MessagesController.getInstance(f4Var.f17135z2).getUser(Long.valueOf(f4Var.f17130y1));
                TLRPC.Chat chat = MessagesController.getInstance(f4Var.f17135z2).getChat(Long.valueOf(-f4Var.f17130y1));
                adapter2.getClass();
                adapter2.f48740i0 = chat;
                f4Var.f17055a3.getAdapter().U(charSequence, f4Var.Y1.getCursorPosition(), null, false, false);
            }
        }
        f4Var.invalidate();
    }

    @Override
    public final void s2() {
        String str;
        int i10;
        f4 f4Var = this.f17653a;
        if (f4Var.B1) {
            f4.h0(f4Var);
            return;
        }
        if (f4Var.T2 == null) {
            m40 m40Var = new m40(9, f4Var.getContext(), f4Var.f17129y0, false);
            f4Var.T2 = m40Var;
            m40Var.setVisibility(8);
            f4Var.addView(f4Var.T2, k7.c6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (f4Var.f17130y1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(f4Var.f17135z2).getUser(Long.valueOf(f4Var.f17130y1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(f4Var.f17135z2).getChat(Long.valueOf(-f4Var.f17130y1));
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
        }
        m40 m40Var2 = f4Var.T2;
        if (f4Var.Y1.Z0) {
            i10 = R.string.VideoMessagesRestrictedByPrivacy;
        } else {
            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
        }
        m40Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, str)));
        f4Var.T2.f(f4Var.Y1.getAudioVideoButtonContainer(), true);
    }

    @Override
    public final void t1() {
        z50 z50Var = this.f17653a.G2;
        if (z50Var != null) {
            z50Var.q();
        }
    }

    @Override
    public final boolean u1() {
        TLRPC.User user;
        f4 f4Var = this.f17653a;
        if (f4Var.f17130y1 < 0 || (user = MessagesController.getInstance(f4Var.f17135z2).getUser(Long.valueOf(f4Var.f17130y1))) == null || UserObject.isUserSelf(user) || user.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final void u2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
        f4 f4Var = this.f17653a;
        boolean z10 = false;
        if (f4Var.G2 == null && CameraView.isCameraAllowed()) {
            f4Var.G2 = new z50(f4Var.getContext(), new d3(f4Var), f4Var.f17129y0, false);
            f4Var.addView(f4Var.G2, Math.min(f4Var.indexOfChild(f4Var.Y1.getRecordCircle()), f4Var.indexOfChild(f4Var.Y1.K1)), k7.c6.e(-1, -1, 51));
        }
        z50 z50Var = f4Var.G2;
        if (z50Var != null) {
            if (i10 == 0) {
                z50Var.l(false);
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z10 = true;
                    }
                    z50Var.d(z10);
                }
            } else {
                z50Var.k(i10, i11, i12, j10, j11, z4);
            }
        }
    }

    @Override
    public final void w1() {
        this.f17653a.O0();
    }

    @Override
    public final void y1() {
        this.f17653a.requestLayout();
    }

    @Override
    public final void B() {
    }

    @Override
    public final void F2() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void M1() {
    }

    @Override
    public final void P0() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void Y0() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void o0() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void x1() {
    }

    @Override
    public final void x2() {
    }

    @Override
    public final void A(boolean z4) {
    }

    @Override
    public final void C1(CharSequence charSequence) {
    }

    @Override
    public final void Y(boolean z4) {
    }

    @Override
    public final void e1(int i10) {
    }

    @Override
    public final void p2(int i10) {
    }

    @Override
    public final void t2(boolean z4) {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void J0(int i10, int i11) {
    }

    @Override
    public final void z1(View view, CharSequence charSequence, boolean z4) {
    }
}
