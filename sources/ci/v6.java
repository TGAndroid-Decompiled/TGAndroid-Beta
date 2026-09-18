package ci;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.qr;
public final class v6 extends FrameLayout {
    public View f5656a;
    public ArrayList f5657b;
    public u6 f5658c;
    public String d;
    public boolean e;
    public Utilities.Callback f5659f;
    public boolean h;
    public float f5660n;
    public boolean f5661r;
    public ValueAnimator f5662s;

    public final void a(int i10, int i11, String str) {
        t6 t6Var = new t6(this, getContext(), i10, i11);
        t6Var.setContentDescription(str);
        this.f5657b.add(t6Var);
        addView(t6Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f5661r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f5662s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f5661r = z10;
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f5660n;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f5662s = ofFloat;
            ofFloat.addUpdateListener(new ai.a(this, 21));
            if (this.f5661r) {
                this.f5662s.setDuration(450L);
                this.f5662s.setInterpolator(new LinearInterpolator());
            } else {
                this.f5662s.setDuration(350L);
                this.f5662s.setInterpolator(qr.h);
            }
            this.f5662s.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f5660n = f7;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f5657b;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            t6 t6Var = (t6) arrayList.get(i10);
            if (t6Var.f5569a == 4) {
                if (t6Var.getVisibility() == 0) {
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
        ArrayList arrayList = this.f5657b;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            t6 t6Var = (t6) arrayList.get(i12);
            if (t6Var.f5569a == i10) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                t6Var.setVisibility(i11);
            }
        }
    }

    public final void e() {
        View view = this.f5656a;
        view.setAlpha(this.f5660n);
        view.setTranslationY((1.0f - this.f5660n) * AndroidUtilities.dp(16.0f));
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float f7 = this.f5660n;
            if (this.f5661r) {
                f7 = qr.h.getInterpolation(AndroidUtilities.cascade(f7, i10 - 1, getChildCount() - 1, 3.0f));
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
        ArrayList arrayList = this.f5657b;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        this.f5656a.layout(0, 0, i15, i16);
        u6 u6Var = this.f5658c;
        u6Var.layout(i15 - u6Var.getMeasuredWidth(), (i16 - this.f5658c.getMeasuredHeight()) / 2, i15, (this.f5658c.getMeasuredHeight() + i16) / 2);
        int dp = (i15 - AndroidUtilities.dp(32.33f)) - this.f5658c.getMeasuredWidth();
        int i17 = 0;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((t6) arrayList.get(i18)).getVisibility() == 0) {
                i17++;
            }
        }
        if (i17 < 2) {
            B = 0;
        } else {
            B = wh.B(40.0f, i17, dp) / (i17 - 1);
        }
        if (c()) {
            f7 = 20.0f;
        } else {
            f7 = 30.0f;
        }
        int min = Math.min(AndroidUtilities.dp(f7), B);
        int A = wh.A(40.0f, i16, 2);
        int dp2 = (AndroidUtilities.dp(40.0f) + i16) / 2;
        int dp3 = AndroidUtilities.dp(12.33f);
        if (!c()) {
            i14 = (wh.B(40.0f, i17, dp) - ((i17 - 1) * min)) / 2;
        } else {
            i14 = 0;
        }
        int i19 = dp3 + i14;
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            if (((t6) arrayList.get(i20)).getVisibility() == 0) {
                ((t6) arrayList.get(i20)).layout(i19, A, AndroidUtilities.dp(40.0f) + i19, dp2);
                i19 = org.telegram.messenger.q.D(40.0f, min, i19);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setOnClickListener(Utilities.Callback<Integer> callback) {
        this.f5659f = callback;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            u6 u6Var = this.f5658c;
            u6Var.f5629s = z10;
            u6Var.invalidate();
        }
    }
}
