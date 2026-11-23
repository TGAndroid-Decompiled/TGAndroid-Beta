package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;
public final class j8 extends c71 {
    public final int f14741a;
    public final Context f14742b;
    public final k9 f14743c;

    public j8(k9 k9Var, Context context, int i7) {
        this.f14741a = i7;
        this.f14743c = k9Var;
        this.f14742b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        switch (this.f14741a) {
            case 0:
                ((f9) view).b(i10);
                return;
            default:
                ((f9) view).b(i10);
                return;
        }
    }

    @Override
    public final View d(int i7) {
        switch (this.f14741a) {
            case 0:
                return new f9(this.f14743c, this.f14742b);
            default:
                return new f9(this.f14743c, this.f14742b);
        }
    }

    @Override
    public final int e() {
        switch (this.f14741a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f14741a) {
            case 0:
                if (i7 == 0) {
                    return 0;
                }
                return this.f14743c.H1;
            default:
                return 5;
        }
    }
}
