package ig;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.g61;
import org.telegram.ui.nc0;
public final class y0 implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final int f13091a;
    public final d1 f13092b;

    public y0(d1 d1Var, int i10) {
        this.f13091a = i10;
        this.f13092b = d1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f13091a) {
            case 1:
                this.f13092b.W();
                return;
            case 2:
                this.f13092b.finishFragment();
                return;
            default:
                d1 d1Var = this.f13092b;
                d1Var.f12853b.a(1.0f);
                TLRPC.UserFull userFull = d1Var.getMessagesController().getUserFull(d1Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                d1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new z0(d1Var, 1));
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        d1 d1Var = this.f13092b;
        g61 g61Var = (g61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = g61Var.d;
        if (i10 != 1 && g61Var.f26491c != d1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d1Var.getParentActivity());
                alertDialog$Builder.f20602a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f20602a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(d1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                d1Var.showDialog(alertDialog$Builder.f20602a);
            }
        } else if (d1Var.f12860x != null && g61Var.f26491c != d1Var.h) {
            d1Var.f12860x = null;
            d1Var.f12852a.W2.N(true);
        } else {
            nc0 nc0Var = new nc0(8);
            if (d1Var.f12860x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = d1Var.f12861y;
                tL_channelLocation.geo_point = d1Var.f12860x;
                nc0Var.A0 = tL_channelLocation;
            }
            nc0Var.F0 = new ah.h0(18, d1Var, nc0Var);
            if (d1Var.f12860x == null && !TextUtils.isEmpty(d1Var.f12861y)) {
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(d1Var.getParentActivity(), 3, null);
                b2Var.f20662g0 = false;
                b2Var.r(200L);
                Utilities.searchQueue.postRunnable(new w0(d1Var, nc0Var, b2Var));
                return;
            }
            d1Var.presentFragment(nc0Var);
        }
    }
}
