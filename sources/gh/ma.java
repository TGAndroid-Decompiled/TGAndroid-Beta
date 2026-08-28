package gh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.l41;
public final class ma extends e71 {
    public final Context f8585a;
    public final int f8586b;
    public final boolean f8587c;
    public final int d;
    public final org.telegram.ui.ActionBar.b6 f8588e;
    public final long f8589f;
    public final ArrayList f8590g = new ArrayList();

    public ma(Context context, int i9, boolean z10, long j10, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f8585a = context;
        this.f8586b = i9;
        this.f8587c = z10;
        this.d = i10;
        this.f8588e = b6Var;
        this.f8589f = j10;
        i();
    }

    @Override
    public final View d(int i9) {
        return new la(this.f8585a, this.f8587c, this.f8589f, i9, this.f8586b, this.d, this.f8588e);
    }

    @Override
    public final int e() {
        return this.f8590g.size();
    }

    @Override
    public final CharSequence g(int i9) {
        int h = h(i9);
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
    public final int h(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f8590g;
            if (i9 < arrayList.size()) {
                return ((l41) arrayList.get(i9)).f30352z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f8590g;
        arrayList.clear();
        int i9 = this.f8586b;
        long j10 = this.f8589f;
        if (j10 == 0) {
            v7 y10 = v7.y(i9, this.f8587c);
            arrayList.add(l41.C(0));
            if (y10.O(1)) {
                arrayList.add(l41.C(1));
            }
            if (y10.O(2)) {
                arrayList.add(l41.C(2));
                return;
            }
            return;
        }
        c0 g10 = c0.g(i9);
        arrayList.add(l41.C(0));
        if (!g10.k(j10).f7825a[1].isEmpty()) {
            arrayList.add(l41.C(1));
        }
        if (!g10.k(j10).f7825a[2].isEmpty()) {
            arrayList.add(l41.C(2));
        }
    }

    @Override
    public final void b(View view, int i9, int i10) {
    }
}
