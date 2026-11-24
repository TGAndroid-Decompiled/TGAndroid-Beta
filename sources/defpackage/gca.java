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
public final class gca extends ela {
    public boolean m0;
    public final RectF n0;
    public boolean o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public final ln v0;
    public final tca w0;

    public gca(tca tcaVar, Context context) {
        super(context, null);
        this.w0 = tcaVar;
        this.m0 = false;
        this.n0 = new RectF();
        this.I = new fca(this, this);
        gm.B(cmb.v0(cmb.g5, tcaVar.J0));
        this.v0 = new ln(this, 0L, 350L, d53.h);
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        tca tcaVar = this.w0;
        vba vbaVar = tcaVar.B1;
        r59 r59Var = tcaVar.z1;
        vba vbaVar2 = tcaVar.A1;
        if (vbaVar2.getVisibility() == 0 && vbaVar2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(vbaVar2.getX(), vbaVar2.getY());
            vbaVar2.draw(canvas);
            canvas.restore();
        }
        if (r59Var.getVisibility() == 0 && r59Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(r59Var.getX(), r59Var.getY());
            r59Var.draw(canvas);
            canvas.restore();
        }
        if (vbaVar.getVisibility() == 0 && vbaVar.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(vbaVar.getX(), vbaVar.getY());
            vbaVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        tca tcaVar = this.w0;
        canvas.clipRect(0.0f, getPaddingTop() + tcaVar.o2, getMeasuredWidth(), getMeasuredHeight() + tcaVar.o2 + gm.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        im0 im0Var = this.w0.P2;
        if ((view instanceof e34) && im0Var != null) {
            canvas.save();
            im0Var.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(im0Var.S.k);
            im0Var.draw(canvas);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final ylb getResourceProvider() {
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
        tca tcaVar = this.w0;
        Drawable drawable = tcaVar.M1;
        FrameLayout frameLayout = tcaVar.w1;
        canvas.translate(0.0f, tcaVar.o2);
        int L2 = gm.L(6.0f) + (tcaVar.k2 - tcaVar.t0) + this.p0;
        int L3 = ((tcaVar.k2 - tcaVar.t0) - gm.L(13.0f)) + this.p0;
        tcaVar.S1 = L3;
        int L4 = gm.L(60.0f) + getMeasuredHeight();
        int i2 = tcaVar.t0;
        int i3 = L4 + i2;
        boolean z3 = true;
        if (!tcaVar.W) {
            int i4 = tcaVar.B2.b;
            L2 += i4;
            if (this.o0 && L3 + i2 < i4) {
                z2 = true;
            } else {
                z2 = false;
            }
            f = this.v0.d(z2);
            L3 = gm.U1(f, L3 + i4, -i2);
        } else {
            f = 0.0f;
        }
        drawable.setBounds(0, L3, getMeasuredWidth(), i3);
        drawable.draw(canvas);
        float f2 = tcaVar.t0 + L3 + tcaVar.o2;
        if (tcaVar.r1 != f2) {
            tcaVar.r1 = f2;
            tcaVar.l1.invalidate();
        }
        if (frameLayout != null) {
            if (L3 <= tcaVar.B2.b && frameLayout.getChildCount() > 0) {
                frameLayout.setTranslationY(0.0f);
                u31 u31Var = u31.x;
                if (u31Var != null) {
                    y21 y21Var = u31Var.e;
                    if (y21Var != null) {
                        y21Var.setTop(true);
                    }
                    u31Var.b();
                }
            } else {
                frameLayout.setTranslationY(Math.max(0, ((L3 + tcaVar.t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            }
        }
        if (f < 1.0f) {
            float f3 = L2;
            float measuredWidth = (getMeasuredWidth() + gm.L(36.0f)) / 2;
            float L5 = gm.L(4.0f) + L2;
            RectF rectF = this.n0;
            rectF.set((getMeasuredWidth() - L) / 2, f3, measuredWidth, L5);
            cmb.s0.setColor(cmb.v0(cmb.yj, tcaVar.J0));
            cmb.s0.setAlpha((int) ((1.0f - f) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (gm.B(cmb.v0(cmb.g5, tcaVar.J0)) > 0.721f && 0.0f > tcaVar.B2.b * 0.5f) {
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
        tca tcaVar = this.w0;
        if (!z) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.p0 - gm.L(30.0f)) {
                tcaVar.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && tcaVar.k2 != 0 && motionEvent.getY() < tcaVar.k2 - gm.L(30.0f)) {
            tcaVar.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gca.onLayout(boolean, int, int, int, int):void");
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
        gca gcaVar = this;
        tca tcaVar = gcaVar.w0;
        vba vbaVar = tcaVar.B1;
        FrameLayout frameLayout = tcaVar.X1;
        vba vbaVar2 = tcaVar.A1;
        r59 r59Var = tcaVar.z1;
        if (gcaVar.getLayoutParams().height > 0) {
            size = gcaVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        q55 q55Var = tcaVar.C1;
        int i8 = 0;
        if (gcaVar.getLayoutParams().height <= 0) {
            z = true;
        } else {
            z = false;
        }
        q55Var.G = z;
        vd4 vd4Var = tcaVar.E1;
        if (gcaVar.getLayoutParams().height <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        vd4Var.G = z2;
        if (!tcaVar.W) {
            gcaVar.m0 = true;
            int i9 = tcaVar.u0;
            gcaVar.setPadding(i9, tcaVar.B2.b, i9, 0);
            gcaVar.m0 = false;
        }
        int paddingTop = size - gcaVar.getPaddingTop();
        int max = Math.max(tcaVar.H1.b(), tcaVar.F1.b() - 1);
        int y = hg9.y(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), gm.L(48.0f) + gm.L(103.0f)) + tcaVar.t0;
        if (r59Var.getVisibility() != 8) {
            int y2 = hg9.y(103.0f, Math.max(2, (int) Math.ceil((tcaVar.G1.b() - 1) / 4.0f)), gm.L(48.0f) + gm.L(103.0f)) + tcaVar.t0;
            if (y2 > y) {
                y = gm.U1(r59Var.getAlpha(), y, y2);
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
        int L = gm.L(i4 + 100) + tcaVar.B2.d;
        if (vbaVar2.getPaddingTop() != i3 || vbaVar2.getPaddingBottom() != L) {
            gcaVar.m0 = true;
            vbaVar2.setPadding(0, i3, 0, L);
            r59Var.setPadding(0, i3, 0, L);
            gcaVar.m0 = false;
        }
        if (tcaVar.d && gcaVar.getLayoutParams().height <= 0 && vbaVar.getPaddingTop() != i3) {
            gcaVar.m0 = true;
            if (frameLayout == null) {
                i10 = 0;
            }
            vbaVar.setPadding(0, 0, 0, gm.L(i10 + 60) + tcaVar.B2.d);
            gcaVar.m0 = false;
        }
        if (y >= size) {
            z3 = true;
        } else {
            z3 = false;
        }
        gcaVar.o0 = z3;
        if (z3) {
            i5 = 0;
        } else {
            i5 = size - y;
        }
        gcaVar.p0 = i5;
        gcaVar.m0 = true;
        tcaVar.D0(false);
        gcaVar.m0 = false;
        gcaVar.setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i11 = tcaVar.u0;
        FrameLayout frameLayout2 = tcaVar.t1;
        zba zbaVar = tcaVar.n1;
        int i12 = size2 - (i11 << 1);
        int Q = gcaVar.Q();
        tcaVar.I2 = Q;
        if (!zbaVar.O && Q <= gm.L(20.0f) && !zbaVar.e && !zbaVar.P) {
            gcaVar.m0 = true;
            zbaVar.j();
            gcaVar.m0 = false;
        }
        gcaVar.m0 = true;
        if (tcaVar.I2 <= gm.L(20.0f)) {
            if (!gm.E) {
                if (tcaVar.d) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = zbaVar.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (zbaVar.e) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i7);
            }
            i6 = 8;
        } else {
            if (!zbaVar.m()) {
                zbaVar.j();
            }
            i6 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i13 = makeMeasureSpec;
        int i14 = size3;
        gcaVar.m0 = false;
        int childCount = gcaVar.getChildCount();
        while (i8 < childCount) {
            View childAt = gcaVar.getChildAt(i8);
            if (childAt != null && childAt.getVisibility() != i6) {
                if (zbaVar.l(childAt)) {
                    if (!gm.E && !gm.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (gm.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(200.0f), gcaVar.getPaddingTop() + (i14 - tcaVar.B2.b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(gcaVar.getPaddingTop() + (i14 - tcaVar.B2.b), 1073741824));
                    }
                } else {
                    gcaVar.measureChildWithMargins(childAt, i, 0, i13, 0);
                }
            }
            i8++;
            gcaVar = this;
        }
        tcaVar.T0();
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
