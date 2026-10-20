package ig;

import android.app.Activity;
import ei.e4;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
public final class o1 extends org.telegram.ui.ActionBar.j {
    public final x1 f12984a;

    public o1(x1 x1Var) {
        this.f12984a = x1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        d6 d6Var;
        x1 x1Var = this.f12984a;
        ArrayList arrayList = x1Var.f13084b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                x1Var.finishFragment();
            } else {
                x1.X(x1Var);
            }
        } else if (i10 == 1) {
            if (arrayList.size() == 1) {
                int intValue = ((Integer) arrayList.get(0)).intValue();
                i11 = ((n2) x1Var).currentAccount;
                z1 c10 = a2.f(i11).c(intValue);
                if (c10 != null) {
                    Activity parentActivity = x1Var.getParentActivity();
                    i12 = ((n2) x1Var).currentAccount;
                    d6Var = ((n2) x1Var).resourceProvider;
                    x1.d0(parentActivity, i12, null, c10, d6Var, new e4(this, intValue, 2));
                }
            }
        } else if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x1Var.getParentActivity(), 0, x1Var.getResourceProvider());
            alertDialog$Builder.f20605a.R = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.f20605a.T = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new e1.c(this, 22));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            x1Var.showDialog(alertDialog$Builder.f20605a);
        }
    }
}
