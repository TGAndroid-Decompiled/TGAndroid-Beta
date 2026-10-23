package ki;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class y0 extends l61 {
    public static final int f15718a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        MessageObject messageObject;
        t tVar;
        z0 z0Var = (z0) view;
        a aVar = (a) m61Var.G;
        z0Var.f15157a = aVar;
        z0Var.S = (r3) m61Var.H;
        z0Var.M = LocaleController.isRTL;
        z0Var.c(aVar);
        z0Var.F.b();
        TLRPC.Document h = z0Var.h();
        if (z0Var.U != h) {
            z0Var.U = h;
            if (h == null) {
                messageObject = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f20364id = -Long.valueOf(h.f20349id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i10 = z0Var.f15737n;
                long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                peer.user_id = clientUserId;
                tL_peerUser.user_id = clientUserId;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = h;
                tL_message.flags |= 768;
                a aVar2 = z0Var.f15157a;
                if (aVar2 != null && (tVar = aVar2.f15144g) != null && !TextUtils.isEmpty(tVar.e)) {
                    tL_message.attachPath = z0Var.f15157a.f15144g.e;
                }
                messageObject = new MessageObject(i10, tL_message, false, true);
            }
            z0Var.T = messageObject;
        }
        z0Var.g(h);
        z0Var.j();
        if (z0Var.N) {
            z0Var.k(false);
        }
        z0Var.requestLayout();
        z0Var.invalidate();
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        z0 z0Var = new z0(context, i10, g6Var);
        z0Var.setBackground(new a2(k6.w0(k6.f21183d6, g6Var)));
        z0Var.W = true;
        return z0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
