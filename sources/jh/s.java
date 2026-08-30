package jh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class s extends GestureDetector.SimpleOnGestureListener {
    public final t f9465a;

    public s(t tVar) {
        this.f9465a = tVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        t tVar = this.f9465a;
        if (!tVar.e.f9471c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (tVar.e.f9472f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= tVar.e.f9472f.getRight() || tVar.e.f9472f.getTop() >= motionEvent.getY() || motionEvent.getY() >= tVar.e.f9472f.getBottom())) {
            tVar.e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
