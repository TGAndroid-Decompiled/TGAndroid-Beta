package fh;

import android.view.GestureDetector;
import android.view.MotionEvent;

public final class s extends GestureDetector.SimpleOnGestureListener {

    public final t f6157a;

    public s(t tVar) {
        this.f6157a = tVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        t tVar = this.f6157a;
        if (!tVar.f6161e.f6164c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (tVar.f6161e.f6166f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= tVar.f6161e.f6166f.getRight() || tVar.f6161e.f6166f.getTop() >= motionEvent.getY() || motionEvent.getY() >= tVar.f6161e.f6166f.getBottom())) {
            tVar.f6161e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
