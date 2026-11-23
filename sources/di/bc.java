package di;

import android.content.Context;
import org.telegram.ui.ws0;
public final class bc extends vg.n {
    public final int f8568j0;

    public bc(Context context, int i7, int i10, int i11) {
        super(context, i7, i10);
        this.f8568j0 = i11;
    }

    @Override
    public void h() {
        switch (this.f8568j0) {
            case 2:
                boolean z10 = org.telegram.messenger.s2.f26694a;
                return;
            default:
                return;
        }
    }

    @Override
    public void n() {
        switch (this.f8568j0) {
            case 0:
                return;
            default:
                super.n();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f8568j0) {
            case 1:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            case 2:
            default:
                super.onAttachedToWindow();
                return;
            case 3:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            case 4:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            case 5:
                super.onAttachedToWindow();
                setPaused(false);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f8568j0) {
            case 1:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            case 2:
            default:
                super.onDetachedFromWindow();
                return;
            case 3:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            case 4:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            case 5:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
        }
    }

    public bc(ws0 ws0Var, Context context, int i7, int i10, Context context2) {
        super(context, i7, i10);
        this.f8568j0 = 2;
    }

    private final void p() {
    }
}
