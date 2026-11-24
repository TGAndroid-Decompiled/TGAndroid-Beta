package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class eh3 extends oj3 {
    public final bj3 c0;
    public final cj3 d0;

    public eh3(cj3 cj3Var, cj3 cj3Var2, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, TLRPC.RequestPeerType requestPeerType, bj3 bj3Var) {
        super(cj3Var2, context, i, i2, z, arrayList, i3, requestPeerType);
        this.d0 = cj3Var;
        this.c0 = bj3Var;
    }

    @Override
    public final void K() {
        this.d0.presentFragment(new cs());
    }

    @Override
    public final void L() {
        int i;
        cj3 cj3Var = this.d0;
        hd hdVar = new hd(3, null, cj3Var.getParentActivity());
        TLRPC.RequestPeerType requestPeerType = cj3Var.H;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle j = ls6.j(0, "step");
            Boolean bool = cj3Var.H.has_username;
            if (bool != null) {
                j.putBoolean("forcePublic", bool.booleanValue());
            }
            yh1 yh1Var = new yh1(j);
            yh1Var.v0 = new p(cj3Var, yh1Var, hdVar, (byte) 8);
            cj3Var.presentFragment(yh1Var);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = cj3Var.H.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{cj3Var.getUserConfig().e()} : new long[]{cj3Var.getUserConfig().e(), cj3Var.I});
            Boolean bool3 = cj3Var.H.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i = 5;
            } else {
                i = 4;
            }
            bundle.putInt("chatType", i);
            bundle.putBoolean("canToggleTopics", false);
            wa5 wa5Var = new wa5(bundle);
            wa5Var.Z = new wh3(cj3Var, hdVar);
            cj3Var.presentFragment(wa5Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i;
        i = ((d) this.d0).currentAccount;
        na7.q1(i).y3(null, user, null, 0, null, false, false);
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
        int i2 = bj3.M;
        try {
            super.f();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        cj3 cj3Var = this.d0;
        if (cj3Var.T0 == 15) {
            r7 r7Var = cj3Var.k0;
            if (this.V) {
                i = 8;
            } else {
                i = 0;
            }
            r7Var.setVisibility(i);
        }
    }

    @Override
    public final void o(ue3 ue3Var) {
        int i;
        if (ue3Var.getMessage() != null) {
            cj3 cj3Var = this.d0;
            i = ((d) cj3Var).currentAccount;
            TLRPC.TL_forumTopic f = cj3Var.getMessagesController().g4.f(-ue3Var.getDialogId(), k27.b2(i, ue3Var.getMessage().k, true, false));
            if (f != null) {
                if (cj3Var.n2) {
                    cj3Var.i3(ue3Var.getDialogId(), f.id, false, null);
                } else {
                    mm4.n(cj3Var, -ue3Var.getDialogId(), f, 0);
                }
            }
        }
    }

    @Override
    public final void w(ue3 ue3Var) {
        bj3 bj3Var = this.c0;
        bj3Var.a.getClass();
        this.d0.z4(ue3Var, RecyclerView.R(ue3Var), 0.0f, bj3Var.d);
    }
}
