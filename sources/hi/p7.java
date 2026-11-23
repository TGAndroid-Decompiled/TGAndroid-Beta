package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b71;
public final class p7 extends b71 {
    public final int f15185a;
    public final Context f15186b;
    public final q8 f15187c;

    public p7(q8 q8Var, Context context, int i7) {
        this.f15185a = i7;
        this.f15187c = q8Var;
        this.f15186b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        switch (this.f15185a) {
            case 0:
                ((l8) view).b(i10);
                return;
            default:
                ((l8) view).b(i10);
                return;
        }
    }

    @Override
    public final View d(int i7) {
        switch (this.f15185a) {
            case 0:
                return new l8(this.f15187c, this.f15186b);
            default:
                return new l8(this.f15187c, this.f15186b);
        }
    }

    @Override
    public final int e() {
        switch (this.f15185a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f15185a) {
            case 0:
                if (i7 == 0) {
                    return 0;
                }
                return this.f15187c.H1;
            default:
                return 5;
        }
    }
}
