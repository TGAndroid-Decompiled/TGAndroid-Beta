package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
public class d0 extends SeekBar {
    public final e0 f19078a;

    public d0(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        a3.a(this, getContext());
        e0 e0Var = new e0(this);
        this.f19078a = e0Var;
        e0Var.b(attributeSet, i7);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e0 e0Var = this.f19078a;
        d0 d0Var = e0Var.f19083e;
        Drawable drawable = e0Var.f19084f;
        if (drawable != null && drawable.isStateful() && drawable.setState(d0Var.getDrawableState())) {
            d0Var.invalidateDrawable(drawable);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f19078a.f19084f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f19078a.g(canvas);
    }
}
