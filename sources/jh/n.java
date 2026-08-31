package jh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class n extends GestureDetector.SimpleOnGestureListener {
    public final View f10174a;
    public final List f10175b;
    public final o f10176c;
    public final p d;

    public n(p pVar, View view, List list, o oVar) {
        this.d = pVar;
        this.f10174a = view;
        this.f10175b = list;
        this.f10176c = oVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f10174a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        p pVar = this.d;
        int i10 = x10 - pVar.f10179c;
        int i11 = paddingTop - pVar.d;
        for (k kVar : this.f10175b) {
            if (kVar.getBounds().contains(i10, i11)) {
                pVar.f10178b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        p pVar = this.d;
        if (pVar.f10178b) {
            View view = this.f10174a;
            view.playSoundEffect(0);
            pVar.f10178b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - pVar.f10179c;
            int i11 = paddingTop - pVar.d;
            for (k kVar : this.f10175b) {
                if (kVar.getBounds().contains(i10, i11)) {
                    this.f10176c.o(kVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
