package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
public class d0 extends SeekBar {
    public final e0 f16914a;

    public d0(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        d3.a(this, getContext());
        e0 e0Var = new e0(this);
        this.f16914a = e0Var;
        e0Var.b(attributeSet, i9);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e0 e0Var = this.f16914a;
        d0 d0Var = e0Var.f16925e;
        Drawable drawable = e0Var.f16926f;
        if (drawable != null && drawable.isStateful() && drawable.setState(d0Var.getDrawableState())) {
            d0Var.invalidateDrawable(drawable);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f16914a.f16926f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f16914a.g(canvas);
    }
}
