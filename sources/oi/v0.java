package oi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class v0 extends n41 {
    public static final int f22472b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        fj fjVar;
        r rVar;
        w0 w0Var = (w0) view;
        a aVar = (a) o41Var.H;
        w0Var.f22528a = aVar;
        w0Var.T = (o3) o41Var.I;
        w0Var.N = gd.f24241a0;
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
                tL_message.f28452id = -Long.valueOf(h.f28437id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i7 = w0Var.f22487n;
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
                a aVar2 = w0Var.f22528a;
                if (aVar2 != null && (rVar = aVar2.f21936g) != null && !TextUtils.isEmpty(rVar.f22344e)) {
                    tL_message.attachPath = w0Var.f22528a.f21936g.f22344e;
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
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        w0 w0Var = new w0(i7, context, h6Var);
        w0Var.setBackground(new y1(m6.w0(m6.f29378d6, h6Var)));
        w0Var.f22485a0 = true;
        return w0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
