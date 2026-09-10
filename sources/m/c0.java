package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
public class c0 extends SeekBar {
    public final d0 f12976a;

    public c0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a3.a(this, getContext());
        d0 d0Var = new d0(this);
        this.f12976a = d0Var;
        d0Var.b(attributeSet, i10);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d0 d0Var = this.f12976a;
        c0 c0Var = d0Var.e;
        Drawable drawable = d0Var.f12984f;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0Var.getDrawableState())) {
            c0Var.invalidateDrawable(drawable);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f12976a.f12984f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f12976a.g(canvas);
    }
}
