package defpackage;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
public final class co8 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public boolean b;
    public final gkc c;

    public co8(gkc gkcVar) {
        this.c = gkcVar;
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
        if (Math.abs(x) > hl.Z0(true, 0.4f) && Math.abs(x) / 3.0f > y && this.a && !this.b) {
            this.a = false;
            jt jtVar = new jt(this, x, (byte) 3);
            gkc gkcVar = this.c;
            ValueAnimator valueAnimator = gkcVar.V;
            if (valueAnimator != null) {
                this.b = true;
                hl.d3(jtVar, (valueAnimator.getDuration() - gkcVar.V.getCurrentPlayTime()) + 50);
            } else {
                jtVar.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }
}
