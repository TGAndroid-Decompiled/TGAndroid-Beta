package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class wn2 extends FrameLayout implements snb {
    public final de0 a;

    public wn2(Context context) {
        super(context);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(20.0f));
        addView(de0Var, tre.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = aob.R0;
        de0 de0Var = this.a;
        br3.a(canvas, drawable, (de0Var.getWidth() / 2.0f) + de0Var.getLeft(), (de0Var.getHeight() / 2.0f) + de0Var.getTop(), de0Var.getHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(136.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
