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
public final class gaa extends cja {
    public boolean m0;
    public final RectF n0;
    public boolean o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public final lm v0;
    public final taa w0;

    public gaa(taa taaVar, Context context) {
        super(context, null);
        this.w0 = taaVar;
        this.m0 = false;
        this.n0 = new RectF();
        this.I = new faa(this, this);
        gl.B(bkb.v0(bkb.g5, taaVar.J0));
        this.v0 = new lm(this, 0L, 350L, s33.h);
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        taa taaVar = this.w0;
        v9a v9aVar = taaVar.B1;
        o39 o39Var = taaVar.z1;
        v9a v9aVar2 = taaVar.A1;
        if (v9aVar2.getVisibility() == 0 && v9aVar2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(v9aVar2.getX(), v9aVar2.getY());
            v9aVar2.draw(canvas);
            canvas.restore();
        }
        if (o39Var.getVisibility() == 0 && o39Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(o39Var.getX(), o39Var.getY());
            o39Var.draw(canvas);
            canvas.restore();
        }
        if (v9aVar.getVisibility() == 0 && v9aVar.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(v9aVar.getX(), v9aVar.getY());
            v9aVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        taa taaVar = this.w0;
        canvas.clipRect(0.0f, getPaddingTop() + taaVar.o2, getMeasuredWidth(), getMeasuredHeight() + taaVar.o2 + gl.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        il0 il0Var = this.w0.P2;
        if ((view instanceof t14) && il0Var != null) {
            canvas.save();
            il0Var.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(il0Var.S.k);
            il0Var.draw(canvas);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final wjb getResourceProvider() {
        return this.w0.J0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gb gbVar = this.I;
        gbVar.b = this;
        gbVar.c();
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
        taa taaVar = this.w0;
        Drawable drawable = taaVar.M1;
        FrameLayout frameLayout = taaVar.w1;
        canvas.translate(0.0f, taaVar.o2);
        int L2 = gl.L(6.0f) + (taaVar.k2 - taaVar.t0) + this.p0;
        int L3 = ((taaVar.k2 - taaVar.t0) - gl.L(13.0f)) + this.p0;
        taaVar.S1 = L3;
        int L4 = gl.L(60.0f) + getMeasuredHeight();
        int i2 = taaVar.t0;
        int i3 = L4 + i2;
        boolean z3 = true;
        if (!taaVar.W) {
            int i4 = taaVar.B2.b;
            L2 += i4;
            if (this.o0 && L3 + i2 < i4) {
                z2 = true;
            } else {
                z2 = false;
            }
            f = this.v0.d(z2);
            L3 = gl.U1(f, L3 + i4, -i2);
        } else {
            f = 0.0f;
        }
        drawable.setBounds(0, L3, getMeasuredWidth(), i3);
        drawable.draw(canvas);
        float f2 = taaVar.t0 + L3 + taaVar.o2;
        if (taaVar.r1 != f2) {
            taaVar.r1 = f2;
            taaVar.l1.invalidate();
        }
        if (frameLayout != null) {
            if (L3 <= taaVar.B2.b && frameLayout.getChildCount() > 0) {
                frameLayout.setTranslationY(0.0f);
                m21 m21Var = m21.w;
                if (m21Var != null) {
                    q11 q11Var = m21Var.e;
                    if (q11Var != null) {
                        q11Var.setTop(true);
                    }
                    m21Var.b();
                }
            } else {
                frameLayout.setTranslationY(Math.max(0, ((L3 + taaVar.t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            }
        }
        if (f < 1.0f) {
            float f3 = L2;
            float measuredWidth = (getMeasuredWidth() + gl.L(36.0f)) / 2;
            float L5 = gl.L(4.0f) + L2;
            RectF rectF = this.n0;
            rectF.set((getMeasuredWidth() - L) / 2, f3, measuredWidth, L5);
            bkb.s0.setColor(bkb.v0(bkb.yj, taaVar.J0));
            bkb.s0.setAlpha((int) ((1.0f - f) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (gl.B(bkb.v0(bkb.g5, taaVar.J0)) > 0.721f && 0.0f > taaVar.B2.b * 0.5f) {
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
        this.q0 = this.p0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = this.o0;
        taa taaVar = this.w0;
        if (!z) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.p0 - gl.L(30.0f)) {
                taaVar.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && taaVar.k2 != 0 && motionEvent.getY() < taaVar.k2 - gl.L(30.0f)) {
            taaVar.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gaa.onLayout(boolean, int, int, int, int):void");
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
        gaa gaaVar = this;
        taa taaVar = gaaVar.w0;
        v9a v9aVar = taaVar.B1;
        FrameLayout frameLayout = taaVar.X1;
        v9a v9aVar2 = taaVar.A1;
        o39 o39Var = taaVar.z1;
        if (gaaVar.getLayoutParams().height > 0) {
            size = gaaVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        r35 r35Var = taaVar.C1;
        int i8 = 0;
        if (gaaVar.getLayoutParams().height <= 0) {
            z = true;
        } else {
            z = false;
        }
        r35Var.G = z;
        vb4 vb4Var = taaVar.E1;
        if (gaaVar.getLayoutParams().height <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        vb4Var.G = z2;
        if (!taaVar.W) {
            gaaVar.m0 = true;
            int i9 = taaVar.u0;
            gaaVar.setPadding(i9, taaVar.B2.b, i9, 0);
            gaaVar.m0 = false;
        }
        int paddingTop = size - gaaVar.getPaddingTop();
        int max = Math.max(taaVar.H1.b(), taaVar.F1.b() - 1);
        int y = de9.y(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), gl.L(48.0f) + gl.L(103.0f)) + taaVar.t0;
        if (o39Var.getVisibility() != 8) {
            int y2 = de9.y(103.0f, Math.max(2, (int) Math.ceil((taaVar.G1.b() - 1) / 4.0f)), gl.L(48.0f) + gl.L(103.0f)) + taaVar.t0;
            if (y2 > y) {
                y = gl.U1(o39Var.getAlpha(), y, y2);
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
        int L = gl.L(i4 + 100) + taaVar.B2.d;
        if (v9aVar2.getPaddingTop() != i3 || v9aVar2.getPaddingBottom() != L) {
            gaaVar.m0 = true;
            v9aVar2.setPadding(0, i3, 0, L);
            o39Var.setPadding(0, i3, 0, L);
            gaaVar.m0 = false;
        }
        if (taaVar.d && gaaVar.getLayoutParams().height <= 0 && v9aVar.getPaddingTop() != i3) {
            gaaVar.m0 = true;
            if (frameLayout == null) {
                i10 = 0;
            }
            v9aVar.setPadding(0, 0, 0, gl.L(i10 + 60) + taaVar.B2.d);
            gaaVar.m0 = false;
        }
        if (y >= size) {
            z3 = true;
        } else {
            z3 = false;
        }
        gaaVar.o0 = z3;
        if (z3) {
            i5 = 0;
        } else {
            i5 = size - y;
        }
        gaaVar.p0 = i5;
        gaaVar.m0 = true;
        taaVar.D0(false);
        gaaVar.m0 = false;
        gaaVar.setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i11 = taaVar.u0;
        FrameLayout frameLayout2 = taaVar.t1;
        z9a z9aVar = taaVar.n1;
        int i12 = size2 - (i11 << 1);
        int Q = gaaVar.Q();
        taaVar.I2 = Q;
        if (!z9aVar.O && Q <= gl.L(20.0f) && !z9aVar.e && !z9aVar.P) {
            gaaVar.m0 = true;
            z9aVar.j();
            gaaVar.m0 = false;
        }
        gaaVar.m0 = true;
        if (taaVar.I2 <= gl.L(20.0f)) {
            if (!gl.E) {
                if (taaVar.d) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = z9aVar.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (z9aVar.e) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i7);
            }
            i6 = 8;
        } else {
            if (!z9aVar.m()) {
                z9aVar.j();
            }
            i6 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i13 = makeMeasureSpec;
        int i14 = size3;
        gaaVar.m0 = false;
        int childCount = gaaVar.getChildCount();
        while (i8 < childCount) {
            View childAt = gaaVar.getChildAt(i8);
            if (childAt != null && childAt.getVisibility() != i6) {
                if (z9aVar.l(childAt)) {
                    if (!gl.E && !gl.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (gl.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(200.0f), gaaVar.getPaddingTop() + (i14 - taaVar.B2.b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(gaaVar.getPaddingTop() + (i14 - taaVar.B2.b), 1073741824));
                    }
                } else {
                    gaaVar.measureChildWithMargins(childAt, i, 0, i13, 0);
                }
            }
            i8++;
            gaaVar = this;
        }
        taaVar.T0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.w0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.m0) {
            return;
        }
        super.requestLayout();
    }
}
