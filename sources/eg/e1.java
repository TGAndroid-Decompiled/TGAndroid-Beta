package eg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.tc;
import org.telegram.ui.tn;
public final class e1 extends fg.e {
    public final f1 f5980r;

    public e1(f1 f1Var, c6 c6Var) {
        super(c6Var);
        this.f5980r = f1Var;
    }

    @Override
    public final void E() {
        String string;
        f1 f1Var = this.f5980r;
        String str = f1Var.W;
        if ((str == null || str.isEmpty()) && f1Var.T.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        new tc(f1Var.container, f1.P(f1Var)).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        f1 f1Var = this.f5980r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = f1Var.T;
        org.telegram.ui.ActionBar.o2 o2Var = f1Var.f34662n;
        f1Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            o2Var.presentFragment(tn.R9(-((TLRPC.Chat) tLObject).f22392id));
        } else if (tLObject instanceof TLRPC.User) {
            o2Var.presentFragment(tn.R9(((TLRPC.User) tLObject).f22539id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            o2Var.presentFragment(new tn(bundle));
        }
    }
}
