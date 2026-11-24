package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class r1c extends y59 {
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
    public final u69 x(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new u69(new q1c(this.c, (byte) 0));
        }
        return new u69(this.d);
    }
}
