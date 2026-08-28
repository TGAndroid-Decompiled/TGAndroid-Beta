package eh;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class u extends GestureDetector.SimpleOnGestureListener {
    public final v f5230a;

    public u(v vVar) {
        this.f5230a = vVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        v vVar = this.f5230a;
        if (!vVar.f5234e.f5237c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (vVar.f5234e.f5239f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= vVar.f5234e.f5239f.getRight() || vVar.f5234e.f5239f.getTop() >= motionEvent.getY() || motionEvent.getY() >= vVar.f5234e.f5239f.getBottom())) {
            vVar.f5234e.e(false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
