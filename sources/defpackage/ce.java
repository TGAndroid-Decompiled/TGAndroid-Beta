package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class ce extends LinearLayout implements vlb {
    public boolean a;
    public final ln b;
    public final Paint c;
    public final he d;

    public ce(he heVar, Context context) {
        super(context);
        this.d = heVar;
        ?? obj = new Object();
        obj.f = (short) 0;
        obj.g = 200L;
        obj.h = d53.f;
        obj.a = this;
        obj.d = 0.0f;
        obj.c = 0.0f;
        obj.e = false;
        this.b = obj;
        this.c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        float L;
        RectF rectF;
        float f;
        he heVar = this.d;
        if (heVar.U0) {
            if (heVar.g0 == 3 && heVar.r != null) {
                L = gm.L(18.0f);
                float scaleX = heVar.r.getScaleX() * heVar.r.getWidth();
                float scaleY = heVar.r.getScaleY() * heVar.r.getHeight();
                rectF = gm.P;
                rectF.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                L = gm.L(20.0f);
                rectF = gm.P;
                rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (heVar.G0 != null) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            float e = this.b.e(false, f);
            Paint paint = heVar.G0;
            if (paint != null) {
                paint.setAlpha((int) (e * 255.0f));
                canvas.drawRoundRect(rectF, L, L, heVar.G0);
            }
            if (heVar.H0 == null) {
                Paint paint2 = new Paint(1);
                heVar.H0 = paint2;
                paint2.setColor(on2.p(-16777216, (int) (heVar.R0 * 255.0f)));
            }
            canvas.drawRoundRect(rectF, L, L, heVar.H0);
            int i = heVar.V0;
            Paint paint3 = this.c;
            paint3.setColor(i);
            paint3.setAlpha((int) ((((heVar.C0 - 1.0f) * e) + 1.0f) * paint3.getAlpha()));
            canvas.drawRoundRect(rectF, L, L, paint3);
        }
        super.draw(canvas);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        he heVar = this.d;
        if (heVar.I) {
            heVar.p();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        he heVar = this.d;
        int[] iArr = heVar.y0;
        if (heVar.g0 == 3) {
            int measuredWidth = ((i3 - i) - heVar.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i4 - i2) - heVar.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = heVar.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, heVar.r.getMeasuredHeight() + measuredHeight);
        } else {
            xd xdVar = heVar.w;
            if (xdVar != null) {
                if (heVar.y == null) {
                    heVar.y = new be(this, (byte) 0);
                    xdVar.getViewTreeObserver().addOnScrollChangedListener(heVar.y);
                }
                heVar.y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = heVar.E0;
        if (matrix != null && heVar.F0 != null) {
            matrix.reset();
            heVar.E0.postScale(8.0f, 8.0f);
            heVar.E0.postTranslate(-iArr[0], -iArr[1]);
            heVar.F0.setLocalMatrix(heVar.E0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        he heVar = this.d;
        if (heVar.I) {
            heVar.p();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        int i;
        int e;
        int e2;
        he heVar = this.d;
        try {
            heVar.r();
            int i2 = heVar.c1;
            if (i2 >= 0 && (e2 = heVar.e(i2)) != heVar.V0) {
                heVar.V0 = e2;
                Drawable drawable = heVar.A0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(heVar.V0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = heVar.r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    cmb.A1(heVar.V0, heVar.r.getBackground());
                }
                ce ceVar = heVar.b1;
                if (ceVar != null) {
                    ceVar.invalidate();
                }
            }
            k46 k46Var = heVar.v0;
            if (k46Var != null) {
                k46Var.setProgressColor(heVar.e(cmb.E5));
                heVar.v0.setBackColor(heVar.e(cmb.F5));
                heVar.v0.invalidate();
            }
            if (heVar.w != null && (e = heVar.e(cmb.z5)) != heVar.e1) {
                heVar.e1 = e;
                gm.u3(heVar.w, e);
            }
            if (!heVar.h1) {
                xna xnaVar = heVar.f;
                if (xnaVar != null && xnaVar.getCurrentTextColor() == heVar.f1) {
                    xna xnaVar2 = heVar.f;
                    int e3 = heVar.e(cmb.i5);
                    heVar.f1 = e3;
                    xnaVar2.setTextColor(e3);
                }
                mv3 mv3Var = heVar.n;
                if (mv3Var != null && mv3Var.getCurrentTextColor() == heVar.g1) {
                    mv3 mv3Var2 = heVar.n;
                    if (heVar.X) {
                        i = cmb.x6;
                    } else {
                        i = cmb.i5;
                    }
                    int e4 = heVar.e(i);
                    heVar.g1 = e4;
                    mv3Var2.setTextColor(e4);
                }
            }
        } catch (Exception e5) {
            fc4.g(e5, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
