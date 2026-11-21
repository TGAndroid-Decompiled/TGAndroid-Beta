package hi;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.n10;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.nr;
public final class o5 extends FrameLayout {
    public View f15210a;
    public ArrayList f15211b;
    public n5 f15212c;
    public String d;
    public boolean f15213e;
    public x10 f15214f;
    public boolean h;
    public float f15215n;
    public boolean f15216r;
    public ValueAnimator f15217s;

    public final void a(int i7, int i10, String str) {
        m5 m5Var = new m5(this, getContext(), i7, i10);
        m5Var.setContentDescription(str);
        this.f15211b.add(m5Var);
        addView(m5Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f15216r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f15217s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f15216r = z10;
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f15215n;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f15217s = ofFloat;
            ofFloat.addUpdateListener(new j3(this, 2));
            if (this.f15216r) {
                this.f15217s.setDuration(450L);
                this.f15217s.setInterpolator(new LinearInterpolator());
            } else {
                this.f15217s.setDuration(350L);
                this.f15217s.setInterpolator(nr.h);
            }
            this.f15217s.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.f15215n = f10;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f15211b;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                break;
            }
            m5 m5Var = (m5) arrayList.get(i7);
            if (m5Var.f15020a == 4) {
                if (m5Var.getVisibility() == 0) {
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
        ArrayList arrayList = this.f15211b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            m5 m5Var = (m5) arrayList.get(i11);
            if (m5Var.f15020a == i7) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                m5Var.setVisibility(i10);
            }
        }
    }

    public final void e() {
        View view = this.f15210a;
        view.setAlpha(this.f15215n);
        view.setTranslationY((1.0f - this.f15215n) * org.telegram.messenger.g0.L(16.0f));
        for (int i7 = 1; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            float f10 = this.f15215n;
            if (this.f15216r) {
                f10 = nr.h.getInterpolation(org.telegram.messenger.g0.s(f10, i7 - 1, getChildCount() - 1, 3.0f));
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
        ArrayList arrayList = this.f15211b;
        int i14 = i11 - i7;
        int i15 = i12 - i10;
        this.f15210a.layout(0, 0, i14, i15);
        n5 n5Var = this.f15212c;
        n5Var.layout(i14 - n5Var.getMeasuredWidth(), (i15 - this.f15212c.getMeasuredHeight()) / 2, i14, (this.f15212c.getMeasuredHeight() + i15) / 2);
        int L = (i14 - org.telegram.messenger.g0.L(32.33f)) - this.f15212c.getMeasuredWidth();
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((m5) arrayList.get(i17)).getVisibility() == 0) {
                i16++;
            }
        }
        if (i16 < 2) {
            B = 0;
        } else {
            B = n10.B(40.0f, i16, L) / (i16 - 1);
        }
        if (c()) {
            f10 = 20.0f;
        } else {
            f10 = 30.0f;
        }
        int min = Math.min(org.telegram.messenger.g0.L(f10), B);
        int z11 = n10.z(40.0f, i15, 2);
        int L2 = (org.telegram.messenger.g0.L(40.0f) + i15) / 2;
        int L3 = org.telegram.messenger.g0.L(12.33f);
        if (!c()) {
            i13 = (n10.B(40.0f, i16, L) - ((i16 - 1) * min)) / 2;
        } else {
            i13 = 0;
        }
        int i18 = L3 + i13;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (((m5) arrayList.get(i19)).getVisibility() == 0) {
                ((m5) arrayList.get(i19)).layout(i18, z11, org.telegram.messenger.g0.L(40.0f) + i18, L2);
                i18 = org.telegram.messenger.f3.C(40.0f, min, i18);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }

    public void setOnClickListener(x10 x10Var) {
        this.f15214f = x10Var;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            n5 n5Var = this.f15212c;
            n5Var.f15099s = z10;
            n5Var.invalidate();
        }
    }
}
