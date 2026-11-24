package defpackage;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
public final class rm8 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public boolean b;
    public final cic c;

    public rm8(cic cicVar) {
        this.c = cicVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = motionEvent.getX() - motionEvent2.getX();
        float y = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x) > gm.Z0(true, 0.4f) && Math.abs(x) / 3.0f > y && this.a && !this.b) {
            this.a = false;
            ku kuVar = new ku(this, x, (byte) 3);
            cic cicVar = this.c;
            ValueAnimator valueAnimator = cicVar.V;
            if (valueAnimator != null) {
                this.b = true;
                gm.d3(kuVar, (valueAnimator.getDuration() - cicVar.V.getCurrentPlayTime()) + 50);
            } else {
                kuVar.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }
}
