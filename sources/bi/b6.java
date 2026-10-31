package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.gr;
public final class b6 extends ViewGroup {
    public final RectF D;
    public final RectF E;
    public final Path F;
    public final org.telegram.ui.Components.t5 G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public w6 f2867a;
    public final org.telegram.ui.ActionBar.p6 f2868b;
    public int[] f2869c;
    public int[] d;
    public int[] e;
    public int[] f2870f;
    public a6 h;
    public final Paint f2871n;
    public final Paint f2872r;
    public final Paint f2873s;
    public final Paint f2874w;
    public final Paint f2875x;
    public final Paint f2876y;

    public b6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f2869c = new int[0];
        this.d = new int[0];
        this.e = new int[0];
        this.f2870f = new int[0];
        Paint paint = new Paint(1);
        this.f2871n = paint;
        this.f2872r = new Paint(1);
        this.f2873s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f2874w = paint2;
        this.f2875x = new Paint(1);
        this.f2876y = new Paint(1);
        this.D = new RectF();
        this.E = new RectF();
        this.F = new Path();
        this.f2868b = p6Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(0.66f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.G = new org.telegram.ui.Components.t5(this, 0L, 220L, gr.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        ViewParent parent;
        TL_iv.pageTableCell pagetablecell;
        w6 w6Var = this.f2867a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (w6Var != null && w6Var.f3438b != 0 && w6Var.f3439c != 0) {
            View findFocus = findFocus();
            if (findFocus == null) {
                parent = null;
            } else {
                parent = findFocus.getParent();
            }
            while (parent != null && parent != this) {
                if (parent instanceof c6) {
                    pagetablecell = ((c6) parent).f2906b;
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
            ArrayList arrayList = this.f2867a.f3441g;
            int size = arrayList.size();
            int i10 = Integer.MAX_VALUE;
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((a1.c) this.h).f35b).contains(pagetablecell3)) {
                    int b10 = this.f2867a.b(pagetablecell3);
                    int a2 = this.f2867a.a(pagetablecell3);
                    if (b10 < i10 || (b10 == i10 && a2 < i12)) {
                        pagetablecell2 = pagetablecell3;
                        i10 = b10;
                        i12 = a2;
                    }
                }
            }
        }
        return pagetablecell2;
    }

    public final void b() {
        int i10 = org.telegram.ui.ActionBar.t6.f20958ei;
        org.telegram.ui.ActionBar.p6 p6Var = this.f2868b;
        this.f2871n.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.M6, p6Var);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        this.f2872r.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20941di, p6Var));
        this.f2873s.setColor(Color.argb(20, red, green, blue));
        this.H = 255;
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        this.f2874w.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f2875x;
        paint.setStyle(style);
        this.O = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E6, p6Var);
        this.P = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gi, p6Var);
        paint.setColor(this.O);
        Paint paint2 = this.f2876y;
        paint2.setStyle(style);
        paint2.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        invalidate();
    }

    public final boolean c(int i10, int i11) {
        if (i10 < 0 || i11 < i10) {
            return false;
        }
        while (i10 <= i11) {
            if (!n(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public final boolean d(int i10, int i11) {
        if (i10 < 0 || i11 < i10) {
            return false;
        }
        while (i10 <= i11) {
            if (!o(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: bi.b6.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean e(int i10) {
        if (i10 >= 0 && i10 < this.f2867a.f3439c) {
            for (int i11 = 0; i11 < this.f2867a.f3438b; i11++) {
                if (p(i11, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i10, int i11) {
        int i12;
        w6 w6Var = this.f2867a;
        int i13 = w6Var.f3439c;
        int i14 = w6Var.f3438b;
        int[] iArr = this.e;
        int i15 = 0;
        if (i10 == iArr[0]) {
            i12 = 0;
        } else {
            if (i10 == iArr[i13]) {
                i12 = i13 - 1;
            }
            return 0.0f;
        }
        int[] iArr2 = this.f2870f;
        if (i11 != iArr2[0]) {
            if (i11 == iArr2[i14]) {
                i15 = i14 - 1;
            }
            return 0.0f;
        }
        if (i12 >= 0 && i15 >= 0 && p(i15, i12)) {
            return Math.min(org.telegram.messenger.i0.N(10.0f), Math.min(this.f2869c[i12], this.d[i15]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i10, int i11) {
        float N = i10 - org.telegram.messenger.i0.N(1.0f);
        float N2 = org.telegram.messenger.i0.N(1.0f) + i11;
        float f7 = this.f2870f[this.f2867a.f3438b];
        float L = org.telegram.messenger.i0.L(16.0f) + f7;
        float min = Math.min(org.telegram.messenger.i0.N(10.0f), (N2 - N) / 2.0f);
        float f10 = f(i10, this.f2870f[this.f2867a.f3438b]);
        float f11 = f(i11, this.f2870f[this.f2867a.f3438b]);
        Path path = this.F;
        path.rewind();
        path.moveTo(N, f7 - f10);
        path.lineTo(N, L - min);
        float f12 = min * 2.0f;
        float f13 = L - f12;
        RectF rectF = this.E;
        rectF.set(N, f13, N + f12, L);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(N2 - min, L);
        rectF.set(N2 - f12, f13, N2, L);
        path.arcTo(rectF, 90.0f, -90.0f);
        path.lineTo(N2, f7 - f11);
        if (f11 > 0.0f) {
            float f14 = f11 * 2.0f;
            rectF.set(N2 - f14, f7 - f14, N2, f7);
            path.arcTo(rectF, 0.0f, 90.0f);
        } else {
            path.lineTo(N2, f7);
        }
        path.lineTo(N + f10, f7);
        if (f10 > 0.0f) {
            float f15 = f10 * 2.0f;
            rectF.set(N, f7 - f15, f15 + N, f7);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(N, f7);
        }
        path.close();
        canvas.drawPath(path, this.f2876y);
    }

    public w6 getModel() {
        return this.f2867a;
    }

    public final void h(Canvas canvas, int i10, int i11) {
        float N = i10 - org.telegram.messenger.i0.N(1.0f);
        float N2 = org.telegram.messenger.i0.N(1.0f) + i11;
        float L = this.e[0] - org.telegram.messenger.i0.L(16.0f);
        float min = Math.min(org.telegram.messenger.i0.N(10.0f), (N2 - N) / 2.0f);
        float f7 = f(this.e[0], i10);
        float f10 = f(this.e[0], i11);
        Path path = this.F;
        path.rewind();
        path.moveTo(this.e[0] + f7, N);
        path.lineTo(L + min, N);
        float f11 = min * 2.0f;
        float f12 = L + f11;
        RectF rectF = this.E;
        rectF.set(L, N, f12, N + f11);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(L, N2 - min);
        rectF.set(L, N2 - f11, f12, N2);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.e[0] + f10, N2);
        if (f10 > 0.0f) {
            int i12 = this.e[0];
            float f13 = f10 * 2.0f;
            rectF.set(i12, N2 - f13, i12 + f13, N2);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], N2);
        }
        path.lineTo(this.e[0], N + f7);
        if (f7 > 0.0f) {
            int i13 = this.e[0];
            float f14 = f7 * 2.0f;
            rectF.set(i13, N, i13 + f14, f14 + N);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], N);
        }
        path.close();
        canvas.drawPath(path, this.f2876y);
    }

    public final void i(float f7, int i10, int i11, Canvas canvas) {
        float f10;
        float f11;
        float f12 = f(i10, i11);
        if (f12 <= 0.0f) {
            return;
        }
        if (i10 == this.e[0]) {
            f10 = i10 + f12;
        } else {
            f10 = i10 - f12;
        }
        if (i11 == this.f2870f[0]) {
            f11 = i11 + f12;
        } else {
            f11 = i11 - f12;
        }
        RectF rectF = this.E;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
        canvas.drawArc(rectF, f7, 90.0f, false, this.f2874w);
    }

    public final int j() {
        for (int i10 = 0; i10 < this.f2867a.f3439c; i10++) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i10 = 0; i10 < this.f2867a.f3438b; i10++) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean l() {
        w6 w6Var = this.f2867a;
        if (w6Var != null && this.h != null) {
            ArrayList arrayList = w6Var.f3441g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((LinkedHashSet) ((a1.c) this.h).f35b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final c6 m(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof c6) {
                c6 c6Var = (c6) childAt;
                if (c6Var.f2906b == pagetablecell) {
                    return c6Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i10) {
        if (i10 < 0 || i10 >= this.f2867a.f3439c) {
            return false;
        }
        for (int i11 = 0; i11 < this.f2867a.f3438b; i11++) {
            if (!p(i11, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i10) {
        if (i10 < 0 || i10 >= this.f2867a.f3438b) {
            return false;
        }
        for (int i11 = 0; i11 < this.f2867a.f3439c; i11++) {
            if (!p(i10, i11)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f2867a != null) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt instanceof c6) {
                    c6 c6Var = (c6) childAt;
                    int b10 = this.f2867a.b(c6Var.f2906b);
                    int a2 = this.f2867a.a(c6Var.f2906b);
                    if (b10 >= 0 && a2 >= 0) {
                        int i15 = this.e[a2];
                        int i16 = this.f2870f[b10];
                        c6Var.layout(i15, i16, c6Var.getMeasuredWidth() + i15, c6Var.getMeasuredHeight() + i16);
                    }
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int max;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int round;
        int i18;
        int i19;
        int a2;
        float f7 = 20.0f;
        int L = org.telegram.messenger.i0.L(20.0f);
        int L2 = org.telegram.messenger.i0.L(4.0f);
        int L3 = org.telegram.messenger.i0.L(4.0f);
        int L4 = org.telegram.messenger.i0.L(10.0f);
        w6 w6Var = this.f2867a;
        int i20 = 0;
        if (w6Var != null && w6Var.f3438b != 0 && w6Var.f3439c != 0) {
            int size = (View.MeasureSpec.getSize(i10) - L) - L3;
            w6 w6Var2 = this.f2867a;
            int i21 = w6Var2.f3438b;
            int i22 = w6Var2.f3439c;
            this.f2869c = new int[i22];
            this.d = new int[i21];
            if (!w6Var2.f3437a.compact) {
                f7 = 50.0f;
            }
            int L5 = org.telegram.messenger.i0.L(f7);
            if (this.f2867a.f3437a.compact) {
                i12 = 5;
            } else {
                i12 = 12;
            }
            if (i22 == 2) {
                max = i0.a.d(i12 * 4, size / 2, 0);
            } else {
                max = Math.max(0, Math.round(size / 1.5f));
            }
            float f10 = i12 * 2;
            int b10 = org.telegram.messenger.m5.b(f10, max, L5);
            for (int i23 = 0; i23 < i22; i23++) {
                this.f2869c[i23] = L5;
            }
            int i24 = 0;
            while (true) {
                i13 = 1;
                if (i24 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i24);
                if (childAt instanceof c6) {
                    c6 c6Var = (c6) childAt;
                    n1 n1Var = c6Var.f2905a;
                    if (w6.n(c6Var.f2906b) == 1 && (a2 = this.f2867a.a(c6Var.f2906b)) >= 0 && a2 < i22) {
                        int L6 = org.telegram.messenger.i0.L(f10) + Math.round(Layout.getDesiredWidth(n1Var.getText(), n1Var.getPaint()));
                        int[] iArr = this.f2869c;
                        iArr[a2] = Math.max(iArr[a2], Math.min(b10, L6));
                    }
                }
                i24++;
            }
            int i25 = 0;
            while (i25 < getChildCount()) {
                View childAt2 = getChildAt(i25);
                if (childAt2 instanceof c6) {
                    c6 c6Var2 = (c6) childAt2;
                    n1 n1Var2 = c6Var2.f2905a;
                    int n10 = w6.n(c6Var2.f2906b);
                    if (n10 > i13) {
                        i18 = i13;
                        int a10 = this.f2867a.a(c6Var2.f2906b);
                        int min = Math.min(i22, n10 + a10);
                        if (a10 >= 0 && a10 < min) {
                            int i26 = i20;
                            for (int i27 = a10; i27 < min; i27++) {
                                i26 += this.f2869c[i27];
                            }
                            int min2 = Math.min((min - a10) * b10, org.telegram.messenger.i0.L(f10) + Math.round(Layout.getDesiredWidth(n1Var2.getText(), n1Var2.getPaint()))) - i26;
                            while (a10 < min && min2 > 0) {
                                int i28 = ((min2 + i19) - 1) / (min - a10);
                                int[] iArr2 = this.f2869c;
                                iArr2[a10] = iArr2[a10] + i28;
                                min2 -= i28;
                                a10++;
                            }
                        }
                        i25++;
                        i13 = i18;
                        i20 = 0;
                    }
                }
                i18 = i13;
                i25++;
                i13 = i18;
                i20 = 0;
            }
            int i29 = i13;
            int i30 = 0;
            for (int i31 : this.f2869c) {
                i30 += i31;
            }
            if (i30 < size && i22 > 0) {
                int i32 = size - i30;
                for (int i33 = 0; i33 < i22; i33++) {
                    if (i33 == i22 - 1) {
                        round = i32;
                    } else {
                        round = Math.round((this.f2869c[i33] * i32) / i30);
                    }
                    int[] iArr3 = this.f2869c;
                    int i34 = iArr3[i33] + round;
                    iArr3[i33] = i34;
                    i32 -= round;
                    i30 -= i34 - round;
                }
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int i35 = 0;
            while (i35 < getChildCount()) {
                View childAt3 = getChildAt(i35);
                if (!(childAt3 instanceof c6)) {
                    i17 = i35;
                } else {
                    c6 c6Var3 = (c6) childAt3;
                    int b11 = this.f2867a.b(c6Var3.f2906b);
                    int a11 = this.f2867a.a(c6Var3.f2906b);
                    int n11 = w6.n(c6Var3.f2906b);
                    i17 = i35;
                    int i36 = 0;
                    for (int i37 = a11; i37 < a11 + n11 && i37 < i22; i37++) {
                        i36 += this.f2869c[i37];
                    }
                    c6Var3.measure(View.MeasureSpec.makeMeasureSpec(i36, 1073741824), makeMeasureSpec);
                    if (w6.o(c6Var3.f2906b) == i29) {
                        int measuredHeight = c6Var3.getMeasuredHeight();
                        int[] iArr4 = this.d;
                        if (measuredHeight > iArr4[b11]) {
                            iArr4[b11] = c6Var3.getMeasuredHeight();
                        }
                    }
                }
                i35 = i17 + 1;
                i29 = 1;
            }
            for (int i38 = 0; i38 < getChildCount(); i38++) {
                View childAt4 = getChildAt(i38);
                if (childAt4 instanceof c6) {
                    c6 c6Var4 = (c6) childAt4;
                    int b12 = this.f2867a.b(c6Var4.f2906b);
                    int o10 = w6.o(c6Var4.f2906b);
                    if (o10 > 1) {
                        int i39 = b12;
                        int i40 = 0;
                        while (true) {
                            i15 = b12 + o10;
                            if (i39 >= i15 || i39 >= i21) {
                                break;
                            }
                            i40 += this.d[i39];
                            i39++;
                        }
                        int measuredHeight2 = c6Var4.getMeasuredHeight();
                        if (measuredHeight2 > i40) {
                            int i41 = measuredHeight2 - i40;
                            int max2 = i41 / Math.max(o10, 1);
                            int max3 = i41 % Math.max(o10, 1);
                            while (b12 < i15 && b12 < i21) {
                                int[] iArr5 = this.d;
                                int i42 = iArr5[b12];
                                if (max3 > 0) {
                                    i16 = 1;
                                } else {
                                    i16 = 0;
                                }
                                iArr5[b12] = max2 + i16 + i42;
                                if (max3 > 0) {
                                    max3--;
                                }
                                b12++;
                            }
                        }
                    }
                }
            }
            int i43 = 0;
            while (i43 < getChildCount()) {
                View childAt5 = getChildAt(i43);
                if (!(childAt5 instanceof c6)) {
                    i14 = i43;
                } else {
                    c6 c6Var5 = (c6) childAt5;
                    int b13 = this.f2867a.b(c6Var5.f2906b);
                    int a12 = this.f2867a.a(c6Var5.f2906b);
                    int n12 = w6.n(c6Var5.f2906b);
                    int o11 = w6.o(c6Var5.f2906b);
                    i14 = i43;
                    int i44 = 0;
                    for (int i45 = a12; i45 < a12 + n12 && i45 < i22; i45++) {
                        i44 += this.f2869c[i45];
                    }
                    int i46 = 0;
                    for (int i47 = b13; i47 < b13 + o11 && i47 < i21; i47++) {
                        i46 += this.d[i47];
                    }
                    c6Var5.measure(View.MeasureSpec.makeMeasureSpec(i44, 1073741824), View.MeasureSpec.makeMeasureSpec(i46, 1073741824));
                }
                i43 = i14 + 1;
            }
            int[] iArr6 = new int[i22 + 1];
            this.e = iArr6;
            iArr6[0] = L;
            int i48 = 0;
            while (i48 < i22) {
                int[] iArr7 = this.e;
                int i49 = i48 + 1;
                iArr7[i49] = iArr7[i48] + this.f2869c[i48];
                i48 = i49;
            }
            int[] iArr8 = new int[i21 + 1];
            this.f2870f = iArr8;
            iArr8[0] = L2;
            int i50 = 0;
            while (i50 < i21) {
                int[] iArr9 = this.f2870f;
                int i51 = i50 + 1;
                iArr9[i51] = iArr9[i50] + this.d[i50];
                i50 = i51;
            }
            setMeasuredDimension(Math.max(this.e[i22] + L3, size + L + L3), this.f2870f[i21] + L4);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), L2 + L4);
        this.f2869c = new int[0];
        this.d = new int[0];
        this.e = new int[0];
        this.f2870f = new int[0];
    }

    public final boolean p(int i10, int i11) {
        a6 a6Var;
        w6 w6Var = this.f2867a;
        if (w6Var == null || (a6Var = this.h) == null || i10 < 0 || i10 >= w6Var.f3438b || i11 < 0 || i11 >= w6Var.f3439c) {
            return false;
        }
        return ((LinkedHashSet) ((a1.c) a6Var).f35b).contains(w6Var.d[i10][i11]);
    }

    public final int q() {
        for (int i10 = this.f2867a.f3439c - 1; i10 >= 0; i10--) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i10 = this.f2867a.f3438b - 1; i10 >= 0; i10--) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof c6) {
                removeViewAt(childCount);
            }
        }
        w6 w6Var = this.f2867a;
        if (w6Var != null) {
            int size = w6Var.f3441g.size();
            for (int i10 = 0; i10 < size; i10++) {
                c6 c6Var = new c6(getContext(), this.f2868b);
                c6Var.setCompact(this.f2867a.f3437a.compact);
                c6Var.b((TL_iv.pageTableCell) this.f2867a.f3441g.get(i10));
                addView(c6Var);
            }
        }
    }

    public void setModel(w6 w6Var) {
        this.f2867a = w6Var;
        s();
    }

    public void setSelectionProvider(a6 a6Var) {
        this.h = a6Var;
        invalidate();
    }

    public final boolean t(int i10) {
        if (i10 >= 0 && i10 < this.f2867a.f3438b) {
            for (int i11 = 0; i11 < this.f2867a.f3439c; i11++) {
                if (p(i10, i11)) {
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
