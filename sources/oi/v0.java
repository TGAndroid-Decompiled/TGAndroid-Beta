package oi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class v0 extends m41 {
    public static final int f22542b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        fj fjVar;
        s sVar;
        w0 w0Var = (w0) view;
        a aVar = (a) n41Var.H;
        w0Var.f22598a = aVar;
        w0Var.T = (o3) n41Var.I;
        w0Var.N = gd.f24314a0;
        w0Var.c(aVar);
        w0Var.G.b();
        TLRPC.Document h = w0Var.h();
        if (w0Var.V != h) {
            w0Var.V = h;
            if (h == null) {
                fjVar = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f28513id = -Long.valueOf(h.f28498id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i7 = w0Var.f22557n;
                long e10 = i10.i(i7).e();
                peer.user_id = e10;
                tL_peerUser.user_id = e10;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = h;
                tL_message.flags |= 768;
                a aVar2 = w0Var.f22598a;
                if (aVar2 != null && (sVar = aVar2.f22005g) != null && !TextUtils.isEmpty(sVar.f22424e)) {
                    tL_message.attachPath = w0Var.f22598a.f22005g.f22424e;
                }
                fjVar = new fj(i7, tL_message, false, true);
            }
            w0Var.U = fjVar;
        }
        w0Var.g(h);
        w0Var.l();
        if (w0Var.O) {
            w0Var.m(false);
        }
        w0Var.requestLayout();
        w0Var.invalidate();
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        w0 w0Var = new w0(i7, context, i6Var);
        w0Var.setBackground(new y1(n6.w0(n6.f29451d6, i6Var)));
        w0Var.f22555a0 = true;
        return w0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
