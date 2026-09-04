package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a81;
public final class b9 extends a81 {
    public final int f6953a;
    public final Context f6954b;
    public final ia f6955c;

    public b9(ia iaVar, Context context, int i10) {
        this.f6953a = i10;
        this.f6955c = iaVar;
        this.f6954b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f6953a) {
            case 0:
                ((ba) view).b(i11);
                return;
            default:
                ((ba) view).b(i11);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f6953a) {
            case 0:
                return new ba(this.f6955c, this.f6954b);
            default:
                return new ba(this.f6955c, this.f6954b);
        }
    }

    @Override
    public final int e() {
        switch (this.f6953a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f6953a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f6955c.M;
            default:
                return 5;
        }
    }
}
