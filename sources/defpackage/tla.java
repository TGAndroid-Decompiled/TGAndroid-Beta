package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class tla extends GestureDetector.SimpleOnGestureListener {
    public final View a;
    public final ArrayList b;
    public final ula c;
    public final mk0 d;

    public tla(mk0 mk0Var, View view, ArrayList arrayList, ula ulaVar) {
        this.d = mk0Var;
        this.a = view;
        this.b = arrayList;
        this.c = ulaVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        mk0 mk0Var = this.d;
        int i = x - mk0Var.b;
        int i2 = paddingTop - mk0Var.c;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((qla) obj).getBounds().contains(i, i2)) {
                mk0Var.a = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        mk0 mk0Var = this.d;
        if (mk0Var.a) {
            View view = this.a;
            view.playSoundEffect(0);
            mk0Var.a = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i = x - mk0Var.b;
            int i2 = paddingTop - mk0Var.c;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                qla qlaVar = (qla) obj;
                if (qlaVar.getBounds().contains(i, i2)) {
                    this.c.e(qlaVar, i, i2);
                    return true;
                }
            }
        }
        return false;
    }
}
