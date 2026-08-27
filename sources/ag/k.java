package ag;

import android.content.Context;

public final class k extends bg.i {
    public final int U;

    public k(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.U = i12;
    }

    @Override
    public void k() {
        switch (this.U) {
            case 3:
                break;
            default:
                super.k();
                break;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.U) {
            case 0:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 1:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 2:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 3:
            default:
                super.onAttachedToWindow();
                break;
            case 4:
                super.onAttachedToWindow();
                setPaused(false);
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.U) {
            case 0:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 1:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 2:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 3:
            default:
                super.onDetachedFromWindow();
                break;
            case 4:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
        }
    }

    private final void l() {
    }
}
