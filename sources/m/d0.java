package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
public class d0 extends SeekBar {
    public final e0 f16513a;

    public d0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d3.a(this, getContext());
        e0 e0Var = new e0(this);
        this.f16513a = e0Var;
        e0Var.b(attributeSet, i10);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e0 e0Var = this.f16513a;
        d0 d0Var = e0Var.f16524e;
        Drawable drawable = e0Var.f16525f;
        if (drawable != null && drawable.isStateful() && drawable.setState(d0Var.getDrawableState())) {
            d0Var.invalidateDrawable(drawable);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f16513a.f16525f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f16513a.g(canvas);
    }
}
