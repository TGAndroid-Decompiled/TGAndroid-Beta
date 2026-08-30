package ih;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class n extends GestureDetector.SimpleOnGestureListener {
    public final View f7642a;
    public final List f7643b;
    public final o f7644c;
    public final p d;

    public n(p pVar, View view, List list, o oVar) {
        this.d = pVar;
        this.f7642a = view;
        this.f7643b = list;
        this.f7644c = oVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f7642a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        p pVar = this.d;
        int i10 = x10 - pVar.f7647c;
        int i11 = paddingTop - pVar.d;
        for (k kVar : this.f7643b) {
            if (kVar.getBounds().contains(i10, i11)) {
                pVar.f7646b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        p pVar = this.d;
        if (pVar.f7646b) {
            View view = this.f7642a;
            view.playSoundEffect(0);
            pVar.f7646b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - pVar.f7647c;
            int i11 = paddingTop - pVar.d;
            for (k kVar : this.f7643b) {
                if (kVar.getBounds().contains(i10, i11)) {
                    this.f7644c.o(kVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
