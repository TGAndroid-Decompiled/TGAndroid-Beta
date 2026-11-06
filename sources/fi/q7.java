package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m61;
public final class q7 extends m61 {
    public final int f12675a;
    public final Context f12676b;
    public final s8 f12677c;

    public q7(s8 s8Var, Context context, int i7) {
        this.f12675a = i7;
        this.f12677c = s8Var;
        this.f12676b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        switch (this.f12675a) {
            case 0:
                ((n8) view).b(i10);
                return;
            default:
                ((n8) view).b(i10);
                return;
        }
    }

    @Override
    public final View d(int i7) {
        switch (this.f12675a) {
            case 0:
                return new n8(this.f12677c, this.f12676b);
            default:
                return new n8(this.f12677c, this.f12676b);
        }
    }

    @Override
    public final int e() {
        switch (this.f12675a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f12675a) {
            case 0:
                if (i7 == 0) {
                    return 0;
                }
                return this.f12677c.D1;
            default:
                return 5;
        }
    }
}
