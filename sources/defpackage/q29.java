package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class q29 implements View.OnLayoutChangeListener {
    public final w39 a;
    public final ArrayList b;
    public final boolean c;
    public final r29 d;
    public final cu6 e;

    public q29(cu6 cu6Var, w39 w39Var, ArrayList arrayList, boolean z, r29 r29Var) {
        this.e = cu6Var;
        this.a = w39Var;
        this.b = arrayList;
        this.c = z;
        this.d = r29Var;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        final ArrayList arrayList;
        int i9;
        int height;
        int i10;
        long min;
        View view2;
        cu6 cu6Var = this.e;
        HashMap hashMap = (HashMap) cu6Var.w;
        o39 o39Var = (o39) cu6Var.e;
        o39Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        o39Var.D0();
        int childCount = o39Var.getChildCount();
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
            View childAt = o39Var.getChildAt(i11);
            arrayList2.add(childAt);
            if (childAt.getTop() < i12) {
                i12 = childAt.getTop();
            }
            if (childAt.getBottom() > i13) {
                i13 = childAt.getBottom();
            }
            if (childAt instanceof ni5) {
                ((ni5) childAt).b(true, false);
            }
            w39 w39Var = this.a;
            if (w39Var != null && (w39Var.b || cu6Var.c)) {
                o39Var.getClass();
                long c = w39Var.c(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(c)) && (view2 = (View) hashMap.get(Long.valueOf(c))) != null) {
                    if (view2 instanceof ni5) {
                        ((ni5) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    kse kseVar = (kse) cu6Var.r;
                    if (kseVar != null) {
                        kseVar.d(view2);
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
                o39Var.addView(view3);
                ((t26) cu6Var.f).L(view3);
            }
            if (view3 instanceof ni5) {
                ((ni5) view3).b(true, true);
            }
        }
        if (i17 == Integer.MAX_VALUE) {
            i9 = 0;
        } else {
            i9 = i17;
        }
        kse kseVar2 = (kse) cu6Var.r;
        if (kseVar2 != null) {
            kseVar2.b();
        }
        if (arrayList.isEmpty()) {
            i10 = Math.abs(i14);
        } else {
            if (this.c) {
                height = -i12;
            } else {
                i15 = o39Var.getHeight() - i9;
                height = i13 - o39Var.getHeight();
            }
            i10 = height + i15;
        }
        final int paddingBottom = o39Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) cu6Var.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) cu6Var.h).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        cu6Var.h = ofFloat;
        final boolean z2 = this.c;
        final int i18 = i10;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z3;
                int i19;
                cu6 cu6Var2 = q29.this.e;
                o39 o39Var2 = (o39) cu6Var2.e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y <= o39Var2.getMeasuredHeight()) {
                        if (z3) {
                            view4.setTranslationY((-i19) * floatValue);
                        } else {
                            view4.setTranslationY(i19 * floatValue);
                        }
                    }
                    i20++;
                }
                int paddingBottom2 = paddingBottom - o39Var2.getPaddingBottom();
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
                o39Var2.invalidate();
                s29 s29Var = (s29) cu6Var2.n;
                if (s29Var != null) {
                    s29Var.f();
                }
            }
        });
        ((ValueAnimator) cu6Var.h).addListener(new eh8(this, arrayList2, (byte) 5));
        long j = 300;
        if (cu6Var.d) {
            if (z) {
                ((ValueAnimator) cu6Var.h).setDuration(150L);
                ((ValueAnimator) cu6Var.h).setInterpolator(s33.g);
            } else {
                long measuredHeight = ((i18 / o39Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j = measuredHeight;
                }
                ((ValueAnimator) cu6Var.h).setDuration(Math.min(j, 1300L));
                ((ValueAnimator) cu6Var.h).setInterpolator(s33.h);
            }
        } else {
            if (z) {
                min = 600;
            } else {
                long measuredHeight2 = ((i18 / o39Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j = measuredHeight2;
                }
                min = Math.min(j, 1300L);
            }
            ((ValueAnimator) cu6Var.h).setDuration(min);
            ((ValueAnimator) cu6Var.h).setInterpolator(s33.h);
        }
        ((ValueAnimator) cu6Var.h).start();
    }
}
