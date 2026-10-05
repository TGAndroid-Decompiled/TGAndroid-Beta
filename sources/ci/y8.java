package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.y81;
public final class y8 extends y81 {
    public final int f6346a;
    public final Context f6347b;
    public final ea f6348c;

    public y8(ea eaVar, Context context, int i10) {
        this.f6346a = i10;
        this.f6348c = eaVar;
        this.f6347b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f6346a) {
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
        switch (this.f6346a) {
            case 0:
                return new x9(this.f6348c, this.f6347b);
            default:
                return new x9(this.f6348c, this.f6347b);
        }
    }

    @Override
    public final int e() {
        switch (this.f6346a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f6346a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f6348c.M;
            default:
                return 5;
        }
    }
}
