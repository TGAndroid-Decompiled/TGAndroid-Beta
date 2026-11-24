package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class p2b extends FrameLayout {
    public int a;
    public final RectF b;
    public boolean c;
    public Boolean d;
    public final x2b e;

    public p2b(x2b x2bVar, Context context) {
        super(context);
        this.e = x2bVar;
        this.b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        Paint paint;
        boolean z;
        boolean z2;
        int min;
        x2b x2bVar = this.e;
        int L = gm.L(6.0f) + (x2bVar.Y1 - x2bVar.t0);
        int L2 = (x2bVar.Y1 - x2bVar.t0) - gm.L(13.0f);
        int i2 = gm.m;
        int i3 = L2 + i2;
        int i4 = L + i2;
        boolean z3 = true;
        if (this.c) {
            int i5 = x2bVar.t0;
            int i6 = i2 << 1;
            if (i3 + i5 < i6) {
                i3 -= Math.min(i2, (i6 - i3) - i5);
                f = 1.0f - Math.min(1.0f, (min << 1) / gm.m);
            } else {
                f = 1.0f;
            }
            int i7 = x2bVar.t0;
            int i8 = i3 + i7;
            int i9 = gm.m;
            if (i8 < i9) {
                i = Math.min(i9, (i9 - i3) - i7);
            } else {
                i = 0;
            }
        } else {
            i = 0;
            f = 1.0f;
        }
        x2bVar.s0.setBounds(0, i3, getMeasuredWidth(), getMeasuredHeight());
        x2bVar.s0.draw(canvas);
        int i10 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        RectF rectF = this.b;
        if (i10 != 0) {
            cmb.s0.setColor(cmb.v0(cmb.g5, x2bVar.J0));
            rectF.set(x2bVar.u0, x2bVar.t0 + i3, getMeasuredWidth() - x2bVar.u0, gm.L(24.0f) + x2bVar.t0 + i3);
            canvas.drawRoundRect(rectF, gm.L(12.0f) * f, gm.L(12.0f) * f, cmb.s0);
        }
        int L3 = gm.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i4, (getMeasuredWidth() + L3) / 2, gm.L(4.0f) + i4);
        cmb.s0.setColor(cmb.v0(cmb.yj, x2bVar.J0));
        cmb.s0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i4 - gm.m) / gm.L(16.0f))) * paint.getAlpha()));
        canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
        if (i > gm.m / 2) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z) {
            if (gm.B(cmb.v0(cmb.g5, x2bVar.J0)) > 0.721f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (gm.B(cmb.v(cmb.v0(cmb.r8, x2bVar.J0), 855638016)) <= 0.721f) {
                z3 = false;
            }
            this.d = Boolean.valueOf(z);
            if (!z) {
                z2 = z3;
            }
            gm.n3(x2bVar.getWindow(), z2);
        }
        if (i > 0) {
            cmb.s0.setColor(cmb.v0(cmb.g5, x2bVar.J0));
            canvas.drawRect(x2bVar.u0, gm.m - i, getMeasuredWidth() - x2bVar.u0, gm.m, cmb.s0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            x2b x2bVar = this.e;
            if (x2bVar.Y1 != 0 && motionEvent.getY() < x2bVar.Y1) {
                x2bVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.a;
        int i6 = i3 - i;
        x2b x2bVar = this.e;
        if (i5 != i6) {
            this.a = i6;
            t2b t2bVar = x2bVar.n1;
            if (t2bVar != null && x2bVar.Q1 != null) {
                t2bVar.f();
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        x2bVar.U0();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i3;
        int max;
        int i4;
        int i5;
        int i6;
        float f;
        int size = View.MeasureSpec.getSize(i2);
        x2b x2bVar = this.e;
        ArrayList arrayList = x2bVar.R1;
        boolean z = true;
        x2bVar.a2 = true;
        int i7 = x2bVar.u0;
        setPadding(i7, gm.m, i7, 0);
        x2bVar.a2 = false;
        if (x2bVar.K0()) {
            int measuredWidth = x2bVar.m1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = gm.q.x;
            }
            t2b t2bVar = x2bVar.n1;
            if (gm.O1()) {
                f = 60.0f;
            } else {
                f = 45.0f;
            }
            t2bVar.d = Math.max(1, measuredWidth / gm.L(f));
            int size2 = (View.MeasureSpec.getSize(i) - gm.L(36.0f)) / x2bVar.n1.d;
            x2bVar.I1 = size2;
            x2bVar.J1 = size2;
        } else {
            x2bVar.n1.d = 5;
            x2bVar.I1 = (View.MeasureSpec.getSize(i) - gm.L(36.0f)) / x2bVar.n1.d;
            x2bVar.J1 = gm.L(82.0f);
        }
        float f2 = x2bVar.n1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x2bVar.m1.getLayoutParams();
        int i8 = 3;
        if (arrayList != null) {
            i5 = (Math.max(3, (int) Math.ceil(arrayList.size() / f2)) * x2bVar.J1) + gm.L(48.0f) + marginLayoutParams.bottomMargin + x2bVar.t0 + gm.m;
        } else {
            if (x2bVar.Q1 != null) {
                i4 = (x2bVar.n1.n * x2bVar.J1) + (x2bVar.Q1.size() * gm.L(60.0f)) + gm.L(8.0f) + marginLayoutParams.bottomMargin + x2bVar.t0;
                max = gm.L(24.0f);
            } else {
                int L = gm.L(48.0f) + marginLayoutParams.bottomMargin;
                if (x2bVar.K0()) {
                    i8 = 2;
                }
                if (x2bVar.M1 != null) {
                    i3 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f2);
                } else {
                    i3 = 0;
                }
                max = (Math.max(i8, i3) * x2bVar.J1) + L + x2bVar.t0;
                i4 = gm.m;
            }
            i5 = i4 + max;
        }
        if (x2bVar.K0()) {
            i5 = (int) ((x2bVar.J1 * 0.15f) + i5);
        }
        float f3 = size / 5.0f;
        if (i5 < f3 * 3.2d) {
            i6 = 0;
        } else {
            i6 = (int) (f3 * 2.0f);
        }
        if (i6 != 0 && i5 < size) {
            i6 -= size - i5;
        }
        if (i6 == 0) {
            i6 = x2bVar.t0;
        }
        if (x2bVar.Q1 != null) {
            i6 += gm.L(8.0f);
        }
        if (x2bVar.m1.getPaddingTop() != i6) {
            x2bVar.a2 = true;
            x2bVar.m1.setPadding(gm.L(10.0f), i6, gm.L(10.0f), gm.L(8.0f));
            x2bVar.E1.setPadding(0, i6, 0, 0);
            x2bVar.a2 = false;
        }
        if (i5 < size) {
            z = false;
        }
        this.c = z;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(i5, size), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.e.a2) {
            return;
        }
        super.requestLayout();
    }
}
