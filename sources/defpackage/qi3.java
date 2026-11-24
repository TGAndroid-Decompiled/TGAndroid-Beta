package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class qi3 extends zk3 {
    public final mk3 c0;
    public final nk3 d0;

    public qi3(nk3 nk3Var, nk3 nk3Var2, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, TLRPC.RequestPeerType requestPeerType, mk3 mk3Var) {
        super(nk3Var2, context, i, i2, z, arrayList, i3, requestPeerType);
        this.d0 = nk3Var;
        this.c0 = mk3Var;
    }

    @Override
    public final void K() {
        this.d0.presentFragment(new ct());
    }

    @Override
    public final void L() {
        int i;
        nk3 nk3Var = this.d0;
        he heVar = new he(3, null, nk3Var.getParentActivity());
        TLRPC.RequestPeerType requestPeerType = nk3Var.H;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle j = kt6.j(0, "step");
            Boolean bool = nk3Var.H.has_username;
            if (bool != null) {
                j.putBoolean("forcePublic", bool.booleanValue());
            }
            fj1 fj1Var = new fj1(j);
            fj1Var.v0 = new p(nk3Var, fj1Var, heVar, (byte) 8);
            nk3Var.presentFragment(fj1Var);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = nk3Var.H.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{nk3Var.getUserConfig().e()} : new long[]{nk3Var.getUserConfig().e(), nk3Var.I});
            Boolean bool3 = nk3Var.H.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i = 5;
            } else {
                i = 4;
            }
            bundle.putInt("chatType", i);
            bundle.putBoolean("canToggleTopics", false);
            uc5 uc5Var = new uc5(bundle);
            uc5Var.Z = new ij3(nk3Var, heVar);
            nk3Var.presentFragment(uc5Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i;
        i = ((d) this.d0).currentAccount;
        oc7.r1(i).B3(null, user, null, 0, null, false, false);
    }

    @Override
    public final boolean O() {
        if (this.d0.T0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        int i;
        b();
        int i2 = mk3.M;
        try {
            super.f();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        nk3 nk3Var = this.d0;
        if (nk3Var.T0 == 15) {
            r7 r7Var = nk3Var.k0;
            if (this.V) {
                i = 8;
            } else {
                i = 0;
            }
            r7Var.setVisibility(i);
        }
    }

    @Override
    public final void o(hg3 hg3Var) {
        int i;
        if (hg3Var.getMessage() != null) {
            nk3 nk3Var = this.d0;
            i = ((d) nk3Var).currentAccount;
            TLRPC.TL_forumTopic f = nk3Var.getMessagesController().g4.f(-hg3Var.getDialogId(), k47.b2(i, hg3Var.getMessage().k, true, false));
            if (f != null) {
                if (nk3Var.n2) {
                    nk3Var.k3(hg3Var.getDialogId(), f.id, false, null);
                } else {
                    no4.n(nk3Var, -hg3Var.getDialogId(), f, 0);
                }
            }
        }
    }

    @Override
    public final void v(hg3 hg3Var) {
        mk3 mk3Var = this.c0;
        mk3Var.a.getClass();
        this.d0.D4(hg3Var, RecyclerView.R(hg3Var), 0.0f, mk3Var.d);
    }
}
