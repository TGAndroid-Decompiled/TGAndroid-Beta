package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b71;
public final class o7 extends b71 {
    public final int f15223a;
    public final Context f15224b;
    public final p8 f15225c;

    public o7(p8 p8Var, Context context, int i7) {
        this.f15223a = i7;
        this.f15225c = p8Var;
        this.f15224b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        switch (this.f15223a) {
            case 0:
                ((k8) view).b(i10);
                return;
            default:
                ((k8) view).b(i10);
                return;
        }
    }

    @Override
    public final View d(int i7) {
        switch (this.f15223a) {
            case 0:
                return new k8(this.f15225c, this.f15224b);
            default:
                return new k8(this.f15225c, this.f15224b);
        }
    }

    @Override
    public final int e() {
        switch (this.f15223a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f15223a) {
            case 0:
                if (i7 == 0) {
                    return 0;
                }
                return this.f15225c.H1;
            default:
                return 5;
        }
    }
}
