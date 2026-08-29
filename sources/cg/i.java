package cg;

import android.content.Context;
public final class i extends dg.i {
    public final int U;

    public i(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.U = i12;
    }

    @Override
    public void k() {
        switch (this.U) {
            case 3:
                return;
            default:
                super.k();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.U) {
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
            default:
                super.onAttachedToWindow();
                return;
            case 4:
                super.onAttachedToWindow();
                setPaused(false);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.U) {
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
            default:
                super.onDetachedFromWindow();
                return;
            case 4:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
        }
    }

    private final void l() {
    }
}
