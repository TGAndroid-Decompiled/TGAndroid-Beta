package mi;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
public final class p5 extends ViewGroup {
    public final RectF E;
    public final RectF F;
    public final Path G;
    public final org.telegram.ui.Components.u5 H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public f6 f19812a;
    public final org.telegram.ui.ActionBar.e6 f19813b;
    public int[] f19814c;
    public int[] d;
    public int[] f19815e;
    public int[] f19816f;
    public o5 h;
    public final Paint f19817n;
    public final Paint f19818r;
    public final Paint f19819s;
    public final Paint f19820w;
    public final Paint f19821x;
    public final Paint f19822y;

    public p5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f19814c = new int[0];
        this.d = new int[0];
        this.f19815e = new int[0];
        this.f19816f = new int[0];
        Paint paint = new Paint(1);
        this.f19817n = paint;
        this.f19818r = new Paint(1);
        this.f19819s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f19820w = paint2;
        this.f19821x = new Paint(1);
        this.f19822y = new Paint(1);
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Path();
        this.f19813b = e6Var;
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
        this.H = new org.telegram.ui.Components.u5(this, 0L, 220L, xq.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        ViewParent parent;
        TL_iv.pageTableCell pagetablecell;
        f6 f6Var = this.f19812a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (f6Var != null && f6Var.f19609b != 0 && f6Var.f19610c != 0) {
            View findFocus = findFocus();
            if (findFocus == null) {
                parent = null;
            } else {
                parent = findFocus.getParent();
            }
            while (parent != null && parent != this) {
                if (parent instanceof q5) {
                    pagetablecell = ((q5) parent).f19843b;
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
            ArrayList arrayList = this.f19812a.f19613g;
            int size = arrayList.size();
            int i3 = Integer.MAX_VALUE;
            int i10 = 0;
            int i11 = Integer.MAX_VALUE;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((l5.b) this.h).f18041b).contains(pagetablecell3)) {
                    int b10 = this.f19812a.b(pagetablecell3);
                    int a10 = this.f19812a.a(pagetablecell3);
                    if (b10 < i3 || (b10 == i3 && a10 < i11)) {
                        pagetablecell2 = pagetablecell3;
                        i3 = b10;
                        i11 = a10;
                    }
                }
            }
        }
        return pagetablecell2;
    }

    public final void b() {
        int i3 = k6.f27909ei;
        org.telegram.ui.ActionBar.e6 e6Var = this.f19813b;
        this.f19817n.setColor(k6.w0(i3, e6Var));
        int w02 = k6.w0(k6.M6, e6Var);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        this.f19818r.setColor(k6.w0(k6.f27890di, e6Var));
        this.f19819s.setColor(Color.argb(20, red, green, blue));
        this.I = 255;
        int i10 = k6.Ci;
        this.f19820w.setColor(k6.w0(i10, e6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f19821x;
        paint.setStyle(style);
        this.P = k6.w0(k6.E6, e6Var);
        this.Q = k6.w0(k6.Gi, e6Var);
        paint.setColor(this.P);
        Paint paint2 = this.f19822y;
        paint2.setStyle(style);
        paint2.setColor(k6.w0(i10, e6Var));
        invalidate();
    }

    public final boolean c(int i3, int i10) {
        if (i3 < 0 || i10 < i3) {
            return false;
        }
        while (i3 <= i10) {
            if (!n(i3)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    public final boolean d(int i3, int i10) {
        if (i3 < 0 || i10 < i3) {
            return false;
        }
        while (i3 <= i10) {
            if (!o(i3)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: mi.p5.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean e(int i3) {
        if (i3 >= 0 && i3 < this.f19812a.f19610c) {
            for (int i10 = 0; i10 < this.f19812a.f19609b; i10++) {
                if (p(i10, i3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i3, int i10) {
        int i11;
        f6 f6Var = this.f19812a;
        int i12 = f6Var.f19610c;
        int i13 = f6Var.f19609b;
        int[] iArr = this.f19815e;
        int i14 = 0;
        if (i3 == iArr[0]) {
            i11 = 0;
        } else {
            if (i3 == iArr[i12]) {
                i11 = i12 - 1;
            }
            return 0.0f;
        }
        int[] iArr2 = this.f19816f;
        if (i10 != iArr2[0]) {
            if (i10 == iArr2[i13]) {
                i14 = i13 - 1;
            }
            return 0.0f;
        }
        if (i11 >= 0 && i14 >= 0 && p(i14, i11)) {
            return Math.min(org.telegram.messenger.g0.N(10.0f), Math.min(this.f19814c[i11], this.d[i14]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i3, int i10) {
        float N = i3 - org.telegram.messenger.g0.N(1.0f);
        float N2 = org.telegram.messenger.g0.N(1.0f) + i10;
        float f10 = this.f19816f[this.f19812a.f19609b];
        float L = org.telegram.messenger.g0.L(16.0f) + f10;
        float min = Math.min(org.telegram.messenger.g0.N(10.0f), (N2 - N) / 2.0f);
        float f11 = f(i3, this.f19816f[this.f19812a.f19609b]);
        float f12 = f(i10, this.f19816f[this.f19812a.f19609b]);
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
        canvas.drawPath(path, this.f19822y);
    }

    public f6 getModel() {
        return this.f19812a;
    }

    public final void h(Canvas canvas, int i3, int i10) {
        float N = i3 - org.telegram.messenger.g0.N(1.0f);
        float N2 = org.telegram.messenger.g0.N(1.0f) + i10;
        float L = this.f19815e[0] - org.telegram.messenger.g0.L(16.0f);
        float min = Math.min(org.telegram.messenger.g0.N(10.0f), (N2 - N) / 2.0f);
        float f10 = f(this.f19815e[0], i3);
        float f11 = f(this.f19815e[0], i10);
        Path path = this.G;
        path.rewind();
        path.moveTo(this.f19815e[0] + f10, N);
        path.lineTo(L + min, N);
        float f12 = min * 2.0f;
        float f13 = L + f12;
        RectF rectF = this.F;
        rectF.set(L, N, f13, N + f12);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(L, N2 - min);
        rectF.set(L, N2 - f12, f13, N2);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.f19815e[0] + f11, N2);
        if (f11 > 0.0f) {
            int i11 = this.f19815e[0];
            float f14 = f11 * 2.0f;
            rectF.set(i11, N2 - f14, i11 + f14, N2);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.f19815e[0], N2);
        }
        path.lineTo(this.f19815e[0], N + f10);
        if (f10 > 0.0f) {
            int i12 = this.f19815e[0];
            float f15 = f10 * 2.0f;
            rectF.set(i12, N, i12 + f15, f15 + N);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.f19815e[0], N);
        }
        path.close();
        canvas.drawPath(path, this.f19822y);
    }

    public final void i(float f10, int i3, int i10, Canvas canvas) {
        float f11;
        float f12;
        float f13 = f(i3, i10);
        if (f13 <= 0.0f) {
            return;
        }
        if (i3 == this.f19815e[0]) {
            f11 = i3 + f13;
        } else {
            f11 = i3 - f13;
        }
        if (i10 == this.f19816f[0]) {
            f12 = i10 + f13;
        } else {
            f12 = i10 - f13;
        }
        RectF rectF = this.F;
        rectF.set(f11 - f13, f12 - f13, f11 + f13, f12 + f13);
        canvas.drawArc(rectF, f10, 90.0f, false, this.f19820w);
    }

    public final int j() {
        for (int i3 = 0; i3 < this.f19812a.f19610c; i3++) {
            if (e(i3)) {
                return i3;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i3 = 0; i3 < this.f19812a.f19609b; i3++) {
            if (t(i3)) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean l() {
        f6 f6Var = this.f19812a;
        if (f6Var != null && this.h != null) {
            ArrayList arrayList = f6Var.f19613g;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (((LinkedHashSet) ((l5.b) this.h).f18041b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final q5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof q5) {
                q5 q5Var = (q5) childAt;
                if (q5Var.f19843b == pagetablecell) {
                    return q5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i3) {
        if (i3 < 0 || i3 >= this.f19812a.f19610c) {
            return false;
        }
        for (int i10 = 0; i10 < this.f19812a.f19609b; i10++) {
            if (!p(i10, i3)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i3) {
        if (i3 < 0 || i3 >= this.f19812a.f19609b) {
            return false;
        }
        for (int i10 = 0; i10 < this.f19812a.f19610c; i10++) {
            if (!p(i3, i10)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        if (this.f19812a != null) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt instanceof q5) {
                    q5 q5Var = (q5) childAt;
                    int b10 = this.f19812a.b(q5Var.f19843b);
                    int a10 = this.f19812a.a(q5Var.f19843b);
                    if (b10 >= 0 && a10 >= 0) {
                        int i14 = this.f19815e[a10];
                        int i15 = this.f19816f[b10];
                        q5Var.layout(i14, i15, q5Var.getMeasuredWidth() + i14, q5Var.getMeasuredHeight() + i15);
                    }
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int max;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int round;
        int i17;
        int i18;
        int a10;
        float f10 = 20.0f;
        int L = org.telegram.messenger.g0.L(20.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int L3 = org.telegram.messenger.g0.L(4.0f);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        f6 f6Var = this.f19812a;
        int i19 = 0;
        if (f6Var != null && f6Var.f19609b != 0 && f6Var.f19610c != 0) {
            int size = (View.MeasureSpec.getSize(i3) - L) - L3;
            f6 f6Var2 = this.f19812a;
            int i20 = f6Var2.f19609b;
            int i21 = f6Var2.f19610c;
            this.f19814c = new int[i21];
            this.d = new int[i20];
            if (!f6Var2.f19608a.compact) {
                f10 = 50.0f;
            }
            int L5 = org.telegram.messenger.g0.L(f10);
            if (this.f19812a.f19608a.compact) {
                i11 = 5;
            } else {
                i11 = 12;
            }
            if (i21 == 2) {
                max = k2.p1.d(i11 * 4, size / 2, 0);
            } else {
                max = Math.max(0, Math.round(size / 1.5f));
            }
            float f11 = i11 * 2;
            int b10 = org.telegram.messenger.k5.b(f11, max, L5);
            for (int i22 = 0; i22 < i21; i22++) {
                this.f19814c[i22] = L5;
            }
            int i23 = 0;
            while (true) {
                i12 = 1;
                if (i23 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i23);
                if (childAt instanceof q5) {
                    q5 q5Var = (q5) childAt;
                    h1 h1Var = q5Var.f19842a;
                    if (f6.n(q5Var.f19843b) == 1 && (a10 = this.f19812a.a(q5Var.f19843b)) >= 0 && a10 < i21) {
                        int L6 = org.telegram.messenger.g0.L(f11) + Math.round(Layout.getDesiredWidth(h1Var.getText(), h1Var.getPaint()));
                        int[] iArr = this.f19814c;
                        iArr[a10] = Math.max(iArr[a10], Math.min(b10, L6));
                    }
                }
                i23++;
            }
            int i24 = 0;
            while (i24 < getChildCount()) {
                View childAt2 = getChildAt(i24);
                if (childAt2 instanceof q5) {
                    q5 q5Var2 = (q5) childAt2;
                    h1 h1Var2 = q5Var2.f19842a;
                    int n4 = f6.n(q5Var2.f19843b);
                    if (n4 > i12) {
                        i17 = i12;
                        int a11 = this.f19812a.a(q5Var2.f19843b);
                        int min = Math.min(i21, n4 + a11);
                        if (a11 >= 0 && a11 < min) {
                            int i25 = i19;
                            for (int i26 = a11; i26 < min; i26++) {
                                i25 += this.f19814c[i26];
                            }
                            int min2 = Math.min((min - a11) * b10, org.telegram.messenger.g0.L(f11) + Math.round(Layout.getDesiredWidth(h1Var2.getText(), h1Var2.getPaint()))) - i25;
                            while (a11 < min && min2 > 0) {
                                int i27 = ((min2 + i18) - 1) / (min - a11);
                                int[] iArr2 = this.f19814c;
                                iArr2[a11] = iArr2[a11] + i27;
                                min2 -= i27;
                                a11++;
                            }
                        }
                        i24++;
                        i12 = i17;
                        i19 = 0;
                    }
                }
                i17 = i12;
                i24++;
                i12 = i17;
                i19 = 0;
            }
            int i28 = i12;
            int i29 = 0;
            for (int i30 : this.f19814c) {
                i29 += i30;
            }
            if (i29 < size && i21 > 0) {
                int i31 = size - i29;
                for (int i32 = 0; i32 < i21; i32++) {
                    if (i32 == i21 - 1) {
                        round = i31;
                    } else {
                        round = Math.round((this.f19814c[i32] * i31) / i29);
                    }
                    int[] iArr3 = this.f19814c;
                    int i33 = iArr3[i32] + round;
                    iArr3[i32] = i33;
                    i31 -= round;
                    i29 -= i33 - round;
                }
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int i34 = 0;
            while (i34 < getChildCount()) {
                View childAt3 = getChildAt(i34);
                if (!(childAt3 instanceof q5)) {
                    i16 = i34;
                } else {
                    q5 q5Var3 = (q5) childAt3;
                    int b11 = this.f19812a.b(q5Var3.f19843b);
                    int a12 = this.f19812a.a(q5Var3.f19843b);
                    int n10 = f6.n(q5Var3.f19843b);
                    i16 = i34;
                    int i35 = 0;
                    for (int i36 = a12; i36 < a12 + n10 && i36 < i21; i36++) {
                        i35 += this.f19814c[i36];
                    }
                    q5Var3.measure(View.MeasureSpec.makeMeasureSpec(i35, 1073741824), makeMeasureSpec);
                    if (f6.o(q5Var3.f19843b) == i28) {
                        int measuredHeight = q5Var3.getMeasuredHeight();
                        int[] iArr4 = this.d;
                        if (measuredHeight > iArr4[b11]) {
                            iArr4[b11] = q5Var3.getMeasuredHeight();
                        }
                    }
                }
                i34 = i16 + 1;
                i28 = 1;
            }
            for (int i37 = 0; i37 < getChildCount(); i37++) {
                View childAt4 = getChildAt(i37);
                if (childAt4 instanceof q5) {
                    q5 q5Var4 = (q5) childAt4;
                    int b12 = this.f19812a.b(q5Var4.f19843b);
                    int o10 = f6.o(q5Var4.f19843b);
                    if (o10 > 1) {
                        int i38 = b12;
                        int i39 = 0;
                        while (true) {
                            i14 = b12 + o10;
                            if (i38 >= i14 || i38 >= i20) {
                                break;
                            }
                            i39 += this.d[i38];
                            i38++;
                        }
                        int measuredHeight2 = q5Var4.getMeasuredHeight();
                        if (measuredHeight2 > i39) {
                            int i40 = measuredHeight2 - i39;
                            int max2 = i40 / Math.max(o10, 1);
                            int max3 = i40 % Math.max(o10, 1);
                            while (b12 < i14 && b12 < i20) {
                                int[] iArr5 = this.d;
                                int i41 = iArr5[b12];
                                if (max3 > 0) {
                                    i15 = 1;
                                } else {
                                    i15 = 0;
                                }
                                iArr5[b12] = max2 + i15 + i41;
                                if (max3 > 0) {
                                    max3--;
                                }
                                b12++;
                            }
                        }
                    }
                }
            }
            int i42 = 0;
            while (i42 < getChildCount()) {
                View childAt5 = getChildAt(i42);
                if (!(childAt5 instanceof q5)) {
                    i13 = i42;
                } else {
                    q5 q5Var5 = (q5) childAt5;
                    int b13 = this.f19812a.b(q5Var5.f19843b);
                    int a13 = this.f19812a.a(q5Var5.f19843b);
                    int n11 = f6.n(q5Var5.f19843b);
                    int o11 = f6.o(q5Var5.f19843b);
                    i13 = i42;
                    int i43 = 0;
                    for (int i44 = a13; i44 < a13 + n11 && i44 < i21; i44++) {
                        i43 += this.f19814c[i44];
                    }
                    int i45 = 0;
                    for (int i46 = b13; i46 < b13 + o11 && i46 < i20; i46++) {
                        i45 += this.d[i46];
                    }
                    q5Var5.measure(View.MeasureSpec.makeMeasureSpec(i43, 1073741824), View.MeasureSpec.makeMeasureSpec(i45, 1073741824));
                }
                i42 = i13 + 1;
            }
            int[] iArr6 = new int[i21 + 1];
            this.f19815e = iArr6;
            iArr6[0] = L;
            int i47 = 0;
            while (i47 < i21) {
                int[] iArr7 = this.f19815e;
                int i48 = i47 + 1;
                iArr7[i48] = iArr7[i47] + this.f19814c[i47];
                i47 = i48;
            }
            int[] iArr8 = new int[i20 + 1];
            this.f19816f = iArr8;
            iArr8[0] = L2;
            int i49 = 0;
            while (i49 < i20) {
                int[] iArr9 = this.f19816f;
                int i50 = i49 + 1;
                iArr9[i50] = iArr9[i49] + this.d[i49];
                i49 = i50;
            }
            setMeasuredDimension(Math.max(this.f19815e[i21] + L3, size + L + L3), this.f19816f[i20] + L4);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i3), L2 + L4);
        this.f19814c = new int[0];
        this.d = new int[0];
        this.f19815e = new int[0];
        this.f19816f = new int[0];
    }

    public final boolean p(int i3, int i10) {
        o5 o5Var;
        f6 f6Var = this.f19812a;
        if (f6Var == null || (o5Var = this.h) == null || i3 < 0 || i3 >= f6Var.f19609b || i10 < 0 || i10 >= f6Var.f19610c) {
            return false;
        }
        return ((LinkedHashSet) ((l5.b) o5Var).f18041b).contains(f6Var.d[i3][i10]);
    }

    public final int q() {
        for (int i3 = this.f19812a.f19610c - 1; i3 >= 0; i3--) {
            if (e(i3)) {
                return i3;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i3 = this.f19812a.f19609b - 1; i3 >= 0; i3--) {
            if (t(i3)) {
                return i3;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof q5) {
                removeViewAt(childCount);
            }
        }
        f6 f6Var = this.f19812a;
        if (f6Var != null) {
            int size = f6Var.f19613g.size();
            for (int i3 = 0; i3 < size; i3++) {
                q5 q5Var = new q5(getContext(), this.f19813b);
                q5Var.setCompact(this.f19812a.f19608a.compact);
                q5Var.b((TL_iv.pageTableCell) this.f19812a.f19613g.get(i3));
                addView(q5Var);
            }
        }
    }

    public void setModel(f6 f6Var) {
        this.f19812a = f6Var;
        s();
    }

    public void setSelectionProvider(o5 o5Var) {
        this.h = o5Var;
        invalidate();
    }

    public final boolean t(int i3) {
        if (i3 >= 0 && i3 < this.f19812a.f19609b) {
            for (int i10 = 0; i10 < this.f19812a.f19610c; i10++) {
                if (p(i3, i10)) {
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
        boolean c2 = c(j(), q());
        if (d && !c2) {
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
