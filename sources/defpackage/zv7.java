package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
public final class zv7 extends d79 implements fn7 {
    public final Path f3;
    public pt2 g3;

    public zv7(Context context) {
        super(context, null);
        this.f3 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new x46());
        setAdapter(new j79());
        setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        setClipToPadding(false);
    }

    @Override
    public final Integer X0(int i) {
        return 285212671;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.F5) {
            getAdapter().f();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        pt2 pt2Var = this.g3;
        if (pt2Var != null) {
            Path path = this.f3;
            pt2Var.accept(path);
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
        jn7.e().b(this, jn7.F5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.F5);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, ik8.E(16.0f, hl.L(48.0f) * Math.min(xv7.a().size(), 6), 1073741824));
    }

    public void setMaskProvider(pt2 pt2Var) {
        this.g3 = pt2Var;
        invalidate();
    }
}
