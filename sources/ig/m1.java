package ig;

import android.app.Activity;
import ei.e4;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
public final class m1 extends org.telegram.ui.ActionBar.j {
    public final v1 f12967a;

    public m1(v1 v1Var) {
        this.f12967a = v1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        d6 d6Var;
        v1 v1Var = this.f12967a;
        ArrayList arrayList = v1Var.f13065b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                v1Var.finishFragment();
            } else {
                v1.X(v1Var);
            }
        } else if (i10 == 1) {
            if (arrayList.size() == 1) {
                int intValue = ((Integer) arrayList.get(0)).intValue();
                i11 = ((n2) v1Var).currentAccount;
                x1 c10 = y1.f(i11).c(intValue);
                if (c10 != null) {
                    Activity parentActivity = v1Var.getParentActivity();
                    i12 = ((n2) v1Var).currentAccount;
                    d6Var = ((n2) v1Var).resourceProvider;
                    v1.d0(parentActivity, i12, null, c10, d6Var, new e4(this, intValue, 2));
                }
            }
        } else if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v1Var.getParentActivity(), 0, v1Var.getResourceProvider());
            alertDialog$Builder.f20601a.R = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.f20601a.T = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new e1.c(this, 22));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            v1Var.showDialog(alertDialog$Builder.f20601a);
        }
    }
}
