package li;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class w0 extends w31 {
    public static final int f18950b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        ij ijVar;
        s sVar;
        x0 x0Var = (x0) view;
        a aVar = (a) x31Var.G;
        x0Var.f18989a = aVar;
        x0Var.S = (o3) x31Var.H;
        x0Var.M = id.f23157a0;
        x0Var.c(aVar);
        x0Var.F.b();
        TLRPC.Document h = x0Var.h();
        if (x0Var.U != h) {
            x0Var.U = h;
            if (h == null) {
                ijVar = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f26977id = -Long.valueOf(h.f26962id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i7 = x0Var.f18970n;
                long e10 = p10.i(i7).e();
                peer.user_id = e10;
                tL_peerUser.user_id = e10;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = h;
                tL_message.flags |= 768;
                a aVar2 = x0Var.f18989a;
                if (aVar2 != null && (sVar = aVar2.f18396g) != null && !TextUtils.isEmpty(sVar.f18817e)) {
                    tL_message.attachPath = x0Var.f18989a.f18396g.f18817e;
                }
                ijVar = new ij(i7, tL_message, false, true);
            }
            x0Var.T = ijVar;
        }
        x0Var.g(h);
        x0Var.l();
        if (x0Var.N) {
            x0Var.m(false);
        }
        x0Var.requestLayout();
        x0Var.invalidate();
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        x0 x0Var = new x0(i7, context, f6Var);
        x0Var.setBackground(new y1(k6.w0(k6.f27852d6, f6Var)));
        x0Var.W = true;
        return x0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
