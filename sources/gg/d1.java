package gg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.qc;
import org.telegram.ui.xn;
public final class d1 extends hg.e {
    public final e1 f6606r;

    public d1(e1 e1Var, f6 f6Var) {
        super(f6Var);
        this.f6606r = e1Var;
    }

    @Override
    public final void E() {
        String string;
        f6 f6Var;
        e1 e1Var = this.f6606r;
        String str = e1Var.X;
        if ((str == null || str.isEmpty()) && e1Var.U.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        e3 e3Var = e1Var.container;
        f6Var = ((g3) e1Var).resourcesProvider;
        new qc(e3Var, f6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        e1 e1Var = this.f6606r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = e1Var.U;
        org.telegram.ui.ActionBar.p2 p2Var = e1Var.f28678n;
        e1Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            p2Var.presentFragment(xn.R9(-((TLRPC.Chat) tLObject).f19184id));
        } else if (tLObject instanceof TLRPC.User) {
            p2Var.presentFragment(xn.R9(((TLRPC.User) tLObject).f19331id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            p2Var.presentFragment(new xn(bundle));
        }
    }
}
