package hg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.v51;
import org.telegram.ui.cd0;
public final class a1 implements Utilities.Callback5, org.telegram.ui.ActionBar.z1 {
    public final int f10195a;
    public final f1 f10196b;

    public a1(f1 f1Var, int i10) {
        this.f10195a = i10;
        this.f10196b = f1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f10195a) {
            case 1:
                this.f10196b.W();
                return;
            case 2:
                this.f10196b.finishFragment();
                return;
            default:
                f1 f1Var = this.f10196b;
                f1Var.f10258b.a(1.0f);
                TLRPC.UserFull userFull = f1Var.getMessagesController().getUserFull(f1Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                f1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new b1(f1Var, 1));
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        f1 f1Var = this.f10196b;
        v51 v51Var = (v51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = v51Var.d;
        if (i10 != 1 && v51Var.f29036c != f1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f1Var.getParentActivity());
                alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f18647a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(f1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                f1Var.showDialog(alertDialog$Builder.f18647a);
            }
        } else if (f1Var.f10265x != null && v51Var.f29036c != f1Var.h) {
            f1Var.f10265x = null;
            f1Var.f10257a.Y2.N(true);
        } else {
            cd0 cd0Var = new cd0(8);
            if (f1Var.f10265x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = f1Var.f10266y;
                tL_channelLocation.geo_point = f1Var.f10265x;
                cd0Var.A0 = tL_channelLocation;
            }
            cd0Var.F0 = new ah.b(15, f1Var, cd0Var);
            if (f1Var.f10265x == null && !TextUtils.isEmpty(f1Var.f10266y)) {
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(f1Var.getParentActivity(), 3, null);
                a2Var.f18668g0 = false;
                a2Var.q(200L);
                Utilities.searchQueue.postRunnable(new y0(f1Var, cd0Var, a2Var));
                return;
            }
            f1Var.presentFragment(cd0Var);
        }
    }
}
