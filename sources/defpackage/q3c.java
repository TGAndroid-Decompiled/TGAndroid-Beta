package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class q3c extends j79 {
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
    public final f89 x(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new f89(new p3c(this.c, (byte) 0));
        }
        return new f89(this.d);
    }
}
