package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
public class e0 extends SeekBar {
    public final f0 f14823a;

    public e0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d3.a(this, getContext());
        f0 f0Var = new f0(this);
        this.f14823a = f0Var;
        f0Var.b(attributeSet, i10);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f0 f0Var = this.f14823a;
        e0 e0Var = f0Var.e;
        Drawable drawable = f0Var.f14829f;
        if (drawable != null && drawable.isStateful() && drawable.setState(e0Var.getDrawableState())) {
            e0Var.invalidateDrawable(drawable);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14823a.f14829f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f14823a.g(canvas);
    }
}
