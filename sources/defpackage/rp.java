package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
public class rp extends SeekBar {
    public final sp a;

    public rp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968924);
        cnb.a(getContext(), this);
        sp spVar = new sp(this);
        this.a = spVar;
        spVar.Q(attributeSet, 2130968924);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        sp spVar = this.a;
        rp rpVar = spVar.r;
        Drawable drawable = spVar.s;
        if (drawable != null && drawable.isStateful() && drawable.setState(rpVar.getDrawableState())) {
            rpVar.invalidateDrawable(drawable);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.f0(canvas);
    }
}
