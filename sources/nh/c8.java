package nh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.q71;
public final class c8 extends q71 {
    public final int f17478a;
    public final Context f17479b;
    public final e9 f17480c;

    public c8(e9 e9Var, Context context, int i10) {
        this.f17478a = i10;
        this.f17480c = e9Var;
        this.f17479b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f17478a) {
            case 0:
                ((y8) view).b(i11);
                return;
            default:
                ((y8) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f17478a) {
            case 0:
                return new y8(this.f17480c, this.f17479b);
            default:
                return new y8(this.f17480c, this.f17479b);
        }
    }

    @Override
    public final int e() {
        switch (this.f17478a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f17478a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f17480c.I;
            default:
                return 5;
        }
    }
}
