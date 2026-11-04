package mi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class x0 extends q31 {
    public static final int f20017b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        zi ziVar;
        s sVar;
        y0 y0Var = (y0) view;
        a aVar = (a) r31Var.G;
        y0Var.f20029a = aVar;
        y0Var.T = (o3) r31Var.H;
        y0Var.N = bd.f21784a0;
        y0Var.c(aVar);
        y0Var.G.b();
        TLRPC.Document h = y0Var.h();
        if (y0Var.V != h) {
            y0Var.V = h;
            if (h == null) {
                ziVar = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f27022id = -Long.valueOf(h.f27007id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i3 = y0Var.f20036n;
                long e10 = h10.i(i3).e();
                peer.user_id = e10;
                tL_peerUser.user_id = e10;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = h;
                tL_message.flags |= 768;
                a aVar2 = y0Var.f20029a;
                if (aVar2 != null && (sVar = aVar2.f19435g) != null && !TextUtils.isEmpty(sVar.f19862e)) {
                    tL_message.attachPath = y0Var.f20029a.f19435g.f19862e;
                }
                ziVar = new zi(i3, tL_message, false, true);
            }
            y0Var.U = ziVar;
        }
        y0Var.g(h);
        y0Var.l();
        if (y0Var.O) {
            y0Var.m(false);
        }
        y0Var.requestLayout();
        y0Var.invalidate();
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        y0 y0Var = new y0(i3, context, e6Var);
        y0Var.setBackground(new z1(k6.w0(k6.f27878d6, e6Var)));
        y0Var.f20034a0 = true;
        return y0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
