package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.y61;
public final class p7 extends y61 {
    public final int f15241a;
    public final Context f15242b;
    public final q8 f15243c;

    public p7(q8 q8Var, Context context, int i7) {
        this.f15241a = i7;
        this.f15243c = q8Var;
        this.f15242b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        switch (this.f15241a) {
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
        switch (this.f15241a) {
            case 0:
                return new l8(this.f15243c, this.f15242b);
            default:
                return new l8(this.f15243c, this.f15242b);
        }
    }

    @Override
    public final int e() {
        switch (this.f15241a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f15241a) {
            case 0:
                if (i7 == 0) {
                    return 0;
                }
                return this.f15243c.H1;
            default:
                return 5;
        }
    }
}
