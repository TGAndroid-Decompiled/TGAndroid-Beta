package hi;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.m10;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.kr;
public final class z5 extends FrameLayout {
    public View f15910a;
    public ArrayList f15911b;
    public y5 f15912c;
    public String d;
    public boolean f15913e;
    public w10 f15914f;
    public boolean h;
    public float f15915n;
    public boolean f15916r;
    public ValueAnimator f15917s;

    public final void a(int i7, int i10, String str) {
        x5 x5Var = new x5(this, getContext(), i7, i10);
        x5Var.setContentDescription(str);
        this.f15911b.add(x5Var);
        addView(x5Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f15916r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f15917s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f15916r = z10;
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f15915n;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f15917s = ofFloat;
            ofFloat.addUpdateListener(new s3(this, 2));
            if (this.f15916r) {
                this.f15917s.setDuration(450L);
                this.f15917s.setInterpolator(new LinearInterpolator());
            } else {
                this.f15917s.setDuration(350L);
                this.f15917s.setInterpolator(kr.h);
            }
            this.f15917s.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.f15915n = f10;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f15911b;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                break;
            }
            x5 x5Var = (x5) arrayList.get(i7);
            if (x5Var.f15720a == 4) {
                if (x5Var.getVisibility() == 0) {
                    return true;
                }
            } else {
                i7++;
            }
        }
        return false;
    }

    public final void d(int i7, boolean z10) {
        int i10;
        ArrayList arrayList = this.f15911b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            x5 x5Var = (x5) arrayList.get(i11);
            if (x5Var.f15720a == i7) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                x5Var.setVisibility(i10);
            }
        }
    }

    public final void e() {
        View view = this.f15910a;
        view.setAlpha(this.f15915n);
        view.setTranslationY((1.0f - this.f15915n) * org.telegram.messenger.g0.L(16.0f));
        for (int i7 = 1; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            float f10 = this.f15915n;
            if (this.f15916r) {
                f10 = kr.h.getInterpolation(org.telegram.messenger.g0.s(f10, i7 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f10);
            childAt.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(24.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int B;
        float f10;
        int i13;
        ArrayList arrayList = this.f15911b;
        int i14 = i11 - i7;
        int i15 = i12 - i10;
        this.f15910a.layout(0, 0, i14, i15);
        y5 y5Var = this.f15912c;
        y5Var.layout(i14 - y5Var.getMeasuredWidth(), (i15 - this.f15912c.getMeasuredHeight()) / 2, i14, (this.f15912c.getMeasuredHeight() + i15) / 2);
        int L = (i14 - org.telegram.messenger.g0.L(32.33f)) - this.f15912c.getMeasuredWidth();
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((x5) arrayList.get(i17)).getVisibility() == 0) {
                i16++;
            }
        }
        if (i16 < 2) {
            B = 0;
        } else {
            B = m10.B(40.0f, i16, L) / (i16 - 1);
        }
        if (c()) {
            f10 = 20.0f;
        } else {
            f10 = 30.0f;
        }
        int min = Math.min(org.telegram.messenger.g0.L(f10), B);
        int z11 = m10.z(40.0f, i15, 2);
        int L2 = (org.telegram.messenger.g0.L(40.0f) + i15) / 2;
        int L3 = org.telegram.messenger.g0.L(12.33f);
        if (!c()) {
            i13 = (m10.B(40.0f, i16, L) - ((i16 - 1) * min)) / 2;
        } else {
            i13 = 0;
        }
        int i18 = L3 + i13;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (((x5) arrayList.get(i19)).getVisibility() == 0) {
                ((x5) arrayList.get(i19)).layout(i18, z11, org.telegram.messenger.g0.L(40.0f) + i18, L2);
                i18 = org.telegram.messenger.f3.C(40.0f, min, i18);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }

    public void setOnClickListener(w10 w10Var) {
        this.f15914f = w10Var;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            y5 y5Var = this.f15912c;
            y5Var.f15872s = z10;
            y5Var.invalidate();
        }
    }
}
