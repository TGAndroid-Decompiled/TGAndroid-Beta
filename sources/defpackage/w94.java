package defpackage;

import android.content.Context;
public final class w94 extends ft4 {
    public final byte j0;

    public w94(gk8 gk8Var, Context context, int i, int i2, Context context2) {
        super(context, i, i2);
        this.j0 = (byte) 4;
    }

    @Override
    public final void g() {
        switch (this.j0) {
            case 4:
                boolean z = e21.a;
                return;
            default:
                return;
        }
    }

    @Override
    public final void n() {
        switch (this.j0) {
            case 5:
                return;
            default:
                super.n();
                return;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.j0) {
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
    public final void onDetachedFromWindow() {
        switch (this.j0) {
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

    public w94(Context context, int i, int i2, byte b) {
        super(context, i, i2);
        this.j0 = b;
    }

    private final void p() {
    }
}
