package hg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.i51;
import org.telegram.ui.id0;
public final class z0 implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final int f10487a;
    public final e1 f10488b;

    public z0(e1 e1Var, int i10) {
        this.f10487a = i10;
        this.f10488b = e1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f10487a) {
            case 1:
                this.f10488b.W();
                return;
            case 2:
                this.f10488b.finishFragment();
                return;
            default:
                e1 e1Var = this.f10488b;
                e1Var.f10262b.a(1.0f);
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
        e1 e1Var = this.f10488b;
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = i51Var.d;
        if (i10 != 1 && i51Var.f24888c != e1Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e1Var.getParentActivity());
                alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(e1Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                e1Var.showDialog(alertDialog$Builder.f18437a);
            }
        } else if (e1Var.f10269x != null && i51Var.f24888c != e1Var.h) {
            e1Var.f10269x = null;
            e1Var.f10261a.Y2.N(true);
        } else {
            id0 id0Var = new id0(8);
            if (e1Var.f10269x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = e1Var.f10270y;
                tL_channelLocation.geo_point = e1Var.f10269x;
                id0Var.A0 = tL_channelLocation;
            }
            id0Var.F0 = new ah.b(15, e1Var, id0Var);
            if (e1Var.f10269x == null && !TextUtils.isEmpty(e1Var.f10270y)) {
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(e1Var.getParentActivity(), 3, null);
                b2Var.f18473g0 = false;
                b2Var.q(200L);
                Utilities.searchQueue.postRunnable(new x0(e1Var, id0Var, b2Var));
                return;
            }
            e1Var.presentFragment(id0Var);
        }
    }
}
