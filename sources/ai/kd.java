package ai;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.v81;
public final class kd extends v81 {
    public final Context f1720a;
    public final int f1721b;
    public final boolean f1722c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f1723f;
    public final ArrayList f1724g = new ArrayList();

    public kd(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f1720a = context;
        this.f1721b = i10;
        this.f1722c = z10;
        this.d = i11;
        this.e = d6Var;
        this.f1723f = j10;
        i();
    }

    @Override
    public final View d(int i10) {
        return new jd(this.f1720a, this.f1722c, this.f1723f, i10, this.f1721b, this.d, this.e);
    }

    @Override
    public final int e() {
        return this.f1724g.size();
    }

    @Override
    public final CharSequence g(int i10) {
        int h = h(i10);
        if (h != 0) {
            if (h != 1) {
                if (h != 2) {
                    return "";
                }
                return LocaleController.getString(R.string.StarsTransactionsOutgoing);
            }
            return LocaleController.getString(R.string.StarsTransactionsIncoming);
        }
        return LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override
    public final int h(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f1724g;
            if (i10 < arrayList.size()) {
                return ((g61) arrayList.get(i10)).f26512z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f1724g;
        arrayList.clear();
        long j10 = this.f1723f;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f1721b;
        if (i10 == 0) {
            ga y3 = ga.y(i11, this.f1722c);
            arrayList.add(g61.C(0));
            if (y3.O(1)) {
                arrayList.add(g61.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(g61.C(2));
                return;
            }
            return;
        }
        k0 g10 = k0.g(i11);
        arrayList.add(g61.C(0));
        if (!g10.k(j10).f1534a[1].isEmpty()) {
            arrayList.add(g61.C(1));
        }
        if (!g10.k(j10).f1534a[2].isEmpty()) {
            arrayList.add(g61.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
