package ig;

import android.app.Activity;
import di.k4;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
public final class p1 extends org.telegram.ui.ActionBar.j {
    public final y1 f11608a;

    public p1(y1 y1Var) {
        this.f11608a = y1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        c6 c6Var;
        y1 y1Var = this.f11608a;
        ArrayList arrayList = y1Var.f11708b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                y1Var.finishFragment();
            } else {
                y1.X(y1Var);
            }
        } else if (i10 == 1) {
            if (arrayList.size() == 1) {
                int intValue = ((Integer) arrayList.get(0)).intValue();
                i11 = ((m2) y1Var).currentAccount;
                a2 c10 = b2.f(i11).c(intValue);
                if (c10 != null) {
                    Activity parentActivity = y1Var.getParentActivity();
                    i12 = ((m2) y1Var).currentAccount;
                    c6Var = ((m2) y1Var).resourceProvider;
                    y1.d0(parentActivity, i12, null, c10, c6Var, new k4(this, intValue, 2));
                }
            }
        } else if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y1Var.getParentActivity(), 0, y1Var.getResourceProvider());
            alertDialog$Builder.f19248a.R = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.f19248a.T = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new f1.a(this, 13));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            y1Var.showDialog(alertDialog$Builder.f19248a);
        }
    }
}
