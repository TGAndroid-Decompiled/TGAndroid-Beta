package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class yk8 extends FrameLayout {
    public View a;
    public ArrayList b;
    public xk8 c;
    public String d;
    public boolean e;
    public qac f;
    public boolean h;
    public float n;
    public boolean r;
    public ValueAnimator s;

    public final void a(int i, int i2, String str) {
        vk8 vk8Var = new vk8(this, getContext(), i, i2);
        vk8Var.setContentDescription(str);
        this.b.add(vk8Var);
        addView(vk8Var);
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
            ofFloat.addUpdateListener(new fx7(this, (byte) 12));
            boolean z3 = this.r;
            ValueAnimator valueAnimator2 = this.s;
            if (z3) {
                valueAnimator2.setDuration(450L);
                this.s.setInterpolator(new LinearInterpolator());
            } else {
                valueAnimator2.setDuration(350L);
                this.s.setInterpolator(d53.h);
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
            vk8 vk8Var = (vk8) arrayList.get(i);
            if (vk8Var.a == 4) {
                if (vk8Var.getVisibility() == 0) {
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
            vk8 vk8Var = (vk8) arrayList.get(i3);
            if (vk8Var.a == i) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                vk8Var.setVisibility(i2);
            }
        }
    }

    public final void e() {
        View view = this.a;
        view.setAlpha(this.n);
        view.setTranslationY((1.0f - this.n) * gm.L(16.0f));
        for (int i = 1; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            float f = this.n;
            if (this.r) {
                f = d53.h.getInterpolation(gm.s(f, i - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f);
            childAt.setTranslationY((1.0f - f) * gm.L(24.0f));
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
        xk8 xk8Var = this.c;
        xk8Var.layout(i6 - xk8Var.getMeasuredWidth(), (i7 - this.c.getMeasuredHeight()) / 2, i6, (this.c.getMeasuredHeight() + i7) / 2);
        int L2 = (i6 - gm.L(32.33f)) - this.c.getMeasuredWidth();
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (((vk8) arrayList.get(i9)).getVisibility() == 0) {
                i8++;
            }
        }
        if (i8 < 2) {
            L = 0;
        } else {
            L = (L2 - (gm.L(40.0f) * i8)) / (i8 - 1);
        }
        if (c()) {
            f = 20.0f;
        } else {
            f = 30.0f;
        }
        int min = Math.min(gm.L(f), L);
        int D = wi8.D(40.0f, i7, 2);
        int L3 = (gm.L(40.0f) + i7) / 2;
        int L4 = gm.L(12.33f);
        if (!c()) {
            i5 = ((L2 - (gm.L(40.0f) * i8)) - ((i8 - 1) * min)) / 2;
        } else {
            i5 = 0;
        }
        int i10 = L4 + i5;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((vk8) arrayList.get(i11)).getVisibility() == 0) {
                ((vk8) arrayList.get(i11)).layout(i10, D, gm.L(40.0f) + i10, L3);
                i10 = hg9.v(40.0f, min, i10);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(52.0f), 1073741824));
    }

    public void setOnClickListener(qac qacVar) {
        this.f = qacVar;
    }

    public void setShareEnabled(boolean z) {
        if (this.h != z) {
            this.h = z;
            xk8 xk8Var = this.c;
            xk8Var.s = z;
            xk8Var.invalidate();
        }
    }
}
