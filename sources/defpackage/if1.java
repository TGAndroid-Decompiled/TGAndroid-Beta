package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class if1 implements rk1 {
    public final kf1 a;

    public if1(kf1 kf1Var) {
        this.a = kf1Var;
    }

    @Override
    public final void C(long j) {
        nf1 nf1Var = this.a.n;
        if (j < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j);
            if (na7.q1(nf1.t0(nf1Var)).A(bundle, nf1Var, null, null)) {
                nf1Var.presentFragment(new mu1(bundle), true);
            }
        } else if (j != y6c.h(nf1.u0(nf1Var)).e()) {
            Bundle k = ls6.k(j, "user_id");
            nf1Var.I0(k, j);
            ProfileActivity profileActivity = new ProfileActivity(k, null);
            profileActivity.x3(0);
            nf1Var.presentFragment(profileActivity);
        }
    }

    @Override
    public final long a() {
        return -this.a.n.f.id;
    }

    @Override
    public final boolean a0(uk1 uk1Var, float f, float f2) {
        nf1 nf1Var = this.a.n;
        int i = nf1.Q0;
        return nf1Var.L0(uk1Var, 0.0f, 0.0f);
    }

    @Override
    public final long d() {
        return 0L;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final void r(uk1 uk1Var) {
        nf1 nf1Var = this.a.n;
        k27 messageObject = uk1Var.getMessageObject();
        if (messageObject.D == 22) {
            nh1 nh1Var = new nh1(a());
            nh1Var.m0 = nf1Var;
            nf1Var.presentFragment(nh1Var);
            return;
        }
        PhotoViewer.r0().S1(null, nf1Var, null);
        TLRPC.PhotoSize w = ba4.w(messageObject.p0, 640, false, null, false);
        if (w != null) {
            PhotoViewer.r0().k1(w.location, gl5.i(w, messageObject.k.action.photo), nf1Var.C0);
            return;
        }
        PhotoViewer.r0().l1(messageObject, null, 0L, 0L, 0L, nf1Var.C0);
    }

    @Override
    public final d v() {
        return this.a.n;
    }

    @Override
    public final void w(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        nf1 nf1Var = this.a.n;
        if (nf1Var.B0) {
            return;
        }
        if (nf1Var.z0.containsKey(tL_chatInviteExported.link)) {
            obj = nf1Var.z0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = nf1Var.getMessagesController().h1(-nf1Var.f.id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            nf1Var.B0 = true;
            final boolean[] zArr = new boolean[1];
            hd hdVar = new hd(3, null, nf1Var.getParentActivity());
            hdVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    if1.this.a.n.B0 = false;
                    zArr[0] = true;
                }
            });
            hdVar.q(300L);
            nf1Var.getConnectionsManager().bindRequestToGuid(nf1Var.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new rt0(this, tL_chatInviteExported, zArr, hdVar, (byte) 2)), nf1.v0(nf1Var));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            nf1Var.d1((TLRPC.TL_messages_exportedChatInvite) obj, nf1Var.A0);
        } else {
            ir2.v(null, 2131748721, u21.b0(nf1Var), 2131624080, 36);
        }
    }

    @Override
    public final void G(uk1 uk1Var) {
    }

    @Override
    public final void R(uk1 uk1Var) {
    }

    @Override
    public final void m(uk1 uk1Var) {
    }

    @Override
    public final void A(uk1 uk1Var, int i) {
    }

    @Override
    public final void n(uk1 uk1Var, String str) {
    }

    @Override
    public final void Z(uk1 uk1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void o(uk1 uk1Var, int i, int i2) {
    }

    @Override
    public final void u(uk1 uk1Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void y(uk1 uk1Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }
}
