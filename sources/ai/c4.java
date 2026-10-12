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
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.w60;
import org.telegram.ui.tn;
public final class c4 implements sg {
    public final f6 f753a;

    public c4(f6 f6Var) {
        this.f753a = f6Var;
    }

    @Override
    public final boolean D1() {
        return false;
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        boolean z11;
        f6 f6Var = this.f753a;
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
    public final boolean H0() {
        return true;
    }

    @Override
    public final void H2() {
        this.f753a.P0();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        d2 d2Var;
        boolean z10;
        f6 f6Var = this.f753a;
        if (f6Var.O1.f824f) {
            kc kcVar = f6Var.J0;
            if (kcVar != null && (d2Var = kcVar.A0) != null) {
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
        w60 w60Var = this.f753a.J2;
        if (w60Var != null) {
            w60Var.b(f7, i10);
        }
    }

    @Override
    public final int h1() {
        return this.f753a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem j1() {
        return this.f753a.O1.f820a;
    }

    @Override
    public final boolean l1(long j3) {
        boolean z10;
        f6 f6Var = this.f753a;
        d6 d6Var = f6Var.O1;
        TL_stories.StoryItem storyItem = d6Var.f820a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) d6Var.f820a.media).call;
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
            f6Var.f950b2.S1(true);
            f6Var.f950b2.L(true);
            f6Var.f1(false);
        }
        return true;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final boolean o1() {
        w60 w60Var = this.f753a.J2;
        if (w60Var != null && !w60Var.f32292j0) {
            return true;
        }
        return false;
    }

    @Override
    public final void o2() {
        String str;
        int i10;
        f6 f6Var = this.f753a;
        if (f6Var.E1) {
            f6.h0(f6Var);
            return;
        }
        if (f6Var.W2 == null) {
            c50 c50Var = new c50(9, f6Var.getContext(), f6Var.B0, false);
            f6Var.W2 = c50Var;
            c50Var.setVisibility(8);
            f6Var.addView(f6Var.W2, w7.w5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
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
        c50 c50Var2 = f6Var.W2;
        if (f6Var.f950b2.f23632c1) {
            i10 = R.string.VideoMessagesRestrictedByPrivacy;
        } else {
            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
        }
        c50Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, str)));
        f6Var.W2.f(f6Var.f950b2.getAudioVideoButtonContainer(), true);
    }

    @Override
    public final void q2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        f6 f6Var = this.f753a;
        boolean z11 = false;
        if (f6Var.J2 == null && CameraView.isCameraAllowed()) {
            f6Var.J2 = new w60(f6Var.getContext(), new s4(f6Var), f6Var.B0, false);
            f6Var.addView(f6Var.J2, Math.min(f6Var.indexOfChild(f6Var.f950b2.getRecordCircle()), f6Var.indexOfChild(f6Var.f950b2.O1)), w7.w5.e(-1, -1, 51));
        }
        w60 w60Var = f6Var.J2;
        if (w60Var != null) {
            if (i10 == 0) {
                w60Var.h(false);
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z11 = true;
                    }
                    w60Var.a(z11);
                }
            } else {
                w60Var.f(i10, i11, i12, j3, j10, z10);
            }
        }
    }

    @Override
    public final void r1(CharSequence charSequence, boolean z10, boolean z11) {
        f6 f6Var = this.f753a;
        if (f6Var.f959d3 == null) {
            d4 d4Var = new d4(f6Var, f6Var.getContext(), f6Var.B1, f6Var.J0.f1265f, f6Var.B0);
            f6Var.f959d3 = d4Var;
            d4Var.p(new g4(f6Var));
            f6Var.addView(f6Var.f959d3, w7.w5.e(-1, -1, 83));
        }
        if (f6Var.f959d3.getAdapter() != null) {
            f6Var.f959d3.setDialogId(f6Var.B1);
            if (f6Var.O1.f824f) {
                gg.j1 adapter = f6Var.f959d3.getAdapter();
                if (adapter.f10676j0 == 0 && adapter.f10689u0 == 0 && adapter.f10688t0 == 0 && adapter.E0 == 0) {
                    adapter.f10692w0 = null;
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
                    ArrayList arrayList3 = adapter.f10693x;
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
                gg.j1 adapter2 = f6Var.f959d3.getAdapter();
                MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(f6Var.C2).getChat(Long.valueOf(-f6Var.B1));
                adapter2.getClass();
                adapter2.f10678l0 = chat;
                f6Var.f959d3.getAdapter().U(charSequence, f6Var.f950b2.getCursorPosition(), null, false, false);
            }
        }
        f6Var.invalidate();
    }

    @Override
    public final tn t0() {
        return null;
    }

    @Override
    public final void t1() {
        w60 w60Var = this.f753a.J2;
        if (w60Var != null) {
            w60Var.i();
        }
    }

    @Override
    public final boolean u1() {
        TLRPC.User user;
        f6 f6Var = this.f753a;
        if (f6Var.B1 < 0 || (user = MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final int v() {
        return 0;
    }

    @Override
    public final void w1() {
        this.f753a.O0();
    }

    @Override
    public final TLRPC.Peer x() {
        d2 d2Var;
        boolean z10;
        kc kcVar = this.f753a.J0;
        if (kcVar != null && (d2Var = kcVar.A0) != null) {
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
    public final void y1() {
        this.f753a.requestLayout();
    }

    @Override
    public final void D2() {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void L1() {
    }

    @Override
    public final void M0() {
    }

    @Override
    public final void O0() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void Y0() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void j2() {
    }

    @Override
    public final void l() {
    }

    @Override
    public final void p0() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void x1() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void C1(CharSequence charSequence) {
    }

    @Override
    public final void Z(boolean z10) {
    }

    @Override
    public final void g1(int i10) {
    }

    @Override
    public final void l2(int i10) {
    }

    @Override
    public final void p2(boolean z10) {
    }

    @Override
    public final void z(float f7) {
    }

    @Override
    public final void J0(int i10, int i11) {
    }

    @Override
    public final void z1(View view, CharSequence charSequence, boolean z10) {
    }
}
