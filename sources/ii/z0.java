package ii;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class z0 extends p61 {
    public static final int f12870a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        MessageObject messageObject;
        u uVar;
        a1 a1Var = (a1) view;
        a aVar = (a) q61Var.G;
        a1Var.f12251a = aVar;
        a1Var.S = (s3) q61Var.H;
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
                tL_message.f20063id = -Long.valueOf(i10.f20048id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i11 = a1Var.f12256n;
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
                a aVar2 = a1Var.f12251a;
                if (aVar2 != null && (uVar = aVar2.f12238g) != null && !TextUtils.isEmpty(uVar.f12713e)) {
                    tL_message.attachPath = a1Var.f12251a.f12238g.f12713e;
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
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        a1 a1Var = new a1(context, i10, e6Var);
        a1Var.setBackground(new b2(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, e6Var)));
        return a1Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
