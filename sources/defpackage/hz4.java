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
public final class hz4 extends vi7 {
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final Paint w0;
    public Boolean x0;
    public final iz4 y0;

    public hz4(iz4 iz4Var, Activity activity) {
        super(activity);
        this.y0 = iz4Var;
        new Paint(1);
        this.w0 = new Paint(1);
    }

    private void setLightStatusBar(int i) {
        boolean z;
        if (gl.B(i) >= 0.721f) {
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
        gl.m3(view, z);
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
        wjb wjbVar;
        ui5 ui5Var;
        a aVar2;
        int i2;
        iz4 iz4Var = this.y0;
        Paint paint = iz4Var.L;
        dr0 dr0Var = iz4Var.E;
        if (!iz4Var.f) {
            boolean z2 = iz4Var.h;
            float f3 = iz4Var.n;
            if (z2) {
                float f4 = f3 + 0.016f;
                iz4Var.n = f4;
                if (f4 > 3.0f) {
                    iz4Var.h = false;
                }
            } else {
                float f5 = f3 - 0.016f;
                iz4Var.n = f5;
                if (f5 < 1.0f) {
                    iz4Var.h = true;
                }
            }
        }
        if (iz4Var.c.getLayoutManager() != null) {
            view = iz4Var.c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            round = 0;
        } else {
            round = Math.round(iz4Var.p0() + view.getBottom());
        }
        iz4Var.r = round;
        FrameLayout o0 = iz4Var.o0();
        int L = gl.L(16.0f) + o0.getBottom();
        float f6 = 1.0f - ((iz4Var.r - L) / (iz4Var.K - L));
        iz4Var.w = f6;
        float f7 = 0.0f;
        iz4Var.w = Utilities.i(f6, 1.0f, 0.0f);
        int L2 = gl.L(16.0f) + o0.getBottom();
        int i3 = iz4Var.r;
        if (i3 < L2) {
            iz4Var.r = L2;
            i3 = L2;
        }
        float f8 = iz4Var.y;
        iz4Var.y = 0.0f;
        if (i3 < gl.L(30.0f) + L2) {
            iz4Var.y = ((gl.L(30.0f) + L2) - iz4Var.r) / gl.L(30.0f);
        }
        if (iz4Var.I) {
            iz4Var.y = 1.0f;
            iz4Var.w = 1.0f;
        }
        if (f8 != iz4Var.y) {
            iz4Var.c.invalidate();
        }
        iz4Var.s0(iz4Var.w);
        int measuredHeight = o0.getMeasuredHeight();
        int i4 = iz4Var.r;
        int measuredHeight2 = dr0Var.getMeasuredHeight();
        l46 l46Var = (l46) dr0Var.c;
        FrameLayout frameLayout = (FrameLayout) dr0Var.e;
        TextView textView = (TextView) dr0Var.b;
        FrameLayout frameLayout2 = (FrameLayout) dr0Var.d;
        int L3 = gl.L(16.0f);
        float max = Math.max((((((measuredHeight - iz4Var.J) - textView.getMeasuredHeight()) / 2.0f) + iz4Var.J) - dr0Var.getTop()) - textView.getTop(), L3 + (i4 - ((measuredHeight2 + measuredHeight) - iz4Var.J)));
        dr0Var.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + gl.L(16.0f) + gl.L(16.0f));
        float f9 = iz4Var.w;
        float A = tb4.A(1.0f, f9, 0.4f, 0.6f);
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
        l46Var.setAlpha(f10);
        if (iz4Var.y0()) {
            if (f10 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            frameLayout2.setVisibility(i2);
            frameLayout.setVisibility(i2);
            l46Var.setVisibility(i2);
        }
        iz4Var.e.setAlpha(1.0f - iz4Var.w);
        iz4Var.e.setTranslationY((frameLayout2.getY() + dr0Var.getY()) - gl.L(30.0f));
        float L4 = gl.L(72.0f) - textView.getLeft();
        float f11 = iz4Var.w;
        if (f11 > 0.3f) {
            f2 = (f11 - 0.3f) / 0.7f;
        } else {
            f2 = 0.0f;
        }
        if (!iz4Var.y0()) {
            f7 = (1.0f - s33.h.getInterpolation(1.0f - f2)) * L4;
        }
        textView.setTranslationX(f7);
        if (!iz4Var.f) {
            invalidate();
        }
        iz4Var.a.d(0, (-getMeasuredWidth()) * 0.1f * iz4Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (iz4Var.N) {
            int themedColor = iz4Var.getThemedColor(bkb.Z6);
            Paint paint2 = this.w0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), iz4Var.a.f);
        }
        int themedColor2 = iz4Var.getThemedColor(bkb.i5);
        if (iz4Var.N) {
            i = bkb.F6;
        } else {
            i = bkb.Jk;
        }
        int f12 = bm2.f(f10, themedColor2, iz4Var.getThemedColor(i));
        aVar = ((d) iz4Var).actionBar;
        if (aVar != null) {
            aVar2 = ((d) iz4Var).actionBar;
            aVar2.getBackButton().setColorFilter(f12);
        }
        textView.setTextColor(f12);
        paint.setAlpha((int) ((1.0f - f10) * 255.0f));
        if (paint.getAlpha() > 0) {
            z = true;
        } else {
            z = false;
        }
        iz4Var.r0(z);
        int i5 = bkb.Ik;
        wjbVar = ((d) iz4Var).resourceProvider;
        setLightStatusBar(bkb.v(bkb.v0(i5, wjbVar), paint.getColor()));
        if (!iz4Var.y0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), o0.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f10 <= 0.01f && iz4Var.m0()) {
            ui5Var = ((d) iz4Var).parentLayout;
            ((ActionBarLayout) ui5Var).n(canvas, 255, o0.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar;
        Layout layout;
        float f;
        a aVar2;
        iz4 iz4Var = this.y0;
        if (!iz4Var.y0()) {
            aVar = ((d) iz4Var).actionBar;
            if (aVar != null) {
                aVar2 = ((d) iz4Var).actionBar;
                ImageView backButton = aVar2.getBackButton();
                if (backButton != null && backButton.getVisibility() == 0) {
                    if (motionEvent.getAction() == 0) {
                        RectF rectF = gl.P;
                        if (zec.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
            dr0 dr0Var = iz4Var.E;
            float x = dr0Var.getX();
            FrameLayout frameLayout = (FrameLayout) dr0Var.e;
            FrameLayout frameLayout2 = (FrameLayout) dr0Var.d;
            l46 l46Var = (l46) dr0Var.c;
            float x2 = l46Var.getX() + x;
            float y = l46Var.getY() + dr0Var.getY();
            RectF rectF2 = gl.P;
            rectF2.set(x2, y, l46Var.getMeasuredWidth() + x2, l46Var.getMeasuredHeight() + y);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.t0) && !iz4Var.c.J1 && (layout = l46Var.getLayout()) != null) {
                CharSequence text = layout.getText();
                f = 1.0f;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0 && iz4Var.y < 1.0f) {
                        motionEvent.offsetLocation(-x2, -y);
                        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                this.t0 = false;
                            }
                        } else {
                            this.t0 = true;
                        }
                        l46Var.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                }
            } else {
                f = 1.0f;
            }
            float x3 = frameLayout2.getX() + dr0Var.getX();
            float y2 = frameLayout2.getY() + dr0Var.getY();
            boolean isClickable = frameLayout2.isClickable();
            rectF2.set(x3, y2, frameLayout2.getMeasuredWidth() + x3, frameLayout2.getMeasuredHeight() + y2);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.s0) && !iz4Var.c.J1 && isClickable && iz4Var.y < f) {
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
            float x4 = frameLayout.getX() + dr0Var.getX();
            float y3 = frameLayout.getY() + dr0Var.getY();
            rectF2.set(x4, y3, frameLayout.getMeasuredWidth() + x4, frameLayout.getMeasuredHeight() + y3);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.u0) && !iz4Var.c.J1 && iz4Var.y < f) {
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
        iz4 iz4Var = this.y0;
        if (view == iz4Var.q0() && !iz4Var.y0()) {
            canvas.save();
            canvas.clipRect(0, iz4Var.o0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz4.onMeasure(int, int):void");
    }
}
