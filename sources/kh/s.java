package kh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class s extends GestureDetector.SimpleOnGestureListener {
    public final t f11288a;

    public s(t tVar) {
        this.f11288a = tVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        t tVar = this.f11288a;
        if (!tVar.f11292e.f11295c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (tVar.f11292e.f11297f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= tVar.f11292e.f11297f.getRight() || tVar.f11292e.f11297f.getTop() >= motionEvent.getY() || motionEvent.getY() >= tVar.f11292e.f11297f.getBottom())) {
            tVar.f11292e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
