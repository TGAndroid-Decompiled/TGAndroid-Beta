package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f61;
public final class q7 extends f61 {
    public final int f13436a;
    public final Context f13437b;
    public final t8 f13438c;

    public q7(t8 t8Var, Context context, int i3) {
        this.f13436a = i3;
        this.f13438c = t8Var;
        this.f13437b = context;
    }

    @Override
    public final void b(View view, int i3, int i10) {
        switch (this.f13436a) {
            case 0:
                ((o8) view).b(i10);
                return;
            default:
                ((o8) view).b(i10);
                return;
        }
    }

    @Override
    public final View d(int i3) {
        switch (this.f13436a) {
            case 0:
                return new o8(this.f13438c, this.f13437b);
            default:
                return new o8(this.f13438c, this.f13437b);
        }
    }

    @Override
    public final int e() {
        switch (this.f13436a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i3) {
        switch (this.f13436a) {
            case 0:
                if (i3 == 0) {
                    return 0;
                }
                return this.f13438c.E1;
            default:
                return 5;
        }
    }
}
