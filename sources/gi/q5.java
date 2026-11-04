package gi;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.xq;
public final class q5 extends FrameLayout {
    public View f13427a;
    public ArrayList f13428b;
    public p5 f13429c;
    public String d;
    public boolean f13430e;
    public u10 f13431f;
    public boolean h;
    public float f13432n;
    public boolean f13433r;
    public ValueAnimator f13434s;

    public final void a(int i3, int i10, String str) {
        o5 o5Var = new o5(this, getContext(), i3, i10);
        o5Var.setContentDescription(str);
        this.f13428b.add(o5Var);
        addView(o5Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f13433r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f13434s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f13433r = z10;
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f13432n;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f13434s = ofFloat;
            ofFloat.addUpdateListener(new j3(this, 2));
            if (this.f13433r) {
                this.f13434s.setDuration(450L);
                this.f13434s.setInterpolator(new LinearInterpolator());
            } else {
                this.f13434s.setDuration(350L);
                this.f13434s.setInterpolator(xq.h);
            }
            this.f13434s.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.f13432n = f10;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f13428b;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                break;
            }
            o5 o5Var = (o5) arrayList.get(i3);
            if (o5Var.f13332a == 4) {
                if (o5Var.getVisibility() == 0) {
                    return true;
                }
            } else {
                i3++;
            }
        }
        return false;
    }

    public final void d(int i3, boolean z10) {
        int i10;
        ArrayList arrayList = this.f13428b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            o5 o5Var = (o5) arrayList.get(i11);
            if (o5Var.f13332a == i3) {
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
        View view = this.f13427a;
        view.setAlpha(this.f13432n);
        view.setTranslationY((1.0f - this.f13432n) * org.telegram.messenger.g0.L(16.0f));
        for (int i3 = 1; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            float f10 = this.f13432n;
            if (this.f13433r) {
                f10 = xq.h.getInterpolation(org.telegram.messenger.g0.s(f10, i3 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f10);
            childAt.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(24.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int A;
        float f10;
        int i13;
        ArrayList arrayList = this.f13428b;
        int i14 = i11 - i3;
        int i15 = i12 - i10;
        this.f13427a.layout(0, 0, i14, i15);
        p5 p5Var = this.f13429c;
        p5Var.layout(i14 - p5Var.getMeasuredWidth(), (i15 - this.f13429c.getMeasuredHeight()) / 2, i14, (this.f13429c.getMeasuredHeight() + i15) / 2);
        int L = (i14 - org.telegram.messenger.g0.L(32.33f)) - this.f13429c.getMeasuredWidth();
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((o5) arrayList.get(i17)).getVisibility() == 0) {
                i16++;
            }
        }
        if (i16 < 2) {
            A = 0;
        } else {
            A = org.telegram.messenger.camera.q.A(40.0f, i16, L) / (i16 - 1);
        }
        if (c()) {
            f10 = 20.0f;
        } else {
            f10 = 30.0f;
        }
        int min = Math.min(org.telegram.messenger.g0.L(f10), A);
        int y9 = org.telegram.messenger.camera.q.y(40.0f, i15, 2);
        int L2 = (org.telegram.messenger.g0.L(40.0f) + i15) / 2;
        int L3 = org.telegram.messenger.g0.L(12.33f);
        if (!c()) {
            i13 = (org.telegram.messenger.camera.q.A(40.0f, i16, L) - ((i16 - 1) * min)) / 2;
        } else {
            i13 = 0;
        }
        int i18 = L3 + i13;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (((o5) arrayList.get(i19)).getVisibility() == 0) {
                ((o5) arrayList.get(i19)).layout(i18, y9, org.telegram.messenger.g0.L(40.0f) + i18, L2);
                i18 = org.telegram.messenger.k5.C(40.0f, min, i18);
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }

    public void setOnClickListener(u10 u10Var) {
        this.f13431f = u10Var;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            p5 p5Var = this.f13429c;
            p5Var.f13377s = z10;
            p5Var.invalidate();
        }
    }
}
