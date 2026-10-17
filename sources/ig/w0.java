package ig;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f61;
import org.telegram.ui.pc0;
public final class w0 implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final int f13071a;
    public final b1 f13072b;

    public w0(b1 b1Var, int i10) {
        this.f13071a = i10;
        this.f13072b = b1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f13071a) {
            case 1:
                this.f13072b.W();
                return;
            case 2:
                this.f13072b.finishFragment();
                return;
            default:
                b1 b1Var = this.f13072b;
                b1Var.f12834b.a(1.0f);
                TLRPC.UserFull userFull = b1Var.getMessagesController().getUserFull(b1Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                b1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new x0(b1Var, 1));
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b1 b1Var = this.f13072b;
        f61 f61Var = (f61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = f61Var.d;
        if (i10 != 1 && f61Var.f26134c != b1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b1Var.getParentActivity());
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new w0(b1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                b1Var.showDialog(alertDialog$Builder.f20601a);
            }
        } else if (b1Var.f12841x != null && f61Var.f26134c != b1Var.h) {
            b1Var.f12841x = null;
            b1Var.f12833a.W2.N(true);
        } else {
            pc0 pc0Var = new pc0(8);
            if (b1Var.f12841x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = b1Var.f12842y;
                tL_channelLocation.geo_point = b1Var.f12841x;
                pc0Var.A0 = tL_channelLocation;
            }
            pc0Var.F0 = new ah.h0(17, b1Var, pc0Var);
            if (b1Var.f12841x == null && !TextUtils.isEmpty(b1Var.f12842y)) {
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(b1Var.getParentActivity(), 3, null);
                b2Var.f20661g0 = false;
                b2Var.q(200L);
                Utilities.searchQueue.postRunnable(new u0(b1Var, pc0Var, b2Var));
                return;
            }
            b1Var.presentFragment(pc0Var);
        }
    }
}
