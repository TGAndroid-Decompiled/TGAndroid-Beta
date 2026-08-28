package kh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;
public final class p8 extends e71 {
    public final int f15840a;
    public final Context f15841b;
    public final t9 f15842c;

    public p8(t9 t9Var, Context context, int i9) {
        this.f15840a = i9;
        this.f15842c = t9Var;
        this.f15841b = context;
    }

    @Override
    public final void b(View view, int i9, int i10) {
        switch (this.f15840a) {
            case 0:
                ((n9) view).b(i10);
                return;
            default:
                ((n9) view).b(i10);
                return;
        }
    }

    @Override
    public final View d(int i9) {
        switch (this.f15840a) {
            case 0:
                return new n9(this.f15842c, this.f15841b);
            default:
                return new n9(this.f15842c, this.f15841b);
        }
    }

    @Override
    public final int e() {
        switch (this.f15840a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i9) {
        switch (this.f15840a) {
            case 0:
                if (i9 == 0) {
                    return 0;
                }
                return this.f15842c.I;
            default:
                return 5;
        }
    }
}
