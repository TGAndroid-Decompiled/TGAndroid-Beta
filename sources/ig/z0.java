package ig;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.h51;
import org.telegram.ui.id0;
public final class z0 implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final int f12320a;
    public final e1 f12321b;

    public z0(e1 e1Var, int i10) {
        this.f12320a = i10;
        this.f12321b = e1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f12320a) {
            case 1:
                this.f12321b.W();
                return;
            case 2:
                this.f12321b.finishFragment();
                return;
            default:
                e1 e1Var = this.f12321b;
                e1Var.f12068b.a(1.0f);
                TLRPC.UserFull userFull = e1Var.getMessagesController().getUserFull(e1Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                e1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new a1(e1Var, 1));
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        e1 e1Var = this.f12321b;
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = h51Var.d;
        if (i10 != 1 && h51Var.f26614c != e1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e1Var.getParentActivity());
                alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(e1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                e1Var.showDialog(alertDialog$Builder.f20225a);
            }
        } else if (e1Var.f12076x != null && h51Var.f26614c != e1Var.h) {
            e1Var.f12076x = null;
            e1Var.f12067a.Y2.N(true);
        } else {
            id0 id0Var = new id0(8);
            if (e1Var.f12076x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = e1Var.f12077y;
                tL_channelLocation.geo_point = e1Var.f12076x;
                id0Var.A0 = tL_channelLocation;
            }
            id0Var.F0 = new ah.i0(16, e1Var, id0Var);
            if (e1Var.f12076x == null && !TextUtils.isEmpty(e1Var.f12077y)) {
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(e1Var.getParentActivity(), 3, null);
                b2Var.f20264g0 = false;
                b2Var.q(200L);
                Utilities.searchQueue.postRunnable(new x0(e1Var, id0Var, b2Var));
                return;
            }
            e1Var.presentFragment(id0Var);
        }
    }
}
