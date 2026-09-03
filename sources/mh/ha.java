package mh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.h51;
public final class ha extends d81 {
    public final Context f14189a;
    public final int f14190b;
    public final boolean f14191c;
    public final int d;
    public final org.telegram.ui.ActionBar.g6 f14192e;
    public final long f14193f;
    public final ArrayList f14194g = new ArrayList();

    public ha(Context context, int i10, boolean z4, long j10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f14189a = context;
        this.f14190b = i10;
        this.f14191c = z4;
        this.d = i11;
        this.f14192e = g6Var;
        this.f14193f = j10;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ga(this.f14189a, this.f14191c, this.f14193f, i10, this.f14190b, this.d, this.f14192e);
    }

    @Override
    public final int e() {
        return this.f14194g.size();
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
            ArrayList arrayList = this.f14194g;
            if (i10 < arrayList.size()) {
                return ((h51) arrayList.get(i10)).f27388z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f14194g;
        arrayList.clear();
        int i10 = this.f14190b;
        long j10 = this.f14193f;
        if (j10 == 0) {
            t7 y10 = t7.y(i10, this.f14191c);
            arrayList.add(h51.C(0));
            if (y10.O(1)) {
                arrayList.add(h51.C(1));
            }
            if (y10.O(2)) {
                arrayList.add(h51.C(2));
                return;
            }
            return;
        }
        a0 g10 = a0.g(i10);
        arrayList.add(h51.C(0));
        if (!g10.k(j10).f15124a[1].isEmpty()) {
            arrayList.add(h51.C(1));
        }
        if (!g10.k(j10).f15124a[2].isEmpty()) {
            arrayList.add(h51.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
