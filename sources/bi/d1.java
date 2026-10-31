package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class d1 extends z41 {
    public static final int f2917b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        jj jjVar;
        w wVar;
        e1 e1Var = (e1) view;
        a aVar = (a) a51Var.G;
        e1Var.f2881a = aVar;
        e1Var.S = (y3) a51Var.H;
        e1Var.M = cd.X;
        e1Var.c(aVar);
        e1Var.F.b();
        TLRPC.Document j10 = e1Var.j();
        if (e1Var.U != j10) {
            e1Var.U = j10;
            if (j10 == null) {
                jjVar = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f19814id = -Long.valueOf(j10.f19799id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i10 = e1Var.f2973n;
                long e = d20.i(i10).e();
                peer.user_id = e;
                tL_peerUser.user_id = e;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = j10;
                tL_message.flags |= 768;
                a aVar2 = e1Var.f2881a;
                if (aVar2 != null && (wVar = aVar2.f2821g) != null && !TextUtils.isEmpty(wVar.e)) {
                    tL_message.attachPath = e1Var.f2881a.f2821g.e;
                }
                jjVar = new jj(i10, tL_message, false, true);
            }
            e1Var.T = jjVar;
        }
        e1Var.g(j10);
        e1Var.l();
        if (e1Var.N) {
            e1Var.m(false);
        }
        e1Var.requestLayout();
        e1Var.invalidate();
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        e1 e1Var = new e1(i10, context, p6Var);
        e1Var.setBackground(new h2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, p6Var)));
        e1Var.W = true;
        return e1Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
