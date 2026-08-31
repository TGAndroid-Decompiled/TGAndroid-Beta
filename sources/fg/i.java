package fg;

import android.content.Context;
public final class i extends gg.i {
    public final int V;

    public i(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.V = i12;
    }

    @Override
    public void k() {
        switch (this.V) {
            case 3:
                return;
            default:
                super.k();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.V) {
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
        switch (this.V) {
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
