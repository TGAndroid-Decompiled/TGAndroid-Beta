package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
public class rq extends SeekBar {
    public final sq a;

    public rq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968924);
        dpb.a(getContext(), this);
        sq sqVar = new sq(this);
        this.a = sqVar;
        sqVar.E(attributeSet, 2130968924);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        sq sqVar = this.a;
        rq rqVar = sqVar.r;
        Drawable drawable = sqVar.s;
        if (drawable != null && drawable.isStateful() && drawable.setState(rqVar.getDrawableState())) {
            rqVar.invalidateDrawable(drawable);
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
