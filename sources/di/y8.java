package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c91;
public final class y8 extends c91 {
    public final int f8132a;
    public final Context f8133b;
    public final ea f8134c;

    public y8(ea eaVar, Context context, int i10) {
        this.f8132a = i10;
        this.f8134c = eaVar;
        this.f8133b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f8132a) {
            case 0:
                ((x9) view).b(i11);
                return;
            default:
                ((x9) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f8132a) {
            case 0:
                return new x9(this.f8134c, this.f8133b);
            default:
                return new x9(this.f8134c, this.f8133b);
        }
    }

    @Override
    public final int e() {
        switch (this.f8132a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f8132a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f8134c.M;
            default:
                return 5;
        }
    }
}
