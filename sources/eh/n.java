package eh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

public final class n extends GestureDetector.SimpleOnGestureListener {

    public final View f5552a;

    public final List f5553b;

    public final o f5554c;
    public final p d;

    public n(p pVar, View view, List list, o oVar) {
        this.d = pVar;
        this.f5552a = view;
        this.f5553b = list;
        this.f5554c = oVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        int x8 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        View view = this.f5552a;
        int scrollY = view.getScrollY() + y10;
        int paddingLeft = x8 - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        p pVar = this.d;
        int i10 = paddingLeft - pVar.f5557c;
        int i11 = paddingTop - pVar.d;
        Iterator it = this.f5553b.iterator();
        while (it.hasNext()) {
            if (((k) it.next()).getBounds().contains(i10, i11)) {
                pVar.f5556b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        p pVar = this.d;
        if (pVar.f5556b) {
            View view = this.f5552a;
            view.playSoundEffect(0);
            pVar.f5556b = false;
            int x8 = (int) motionEvent.getX();
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int paddingLeft = x8 - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = paddingLeft - pVar.f5557c;
            int i11 = paddingTop - pVar.d;
            for (k kVar : this.f5553b) {
                if (kVar.getBounds().contains(i10, i11)) {
                    this.f5554c.i(kVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
