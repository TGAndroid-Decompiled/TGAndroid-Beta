package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class qpa extends GestureDetector.SimpleOnGestureListener {
    public final View a;
    public final ArrayList b;
    public final rpa c;
    public final nk0 d;

    public qpa(nk0 nk0Var, View view, ArrayList arrayList, rpa rpaVar) {
        this.d = nk0Var;
        this.a = view;
        this.b = arrayList;
        this.c = rpaVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        nk0 nk0Var = this.d;
        int i = x - nk0Var.b;
        int i2 = paddingTop - nk0Var.c;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((npa) obj).getBounds().contains(i, i2)) {
                nk0Var.a = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        nk0 nk0Var = this.d;
        if (nk0Var.a) {
            View view = this.a;
            view.playSoundEffect(0);
            nk0Var.a = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i = x - nk0Var.b;
            int i2 = paddingTop - nk0Var.c;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                npa npaVar = (npa) obj;
                if (npaVar.getBounds().contains(i, i2)) {
                    this.c.d(npaVar, i, i2);
                    return true;
                }
            }
        }
        return false;
    }
}
