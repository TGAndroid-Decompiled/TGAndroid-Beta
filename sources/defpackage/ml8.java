package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;
public final class ml8 extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Paint c;
    public final PremiumPreviewFragment d;

    public ml8(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int bottom;
        a aVar;
        a aVar2;
        a aVar3;
        float f;
        a aVar4;
        float f2;
        eva evaVar;
        float f3;
        ?? r11;
        Canvas canvas2;
        wk5 wk5Var;
        wk5 wk5Var2;
        a aVar5;
        a aVar6;
        a aVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z = premiumPreviewFragment.i0;
        al8 al8Var = premiumPreviewFragment.n0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.x0 != null) {
            premiumPreviewFragment.m0();
        }
        if (!premiumPreviewFragment.a0) {
            boolean z2 = premiumPreviewFragment.b0;
            float f4 = premiumPreviewFragment.c0;
            if (z2) {
                float f5 = f4 + 0.016f;
                premiumPreviewFragment.c0 = f5;
                if (f5 > 3.0f) {
                    premiumPreviewFragment.b0 = false;
                }
            } else {
                float f6 = f4 - 0.016f;
                premiumPreviewFragment.c0 = f6;
                if (f6 < 1.0f) {
                    premiumPreviewFragment.b0 = true;
                }
            }
        }
        if (premiumPreviewFragment.a.getLayoutManager() != null) {
            view = premiumPreviewFragment.a.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            bottom = 0;
        } else {
            bottom = view.getBottom();
        }
        premiumPreviewFragment.d0 = bottom;
        aVar = ((e) premiumPreviewFragment).actionBar;
        float f7 = 16.0f;
        int L = hl.L(16.0f) + aVar.getBottom();
        float f8 = 1.0f - ((premiumPreviewFragment.d0 - L) / (premiumPreviewFragment.Z - L));
        premiumPreviewFragment.g0 = f8;
        premiumPreviewFragment.g0 = Utilities.i(f8, 1.0f, 0.0f);
        aVar2 = ((e) premiumPreviewFragment).actionBar;
        int L2 = hl.L(16.0f) + aVar2.getBottom();
        int i = premiumPreviewFragment.d0;
        if (i < L2) {
            premiumPreviewFragment.d0 = L2;
            i = L2;
        }
        float f9 = premiumPreviewFragment.r0;
        premiumPreviewFragment.r0 = 0.0f;
        if (i < hl.L(30.0f) + L2) {
            premiumPreviewFragment.r0 = ((hl.L(30.0f) + L2) - premiumPreviewFragment.d0) / hl.L(30.0f);
        }
        if (premiumPreviewFragment.X) {
            premiumPreviewFragment.r0 = 1.0f;
            premiumPreviewFragment.g0 = 1.0f;
        }
        if (f9 != premiumPreviewFragment.r0) {
            premiumPreviewFragment.a.invalidate();
        }
        int i2 = premiumPreviewFragment.d0;
        aVar3 = ((e) premiumPreviewFragment).actionBar;
        int measuredHeight = i2 - ((premiumPreviewFragment.V.getMeasuredHeight() + aVar3.getMeasuredHeight()) - premiumPreviewFragment.Y);
        if (premiumPreviewFragment.V.e.getVisibility() == 0) {
            f = 24.0f;
        } else {
            f = 16.0f;
        }
        int L3 = hl.L(f) + measuredHeight;
        aVar4 = ((e) premiumPreviewFragment).actionBar;
        float max = Math.max((((((aVar4.getMeasuredHeight() - premiumPreviewFragment.Y) - premiumPreviewFragment.V.a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.Y) - premiumPreviewFragment.V.getTop()) - premiumPreviewFragment.V.a.getTop(), hl.L(24.0f) + L3);
        float L4 = ((-max) / 4.0f) + hl.L(16.0f);
        premiumPreviewFragment.V.setTranslationY(max);
        i94 i94Var = premiumPreviewFragment.V.d;
        if (premiumPreviewFragment.h0) {
            f7 = 9.0f;
        }
        i94Var.setTranslationY(L4 + hl.L(f7));
        float f10 = premiumPreviewFragment.g0;
        float A = qd4.A(1.0f, f10, 0.4f, 0.6f);
        if (f10 > 0.5f) {
            f2 = (f10 - 0.5f) / 0.5f;
        } else {
            f2 = 0.0f;
        }
        float f11 = 1.0f - f2;
        premiumPreviewFragment.V.d.setScaleX(A);
        premiumPreviewFragment.V.d.setScaleY(A);
        premiumPreviewFragment.V.d.setAlpha(f11);
        premiumPreviewFragment.V.b.setAlpha(f11);
        premiumPreviewFragment.V.e.setAlpha(f11);
        premiumPreviewFragment.W.setAlpha(1.0f - premiumPreviewFragment.g0);
        premiumPreviewFragment.W.setTranslationY(premiumPreviewFragment.V.c.getY() + premiumPreviewFragment.V.getY() + ((-(evaVar.getMeasuredHeight() - premiumPreviewFragment.V.d.getMeasuredWidth())) / 2.0f));
        float L5 = hl.L(72.0f) - premiumPreviewFragment.V.a.getLeft();
        float f12 = premiumPreviewFragment.g0;
        if (f12 > 0.3f) {
            f3 = (f12 - 0.3f) / 0.7f;
        } else {
            f3 = 0.0f;
        }
        premiumPreviewFragment.V.a.setTranslationX((1.0f - k43.h.getInterpolation(1.0f - f3)) * L5);
        rl8 rl8Var = premiumPreviewFragment.V;
        rl8Var.d.b.s = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.c0) + (premiumPreviewFragment.V.c.getX() + rl8Var.getX())) / getMeasuredWidth();
        rl8 rl8Var2 = premiumPreviewFragment.V;
        rl8Var2.d.b.t = (premiumPreviewFragment.V.c.getY() + rl8Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.a0) {
            invalidate();
            premiumPreviewFragment.L.invalidate();
            premiumPreviewFragment.K.invalidate();
        }
        al8Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.c0, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z) {
            int i3 = aob.a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i3);
            Paint paint = this.c;
            paint.setColor(themedColor);
            boolean z3 = false;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.r0 > 0.0f) {
                aVar6 = ((e) premiumPreviewFragment).actionBar;
                if (aVar6 != null) {
                    paint.setColor(vm2.f(premiumPreviewFragment.r0, premiumPreviewFragment.getThemedColor(i3), premiumPreviewFragment.getThemedColor(aob.d6)));
                    float measuredWidth = getMeasuredWidth();
                    aVar7 = ((e) premiumPreviewFragment).actionBar;
                    float height = aVar7.getHeight();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, measuredWidth, height, paint);
                    r11 = z3;
                }
            }
            canvas2 = canvas;
            r11 = z3;
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), al8Var.f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.K.getVisibility() != 0) {
            premiumPreviewFragment.w0.b(premiumPreviewFragment.p0.d, r11);
            premiumPreviewFragment.w0.setBounds(r11, getHeight() - premiumPreviewFragment.p0.d, getWidth(), getHeight());
            premiumPreviewFragment.w0.draw(canvas2);
        }
        wk5Var = ((e) premiumPreviewFragment).parentLayout;
        if (wk5Var != null && z) {
            wk5Var2 = ((e) premiumPreviewFragment).parentLayout;
            int i4 = (int) (premiumPreviewFragment.r0 * 255.0f);
            aVar5 = ((e) premiumPreviewFragment).actionBar;
            ((ActionBarLayout) wk5Var2).n(canvas2, i4, aVar5.getBottom());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x = premiumPreviewFragment.V.c.getX() + premiumPreviewFragment.V.getX();
        float y = premiumPreviewFragment.V.c.getY() + premiumPreviewFragment.V.getY();
        RectF rectF = hl.P;
        i94 i94Var = premiumPreviewFragment.V.d;
        if (i94Var == null) {
            measuredWidth = 0;
        } else {
            measuredWidth = i94Var.getMeasuredWidth();
        }
        float f = measuredWidth + x;
        i94 i94Var2 = premiumPreviewFragment.V.d;
        if (i94Var2 == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = i94Var2.getMeasuredHeight();
        }
        rectF.set(x, y, f, measuredHeight + y);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.a) && !premiumPreviewFragment.a.J1) {
            motionEvent.offsetLocation(-x, -y);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.a = false;
                }
            } else {
                this.a = true;
            }
            premiumPreviewFragment.V.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x2 = premiumPreviewFragment.V.e.getX() + premiumPreviewFragment.V.getX();
        float y2 = premiumPreviewFragment.V.e.getY() + premiumPreviewFragment.V.getY();
        rectF.set(x2, y2, premiumPreviewFragment.V.e.getWidth() + x2, premiumPreviewFragment.V.e.getHeight() + y2);
        if (premiumPreviewFragment.r0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.b) && !premiumPreviewFragment.a.J1)) {
            motionEvent.offsetLocation(-x2, -y2);
            if (motionEvent.getAction() == 0) {
                this.b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.b = false;
            }
            premiumPreviewFragment.V.e.dispatchTouchEvent(motionEvent);
            if (this.b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        i94 i94Var = premiumPreviewFragment.V.d;
        i94Var.b.u = i94Var.getMeasuredWidth() / getMeasuredWidth();
        i94 i94Var2 = premiumPreviewFragment.V.d;
        i94Var2.b.v = i94Var2.getMeasuredHeight() / getMeasuredHeight();
        rl8 rl8Var = premiumPreviewFragment.V;
        rl8Var.d.b.s = (premiumPreviewFragment.V.d.getX() + rl8Var.getX()) / getMeasuredWidth();
        rl8 rl8Var2 = premiumPreviewFragment.V;
        rl8Var2.d.b.t = (premiumPreviewFragment.V.d.getY() + rl8Var2.getY()) / getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3 = 0;
        if (View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2)) {
            z = true;
        } else {
            z = false;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.X = z;
        premiumPreviewFragment.Y = hl.m;
        premiumPreviewFragment.V.measure(i, 0);
        premiumPreviewFragment.W.getLayoutParams().height = premiumPreviewFragment.V.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.K;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i3 = hl.L(68.0f);
        }
        td4 td4Var = premiumPreviewFragment.Q;
        td4Var.M = (premiumPreviewFragment.Y + i3) - hl.L(16.0f);
        td4Var.o1();
        premiumPreviewFragment.Q.S = i3;
        super.onMeasure(i, i2);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.x0();
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.c;
        ArrayList arrayList2 = premiumPreviewFragment.b;
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            premiumPreviewFragment.M.a((sl8) arrayList2.get(i6), false);
            premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            ((sl8) arrayList2.get(i6)).e = i5;
            i5 += premiumPreviewFragment.M.getMeasuredHeight();
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            premiumPreviewFragment.M.a((sl8) arrayList.get(i7), false);
            premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            ((sl8) arrayList.get(i7)).e = i5;
            i5 += premiumPreviewFragment.M.getMeasuredHeight();
        }
        premiumPreviewFragment.O = i5;
    }
}
