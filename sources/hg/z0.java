package hg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.j51;
import org.telegram.ui.kd0;
public final class z0 implements Utilities.Callback5, org.telegram.ui.ActionBar.b2 {
    public final int f10492a;
    public final e1 f10493b;

    public z0(e1 e1Var, int i10) {
        this.f10492a = i10;
        this.f10493b = e1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f10492a) {
            case 1:
                this.f10493b.W();
                return;
            case 2:
                this.f10493b.finishFragment();
                return;
            default:
                e1 e1Var = this.f10493b;
                e1Var.f10267b.a(1.0f);
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
        e1 e1Var = this.f10493b;
        j51 j51Var = (j51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = j51Var.d;
        if (i10 != 1 && j51Var.f25121c != e1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e1Var.getParentActivity());
                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(e1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                e1Var.showDialog(alertDialog$Builder.f18447a);
            }
        } else if (e1Var.f10274x != null && j51Var.f25121c != e1Var.h) {
            e1Var.f10274x = null;
            e1Var.f10266a.Y2.N(true);
        } else {
            kd0 kd0Var = new kd0(8);
            if (e1Var.f10274x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = e1Var.f10275y;
                tL_channelLocation.geo_point = e1Var.f10274x;
                kd0Var.A0 = tL_channelLocation;
            }
            kd0Var.F0 = new ah.b(15, e1Var, kd0Var);
            if (e1Var.f10274x == null && !TextUtils.isEmpty(e1Var.f10275y)) {
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(e1Var.getParentActivity(), 3, null);
                c2Var.f18503g0 = false;
                c2Var.q(200L);
                Utilities.searchQueue.postRunnable(new x0(e1Var, kd0Var, c2Var));
                return;
            }
            e1Var.presentFragment(kd0Var);
        }
    }
}
