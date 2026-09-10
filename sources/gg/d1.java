package gg;

import android.text.TextUtils;
import android.view.View;
import bi.cb;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.v51;
import org.telegram.ui.id0;
public final class d1 implements Utilities.Callback5, org.telegram.ui.ActionBar.c2 {
    public final int f8842a;
    public final k1 f8843b;

    public d1(k1 k1Var, int i10) {
        this.f8842a = i10;
        this.f8843b = k1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f8842a) {
            case 1:
                this.f8843b.W();
                return;
            case 2:
                this.f8843b.finishFragment();
                return;
            default:
                k1 k1Var = this.f8843b;
                k1Var.f8927b.a(1.0f);
                TLRPC.UserFull userFull = k1Var.getMessagesController().getUserFull(k1Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                k1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new e1(k1Var, 1));
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        k1 k1Var = this.f8843b;
        v51 v51Var = (v51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = v51Var.d;
        if (i10 != 1 && v51Var.f27823c != k1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k1Var.getParentActivity());
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new d1(k1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                k1Var.showDialog(alertDialog$Builder.f17528a);
            }
        } else if (k1Var.f8934x != null && v51Var.f27823c != k1Var.h) {
            k1Var.f8934x = null;
            k1Var.f8926a.Y2.N(true);
        } else {
            id0 id0Var = new id0(8);
            if (k1Var.f8934x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = k1Var.f8935y;
                tL_channelLocation.geo_point = k1Var.f8934x;
                id0Var.A0 = tL_channelLocation;
            }
            id0Var.F0 = new cb(11, k1Var, id0Var);
            if (k1Var.f8934x == null && !TextUtils.isEmpty(k1Var.f8935y)) {
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(k1Var.getParentActivity(), 3, null);
                d2Var.f17621g0 = false;
                d2Var.q(200L);
                Utilities.searchQueue.postRunnable(new b1(k1Var, id0Var, d2Var));
                return;
            }
            k1Var.presentFragment(id0Var);
        }
    }
}
