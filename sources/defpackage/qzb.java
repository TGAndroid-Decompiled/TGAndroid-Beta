package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class qzb extends w39 {
    public Context c;
    public View d;
    public int e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.e++;
        this.d = view;
        g(1);
    }

    @Override
    public final int b() {
        return 2;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        return this.e;
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new s49(new pzb(this.c, (byte) 0));
        }
        return new s49(this.d);
    }
}
