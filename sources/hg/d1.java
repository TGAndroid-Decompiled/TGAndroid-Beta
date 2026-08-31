package hg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.xn;
public final class d1 extends ig.e {
    public final e1 f7448r;

    public d1(e1 e1Var, g6 g6Var) {
        super(g6Var);
        this.f7448r = e1Var;
    }

    @Override
    public final void E() {
        String string;
        e1 e1Var = this.f7448r;
        String str = e1Var.X;
        if ((str == null || str.isEmpty()) && e1Var.U.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        new qc(e1Var.container, e1.P(e1Var)).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        e1 e1Var = this.f7448r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = e1Var.U;
        org.telegram.ui.ActionBar.p2 p2Var = e1Var.f31017n;
        e1Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            p2Var.presentFragment(xn.R9(-((TLRPC.Chat) tLObject).f20843id));
        } else if (tLObject instanceof TLRPC.User) {
            p2Var.presentFragment(xn.R9(((TLRPC.User) tLObject).f20990id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            p2Var.presentFragment(new xn(bundle));
        }
    }
}
