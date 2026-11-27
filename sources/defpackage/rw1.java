package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rw1 extends FrameLayout {
    public final byte a;
    public final ChatActivityEnterView b;

    public rw1(ChatActivityEnterView chatActivityEnterView, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = chatActivityEnterView;
    }

    public final Boolean a(Canvas canvas, View view, long j) {
        return Boolean.valueOf(super.drawChild(canvas, view, j));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        RectF rectF;
        jl0 jl0Var;
        bl0 bl0Var;
        jl0 jl0Var2;
        switch (this.a) {
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (chatActivityEnterView.J1) {
                    float f4 = chatActivityEnterView.O1;
                    float f5 = 0.0f;
                    if (f4 > 0.0f) {
                        Paint paint = chatActivityEnterView.N1;
                        int[] iArr = chatActivityEnterView.R1;
                        int[] iArr2 = chatActivityEnterView.Q1;
                        float f6 = 1.0f;
                        float i = Utilities.i(f4 * 1.25f, 1.0f, 0.0f);
                        float i2 = Utilities.i((f4 - 0.18f) * 1.25f, 1.0f, 0.0f);
                        float height = getHeight();
                        float min = Math.min(height - hl.L(44.0f), chatActivityEnterView.e1(this));
                        float width = getWidth() - hl.L(2.5f);
                        bx1 bx1Var = chatActivityEnterView.K0;
                        int i3 = 0;
                        if (bx1Var != null && bx1Var.getVisibility() == 0) {
                            f = 44.0f;
                            RectF rectF2 = hl.P;
                            bx1Var.e(rectF2);
                            bx1Var.getLocationInWindow(iArr2);
                            getLocationInWindow(iArr);
                            float f7 = (iArr2[0] - iArr[0]) + rectF2.left;
                            if (f7 > hl.L(120.0f)) {
                                width = f7 - hl.L(6.0f);
                            }
                        } else {
                            f = 44.0f;
                        }
                        float f8 = 22.0f;
                        if (chatActivityEnterView.L1 == null && chatActivityEnterView.K1 != null) {
                            z92 G0 = chatActivityEnterView.G0();
                            if (G0 != null && (jl0Var2 = G0.r) != null) {
                                bl0Var = jl0Var2.w;
                            } else {
                                bl0Var = null;
                            }
                            if (bl0Var != null) {
                                jl0 c = chatActivityEnterView.K1.c(this, bl0Var, false);
                                chatActivityEnterView.L1 = c;
                                c.r(hl.L(22.0f));
                                jl0 c2 = chatActivityEnterView.K1.c(this, bl0Var, false);
                                chatActivityEnterView.M1 = c2;
                                c2.r(hl.L(22.0f));
                            }
                        }
                        while (i3 < 2) {
                            if (i3 == 0) {
                                f2 = i;
                            } else {
                                f2 = i2;
                            }
                            if (f2 <= f5) {
                                f3 = f8;
                            } else {
                                if (i3 == 0) {
                                    rectF = hl.P;
                                    f3 = f8;
                                    rectF.set(f5, height - hl.L(f), hl.L(f), height);
                                } else {
                                    f3 = f8;
                                    rectF = hl.P;
                                    rectF.set(hl.L(48.0f), min, width, height);
                                }
                                float R1 = hl.R1(0.92f, f6, f2);
                                canvas.save();
                                canvas.scale(R1, R1, rectF.centerX(), height - (hl.L(f) / 2.0f));
                                if (i3 == 0) {
                                    jl0Var = chatActivityEnterView.L1;
                                } else {
                                    jl0Var = chatActivityEnterView.M1;
                                }
                                if (jl0Var != null) {
                                    jl0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                                    jl0Var.setAlpha((int) (f2 * 255.0f));
                                    jl0Var.draw(canvas);
                                } else {
                                    paint.setColor(aob.p1(f2, chatActivityEnterView.J0(aob.Je)));
                                    canvas.drawRoundRect(rectF, hl.L(f3), hl.L(f3), paint);
                                }
                                canvas.restore();
                            }
                            i3++;
                            f8 = f3;
                            f5 = 0.0f;
                            f6 = 1.0f;
                        }
                    }
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        bx1 bx1Var;
        float x;
        switch (this.a) {
            case 2:
                if (motionEvent.getAction() != 10) {
                    float x2 = motionEvent.getX();
                    float y = motionEvent.getY();
                    for (int i = 0; i < getChildCount(); i++) {
                        View childAt = getChildAt(i);
                        if (childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                            float x3 = childAt.getX() + childAt.getWidth();
                            if (childAt == this.b.K0) {
                                x = x3 - bx1Var.l();
                            } else {
                                x = childAt.getX();
                            }
                            if (x2 >= x && x2 < x3 && y >= childAt.getY() && y < childAt.getY() + childAt.getHeight()) {
                            }
                        }
                    }
                    return false;
                }
                return super.dispatchHoverEvent(motionEvent);
            default:
                return super.dispatchHoverEvent(motionEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                dv1 dv1Var = chatActivityEnterView.l0;
                if (dv1Var != null && dv1Var.getVisibility() == 0) {
                    return chatActivityEnterView.l0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (chatActivityEnterView.K && chatActivityEnterView.V7 != 2) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
        }
    }

    @Override
    public final boolean drawChild(final Canvas canvas, final View view, final long j) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 1:
                if (view != null && view == chatActivityEnterView.F0) {
                    return chatActivityEnterView.y0(canvas, new hcc() {
                        @Override
                        public final Object run() {
                            return rw1.this.a(canvas, view, j);
                        }
                    });
                }
                if (chatActivityEnterView.j6 && view == chatActivityEnterView.f1) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            case 2:
                if (view == chatActivityEnterView.K0 && chatActivityEnterView.i0) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        switch (this.a) {
            case 3:
                if (!this.b.J1 && super.hasOverlappingRendering()) {
                    return true;
                }
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                HashMap hashMap = this.b.C0;
                if (!hashMap.isEmpty()) {
                    for (int i5 = 0; i5 < getChildCount(); i5++) {
                        View childAt = getChildAt(i5);
                        Float f = (Float) hashMap.get(childAt);
                        if (f != null) {
                            childAt.setTranslationX(f.floatValue() - childAt.getLeft());
                            childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(k43.f).start();
                        }
                    }
                    hashMap.clear();
                    return;
                }
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        k43 k43Var;
        switch (this.a) {
            case 1:
                super.onMeasure(i, i2);
                int max = Math.max(hl.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.b;
                t84 t84Var = chatActivityEnterView.K7;
                float f = t84Var.f;
                if (f > 0.0f) {
                    if (t84Var.h) {
                        f = t84Var.g;
                    }
                    float f2 = max;
                    if (f != f2) {
                        t84Var.d = chatActivityEnterView.H0();
                        t84Var.e = (byte) 0;
                        k43 k43Var2 = bb2.V;
                        if (chatActivityEnterView.F1 > 0 && SystemClock.uptimeMillis() < chatActivityEnterView.F1 && (k43Var = chatActivityEnterView.G1) != null) {
                            k43Var2 = k43Var;
                        }
                        t84Var.c = k43Var2;
                    }
                    t84Var.a(f2);
                } else {
                    t84Var.c(max);
                }
                chatActivityEnterView.S();
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 2:
                super.onSizeChanged(i, i2, i3, i4);
                setPivotX(i - hl.L(22.0f));
                setPivotY(i2 - hl.L(22.0f));
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (chatActivityEnterView.K && chatActivityEnterView.V7 != 2) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void setVisibility(int i) {
        switch (this.a) {
            case 3:
                super.setVisibility(i);
                this.b.I2(true);
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }
}
