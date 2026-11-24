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
public final class cw1 extends FrameLayout {
    public final byte a;
    public final ChatActivityEnterView b;

    public cw1(ChatActivityEnterView chatActivityEnterView, Context context, byte b) {
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
        il0 il0Var;
        al0 al0Var;
        il0 il0Var2;
        switch (this.a) {
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (chatActivityEnterView.K1) {
                    float f4 = chatActivityEnterView.P1;
                    float f5 = 0.0f;
                    if (f4 > 0.0f) {
                        Paint paint = chatActivityEnterView.O1;
                        int[] iArr = chatActivityEnterView.S1;
                        int[] iArr2 = chatActivityEnterView.R1;
                        float f6 = 1.0f;
                        float i = Utilities.i(f4 * 1.25f, 1.0f, 0.0f);
                        float i2 = Utilities.i((f4 - 0.18f) * 1.25f, 1.0f, 0.0f);
                        float height = getHeight();
                        float min = Math.min(height - gl.L(44.0f), chatActivityEnterView.Z0(this));
                        float width = getWidth() - gl.L(2.5f);
                        ow1 ow1Var = chatActivityEnterView.K0;
                        int i3 = 0;
                        if (ow1Var != null && ow1Var.getVisibility() == 0) {
                            f = 44.0f;
                            RectF rectF2 = gl.P;
                            ow1Var.e(rectF2);
                            ow1Var.getLocationInWindow(iArr2);
                            getLocationInWindow(iArr);
                            float f7 = (iArr2[0] - iArr[0]) + rectF2.left;
                            if (f7 > gl.L(120.0f)) {
                                width = f7 - gl.L(6.0f);
                            }
                        } else {
                            f = 44.0f;
                        }
                        float f8 = 22.0f;
                        if (chatActivityEnterView.M1 == null && chatActivityEnterView.L1 != null) {
                            j92 C0 = chatActivityEnterView.C0();
                            if (C0 != null && (il0Var2 = C0.n) != null) {
                                al0Var = il0Var2.w;
                            } else {
                                al0Var = null;
                            }
                            if (al0Var != null) {
                                il0 c = chatActivityEnterView.L1.c(this, al0Var, false);
                                chatActivityEnterView.M1 = c;
                                c.r(gl.L(22.0f));
                                il0 c2 = chatActivityEnterView.L1.c(this, al0Var, false);
                                chatActivityEnterView.N1 = c2;
                                c2.r(gl.L(22.0f));
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
                                    rectF = gl.P;
                                    f3 = f8;
                                    rectF.set(f5, height - gl.L(f), gl.L(f), height);
                                } else {
                                    f3 = f8;
                                    rectF = gl.P;
                                    rectF.set(gl.L(48.0f), min, width, height);
                                }
                                float R1 = gl.R1(0.92f, f6, f2);
                                canvas.save();
                                canvas.scale(R1, R1, rectF.centerX(), height - (gl.L(f) / 2.0f));
                                if (i3 == 0) {
                                    il0Var = chatActivityEnterView.M1;
                                } else {
                                    il0Var = chatActivityEnterView.N1;
                                }
                                if (il0Var != null) {
                                    il0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                                    il0Var.setAlpha((int) (f2 * 255.0f));
                                    il0Var.draw(canvas);
                                } else {
                                    paint.setColor(bkb.p1(f2, chatActivityEnterView.F0(bkb.Ie)));
                                    canvas.drawRoundRect(rectF, gl.L(f3), gl.L(f3), paint);
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
        ow1 ow1Var;
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
                                x = x3 - ow1Var.l();
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
                qu1 qu1Var = chatActivityEnterView.l0;
                if (qu1Var != null && qu1Var.getVisibility() == 0) {
                    return chatActivityEnterView.l0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (chatActivityEnterView.K && chatActivityEnterView.q7 != 2) {
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
                    return chatActivityEnterView.v0(canvas, new h8c() {
                        @Override
                        public final Object run() {
                            return cw1.this.a(canvas, view, j);
                        }
                    });
                }
                if (chatActivityEnterView.Y5 && view == chatActivityEnterView.f1) {
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
                if (!this.b.K1 && super.hasOverlappingRendering()) {
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
                            childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(s33.f).start();
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
        s33 s33Var;
        switch (this.a) {
            case 1:
                super.onMeasure(i, i2);
                int max = Math.max(gl.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.b;
                y74 y74Var = chatActivityEnterView.f7;
                float f = y74Var.f;
                if (f > 0.0f) {
                    if (y74Var.h) {
                        f = y74Var.g;
                    }
                    float f2 = max;
                    if (f != f2) {
                        y74Var.d = chatActivityEnterView.D0();
                        y74Var.e = (byte) 0;
                        s33 s33Var2 = la2.V;
                        if (chatActivityEnterView.G1 > 0 && SystemClock.uptimeMillis() < chatActivityEnterView.G1 && (s33Var = chatActivityEnterView.H1) != null) {
                            s33Var2 = s33Var;
                        }
                        y74Var.c = s33Var2;
                    }
                    y74Var.a(f2);
                } else {
                    y74Var.c(max);
                }
                chatActivityEnterView.Q();
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
                setPivotX(i - gl.L(22.0f));
                setPivotY(i2 - gl.L(22.0f));
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
                if (chatActivityEnterView.K && chatActivityEnterView.q7 != 2) {
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
                this.b.v2(true);
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }
}
