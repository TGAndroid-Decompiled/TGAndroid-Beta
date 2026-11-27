package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class im8 extends FrameLayout {
    public View a;
    public ArrayList b;
    public hm8 c;
    public String d;
    public boolean e;
    public pcc f;
    public boolean h;
    public float n;
    public boolean r;
    public ValueAnimator s;

    public final void a(int i, int i2, String str) {
        gm8 gm8Var = new gm8(this, getContext(), i, i2);
        gm8Var.setContentDescription(str);
        this.b.add(gm8Var);
        addView(gm8Var);
    }

    public final void b(boolean z, boolean z2) {
        if (this.r == z) {
            return;
        }
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.r = z;
        float f = 0.0f;
        if (z2) {
            float f2 = this.n;
            if (z) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new pv7(this, (byte) 13));
            boolean z3 = this.r;
            ValueAnimator valueAnimator2 = this.s;
            if (z3) {
                valueAnimator2.setDuration(450L);
                this.s.setInterpolator(new LinearInterpolator());
            } else {
                valueAnimator2.setDuration(350L);
                this.s.setInterpolator(k43.h);
            }
            this.s.start();
            return;
        }
        if (z) {
            f = 1.0f;
        }
        this.n = f;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.b;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            }
            gm8 gm8Var = (gm8) arrayList.get(i);
            if (gm8Var.a == 4) {
                if (gm8Var.getVisibility() == 0) {
                    return true;
                }
            } else {
                i++;
            }
        }
        return false;
    }

    public final void d(int i, boolean z) {
        int i2;
        ArrayList arrayList = this.b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            gm8 gm8Var = (gm8) arrayList.get(i3);
            if (gm8Var.a == i) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                gm8Var.setVisibility(i2);
            }
        }
    }

    public final void e() {
        View view = this.a;
        view.setAlpha(this.n);
        view.setTranslationY((1.0f - this.n) * hl.L(16.0f));
        for (int i = 1; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            float f = this.n;
            if (this.r) {
                f = k43.h.getInterpolation(hl.s(f, i - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f);
            childAt.setTranslationY((1.0f - f) * hl.L(24.0f));
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        float f;
        int i5;
        ArrayList arrayList = this.b;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        this.a.layout(0, 0, i6, i7);
        hm8 hm8Var = this.c;
        hm8Var.layout(i6 - hm8Var.getMeasuredWidth(), (i7 - this.c.getMeasuredHeight()) / 2, i6, (this.c.getMeasuredHeight() + i7) / 2);
        int L2 = (i6 - hl.L(32.33f)) - this.c.getMeasuredWidth();
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (((gm8) arrayList.get(i9)).getVisibility() == 0) {
                i8++;
            }
        }
        if (i8 < 2) {
            L = 0;
        } else {
            L = (L2 - (hl.L(40.0f) * i8)) / (i8 - 1);
        }
        if (c()) {
            f = 20.0f;
        } else {
            f = 30.0f;
        }
        int min = Math.min(hl.L(f), L);
        int D = ik8.D(40.0f, i7, 2);
        int L3 = (hl.L(40.0f) + i7) / 2;
        int L4 = hl.L(12.33f);
        if (!c()) {
            i5 = ((L2 - (hl.L(40.0f) * i8)) - ((i8 - 1) * min)) / 2;
        } else {
            i5 = 0;
        }
        int i10 = L4 + i5;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((gm8) arrayList.get(i11)).getVisibility() == 0) {
                ((gm8) arrayList.get(i11)).layout(i10, D, hl.L(40.0f) + i10, L3);
                i10 = uh9.w(40.0f, min, i10);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(52.0f), 1073741824));
    }

    public void setOnClickListener(pcc pccVar) {
        this.f = pccVar;
    }

    public void setShareEnabled(boolean z) {
        if (this.h != z) {
            this.h = z;
            hm8 hm8Var = this.c;
            hm8Var.s = z;
            hm8Var.invalidate();
        }
    }
}
