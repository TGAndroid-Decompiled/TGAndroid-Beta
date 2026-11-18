package oi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class u0 extends k41 {
    public static final int f22383b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        fj fjVar;
        r rVar;
        v0 v0Var = (v0) view;
        a aVar = (a) l41Var.H;
        v0Var.f22439a = aVar;
        v0Var.T = (n3) l41Var.I;
        v0Var.N = gd.f24213a0;
        v0Var.c(aVar);
        v0Var.G.b();
        TLRPC.Document h = v0Var.h();
        if (v0Var.V != h) {
            v0Var.V = h;
            if (h == null) {
                fjVar = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f28424id = -Long.valueOf(h.f28409id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i7 = v0Var.f22397n;
                long e10 = j10.i(i7).e();
                peer.user_id = e10;
                tL_peerUser.user_id = e10;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = h;
                tL_message.flags |= 768;
                a aVar2 = v0Var.f22439a;
                if (aVar2 != null && (rVar = aVar2.f21911g) != null && !TextUtils.isEmpty(rVar.f22261e)) {
                    tL_message.attachPath = v0Var.f22439a.f21911g.f22261e;
                }
                fjVar = new fj(i7, tL_message, false, true);
            }
            v0Var.U = fjVar;
        }
        v0Var.g(h);
        v0Var.l();
        if (v0Var.O) {
            v0Var.m(false);
        }
        v0Var.requestLayout();
        v0Var.invalidate();
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        v0 v0Var = new v0(i7, context, i6Var);
        v0Var.setBackground(new w1(n6.w0(n6.f29394d6, i6Var)));
        v0Var.f22395a0 = true;
        return v0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
