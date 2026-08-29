package hh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class s extends GestureDetector.SimpleOnGestureListener {
    public final t f8104a;

    public s(t tVar) {
        this.f8104a = tVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        t tVar = this.f8104a;
        if (!tVar.f8108e.f8111c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (tVar.f8108e.f8113f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= tVar.f8108e.f8113f.getRight() || tVar.f8108e.f8113f.getTop() >= motionEvent.getY() || motionEvent.getY() >= tVar.f8108e.f8113f.getBottom())) {
            tVar.f8108e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
