package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
public class sp extends SeekBar {
    public final tp a;

    public sp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968924);
        brb.a(getContext(), this);
        tp tpVar = new tp(this);
        this.a = tpVar;
        tpVar.z(attributeSet, 2130968924);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        tp tpVar = this.a;
        sp spVar = tpVar.r;
        Drawable drawable = tpVar.s;
        if (drawable != null && drawable.isStateful() && drawable.setState(spVar.getDrawableState())) {
            spVar.invalidateDrawable(drawable);
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
        this.a.a0(canvas);
    }
}
