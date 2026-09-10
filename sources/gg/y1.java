package gg;

import android.app.Activity;
import bi.c8;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
public final class y1 extends org.telegram.ui.ActionBar.k {
    public final h2 f9100a;

    public y1(h2 h2Var) {
        this.f9100a = h2Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        f6 f6Var;
        h2 h2Var = this.f9100a;
        ArrayList arrayList = h2Var.f8905b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                h2Var.finishFragment();
            } else {
                h2.X(h2Var);
            }
        } else if (i10 == 1) {
            if (arrayList.size() == 1) {
                int intValue = ((Integer) arrayList.get(0)).intValue();
                i11 = ((p2) h2Var).currentAccount;
                j2 c10 = k2.f(i11).c(intValue);
                if (c10 != null) {
                    Activity parentActivity = h2Var.getParentActivity();
                    i12 = ((p2) h2Var).currentAccount;
                    f6Var = ((p2) h2Var).resourceProvider;
                    h2.d0(parentActivity, i12, null, c10, f6Var, new c8(this, intValue, 1));
                }
            }
        } else if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var.getParentActivity(), 0, h2Var.getResourceProvider());
            alertDialog$Builder.f17528a.R = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.f17528a.T = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1.c(this, 25));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            h2Var.showDialog(alertDialog$Builder.f17528a);
        }
    }
}
