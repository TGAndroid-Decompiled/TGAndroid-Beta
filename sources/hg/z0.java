package hg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.g61;
import org.telegram.ui.gd0;
public final class z0 implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final int f11416a;
    public final e1 f11417b;

    public z0(e1 e1Var, int i10) {
        this.f11416a = i10;
        this.f11417b = e1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f11416a) {
            case 1:
                this.f11417b.U();
                return;
            case 2:
                this.f11417b.finishFragment();
                return;
            default:
                e1 e1Var = this.f11417b;
                e1Var.f11165b.a(1.0f);
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
        e1 e1Var = this.f11417b;
        g61 g61Var = (g61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = g61Var.d;
        if (i10 != 1 && g61Var.f26662c != e1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e1Var.getParentActivity());
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(e1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                e1Var.showDialog(alertDialog$Builder.f20368a);
            }
        } else if (e1Var.f11173x != null && g61Var.f26662c != e1Var.h) {
            e1Var.f11173x = null;
            e1Var.f11164a.f25245f3.N(true);
        } else {
            gd0 gd0Var = new gd0(8);
            if (e1Var.f11173x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = e1Var.f11174y;
                tL_channelLocation.geo_point = e1Var.f11173x;
                gd0Var.A0 = tL_channelLocation;
            }
            gd0Var.F0 = new ah.b(15, e1Var, gd0Var);
            if (e1Var.f11173x == null && !TextUtils.isEmpty(e1Var.f11174y)) {
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(e1Var.getParentActivity(), 3, null);
                b2Var.f20423g0 = false;
                b2Var.q(200L);
                Utilities.searchQueue.postRunnable(new x0(e1Var, gd0Var, b2Var));
                return;
            }
            e1Var.presentFragment(gd0Var);
        }
    }
}
