package kg;

import android.content.Context;
import org.telegram.messenger.v2;
import org.telegram.ui.du0;
public final class h extends lg.q {
    public final int f11097i0;

    public h(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.f11097i0 = i12;
    }

    @Override
    public void h() {
        switch (this.f11097i0) {
            case 4:
                boolean z10 = v2.f18448a;
                return;
            default:
                return;
        }
    }

    @Override
    public void n() {
        switch (this.f11097i0) {
            case 5:
                return;
            default:
                super.n();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f11097i0) {
            case 0:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            case 1:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            case 2:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            case 3:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f11097i0) {
            case 0:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            case 1:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            case 2:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            case 3:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    public h(du0 du0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.f11097i0 = 4;
    }

    private final void p() {
    }
}
