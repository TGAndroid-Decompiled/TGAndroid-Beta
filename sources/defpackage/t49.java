package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class t49 implements View.OnLayoutChangeListener {
    public final y59 a;
    public final ArrayList b;
    public final boolean c;
    public final u49 d;
    public final cw6 e;

    public t49(cw6 cw6Var, y59 y59Var, ArrayList arrayList, boolean z, u49 u49Var) {
        this.e = cw6Var;
        this.a = y59Var;
        this.b = arrayList;
        this.c = z;
        this.d = u49Var;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        final ArrayList arrayList;
        int i9;
        int height;
        int i10;
        long min;
        View view2;
        cw6 cw6Var = this.e;
        HashMap hashMap = (HashMap) cw6Var.w;
        r59 r59Var = (r59) cw6Var.e;
        r59Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        r59Var.D0();
        int childCount = r59Var.getChildCount();
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
            View childAt = r59Var.getChildAt(i11);
            arrayList2.add(childAt);
            if (childAt.getTop() < i12) {
                i12 = childAt.getTop();
            }
            if (childAt.getBottom() > i13) {
                i13 = childAt.getBottom();
            }
            if (childAt instanceof mk5) {
                ((mk5) childAt).b(true, false);
            }
            y59 y59Var = this.a;
            if (y59Var != null && (y59Var.b || cw6Var.c)) {
                r59Var.getClass();
                long c = y59Var.c(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(c)) && (view2 = (View) hashMap.get(Long.valueOf(c))) != null) {
                    if (view2 instanceof mk5) {
                        ((mk5) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    nue nueVar = (nue) cw6Var.r;
                    if (nueVar != null) {
                        nueVar.d(view2);
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
                r59Var.addView(view3);
                ((u46) cw6Var.f).L(view3);
            }
            if (view3 instanceof mk5) {
                ((mk5) view3).b(true, true);
            }
        }
        if (i17 == Integer.MAX_VALUE) {
            i9 = 0;
        } else {
            i9 = i17;
        }
        nue nueVar2 = (nue) cw6Var.r;
        if (nueVar2 != null) {
            nueVar2.b();
        }
        if (arrayList.isEmpty()) {
            i10 = Math.abs(i14);
        } else {
            if (this.c) {
                height = -i12;
            } else {
                i15 = r59Var.getHeight() - i9;
                height = i13 - r59Var.getHeight();
            }
            i10 = height + i15;
        }
        final int paddingBottom = r59Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) cw6Var.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) cw6Var.h).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        cw6Var.h = ofFloat;
        final boolean z2 = this.c;
        final int i18 = i10;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z3;
                int i19;
                cw6 cw6Var2 = t49.this.e;
                r59 r59Var2 = (r59) cw6Var2.e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y <= r59Var2.getMeasuredHeight()) {
                        if (z3) {
                            view4.setTranslationY((-i19) * floatValue);
                        } else {
                            view4.setTranslationY(i19 * floatValue);
                        }
                    }
                    i20++;
                }
                int paddingBottom2 = paddingBottom - r59Var2.getPaddingBottom();
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
                r59Var2.invalidate();
                v49 v49Var = (v49) cw6Var2.n;
                if (v49Var != null) {
                    v49Var.e();
                }
            }
        });
        ((ValueAnimator) cw6Var.h).addListener(new ic8(this, arrayList2, (byte) 6));
        long j = 300;
        if (cw6Var.d) {
            if (z) {
                ((ValueAnimator) cw6Var.h).setDuration(150L);
                ((ValueAnimator) cw6Var.h).setInterpolator(d53.g);
            } else {
                long measuredHeight = ((i18 / r59Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j = measuredHeight;
                }
                ((ValueAnimator) cw6Var.h).setDuration(Math.min(j, 1300L));
                ((ValueAnimator) cw6Var.h).setInterpolator(d53.h);
            }
        } else {
            if (z) {
                min = 600;
            } else {
                long measuredHeight2 = ((i18 / r59Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j = measuredHeight2;
                }
                min = Math.min(j, 1300L);
            }
            ((ValueAnimator) cw6Var.h).setDuration(min);
            ((ValueAnimator) cw6Var.h).setInterpolator(d53.h);
        }
        ((ValueAnimator) cw6Var.h).start();
    }
}
