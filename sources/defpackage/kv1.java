package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class kv1 extends View {
    public final ArrayList a;
    public final ArrayList b;
    public final yv1 c;

    public kv1(yv1 yv1Var, Context context) {
        super(context);
        this.c = yv1Var;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        yv1 yv1Var = this.c;
        arrayList.add(yv1Var.Z1);
        arrayList.add(yv1Var.A0);
        arrayList.add(yv1Var.Z);
        arrayList.add(yv1Var.Z3);
        arrayList.add(yv1Var.X1);
        arrayList.add(yv1Var.m3);
        arrayList.add(yv1Var.a0);
        arrayList.add(yv1Var.y1);
        arrayList.add(yv1Var.U);
        arrayList.add(yv1Var.g2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yv1 yv1Var = this.c;
        yv1Var.kd = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        yv1Var.kd = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        yv1 yv1Var = this.c;
        yv1Var.kd = true;
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
        yv1Var.kd = false;
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
