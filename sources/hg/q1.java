package hg;

import android.app.Activity;
import ci.b7;
import ei.d5;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
public final class q1 extends org.telegram.ui.ActionBar.j {
    public final z1 f10394a;

    public q1(z1 z1Var) {
        this.f10394a = z1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        e6 e6Var;
        z1 z1Var = this.f10394a;
        ArrayList arrayList = z1Var.f10491b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                z1Var.finishFragment();
            } else {
                z1.X(z1Var);
            }
        } else if (i10 == 1) {
            if (arrayList.size() == 1) {
                int intValue = ((Integer) arrayList.get(0)).intValue();
                i11 = ((n2) z1Var).currentAccount;
                b2 c10 = c2.f(i11).c(intValue);
                if (c10 != null) {
                    Activity parentActivity = z1Var.getParentActivity();
                    i12 = ((n2) z1Var).currentAccount;
                    e6Var = ((n2) z1Var).resourceProvider;
                    z1.d0(parentActivity, i12, null, c10, e6Var, new b7(this, intValue, 1));
                }
            }
        } else if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z1Var.getParentActivity(), 0, z1Var.getResourceProvider());
            alertDialog$Builder.f18435a.R = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.f18435a.T = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new d5(this, 5));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            z1Var.showDialog(alertDialog$Builder.f18435a);
        }
    }
}
