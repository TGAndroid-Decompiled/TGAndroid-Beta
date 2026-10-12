package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
public class c0 extends SeekBar {
    public final d0 f15393a;

    public c0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b3.a(this, getContext());
        d0 d0Var = new d0(this);
        this.f15393a = d0Var;
        d0Var.b(attributeSet, i10);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d0 d0Var = this.f15393a;
        c0 c0Var = d0Var.f15398e;
        Drawable drawable = d0Var.f15399f;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0Var.getDrawableState())) {
            c0Var.invalidateDrawable(drawable);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f15393a.f15399f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f15393a.g(canvas);
    }
}
