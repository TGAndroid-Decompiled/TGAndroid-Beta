package ai;

import android.content.Context;
public final class zd extends tg.n {
    public final int f2561i0;

    public zd(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.f2561i0 = i12;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f2561i0) {
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
            case 4:
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
        switch (this.f2561i0) {
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
            case 4:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void p() {
        switch (this.f2561i0) {
            case 0:
                return;
            default:
                super.p();
                return;
        }
    }

    private final void r() {
    }
}
