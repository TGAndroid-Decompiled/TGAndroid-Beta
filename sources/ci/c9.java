package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.q81;
public final class c9 extends q81 {
    public final int f4435a;
    public final Context f4436b;
    public final ia f4437c;

    public c9(ia iaVar, Context context, int i10) {
        this.f4435a = i10;
        this.f4437c = iaVar;
        this.f4436b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f4435a) {
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
        switch (this.f4435a) {
            case 0:
                return new ba(this.f4437c, this.f4436b);
            default:
                return new ba(this.f4437c, this.f4436b);
        }
    }

    @Override
    public final int e() {
        switch (this.f4435a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f4435a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.f4437c.M;
            default:
                return 5;
        }
    }
}
