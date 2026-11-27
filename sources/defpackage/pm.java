package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
public abstract class pm extends LinearLayout {
    public static final Comparator r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new nm((byte) 0)), new nm((byte) 1));
    public final HashMap a;
    public final ArrayList b;
    public final b76 c;
    public boolean d;
    public int e;
    public int f;
    public Runnable h;
    public float n;

    public pm(Context context) {
        super(context);
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = new b76(new m0(this, (byte) 18), k43.h, 420L);
    }

    public final void a() {
        this.f = 0;
        this.e = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            om omVar = (om) this.a.get(childAt);
            if (childAt.getVisibility() == 0 && omVar != null && omVar.b) {
                this.e = childAt.getMeasuredWidth() + this.e;
                this.f = childAt.getMeasuredHeight() + this.f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.c.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y66 y66Var = (y66) obj;
            View view = ((om) y66Var.a).a;
            RectF b = y66Var.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b.left) - view.getLeft());
            }
            g(view, y66Var.c());
        }
        float f = getMetadata().g.a;
        if (this.n != f) {
            this.n = f;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f) {
        return (f * getMetadata().c.a) + getMetadata().g.a;
    }

    public final boolean d(View view) {
        om omVar = (om) this.a.get(view);
        if (omVar != null && omVar.b) {
            return true;
        }
        return false;
    }

    public abstract void f();

    public void g(View view, float f) {
        float R1 = hl.R1(0.95f, 1.0f, f);
        view.setAlpha(f);
        view.setScaleX(R1);
        view.setScaleY(R1);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.c.b.size();
    }

    public a76 getMetadata() {
        return this.c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.e;
    }

    public final void h(View view) {
        om omVar = (om) this.a.get(view);
    }

    public final void i(int i, View view) {
        om omVar = (om) this.a.get(view);
        if (omVar != null) {
            omVar.d = i;
        }
    }

    public final void j(View view, boolean z, boolean z2) {
        om omVar;
        if (view != null && (omVar = (om) this.a.get(view)) != null) {
            View view2 = omVar.a;
            if (omVar.b != z) {
                omVar.b = z;
                if (z) {
                    view2.setVisibility(0);
                } else if (!omVar.c) {
                    view2.setVisibility(8);
                }
                if (!z2) {
                    this.d = true;
                }
                requestLayout();
            }
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ArrayList arrayList = this.b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            om omVar = (om) this.a.get(childAt);
            if (omVar != null) {
                omVar.e = i5;
                if (childAt.getVisibility() == 0 && omVar.b) {
                    arrayList.add(omVar);
                }
            }
        }
        Collections.sort(arrayList, r);
        this.c.m(arrayList, !this.d);
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((om) obj).c = true;
        }
        this.d = false;
        b();
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a();
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        view.setVisibility(8);
        this.a.put(view, new om(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
