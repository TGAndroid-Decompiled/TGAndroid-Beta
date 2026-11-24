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
public abstract class om extends LinearLayout {
    public static final Comparator r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new mm((byte) 0)), new mm((byte) 1));
    public final HashMap a;
    public final ArrayList b;
    public final x46 c;
    public boolean d;
    public int e;
    public int f;
    public Runnable h;
    public float n;

    public om(Context context) {
        super(context);
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = new x46(new l0(this, (byte) 18), s33.h, 420L);
    }

    public final void a() {
        this.f = 0;
        this.e = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            nm nmVar = (nm) this.a.get(childAt);
            if (childAt.getVisibility() == 0 && nmVar != null && nmVar.b) {
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
            u46 u46Var = (u46) obj;
            View view = ((nm) u46Var.a).a;
            RectF b = u46Var.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b.left) - view.getLeft());
            }
            g(view, u46Var.c());
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

    public final boolean e(View view) {
        nm nmVar = (nm) this.a.get(view);
        if (nmVar != null && nmVar.b) {
            return true;
        }
        return false;
    }

    public abstract void f();

    public void g(View view, float f) {
        float R1 = gl.R1(0.95f, 1.0f, f);
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

    public w46 getMetadata() {
        return this.c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.e;
    }

    public final void h(View view) {
        nm nmVar = (nm) this.a.get(view);
    }

    public final void i(int i, View view) {
        nm nmVar = (nm) this.a.get(view);
        if (nmVar != null) {
            nmVar.d = i;
        }
    }

    public final void j(View view, boolean z, boolean z2) {
        nm nmVar;
        if (view != null && (nmVar = (nm) this.a.get(view)) != null) {
            View view2 = nmVar.a;
            if (nmVar.b != z) {
                nmVar.b = z;
                if (z) {
                    view2.setVisibility(0);
                } else if (!nmVar.c) {
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
            nm nmVar = (nm) this.a.get(childAt);
            if (nmVar != null) {
                nmVar.e = i5;
                if (childAt.getVisibility() == 0 && nmVar.b) {
                    arrayList.add(nmVar);
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
            ((nm) obj).c = true;
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
        this.a.put(view, new nm(view));
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
