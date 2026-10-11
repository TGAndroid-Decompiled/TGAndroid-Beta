package ci;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ai;
import org.telegram.ui.Components.is;
public final class u6 extends FrameLayout {
    public View f6068a;
    public ArrayList f6069b;
    public t6 f6070c;
    public String d;
    public boolean f6071e;
    public Utilities.Callback f6072f;
    public boolean h;
    public float f6073n;
    public boolean f6074r;
    public ValueAnimator f6075s;

    public final void a(int i10, int i11, String str) {
        s6 s6Var = new s6(this, getContext(), i10, i11);
        s6Var.setContentDescription(str);
        this.f6069b.add(s6Var);
        addView(s6Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f6074r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f6075s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f6074r = z10;
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f6073n;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f6075s = ofFloat;
            ofFloat.addUpdateListener(new ai.a(this, 21));
            if (this.f6074r) {
                this.f6075s.setDuration(450L);
                this.f6075s.setInterpolator(new LinearInterpolator());
            } else {
                this.f6075s.setDuration(350L);
                this.f6075s.setInterpolator(is.h);
            }
            this.f6075s.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f6073n = f7;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f6069b;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            s6 s6Var = (s6) arrayList.get(i10);
            if (s6Var.f5954a == 4) {
                if (s6Var.getVisibility() == 0) {
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
        ArrayList arrayList = this.f6069b;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            s6 s6Var = (s6) arrayList.get(i12);
            if (s6Var.f5954a == i10) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                s6Var.setVisibility(i11);
            }
        }
    }

    public final void e() {
        View view = this.f6068a;
        view.setAlpha(this.f6073n);
        view.setTranslationY((1.0f - this.f6073n) * AndroidUtilities.dp(16.0f));
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float f7 = this.f6073n;
            if (this.f6074r) {
                f7 = is.h.getInterpolation(AndroidUtilities.cascade(f7, i10 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f7);
            childAt.setTranslationY((1.0f - f7) * AndroidUtilities.dp(24.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int B;
        float f7;
        int i14;
        ArrayList arrayList = this.f6069b;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        this.f6068a.layout(0, 0, i15, i16);
        t6 t6Var = this.f6070c;
        t6Var.layout(i15 - t6Var.getMeasuredWidth(), (i16 - this.f6070c.getMeasuredHeight()) / 2, i15, (this.f6070c.getMeasuredHeight() + i16) / 2);
        int dp = (i15 - AndroidUtilities.dp(32.33f)) - this.f6070c.getMeasuredWidth();
        int i17 = 0;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((s6) arrayList.get(i18)).getVisibility() == 0) {
                i17++;
            }
        }
        if (i17 < 2) {
            B = 0;
        } else {
            B = ai.B(40.0f, i17, dp) / (i17 - 1);
        }
        if (c()) {
            f7 = 20.0f;
        } else {
            f7 = 30.0f;
        }
        int min = Math.min(AndroidUtilities.dp(f7), B);
        int A = ai.A(40.0f, i16, 2);
        int dp2 = (AndroidUtilities.dp(40.0f) + i16) / 2;
        int dp3 = AndroidUtilities.dp(12.33f);
        if (!c()) {
            i14 = (ai.B(40.0f, i17, dp) - ((i17 - 1) * min)) / 2;
        } else {
            i14 = 0;
        }
        int i19 = dp3 + i14;
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            if (((s6) arrayList.get(i20)).getVisibility() == 0) {
                ((s6) arrayList.get(i20)).layout(i19, A, AndroidUtilities.dp(40.0f) + i19, dp2);
                i19 = org.telegram.messenger.q.C(40.0f, min, i19);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setOnClickListener(Utilities.Callback<Integer> callback) {
        this.f6072f = callback;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            t6 t6Var = this.f6070c;
            t6Var.f6006s = z10;
            t6Var.invalidate();
        }
    }
}
