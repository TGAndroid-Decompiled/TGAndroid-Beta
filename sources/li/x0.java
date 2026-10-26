package li;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class x0 extends s61 {
    public static final int f17610a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        MessageObject messageObject;
        t tVar;
        y0 y0Var = (y0) view;
        a aVar = (a) t61Var.G;
        y0Var.f17653a = aVar;
        y0Var.S = (q3) t61Var.H;
        y0Var.M = LocaleController.isRTL;
        y0Var.c(aVar);
        y0Var.F.b();
        TLRPC.Document h = y0Var.h();
        if (y0Var.U != h) {
            y0Var.U = h;
            if (h == null) {
                messageObject = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f22048id = -Long.valueOf(h.f22033id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i10 = y0Var.f17635n;
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
                a aVar2 = y0Var.f17653a;
                if (aVar2 != null && (tVar = aVar2.f17057g) != null && !TextUtils.isEmpty(tVar.e)) {
                    tL_message.attachPath = y0Var.f17653a.f17057g.e;
                }
                messageObject = new MessageObject(i10, tL_message, false, true);
            }
            y0Var.T = messageObject;
        }
        y0Var.g(h);
        y0Var.j();
        if (y0Var.N) {
            y0Var.k(false);
        }
        y0Var.requestLayout();
        y0Var.invalidate();
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        y0 y0Var = new y0(context, i10, u6Var);
        y0Var.setBackground(new y1(y6.w0(y6.f23356d6, u6Var)));
        y0Var.W = true;
        return y0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
