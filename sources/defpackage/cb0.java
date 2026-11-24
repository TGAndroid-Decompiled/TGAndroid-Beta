package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class cb0 extends cja {
    public final zw8 m0;
    public final mb0 n0;
    public boolean o0;
    public boolean p0;
    public float q0;
    public float r0;
    public final mb0 s0;

    public cb0(mb0 mb0Var, Context context) {
        super(context, null);
        this.s0 = mb0Var;
        this.n0 = mb0Var;
        this.m0 = new zw8((byte) 3);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        mb0 mb0Var = this.s0;
        if (!mb0Var.V) {
            if (!mb0Var.h) {
                canvas.save();
                float x = mb0Var.a.getX() + mb0Var.r.getX();
                float y = mb0Var.a.getY() + mb0Var.r.getY();
                int i = mb0Var.d - mb0Var.c;
                float R1 = gl.R1(y, gl.m + ((a.getCurrentActionBarHeight() - mb0Var.c) >> 1), mb0Var.O);
                canvas.translate(x, R1);
                mb0Var.a.draw(canvas);
                RectF rectF = gl.P;
                float f2 = i / 2.0f;
                rectF.set(x, R1 - (mb0Var.F * f2), mb0Var.a.getMeasuredWidth() + x, (f2 * mb0Var.F) + mb0Var.a.getMeasuredHeight() + R1);
                db0 db0Var = mb0Var.a;
                float f3 = x + db0Var.E;
                float f4 = R1 + db0Var.F;
                ra1 ra1Var = mb0Var.L;
                float f5 = db0Var.y;
                ra1Var.getClass();
                rectF.set((int) (f3 - f5), (int) (f4 - f5), (int) (f3 + f5), (int) (f4 + f5));
                ra1Var.i = false;
                ra1Var.c = 0;
                ra1Var.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f6 = mb0Var.a.s.c;
            if (mb0Var.e.getVisibility() == 0) {
                f = mb0Var.e.getAlpha();
            } else {
                f = 0.0f;
            }
            float f7 = (1.0f - f) * f6;
            int i2 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            a aVar = mb0Var.I;
            if (i2 != 0) {
                aVar.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(mb0Var.I.getX(), mb0Var.I.getY());
                if (f7 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, mb0Var.I.getMeasuredWidth(), mb0Var.I.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                mb0Var.I.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                aVar.setVisibility(8);
            }
        }
        if (mb0Var.f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        Canvas canvas2;
        mb0 mb0Var = this.s0;
        Paint paint = mb0Var.P;
        if (view != mb0Var.I) {
            aVar = ((d) mb0Var).actionBar;
            if (view == aVar && mb0Var.O > 0.0f) {
                paint.setColor(bkb.w0(null, bkb.c6, false));
                paint.setAlpha((int) (mb0Var.O * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) mb0Var.getParentLayout()).n(canvas2, (int) (mb0Var.O * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        return this.m0.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.s0.O == 0.0f) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        float f;
        a aVar;
        Q();
        if (View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2) + this.f) {
            z = true;
        } else {
            z = false;
        }
        mb0 mb0Var = this.s0;
        float f2 = 0.0f;
        if (z != mb0Var.V) {
            mb0Var.V = z;
            gl.B2(mb0Var.a);
            gl.V2(mb0Var.getParentActivity(), mb0Var.getClassGuid());
            if (mb0Var.V) {
                mb0Var.m0(false, 0.0f);
                mb0Var.a.setExpanded(false);
                addView(mb0Var.a, 0, nme.c(-1.0f, -1));
            } else {
                mb0Var.r.addView(mb0Var.a, 0, nme.c(-2.0f, -1));
            }
            gl.W2(mb0Var.getParentActivity(), mb0Var.getClassGuid());
        }
        if (mb0Var.V) {
            int size = (int) (View.MeasureSpec.getSize(i) * 0.55f);
            ((ViewGroup.MarginLayoutParams) mb0Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) mb0Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i) * 0.45f);
            ((ViewGroup.MarginLayoutParams) mb0Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) mb0Var.y.getLayoutParams()).rightMargin = gl.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) mb0Var.X.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) mb0Var.W.getLayoutParams()).topMargin = gl.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) mb0Var.r.getLayoutParams()).bottomMargin = gl.L(64.0f);
            ((ViewGroup.MarginLayoutParams) mb0Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) mb0Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) mb0Var.y.getLayoutParams()).rightMargin = gl.L(16.0f);
            ((ViewGroup.MarginLayoutParams) mb0Var.X.getLayoutParams()).topMargin = gl.L(10.0f);
            ((ViewGroup.MarginLayoutParams) mb0Var.W.getLayoutParams()).topMargin = gl.L(18.0f);
        }
        boolean z3 = mb0Var.M;
        if (this.f >= gl.L(20.0f)) {
            z2 = true;
        } else {
            z2 = false;
        }
        mb0Var.M = z2;
        if (z3 != z2) {
            super.onMeasure(i, i2);
            if (mb0Var.M) {
                aVar = ((d) mb0Var).actionBar;
                i3 = gl.L(8.0f) + aVar.getMeasuredHeight() + (-mb0Var.b.getTop());
            } else {
                i3 = 0;
            }
            pkb pkbVar = mb0Var.r;
            pkbVar.setTranslationY((pkbVar.getTranslationY() + ((ViewGroup.MarginLayoutParams) mb0Var.r.getLayoutParams()).topMargin) - i3);
            ((ViewGroup.MarginLayoutParams) mb0Var.r.getLayoutParams()).topMargin = i3;
            boolean z4 = mb0Var.M;
            if (!mb0Var.V) {
                float f3 = mb0Var.O;
                if (z4) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                mb0Var.N = ValueAnimator.ofFloat(f3, f);
                float f4 = ((mb0Var.d - mb0Var.c) - gl.m) * mb0Var.F;
                if (z4) {
                    mb0Var.a.setExpanded(false);
                    f4 = mb0Var.r.getTranslationY();
                } else {
                    f2 = mb0Var.r.getTranslationY();
                }
                if (mb0Var.G && !z4) {
                    mb0Var.a.setExpanded(true);
                } else {
                    mb0Var.G = false;
                }
                mb0Var.N.addUpdateListener(new gb0(mb0Var, f4, f2, z4));
                mb0Var.N.addListener(new za0(mb0Var, (byte) 1));
                mb0Var.N.setDuration(250L);
                mb0Var.N.setInterpolator(gb.w);
                mb0Var.N.start();
            }
        }
        super.onMeasure(i, i2);
        mb0Var.c = mb0Var.a.getMeasuredHeight();
        mb0Var.d = mb0Var.a.getMeasuredWidth();
    }

    @Override
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mb0 mb0Var = this.n0;
        if (mb0Var.O <= 0.0f && !mb0Var.V && i2 > 0 && mb0Var.F > 0.0f) {
            mb0Var.g0();
            mb0Var.m0(true, Utilities.i(mb0Var.F - (i2 / mb0Var.d), 1.0f, 0.0f));
            iArr[1] = i2;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mb0 mb0Var = this.n0;
        if (mb0Var.O <= 0.0f && !mb0Var.V && i4 != 0) {
            mb0Var.g0();
            mb0Var.m0(true, Utilities.i(mb0Var.F - (i4 / mb0Var.d), 1.0f, 0.0f));
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.m0.b = i;
        this.n0.g0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        mb0 mb0Var = this.n0;
        if (mb0Var.O <= 0.0f && !mb0Var.V) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z;
        this.m0.b = 0;
        mb0 mb0Var = this.n0;
        if (mb0Var.F > 0.5f) {
            z = true;
        } else {
            z = false;
        }
        mb0Var.k0(z, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        mb0 mb0Var = this.s0;
        if (!mb0Var.L.b(motionEvent)) {
            if (!mb0Var.V) {
                if (motionEvent.getAction() == 0) {
                    fb0 fb0Var = mb0Var.b;
                    Rect rect = gl.Q;
                    fb0Var.getHitRect(rect);
                    rect.offset(0, (int) mb0Var.r.getY());
                    if (mb0Var.O == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.o0 = true;
                        motionEvent.getX();
                        this.r0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z2 = this.o0) || this.p0)) {
                    float f = this.r0;
                    if (z2) {
                        if (Math.abs(f - motionEvent.getY()) > gl.e) {
                            this.o0 = false;
                            this.p0 = true;
                            this.q0 = mb0Var.F;
                            motionEvent.getX();
                            this.r0 = motionEvent.getY();
                        }
                    } else {
                        mb0Var.m0(true, Utilities.i(((-(f - motionEvent.getY())) / mb0Var.d) + this.q0, 1.0f, 0.0f));
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.p0) {
                        if (mb0Var.F > 0.5f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        mb0Var.k0(z, false, false);
                    }
                    this.o0 = false;
                    this.p0 = false;
                }
            }
            if (!this.p0 && !super.onTouchEvent(motionEvent) && !this.o0) {
                return false;
            }
        }
        return true;
    }
}
