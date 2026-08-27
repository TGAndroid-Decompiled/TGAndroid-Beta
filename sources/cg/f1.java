package cg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.mc;
import org.telegram.ui.rn;

public final class f1 extends dg.e {

    public final g1 f2680r;

    public f1(g1 g1Var, c6 c6Var) {
        super(c6Var);
        this.f2680r = g1Var;
    }

    @Override
    public final void E() {
        g1 g1Var = this.f2680r;
        String str = g1Var.W;
        new mc(g1Var.container, ((e3) g1Var).resourcesProvider).Q(R.raw.chats_infotip, 36, ((str == null || str.isEmpty()) && g1Var.T.to_id == -1) ? LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink) : LocaleController.getString(R.string.BoostingOnlyRecipientCode)).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        g1 g1Var = this.f2680r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = g1Var.T;
        org.telegram.ui.ActionBar.n2 n2Var = g1Var.f31855n;
        g1Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            n2Var.presentFragment(rn.R9(-((TLRPC.Chat) tLObject).f22380id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            n2Var.presentFragment(rn.R9(((TLRPC.User) tLObject).f22527id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        n2Var.presentFragment(new rn(bundle));
    }
}
