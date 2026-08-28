package kh;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.gr;
public final class k6 extends FrameLayout {
    public View f15520a;
    public ArrayList f15521b;
    public j6 f15522c;
    public String d;
    public boolean f15523e;
    public Utilities.Callback f15524f;
    public boolean h;
    public float f15525n;
    public boolean f15526r;
    public ValueAnimator f15527s;

    public final void a(int i9, int i10, String str) {
        i6 i6Var = new i6(this, getContext(), i9, i10);
        i6Var.setContentDescription(str);
        this.f15521b.add(i6Var);
        addView(i6Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f15526r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f15527s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f15526r = z10;
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f15525n;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f15527s = ofFloat;
            ofFloat.addUpdateListener(new g4(this, 1));
            if (this.f15526r) {
                this.f15527s.setDuration(450L);
                this.f15527s.setInterpolator(new LinearInterpolator());
            } else {
                this.f15527s.setDuration(350L);
                this.f15527s.setInterpolator(gr.h);
            }
            this.f15527s.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.f15525n = f10;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f15521b;
        int i9 = 0;
        while (true) {
            if (i9 >= arrayList.size()) {
                break;
            }
            i6 i6Var = (i6) arrayList.get(i9);
            if (i6Var.f15428a == 4) {
                if (i6Var.getVisibility() == 0) {
                    return true;
                }
            } else {
                i9++;
            }
        }
        return false;
    }

    public final void d(int i9, boolean z10) {
        int i10;
        ArrayList arrayList = this.f15521b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i6 i6Var = (i6) arrayList.get(i11);
            if (i6Var.f15428a == i9) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                i6Var.setVisibility(i10);
            }
        }
    }

    public final void e() {
        View view = this.f15520a;
        view.setAlpha(this.f15525n);
        view.setTranslationY((1.0f - this.f15525n) * AndroidUtilities.dp(16.0f));
        for (int i9 = 1; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            float f10 = this.f15525n;
            if (this.f15526r) {
                f10 = gr.h.getInterpolation(AndroidUtilities.cascade(f10, i9 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f10);
            childAt.setTranslationY((1.0f - f10) * AndroidUtilities.dp(24.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int A;
        float f10;
        int i13;
        ArrayList arrayList = this.f15521b;
        int i14 = i11 - i9;
        int i15 = i12 - i10;
        this.f15520a.layout(0, 0, i14, i15);
        j6 j6Var = this.f15522c;
        j6Var.layout(i14 - j6Var.getMeasuredWidth(), (i15 - this.f15522c.getMeasuredHeight()) / 2, i14, (this.f15522c.getMeasuredHeight() + i15) / 2);
        int dp = (i14 - AndroidUtilities.dp(32.33f)) - this.f15522c.getMeasuredWidth();
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((i6) arrayList.get(i17)).getVisibility() == 0) {
                i16++;
            }
        }
        if (i16 < 2) {
            A = 0;
        } else {
            A = ll.A(40.0f, i16, dp) / (i16 - 1);
        }
        if (c()) {
            f10 = 20.0f;
        } else {
            f10 = 30.0f;
        }
        int min = Math.min(AndroidUtilities.dp(f10), A);
        int y10 = ll.y(40.0f, i15, 2);
        int dp2 = (AndroidUtilities.dp(40.0f) + i15) / 2;
        int dp3 = AndroidUtilities.dp(12.33f);
        if (!c()) {
            i13 = (ll.A(40.0f, i16, dp) - ((i16 - 1) * min)) / 2;
        } else {
            i13 = 0;
        }
        int i18 = dp3 + i13;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (((i6) arrayList.get(i19)).getVisibility() == 0) {
                ((i6) arrayList.get(i19)).layout(i18, y10, AndroidUtilities.dp(40.0f) + i18, dp2);
                i18 = org.telegram.messenger.l0.C(40.0f, min, i18);
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setOnClickListener(Utilities.Callback<Integer> callback) {
        this.f15524f = callback;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            j6 j6Var = this.f15522c;
            j6Var.f15472s = z10;
            j6Var.invalidate();
        }
    }
}
