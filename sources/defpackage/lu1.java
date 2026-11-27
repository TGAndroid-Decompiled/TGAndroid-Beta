package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class lu1 extends View {
    public final ArrayList a;
    public final ArrayList b;
    public final zu1 c;

    public lu1(zu1 zu1Var, Context context) {
        super(context);
        this.c = zu1Var;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        zu1 zu1Var = this.c;
        arrayList.add(zu1Var.Z1);
        arrayList.add(zu1Var.A0);
        arrayList.add(zu1Var.Z);
        arrayList.add(zu1Var.Z3);
        arrayList.add(zu1Var.X1);
        arrayList.add(zu1Var.m3);
        arrayList.add(zu1Var.a0);
        arrayList.add(zu1Var.y1);
        arrayList.add(zu1Var.U);
        arrayList.add(zu1Var.g2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zu1 zu1Var = this.c;
        zu1Var.nd = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        zu1Var.nd = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        zu1 zu1Var = this.c;
        zu1Var.nd = true;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.b.add(view);
            }
        }
        zu1Var.nd = false;
    }

    @Override
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        a();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f);
            }
        }
    }
}
