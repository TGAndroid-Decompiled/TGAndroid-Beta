package jg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.u61;
import org.telegram.ui.rc0;
public final class y0 implements Utilities.Callback5, org.telegram.ui.ActionBar.b2 {
    public final int f15898a;
    public final d1 f15899b;

    public y0(d1 d1Var, int i10) {
        this.f15898a = i10;
        this.f15899b = d1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f15898a) {
            case 1:
                this.f15899b.X();
                return;
            case 2:
                this.f15899b.finishFragment();
                return;
            default:
                d1 d1Var = this.f15899b;
                d1Var.f15666b.b(true);
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
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        d1 d1Var = this.f15899b;
        u61 u61Var = (u61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = u61Var.d;
        if (i10 != 1 && u61Var.f33243c != d1Var.f15668f) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d1Var.getParentActivity());
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(d1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                d1Var.showDialog(alertDialog$Builder.f22369a);
            }
        } else if (d1Var.f15672w != null && u61Var.f33243c != d1Var.f15668f) {
            d1Var.f15672w = null;
            d1Var.f15665a.f32504g3.O(true);
        } else {
            rc0 rc0Var = new rc0(8);
            if (d1Var.f15672w != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = d1Var.f15673x;
                tL_channelLocation.geo_point = d1Var.f15672w;
                rc0Var.f42955z0 = tL_channelLocation;
            }
            rc0Var.E0 = new ai.f0(23, d1Var, rc0Var);
            if (d1Var.f15672w == null && !TextUtils.isEmpty(d1Var.f15673x)) {
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(d1Var.getParentActivity(), 3, null);
                e2Var.f22576i0 = false;
                e2Var.r(200L);
                Utilities.searchQueue.postRunnable(new w0(d1Var, rc0Var, e2Var));
                return;
            }
            d1Var.presentFragment(rc0Var);
        }
    }
}
