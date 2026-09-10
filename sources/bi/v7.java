package bi;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.ui.Components.wr;
public final class v7 extends FrameLayout {
    public View f3791a;
    public ArrayList f3792b;
    public u7 f3793c;
    public String d;
    public boolean e;
    public Utilities.Callback f3794f;
    public boolean h;
    public float f3795n;
    public boolean f3796r;
    public ValueAnimator f3797s;

    public final void a(int i10, int i11, String str) {
        t7 t7Var = new t7(this, getContext(), i10, i11);
        t7Var.setContentDescription(str);
        this.f3792b.add(t7Var);
        addView(t7Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f3796r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f3797s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f3796r = z10;
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f3795n;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f3797s = ofFloat;
            ofFloat.addUpdateListener(new ai.a(this, 7));
            if (this.f3796r) {
                this.f3797s.setDuration(450L);
                this.f3797s.setInterpolator(new LinearInterpolator());
            } else {
                this.f3797s.setDuration(350L);
                this.f3797s.setInterpolator(wr.h);
            }
            this.f3797s.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f3795n = f7;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f3792b;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            t7 t7Var = (t7) arrayList.get(i10);
            if (t7Var.f3683a == 4) {
                if (t7Var.getVisibility() == 0) {
                    return true;
                }
            } else {
                i10++;
            }
        }
        return false;
    }

    public final void d(int i10, boolean z10) {
        int i11;
        ArrayList arrayList = this.f3792b;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            t7 t7Var = (t7) arrayList.get(i12);
            if (t7Var.f3683a == i10) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                t7Var.setVisibility(i11);
            }
        }
    }

    public final void e() {
        View view = this.f3791a;
        view.setAlpha(this.f3795n);
        view.setTranslationY((1.0f - this.f3795n) * AndroidUtilities.dp(16.0f));
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float f7 = this.f3795n;
            if (this.f3796r) {
                f7 = wr.h.getInterpolation(AndroidUtilities.cascade(f7, i10 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f7);
            childAt.setTranslationY((1.0f - f7) * AndroidUtilities.dp(24.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int A;
        float f7;
        int i14;
        ArrayList arrayList = this.f3792b;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        this.f3791a.layout(0, 0, i15, i16);
        u7 u7Var = this.f3793c;
        u7Var.layout(i15 - u7Var.getMeasuredWidth(), (i16 - this.f3793c.getMeasuredHeight()) / 2, i15, (this.f3793c.getMeasuredHeight() + i16) / 2);
        int dp = (i15 - AndroidUtilities.dp(32.33f)) - this.f3793c.getMeasuredWidth();
        int i17 = 0;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((t7) arrayList.get(i18)).getVisibility() == 0) {
                i17++;
            }
        }
        if (i17 < 2) {
            A = 0;
        } else {
            A = em.A(40.0f, i17, dp) / (i17 - 1);
        }
        if (c()) {
            f7 = 20.0f;
        } else {
            f7 = 30.0f;
        }
        int min = Math.min(AndroidUtilities.dp(f7), A);
        int y3 = em.y(40.0f, i16, 2);
        int dp2 = (AndroidUtilities.dp(40.0f) + i16) / 2;
        int dp3 = AndroidUtilities.dp(12.33f);
        if (!c()) {
            i14 = (em.A(40.0f, i17, dp) - ((i17 - 1) * min)) / 2;
        } else {
            i14 = 0;
        }
        int i19 = dp3 + i14;
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            if (((t7) arrayList.get(i20)).getVisibility() == 0) {
                ((t7) arrayList.get(i20)).layout(i19, y3, AndroidUtilities.dp(40.0f) + i19, dp2);
                i19 = org.telegram.messenger.a2.C(40.0f, min, i19);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setOnClickListener(Utilities.Callback<Integer> callback) {
        this.f3794f = callback;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            u7 u7Var = this.f3793c;
            u7Var.f3728s = z10;
            u7Var.invalidate();
        }
    }
}
