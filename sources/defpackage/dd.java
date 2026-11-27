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
public final class dd extends LinearLayout implements snb {
    public boolean a;
    public final mm b;
    public final Paint c;
    public final id d;

    public dd(id idVar, Context context) {
        super(context);
        this.d = idVar;
        ?? obj = new Object();
        obj.f = (short) 0;
        obj.g = 200L;
        obj.h = k43.f;
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
        id idVar = this.d;
        if (idVar.U0) {
            if (idVar.g0 == 3 && idVar.r != null) {
                L = hl.L(18.0f);
                float scaleX = idVar.r.getScaleX() * idVar.r.getWidth();
                float scaleY = idVar.r.getScaleY() * idVar.r.getHeight();
                rectF = hl.P;
                rectF.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                L = hl.L(20.0f);
                rectF = hl.P;
                rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (idVar.G0 != null) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            float e = this.b.e(false, f);
            Paint paint = idVar.G0;
            if (paint != null) {
                paint.setAlpha((int) (e * 255.0f));
                canvas.drawRoundRect(rectF, L, L, idVar.G0);
            }
            if (idVar.H0 == null) {
                Paint paint2 = new Paint(1);
                idVar.H0 = paint2;
                paint2.setColor(vm2.o(-16777216, (int) (idVar.R0 * 255.0f)));
            }
            canvas.drawRoundRect(rectF, L, L, idVar.H0);
            int i = idVar.V0;
            Paint paint3 = this.c;
            paint3.setColor(i);
            paint3.setAlpha((int) ((((idVar.C0 - 1.0f) * e) + 1.0f) * paint3.getAlpha()));
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
        id idVar = this.d;
        if (idVar.I) {
            idVar.p();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        id idVar = this.d;
        int[] iArr = idVar.y0;
        if (idVar.g0 == 3) {
            int measuredWidth = ((i3 - i) - idVar.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i4 - i2) - idVar.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = idVar.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, idVar.r.getMeasuredHeight() + measuredHeight);
        } else {
            yc ycVar = idVar.w;
            if (ycVar != null) {
                if (idVar.y == null) {
                    idVar.y = new cd(this, (byte) 0);
                    ycVar.getViewTreeObserver().addOnScrollChangedListener(idVar.y);
                }
                idVar.y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = idVar.E0;
        if (matrix != null && idVar.F0 != null) {
            matrix.reset();
            idVar.E0.postScale(8.0f, 8.0f);
            idVar.E0.postTranslate(-iArr[0], -iArr[1]);
            idVar.F0.setLocalMatrix(idVar.E0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        id idVar = this.d;
        if (idVar.I) {
            idVar.p();
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
        id idVar = this.d;
        try {
            idVar.r();
            int i2 = idVar.c1;
            if (i2 >= 0 && (e2 = idVar.e(i2)) != idVar.V0) {
                idVar.V0 = e2;
                Drawable drawable = idVar.A0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(idVar.V0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = idVar.r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    aob.A1(idVar.V0, idVar.r.getBackground());
                }
                dd ddVar = idVar.b1;
                if (ddVar != null) {
                    ddVar.invalidate();
                }
            }
            n46 n46Var = idVar.v0;
            if (n46Var != null) {
                n46Var.setProgressColor(idVar.e(aob.F5));
                idVar.v0.setBackColor(idVar.e(aob.G5));
                idVar.v0.invalidate();
            }
            if (idVar.w != null && (e = idVar.e(aob.A5)) != idVar.e1) {
                idVar.e1 = e;
                hl.u3(idVar.w, e);
            }
            if (!idVar.h1) {
                tpa tpaVar = idVar.f;
                if (tpaVar != null && tpaVar.getCurrentTextColor() == idVar.f1) {
                    tpa tpaVar2 = idVar.f;
                    int e3 = idVar.e(aob.j5);
                    idVar.f1 = e3;
                    tpaVar2.setTextColor(e3);
                }
                uu3 uu3Var = idVar.n;
                if (uu3Var != null && uu3Var.getCurrentTextColor() == idVar.g1) {
                    uu3 uu3Var2 = idVar.n;
                    if (idVar.X) {
                        i = aob.y6;
                    } else {
                        i = aob.j5;
                    }
                    int e4 = idVar.e(i);
                    idVar.g1 = e4;
                    uu3Var2.setTextColor(e4);
                }
            }
        } catch (Exception e5) {
            cc4.g(e5, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
