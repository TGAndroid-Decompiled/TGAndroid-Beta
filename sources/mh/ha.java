package mh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.j51;
public final class ha extends e81 {
    public final Context f14187a;
    public final int f14188b;
    public final boolean f14189c;
    public final int d;
    public final org.telegram.ui.ActionBar.g6 f14190e;
    public final long f14191f;
    public final ArrayList f14192g = new ArrayList();

    public ha(Context context, int i10, boolean z4, long j10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f14187a = context;
        this.f14188b = i10;
        this.f14189c = z4;
        this.d = i11;
        this.f14190e = g6Var;
        this.f14191f = j10;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ga(this.f14187a, this.f14189c, this.f14191f, i10, this.f14188b, this.d, this.f14190e);
    }

    @Override
    public final int e() {
        return this.f14192g.size();
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
            ArrayList arrayList = this.f14192g;
            if (i10 < arrayList.size()) {
                return ((j51) arrayList.get(i10)).f28027z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f14192g;
        arrayList.clear();
        int i10 = this.f14188b;
        long j10 = this.f14191f;
        if (j10 == 0) {
            t7 y10 = t7.y(i10, this.f14189c);
            arrayList.add(j51.C(0));
            if (y10.O(1)) {
                arrayList.add(j51.C(1));
            }
            if (y10.O(2)) {
                arrayList.add(j51.C(2));
                return;
            }
            return;
        }
        a0 g10 = a0.g(i10);
        arrayList.add(j51.C(0));
        if (!g10.k(j10).f15122a[1].isEmpty()) {
            arrayList.add(j51.C(1));
        }
        if (!g10.k(j10).f15122a[2].isEmpty()) {
            arrayList.add(j51.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
