package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class g15 extends xk7 {
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final Paint w0;
    public Boolean x0;
    public final h15 y0;

    public g15(h15 h15Var, Activity activity) {
        super(activity);
        this.y0 = h15Var;
        new Paint(1);
        this.w0 = new Paint(1);
    }

    private void setLightStatusBar(int i) {
        boolean z;
        if (gm.B(i) >= 0.721f) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.x0;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        View view = this.y0.fragmentView;
        this.x0 = Boolean.valueOf(z);
        gm.m3(view, z);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int round;
        float f;
        float f2;
        int i;
        a aVar;
        boolean z;
        ylb ylbVar;
        tk5 tk5Var;
        a aVar2;
        int i2;
        h15 h15Var = this.y0;
        Paint paint = h15Var.L;
        ds0 ds0Var = h15Var.E;
        if (!h15Var.f) {
            boolean z2 = h15Var.h;
            float f3 = h15Var.n;
            if (z2) {
                float f4 = f3 + 0.016f;
                h15Var.n = f4;
                if (f4 > 3.0f) {
                    h15Var.h = false;
                }
            } else {
                float f5 = f3 - 0.016f;
                h15Var.n = f5;
                if (f5 < 1.0f) {
                    h15Var.h = true;
                }
            }
        }
        if (h15Var.c.getLayoutManager() != null) {
            view = h15Var.c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            round = 0;
        } else {
            round = Math.round(h15Var.q0() + view.getBottom());
        }
        h15Var.r = round;
        FrameLayout p0 = h15Var.p0();
        int L = gm.L(16.0f) + p0.getBottom();
        float f6 = 1.0f - ((h15Var.r - L) / (h15Var.K - L));
        h15Var.w = f6;
        float f7 = 0.0f;
        h15Var.w = Utilities.i(f6, 1.0f, 0.0f);
        int L2 = gm.L(16.0f) + p0.getBottom();
        int i3 = h15Var.r;
        if (i3 < L2) {
            h15Var.r = L2;
            i3 = L2;
        }
        float f8 = h15Var.y;
        h15Var.y = 0.0f;
        if (i3 < gm.L(30.0f) + L2) {
            h15Var.y = ((gm.L(30.0f) + L2) - h15Var.r) / gm.L(30.0f);
        }
        if (h15Var.I) {
            h15Var.y = 1.0f;
            h15Var.w = 1.0f;
        }
        if (f8 != h15Var.y) {
            h15Var.c.invalidate();
        }
        h15Var.t0(h15Var.w);
        int measuredHeight = p0.getMeasuredHeight();
        int i4 = h15Var.r;
        int measuredHeight2 = ds0Var.getMeasuredHeight();
        l66 l66Var = (l66) ds0Var.c;
        FrameLayout frameLayout = (FrameLayout) ds0Var.e;
        TextView textView = (TextView) ds0Var.b;
        FrameLayout frameLayout2 = (FrameLayout) ds0Var.d;
        int L3 = gm.L(16.0f);
        float max = Math.max((((((measuredHeight - h15Var.J) - textView.getMeasuredHeight()) / 2.0f) + h15Var.J) - ds0Var.getTop()) - textView.getTop(), L3 + (i4 - ((measuredHeight2 + measuredHeight) - h15Var.J)));
        ds0Var.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + gm.L(16.0f) + gm.L(16.0f));
        float f9 = h15Var.w;
        float A = td4.A(1.0f, f9, 0.4f, 0.6f);
        if (f9 > 0.5f) {
            f = (f9 - 0.5f) / 0.5f;
        } else {
            f = 0.0f;
        }
        float f10 = 1.0f - f;
        frameLayout2.setScaleX(A);
        frameLayout2.setScaleY(A);
        frameLayout2.setAlpha(f10);
        frameLayout.setAlpha(f10);
        l66Var.setAlpha(f10);
        if (h15Var.z0()) {
            if (f10 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            frameLayout2.setVisibility(i2);
            frameLayout.setVisibility(i2);
            l66Var.setVisibility(i2);
        }
        h15Var.e.setAlpha(1.0f - h15Var.w);
        h15Var.e.setTranslationY((frameLayout2.getY() + ds0Var.getY()) - gm.L(30.0f));
        float L4 = gm.L(72.0f) - textView.getLeft();
        float f11 = h15Var.w;
        if (f11 > 0.3f) {
            f2 = (f11 - 0.3f) / 0.7f;
        } else {
            f2 = 0.0f;
        }
        if (!h15Var.z0()) {
            f7 = (1.0f - d53.h.getInterpolation(1.0f - f2)) * L4;
        }
        textView.setTranslationX(f7);
        if (!h15Var.f) {
            invalidate();
        }
        h15Var.a.d(0, (-getMeasuredWidth()) * 0.1f * h15Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (h15Var.N) {
            int themedColor = h15Var.getThemedColor(cmb.Z6);
            Paint paint2 = this.w0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), h15Var.a.f);
        }
        int themedColor2 = h15Var.getThemedColor(cmb.i5);
        if (h15Var.N) {
            i = cmb.F6;
        } else {
            i = cmb.Jk;
        }
        int f12 = on2.f(f10, themedColor2, h15Var.getThemedColor(i));
        aVar = ((d) h15Var).actionBar;
        if (aVar != null) {
            aVar2 = ((d) h15Var).actionBar;
            aVar2.getBackButton().setColorFilter(f12);
        }
        textView.setTextColor(f12);
        paint.setAlpha((int) ((1.0f - f10) * 255.0f));
        if (paint.getAlpha() > 0) {
            z = true;
        } else {
            z = false;
        }
        h15Var.s0(z);
        int i5 = cmb.Ik;
        ylbVar = ((d) h15Var).resourceProvider;
        setLightStatusBar(cmb.v(cmb.v0(i5, ylbVar), paint.getColor()));
        if (!h15Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p0.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f10 <= 0.01f && h15Var.n0()) {
            tk5Var = ((d) h15Var).parentLayout;
            ((ActionBarLayout) tk5Var).n(canvas, 255, p0.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar;
        Layout layout;
        float f;
        a aVar2;
        h15 h15Var = this.y0;
        if (!h15Var.z0()) {
            aVar = ((d) h15Var).actionBar;
            if (aVar != null) {
                aVar2 = ((d) h15Var).actionBar;
                ImageView backButton = aVar2.getBackButton();
                if (backButton != null && backButton.getVisibility() == 0) {
                    if (motionEvent.getAction() == 0) {
                        RectF rectF = gm.P;
                        if (zgc.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.v0 = true;
                        }
                    }
                    if (this.v0) {
                        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            return dispatchTouchEvent;
                        }
                        this.v0 = false;
                        return dispatchTouchEvent;
                    }
                }
            }
            ds0 ds0Var = h15Var.E;
            float x = ds0Var.getX();
            FrameLayout frameLayout = (FrameLayout) ds0Var.e;
            FrameLayout frameLayout2 = (FrameLayout) ds0Var.d;
            l66 l66Var = (l66) ds0Var.c;
            float x2 = l66Var.getX() + x;
            float y = l66Var.getY() + ds0Var.getY();
            RectF rectF2 = gm.P;
            rectF2.set(x2, y, l66Var.getMeasuredWidth() + x2, l66Var.getMeasuredHeight() + y);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.t0) && !h15Var.c.J1 && (layout = l66Var.getLayout()) != null) {
                CharSequence text = layout.getText();
                f = 1.0f;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0 && h15Var.y < 1.0f) {
                        motionEvent.offsetLocation(-x2, -y);
                        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                this.t0 = false;
                            }
                        } else {
                            this.t0 = true;
                        }
                        l66Var.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                }
            } else {
                f = 1.0f;
            }
            float x3 = frameLayout2.getX() + ds0Var.getX();
            float y2 = frameLayout2.getY() + ds0Var.getY();
            boolean isClickable = frameLayout2.isClickable();
            rectF2.set(x3, y2, frameLayout2.getMeasuredWidth() + x3, frameLayout2.getMeasuredHeight() + y2);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.s0) && !h15Var.c.J1 && isClickable && h15Var.y < f) {
                motionEvent.offsetLocation(-x3, -y2);
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.s0 = false;
                    }
                } else {
                    this.s0 = true;
                }
                frameLayout2.dispatchTouchEvent(motionEvent);
                return true;
            }
            float x4 = frameLayout.getX() + ds0Var.getX();
            float y3 = frameLayout.getY() + ds0Var.getY();
            rectF2.set(x4, y3, frameLayout.getMeasuredWidth() + x4, frameLayout.getMeasuredHeight() + y3);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.u0) && !h15Var.c.J1 && h15Var.y < f) {
                motionEvent.offsetLocation(-x4, -y3);
                if (motionEvent.getAction() == 0) {
                    this.u0 = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.u0 = false;
                }
                frameLayout.dispatchTouchEvent(motionEvent);
                if (this.u0) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        h15 h15Var = this.y0;
        if (view == h15Var.r0() && !h15Var.z0()) {
            canvas.save();
            canvas.clipRect(0, h15Var.p0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g15.onMeasure(int, int):void");
    }
}
