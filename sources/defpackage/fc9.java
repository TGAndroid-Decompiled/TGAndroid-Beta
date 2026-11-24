package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class fc9 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        k27 k27Var;
        iy6 iy6Var;
        gc9 gc9Var = (gc9) view;
        lk0 lk0Var = (lk0) c4cVar.H;
        gc9Var.a = lk0Var;
        gc9Var.T = (te9) c4cVar.I;
        gc9Var.N = k96.a0;
        gc9Var.c(lk0Var);
        gc9Var.G.b();
        TLRPC.Document h = gc9Var.h();
        if (gc9Var.V != h) {
            gc9Var.V = h;
            if (h == null) {
                k27Var = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.id = -Long.valueOf(h.id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i = gc9Var.n;
                long e = y6c.h(i).e();
                peer.user_id = e;
                tL_peerUser.user_id = e;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = h;
                tL_message.flags |= 768;
                lk0 lk0Var2 = gc9Var.a;
                if (lk0Var2 != null && (iy6Var = lk0Var2.g) != null && !TextUtils.isEmpty(iy6Var.e)) {
                    tL_message.attachPath = gc9Var.a.g.e;
                }
                k27Var = new k27(i, tL_message, false, true);
            }
            gc9Var.U = k27Var;
        }
        gc9Var.g(h);
        gc9Var.m();
        if (gc9Var.O) {
            gc9Var.n(false);
        }
        gc9Var.requestLayout();
        gc9Var.invalidate();
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        gc9 gc9Var = new gc9(i, wjbVar, context);
        gc9Var.setBackground(new ed9(bkb.v0(bkb.c6, wjbVar)));
        gc9Var.a0 = true;
        return gc9Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
