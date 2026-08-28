package dg;

import android.content.Context;
public final class q extends ag.j {
    public final int U;

    public q(Context context, int i9, int i10, int i11) {
        super(context, i9, i10);
        this.U = i11;
    }

    @Override
    public void k() {
        switch (this.U) {
            case 1:
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
            default:
                super.onAttachedToWindow();
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
            default:
                super.onDetachedFromWindow();
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
        }
    }

    private final void l() {
    }
}
