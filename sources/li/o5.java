package li;

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
import c8.na;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
public final class o5 extends ViewGroup {
    public final RectF D;
    public final RectF E;
    public final Path F;
    public final org.telegram.ui.Components.w5 G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public e6 f18748a;
    public final f6 f18749b;
    public int[] f18750c;
    public int[] d;
    public int[] f18751e;
    public int[] f18752f;
    public n5 h;
    public final Paint f18753n;
    public final Paint f18754r;
    public final Paint f18755s;
    public final Paint f18756w;
    public final Paint f18757x;
    public final Paint f18758y;

    public o5(Context context, f6 f6Var) {
        super(context);
        this.f18750c = new int[0];
        this.d = new int[0];
        this.f18751e = new int[0];
        this.f18752f = new int[0];
        Paint paint = new Paint(1);
        this.f18753n = paint;
        this.f18754r = new Paint(1);
        this.f18755s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f18756w = paint2;
        this.f18757x = new Paint(1);
        this.f18758y = new Paint(1);
        this.D = new RectF();
        this.E = new RectF();
        this.F = new Path();
        this.f18749b = f6Var;
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
        this.G = new org.telegram.ui.Components.w5(this, 0L, 220L, xq.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        ViewParent parent;
        TL_iv.pageTableCell pagetablecell;
        e6 e6Var = this.f18748a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (e6Var != null && e6Var.f18544b != 0 && e6Var.f18545c != 0) {
            View findFocus = findFocus();
            if (findFocus == null) {
                parent = null;
            } else {
                parent = findFocus.getParent();
            }
            while (parent != null && parent != this) {
                if (parent instanceof p5) {
                    pagetablecell = ((p5) parent).f18779b;
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
            ArrayList arrayList = this.f18748a.f18548g;
            int size = arrayList.size();
            int i7 = Integer.MAX_VALUE;
            int i10 = 0;
            int i11 = Integer.MAX_VALUE;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((l2.y) this.h).f18089b).contains(pagetablecell3)) {
                    int b10 = this.f18748a.b(pagetablecell3);
                    int a10 = this.f18748a.a(pagetablecell3);
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
        int i7 = k6.f27882ei;
        f6 f6Var = this.f18749b;
        this.f18753n.setColor(k6.w0(i7, f6Var));
        int w02 = k6.w0(k6.M6, f6Var);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        this.f18754r.setColor(k6.w0(k6.f27863di, f6Var));
        this.f18755s.setColor(Color.argb(20, red, green, blue));
        this.H = 255;
        int i10 = k6.Ci;
        this.f18756w.setColor(k6.w0(i10, f6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f18757x;
        paint.setStyle(style);
        this.O = k6.w0(k6.E6, f6Var);
        this.P = k6.w0(k6.Gi, f6Var);
        paint.setColor(this.O);
        Paint paint2 = this.f18758y;
        paint2.setStyle(style);
        paint2.setColor(k6.w0(i10, f6Var));
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
        throw new UnsupportedOperationException("Method not decompiled: li.o5.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean e(int i7) {
        if (i7 >= 0 && i7 < this.f18748a.f18545c) {
            for (int i10 = 0; i10 < this.f18748a.f18544b; i10++) {
                if (p(i10, i7)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i7, int i10) {
        int i11;
        e6 e6Var = this.f18748a;
        int i12 = e6Var.f18545c;
        int i13 = e6Var.f18544b;
        int[] iArr = this.f18751e;
        int i14 = 0;
        if (i7 == iArr[0]) {
            i11 = 0;
        } else {
            if (i7 == iArr[i12]) {
                i11 = i12 - 1;
            }
            return 0.0f;
        }
        int[] iArr2 = this.f18752f;
        if (i10 != iArr2[0]) {
            if (i10 == iArr2[i13]) {
                i14 = i13 - 1;
            }
            return 0.0f;
        }
        if (i11 >= 0 && i14 >= 0 && p(i14, i11)) {
            return Math.min(org.telegram.messenger.g0.N(10.0f), Math.min(this.f18750c[i11], this.d[i14]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i7, int i10) {
        float N = i7 - org.telegram.messenger.g0.N(1.0f);
        float N2 = org.telegram.messenger.g0.N(1.0f) + i10;
        float f10 = this.f18752f[this.f18748a.f18544b];
        float L = org.telegram.messenger.g0.L(16.0f) + f10;
        float min = Math.min(org.telegram.messenger.g0.N(10.0f), (N2 - N) / 2.0f);
        float f11 = f(i7, this.f18752f[this.f18748a.f18544b]);
        float f12 = f(i10, this.f18752f[this.f18748a.f18544b]);
        Path path = this.F;
        path.rewind();
        path.moveTo(N, f10 - f11);
        path.lineTo(N, L - min);
        float f13 = min * 2.0f;
        float f14 = L - f13;
        RectF rectF = this.E;
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
        canvas.drawPath(path, this.f18758y);
    }

    public e6 getModel() {
        return this.f18748a;
    }

    public final void h(Canvas canvas, int i7, int i10) {
        float N = i7 - org.telegram.messenger.g0.N(1.0f);
        float N2 = org.telegram.messenger.g0.N(1.0f) + i10;
        float L = this.f18751e[0] - org.telegram.messenger.g0.L(16.0f);
        float min = Math.min(org.telegram.messenger.g0.N(10.0f), (N2 - N) / 2.0f);
        float f10 = f(this.f18751e[0], i7);
        float f11 = f(this.f18751e[0], i10);
        Path path = this.F;
        path.rewind();
        path.moveTo(this.f18751e[0] + f10, N);
        path.lineTo(L + min, N);
        float f12 = min * 2.0f;
        float f13 = L + f12;
        RectF rectF = this.E;
        rectF.set(L, N, f13, N + f12);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(L, N2 - min);
        rectF.set(L, N2 - f12, f13, N2);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.f18751e[0] + f11, N2);
        if (f11 > 0.0f) {
            int i11 = this.f18751e[0];
            float f14 = f11 * 2.0f;
            rectF.set(i11, N2 - f14, i11 + f14, N2);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.f18751e[0], N2);
        }
        path.lineTo(this.f18751e[0], N + f10);
        if (f10 > 0.0f) {
            int i12 = this.f18751e[0];
            float f15 = f10 * 2.0f;
            rectF.set(i12, N, i12 + f15, f15 + N);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.f18751e[0], N);
        }
        path.close();
        canvas.drawPath(path, this.f18758y);
    }

    public final void i(float f10, int i7, int i10, Canvas canvas) {
        float f11;
        float f12;
        float f13 = f(i7, i10);
        if (f13 <= 0.0f) {
            return;
        }
        if (i7 == this.f18751e[0]) {
            f11 = i7 + f13;
        } else {
            f11 = i7 - f13;
        }
        if (i10 == this.f18752f[0]) {
            f12 = i10 + f13;
        } else {
            f12 = i10 - f13;
        }
        RectF rectF = this.E;
        rectF.set(f11 - f13, f12 - f13, f11 + f13, f12 + f13);
        canvas.drawArc(rectF, f10, 90.0f, false, this.f18756w);
    }

    public final int j() {
        for (int i7 = 0; i7 < this.f18748a.f18545c; i7++) {
            if (e(i7)) {
                return i7;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i7 = 0; i7 < this.f18748a.f18544b; i7++) {
            if (t(i7)) {
                return i7;
            }
        }
        return -1;
    }

    public final boolean l() {
        e6 e6Var = this.f18748a;
        if (e6Var != null && this.h != null) {
            ArrayList arrayList = e6Var.f18548g;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((LinkedHashSet) ((l2.y) this.h).f18089b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final p5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof p5) {
                p5 p5Var = (p5) childAt;
                if (p5Var.f18779b == pagetablecell) {
                    return p5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i7) {
        if (i7 < 0 || i7 >= this.f18748a.f18545c) {
            return false;
        }
        for (int i10 = 0; i10 < this.f18748a.f18544b; i10++) {
            if (!p(i10, i7)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i7) {
        if (i7 < 0 || i7 >= this.f18748a.f18544b) {
            return false;
        }
        for (int i10 = 0; i10 < this.f18748a.f18545c; i10++) {
            if (!p(i7, i10)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        if (this.f18748a != null) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt instanceof p5) {
                    p5 p5Var = (p5) childAt;
                    int b10 = this.f18748a.b(p5Var.f18779b);
                    int a10 = this.f18748a.a(p5Var.f18779b);
                    if (b10 >= 0 && a10 >= 0) {
                        int i14 = this.f18751e[a10];
                        int i15 = this.f18752f[b10];
                        p5Var.layout(i14, i15, p5Var.getMeasuredWidth() + i14, p5Var.getMeasuredHeight() + i15);
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
        e6 e6Var = this.f18748a;
        if (e6Var != null && e6Var.f18544b != 0 && e6Var.f18545c != 0) {
            int size = (View.MeasureSpec.getSize(i7) - L) - L3;
            e6 e6Var2 = this.f18748a;
            int i18 = e6Var2.f18544b;
            int i19 = e6Var2.f18545c;
            this.f18750c = new int[i19];
            this.d = new int[i18];
            if (!e6Var2.f18543a.compact) {
                f10 = 50.0f;
            }
            int L5 = org.telegram.messenger.g0.L(f10);
            if (this.f18748a.f18543a.compact) {
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
                if (childAt instanceof p5) {
                    p5 p5Var = (p5) childAt;
                    g1 g1Var = p5Var.f18778a;
                    int a10 = this.f18748a.a(p5Var.f18779b);
                    if (a10 >= 0 && a10 < i19) {
                        arrayList = arrayList2;
                        Editable text = g1Var.getText();
                        i15 = L;
                        if (text == null) {
                            i16 = L3;
                            ceil = 0;
                        } else {
                            i16 = L3;
                            ceil = (int) Math.ceil(Layout.getDesiredWidth(text, g1Var.getPaint()));
                        }
                        i17 = i20;
                        arrayList.add(na.b(text, g1Var.getPaint(), a10, e6.n(p5Var.f18779b), L6, max, ceil));
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
            System.arraycopy(na.a(i19, size, L5, arrayList2), 0, this.f18750c, 0, i19);
            int i23 = 0;
            for (int i24 : this.f18750c) {
                i23 += i24;
            }
            if (i23 < size && i19 > 0) {
                int i25 = size - i23;
                for (int i26 = 0; i26 < i19; i26++) {
                    if (i26 == i19 - 1) {
                        round = i25;
                    } else {
                        round = Math.round((this.f18750c[i26] * i25) / i23);
                    }
                    int[] iArr = this.f18750c;
                    int i27 = iArr[i26] + round;
                    iArr[i26] = i27;
                    i25 -= round;
                    i23 -= i27 - round;
                }
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            for (int i28 = 0; i28 < getChildCount(); i28++) {
                View childAt2 = getChildAt(i28);
                if (childAt2 instanceof p5) {
                    p5 p5Var2 = (p5) childAt2;
                    int b10 = this.f18748a.b(p5Var2.f18779b);
                    int a11 = this.f18748a.a(p5Var2.f18779b);
                    int n10 = e6.n(p5Var2.f18779b);
                    int i29 = 0;
                    for (int i30 = a11; i30 < a11 + n10 && i30 < i19; i30++) {
                        i29 += this.f18750c[i30];
                    }
                    p5Var2.measure(View.MeasureSpec.makeMeasureSpec(i29, 1073741824), makeMeasureSpec);
                    if (e6.o(p5Var2.f18779b) == 1) {
                        int measuredHeight = p5Var2.getMeasuredHeight();
                        int[] iArr2 = this.d;
                        if (measuredHeight > iArr2[b10]) {
                            iArr2[b10] = p5Var2.getMeasuredHeight();
                        }
                    }
                }
            }
            for (int i31 = 0; i31 < getChildCount(); i31++) {
                View childAt3 = getChildAt(i31);
                if (childAt3 instanceof p5) {
                    p5 p5Var3 = (p5) childAt3;
                    int b11 = this.f18748a.b(p5Var3.f18779b);
                    int o4 = e6.o(p5Var3.f18779b);
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
                        int measuredHeight2 = p5Var3.getMeasuredHeight();
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
                if (childAt4 instanceof p5) {
                    p5 p5Var4 = (p5) childAt4;
                    int b12 = this.f18748a.b(p5Var4.f18779b);
                    int a12 = this.f18748a.a(p5Var4.f18779b);
                    int n11 = e6.n(p5Var4.f18779b);
                    int o10 = e6.o(p5Var4.f18779b);
                    int i37 = 0;
                    for (int i38 = a12; i38 < a12 + n11 && i38 < i19; i38++) {
                        i37 += this.f18750c[i38];
                    }
                    int i39 = 0;
                    for (int i40 = b12; i40 < b12 + o10 && i40 < i18; i40++) {
                        i39 += this.d[i40];
                    }
                    p5Var4.measure(View.MeasureSpec.makeMeasureSpec(i37, 1073741824), View.MeasureSpec.makeMeasureSpec(i39, 1073741824));
                }
            }
            int[] iArr4 = new int[i19 + 1];
            this.f18751e = iArr4;
            iArr4[0] = i21;
            int i41 = 0;
            while (i41 < i19) {
                int[] iArr5 = this.f18751e;
                int i42 = i41 + 1;
                iArr5[i42] = iArr5[i41] + this.f18750c[i41];
                i41 = i42;
            }
            int[] iArr6 = new int[i18 + 1];
            this.f18752f = iArr6;
            iArr6[0] = L2;
            int i43 = 0;
            while (i43 < i18) {
                int[] iArr7 = this.f18752f;
                int i44 = i43 + 1;
                iArr7[i44] = iArr7[i43] + this.d[i43];
                i43 = i44;
            }
            setMeasuredDimension(Math.max(this.f18751e[i19] + i22, size + i21 + i22), this.f18752f[i18] + L4);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), L2 + L4);
        this.f18750c = new int[0];
        this.d = new int[0];
        this.f18751e = new int[0];
        this.f18752f = new int[0];
    }

    public final boolean p(int i7, int i10) {
        n5 n5Var;
        e6 e6Var = this.f18748a;
        if (e6Var == null || (n5Var = this.h) == null || i7 < 0 || i7 >= e6Var.f18544b || i10 < 0 || i10 >= e6Var.f18545c) {
            return false;
        }
        return ((LinkedHashSet) ((l2.y) n5Var).f18089b).contains(e6Var.d[i7][i10]);
    }

    public final int q() {
        for (int i7 = this.f18748a.f18545c - 1; i7 >= 0; i7--) {
            if (e(i7)) {
                return i7;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i7 = this.f18748a.f18544b - 1; i7 >= 0; i7--) {
            if (t(i7)) {
                return i7;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof p5) {
                removeViewAt(childCount);
            }
        }
        e6 e6Var = this.f18748a;
        if (e6Var != null) {
            int size = e6Var.f18548g.size();
            for (int i7 = 0; i7 < size; i7++) {
                p5 p5Var = new p5(getContext(), this.f18749b);
                p5Var.setCompact(this.f18748a.f18543a.compact);
                p5Var.b((TL_iv.pageTableCell) this.f18748a.f18548g.get(i7));
                addView(p5Var);
            }
        }
    }

    public void setModel(e6 e6Var) {
        this.f18748a = e6Var;
        s();
    }

    public void setSelectionProvider(n5 n5Var) {
        this.h = n5Var;
        invalidate();
    }

    public final boolean t(int i7) {
        if (i7 >= 0 && i7 < this.f18748a.f18544b) {
            for (int i10 = 0; i10 < this.f18748a.f18545c; i10++) {
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
