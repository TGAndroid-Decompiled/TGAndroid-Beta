package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class xda extends wma {
    public boolean g0;
    public final RectF h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public final mm p0;
    public final kea q0;

    public xda(kea keaVar, Context context) {
        super(context, null);
        this.q0 = keaVar;
        this.g0 = false;
        this.h0 = new RectF();
        this.I = new wda(this, this);
        hl.B(aob.v0(aob.h5, keaVar.J0));
        this.p0 = new mm(this, 0L, 350L, k43.h);
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        kea keaVar = this.q0;
        mda mdaVar = keaVar.B1;
        d79 d79Var = keaVar.z1;
        mda mdaVar2 = keaVar.A1;
        if (mdaVar2.getVisibility() == 0 && mdaVar2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(mdaVar2.getX(), mdaVar2.getY());
            mdaVar2.draw(canvas);
            canvas.restore();
        }
        if (d79Var.getVisibility() == 0 && d79Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(d79Var.getX(), d79Var.getY());
            d79Var.draw(canvas);
            canvas.restore();
        }
        if (mdaVar.getVisibility() == 0 && mdaVar.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(mdaVar.getX(), mdaVar.getY());
            mdaVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        kea keaVar = this.q0;
        canvas.clipRect(0.0f, getPaddingTop() + keaVar.o2, getMeasuredWidth(), getMeasuredHeight() + keaVar.o2 + hl.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        jl0 jl0Var = this.q0.P2;
        if ((view instanceof o24) && jl0Var != null) {
            canvas.save();
            jl0Var.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(jl0Var.S.k);
            jl0Var.draw(canvas);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final vnb getResourceProvider() {
        return this.q0.J0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hb hbVar = this.I;
        hbVar.b = this;
        hbVar.c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        boolean z;
        int i;
        int L;
        Paint paint;
        boolean z2;
        canvas.save();
        kea keaVar = this.q0;
        Drawable drawable = keaVar.M1;
        FrameLayout frameLayout = keaVar.w1;
        canvas.translate(0.0f, keaVar.o2);
        int L2 = hl.L(6.0f) + (keaVar.k2 - keaVar.t0) + this.j0;
        int L3 = ((keaVar.k2 - keaVar.t0) - hl.L(13.0f)) + this.j0;
        keaVar.S1 = L3;
        int L4 = hl.L(60.0f) + getMeasuredHeight();
        int i2 = keaVar.t0;
        int i3 = L4 + i2;
        boolean z3 = true;
        if (!keaVar.W) {
            int i4 = keaVar.B2.b;
            L2 += i4;
            if (this.i0 && L3 + i2 < i4) {
                z2 = true;
            } else {
                z2 = false;
            }
            f = this.p0.d(z2);
            L3 = hl.U1(f, L3 + i4, -i2);
        } else {
            f = 0.0f;
        }
        drawable.setBounds(0, L3, getMeasuredWidth(), i3);
        drawable.draw(canvas);
        float f2 = keaVar.t0 + L3 + keaVar.o2;
        if (keaVar.r1 != f2) {
            keaVar.r1 = f2;
            keaVar.l1.invalidate();
        }
        if (frameLayout != null) {
            if (L3 <= keaVar.B2.b && frameLayout.getChildCount() > 0) {
                frameLayout.setTranslationY(0.0f);
                v21 v21Var = v21.x;
                if (v21Var != null) {
                    z11 z11Var = v21Var.e;
                    if (z11Var != null) {
                        z11Var.setTop(true);
                    }
                    v21Var.b();
                }
            } else {
                frameLayout.setTranslationY(Math.max(0, ((L3 + keaVar.t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            }
        }
        if (f < 1.0f) {
            float f3 = L2;
            float measuredWidth = (getMeasuredWidth() + hl.L(36.0f)) / 2;
            float L5 = hl.L(4.0f) + L2;
            RectF rectF = this.h0;
            rectF.set((getMeasuredWidth() - L) / 2, f3, measuredWidth, L5);
            aob.s0.setColor(aob.v0(aob.zj, keaVar.J0));
            aob.s0.setAlpha((int) ((1.0f - f) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), aob.s0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (hl.B(aob.v0(aob.h5, keaVar.J0)) > 0.721f && 0.0f > keaVar.B2.b * 0.5f) {
            z = true;
        } else {
            z = false;
        }
        if ((systemUiVisibility & 8192) <= 0) {
            z3 = false;
        }
        if (z != z3) {
            if (z) {
                i = systemUiVisibility | 8192;
            } else {
                i = systemUiVisibility & (-8193);
            }
            setSystemUiVisibility(i);
        }
        canvas.restore();
        this.k0 = this.j0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = this.i0;
        kea keaVar = this.q0;
        if (!z) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.j0 - hl.L(30.0f)) {
                keaVar.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && keaVar.k2 != 0 && motionEvent.getY() < keaVar.k2 - hl.L(30.0f)) {
            keaVar.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xda.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int emojiPadding;
        xda xdaVar = this;
        kea keaVar = xdaVar.q0;
        mda mdaVar = keaVar.B1;
        FrameLayout frameLayout = keaVar.X1;
        mda mdaVar2 = keaVar.A1;
        d79 d79Var = keaVar.z1;
        if (xdaVar.getLayoutParams().height > 0) {
            size = xdaVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        u55 u55Var = keaVar.C1;
        int i8 = 0;
        if (xdaVar.getLayoutParams().height <= 0) {
            z = true;
        } else {
            z = false;
        }
        u55Var.G = z;
        sd4 sd4Var = keaVar.E1;
        if (xdaVar.getLayoutParams().height <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sd4Var.G = z2;
        if (!keaVar.W) {
            xdaVar.g0 = true;
            int i9 = keaVar.u0;
            xdaVar.setPadding(i9, keaVar.B2.b, i9, 0);
            xdaVar.g0 = false;
        }
        int paddingTop = size - xdaVar.getPaddingTop();
        int max = Math.max(keaVar.H1.b(), keaVar.F1.b() - 1);
        int y = uh9.y(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), hl.L(48.0f) + hl.L(103.0f)) + keaVar.t0;
        if (d79Var.getVisibility() != 8) {
            int y2 = uh9.y(103.0f, Math.max(2, (int) Math.ceil((keaVar.G1.b() - 1) / 4.0f)), hl.L(48.0f) + hl.L(103.0f)) + keaVar.t0;
            if (y2 > y) {
                y = hl.U1(d79Var.getAlpha(), y, y2);
            }
        }
        if (y < paddingTop) {
            i3 = 0;
        } else {
            i3 = paddingTop - ((paddingTop / 5) * 3);
        }
        int i10 = 48;
        if (frameLayout != null) {
            i4 = 48;
        } else {
            i4 = 0;
        }
        int L = hl.L(i4 + 100) + keaVar.B2.d;
        if (mdaVar2.getPaddingTop() != i3 || mdaVar2.getPaddingBottom() != L) {
            xdaVar.g0 = true;
            mdaVar2.setPadding(0, i3, 0, L);
            d79Var.setPadding(0, i3, 0, L);
            xdaVar.g0 = false;
        }
        if (keaVar.d && xdaVar.getLayoutParams().height <= 0 && mdaVar.getPaddingTop() != i3) {
            xdaVar.g0 = true;
            if (frameLayout == null) {
                i10 = 0;
            }
            mdaVar.setPadding(0, 0, 0, hl.L(i10 + 60) + keaVar.B2.d);
            xdaVar.g0 = false;
        }
        if (y >= size) {
            z3 = true;
        } else {
            z3 = false;
        }
        xdaVar.i0 = z3;
        if (z3) {
            i5 = 0;
        } else {
            i5 = size - y;
        }
        xdaVar.j0 = i5;
        xdaVar.g0 = true;
        keaVar.E0(false);
        xdaVar.g0 = false;
        xdaVar.setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i11 = keaVar.u0;
        FrameLayout frameLayout2 = keaVar.t1;
        qda qdaVar = keaVar.n1;
        int i12 = size2 - (i11 << 1);
        int Q = xdaVar.Q();
        keaVar.I2 = Q;
        if (!qdaVar.O && Q <= hl.L(20.0f) && !qdaVar.e && !qdaVar.P) {
            xdaVar.g0 = true;
            qdaVar.j();
            xdaVar.g0 = false;
        }
        xdaVar.g0 = true;
        if (keaVar.I2 <= hl.L(20.0f)) {
            if (!hl.E) {
                if (keaVar.d) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = qdaVar.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (qdaVar.e) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i7);
            }
            i6 = 8;
        } else {
            if (!qdaVar.m()) {
                qdaVar.j();
            }
            i6 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i13 = makeMeasureSpec;
        int i14 = size3;
        xdaVar.g0 = false;
        int childCount = xdaVar.getChildCount();
        while (i8 < childCount) {
            View childAt = xdaVar.getChildAt(i8);
            if (childAt != null && childAt.getVisibility() != i6) {
                if (qdaVar.l(childAt)) {
                    if (!hl.E && !hl.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (hl.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(200.0f), xdaVar.getPaddingTop() + (i14 - keaVar.B2.b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(xdaVar.getPaddingTop() + (i14 - keaVar.B2.b), 1073741824));
                    }
                } else {
                    xdaVar.measureChildWithMargins(childAt, i, 0, i13, 0);
                }
            }
            i8++;
            xdaVar = this;
        }
        keaVar.U0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.q0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.g0) {
            return;
        }
        super.requestLayout();
    }
}
