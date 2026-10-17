package ei;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.bs;
public final class k6 extends FrameLayout {
    public View f9316a;
    public ArrayList f9317b;
    public j6 f9318c;
    public String d;
    public boolean e;
    public Utilities.Callback f9319f;
    public boolean h;
    public float f9320n;
    public boolean f9321r;
    public ValueAnimator f9322s;

    public final void a(int i10, int i11, String str) {
        h6 h6Var = new h6(this, getContext(), i10, i11);
        h6Var.setContentDescription(str);
        this.f9317b.add(h6Var);
        addView(h6Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f9321r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f9322s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f9321r = z10;
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f9320n;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f9322s = ofFloat;
            ofFloat.addUpdateListener(new ah.c0(this, 29));
            if (this.f9321r) {
                this.f9322s.setDuration(450L);
                this.f9322s.setInterpolator(new LinearInterpolator());
            } else {
                this.f9322s.setDuration(350L);
                this.f9322s.setInterpolator(bs.h);
            }
            this.f9322s.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f9320n = f7;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f9317b;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            h6 h6Var = (h6) arrayList.get(i10);
            if (h6Var.f9160a == 4) {
                if (h6Var.getVisibility() == 0) {
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
        ArrayList arrayList = this.f9317b;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            h6 h6Var = (h6) arrayList.get(i12);
            if (h6Var.f9160a == i10) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                h6Var.setVisibility(i11);
            }
        }
    }

    public final void e() {
        View view = this.f9316a;
        view.setAlpha(this.f9320n);
        view.setTranslationY((1.0f - this.f9320n) * AndroidUtilities.dp(16.0f));
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float f7 = this.f9320n;
            if (this.f9321r) {
                f7 = bs.h.getInterpolation(AndroidUtilities.cascade(f7, i10 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f7);
            childAt.setTranslationY((1.0f - f7) * AndroidUtilities.dp(24.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int C;
        float f7;
        int i14;
        ArrayList arrayList = this.f9317b;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        this.f9316a.layout(0, 0, i15, i16);
        j6 j6Var = this.f9318c;
        j6Var.layout(i15 - j6Var.getMeasuredWidth(), (i16 - this.f9318c.getMeasuredHeight()) / 2, i15, (this.f9318c.getMeasuredHeight() + i16) / 2);
        int dp = (i15 - AndroidUtilities.dp(32.33f)) - this.f9318c.getMeasuredWidth();
        int i17 = 0;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((h6) arrayList.get(i18)).getVisibility() == 0) {
                i17++;
            }
        }
        if (i17 < 2) {
            C = 0;
        } else {
            C = wh.C(40.0f, i17, dp) / (i17 - 1);
        }
        if (c()) {
            f7 = 20.0f;
        } else {
            f7 = 30.0f;
        }
        int min = Math.min(AndroidUtilities.dp(f7), C);
        int B = wh.B(40.0f, i16, 2);
        int dp2 = (AndroidUtilities.dp(40.0f) + i16) / 2;
        int dp3 = AndroidUtilities.dp(12.33f);
        if (!c()) {
            i14 = (wh.C(40.0f, i17, dp) - ((i17 - 1) * min)) / 2;
        } else {
            i14 = 0;
        }
        int i19 = dp3 + i14;
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            if (((h6) arrayList.get(i20)).getVisibility() == 0) {
                ((h6) arrayList.get(i20)).layout(i19, B, AndroidUtilities.dp(40.0f) + i19, dp2);
                i19 = org.telegram.messenger.q.C(40.0f, min, i19);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setOnClickListener(Utilities.Callback<Integer> callback) {
        this.f9319f = callback;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            j6 j6Var = this.f9318c;
            j6Var.f9256s = z10;
            j6Var.invalidate();
        }
    }
}
