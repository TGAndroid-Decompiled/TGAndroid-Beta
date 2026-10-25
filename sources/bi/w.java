package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.om0;
public final class w extends m91 {
    public final x[] f5584a = new x[3];
    public final Context f5585b;
    public final om0 f5586c;
    public final y d;

    public w(y yVar, Context context, om0 om0Var) {
        this.d = yVar;
        this.f5585b = context;
        this.f5586c = om0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        this.f5586c.L(view);
    }

    @Override
    public final View d(int i10) {
        x[] xVarArr = this.f5584a;
        if (xVarArr[i10] == null) {
            xVarArr[i10] = new x(this.d, this.f5585b, i10);
        }
        return xVarArr[i10];
    }

    @Override
    public final int e() {
        return this.f5584a.length;
    }

    @Override
    public final CharSequence g(int i10) {
        int i11;
        if (i10 == 1) {
            i11 = R.string.StarsTransactionsIncoming;
        } else if (i10 == 2) {
            i11 = R.string.StarsTransactionsOutgoing;
        } else {
            i11 = R.string.StarsTransactionsAll;
        }
        return LocaleController.getString(i11);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }
}
