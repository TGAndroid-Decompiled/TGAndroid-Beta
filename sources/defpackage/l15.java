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
import org.telegram.ui.ActionBar.e;
public final class l15 extends dl7 {
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public final Paint q0;
    public Boolean r0;
    public final m15 s0;

    public l15(m15 m15Var, Activity activity) {
        super(activity);
        this.s0 = m15Var;
        new Paint(1);
        this.q0 = new Paint(1);
    }

    private void setLightStatusBar(int i) {
        boolean z;
        if (hl.B(i) >= 0.721f) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.r0;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        View view = this.s0.fragmentView;
        this.r0 = Boolean.valueOf(z);
        hl.m3(view, z);
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
        vnb vnbVar;
        wk5 wk5Var;
        a aVar2;
        int i2;
        m15 m15Var = this.s0;
        Paint paint = m15Var.L;
        dr0 dr0Var = m15Var.E;
        if (!m15Var.f) {
            boolean z2 = m15Var.h;
            float f3 = m15Var.n;
            if (z2) {
                float f4 = f3 + 0.016f;
                m15Var.n = f4;
                if (f4 > 3.0f) {
                    m15Var.h = false;
                }
            } else {
                float f5 = f3 - 0.016f;
                m15Var.n = f5;
                if (f5 < 1.0f) {
                    m15Var.h = true;
                }
            }
        }
        if (m15Var.c.getLayoutManager() != null) {
            view = m15Var.c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            round = 0;
        } else {
            round = Math.round(m15Var.p0() + view.getBottom());
        }
        m15Var.r = round;
        FrameLayout o0 = m15Var.o0();
        int L = hl.L(16.0f) + o0.getBottom();
        float f6 = 1.0f - ((m15Var.r - L) / (m15Var.K - L));
        m15Var.w = f6;
        float f7 = 0.0f;
        m15Var.w = Utilities.i(f6, 1.0f, 0.0f);
        int L2 = hl.L(16.0f) + o0.getBottom();
        int i3 = m15Var.r;
        if (i3 < L2) {
            m15Var.r = L2;
            i3 = L2;
        }
        float f8 = m15Var.y;
        m15Var.y = 0.0f;
        if (i3 < hl.L(30.0f) + L2) {
            m15Var.y = ((hl.L(30.0f) + L2) - m15Var.r) / hl.L(30.0f);
        }
        if (m15Var.I) {
            m15Var.y = 1.0f;
            m15Var.w = 1.0f;
        }
        if (f8 != m15Var.y) {
            m15Var.c.invalidate();
        }
        m15Var.s0(m15Var.w);
        int measuredHeight = o0.getMeasuredHeight();
        int i4 = m15Var.r;
        int measuredHeight2 = dr0Var.getMeasuredHeight();
        p66 p66Var = (p66) dr0Var.c;
        FrameLayout frameLayout = (FrameLayout) dr0Var.e;
        TextView textView = (TextView) dr0Var.b;
        FrameLayout frameLayout2 = (FrameLayout) dr0Var.d;
        int L3 = hl.L(16.0f);
        float max = Math.max((((((measuredHeight - m15Var.J) - textView.getMeasuredHeight()) / 2.0f) + m15Var.J) - dr0Var.getTop()) - textView.getTop(), L3 + (i4 - ((measuredHeight2 + measuredHeight) - m15Var.J)));
        dr0Var.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + hl.L(16.0f) + hl.L(16.0f));
        float f9 = m15Var.w;
        float A = qd4.A(1.0f, f9, 0.4f, 0.6f);
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
        p66Var.setAlpha(f10);
        if (m15Var.z0()) {
            if (f10 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            frameLayout2.setVisibility(i2);
            frameLayout.setVisibility(i2);
            p66Var.setVisibility(i2);
        }
        m15Var.e.setAlpha(1.0f - m15Var.w);
        m15Var.e.setTranslationY((frameLayout2.getY() + dr0Var.getY()) - hl.L(30.0f));
        float L4 = hl.L(72.0f) - textView.getLeft();
        float f11 = m15Var.w;
        if (f11 > 0.3f) {
            f2 = (f11 - 0.3f) / 0.7f;
        } else {
            f2 = 0.0f;
        }
        if (!m15Var.z0()) {
            f7 = (1.0f - k43.h.getInterpolation(1.0f - f2)) * L4;
        }
        textView.setTranslationX(f7);
        if (!m15Var.f) {
            invalidate();
        }
        m15Var.a.d(0, (-getMeasuredWidth()) * 0.1f * m15Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (m15Var.N) {
            int themedColor = m15Var.getThemedColor(aob.a7);
            Paint paint2 = this.q0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), m15Var.a.f);
        }
        int themedColor2 = m15Var.getThemedColor(aob.j5);
        if (m15Var.N) {
            i = aob.G6;
        } else {
            i = aob.Kk;
        }
        int f12 = vm2.f(f10, themedColor2, m15Var.getThemedColor(i));
        aVar = ((e) m15Var).actionBar;
        if (aVar != null) {
            aVar2 = ((e) m15Var).actionBar;
            aVar2.getBackButton().setColorFilter(f12);
        }
        textView.setTextColor(f12);
        paint.setAlpha((int) ((1.0f - f10) * 255.0f));
        if (paint.getAlpha() > 0) {
            z = true;
        } else {
            z = false;
        }
        m15Var.r0(z);
        int i5 = aob.Jk;
        vnbVar = ((e) m15Var).resourceProvider;
        setLightStatusBar(aob.v(aob.v0(i5, vnbVar), paint.getColor()));
        if (!m15Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), o0.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f10 <= 0.01f && m15Var.m0()) {
            wk5Var = ((e) m15Var).parentLayout;
            ((ActionBarLayout) wk5Var).n(canvas, 255, o0.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar;
        Layout layout;
        float f;
        a aVar2;
        m15 m15Var = this.s0;
        if (!m15Var.z0()) {
            aVar = ((e) m15Var).actionBar;
            if (aVar != null) {
                aVar2 = ((e) m15Var).actionBar;
                ImageView backButton = aVar2.getBackButton();
                if (backButton != null && backButton.getVisibility() == 0) {
                    if (motionEvent.getAction() == 0) {
                        RectF rectF = hl.P;
                        if (yic.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.p0 = true;
                        }
                    }
                    if (this.p0) {
                        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            return dispatchTouchEvent;
                        }
                        this.p0 = false;
                        return dispatchTouchEvent;
                    }
                }
            }
            dr0 dr0Var = m15Var.E;
            float x = dr0Var.getX();
            FrameLayout frameLayout = (FrameLayout) dr0Var.e;
            FrameLayout frameLayout2 = (FrameLayout) dr0Var.d;
            p66 p66Var = (p66) dr0Var.c;
            float x2 = p66Var.getX() + x;
            float y = p66Var.getY() + dr0Var.getY();
            RectF rectF2 = hl.P;
            rectF2.set(x2, y, p66Var.getMeasuredWidth() + x2, p66Var.getMeasuredHeight() + y);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.n0) && !m15Var.c.J1 && (layout = p66Var.getLayout()) != null) {
                CharSequence text = layout.getText();
                f = 1.0f;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0 && m15Var.y < 1.0f) {
                        motionEvent.offsetLocation(-x2, -y);
                        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                this.n0 = false;
                            }
                        } else {
                            this.n0 = true;
                        }
                        p66Var.dispatchTouchEvent(motionEvent);
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
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.m0) && !m15Var.c.J1 && isClickable && m15Var.y < f) {
                motionEvent.offsetLocation(-x3, -y2);
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.m0 = false;
                    }
                } else {
                    this.m0 = true;
                }
                frameLayout2.dispatchTouchEvent(motionEvent);
                return true;
            }
            float x4 = frameLayout.getX() + dr0Var.getX();
            float y3 = frameLayout.getY() + dr0Var.getY();
            rectF2.set(x4, y3, frameLayout.getMeasuredWidth() + x4, frameLayout.getMeasuredHeight() + y3);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.o0) && !m15Var.c.J1 && m15Var.y < f) {
                motionEvent.offsetLocation(-x4, -y3);
                if (motionEvent.getAction() == 0) {
                    this.o0 = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.o0 = false;
                }
                frameLayout.dispatchTouchEvent(motionEvent);
                if (this.o0) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        m15 m15Var = this.s0;
        if (view == m15Var.q0() && !m15Var.z0()) {
            canvas.save();
            canvas.clipRect(0, m15Var.o0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l15.onMeasure(int, int):void");
    }
}
