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
public final class m0b extends FrameLayout {
    public int a;
    public final RectF b;
    public boolean c;
    public Boolean d;
    public final u0b e;

    public m0b(u0b u0bVar, Context context) {
        super(context);
        this.e = u0bVar;
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
        u0b u0bVar = this.e;
        int L = gl.L(6.0f) + (u0bVar.Y1 - u0bVar.t0);
        int L2 = (u0bVar.Y1 - u0bVar.t0) - gl.L(13.0f);
        int i2 = gl.m;
        int i3 = L2 + i2;
        int i4 = L + i2;
        boolean z3 = true;
        if (this.c) {
            int i5 = u0bVar.t0;
            int i6 = i2 << 1;
            if (i3 + i5 < i6) {
                i3 -= Math.min(i2, (i6 - i3) - i5);
                f = 1.0f - Math.min(1.0f, (min << 1) / gl.m);
            } else {
                f = 1.0f;
            }
            int i7 = u0bVar.t0;
            int i8 = i3 + i7;
            int i9 = gl.m;
            if (i8 < i9) {
                i = Math.min(i9, (i9 - i3) - i7);
            } else {
                i = 0;
            }
        } else {
            i = 0;
            f = 1.0f;
        }
        u0bVar.s0.setBounds(0, i3, getMeasuredWidth(), getMeasuredHeight());
        u0bVar.s0.draw(canvas);
        int i10 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        RectF rectF = this.b;
        if (i10 != 0) {
            bkb.s0.setColor(bkb.v0(bkb.g5, u0bVar.J0));
            rectF.set(u0bVar.u0, u0bVar.t0 + i3, getMeasuredWidth() - u0bVar.u0, gl.L(24.0f) + u0bVar.t0 + i3);
            canvas.drawRoundRect(rectF, gl.L(12.0f) * f, gl.L(12.0f) * f, bkb.s0);
        }
        int L3 = gl.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i4, (getMeasuredWidth() + L3) / 2, gl.L(4.0f) + i4);
        bkb.s0.setColor(bkb.v0(bkb.yj, u0bVar.J0));
        bkb.s0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i4 - gl.m) / gl.L(16.0f))) * paint.getAlpha()));
        canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
        if (i > gl.m / 2) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z) {
            if (gl.B(bkb.v0(bkb.g5, u0bVar.J0)) > 0.721f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (gl.B(bkb.v(bkb.v0(bkb.r8, u0bVar.J0), 855638016)) <= 0.721f) {
                z3 = false;
            }
            this.d = Boolean.valueOf(z);
            if (!z) {
                z2 = z3;
            }
            gl.o3(u0bVar.getWindow(), z2);
        }
        if (i > 0) {
            bkb.s0.setColor(bkb.v0(bkb.g5, u0bVar.J0));
            canvas.drawRect(u0bVar.u0, gl.m - i, getMeasuredWidth() - u0bVar.u0, gl.m, bkb.s0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            u0b u0bVar = this.e;
            if (u0bVar.Y1 != 0 && motionEvent.getY() < u0bVar.Y1) {
                u0bVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.a;
        int i6 = i3 - i;
        u0b u0bVar = this.e;
        if (i5 != i6) {
            this.a = i6;
            q0b q0bVar = u0bVar.n1;
            if (q0bVar != null && u0bVar.Q1 != null) {
                q0bVar.f();
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        u0bVar.U0();
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
        u0b u0bVar = this.e;
        ArrayList arrayList = u0bVar.R1;
        boolean z = true;
        u0bVar.a2 = true;
        int i7 = u0bVar.u0;
        setPadding(i7, gl.m, i7, 0);
        u0bVar.a2 = false;
        if (u0bVar.K0()) {
            int measuredWidth = u0bVar.m1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = gl.q.x;
            }
            q0b q0bVar = u0bVar.n1;
            if (gl.O1()) {
                f = 60.0f;
            } else {
                f = 45.0f;
            }
            q0bVar.d = Math.max(1, measuredWidth / gl.L(f));
            int size2 = (View.MeasureSpec.getSize(i) - gl.L(36.0f)) / u0bVar.n1.d;
            u0bVar.I1 = size2;
            u0bVar.J1 = size2;
        } else {
            u0bVar.n1.d = 5;
            u0bVar.I1 = (View.MeasureSpec.getSize(i) - gl.L(36.0f)) / u0bVar.n1.d;
            u0bVar.J1 = gl.L(82.0f);
        }
        float f2 = u0bVar.n1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) u0bVar.m1.getLayoutParams();
        int i8 = 3;
        if (arrayList != null) {
            i5 = (Math.max(3, (int) Math.ceil(arrayList.size() / f2)) * u0bVar.J1) + gl.L(48.0f) + marginLayoutParams.bottomMargin + u0bVar.t0 + gl.m;
        } else {
            if (u0bVar.Q1 != null) {
                i4 = (u0bVar.n1.n * u0bVar.J1) + (u0bVar.Q1.size() * gl.L(60.0f)) + gl.L(8.0f) + marginLayoutParams.bottomMargin + u0bVar.t0;
                max = gl.L(24.0f);
            } else {
                int L = gl.L(48.0f) + marginLayoutParams.bottomMargin;
                if (u0bVar.K0()) {
                    i8 = 2;
                }
                if (u0bVar.M1 != null) {
                    i3 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f2);
                } else {
                    i3 = 0;
                }
                max = (Math.max(i8, i3) * u0bVar.J1) + L + u0bVar.t0;
                i4 = gl.m;
            }
            i5 = i4 + max;
        }
        if (u0bVar.K0()) {
            i5 = (int) ((u0bVar.J1 * 0.15f) + i5);
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
            i6 = u0bVar.t0;
        }
        if (u0bVar.Q1 != null) {
            i6 += gl.L(8.0f);
        }
        if (u0bVar.m1.getPaddingTop() != i6) {
            u0bVar.a2 = true;
            u0bVar.m1.setPadding(gl.L(10.0f), i6, gl.L(10.0f), gl.L(8.0f));
            u0bVar.E1.setPadding(0, i6, 0, 0);
            u0bVar.a2 = false;
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
