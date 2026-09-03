package lh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.i51;
public final class ha extends c81 {
    public final Context f12548a;
    public final int f12549b;
    public final boolean f12550c;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final long f12551f;
    public final ArrayList f12552g = new ArrayList();

    public ha(Context context, int i10, boolean z4, long j10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f12548a = context;
        this.f12549b = i10;
        this.f12550c = z4;
        this.d = i11;
        this.e = f6Var;
        this.f12551f = j10;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ga(this.f12548a, this.f12550c, this.f12551f, i10, this.f12549b, this.d, this.e);
    }

    @Override
    public final int e() {
        return this.f12552g.size();
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
            ArrayList arrayList = this.f12552g;
            if (i10 < arrayList.size()) {
                return ((i51) arrayList.get(i10)).f25598z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f12552g;
        arrayList.clear();
        int i10 = this.f12549b;
        long j10 = this.f12551f;
        if (j10 == 0) {
            t7 y10 = t7.y(i10, this.f12550c);
            arrayList.add(i51.C(0));
            if (y10.O(1)) {
                arrayList.add(i51.C(1));
            }
            if (y10.O(2)) {
                arrayList.add(i51.C(2));
                return;
            }
            return;
        }
        b0 g10 = b0.g(i10);
        arrayList.add(i51.C(0));
        if (!g10.k(j10).f12069a[1].isEmpty()) {
            arrayList.add(i51.C(1));
        }
        if (!g10.k(j10).f12069a[2].isEmpty()) {
            arrayList.add(i51.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
