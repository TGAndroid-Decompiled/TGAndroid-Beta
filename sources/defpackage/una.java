package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class una extends GestureDetector.SimpleOnGestureListener {
    public final View a;
    public final ArrayList b;
    public final vna c;
    public final ml0 d;

    public una(ml0 ml0Var, View view, ArrayList arrayList, vna vnaVar) {
        this.d = ml0Var;
        this.a = view;
        this.b = arrayList;
        this.c = vnaVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        ml0 ml0Var = this.d;
        int i = x - ml0Var.b;
        int i2 = paddingTop - ml0Var.c;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((rna) obj).getBounds().contains(i, i2)) {
                ml0Var.a = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ml0 ml0Var = this.d;
        if (ml0Var.a) {
            View view = this.a;
            view.playSoundEffect(0);
            ml0Var.a = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i = x - ml0Var.b;
            int i2 = paddingTop - ml0Var.c;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                rna rnaVar = (rna) obj;
                if (rnaVar.getBounds().contains(i, i2)) {
                    this.c.d(rnaVar, i, i2);
                    return true;
                }
            }
        }
        return false;
    }
}
