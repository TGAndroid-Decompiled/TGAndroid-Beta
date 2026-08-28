package bg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;
public final class k1 extends cg.e {
    public final l1 f1859r;

    public k1(l1 l1Var, b6 b6Var) {
        super(b6Var);
        this.f1859r = l1Var;
    }

    @Override
    public final void E() {
        String string;
        b6 b6Var;
        l1 l1Var = this.f1859r;
        String str = l1Var.W;
        if ((str == null || str.isEmpty()) && l1Var.T.to_id == -1) {
            string = LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink);
        } else {
            string = LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        }
        org.telegram.ui.ActionBar.d3 d3Var = l1Var.container;
        b6Var = ((org.telegram.ui.ActionBar.f3) l1Var).resourcesProvider;
        new oc(d3Var, b6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override
    public final void F(TLObject tLObject) {
        l1 l1Var = this.f1859r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = l1Var.T;
        org.telegram.ui.ActionBar.o2 o2Var = l1Var.f32410n;
        l1Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            o2Var.presentFragment(qn.R9(-((TLRPC.Chat) tLObject).f22380id));
        } else if (tLObject instanceof TLRPC.User) {
            o2Var.presentFragment(qn.R9(((TLRPC.User) tLObject).f22527id));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
            bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
            o2Var.presentFragment(new qn(bundle));
        }
    }
}
