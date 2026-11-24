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
public final class cc0 extends ela {
    public final az8 m0;
    public final mc0 n0;
    public boolean o0;
    public boolean p0;
    public float q0;
    public float r0;
    public final mc0 s0;

    public cc0(mc0 mc0Var, Context context) {
        super(context, null);
        this.s0 = mc0Var;
        this.n0 = mc0Var;
        this.m0 = new az8((byte) 3);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        mc0 mc0Var = this.s0;
        if (!mc0Var.V) {
            if (!mc0Var.h) {
                canvas.save();
                float x = mc0Var.a.getX() + mc0Var.r.getX();
                float y = mc0Var.a.getY() + mc0Var.r.getY();
                int i = mc0Var.d - mc0Var.c;
                float R1 = gm.R1(y, gm.m + ((a.getCurrentActionBarHeight() - mc0Var.c) >> 1), mc0Var.O);
                canvas.translate(x, R1);
                mc0Var.a.draw(canvas);
                RectF rectF = gm.P;
                float f2 = i / 2.0f;
                rectF.set(x, R1 - (mc0Var.F * f2), mc0Var.a.getMeasuredWidth() + x, (f2 * mc0Var.F) + mc0Var.a.getMeasuredHeight() + R1);
                dc0 dc0Var = mc0Var.a;
                float f3 = x + dc0Var.E;
                float f4 = R1 + dc0Var.F;
                zb1 zb1Var = mc0Var.L;
                float f5 = dc0Var.y;
                zb1Var.getClass();
                rectF.set((int) (f3 - f5), (int) (f4 - f5), (int) (f3 + f5), (int) (f4 + f5));
                zb1Var.i = false;
                zb1Var.c = 0;
                zb1Var.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float f6 = mc0Var.a.s.c;
            if (mc0Var.e.getVisibility() == 0) {
                f = mc0Var.e.getAlpha();
            } else {
                f = 0.0f;
            }
            float f7 = (1.0f - f) * f6;
            int i2 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            a aVar = mc0Var.I;
            if (i2 != 0) {
                aVar.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(mc0Var.I.getX(), mc0Var.I.getY());
                if (f7 != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, mc0Var.I.getMeasuredWidth(), mc0Var.I.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                mc0Var.I.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                aVar.setVisibility(8);
            }
        }
        if (mc0Var.f) {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        Canvas canvas2;
        mc0 mc0Var = this.s0;
        Paint paint = mc0Var.P;
        if (view != mc0Var.I) {
            aVar = ((d) mc0Var).actionBar;
            if (view == aVar && mc0Var.O > 0.0f) {
                paint.setColor(cmb.w0(null, cmb.c6, false));
                paint.setAlpha((int) (mc0Var.O * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
                ((ActionBarLayout) mc0Var.getParentLayout()).n(canvas2, (int) (mc0Var.O * 255.0f), view.getMeasuredHeight());
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
        mc0 mc0Var = this.s0;
        float f2 = 0.0f;
        if (z != mc0Var.V) {
            mc0Var.V = z;
            gm.B2(mc0Var.a);
            gm.U2(mc0Var.getParentActivity(), mc0Var.getClassGuid());
            if (mc0Var.V) {
                mc0Var.n0(false, 0.0f);
                mc0Var.a.setExpanded(false);
                addView(mc0Var.a, 0, qoe.c(-1.0f, -1));
            } else {
                mc0Var.r.addView(mc0Var.a, 0, qoe.c(-2.0f, -1));
            }
            gm.V2(mc0Var.getParentActivity(), mc0Var.getClassGuid());
        }
        if (mc0Var.V) {
            int size = (int) (View.MeasureSpec.getSize(i) * 0.55f);
            ((ViewGroup.MarginLayoutParams) mc0Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) mc0Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i) * 0.45f);
            ((ViewGroup.MarginLayoutParams) mc0Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) mc0Var.y.getLayoutParams()).rightMargin = gm.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) mc0Var.X.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) mc0Var.W.getLayoutParams()).topMargin = gm.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) mc0Var.r.getLayoutParams()).bottomMargin = gm.L(64.0f);
            ((ViewGroup.MarginLayoutParams) mc0Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) mc0Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) mc0Var.y.getLayoutParams()).rightMargin = gm.L(16.0f);
            ((ViewGroup.MarginLayoutParams) mc0Var.X.getLayoutParams()).topMargin = gm.L(10.0f);
            ((ViewGroup.MarginLayoutParams) mc0Var.W.getLayoutParams()).topMargin = gm.L(18.0f);
        }
        boolean z3 = mc0Var.M;
        if (this.f >= gm.L(20.0f)) {
            z2 = true;
        } else {
            z2 = false;
        }
        mc0Var.M = z2;
        if (z3 != z2) {
            super.onMeasure(i, i2);
            if (mc0Var.M) {
                aVar = ((d) mc0Var).actionBar;
                i3 = gm.L(8.0f) + aVar.getMeasuredHeight() + (-mc0Var.b.getTop());
            } else {
                i3 = 0;
            }
            qmb qmbVar = mc0Var.r;
            qmbVar.setTranslationY((qmbVar.getTranslationY() + ((ViewGroup.MarginLayoutParams) mc0Var.r.getLayoutParams()).topMargin) - i3);
            ((ViewGroup.MarginLayoutParams) mc0Var.r.getLayoutParams()).topMargin = i3;
            boolean z4 = mc0Var.M;
            if (!mc0Var.V) {
                float f3 = mc0Var.O;
                if (z4) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                mc0Var.N = ValueAnimator.ofFloat(f3, f);
                float f4 = ((mc0Var.d - mc0Var.c) - gm.m) * mc0Var.F;
                if (z4) {
                    mc0Var.a.setExpanded(false);
                    f4 = mc0Var.r.getTranslationY();
                } else {
                    f2 = mc0Var.r.getTranslationY();
                }
                if (mc0Var.G && !z4) {
                    mc0Var.a.setExpanded(true);
                } else {
                    mc0Var.G = false;
                }
                mc0Var.N.addUpdateListener(new gc0(mc0Var, f4, f2, z4));
                mc0Var.N.addListener(new zb0(mc0Var, (byte) 1));
                mc0Var.N.setDuration(250L);
                mc0Var.N.setInterpolator(gb.w);
                mc0Var.N.start();
            }
        }
        super.onMeasure(i, i2);
        mc0Var.c = mc0Var.a.getMeasuredHeight();
        mc0Var.d = mc0Var.a.getMeasuredWidth();
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
        mc0 mc0Var = this.n0;
        if (mc0Var.O <= 0.0f && !mc0Var.V && i2 > 0 && mc0Var.F > 0.0f) {
            mc0Var.h0();
            mc0Var.n0(true, Utilities.i(mc0Var.F - (i2 / mc0Var.d), 1.0f, 0.0f));
            iArr[1] = i2;
        }
    }

    @Override
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mc0 mc0Var = this.n0;
        if (mc0Var.O <= 0.0f && !mc0Var.V && i4 != 0) {
            mc0Var.h0();
            mc0Var.n0(true, Utilities.i(mc0Var.F - (i4 / mc0Var.d), 1.0f, 0.0f));
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.m0.b = i;
        this.n0.h0();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        mc0 mc0Var = this.n0;
        if (mc0Var.O <= 0.0f && !mc0Var.V) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z;
        this.m0.b = 0;
        mc0 mc0Var = this.n0;
        if (mc0Var.F > 0.5f) {
            z = true;
        } else {
            z = false;
        }
        mc0Var.l0(z, false, false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        mc0 mc0Var = this.s0;
        if (!mc0Var.L.b(motionEvent)) {
            if (!mc0Var.V) {
                if (motionEvent.getAction() == 0) {
                    fc0 fc0Var = mc0Var.b;
                    Rect rect = gm.Q;
                    fc0Var.getHitRect(rect);
                    rect.offset(0, (int) mc0Var.r.getY());
                    if (mc0Var.O == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.o0 = true;
                        motionEvent.getX();
                        this.r0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z2 = this.o0) || this.p0)) {
                    float f = this.r0;
                    if (z2) {
                        if (Math.abs(f - motionEvent.getY()) > gm.e) {
                            this.o0 = false;
                            this.p0 = true;
                            this.q0 = mc0Var.F;
                            motionEvent.getX();
                            this.r0 = motionEvent.getY();
                        }
                    } else {
                        mc0Var.n0(true, Utilities.i(((-(f - motionEvent.getY())) / mc0Var.d) + this.q0, 1.0f, 0.0f));
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.p0) {
                        if (mc0Var.F > 0.5f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        mc0Var.l0(z, false, false);
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
