package fi;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.xq;
public final class s5 extends FrameLayout {
    public View f12789a;
    public ArrayList f12790b;
    public r5 f12791c;
    public String d;
    public boolean f12792e;
    public c20 f12793f;
    public boolean h;
    public float f12794n;
    public boolean f12795r;
    public ValueAnimator f12796s;

    public final void a(int i7, int i10, String str) {
        q5 q5Var = new q5(this, getContext(), i7, i10);
        q5Var.setContentDescription(str);
        this.f12790b.add(q5Var);
        addView(q5Var);
    }

    public final void b(boolean z9, boolean z10) {
        if (this.f12795r == z9) {
            return;
        }
        ValueAnimator valueAnimator = this.f12796s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f12795r = z9;
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.f12794n;
            if (z9) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f12796s = ofFloat;
            ofFloat.addUpdateListener(new v3(this, 1));
            if (this.f12795r) {
                this.f12796s.setDuration(450L);
                this.f12796s.setInterpolator(new LinearInterpolator());
            } else {
                this.f12796s.setDuration(350L);
                this.f12796s.setInterpolator(xq.h);
            }
            this.f12796s.start();
            return;
        }
        if (z9) {
            f10 = 1.0f;
        }
        this.f12794n = f10;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f12790b;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                break;
            }
            q5 q5Var = (q5) arrayList.get(i7);
            if (q5Var.f12662a == 4) {
                if (q5Var.getVisibility() == 0) {
                    return true;
                }
            } else {
                i7++;
            }
        }
        return false;
    }

    public final void d(int i7, boolean z9) {
        int i10;
        ArrayList arrayList = this.f12790b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            q5 q5Var = (q5) arrayList.get(i11);
            if (q5Var.f12662a == i7) {
                if (z9) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                q5Var.setVisibility(i10);
            }
        }
    }

    public final void e() {
        View view = this.f12789a;
        view.setAlpha(this.f12794n);
        view.setTranslationY((1.0f - this.f12794n) * org.telegram.messenger.g0.L(16.0f));
        for (int i7 = 1; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            float f10 = this.f12794n;
            if (this.f12795r) {
                f10 = xq.h.getInterpolation(org.telegram.messenger.g0.s(f10, i7 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f10);
            childAt.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(24.0f));
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int A;
        float f10;
        int i13;
        ArrayList arrayList = this.f12790b;
        int i14 = i11 - i7;
        int i15 = i12 - i10;
        this.f12789a.layout(0, 0, i14, i15);
        r5 r5Var = this.f12791c;
        r5Var.layout(i14 - r5Var.getMeasuredWidth(), (i15 - this.f12791c.getMeasuredHeight()) / 2, i14, (this.f12791c.getMeasuredHeight() + i15) / 2);
        int L = (i14 - org.telegram.messenger.g0.L(32.33f)) - this.f12791c.getMeasuredWidth();
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((q5) arrayList.get(i17)).getVisibility() == 0) {
                i16++;
            }
        }
        if (i16 < 2) {
            A = 0;
        } else {
            A = org.telegram.messenger.camera.q.A(40.0f, i16, L) / (i16 - 1);
        }
        if (c()) {
            f10 = 20.0f;
        } else {
            f10 = 30.0f;
        }
        int min = Math.min(org.telegram.messenger.g0.L(f10), A);
        int y10 = org.telegram.messenger.camera.q.y(40.0f, i15, 2);
        int L2 = (org.telegram.messenger.g0.L(40.0f) + i15) / 2;
        int L3 = org.telegram.messenger.g0.L(12.33f);
        if (!c()) {
            i13 = (org.telegram.messenger.camera.q.A(40.0f, i16, L) - ((i16 - 1) * min)) / 2;
        } else {
            i13 = 0;
        }
        int i18 = L3 + i13;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (((q5) arrayList.get(i19)).getVisibility() == 0) {
                ((q5) arrayList.get(i19)).layout(i18, y10, org.telegram.messenger.g0.L(40.0f) + i18, L2);
                i18 = org.telegram.messenger.k5.C(40.0f, min, i18);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }

    public void setOnClickListener(c20 c20Var) {
        this.f12793f = c20Var;
    }

    public void setShareEnabled(boolean z9) {
        if (this.h != z9) {
            this.h = z9;
            r5 r5Var = this.f12791c;
            r5Var.f12740s = z9;
            r5Var.invalidate();
        }
    }
}
