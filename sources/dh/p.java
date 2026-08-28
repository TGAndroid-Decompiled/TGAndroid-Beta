package dh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class p extends GestureDetector.SimpleOnGestureListener {
    public final View f4656a;
    public final List f4657b;
    public final q f4658c;
    public final r d;

    public p(r rVar, View view, List list, q qVar) {
        this.d = rVar;
        this.f4656a = view;
        this.f4657b = list;
        this.f4658c = qVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f4656a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        r rVar = this.d;
        int i9 = x10 - rVar.f4661c;
        int i10 = paddingTop - rVar.d;
        for (l lVar : this.f4657b) {
            if (lVar.getBounds().contains(i9, i10)) {
                rVar.f4660b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        r rVar = this.d;
        if (rVar.f4660b) {
            View view = this.f4656a;
            view.playSoundEffect(0);
            rVar.f4660b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i9 = x10 - rVar.f4661c;
            int i10 = paddingTop - rVar.d;
            for (l lVar : this.f4657b) {
                if (lVar.getBounds().contains(i9, i10)) {
                    this.f4658c.e(lVar, i9, i10);
                    return true;
                }
            }
        }
        return false;
    }
}
