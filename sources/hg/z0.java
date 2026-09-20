package hg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.w51;
import org.telegram.ui.kd0;
public final class z0 implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final int f10493a;
    public final e1 f10494b;

    public z0(e1 e1Var, int i10) {
        this.f10493a = i10;
        this.f10494b = e1Var;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f10493a) {
            case 1:
                this.f10494b.W();
                return;
            case 2:
                this.f10494b.finishFragment();
                return;
            default:
                e1 e1Var = this.f10494b;
                e1Var.f10268b.a(1.0f);
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
        e1 e1Var = this.f10494b;
        w51 w51Var = (w51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = w51Var.d;
        if (i10 != 1 && w51Var.f29942c != e1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e1Var.getParentActivity());
                alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(e1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                e1Var.showDialog(alertDialog$Builder.f18654a);
            }
        } else if (e1Var.f10275x != null && w51Var.f29942c != e1Var.h) {
            e1Var.f10275x = null;
            e1Var.f10267a.Y2.N(true);
        } else {
            kd0 kd0Var = new kd0(8);
            if (e1Var.f10275x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = e1Var.f10276y;
                tL_channelLocation.geo_point = e1Var.f10275x;
                kd0Var.A0 = tL_channelLocation;
            }
            kd0Var.F0 = new ah.b(15, e1Var, kd0Var);
            if (e1Var.f10275x == null && !TextUtils.isEmpty(e1Var.f10276y)) {
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(e1Var.getParentActivity(), 3, null);
                b2Var.f18690g0 = false;
                b2Var.q(200L);
                Utilities.searchQueue.postRunnable(new x0(e1Var, kd0Var, b2Var));
                return;
            }
            e1Var.presentFragment(kd0Var);
        }
    }
}
