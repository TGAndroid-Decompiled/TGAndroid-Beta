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
public final class k4b extends FrameLayout {
    public int a;
    public final RectF b;
    public boolean c;
    public Boolean d;
    public final s4b e;

    public k4b(s4b s4bVar, Context context) {
        super(context);
        this.e = s4bVar;
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
        s4b s4bVar = this.e;
        int L = hl.L(6.0f) + (s4bVar.Y1 - s4bVar.t0);
        int L2 = (s4bVar.Y1 - s4bVar.t0) - hl.L(13.0f);
        int i2 = hl.m;
        int i3 = L2 + i2;
        int i4 = L + i2;
        boolean z3 = true;
        if (this.c) {
            int i5 = s4bVar.t0;
            int i6 = i2 << 1;
            if (i3 + i5 < i6) {
                i3 -= Math.min(i2, (i6 - i3) - i5);
                f = 1.0f - Math.min(1.0f, (min << 1) / hl.m);
            } else {
                f = 1.0f;
            }
            int i7 = s4bVar.t0;
            int i8 = i3 + i7;
            int i9 = hl.m;
            if (i8 < i9) {
                i = Math.min(i9, (i9 - i3) - i7);
            } else {
                i = 0;
            }
        } else {
            i = 0;
            f = 1.0f;
        }
        s4bVar.s0.setBounds(0, i3, getMeasuredWidth(), getMeasuredHeight());
        s4bVar.s0.draw(canvas);
        int i10 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        RectF rectF = this.b;
        if (i10 != 0) {
            aob.s0.setColor(aob.v0(aob.h5, s4bVar.J0));
            rectF.set(s4bVar.u0, s4bVar.t0 + i3, getMeasuredWidth() - s4bVar.u0, hl.L(24.0f) + s4bVar.t0 + i3);
            canvas.drawRoundRect(rectF, hl.L(12.0f) * f, hl.L(12.0f) * f, aob.s0);
        }
        int L3 = hl.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i4, (getMeasuredWidth() + L3) / 2, hl.L(4.0f) + i4);
        aob.s0.setColor(aob.v0(aob.zj, s4bVar.J0));
        aob.s0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i4 - hl.m) / hl.L(16.0f))) * paint.getAlpha()));
        canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), aob.s0);
        if (i > hl.m / 2) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z) {
            if (hl.B(aob.v0(aob.h5, s4bVar.J0)) > 0.721f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (hl.B(aob.v(aob.v0(aob.s8, s4bVar.J0), 855638016)) <= 0.721f) {
                z3 = false;
            }
            this.d = Boolean.valueOf(z);
            if (!z) {
                z2 = z3;
            }
            hl.n3(s4bVar.getWindow(), z2);
        }
        if (i > 0) {
            aob.s0.setColor(aob.v0(aob.h5, s4bVar.J0));
            canvas.drawRect(s4bVar.u0, hl.m - i, getMeasuredWidth() - s4bVar.u0, hl.m, aob.s0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            s4b s4bVar = this.e;
            if (s4bVar.Y1 != 0 && motionEvent.getY() < s4bVar.Y1) {
                s4bVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.a;
        int i6 = i3 - i;
        s4b s4bVar = this.e;
        if (i5 != i6) {
            this.a = i6;
            o4b o4bVar = s4bVar.n1;
            if (o4bVar != null && s4bVar.Q1 != null) {
                o4bVar.f();
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        s4bVar.V0();
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
        s4b s4bVar = this.e;
        ArrayList arrayList = s4bVar.R1;
        boolean z = true;
        s4bVar.a2 = true;
        int i7 = s4bVar.u0;
        setPadding(i7, hl.m, i7, 0);
        s4bVar.a2 = false;
        if (s4bVar.L0()) {
            int measuredWidth = s4bVar.m1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = hl.q.x;
            }
            o4b o4bVar = s4bVar.n1;
            if (hl.O1()) {
                f = 60.0f;
            } else {
                f = 45.0f;
            }
            o4bVar.d = Math.max(1, measuredWidth / hl.L(f));
            int size2 = (View.MeasureSpec.getSize(i) - hl.L(36.0f)) / s4bVar.n1.d;
            s4bVar.I1 = size2;
            s4bVar.J1 = size2;
        } else {
            s4bVar.n1.d = 5;
            s4bVar.I1 = (View.MeasureSpec.getSize(i) - hl.L(36.0f)) / s4bVar.n1.d;
            s4bVar.J1 = hl.L(82.0f);
        }
        float f2 = s4bVar.n1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s4bVar.m1.getLayoutParams();
        int i8 = 3;
        if (arrayList != null) {
            i5 = (Math.max(3, (int) Math.ceil(arrayList.size() / f2)) * s4bVar.J1) + hl.L(48.0f) + marginLayoutParams.bottomMargin + s4bVar.t0 + hl.m;
        } else {
            if (s4bVar.Q1 != null) {
                i4 = (s4bVar.n1.n * s4bVar.J1) + (s4bVar.Q1.size() * hl.L(60.0f)) + hl.L(8.0f) + marginLayoutParams.bottomMargin + s4bVar.t0;
                max = hl.L(24.0f);
            } else {
                int L = hl.L(48.0f) + marginLayoutParams.bottomMargin;
                if (s4bVar.L0()) {
                    i8 = 2;
                }
                if (s4bVar.M1 != null) {
                    i3 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f2);
                } else {
                    i3 = 0;
                }
                max = (Math.max(i8, i3) * s4bVar.J1) + L + s4bVar.t0;
                i4 = hl.m;
            }
            i5 = i4 + max;
        }
        if (s4bVar.L0()) {
            i5 = (int) ((s4bVar.J1 * 0.15f) + i5);
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
            i6 = s4bVar.t0;
        }
        if (s4bVar.Q1 != null) {
            i6 += hl.L(8.0f);
        }
        if (s4bVar.m1.getPaddingTop() != i6) {
            s4bVar.a2 = true;
            s4bVar.m1.setPadding(hl.L(10.0f), i6, hl.L(10.0f), hl.L(8.0f));
            s4bVar.E1.setPadding(0, i6, 0, 0);
            s4bVar.a2 = false;
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
