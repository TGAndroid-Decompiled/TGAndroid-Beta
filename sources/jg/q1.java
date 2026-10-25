package jg;

import android.app.Activity;
import fi.c4;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
public final class q1 extends org.telegram.ui.ActionBar.j {
    public final z1 f15818a;

    public q1(z1 z1Var) {
        this.f15818a = z1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        u6 u6Var;
        z1 z1Var = this.f15818a;
        ArrayList arrayList = z1Var.f15915b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                z1Var.finishFragment();
            } else {
                z1.Y(z1Var);
            }
        } else if (i10 == 1) {
            if (arrayList.size() == 1) {
                int intValue = ((Integer) arrayList.get(0)).intValue();
                i11 = ((r2) z1Var).currentAccount;
                b2 c10 = c2.f(i11).c(intValue);
                if (c10 != null) {
                    Activity parentActivity = z1Var.getParentActivity();
                    i12 = ((r2) z1Var).currentAccount;
                    u6Var = ((r2) z1Var).resourceProvider;
                    z1.e0(parentActivity, i12, null, c10, u6Var, new c4(this, intValue, 2));
                }
            }
        } else if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z1Var.getParentActivity(), 0, z1Var.getResourceProvider());
            alertDialog$Builder.f22366a.R = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.f22366a.T = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new e1(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            z1Var.showDialog(alertDialog$Builder.f22366a);
        }
    }
}
