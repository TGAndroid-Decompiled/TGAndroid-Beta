package nh;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jr;
public final class w5 extends FrameLayout {
    public View f18788a;
    public ArrayList f18789b;
    public v5 f18790c;
    public String d;
    public boolean f18791e;
    public Utilities.Callback f18792f;
    public boolean h;
    public float f18793n;
    public boolean f18794r;
    public ValueAnimator f18795s;

    public final void a(int i10, int i11, String str) {
        u5 u5Var = new u5(this, getContext(), i10, i11);
        u5Var.setContentDescription(str);
        this.f18789b.add(u5Var);
        addView(u5Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f18794r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f18795s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f18794r = z10;
        float f9 = 0.0f;
        if (z11) {
            float f10 = this.f18793n;
            if (z10) {
                f9 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.f18795s = ofFloat;
            ofFloat.addUpdateListener(new lh.d5(this, 10));
            if (this.f18794r) {
                this.f18795s.setDuration(450L);
                this.f18795s.setInterpolator(new LinearInterpolator());
            } else {
                this.f18795s.setDuration(350L);
                this.f18795s.setInterpolator(jr.h);
            }
            this.f18795s.start();
            return;
        }
        if (z10) {
            f9 = 1.0f;
        }
        this.f18793n = f9;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f18789b;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            u5 u5Var = (u5) arrayList.get(i10);
            if (u5Var.f18720a == 4) {
                if (u5Var.getVisibility() == 0) {
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
        ArrayList arrayList = this.f18789b;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            u5 u5Var = (u5) arrayList.get(i12);
            if (u5Var.f18720a == i10) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                u5Var.setVisibility(i11);
            }
        }
    }

    public final void e() {
        View view = this.f18788a;
        view.setAlpha(this.f18793n);
        view.setTranslationY((1.0f - this.f18793n) * AndroidUtilities.dp(16.0f));
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float f9 = this.f18793n;
            if (this.f18794r) {
                f9 = jr.h.getInterpolation(AndroidUtilities.cascade(f9, i10 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f9);
            childAt.setTranslationY((1.0f - f9) * AndroidUtilities.dp(24.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int z11;
        float f9;
        int i14;
        ArrayList arrayList = this.f18789b;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        this.f18788a.layout(0, 0, i15, i16);
        v5 v5Var = this.f18790c;
        v5Var.layout(i15 - v5Var.getMeasuredWidth(), (i16 - this.f18790c.getMeasuredHeight()) / 2, i15, (this.f18790c.getMeasuredHeight() + i16) / 2);
        int dp = (i15 - AndroidUtilities.dp(32.33f)) - this.f18790c.getMeasuredWidth();
        int i17 = 0;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((u5) arrayList.get(i18)).getVisibility() == 0) {
                i17++;
            }
        }
        if (i17 < 2) {
            z11 = 0;
        } else {
            z11 = org.telegram.ui.b.z(40.0f, i17, dp) / (i17 - 1);
        }
        if (c()) {
            f9 = 20.0f;
        } else {
            f9 = 30.0f;
        }
        int min = Math.min(AndroidUtilities.dp(f9), z11);
        int x4 = org.telegram.ui.b.x(40.0f, i16, 2);
        int dp2 = (AndroidUtilities.dp(40.0f) + i16) / 2;
        int dp3 = AndroidUtilities.dp(12.33f);
        if (!c()) {
            i14 = (org.telegram.ui.b.z(40.0f, i17, dp) - ((i17 - 1) * min)) / 2;
        } else {
            i14 = 0;
        }
        int i19 = dp3 + i14;
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            if (((u5) arrayList.get(i20)).getVisibility() == 0) {
                ((u5) arrayList.get(i20)).layout(i19, x4, AndroidUtilities.dp(40.0f) + i19, dp2);
                i19 = org.telegram.messenger.x3.C(40.0f, min, i19);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setOnClickListener(Utilities.Callback<Integer> callback) {
        this.f18792f = callback;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            v5 v5Var = this.f18790c;
            v5Var.f18756s = z10;
            v5Var.invalidate();
        }
    }
}
