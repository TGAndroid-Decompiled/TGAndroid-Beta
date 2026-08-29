package gh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class n extends GestureDetector.SimpleOnGestureListener {
    public final View f7444a;
    public final List f7445b;
    public final o f7446c;
    public final p d;

    public n(p pVar, View view, List list, o oVar) {
        this.d = pVar;
        this.f7444a = view;
        this.f7445b = list;
        this.f7446c = oVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f7444a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x4 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        p pVar = this.d;
        int i10 = x4 - pVar.f7449c;
        int i11 = paddingTop - pVar.d;
        for (k kVar : this.f7445b) {
            if (kVar.getBounds().contains(i10, i11)) {
                pVar.f7448b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        p pVar = this.d;
        if (pVar.f7448b) {
            View view = this.f7444a;
            view.playSoundEffect(0);
            pVar.f7448b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x4 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x4 - pVar.f7449c;
            int i11 = paddingTop - pVar.d;
            for (k kVar : this.f7445b) {
                if (kVar.getBounds().contains(i10, i11)) {
                    this.f7446c.m(kVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
