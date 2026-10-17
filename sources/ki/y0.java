package ki;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class y0 extends e61 {
    public static final int f15651a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        MessageObject messageObject;
        t tVar;
        z0 z0Var = (z0) view;
        a aVar = (a) f61Var.G;
        z0Var.f15105a = aVar;
        z0Var.S = (r3) f61Var.H;
        z0Var.M = LocaleController.isRTL;
        z0Var.c(aVar);
        z0Var.F.b();
        TLRPC.Document i10 = z0Var.i();
        if (z0Var.U != i10) {
            z0Var.U = i10;
            if (i10 == null) {
                messageObject = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f20293id = -Long.valueOf(i10.f20278id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i11 = z0Var.f15668n;
                long clientUserId = UserConfig.getInstance(i11).getClientUserId();
                peer.user_id = clientUserId;
                tL_peerUser.user_id = clientUserId;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = i10;
                tL_message.flags |= 768;
                a aVar2 = z0Var.f15105a;
                if (aVar2 != null && (tVar = aVar2.f15092g) != null && !TextUtils.isEmpty(tVar.e)) {
                    tL_message.attachPath = z0Var.f15105a.f15092g.e;
                }
                messageObject = new MessageObject(i11, tL_message, false, true);
            }
            z0Var.T = messageObject;
        }
        z0Var.h(i10);
        z0Var.k();
        if (z0Var.N) {
            z0Var.l(false);
        }
        z0Var.requestLayout();
        z0Var.invalidate();
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        z0 z0Var = new z0(context, i10, d6Var);
        z0Var.setBackground(new a2(h6.w0(h6.f20986d6, d6Var)));
        return z0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
