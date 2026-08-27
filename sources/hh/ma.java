package hh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.n41;

public final class ma extends g71 {

    public final Context f9764a;

    public final int f9765b;

    public final boolean f9766c;
    public final int d;

    public final org.telegram.ui.ActionBar.c6 f9767e;

    public final long f9768f;

    public final ArrayList f9769g = new ArrayList();

    public ma(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f9764a = context;
        this.f9765b = i10;
        this.f9766c = z10;
        this.d = i11;
        this.f9767e = c6Var;
        this.f9768f = j10;
        i();
    }

    @Override
    public final View d(int i10) {
        return new la(this.f9764a, this.f9766c, this.f9768f, i10, this.f9765b, this.d, this.f9767e);
    }

    @Override
    public final int e() {
        return this.f9769g.size();
    }

    @Override
    public final CharSequence g(int i10) {
        int iH = h(i10);
        if (iH == 0) {
            return LocaleController.getString(R.string.StarsTransactionsAll);
        }
        if (iH != 1) {
            return iH != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing);
        }
        return LocaleController.getString(R.string.StarsTransactionsIncoming);
    }

    @Override
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.f9769g;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((n41) arrayList.get(i10)).f30857z;
    }

    public final void i() {
        ArrayList arrayList = this.f9769g;
        arrayList.clear();
        int i10 = this.f9765b;
        long j10 = this.f9768f;
        if (j10 == 0) {
            u7 u7VarY = u7.y(i10, this.f9766c);
            arrayList.add(n41.C(0));
            if (u7VarY.O(1)) {
                arrayList.add(n41.C(1));
            }
            if (u7VarY.O(2)) {
                arrayList.add(n41.C(2));
                return;
            }
            return;
        }
        c0 c0VarG = c0.g(i10);
        arrayList.add(n41.C(0));
        if (!c0VarG.k(j10).f8983a[1].isEmpty()) {
            arrayList.add(n41.C(1));
        }
        if (c0VarG.k(j10).f8983a[2].isEmpty()) {
            return;
        }
        arrayList.add(n41.C(2));
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
