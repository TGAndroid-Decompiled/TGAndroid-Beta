package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
public class c0 extends SeekBar {
    public final d0 f20027a;

    public c0(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        z2.a(this, getContext());
        d0 d0Var = new d0(this);
        this.f20027a = d0Var;
        d0Var.b(attributeSet, i7);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d0 d0Var = this.f20027a;
        c0 c0Var = d0Var.f20032e;
        Drawable drawable = d0Var.f20033f;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0Var.getDrawableState())) {
            c0Var.invalidateDrawable(drawable);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f20027a.f20033f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f20027a.g(canvas);
    }
}
