package jh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.w41;
public final class ga extends q71 {
    public final Context f12132a;
    public final int f12133b;
    public final boolean f12134c;
    public final int d;
    public final org.telegram.ui.ActionBar.c6 f12135e;
    public final long f12136f;
    public final ArrayList f12137g = new ArrayList();

    public ga(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f12132a = context;
        this.f12133b = i10;
        this.f12134c = z10;
        this.d = i11;
        this.f12135e = c6Var;
        this.f12136f = j10;
        i();
    }

    @Override
    public final View d(int i10) {
        return new fa(this.f12132a, this.f12134c, this.f12136f, i10, this.f12133b, this.d, this.f12135e);
    }

    @Override
    public final int e() {
        return this.f12137g.size();
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
            ArrayList arrayList = this.f12137g;
            if (i10 < arrayList.size()) {
                return ((w41) arrayList.get(i10)).f34313z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f12137g;
        arrayList.clear();
        int i10 = this.f12133b;
        long j10 = this.f12136f;
        if (j10 == 0) {
            s7 y8 = s7.y(i10, this.f12134c);
            arrayList.add(w41.C(0));
            if (y8.O(1)) {
                arrayList.add(w41.C(1));
            }
            if (y8.O(2)) {
                arrayList.add(w41.C(2));
                return;
            }
            return;
        }
        b0 g10 = b0.g(i10);
        arrayList.add(w41.C(0));
        if (!g10.k(j10).f11702a[1].isEmpty()) {
            arrayList.add(w41.C(1));
        }
        if (!g10.k(j10).f11702a[2].isEmpty()) {
            arrayList.add(w41.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
