package lh;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.er;

public final class i6 extends FrameLayout {

    public View f16109a;

    public ArrayList f16110b;

    public h6 f16111c;
    public String d;

    public boolean f16112e;

    public Utilities.Callback f16113f;
    public boolean h;

    public float f16114n;

    public boolean f16115r;

    public ValueAnimator f16116s;

    public final void a(int i10, int i11, String str) {
        g6 g6Var = new g6(this, getContext(), i10, i11);
        g6Var.setContentDescription(str);
        this.f16110b.add(g6Var);
        addView(g6Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f16115r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f16116s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f16115r = z10;
        if (!z11) {
            this.f16114n = z10 ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f16114n, z10 ? 1.0f : 0.0f);
        this.f16116s = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new m2(this, 4));
        if (this.f16115r) {
            this.f16116s.setDuration(450L);
            this.f16116s.setInterpolator(new LinearInterpolator());
        } else {
            this.f16116s.setDuration(350L);
            this.f16116s.setInterpolator(er.h);
        }
        this.f16116s.start();
    }

    public final boolean c() {
        ArrayList arrayList = this.f16110b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g6 g6Var = (g6) arrayList.get(i10);
            if (g6Var.f16037a == 4) {
                if (g6Var.getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d(int i10, boolean z10) {
        ArrayList arrayList = this.f16110b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            g6 g6Var = (g6) arrayList.get(i11);
            if (g6Var.f16037a == i10) {
                g6Var.setVisibility(z10 ? 0 : 8);
            }
        }
    }

    public final void e() {
        View view = this.f16109a;
        view.setAlpha(this.f16114n);
        view.setTranslationY((1.0f - this.f16114n) * AndroidUtilities.dp(16.0f));
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float interpolation = this.f16114n;
            if (this.f16115r) {
                interpolation = er.h.getInterpolation(AndroidUtilities.cascade(interpolation, i10 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(interpolation);
            childAt.setTranslationY((1.0f - interpolation) * AndroidUtilities.dp(24.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.f16110b;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        this.f16109a.layout(0, 0, i14, i15);
        h6 h6Var = this.f16111c;
        h6Var.layout(i14 - h6Var.getMeasuredWidth(), (i15 - this.f16111c.getMeasuredHeight()) / 2, i14, (this.f16111c.getMeasuredHeight() + i15) / 2);
        int iDp = (i14 - AndroidUtilities.dp(32.33f)) - this.f16111c.getMeasuredWidth();
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((g6) arrayList.get(i17)).getVisibility() == 0) {
                i16++;
            }
        }
        int iMin = Math.min(AndroidUtilities.dp(c() ? 20.0f : 30.0f), i16 < 2 ? 0 : rl.z(40.0f, i16, iDp) / (i16 - 1));
        int iX = rl.x(40.0f, i15, 2);
        int iDp2 = (AndroidUtilities.dp(40.0f) + i15) / 2;
        int iDp3 = AndroidUtilities.dp(12.33f) + (!c() ? (rl.z(40.0f, i16, iDp) - ((i16 - 1) * iMin)) / 2 : 0);
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((g6) arrayList.get(i18)).getVisibility() == 0) {
                ((g6) arrayList.get(i18)).layout(iDp3, iX, AndroidUtilities.dp(40.0f) + iDp3, iDp2);
                iDp3 = org.telegram.messenger.y1.C(40.0f, iMin, iDp3);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setOnClickListener(Utilities.Callback<Integer> callback) {
        this.f16113f = callback;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            h6 h6Var = this.f16111c;
            h6Var.f16072s = z10;
            h6Var.invalidate();
        }
    }
}
