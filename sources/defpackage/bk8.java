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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
public final class bk8 extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Paint c;
    public final PremiumPreviewFragment d;

    public bk8(PremiumPreviewFragment premiumPreviewFragment, Context context) {
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
        dta dtaVar;
        float f3;
        ?? r11;
        Canvas canvas2;
        tk5 tk5Var;
        tk5 tk5Var2;
        a aVar5;
        a aVar6;
        a aVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z = premiumPreviewFragment.i0;
        nj8 nj8Var = premiumPreviewFragment.n0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.x0 != null) {
            premiumPreviewFragment.n0();
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
        aVar = ((d) premiumPreviewFragment).actionBar;
        float f7 = 16.0f;
        int L = gm.L(16.0f) + aVar.getBottom();
        float f8 = 1.0f - ((premiumPreviewFragment.d0 - L) / (premiumPreviewFragment.Z - L));
        premiumPreviewFragment.g0 = f8;
        premiumPreviewFragment.g0 = Utilities.i(f8, 1.0f, 0.0f);
        aVar2 = ((d) premiumPreviewFragment).actionBar;
        int L2 = gm.L(16.0f) + aVar2.getBottom();
        int i = premiumPreviewFragment.d0;
        if (i < L2) {
            premiumPreviewFragment.d0 = L2;
            i = L2;
        }
        float f9 = premiumPreviewFragment.r0;
        premiumPreviewFragment.r0 = 0.0f;
        if (i < gm.L(30.0f) + L2) {
            premiumPreviewFragment.r0 = ((gm.L(30.0f) + L2) - premiumPreviewFragment.d0) / gm.L(30.0f);
        }
        if (premiumPreviewFragment.X) {
            premiumPreviewFragment.r0 = 1.0f;
            premiumPreviewFragment.g0 = 1.0f;
        }
        if (f9 != premiumPreviewFragment.r0) {
            premiumPreviewFragment.a.invalidate();
        }
        int i2 = premiumPreviewFragment.d0;
        aVar3 = ((d) premiumPreviewFragment).actionBar;
        int measuredHeight = i2 - ((premiumPreviewFragment.V.getMeasuredHeight() + aVar3.getMeasuredHeight()) - premiumPreviewFragment.Y);
        if (premiumPreviewFragment.V.e.getVisibility() == 0) {
            f = 24.0f;
        } else {
            f = 16.0f;
        }
        int L3 = gm.L(f) + measuredHeight;
        aVar4 = ((d) premiumPreviewFragment).actionBar;
        float max = Math.max((((((aVar4.getMeasuredHeight() - premiumPreviewFragment.Y) - premiumPreviewFragment.V.a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.Y) - premiumPreviewFragment.V.getTop()) - premiumPreviewFragment.V.a.getTop(), gm.L(24.0f) + L3);
        float L4 = ((-max) / 4.0f) + gm.L(16.0f);
        premiumPreviewFragment.V.setTranslationY(max);
        w94 w94Var = premiumPreviewFragment.V.d;
        if (premiumPreviewFragment.h0) {
            f7 = 9.0f;
        }
        w94Var.setTranslationY(L4 + gm.L(f7));
        float f10 = premiumPreviewFragment.g0;
        float A = td4.A(1.0f, f10, 0.4f, 0.6f);
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
        premiumPreviewFragment.W.setTranslationY(premiumPreviewFragment.V.c.getY() + premiumPreviewFragment.V.getY() + ((-(dtaVar.getMeasuredHeight() - premiumPreviewFragment.V.d.getMeasuredWidth())) / 2.0f));
        float L5 = gm.L(72.0f) - premiumPreviewFragment.V.a.getLeft();
        float f12 = premiumPreviewFragment.g0;
        if (f12 > 0.3f) {
            f3 = (f12 - 0.3f) / 0.7f;
        } else {
            f3 = 0.0f;
        }
        premiumPreviewFragment.V.a.setTranslationX((1.0f - d53.h.getInterpolation(1.0f - f3)) * L5);
        gk8 gk8Var = premiumPreviewFragment.V;
        gk8Var.d.b.s = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.c0) + (premiumPreviewFragment.V.c.getX() + gk8Var.getX())) / getMeasuredWidth();
        gk8 gk8Var2 = premiumPreviewFragment.V;
        gk8Var2.d.b.t = (premiumPreviewFragment.V.c.getY() + gk8Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.a0) {
            invalidate();
            premiumPreviewFragment.L.invalidate();
            premiumPreviewFragment.K.invalidate();
        }
        nj8Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.c0, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z) {
            int i3 = cmb.Z6;
            int themedColor = premiumPreviewFragment.getThemedColor(i3);
            Paint paint = this.c;
            paint.setColor(themedColor);
            boolean z3 = false;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.r0 > 0.0f) {
                aVar6 = ((d) premiumPreviewFragment).actionBar;
                if (aVar6 != null) {
                    paint.setColor(on2.f(premiumPreviewFragment.r0, premiumPreviewFragment.getThemedColor(i3), premiumPreviewFragment.getThemedColor(cmb.c6)));
                    float measuredWidth = getMeasuredWidth();
                    aVar7 = ((d) premiumPreviewFragment).actionBar;
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
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), nj8Var.f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.K.getVisibility() != 0) {
            premiumPreviewFragment.w0.b(premiumPreviewFragment.p0.d, r11);
            premiumPreviewFragment.w0.setBounds(r11, getHeight() - premiumPreviewFragment.p0.d, getWidth(), getHeight());
            premiumPreviewFragment.w0.draw(canvas2);
        }
        tk5Var = ((d) premiumPreviewFragment).parentLayout;
        if (tk5Var != null && z) {
            tk5Var2 = ((d) premiumPreviewFragment).parentLayout;
            int i4 = (int) (premiumPreviewFragment.r0 * 255.0f);
            aVar5 = ((d) premiumPreviewFragment).actionBar;
            ((ActionBarLayout) tk5Var2).n(canvas2, i4, aVar5.getBottom());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x = premiumPreviewFragment.V.c.getX() + premiumPreviewFragment.V.getX();
        float y = premiumPreviewFragment.V.c.getY() + premiumPreviewFragment.V.getY();
        RectF rectF = gm.P;
        w94 w94Var = premiumPreviewFragment.V.d;
        if (w94Var == null) {
            measuredWidth = 0;
        } else {
            measuredWidth = w94Var.getMeasuredWidth();
        }
        float f = measuredWidth + x;
        w94 w94Var2 = premiumPreviewFragment.V.d;
        if (w94Var2 == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = w94Var2.getMeasuredHeight();
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
        w94 w94Var = premiumPreviewFragment.V.d;
        w94Var.b.u = w94Var.getMeasuredWidth() / getMeasuredWidth();
        w94 w94Var2 = premiumPreviewFragment.V.d;
        w94Var2.b.v = w94Var2.getMeasuredHeight() / getMeasuredHeight();
        gk8 gk8Var = premiumPreviewFragment.V;
        gk8Var.d.b.s = (premiumPreviewFragment.V.d.getX() + gk8Var.getX()) / getMeasuredWidth();
        gk8 gk8Var2 = premiumPreviewFragment.V;
        gk8Var2.d.b.t = (premiumPreviewFragment.V.d.getY() + gk8Var2.getY()) / getMeasuredHeight();
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
        premiumPreviewFragment.Y = gm.m;
        premiumPreviewFragment.V.measure(i, 0);
        premiumPreviewFragment.W.getLayoutParams().height = premiumPreviewFragment.V.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.K;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i3 = gm.L(68.0f);
        }
        wd4 wd4Var = premiumPreviewFragment.Q;
        wd4Var.M = (premiumPreviewFragment.Y + i3) - gm.L(16.0f);
        wd4Var.o1();
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
            premiumPreviewFragment.M.a((hk8) arrayList2.get(i6), false);
            premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            ((hk8) arrayList2.get(i6)).e = i5;
            i5 += premiumPreviewFragment.M.getMeasuredHeight();
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            premiumPreviewFragment.M.a((hk8) arrayList.get(i7), false);
            premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            ((hk8) arrayList.get(i7)).e = i5;
            i5 += premiumPreviewFragment.M.getMeasuredHeight();
        }
        premiumPreviewFragment.O = i5;
    }
}
