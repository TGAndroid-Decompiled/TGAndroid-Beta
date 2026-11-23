package oi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class u0 extends n41 {
    public static final int f22412b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        gj gjVar;
        r rVar;
        v0 v0Var = (v0) view;
        a aVar = (a) o41Var.H;
        v0Var.f22468a = aVar;
        v0Var.T = (n3) o41Var.I;
        v0Var.N = hd.f24408a0;
        v0Var.c(aVar);
        v0Var.G.b();
        TLRPC.Document h = v0Var.h();
        if (v0Var.V != h) {
            v0Var.V = h;
            if (h == null) {
                gjVar = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f28419id = -Long.valueOf(h.f28404id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i7 = v0Var.f22427n;
                long e10 = k10.i(i7).e();
                peer.user_id = e10;
                tL_peerUser.user_id = e10;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = h;
                tL_message.flags |= 768;
                a aVar2 = v0Var.f22468a;
                if (aVar2 != null && (rVar = aVar2.f21905g) != null && !TextUtils.isEmpty(rVar.f22292e)) {
                    tL_message.attachPath = v0Var.f22468a.f21905g.f22292e;
                }
                gjVar = new gj(i7, tL_message, false, true);
            }
            v0Var.U = gjVar;
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
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        v0 v0Var = new v0(i7, context, h6Var);
        v0Var.setBackground(new x1(m6.w0(m6.f29347d6, h6Var)));
        v0Var.f22425a0 = true;
        return v0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
