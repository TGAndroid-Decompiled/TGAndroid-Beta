package ig;

import android.app.Activity;
import ei.e4;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
public final class n1 extends org.telegram.ui.ActionBar.j {
    public final w1 f13009a;

    public n1(w1 w1Var) {
        this.f13009a = w1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        g6 g6Var;
        w1 w1Var = this.f13009a;
        ArrayList arrayList = w1Var.f13113b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                w1Var.finishFragment();
            } else {
                w1.X(w1Var);
            }
        } else if (i10 == 1) {
            if (arrayList.size() == 1) {
                int intValue = ((Integer) arrayList.get(0)).intValue();
                i11 = ((o2) w1Var).currentAccount;
                y1 c10 = z1.f(i11).c(intValue);
                if (c10 != null) {
                    Activity parentActivity = w1Var.getParentActivity();
                    i12 = ((o2) w1Var).currentAccount;
                    g6Var = ((o2) w1Var).resourceProvider;
                    w1.d0(parentActivity, i12, null, c10, g6Var, new e4(this, intValue, 2));
                }
            }
        } else if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w1Var.getParentActivity(), 0, w1Var.getResourceProvider());
            alertDialog$Builder.f20679a.R = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.f20679a.T = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new e1.c(this, 22));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            w1Var.showDialog(alertDialog$Builder.f20679a);
        }
    }
}
