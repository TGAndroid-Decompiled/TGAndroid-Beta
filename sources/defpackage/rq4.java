package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class rq4 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public wc5 d;
    public final ArrayList e;
    public int f;
    public int h;
    public int n;
    public final sq4 r;

    public rq4(sq4 sq4Var, Context context) {
        super(context);
        this.r = sq4Var;
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.f = -1;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList;
        int D;
        byte b;
        int i3;
        byte b2;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int L = size - gm.L(26.0f);
        int L2 = gm.L(10.0f);
        int L3 = gm.L(10.0f);
        byte b3 = 0;
        if (!this.b) {
            this.n = 0;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            arrayList = this.c;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (!(childAt instanceof wc5)) {
                b2 = b3;
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), 1073741824));
                ArrayList arrayList2 = this.e;
                boolean contains = arrayList2.contains(childAt);
                if (!contains) {
                    b2 = b3;
                    if (childAt.getMeasuredWidth() + i5 > L) {
                        L2 = hg9.v(8.0f, childAt.getMeasuredHeight(), L2);
                        i5 = b2;
                    }
                } else {
                    b2 = b3;
                }
                if (childAt.getMeasuredWidth() + i6 > L) {
                    L3 = hg9.v(8.0f, childAt.getMeasuredHeight(), L3);
                    i6 = b2;
                }
                int L4 = gm.L(13.0f) + i5;
                if (!this.b) {
                    if (contains) {
                        childAt.setTranslationX(gm.L(13.0f) + i6);
                        childAt.setTranslationY(L3);
                    } else if (!arrayList2.isEmpty()) {
                        float f = L4;
                        if (childAt.getTranslationX() != f) {
                            float[] fArr = new float[1];
                            fArr[b2] = f;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, fArr));
                        }
                        float f2 = L2;
                        if (childAt.getTranslationY() != f2) {
                            float[] fArr2 = new float[1];
                            fArr2[b2] = f2;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr2));
                        }
                        this.n = Math.max(this.n, L2);
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                        this.n = Math.max(this.n, L2);
                    }
                }
                if (!contains) {
                    i5 = hg9.v(9.0f, childAt.getMeasuredWidth(), i5);
                }
                i6 = hg9.v(9.0f, childAt.getMeasuredWidth(), i6);
            }
            i4++;
            b3 = b2;
        }
        byte b4 = b3;
        if (gm.O1()) {
            D = gm.L(372.0f) / 3;
        } else {
            Point point = gm.q;
            D = wi8.D(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i5 < D) {
            L2 += gm.L(40.0f);
        }
        if (L - i6 < D) {
            L3 += gm.L(40.0f);
        }
        boolean z = this.b;
        sq4 sq4Var = this.r;
        if (!z) {
            int L5 = gm.L(42.0f) + L3;
            sq4Var.n = L2;
            if (this.a != null) {
                this.h = gm.L(42.0f) + L2;
                this.a.playTogether(arrayList);
                b = b4;
                this.a.addListener(new qq4(this, b));
                this.f = nm7.f(sq4Var.a).p(null, this.f, true);
                this.a.start();
                this.b = true;
            } else {
                b = b4;
                this.h = L5;
            }
        } else {
            b = b4;
        }
        int i7 = this.n;
        if (i7 > 0) {
            i3 = gm.L(40.0f) + i7;
        } else {
            i3 = b;
        }
        sq4Var.e = i3;
        setMeasuredDimension(size, this.h);
        pq4 pq4Var = sq4Var.f;
        if (pq4Var != null) {
            pq4Var.a(sq4Var.e);
        }
    }
}
