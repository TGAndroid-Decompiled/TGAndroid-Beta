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
public final class cd extends LinearLayout implements tjb {
    public boolean a;
    public final lm b;
    public final Paint c;
    public final hd d;

    public cd(hd hdVar, Context context) {
        super(context);
        this.d = hdVar;
        ?? obj = new Object();
        obj.f = (short) 0;
        obj.g = 200L;
        obj.h = s33.f;
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
        hd hdVar = this.d;
        if (hdVar.U0) {
            if (hdVar.g0 == 3 && hdVar.r != null) {
                L = gl.L(18.0f);
                float scaleX = hdVar.r.getScaleX() * hdVar.r.getWidth();
                float scaleY = hdVar.r.getScaleY() * hdVar.r.getHeight();
                rectF = gl.P;
                rectF.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            } else {
                L = gl.L(20.0f);
                rectF = gl.P;
                rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            }
            if (hdVar.G0 != null) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            float e = this.b.e(false, f);
            Paint paint = hdVar.G0;
            if (paint != null) {
                paint.setAlpha((int) (e * 255.0f));
                canvas.drawRoundRect(rectF, L, L, hdVar.G0);
            }
            if (hdVar.H0 == null) {
                Paint paint2 = new Paint(1);
                hdVar.H0 = paint2;
                paint2.setColor(bm2.o(-16777216, (int) (hdVar.R0 * 255.0f)));
            }
            canvas.drawRoundRect(rectF, L, L, hdVar.H0);
            int i = hdVar.V0;
            Paint paint3 = this.c;
            paint3.setColor(i);
            paint3.setAlpha((int) ((((hdVar.C0 - 1.0f) * e) + 1.0f) * paint3.getAlpha()));
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
        hd hdVar = this.d;
        if (hdVar.I) {
            hdVar.p();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        hd hdVar = this.d;
        int[] iArr = hdVar.y0;
        if (hdVar.g0 == 3) {
            int measuredWidth = ((i3 - i) - hdVar.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i4 - i2) - hdVar.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = hdVar.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, hdVar.r.getMeasuredHeight() + measuredHeight);
        } else {
            xc xcVar = hdVar.w;
            if (xcVar != null) {
                if (hdVar.y == null) {
                    hdVar.y = new bd(this, (byte) 0);
                    xcVar.getViewTreeObserver().addOnScrollChangedListener(hdVar.y);
                }
                hdVar.y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = hdVar.E0;
        if (matrix != null && hdVar.F0 != null) {
            matrix.reset();
            hdVar.E0.postScale(8.0f, 8.0f);
            hdVar.E0.postTranslate(-iArr[0], -iArr[1]);
            hdVar.F0.setLocalMatrix(hdVar.E0);
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hd hdVar = this.d;
        if (hdVar.I) {
            hdVar.p();
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
        hd hdVar = this.d;
        try {
            hdVar.r();
            int i2 = hdVar.c1;
            if (i2 >= 0 && (e2 = hdVar.e(i2)) != hdVar.V0) {
                hdVar.V0 = e2;
                Drawable drawable = hdVar.A0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(hdVar.V0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = hdVar.r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    bkb.A1(hdVar.V0, hdVar.r.getBackground());
                }
                cd cdVar = hdVar.b1;
                if (cdVar != null) {
                    cdVar.invalidate();
                }
            }
            j26 j26Var = hdVar.v0;
            if (j26Var != null) {
                j26Var.setProgressColor(hdVar.e(bkb.E5));
                hdVar.v0.setBackColor(hdVar.e(bkb.F5));
                hdVar.v0.invalidate();
            }
            if (hdVar.w != null && (e = hdVar.e(bkb.z5)) != hdVar.e1) {
                hdVar.e1 = e;
                gl.u3(hdVar.w, e);
            }
            if (!hdVar.h1) {
                wla wlaVar = hdVar.f;
                if (wlaVar != null && wlaVar.getCurrentTextColor() == hdVar.f1) {
                    wla wlaVar2 = hdVar.f;
                    int e3 = hdVar.e(bkb.i5);
                    hdVar.f1 = e3;
                    wlaVar2.setTextColor(e3);
                }
                bu3 bu3Var = hdVar.n;
                if (bu3Var != null && bu3Var.getCurrentTextColor() == hdVar.g1) {
                    bu3 bu3Var2 = hdVar.n;
                    if (hdVar.X) {
                        i = bkb.x6;
                    } else {
                        i = bkb.i5;
                    }
                    int e4 = hdVar.e(i);
                    hdVar.g1 = e4;
                    bu3Var2.setTextColor(e4);
                }
            }
        } catch (Exception e5) {
            fa4.g(e5, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
