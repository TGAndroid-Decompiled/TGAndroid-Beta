package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.n91;
public final class j8 extends n91 {
    public final int f11061a;
    public final Context f11062b;
    public final n9 f11063c;

    public j8(n9 n9Var, Context context, int i10) {
        this.f11061a = i10;
        this.f11063c = n9Var;
        this.f11062b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f11061a) {
            case 0:
                ((g9) view).b(i11);
                return;
            default:
                ((g9) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f11061a) {
            case 0:
                return new g9(this.f11063c, this.f11062b);
            default:
                return new g9(this.f11063c, this.f11062b);
        }
    }

    @Override
    public final int e() {
        switch (this.f11061a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f11061a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f11063c.M;
            default:
                return 5;
        }
    }
}
