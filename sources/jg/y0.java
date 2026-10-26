package jg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.t61;
import org.telegram.ui.pc0;
public final class y0 implements Utilities.Callback5, org.telegram.ui.ActionBar.b2 {
    public final int f15899a;
    public final d1 f15900b;

    public y0(d1 d1Var, int i10) {
        this.f15899a = i10;
        this.f15900b = d1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f15899a) {
            case 1:
                this.f15900b.X();
                return;
            case 2:
                this.f15900b.finishFragment();
                return;
            default:
                d1 d1Var = this.f15900b;
                d1Var.f15667b.b(true);
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
        d1 d1Var = this.f15900b;
        t61 t61Var = (t61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = t61Var.d;
        if (i10 != 1 && t61Var.f32869c != d1Var.f15669f) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d1Var.getParentActivity());
                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(d1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                d1Var.showDialog(alertDialog$Builder.f22368a);
            }
        } else if (d1Var.f15673w != null && t61Var.f32869c != d1Var.f15669f) {
            d1Var.f15673w = null;
            d1Var.f15666a.f32152g3.O(true);
        } else {
            pc0 pc0Var = new pc0(8);
            if (d1Var.f15673w != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = d1Var.f15674x;
                tL_channelLocation.geo_point = d1Var.f15673w;
                pc0Var.f42462z0 = tL_channelLocation;
            }
            pc0Var.E0 = new ai.f0(23, d1Var, pc0Var);
            if (d1Var.f15673w == null && !TextUtils.isEmpty(d1Var.f15674x)) {
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(d1Var.getParentActivity(), 3, null);
                e2Var.f22575i0 = false;
                e2Var.r(200L);
                Utilities.searchQueue.postRunnable(new w0(d1Var, pc0Var, e2Var));
                return;
            }
            d1Var.presentFragment(pc0Var);
        }
    }
}
