package hi;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.o10;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.nr;
public final class p5 extends FrameLayout {
    public View f15175a;
    public ArrayList f15176b;
    public o5 f15177c;
    public String d;
    public boolean f15178e;
    public y10 f15179f;
    public boolean h;
    public float f15180n;
    public boolean f15181r;
    public ValueAnimator f15182s;

    public final void a(int i7, int i10, String str) {
        n5 n5Var = new n5(this, getContext(), i7, i10);
        n5Var.setContentDescription(str);
        this.f15176b.add(n5Var);
        addView(n5Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f15181r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f15182s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f15181r = z10;
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f15180n;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f15182s = ofFloat;
            ofFloat.addUpdateListener(new j3(this, 2));
            if (this.f15181r) {
                this.f15182s.setDuration(450L);
                this.f15182s.setInterpolator(new LinearInterpolator());
            } else {
                this.f15182s.setDuration(350L);
                this.f15182s.setInterpolator(nr.h);
            }
            this.f15182s.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.f15180n = f10;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f15176b;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                break;
            }
            n5 n5Var = (n5) arrayList.get(i7);
            if (n5Var.f15071a == 4) {
                if (n5Var.getVisibility() == 0) {
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
        ArrayList arrayList = this.f15176b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            n5 n5Var = (n5) arrayList.get(i11);
            if (n5Var.f15071a == i7) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                n5Var.setVisibility(i10);
            }
        }
    }

    public final void e() {
        View view = this.f15175a;
        view.setAlpha(this.f15180n);
        view.setTranslationY((1.0f - this.f15180n) * org.telegram.messenger.g0.L(16.0f));
        for (int i7 = 1; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            float f10 = this.f15180n;
            if (this.f15181r) {
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
        ArrayList arrayList = this.f15176b;
        int i14 = i11 - i7;
        int i15 = i12 - i10;
        this.f15175a.layout(0, 0, i14, i15);
        o5 o5Var = this.f15177c;
        o5Var.layout(i14 - o5Var.getMeasuredWidth(), (i15 - this.f15177c.getMeasuredHeight()) / 2, i14, (this.f15177c.getMeasuredHeight() + i15) / 2);
        int L = (i14 - org.telegram.messenger.g0.L(32.33f)) - this.f15177c.getMeasuredWidth();
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((n5) arrayList.get(i17)).getVisibility() == 0) {
                i16++;
            }
        }
        if (i16 < 2) {
            B = 0;
        } else {
            B = o10.B(40.0f, i16, L) / (i16 - 1);
        }
        if (c()) {
            f10 = 20.0f;
        } else {
            f10 = 30.0f;
        }
        int min = Math.min(org.telegram.messenger.g0.L(f10), B);
        int z11 = o10.z(40.0f, i15, 2);
        int L2 = (org.telegram.messenger.g0.L(40.0f) + i15) / 2;
        int L3 = org.telegram.messenger.g0.L(12.33f);
        if (!c()) {
            i13 = (o10.B(40.0f, i16, L) - ((i16 - 1) * min)) / 2;
        } else {
            i13 = 0;
        }
        int i18 = L3 + i13;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (((n5) arrayList.get(i19)).getVisibility() == 0) {
                ((n5) arrayList.get(i19)).layout(i18, z11, org.telegram.messenger.g0.L(40.0f) + i18, L2);
                i18 = org.telegram.messenger.f3.C(40.0f, min, i18);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }

    public void setOnClickListener(y10 y10Var) {
        this.f15179f = y10Var;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            o5 o5Var = this.f15177c;
            o5Var.f15124s = z10;
            o5Var.invalidate();
        }
    }
}
