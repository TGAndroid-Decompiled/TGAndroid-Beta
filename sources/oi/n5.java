package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c8.va;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.nr;
public final class n5 extends ViewGroup {
    public final RectF E;
    public final RectF F;
    public final Path G;
    public final org.telegram.ui.Components.d6 H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public d6 f22225a;
    public final h6 f22226b;
    public int[] f22227c;
    public int[] d;
    public int[] f22228e;
    public int[] f22229f;
    public m5 h;
    public final Paint f22230n;
    public final Paint f22231r;
    public final Paint f22232s;
    public final Paint f22233w;
    public final Paint f22234x;
    public final Paint f22235y;

    public n5(Context context, h6 h6Var) {
        super(context);
        this.f22227c = new int[0];
        this.d = new int[0];
        this.f22228e = new int[0];
        this.f22229f = new int[0];
        Paint paint = new Paint(1);
        this.f22230n = paint;
        this.f22231r = new Paint(1);
        this.f22232s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f22233w = paint2;
        this.f22234x = new Paint(1);
        this.f22235y = new Paint(1);
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Path();
        this.f22226b = h6Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.H = new org.telegram.ui.Components.d6(this, 0L, 220L, nr.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        ViewParent parent;
        TL_iv.pageTableCell pagetablecell;
        d6 d6Var = this.f22225a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (d6Var != null && d6Var.f22026b != 0 && d6Var.f22027c != 0) {
            View findFocus = findFocus();
            if (findFocus == null) {
                parent = null;
            } else {
                parent = findFocus.getParent();
            }
            while (parent != null && parent != this) {
                if (parent instanceof o5) {
                    pagetablecell = ((o5) parent).f22254b;
                    break;
                }
                parent = parent.getParent();
            }
            pagetablecell = null;
            if (pagetablecell != null) {
                return pagetablecell;
            }
            if (this.h == null) {
                return null;
            }
            ArrayList arrayList = this.f22225a.f22030g;
            int size = arrayList.size();
            int i7 = Integer.MAX_VALUE;
            int i10 = 0;
            int i11 = Integer.MAX_VALUE;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((kg.y1) this.h).f18538b).contains(pagetablecell3)) {
                    int b10 = this.f22225a.b(pagetablecell3);
                    int a10 = this.f22225a.a(pagetablecell3);
                    if (b10 < i7 || (b10 == i7 && a10 < i11)) {
                        pagetablecell2 = pagetablecell3;
                        i7 = b10;
                        i11 = a10;
                    }
                }
            }
        }
        return pagetablecell2;
    }

    public final void b() {
        int i7 = m6.f29431hi;
        h6 h6Var = this.f22226b;
        this.f22230n.setColor(m6.w0(i7, h6Var));
        int w02 = m6.w0(m6.M6, h6Var);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        this.f22231r.setColor(m6.w0(m6.f29414gi, h6Var));
        this.f22232s.setColor(Color.argb(20, red, green, blue));
        this.I = 255;
        int i10 = m6.Fi;
        this.f22233w.setColor(m6.w0(i10, h6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f22234x;
        paint.setStyle(style);
        this.P = m6.w0(m6.E6, h6Var);
        this.Q = m6.w0(m6.Ji, h6Var);
        paint.setColor(this.P);
        Paint paint2 = this.f22235y;
        paint2.setStyle(style);
        paint2.setColor(m6.w0(i10, h6Var));
        invalidate();
    }

    public final boolean c(int i7, int i10) {
        if (i7 < 0 || i10 < i7) {
            return false;
        }
        while (i7 <= i10) {
            if (!n(i7)) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public final boolean d(int i7, int i10) {
        if (i7 < 0 || i10 < i7) {
            return false;
        }
        while (i7 <= i10) {
            if (!o(i7)) {
                return false;
            }
            i7++;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: oi.n5.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean e(int i7) {
        if (i7 >= 0 && i7 < this.f22225a.f22027c) {
            for (int i10 = 0; i10 < this.f22225a.f22026b; i10++) {
                if (p(i10, i7)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i7, int i10) {
        int i11;
        d6 d6Var = this.f22225a;
        int i12 = d6Var.f22027c;
        int i13 = d6Var.f22026b;
        int[] iArr = this.f22228e;
        int i14 = 0;
        if (i7 == iArr[0]) {
            i11 = 0;
        } else {
            if (i7 == iArr[i12]) {
                i11 = i12 - 1;
            }
            return 0.0f;
        }
        int[] iArr2 = this.f22229f;
        if (i10 != iArr2[0]) {
            if (i10 == iArr2[i13]) {
                i14 = i13 - 1;
            }
            return 0.0f;
        }
        if (i11 >= 0 && i14 >= 0 && p(i14, i11)) {
            return Math.min(org.telegram.messenger.g0.N(10.0f), Math.min(this.f22227c[i11], this.d[i14]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i7, int i10) {
        float N = i7 - org.telegram.messenger.g0.N(1.0f);
        float N2 = org.telegram.messenger.g0.N(1.0f) + i10;
        float f10 = this.f22229f[this.f22225a.f22026b];
        float L = org.telegram.messenger.g0.L(16.0f) + f10;
        float min = Math.min(org.telegram.messenger.g0.N(10.0f), (N2 - N) / 2.0f);
        float f11 = f(i7, this.f22229f[this.f22225a.f22026b]);
        float f12 = f(i10, this.f22229f[this.f22225a.f22026b]);
        Path path = this.G;
        path.rewind();
        path.moveTo(N, f10 - f11);
        path.lineTo(N, L - min);
        float f13 = min * 2.0f;
        float f14 = L - f13;
        RectF rectF = this.F;
        rectF.set(N, f14, N + f13, L);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(N2 - min, L);
        rectF.set(N2 - f13, f14, N2, L);
        path.arcTo(rectF, 90.0f, -90.0f);
        path.lineTo(N2, f10 - f12);
        if (f12 > 0.0f) {
            float f15 = f12 * 2.0f;
            rectF.set(N2 - f15, f10 - f15, N2, f10);
            path.arcTo(rectF, 0.0f, 90.0f);
        } else {
            path.lineTo(N2, f10);
        }
        path.lineTo(N + f11, f10);
        if (f11 > 0.0f) {
            float f16 = f11 * 2.0f;
            rectF.set(N, f10 - f16, f16 + N, f10);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(N, f10);
        }
        path.close();
        canvas.drawPath(path, this.f22235y);
    }

    public d6 getModel() {
        return this.f22225a;
    }

    public final void h(Canvas canvas, int i7, int i10) {
        float N = i7 - org.telegram.messenger.g0.N(1.0f);
        float N2 = org.telegram.messenger.g0.N(1.0f) + i10;
        float L = this.f22228e[0] - org.telegram.messenger.g0.L(16.0f);
        float min = Math.min(org.telegram.messenger.g0.N(10.0f), (N2 - N) / 2.0f);
        float f10 = f(this.f22228e[0], i7);
        float f11 = f(this.f22228e[0], i10);
        Path path = this.G;
        path.rewind();
        path.moveTo(this.f22228e[0] + f10, N);
        path.lineTo(L + min, N);
        float f12 = min * 2.0f;
        float f13 = L + f12;
        RectF rectF = this.F;
        rectF.set(L, N, f13, N + f12);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(L, N2 - min);
        rectF.set(L, N2 - f12, f13, N2);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.f22228e[0] + f11, N2);
        if (f11 > 0.0f) {
            int i11 = this.f22228e[0];
            float f14 = f11 * 2.0f;
            rectF.set(i11, N2 - f14, i11 + f14, N2);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.f22228e[0], N2);
        }
        path.lineTo(this.f22228e[0], N + f10);
        if (f10 > 0.0f) {
            int i12 = this.f22228e[0];
            float f15 = f10 * 2.0f;
            rectF.set(i12, N, i12 + f15, f15 + N);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.f22228e[0], N);
        }
        path.close();
        canvas.drawPath(path, this.f22235y);
    }

    public final void i(float f10, int i7, int i10, Canvas canvas) {
        float f11;
        float f12;
        float f13 = f(i7, i10);
        if (f13 <= 0.0f) {
            return;
        }
        if (i7 == this.f22228e[0]) {
            f11 = i7 + f13;
        } else {
            f11 = i7 - f13;
        }
        if (i10 == this.f22229f[0]) {
            f12 = i10 + f13;
        } else {
            f12 = i10 - f13;
        }
        RectF rectF = this.F;
        rectF.set(f11 - f13, f12 - f13, f11 + f13, f12 + f13);
        canvas.drawArc(rectF, f10, 90.0f, false, this.f22233w);
    }

    public final int j() {
        for (int i7 = 0; i7 < this.f22225a.f22027c; i7++) {
            if (e(i7)) {
                return i7;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i7 = 0; i7 < this.f22225a.f22026b; i7++) {
            if (t(i7)) {
                return i7;
            }
        }
        return -1;
    }

    public final boolean l() {
        d6 d6Var = this.f22225a;
        if (d6Var != null && this.h != null) {
            ArrayList arrayList = d6Var.f22030g;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((LinkedHashSet) ((kg.y1) this.h).f18538b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final o5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof o5) {
                o5 o5Var = (o5) childAt;
                if (o5Var.f22254b == pagetablecell) {
                    return o5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i7) {
        if (i7 < 0 || i7 >= this.f22225a.f22027c) {
            return false;
        }
        for (int i10 = 0; i10 < this.f22225a.f22026b; i10++) {
            if (!p(i10, i7)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i7) {
        if (i7 < 0 || i7 >= this.f22225a.f22026b) {
            return false;
        }
        for (int i10 = 0; i10 < this.f22225a.f22027c; i10++) {
            if (!p(i7, i10)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        if (this.f22225a != null) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt instanceof o5) {
                    o5 o5Var = (o5) childAt;
                    int b10 = this.f22225a.b(o5Var.f22254b);
                    int a10 = this.f22225a.a(o5Var.f22254b);
                    if (b10 >= 0 && a10 >= 0) {
                        int i14 = this.f22228e[a10];
                        int i15 = this.f22229f[b10];
                        o5Var.layout(i14, i15, o5Var.getMeasuredWidth() + i14, o5Var.getMeasuredHeight() + i15);
                    }
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int round;
        ArrayList arrayList;
        int i15;
        int i16;
        int ceil;
        int i17;
        float f10 = 20.0f;
        int L = org.telegram.messenger.g0.L(20.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int L3 = org.telegram.messenger.g0.L(4.0f);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        d6 d6Var = this.f22225a;
        if (d6Var != null && d6Var.f22026b != 0 && d6Var.f22027c != 0) {
            int size = (View.MeasureSpec.getSize(i7) - L) - L3;
            d6 d6Var2 = this.f22225a;
            int i18 = d6Var2.f22026b;
            int i19 = d6Var2.f22027c;
            this.f22227c = new int[i19];
            this.d = new int[i18];
            if (!d6Var2.f22025a.compact) {
                f10 = 50.0f;
            }
            int L5 = org.telegram.messenger.g0.L(f10);
            if (this.f22225a.f22025a.compact) {
                i11 = 5;
            } else {
                i11 = 12;
            }
            int L6 = org.telegram.messenger.g0.L(i11 * 2);
            if (i19 > 1) {
                i12 = Math.round(size * 0.8f);
            } else {
                i12 = size;
            }
            int max = Math.max(1, Math.max(L5, i12) - L6);
            ArrayList arrayList2 = new ArrayList();
            int i20 = 0;
            while (i20 < getChildCount()) {
                View childAt = getChildAt(i20);
                if (childAt instanceof o5) {
                    o5 o5Var = (o5) childAt;
                    e1 e1Var = o5Var.f22253a;
                    int a10 = this.f22225a.a(o5Var.f22254b);
                    if (a10 >= 0 && a10 < i19) {
                        arrayList = arrayList2;
                        Editable text = e1Var.getText();
                        i15 = L;
                        if (text == null) {
                            i16 = L3;
                            ceil = 0;
                        } else {
                            i16 = L3;
                            ceil = (int) Math.ceil(Layout.getDesiredWidth(text, e1Var.getPaint()));
                        }
                        i17 = i20;
                        arrayList.add(va.b(text, e1Var.getPaint(), a10, d6.n(o5Var.f22254b), L6, max, ceil));
                        i20 = i17 + 1;
                        arrayList2 = arrayList;
                        L = i15;
                        L3 = i16;
                    }
                }
                i15 = L;
                i16 = L3;
                arrayList = arrayList2;
                i17 = i20;
                i20 = i17 + 1;
                arrayList2 = arrayList;
                L = i15;
                L3 = i16;
            }
            int i21 = L;
            int i22 = L3;
            System.arraycopy(va.a(i19, size, L5, arrayList2), 0, this.f22227c, 0, i19);
            int i23 = 0;
            for (int i24 : this.f22227c) {
                i23 += i24;
            }
            if (i23 < size && i19 > 0) {
                int i25 = size - i23;
                for (int i26 = 0; i26 < i19; i26++) {
                    if (i26 == i19 - 1) {
                        round = i25;
                    } else {
                        round = Math.round((this.f22227c[i26] * i25) / i23);
                    }
                    int[] iArr = this.f22227c;
                    int i27 = iArr[i26] + round;
                    iArr[i26] = i27;
                    i25 -= round;
                    i23 -= i27 - round;
                }
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            for (int i28 = 0; i28 < getChildCount(); i28++) {
                View childAt2 = getChildAt(i28);
                if (childAt2 instanceof o5) {
                    o5 o5Var2 = (o5) childAt2;
                    int b10 = this.f22225a.b(o5Var2.f22254b);
                    int a11 = this.f22225a.a(o5Var2.f22254b);
                    int n10 = d6.n(o5Var2.f22254b);
                    int i29 = 0;
                    for (int i30 = a11; i30 < a11 + n10 && i30 < i19; i30++) {
                        i29 += this.f22227c[i30];
                    }
                    o5Var2.measure(View.MeasureSpec.makeMeasureSpec(i29, 1073741824), makeMeasureSpec);
                    if (d6.o(o5Var2.f22254b) == 1) {
                        int measuredHeight = o5Var2.getMeasuredHeight();
                        int[] iArr2 = this.d;
                        if (measuredHeight > iArr2[b10]) {
                            iArr2[b10] = o5Var2.getMeasuredHeight();
                        }
                    }
                }
            }
            for (int i31 = 0; i31 < getChildCount(); i31++) {
                View childAt3 = getChildAt(i31);
                if (childAt3 instanceof o5) {
                    o5 o5Var3 = (o5) childAt3;
                    int b11 = this.f22225a.b(o5Var3.f22254b);
                    int o4 = d6.o(o5Var3.f22254b);
                    if (o4 > 1) {
                        int i32 = b11;
                        int i33 = 0;
                        while (true) {
                            i13 = b11 + o4;
                            if (i32 >= i13 || i32 >= i18) {
                                break;
                            }
                            i33 += this.d[i32];
                            i32++;
                        }
                        int measuredHeight2 = o5Var3.getMeasuredHeight();
                        if (measuredHeight2 > i33) {
                            int i34 = measuredHeight2 - i33;
                            int max2 = i34 / Math.max(o4, 1);
                            int max3 = i34 % Math.max(o4, 1);
                            while (b11 < i13 && b11 < i18) {
                                int[] iArr3 = this.d;
                                int i35 = iArr3[b11];
                                if (max3 > 0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                iArr3[b11] = i14 + max2 + i35;
                                if (max3 > 0) {
                                    max3--;
                                }
                                b11++;
                            }
                        }
                    }
                }
            }
            for (int i36 = 0; i36 < getChildCount(); i36++) {
                View childAt4 = getChildAt(i36);
                if (childAt4 instanceof o5) {
                    o5 o5Var4 = (o5) childAt4;
                    int b12 = this.f22225a.b(o5Var4.f22254b);
                    int a12 = this.f22225a.a(o5Var4.f22254b);
                    int n11 = d6.n(o5Var4.f22254b);
                    int o10 = d6.o(o5Var4.f22254b);
                    int i37 = 0;
                    for (int i38 = a12; i38 < a12 + n11 && i38 < i19; i38++) {
                        i37 += this.f22227c[i38];
                    }
                    int i39 = 0;
                    for (int i40 = b12; i40 < b12 + o10 && i40 < i18; i40++) {
                        i39 += this.d[i40];
                    }
                    o5Var4.measure(View.MeasureSpec.makeMeasureSpec(i37, 1073741824), View.MeasureSpec.makeMeasureSpec(i39, 1073741824));
                }
            }
            int[] iArr4 = new int[i19 + 1];
            this.f22228e = iArr4;
            iArr4[0] = i21;
            int i41 = 0;
            while (i41 < i19) {
                int[] iArr5 = this.f22228e;
                int i42 = i41 + 1;
                iArr5[i42] = iArr5[i41] + this.f22227c[i41];
                i41 = i42;
            }
            int[] iArr6 = new int[i18 + 1];
            this.f22229f = iArr6;
            iArr6[0] = L2;
            int i43 = 0;
            while (i43 < i18) {
                int[] iArr7 = this.f22229f;
                int i44 = i43 + 1;
                iArr7[i44] = iArr7[i43] + this.d[i43];
                i43 = i44;
            }
            setMeasuredDimension(Math.max(this.f22228e[i19] + i22, size + i21 + i22), this.f22229f[i18] + L4);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), L2 + L4);
        this.f22227c = new int[0];
        this.d = new int[0];
        this.f22228e = new int[0];
        this.f22229f = new int[0];
    }

    public final boolean p(int i7, int i10) {
        m5 m5Var;
        d6 d6Var = this.f22225a;
        if (d6Var == null || (m5Var = this.h) == null || i7 < 0 || i7 >= d6Var.f22026b || i10 < 0 || i10 >= d6Var.f22027c) {
            return false;
        }
        return ((LinkedHashSet) ((kg.y1) m5Var).f18538b).contains(d6Var.d[i7][i10]);
    }

    public final int q() {
        for (int i7 = this.f22225a.f22027c - 1; i7 >= 0; i7--) {
            if (e(i7)) {
                return i7;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i7 = this.f22225a.f22026b - 1; i7 >= 0; i7--) {
            if (t(i7)) {
                return i7;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof o5) {
                removeViewAt(childCount);
            }
        }
        d6 d6Var = this.f22225a;
        if (d6Var != null) {
            int size = d6Var.f22030g.size();
            for (int i7 = 0; i7 < size; i7++) {
                o5 o5Var = new o5(getContext(), this.f22226b);
                o5Var.setCompact(this.f22225a.f22025a.compact);
                o5Var.b((TL_iv.pageTableCell) this.f22225a.f22030g.get(i7));
                addView(o5Var);
            }
        }
    }

    public void setModel(d6 d6Var) {
        this.f22225a = d6Var;
        s();
    }

    public void setSelectionProvider(m5 m5Var) {
        this.h = m5Var;
        invalidate();
    }

    public final boolean t(int i7) {
        if (i7 >= 0 && i7 < this.f22225a.f22026b) {
            for (int i10 = 0; i10 < this.f22225a.f22027c; i10++) {
                if (p(i7, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u() {
        if (!l()) {
            return false;
        }
        boolean d = d(k(), r());
        boolean c10 = c(j(), q());
        if (d && !c10) {
            return false;
        }
        return true;
    }

    public final boolean v() {
        if (!l()) {
            return false;
        }
        boolean d = d(k(), r());
        if (c(j(), q()) && !d) {
            return false;
        }
        return true;
    }
}
