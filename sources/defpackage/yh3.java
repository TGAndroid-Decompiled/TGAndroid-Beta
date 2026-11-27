package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class yh3 extends gk3 {
    public final tj3 c0;
    public final uj3 d0;

    public yh3(uj3 uj3Var, uj3 uj3Var2, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, TLRPC.RequestPeerType requestPeerType, tj3 tj3Var) {
        super(uj3Var2, context, i, i2, z, arrayList, i3, requestPeerType);
        this.d0 = uj3Var;
        this.c0 = tj3Var;
    }

    @Override
    public final void K() {
        this.d0.presentFragment(new ds());
    }

    @Override
    public final void L() {
        int i;
        uj3 uj3Var = this.d0;
        id idVar = new id(3, null, uj3Var.getParentActivity());
        TLRPC.RequestPeerType requestPeerType = uj3Var.H;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle j = qu6.j(0, "step");
            Boolean bool = uj3Var.H.has_username;
            if (bool != null) {
                j.putBoolean("forcePublic", bool.booleanValue());
            }
            gi1 gi1Var = new gi1(j);
            gi1Var.v0 = new p(uj3Var, gi1Var, idVar, (byte) 8);
            uj3Var.presentFragment(gi1Var);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = uj3Var.H.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{uj3Var.getUserConfig().e()} : new long[]{uj3Var.getUserConfig().e(), uj3Var.I});
            Boolean bool3 = uj3Var.H.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i = 5;
            } else {
                i = 4;
            }
            bundle.putInt("chatType", i);
            bundle.putBoolean("canToggleTopics", false);
            xc5 xc5Var = new xc5(bundle);
            xc5Var.Z = new qi3(uj3Var, idVar);
            uj3Var.presentFragment(xc5Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i;
        i = ((e) this.d0).currentAccount;
        uc7.s1(i).G3(null, user, null, 0, null, false, false);
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
        int i2 = tj3.M;
        try {
            super.f();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        uj3 uj3Var = this.d0;
        if (uj3Var.T0 == 15) {
            s7 s7Var = uj3Var.k0;
            if (this.V) {
                i = 8;
            } else {
                i = 0;
            }
            s7Var.setVisibility(i);
        }
    }

    @Override
    public final void o(of3 of3Var) {
        int i;
        if (of3Var.getMessage() != null) {
            uj3 uj3Var = this.d0;
            i = ((e) uj3Var).currentAccount;
            TLRPC.TL_forumTopic f = uj3Var.getMessagesController().g4.f(-of3Var.getDialogId(), r47.b2(i, of3Var.getMessage().k, true, false));
            if (f != null) {
                if (uj3Var.n2) {
                    uj3Var.k3(of3Var.getDialogId(), f.id, false, null);
                } else {
                    ro4.n(uj3Var, -of3Var.getDialogId(), f, 0);
                }
            }
        }
    }

    @Override
    public final void w(of3 of3Var) {
        tj3 tj3Var = this.c0;
        tj3Var.a.getClass();
        this.d0.D4(of3Var, RecyclerView.S(of3Var), 0.0f, tj3Var.d);
    }
}
