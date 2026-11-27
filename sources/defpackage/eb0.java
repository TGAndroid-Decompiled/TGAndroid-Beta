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
import org.telegram.ui.ActionBar.e;
public final class eb0 extends wma {
    public final l09 g0;
    public final ob0 h0;
    public boolean i0;
    public boolean j0;
    public float k0;
    public float l0;
    public final ob0 m0;

    public eb0(ob0 ob0Var, Context context) {
        super(context, null);
        this.m0 = ob0Var;
        this.h0 = ob0Var;
        this.g0 = new l09((byte) 3);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        ob0 ob0Var = this.m0;
        if (!ob0Var.V) {
            if (!ob0Var.h) {
                canvas.save();
                float x = ob0Var.a.getX() + ob0Var.r.getX();
                float y = ob0Var.a.getY() + ob0Var.r.getY();
                int i = ob0Var.d - ob0Var.c;
                float R1 = hl.R1(y, hl.m + ((a.getCurrentActionBarHeight() - ob0Var.c) >> 1), ob0Var.O);
                canvas.translate(x, R1);
                ob0Var.a.draw(canvas);
                RectF rectF = hl.P;
                float f2 = i / 2.0f;
                rectF.set(x, R1 - (ob0Var.F * f2), ob0Var.a.getMeasuredWidth() + x, (f2 * ob0Var.F) + ob0Var.a.getMeasuredHeight() + R1);
                fb0 fb0Var = ob0Var.a;
                float f3 = x + fb0Var.E;
                float f4 = R1 + fb0Var.F;
                za1 za1Var = ob0Var.L;
                float f5 = fb0Var.y;
                za1Var.getClass();
                rectF.set((int) (f3 - f5), (int) (f4 - f5), (int) (f3 + f5), (int) (f4 + f5));
                za1Var.i = false;
                za1Var.c = 0;
                za1Var.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f6 = ob0Var.a.s.c;
            if (ob0Var.e.getVisibility() == 0) {
                f = ob0Var.e.getAlpha();
            } else {
                f = 0.0f;
            }
            float f7 = (1.0f - f) * f6;
            int i2 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            a aVar = ob0Var.I;
            if (i2 != 0) {
                aVar.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(ob0Var.I.getX(), ob0Var.I.getY());
                if (f7 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ob0Var.I.getMeasuredWidth(), ob0Var.I.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                ob0Var.I.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                aVar.setVisibility(8);
            }
        }
        if (ob0Var.f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        Canvas canvas2;
        ob0 ob0Var = this.m0;
        Paint paint = ob0Var.P;
        if (view != ob0Var.I) {
            aVar = ((e) ob0Var).actionBar;
            if (view == aVar && ob0Var.O > 0.0f) {
                paint.setColor(aob.w0(null, aob.d6, false));
                paint.setAlpha((int) (ob0Var.O * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) ob0Var.getParentLayout()).n(canvas2, (int) (ob0Var.O * 255.0f), view.getMeasuredHeight());
            } else {
                canvas2 = canvas;
            }
            return super.drawChild(canvas2, view, j);
        }
        return true;
    }

    @Override
    public final int getNestedScrollAxes() {
        return this.g0.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.m0.O == 0.0f) {
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
        ob0 ob0Var = this.m0;
        float f2 = 0.0f;
        if (z != ob0Var.V) {
            ob0Var.V = z;
            hl.B2(ob0Var.a);
            hl.U2(ob0Var.getParentActivity(), ob0Var.getClassGuid());
            if (ob0Var.V) {
                ob0Var.m0(false, 0.0f);
                ob0Var.a.setExpanded(false);
                addView(ob0Var.a, 0, tre.c(-1.0f, -1));
            } else {
                ob0Var.r.addView(ob0Var.a, 0, tre.c(-2.0f, -1));
            }
            hl.V2(ob0Var.getParentActivity(), ob0Var.getClassGuid());
        }
        if (ob0Var.V) {
            int size = (int) (View.MeasureSpec.getSize(i) * 0.55f);
            ((ViewGroup.MarginLayoutParams) ob0Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) ob0Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i) * 0.45f);
            ((ViewGroup.MarginLayoutParams) ob0Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) ob0Var.y.getLayoutParams()).rightMargin = hl.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) ob0Var.X.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) ob0Var.W.getLayoutParams()).topMargin = hl.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) ob0Var.r.getLayoutParams()).bottomMargin = hl.L(64.0f);
            ((ViewGroup.MarginLayoutParams) ob0Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) ob0Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) ob0Var.y.getLayoutParams()).rightMargin = hl.L(16.0f);
            ((ViewGroup.MarginLayoutParams) ob0Var.X.getLayoutParams()).topMargin = hl.L(10.0f);
            ((ViewGroup.MarginLayoutParams) ob0Var.W.getLayoutParams()).topMargin = hl.L(18.0f);
        }
        boolean z3 = ob0Var.M;
        if (this.f >= hl.L(20.0f)) {
            z2 = true;
        } else {
            z2 = false;
        }
        ob0Var.M = z2;
        if (z3 != z2) {
            super.onMeasure(i, i2);
            if (ob0Var.M) {
                aVar = ((e) ob0Var).actionBar;
                i3 = hl.L(8.0f) + aVar.getMeasuredHeight() + (-ob0Var.b.getTop());
            } else {
                i3 = 0;
            }
            oob oobVar = ob0Var.r;
            oobVar.setTranslationY((oobVar.getTranslationY() + ((ViewGroup.MarginLayoutParams) ob0Var.r.getLayoutParams()).topMargin) - i3);
            ((ViewGroup.MarginLayoutParams) ob0Var.r.getLayoutParams()).topMargin = i3;
            boolean z4 = ob0Var.M;
            if (!ob0Var.V) {
                float f3 = ob0Var.O;
                if (z4) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ob0Var.N = ValueAnimator.ofFloat(f3, f);
                float f4 = ((ob0Var.d - ob0Var.c) - hl.m) * ob0Var.F;
                if (z4) {
                    ob0Var.a.setExpanded(false);
                    f4 = ob0Var.r.getTranslationY();
                } else {
                    f2 = ob0Var.r.getTranslationY();
                }
                if (ob0Var.G && !z4) {
                    ob0Var.a.setExpanded(true);
                } else {
                    ob0Var.G = false;
                }
                ob0Var.N.addUpdateListener(new ib0(ob0Var, f4, f2, z4));
                ob0Var.N.addListener(new bb0(ob0Var, (byte) 1));
                ob0Var.N.setDuration(250L);
                ob0Var.N.setInterpolator(hb.w);
                ob0Var.N.start();
            }
        }
        super.onMeasure(i, i2);
        ob0Var.c = ob0Var.a.getMeasuredHeight();
        ob0Var.d = ob0Var.a.getMeasuredWidth();
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
        ob0 ob0Var = this.h0;
        if (ob0Var.O <= 0.0f && !ob0Var.V && i2 > 0 && ob0Var.F > 0.0f) {
            ob0Var.g0();
            ob0Var.m0(true, Utilities.i(ob0Var.F - (i2 / ob0Var.d), 1.0f, 0.0f));
            iArr[1] = i2;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        ob0 ob0Var = this.h0;
        if (ob0Var.O <= 0.0f && !ob0Var.V && i4 != 0) {
            ob0Var.g0();
            ob0Var.m0(true, Utilities.i(ob0Var.F - (i4 / ob0Var.d), 1.0f, 0.0f));
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.g0.b = i;
        this.h0.g0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        ob0 ob0Var = this.h0;
        if (ob0Var.O <= 0.0f && !ob0Var.V) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z;
        this.g0.b = 0;
        ob0 ob0Var = this.h0;
        if (ob0Var.F > 0.5f) {
            z = true;
        } else {
            z = false;
        }
        ob0Var.k0(z, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        ob0 ob0Var = this.m0;
        if (!ob0Var.L.b(motionEvent)) {
            if (!ob0Var.V) {
                if (motionEvent.getAction() == 0) {
                    hb0 hb0Var = ob0Var.b;
                    Rect rect = hl.Q;
                    hb0Var.getHitRect(rect);
                    rect.offset(0, (int) ob0Var.r.getY());
                    if (ob0Var.O == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.i0 = true;
                        motionEvent.getX();
                        this.l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z2 = this.i0) || this.j0)) {
                    float f = this.l0;
                    if (z2) {
                        if (Math.abs(f - motionEvent.getY()) > hl.e) {
                            this.i0 = false;
                            this.j0 = true;
                            this.k0 = ob0Var.F;
                            motionEvent.getX();
                            this.l0 = motionEvent.getY();
                        }
                    } else {
                        ob0Var.m0(true, Utilities.i(((-(f - motionEvent.getY())) / ob0Var.d) + this.k0, 1.0f, 0.0f));
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.j0) {
                        if (ob0Var.F > 0.5f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ob0Var.k0(z, false, false);
                    }
                    this.i0 = false;
                    this.j0 = false;
                }
            }
            if (!this.j0 && !super.onTouchEvent(motionEvent) && !this.i0) {
                return false;
            }
        }
        return true;
    }
}
