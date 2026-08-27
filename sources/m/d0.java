package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class d0 extends SeekBar {

    public final e0 f17289a;

    public d0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968924);
        d3.a(this, getContext());
        e0 e0Var = new e0(this);
        this.f17289a = e0Var;
        e0Var.b(attributeSet, 2130968924);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e0 e0Var = this.f17289a;
        d0 d0Var = e0Var.f17300e;
        Drawable drawable = e0Var.f17301f;
        if (drawable != null && drawable.isStateful() && drawable.setState(d0Var.getDrawableState())) {
            d0Var.invalidateDrawable(drawable);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f17289a.f17301f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f17289a.g(canvas);
    }
}
