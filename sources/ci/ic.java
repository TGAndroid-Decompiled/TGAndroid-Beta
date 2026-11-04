package ci;

import android.content.Context;
import org.telegram.ui.ks0;
public final class ic extends wg.m {
    public final int f5318j0;

    public ic(Context context, int i3, int i10, int i11) {
        super(context, i3, i10);
        this.f5318j0 = i11;
    }

    @Override
    public void h() {
        switch (this.f5318j0) {
            case 2:
                boolean z10 = org.telegram.messenger.r2.f25040a;
                return;
            default:
                return;
        }
    }

    @Override
    public void n() {
        switch (this.f5318j0) {
            case 0:
                return;
            default:
                super.n();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f5318j0) {
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
        switch (this.f5318j0) {
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

    public ic(ks0 ks0Var, Context context, int i3, int i10, Context context2) {
        super(context, i3, i10);
        this.f5318j0 = 2;
    }

    private final void p() {
    }
}
