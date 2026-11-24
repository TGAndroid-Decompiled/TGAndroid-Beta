package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ge9 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        k47 k47Var;
        i07 i07Var;
        he9 he9Var = (he9) view;
        ll0 ll0Var = (ll0) c6cVar.H;
        he9Var.a = ll0Var;
        he9Var.T = (xg9) c6cVar.I;
        he9Var.N = jb6.a0;
        he9Var.c(ll0Var);
        he9Var.G.b();
        TLRPC.Document h = he9Var.h();
        if (he9Var.V != h) {
            he9Var.V = h;
            if (h == null) {
                k47Var = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.id = -Long.valueOf(h.id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i = he9Var.n;
                long e = z8c.h(i).e();
                peer.user_id = e;
                tL_peerUser.user_id = e;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = h;
                tL_message.flags |= 768;
                ll0 ll0Var2 = he9Var.a;
                if (ll0Var2 != null && (i07Var = ll0Var2.g) != null && !TextUtils.isEmpty(i07Var.e)) {
                    tL_message.attachPath = he9Var.a.g.e;
                }
                k47Var = new k47(i, tL_message, false, true);
            }
            he9Var.U = k47Var;
        }
        he9Var.g(h);
        he9Var.m();
        if (he9Var.O) {
            he9Var.n(false);
        }
        he9Var.requestLayout();
        he9Var.invalidate();
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        he9 he9Var = new he9(i, ylbVar, context);
        he9Var.setBackground(new gf9(cmb.v0(cmb.c6, ylbVar)));
        he9Var.a0 = true;
        return he9Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
