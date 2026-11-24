package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
public final class tu7 extends r59 implements jm7 {
    public final Path f3;
    public gu2 g3;

    public tu7(Context context) {
        super(context, null);
        this.f3 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new u46());
        setAdapter(new y59());
        setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        setClipToPadding(false);
    }

    @Override
    public final Integer W0(int i) {
        return 285212671;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.G5) {
            getAdapter().f();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        gu2 gu2Var = this.g3;
        if (gu2Var != null) {
            Path path = this.f3;
            gu2Var.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.g3 != null) {
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.G5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.G5);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, wi8.E(16.0f, gm.L(48.0f) * Math.min(ru7.a().size(), 6), 1073741824));
    }

    public void setMaskProvider(gu2 gu2Var) {
        this.g3 = gu2Var;
        invalidate();
    }
}
