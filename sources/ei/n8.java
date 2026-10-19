package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.v81;
public final class n8 extends v81 {
    public final int f9522a;
    public final Context f9523b;
    public final r9 f9524c;

    public n8(r9 r9Var, Context context, int i10) {
        this.f9522a = i10;
        this.f9524c = r9Var;
        this.f9523b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f9522a) {
            case 0:
                ((k9) view).b(i11);
                return;
            default:
                ((k9) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f9522a) {
            case 0:
                return new k9(this.f9524c, this.f9523b);
            default:
                return new k9(this.f9524c, this.f9523b);
        }
    }

    @Override
    public final int e() {
        switch (this.f9522a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f9522a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f9524c.M;
            default:
                return 5;
        }
    }
}
