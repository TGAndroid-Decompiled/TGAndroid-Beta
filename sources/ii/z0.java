package ii;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class z0 extends g61 {
    public static final int f12824a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        MessageObject messageObject;
        u uVar;
        a1 a1Var = (a1) view;
        a aVar = (a) h61Var.G;
        a1Var.f12204a = aVar;
        a1Var.S = (s3) h61Var.H;
        a1Var.M = LocaleController.isRTL;
        a1Var.c(aVar);
        a1Var.F.b();
        TLRPC.Document i10 = a1Var.i();
        if (a1Var.U != i10) {
            a1Var.U = i10;
            if (i10 == null) {
                messageObject = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f20068id = -Long.valueOf(i10.f20053id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i11 = a1Var.f12209n;
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
                a aVar2 = a1Var.f12204a;
                if (aVar2 != null && (uVar = aVar2.f12191g) != null && !TextUtils.isEmpty(uVar.f12666e)) {
                    tL_message.attachPath = a1Var.f12204a.f12191g.f12666e;
                }
                messageObject = new MessageObject(i11, tL_message, false, true);
            }
            a1Var.T = messageObject;
        }
        a1Var.h(i10);
        a1Var.k();
        if (a1Var.N) {
            a1Var.l(false);
        }
        a1Var.requestLayout();
        a1Var.invalidate();
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        a1 a1Var = new a1(context, i10, d6Var);
        a1Var.setBackground(new b2(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20827d6, d6Var)));
        return a1Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
