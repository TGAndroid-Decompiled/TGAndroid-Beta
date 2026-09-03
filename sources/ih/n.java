package ih;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class n extends GestureDetector.SimpleOnGestureListener {
    public final View f7624a;
    public final List f7625b;
    public final o f7626c;
    public final p d;

    public n(p pVar, View view, List list, o oVar) {
        this.d = pVar;
        this.f7624a = view;
        this.f7625b = list;
        this.f7626c = oVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f7624a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        p pVar = this.d;
        int i10 = x10 - pVar.f7629c;
        int i11 = paddingTop - pVar.d;
        for (k kVar : this.f7625b) {
            if (kVar.getBounds().contains(i10, i11)) {
                pVar.f7628b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        p pVar = this.d;
        if (pVar.f7628b) {
            View view = this.f7624a;
            view.playSoundEffect(0);
            pVar.f7628b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - pVar.f7629c;
            int i11 = paddingTop - pVar.d;
            for (k kVar : this.f7625b) {
                if (kVar.getBounds().contains(i10, i11)) {
                    this.f7626c.o(kVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
