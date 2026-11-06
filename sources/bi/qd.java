package bi;

import android.content.Context;
import org.telegram.ui.us0;
public final class qd extends vg.m {
    public final int f4597i0;

    public qd(Context context, int i7, int i10, int i11) {
        super(context, i7, i10);
        this.f4597i0 = i11;
    }

    @Override
    public void h() {
        switch (this.f4597i0) {
            case 2:
                boolean z9 = org.telegram.messenger.r2.f25199a;
                return;
            default:
                return;
        }
    }

    @Override
    public void n() {
        switch (this.f4597i0) {
            case 0:
                return;
            default:
                super.n();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f4597i0) {
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
        switch (this.f4597i0) {
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

    public qd(us0 us0Var, Context context, int i7, int i10, Context context2) {
        super(context, i7, i10);
        this.f4597i0 = 2;
    }

    private final void p() {
    }
}
