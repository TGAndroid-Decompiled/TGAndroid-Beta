package oi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class u0 extends a41 {
    public static final int f22024b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        gj gjVar;
        r rVar;
        v0 v0Var = (v0) view;
        a aVar = (a) b41Var.G;
        v0Var.f22106a = aVar;
        v0Var.T = (l3) b41Var.H;
        v0Var.N = hd.f24101a0;
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
                tL_message.f28072id = -Long.valueOf(h.f28057id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i7 = v0Var.f22040n;
                long e10 = m10.i(i7).e();
                peer.user_id = e10;
                tL_peerUser.user_id = e10;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = h;
                tL_message.flags |= 768;
                a aVar2 = v0Var.f22106a;
                if (aVar2 != null && (rVar = aVar2.f21548g) != null && !TextUtils.isEmpty(rVar.f21960e)) {
                    tL_message.attachPath = v0Var.f22106a.f21548g.f21960e;
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
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        v0 v0Var = new v0(i7, context, e6Var);
        v0Var.setBackground(new w1(j6.w0(j6.f28849d6, e6Var)));
        v0Var.f22038a0 = true;
        return v0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
