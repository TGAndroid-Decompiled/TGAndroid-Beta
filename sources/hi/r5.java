package hi;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.i20;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.er;
public final class r5 extends FrameLayout {
    public View f14986a;
    public ArrayList f14987b;
    public q5 f14988c;
    public String d;
    public boolean f14989e;
    public z10 f14990f;
    public boolean h;
    public float f14991n;
    public boolean f14992r;
    public ValueAnimator f14993s;

    public final void a(int i7, int i10, String str) {
        o5 o5Var = new o5(this, getContext(), i7, i10);
        o5Var.setContentDescription(str);
        this.f14987b.add(o5Var);
        addView(o5Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f14992r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f14993s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f14992r = z10;
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f14991n;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f14993s = ofFloat;
            ofFloat.addUpdateListener(new j3(this, 2));
            if (this.f14992r) {
                this.f14993s.setDuration(450L);
                this.f14993s.setInterpolator(new LinearInterpolator());
            } else {
                this.f14993s.setDuration(350L);
                this.f14993s.setInterpolator(er.h);
            }
            this.f14993s.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.f14991n = f10;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f14987b;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                break;
            }
            o5 o5Var = (o5) arrayList.get(i7);
            if (o5Var.f14809a == 4) {
                if (o5Var.getVisibility() == 0) {
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
        ArrayList arrayList = this.f14987b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            o5 o5Var = (o5) arrayList.get(i11);
            if (o5Var.f14809a == i7) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                o5Var.setVisibility(i10);
            }
        }
    }

    public final void e() {
        View view = this.f14986a;
        view.setAlpha(this.f14991n);
        view.setTranslationY((1.0f - this.f14991n) * org.telegram.messenger.g0.L(16.0f));
        for (int i7 = 1; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            float f10 = this.f14991n;
            if (this.f14992r) {
                f10 = er.h.getInterpolation(org.telegram.messenger.g0.s(f10, i7 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f10);
            childAt.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(24.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int A;
        float f10;
        int i13;
        ArrayList arrayList = this.f14987b;
        int i14 = i11 - i7;
        int i15 = i12 - i10;
        this.f14986a.layout(0, 0, i14, i15);
        q5 q5Var = this.f14988c;
        q5Var.layout(i14 - q5Var.getMeasuredWidth(), (i15 - this.f14988c.getMeasuredHeight()) / 2, i14, (this.f14988c.getMeasuredHeight() + i15) / 2);
        int L = (i14 - org.telegram.messenger.g0.L(32.33f)) - this.f14988c.getMeasuredWidth();
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((o5) arrayList.get(i17)).getVisibility() == 0) {
                i16++;
            }
        }
        if (i16 < 2) {
            A = 0;
        } else {
            A = i20.A(40.0f, i16, L) / (i16 - 1);
        }
        if (c()) {
            f10 = 20.0f;
        } else {
            f10 = 30.0f;
        }
        int min = Math.min(org.telegram.messenger.g0.L(f10), A);
        int y10 = i20.y(40.0f, i15, 2);
        int L2 = (org.telegram.messenger.g0.L(40.0f) + i15) / 2;
        int L3 = org.telegram.messenger.g0.L(12.33f);
        if (!c()) {
            i13 = (i20.A(40.0f, i16, L) - ((i16 - 1) * min)) / 2;
        } else {
            i13 = 0;
        }
        int i18 = L3 + i13;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (((o5) arrayList.get(i19)).getVisibility() == 0) {
                ((o5) arrayList.get(i19)).layout(i18, y10, org.telegram.messenger.g0.L(40.0f) + i18, L2);
                i18 = org.telegram.messenger.k5.C(40.0f, min, i18);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }

    public void setOnClickListener(z10 z10Var) {
        this.f14990f = z10Var;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            q5 q5Var = this.f14988c;
            q5Var.f14909s = z10;
            q5Var.invalidate();
        }
    }
}
