package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class f69 implements View.OnLayoutChangeListener {
    public final j79 a;
    public final ArrayList b;
    public final boolean c;
    public final g69 d;
    public final hw6 e;

    public f69(hw6 hw6Var, j79 j79Var, ArrayList arrayList, boolean z, g69 g69Var) {
        this.e = hw6Var;
        this.a = j79Var;
        this.b = arrayList;
        this.c = z;
        this.d = g69Var;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        final ArrayList arrayList;
        int i9;
        int height;
        int i10;
        long min;
        View view2;
        hw6 hw6Var = this.e;
        HashMap hashMap = (HashMap) hw6Var.w;
        d79 d79Var = (d79) hw6Var.e;
        d79Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        d79Var.E0();
        int childCount = d79Var.getChildCount();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z = false;
        while (true) {
            arrayList = this.b;
            if (i11 >= childCount) {
                break;
            }
            View childAt = d79Var.getChildAt(i11);
            arrayList2.add(childAt);
            if (childAt.getTop() < i12) {
                i12 = childAt.getTop();
            }
            if (childAt.getBottom() > i13) {
                i13 = childAt.getBottom();
            }
            if (childAt instanceof pk5) {
                ((pk5) childAt).b(true, false);
            }
            j79 j79Var = this.a;
            if (j79Var != null && (j79Var.b || hw6Var.c)) {
                d79Var.getClass();
                long c = j79Var.c(RecyclerView.S(childAt));
                if (hashMap.containsKey(Long.valueOf(c)) && (view2 = (View) hashMap.get(Long.valueOf(c))) != null) {
                    if (view2 instanceof pk5) {
                        ((pk5) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    cxe cxeVar = (cxe) hw6Var.r;
                    if (cxeVar != null) {
                        cxeVar.d(view2);
                    }
                    int top = childAt.getTop() - view2.getTop();
                    if (top != 0) {
                        i14 = top;
                    }
                    z = true;
                }
            }
            i11++;
        }
        hashMap.clear();
        int size = arrayList.size();
        int i15 = 0;
        int i16 = 0;
        int i17 = Integer.MAX_VALUE;
        while (i16 < size) {
            Object obj = arrayList.get(i16);
            i16++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i15) {
                i15 = bottom;
            }
            if (top2 < i17) {
                i17 = top2;
            }
            if (view3.getParent() == null) {
                d79Var.addView(view3);
                ((x46) hw6Var.f).L(view3);
            }
            if (view3 instanceof pk5) {
                ((pk5) view3).b(true, true);
            }
        }
        if (i17 == Integer.MAX_VALUE) {
            i9 = 0;
        } else {
            i9 = i17;
        }
        cxe cxeVar2 = (cxe) hw6Var.r;
        if (cxeVar2 != null) {
            cxeVar2.b();
        }
        if (arrayList.isEmpty()) {
            i10 = Math.abs(i14);
        } else {
            if (this.c) {
                height = -i12;
            } else {
                i15 = d79Var.getHeight() - i9;
                height = i13 - d79Var.getHeight();
            }
            i10 = height + i15;
        }
        final int paddingBottom = d79Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) hw6Var.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) hw6Var.h).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        hw6Var.h = ofFloat;
        final boolean z2 = this.c;
        final int i18 = i10;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z3;
                int i19;
                hw6 hw6Var2 = f69.this.e;
                d79 d79Var2 = (d79) hw6Var2.e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i20 = 0;
                while (true) {
                    z3 = z2;
                    i19 = i18;
                    if (i20 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i20);
                    float y = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y <= d79Var2.getMeasuredHeight()) {
                        if (z3) {
                            view4.setTranslationY((-i19) * floatValue);
                        } else {
                            view4.setTranslationY(i19 * floatValue);
                        }
                    }
                    i20++;
                }
                int paddingBottom2 = paddingBottom - d79Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i21 = 0; i21 < size3; i21++) {
                    View view5 = (View) arrayList4.get(i21);
                    if (z3) {
                        view5.setTranslationY(((1.0f - floatValue) * i19) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i19));
                    }
                }
                d79Var2.invalidate();
                h69 h69Var = (h69) hw6Var2.n;
                if (h69Var != null) {
                    h69Var.f();
                }
            }
        });
        ((ValueAnimator) hw6Var.h).addListener(new wd8(this, arrayList2, (byte) 6));
        long j = 300;
        if (hw6Var.d) {
            if (z) {
                ((ValueAnimator) hw6Var.h).setDuration(150L);
                ((ValueAnimator) hw6Var.h).setInterpolator(k43.g);
            } else {
                long measuredHeight = ((i18 / d79Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j = measuredHeight;
                }
                ((ValueAnimator) hw6Var.h).setDuration(Math.min(j, 1300L));
                ((ValueAnimator) hw6Var.h).setInterpolator(k43.h);
            }
        } else {
            if (z) {
                min = 600;
            } else {
                long measuredHeight2 = ((i18 / d79Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j = measuredHeight2;
                }
                min = Math.min(j, 1300L);
            }
            ((ValueAnimator) hw6Var.h).setDuration(min);
            ((ValueAnimator) hw6Var.h).setInterpolator(k43.h);
        }
        ((ValueAnimator) hw6Var.h).start();
    }
}
