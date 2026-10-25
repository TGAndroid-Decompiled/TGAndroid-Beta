package di;

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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.t40;
import org.telegram.ui.kn;
public final class v2 implements og {
    public final q4 f9250a;

    public v2(q4 q4Var) {
        this.f9250a = q4Var;
    }

    @Override
    public final void A(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        boolean z11;
        q4 q4Var = this.f9250a;
        if (q4Var.f9037v2) {
            AndroidUtilities.runOnUIThread(new bi.r3(this, j10, 3), 200L);
            return;
        }
        if (j10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        q4Var.i0(z11);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers B() {
        h1 h1Var;
        boolean z10;
        q4 q4Var = this.f9250a;
        if (q4Var.D1.f8874f) {
            y9 y9Var = q4Var.f9047y0;
            if (y9Var != null && (h1Var = y9Var.A0) != null) {
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
            return q4Var.D3;
        }
        return null;
    }

    @Override
    public final void G(float f7, int i10) {
        o60 o60Var = this.f9250a.f9049y2;
        if (o60Var != null) {
            o60Var.b(f7, i10);
        }
    }

    @Override
    public final int N0() {
        return this.f9250a.getHeight();
    }

    @Override
    public final void N1() {
        String str;
        int i10;
        q4 q4Var = this.f9250a;
        if (q4Var.f9028t1) {
            q4.f0(q4Var);
            return;
        }
        if (q4Var.L2 == null) {
            t40 t40Var = new t40(9, q4Var.getContext(), q4Var.f9015q0, false);
            q4Var.L2 = t40Var;
            t40Var.setVisibility(8);
            q4Var.addView(q4Var.L2, gb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (q4Var.f9016q1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(q4Var.f9021r2).getUser(Long.valueOf(q4Var.f9016q1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(q4Var.f9021r2).getChat(Long.valueOf(-q4Var.f9016q1));
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
        }
        t40 t40Var2 = q4Var.L2;
        if (q4Var.Q1.f25857c1) {
            i10 = R.string.VideoMessagesRestrictedByPrivacy;
        } else {
            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
        }
        t40Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, str)));
        q4Var.L2.f(q4Var.Q1.getAudioVideoButtonContainer(), true);
    }

    @Override
    public final TL_stories.StoryItem P0() {
        return this.f9250a.D1.f8871a;
    }

    @Override
    public final void P1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        q4 q4Var = this.f9250a;
        boolean z11 = false;
        if (q4Var.f9049y2 == null && CameraView.isCameraAllowed()) {
            q4Var.f9049y2 = new o60(q4Var.getContext(), new j3(q4Var), q4Var.f9015q0, false);
            q4Var.addView(q4Var.f9049y2, Math.min(q4Var.indexOfChild(q4Var.Q1.getRecordCircle()), q4Var.indexOfChild(q4Var.Q1.O1)), gb1.i(-1, -1, 51));
        }
        o60 o60Var = q4Var.f9049y2;
        if (o60Var != null) {
            if (i10 == 0) {
                o60Var.h(false);
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z11 = true;
                    }
                    o60Var.a(z11);
                }
            } else {
                o60Var.f(i10, i11, i12, j10, j11, z10);
            }
        }
    }

    @Override
    public final boolean R0(long j10) {
        boolean z10;
        q4 q4Var = this.f9250a;
        o4 o4Var = q4Var.D1;
        TL_stories.StoryItem storyItem = o4Var.f8871a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) o4Var.f8871a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(q4Var.f9021r2).getInputPeer(j10);
            ConnectionsManager.getInstance(q4Var.f9021r2).sendRequest(savedefaultsendas, null);
            h1 h1Var = q4Var.f9047y0.A0;
            if (h1Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(q4Var.f9021r2).getPeer(j10);
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
            q4Var.p0(true);
            q4Var.Q1.M1(true);
            q4Var.Q1.G(true);
            q4Var.d1(false);
        }
        return true;
    }

    @Override
    public final boolean T0() {
        o60 o60Var = this.f9250a.f9049y2;
        if (o60Var != null && !o60Var.f31185j0) {
            return true;
        }
        return false;
    }

    @Override
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
        q4 q4Var = this.f9250a;
        if (q4Var.S2 == null) {
            w2 w2Var = new w2(q4Var, q4Var.getContext(), q4Var.f9016q1, q4Var.f9047y0.f9429f, q4Var.f9015q0);
            q4Var.S2 = w2Var;
            w2Var.p(new z2(q4Var));
            q4Var.addView(q4Var.S2, gb1.i(-1, -1, 83));
        }
        if (q4Var.S2.getAdapter() != null) {
            q4Var.S2.setDialogId(q4Var.f9016q1);
            if (q4Var.D1.f8874f) {
                ig.j1 adapter = q4Var.S2.getAdapter();
                if (adapter.f14121j0 == 0 && adapter.f14134u0 == 0 && adapter.f14133t0 == 0 && adapter.E0 == 0) {
                    adapter.f14137w0 = null;
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
                    ArrayList arrayList3 = adapter.f14138x;
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
                ig.j1 adapter2 = q4Var.S2.getAdapter();
                MessagesController.getInstance(q4Var.f9021r2).getUser(Long.valueOf(q4Var.f9016q1));
                TLRPC.Chat chat = MessagesController.getInstance(q4Var.f9021r2).getChat(Long.valueOf(-q4Var.f9016q1));
                adapter2.getClass();
                adapter2.f14123l0 = chat;
                q4Var.S2.getAdapter().U(charSequence, q4Var.Q1.getCursorPosition(), null, false, false);
            }
        }
        q4Var.invalidate();
    }

    @Override
    public final void X0() {
        o60 o60Var = this.f9250a.f9049y2;
        if (o60Var != null) {
            o60Var.i();
        }
    }

    @Override
    public final boolean Y0() {
        TLRPC.User user;
        q4 q4Var = this.f9250a;
        if (q4Var.f9016q1 < 0 || (user = MessagesController.getInstance(q4Var.f9021r2).getUser(Long.valueOf(q4Var.f9016q1))) == null || UserObject.isUserSelf(user) || user.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final void a1() {
        this.f9250a.M0();
    }

    @Override
    public final void c1() {
        this.f9250a.requestLayout();
    }

    @Override
    public final void c2() {
        this.f9250a.N0();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final int g() {
        return 0;
    }

    @Override
    public final boolean h1() {
        return false;
    }

    @Override
    public final kn i0() {
        return null;
    }

    @Override
    public final TLRPC.Peer k() {
        h1 h1Var;
        boolean z10;
        y9 y9Var = this.f9250a.f9047y0;
        if (y9Var != null && (h1Var = y9Var.A0) != null) {
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
    public final boolean p0() {
        return true;
    }

    @Override
    public final void L1(int i10) {
    }

    @Override
    public final void M0(int i10) {
    }

    @Override
    public final void O1(boolean z10) {
    }

    @Override
    public final void R(boolean z10) {
    }

    @Override
    public final void g1(CharSequence charSequence) {
    }

    @Override
    public final void t(float f7) {
    }

    @Override
    public final void w(boolean z10) {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void J1() {
    }

    @Override
    public final void T1() {
    }

    @Override
    public final void U() {
    }

    @Override
    public final void Y1() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void b1() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void l0() {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void x0() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void v0(int i10, int i11) {
    }

    @Override
    public final void e1(View view, CharSequence charSequence, boolean z10) {
    }
}
