package hg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.x51;
import org.telegram.ui.fd0;
public final class z0 implements Utilities.Callback5, org.telegram.ui.ActionBar.b2 {
    public final int f10480a;
    public final e1 f10481b;

    public z0(e1 e1Var, int i10) {
        this.f10480a = i10;
        this.f10481b = e1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f10480a) {
            case 1:
                this.f10481b.W();
                return;
            case 2:
                this.f10481b.finishFragment();
                return;
            default:
                e1 e1Var = this.f10481b;
                e1Var.f10255b.a(1.0f);
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
        e1 e1Var = this.f10481b;
        x51 x51Var = (x51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = x51Var.d;
        if (i10 != 1 && x51Var.f30296c != e1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e1Var.getParentActivity());
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(e1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                e1Var.showDialog(alertDialog$Builder.f18655a);
            }
        } else if (e1Var.f10262x != null && x51Var.f30296c != e1Var.h) {
            e1Var.f10262x = null;
            e1Var.f10254a.Y2.N(true);
        } else {
            fd0 fd0Var = new fd0(8);
            if (e1Var.f10262x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = e1Var.f10263y;
                tL_channelLocation.geo_point = e1Var.f10262x;
                fd0Var.A0 = tL_channelLocation;
            }
            fd0Var.F0 = new ah.b(15, e1Var, fd0Var);
            if (e1Var.f10262x == null && !TextUtils.isEmpty(e1Var.f10263y)) {
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(e1Var.getParentActivity(), 3, null);
                c2Var.f18729g0 = false;
                c2Var.q(200L);
                Utilities.searchQueue.postRunnable(new x0(e1Var, fd0Var, c2Var));
                return;
            }
            e1Var.presentFragment(fd0Var);
        }
    }
}
