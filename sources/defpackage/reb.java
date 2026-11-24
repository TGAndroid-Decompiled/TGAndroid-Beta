package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class reb extends FrameLayout implements vlb {
    public int E;
    public final s09[] F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public zcb L;
    public int a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public final qeb h;
    public final String[] n;
    public final int[] r;
    public final p09[] s;
    public final p09[] w;
    public final int[] x;
    public final int[] y;

    public reb(Context context, int i) {
        super(context);
        int i2;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f = new RectF();
        this.n = r7;
        this.r = r8;
        this.s = new p09[6];
        this.w = new p09[6];
        this.x = new int[6];
        this.y = new int[6];
        this.F = new s09[2];
        this.H = 1.0f;
        String[] strArr = {jb6.M0(2131744000, null), jb6.M0(2131743999, null), jb6.M0(2131744004, null), jb6.M0(2131744001, null), jb6.M0(2131744003, null), jb6.M0(2131744002, null)};
        int i3 = cmb.b9;
        int[] iArr = {i3, i3, i3, i3, cmb.X5, cmb.c9};
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(gm.L(1.0f));
        paint2.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(gm.L(5.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(gm.L(2.0f));
        qeb qebVar = new qeb(this, context);
        this.h = qebVar;
        this.a = cmb.w0(null, cmb.i5, false);
        qebVar.setMinValue(0);
        qebVar.setDrawDividers(false);
        boolean isEmpty = oc7.r1(i).G0.isEmpty();
        qebVar.setMaxValue(isEmpty ? 4 : 5);
        if (!isEmpty) {
            i2 = 6;
        } else {
            i2 = 5;
        }
        qebVar.setAllItemsCount(i2);
        qebVar.setWrapSelectorWheel(true);
        qebVar.setFormatter(new peb(this));
        qebVar.setOnValueChangedListener(new peb(this));
        qebVar.setImportantForAccessibility(2);
        qebVar.setValue(gda.m(i));
        addView(qebVar, qoe.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.E = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            this.F[i4] = new ImageView(context);
            addView(this.F[i4], qoe.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        p09 a = a(this.h.getValue());
        if (a != null) {
            this.F[0].setImageDrawable(a);
            a.H(a.e[0] - 1);
        }
        gm.T3(this.F[0], true, 0.5f, true, false);
        gm.T3(this.F[1], false, 0.5f, true, false);
        this.G = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.K = this.h.getValue();
    }

    public final p09 a(int i) {
        int i2;
        p09[] p09VarArr = this.s;
        if (p09VarArr[i] == null) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                i2 = 2131624241;
                            } else {
                                i2 = 2131624239;
                            }
                        } else {
                            i2 = 2131624238;
                        }
                    } else {
                        i2 = 2131624240;
                    }
                } else {
                    i2 = 2131623978;
                }
            } else {
                i2 = 2131624242;
            }
            p09VarArr[i] = new p09(i2, gm.L(28.0f), gm.L(28.0f), true, null);
            c(i);
        }
        return p09VarArr[i];
    }

    public final void b() {
        int value;
        if (this.L == null && this.K != (value = this.h.getValue())) {
            this.K = value;
            int i = (this.E + 1) % 2;
            p09 a = a(value);
            s09[] s09VarArr = this.F;
            if (a != null) {
                if (s09VarArr[i].getVisibility() != 0) {
                    a.I(0, false, false);
                }
                s09VarArr[i].setAnimation(a);
                s09VarArr[i].d();
            } else {
                s09VarArr[i].a();
            }
            gm.T3(s09VarArr[this.E], false, 0.5f, true, true);
            gm.T3(s09VarArr[i], true, 0.5f, true, true);
            this.E = i;
            zcb zcbVar = new zcb(this, (byte) 1);
            this.L = zcbVar;
            gm.d3(zcbVar, 150L);
        }
    }

    public final void c(int i) {
        p09[] p09VarArr = this.s;
        if (p09VarArr[i] != null) {
            int f = on2.f(0.9f, cmb.w0(null, cmb.c6, false), cmb.w0(null, cmb.b9, false));
            int i2 = cmb.d9;
            int w0 = cmb.w0(null, i2, false);
            p09 p09Var = p09VarArr[i];
            p09[] p09VarArr2 = this.w;
            p09 p09Var2 = p09VarArr2[i];
            int[] iArr = this.y;
            int[] iArr2 = this.x;
            if (p09Var != p09Var2 || w0 != iArr2[i] || f != iArr[i]) {
                p09VarArr2[i] = p09Var;
                iArr2[i] = w0;
                iArr[i] = f;
                if (i == 2) {
                    p09VarArr[i].L(f, "Arrow");
                    p09VarArr[i].L(w0, "Box2");
                    p09VarArr[i].L(w0, "Box1");
                    return;
                }
                anb.x(this, p09VarArr[i], i2, null, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        int D;
        float f;
        super.onDraw(canvas);
        qeb qebVar = this.h;
        if (qebVar.getValue() == 5) {
            z = true;
        } else {
            z = false;
        }
        float f2 = this.G;
        s09[] s09VarArr = this.F;
        if (z) {
            if (f2 != 1.0f) {
                float f3 = f2 + 0.053333335f;
                this.G = f3;
                if (f3 > 1.0f) {
                    this.G = 1.0f;
                } else {
                    s09VarArr[0].invalidate();
                    s09VarArr[1].invalidate();
                    invalidate();
                }
            }
        } else if (f2 != 0.0f) {
            float f4 = f2 - 0.053333335f;
            this.G = f4;
            if (f4 < 0.0f) {
                this.G = 0.0f;
            } else {
                s09VarArr[0].invalidate();
                s09VarArr[1].invalidate();
                invalidate();
            }
        }
        int i = cmb.L6;
        int w0 = cmb.w0(null, i, false);
        Paint paint = this.b;
        paint.setColor(w0);
        int w02 = cmb.w0(null, i, false);
        Paint paint2 = this.d;
        paint2.setColor(w02);
        int B = wi8.B(16.0f, gm.L(21.0f) + gm.L(132.0f), getMeasuredWidth());
        int L = gm.L(21.0f);
        float f5 = L;
        float D2 = wi8.D(48.0f, getMeasuredHeight(), 2);
        RectF rectF = this.f;
        rectF.set(f5, D2, B, getMeasuredHeight() - D);
        int i2 = this.J;
        int[] iArr = this.r;
        if (i2 < 0) {
            this.J = iArr[qebVar.getValue()];
            this.H = 1.0f;
            this.I = on2.f(0.9f, cmb.w0(null, cmb.c6, false), cmb.w0(null, this.J, false));
            f = 1.0f;
        } else {
            f = 1.0f;
            if (iArr[qebVar.getValue()] != this.J) {
                this.I = on2.f(this.H, this.I, on2.f(0.9f, cmb.w0(null, cmb.c6, false), cmb.w0(null, this.J, false)));
                this.H = 0.0f;
                this.J = iArr[qebVar.getValue()];
            }
        }
        float f6 = this.H;
        if (f6 != f) {
            float f7 = f6 + 0.16f;
            this.H = f7;
            if (f7 > f) {
                this.H = f;
            } else {
                invalidate();
            }
        }
        int i3 = this.I;
        int i4 = cmb.c6;
        int f8 = on2.f(this.H, i3, on2.f(0.9f, cmb.w0(null, i4, false), cmb.w0(null, this.J, false)));
        Paint paint3 = this.c;
        paint3.setColor(f8);
        canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint3);
        paint3.setColor(cmb.w0(null, i4, false));
        paint3.setAlpha(255);
        rectF.set(f5, D2, B - gm.L(58.0f), getMeasuredHeight() - D);
        rectF.inset(-gm.L(1.0f), -gm.L(1.0f));
        canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint3);
        paint.setAlpha(31);
        canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint);
        canvas.save();
        canvas.clipRect(rectF);
        paint3.setColor(cmb.w0(null, i, false));
        paint3.setAlpha(60);
        canvas.drawCircle(rectF.left + 0.0f, rectF.centerY(), gm.L(15.0f), paint3);
        float centerY = rectF.centerY() - gm.L(6.0f);
        paint2.setAlpha(57);
        canvas.drawLine(rectF.left + gm.L(23.0f) + 0.0f, centerY, rectF.right - gm.L(68.0f), centerY, paint2);
        float centerY2 = rectF.centerY() + gm.L(6.0f);
        canvas.drawLine(rectF.left + gm.L(23.0f) + 0.0f, centerY2, rectF.right - gm.L(23.0f), centerY2, paint2);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            qeb qebVar = this.h;
            int value = qebVar.getValue() + 1;
            setContentDescription(this.n[(value > qebVar.getMaxValue() || value < 0) ? 0 : 0]);
            qebVar.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.n[this.h.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        updateColors();
        int w0 = cmb.w0(null, cmb.i5, false);
        this.a = w0;
        qeb qebVar = this.h;
        qebVar.setTextColor(w0);
        qebVar.invalidate();
    }

    @Override
    public final void updateColors() {
        for (int i = 0; i < this.s.length; i++) {
            c(i);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
