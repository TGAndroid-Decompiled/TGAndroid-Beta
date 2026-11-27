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
public final class lgb extends FrameLayout implements snb {
    public int E;
    public final e29[] F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public s8b L;
    public int a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public final kgb h;
    public final String[] n;
    public final int[] r;
    public final b29[] s;
    public final b29[] w;
    public final int[] x;
    public final int[] y;

    public lgb(Context context, int i) {
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
        this.s = new b29[6];
        this.w = new b29[6];
        this.x = new int[6];
        this.y = new int[6];
        this.F = new e29[2];
        this.H = 1.0f;
        String[] strArr = {ob6.M0(2131743968, null), ob6.M0(2131743967, null), ob6.M0(2131743972, null), ob6.M0(2131743969, null), ob6.M0(2131743971, null), ob6.M0(2131743970, null)};
        int i3 = aob.c9;
        int[] iArr = {i3, i3, i3, i3, aob.Y5, aob.d9};
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(hl.L(1.0f));
        paint2.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(hl.L(5.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(hl.L(2.0f));
        kgb kgbVar = new kgb(this, context);
        this.h = kgbVar;
        this.a = aob.w0(null, aob.j5, false);
        kgbVar.setMinValue(0);
        kgbVar.setDrawDividers(false);
        boolean isEmpty = uc7.s1(i).G0.isEmpty();
        kgbVar.setMaxValue(isEmpty ? 4 : 5);
        if (!isEmpty) {
            i2 = 6;
        } else {
            i2 = 5;
        }
        kgbVar.setAllItemsCount(i2);
        kgbVar.setWrapSelectorWheel(true);
        kgbVar.setFormatter(new jgb(this));
        kgbVar.setOnValueChangedListener(new jgb(this));
        kgbVar.setImportantForAccessibility(2);
        kgbVar.setValue(xea.m(i));
        addView(kgbVar, tre.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.E = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            this.F[i4] = new ImageView(context);
            addView(this.F[i4], tre.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        b29 a = a(this.h.getValue());
        if (a != null) {
            this.F[0].setImageDrawable(a);
            a.H(a.e[0] - 1);
        }
        hl.T3(this.F[0], true, 0.5f, true, false);
        hl.T3(this.F[1], false, 0.5f, true, false);
        this.G = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.K = this.h.getValue();
    }

    public final b29 a(int i) {
        int i2;
        b29[] b29VarArr = this.s;
        if (b29VarArr[i] == null) {
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
            b29VarArr[i] = new b29(i2, hl.L(28.0f), hl.L(28.0f), true, null);
            c(i);
        }
        return b29VarArr[i];
    }

    public final void b() {
        int value;
        if (this.L == null && this.K != (value = this.h.getValue())) {
            this.K = value;
            int i = (this.E + 1) % 2;
            b29 a = a(value);
            e29[] e29VarArr = this.F;
            if (a != null) {
                if (e29VarArr[i].getVisibility() != 0) {
                    a.I(0, false, false);
                }
                e29VarArr[i].setAnimation(a);
                e29VarArr[i].d();
            } else {
                e29VarArr[i].a();
            }
            hl.T3(e29VarArr[this.E], false, 0.5f, true, true);
            hl.T3(e29VarArr[i], true, 0.5f, true, true);
            this.E = i;
            s8b s8bVar = new s8b(this, (byte) 10);
            this.L = s8bVar;
            hl.d3(s8bVar, 150L);
        }
    }

    public final void c(int i) {
        b29[] b29VarArr = this.s;
        if (b29VarArr[i] != null) {
            int f = vm2.f(0.9f, aob.w0(null, aob.d6, false), aob.w0(null, aob.c9, false));
            int i2 = aob.e9;
            int w0 = aob.w0(null, i2, false);
            b29 b29Var = b29VarArr[i];
            b29[] b29VarArr2 = this.w;
            b29 b29Var2 = b29VarArr2[i];
            int[] iArr = this.y;
            int[] iArr2 = this.x;
            if (b29Var != b29Var2 || w0 != iArr2[i] || f != iArr[i]) {
                b29VarArr2[i] = b29Var;
                iArr2[i] = w0;
                iArr[i] = f;
                if (i == 2) {
                    b29VarArr[i].L(f, "Arrow");
                    b29VarArr[i].L(w0, "Box2");
                    b29VarArr[i].L(w0, "Box1");
                    return;
                }
                yob.x(this, b29VarArr[i], i2, null, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        int D;
        float f;
        super.onDraw(canvas);
        kgb kgbVar = this.h;
        if (kgbVar.getValue() == 5) {
            z = true;
        } else {
            z = false;
        }
        float f2 = this.G;
        e29[] e29VarArr = this.F;
        if (z) {
            if (f2 != 1.0f) {
                float f3 = f2 + 0.053333335f;
                this.G = f3;
                if (f3 > 1.0f) {
                    this.G = 1.0f;
                } else {
                    e29VarArr[0].invalidate();
                    e29VarArr[1].invalidate();
                    invalidate();
                }
            }
        } else if (f2 != 0.0f) {
            float f4 = f2 - 0.053333335f;
            this.G = f4;
            if (f4 < 0.0f) {
                this.G = 0.0f;
            } else {
                e29VarArr[0].invalidate();
                e29VarArr[1].invalidate();
                invalidate();
            }
        }
        int i = aob.M6;
        int w0 = aob.w0(null, i, false);
        Paint paint = this.b;
        paint.setColor(w0);
        int w02 = aob.w0(null, i, false);
        Paint paint2 = this.d;
        paint2.setColor(w02);
        int B = ik8.B(16.0f, hl.L(21.0f) + hl.L(132.0f), getMeasuredWidth());
        int L = hl.L(21.0f);
        float f5 = L;
        float D2 = ik8.D(48.0f, getMeasuredHeight(), 2);
        RectF rectF = this.f;
        rectF.set(f5, D2, B, getMeasuredHeight() - D);
        int i2 = this.J;
        int[] iArr = this.r;
        if (i2 < 0) {
            this.J = iArr[kgbVar.getValue()];
            this.H = 1.0f;
            this.I = vm2.f(0.9f, aob.w0(null, aob.d6, false), aob.w0(null, this.J, false));
            f = 1.0f;
        } else {
            f = 1.0f;
            if (iArr[kgbVar.getValue()] != this.J) {
                this.I = vm2.f(this.H, this.I, vm2.f(0.9f, aob.w0(null, aob.d6, false), aob.w0(null, this.J, false)));
                this.H = 0.0f;
                this.J = iArr[kgbVar.getValue()];
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
        int i4 = aob.d6;
        int f8 = vm2.f(this.H, i3, vm2.f(0.9f, aob.w0(null, i4, false), aob.w0(null, this.J, false)));
        Paint paint3 = this.c;
        paint3.setColor(f8);
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint3);
        paint3.setColor(aob.w0(null, i4, false));
        paint3.setAlpha(255);
        rectF.set(f5, D2, B - hl.L(58.0f), getMeasuredHeight() - D);
        rectF.inset(-hl.L(1.0f), -hl.L(1.0f));
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint3);
        paint.setAlpha(31);
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint);
        canvas.save();
        canvas.clipRect(rectF);
        paint3.setColor(aob.w0(null, i, false));
        paint3.setAlpha(60);
        canvas.drawCircle(rectF.left + 0.0f, rectF.centerY(), hl.L(15.0f), paint3);
        float centerY = rectF.centerY() - hl.L(6.0f);
        paint2.setAlpha(57);
        canvas.drawLine(rectF.left + hl.L(23.0f) + 0.0f, centerY, rectF.right - hl.L(68.0f), centerY, paint2);
        float centerY2 = rectF.centerY() + hl.L(6.0f);
        canvas.drawLine(rectF.left + hl.L(23.0f) + 0.0f, centerY2, rectF.right - hl.L(23.0f), centerY2, paint2);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            kgb kgbVar = this.h;
            int value = kgbVar.getValue() + 1;
            setContentDescription(this.n[(value > kgbVar.getMaxValue() || value < 0) ? 0 : 0]);
            kgbVar.a(true);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        updateColors();
        int w0 = aob.w0(null, aob.j5, false);
        this.a = w0;
        kgb kgbVar = this.h;
        kgbVar.setTextColor(w0);
        kgbVar.invalidate();
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
