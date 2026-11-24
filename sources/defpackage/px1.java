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
public final class px1 extends FrameLayout {
    public final byte a;
    public final ChatActivityEnterView b;

    public px1(ChatActivityEnterView chatActivityEnterView, Context context, byte b) {
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
        im0 im0Var;
        am0 am0Var;
        im0 im0Var2;
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
                        float min = Math.min(height - gm.L(44.0f), chatActivityEnterView.b1(this));
                        float width = getWidth() - gm.L(2.5f);
                        by1 by1Var = chatActivityEnterView.K0;
                        int i3 = 0;
                        if (by1Var != null && by1Var.getVisibility() == 0) {
                            f = 44.0f;
                            RectF rectF2 = gm.P;
                            by1Var.e(rectF2);
                            by1Var.getLocationInWindow(iArr2);
                            getLocationInWindow(iArr);
                            float f7 = (iArr2[0] - iArr[0]) + rectF2.left;
                            if (f7 > gm.L(120.0f)) {
                                width = f7 - gm.L(6.0f);
                            }
                        } else {
                            f = 44.0f;
                        }
                        float f8 = 22.0f;
                        if (chatActivityEnterView.M1 == null && chatActivityEnterView.L1 != null) {
                            va2 C0 = chatActivityEnterView.C0();
                            if (C0 != null && (im0Var2 = C0.n) != null) {
                                am0Var = im0Var2.w;
                            } else {
                                am0Var = null;
                            }
                            if (am0Var != null) {
                                im0 c = chatActivityEnterView.L1.c(this, am0Var, false);
                                chatActivityEnterView.M1 = c;
                                c.r(gm.L(22.0f));
                                im0 c2 = chatActivityEnterView.L1.c(this, am0Var, false);
                                chatActivityEnterView.N1 = c2;
                                c2.r(gm.L(22.0f));
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
                                    rectF = gm.P;
                                    f3 = f8;
                                    rectF.set(f5, height - gm.L(f), gm.L(f), height);
                                } else {
                                    f3 = f8;
                                    rectF = gm.P;
                                    rectF.set(gm.L(48.0f), min, width, height);
                                }
                                float R1 = gm.R1(0.92f, f6, f2);
                                canvas.save();
                                canvas.scale(R1, R1, rectF.centerX(), height - (gm.L(f) / 2.0f));
                                if (i3 == 0) {
                                    im0Var = chatActivityEnterView.M1;
                                } else {
                                    im0Var = chatActivityEnterView.N1;
                                }
                                if (im0Var != null) {
                                    im0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                                    im0Var.setAlpha((int) (f2 * 255.0f));
                                    im0Var.draw(canvas);
                                } else {
                                    paint.setColor(cmb.p1(f2, chatActivityEnterView.F0(cmb.Ie)));
                                    canvas.drawRoundRect(rectF, gm.L(f3), gm.L(f3), paint);
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
        by1 by1Var;
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
                                x = x3 - by1Var.l();
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
                cw1 cw1Var = chatActivityEnterView.l0;
                if (cw1Var != null && cw1Var.getVisibility() == 0) {
                    return chatActivityEnterView.l0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (chatActivityEnterView.K && chatActivityEnterView.y7 != 2) {
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
                    return chatActivityEnterView.v0(canvas, new iac() {
                        @Override
                        public final Object run() {
                            return px1.this.a(canvas, view, j);
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
                ChatActivityEnterView chatActivityEnterView = this.b;
                HashMap hashMap = chatActivityEnterView.C0;
                if (chatActivityEnterView.O0()) {
                    qmb qmbVar = chatActivityEnterView.f2;
                    int width = chatActivityEnterView.o2.getWidth();
                    tx1 tx1Var = chatActivityEnterView.h2;
                    if (chatActivityEnterView.W0(tx1Var)) {
                        width = Math.min(width, tx1Var.getLeft());
                    }
                    if (chatActivityEnterView.W0(chatActivityEnterView.z2)) {
                        width = Math.min(width, chatActivityEnterView.z2.getLeft());
                    }
                    if (chatActivityEnterView.W0(qmbVar)) {
                        for (int i5 = 0; i5 < qmbVar.getChildCount(); i5++) {
                            View childAt = qmbVar.getChildAt(i5);
                            if (chatActivityEnterView.W0(childAt) && childAt.getWidth() > 0) {
                                width = Math.min(width, childAt.getLeft() + qmbVar.getLeft());
                            }
                        }
                    }
                    tc tcVar = chatActivityEnterView.K6;
                    tcVar.setChipMaxWidth((width - tcVar.getLeft()) - gm.L(4.0f));
                }
                if (!hashMap.isEmpty()) {
                    for (int i6 = 0; i6 < getChildCount(); i6++) {
                        View childAt2 = getChildAt(i6);
                        Float f = (Float) hashMap.get(childAt2);
                        if (f != null) {
                            childAt2.setTranslationX(f.floatValue() - childAt2.getLeft());
                            childAt2.animate().translationX(0.0f).setDuration(150L).setInterpolator(d53.f).start();
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
        d53 d53Var;
        switch (this.a) {
            case 1:
                super.onMeasure(i, i2);
                int max = Math.max(gm.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.b;
                h94 h94Var = chatActivityEnterView.n7;
                float f = h94Var.f;
                if (f > 0.0f) {
                    if (h94Var.h) {
                        f = h94Var.g;
                    }
                    float f2 = max;
                    if (f != f2) {
                        h94Var.d = chatActivityEnterView.D0();
                        h94Var.e = (byte) 0;
                        d53 d53Var2 = wb2.V;
                        if (chatActivityEnterView.G1 > 0 && SystemClock.uptimeMillis() < chatActivityEnterView.G1 && (d53Var = chatActivityEnterView.H1) != null) {
                            d53Var2 = d53Var;
                        }
                        h94Var.c = d53Var2;
                    }
                    h94Var.a(f2);
                } else {
                    h94Var.c(max);
                }
                chatActivityEnterView.P();
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
                setPivotX(i - gm.L(22.0f));
                setPivotY(i2 - gm.L(22.0f));
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
                if (chatActivityEnterView.K && chatActivityEnterView.y7 != 2) {
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
                this.b.A2(true);
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }
}
