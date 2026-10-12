package ji;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.es;
public final class w5 extends ViewGroup {
    public final RectF E;
    public final Path F;
    public final org.telegram.ui.Components.g6 G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public m6 f13593a;
    public final org.telegram.ui.ActionBar.c6 f13594b;
    public int[] f13595c;
    public int[] d;
    public int[] e;
    public int[] f13596f;
    public v5 h;
    public final Paint f13597n;
    public final Paint f13598r;
    public final Paint f13599s;
    public final Paint v;
    public final Paint f13600w;
    public final Paint f13601x;
    public final RectF f13602y;

    public w5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f13595c = new int[0];
        this.d = new int[0];
        this.e = new int[0];
        this.f13596f = new int[0];
        Paint paint = new Paint(1);
        this.f13597n = paint;
        this.f13598r = new Paint(1);
        this.f13599s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.f13600w = new Paint(1);
        this.f13601x = new Paint(1);
        this.f13602y = new RectF();
        this.E = new RectF();
        this.F = new Path();
        this.f13594b = c6Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.G = new org.telegram.ui.Components.g6(this, 0L, 220L, es.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        ViewParent parent;
        TL_iv.pageTableCell pagetablecell;
        m6 m6Var = this.f13593a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (m6Var != null && m6Var.f13413b != 0 && m6Var.f13414c != 0) {
            View findFocus = findFocus();
            if (findFocus == null) {
                parent = null;
            } else {
                parent = findFocus.getParent();
            }
            while (parent != null && parent != this) {
                if (parent instanceof x5) {
                    pagetablecell = ((x5) parent).f13659b;
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
            ArrayList arrayList = this.f13593a.f13416g;
            int size = arrayList.size();
            int i10 = Integer.MAX_VALUE;
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((m5) this.h).f13411b).contains(pagetablecell3)) {
                    int b10 = this.f13593a.b(pagetablecell3);
                    int a2 = this.f13593a.a(pagetablecell3);
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
        int i10 = org.telegram.ui.ActionBar.g6.f20149qh;
        org.telegram.ui.ActionBar.c6 c6Var = this.f13594b;
        this.f13597n.setColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.M6, c6Var);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        this.f13598r.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20130ph, c6Var));
        this.f13599s.setColor(Color.argb(20, red, green, blue));
        this.H = 255;
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        this.v.setColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f13600w;
        paint.setStyle(style);
        this.O = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E6, c6Var);
        this.P = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sh, c6Var);
        paint.setColor(this.O);
        Paint paint2 = this.f13601x;
        paint2.setStyle(style);
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
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
        throw new UnsupportedOperationException("Method not decompiled: ji.w5.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean e(int i10) {
        if (i10 >= 0 && i10 < this.f13593a.f13414c) {
            for (int i11 = 0; i11 < this.f13593a.f13413b; i11++) {
                if (p(i11, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i10, int i11) {
        int i12;
        m6 m6Var = this.f13593a;
        int i13 = m6Var.f13414c;
        int i14 = m6Var.f13413b;
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
        int[] iArr2 = this.f13596f;
        if (i11 != iArr2[0]) {
            if (i11 == iArr2[i14]) {
                i15 = i14 - 1;
            }
            return 0.0f;
        }
        if (i12 >= 0 && i15 >= 0 && p(i15, i12)) {
            return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.f13595c[i12], this.d[i15]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i10, int i11) {
        float dpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i11;
        float f7 = this.f13596f[this.f13593a.f13413b];
        float dp = AndroidUtilities.dp(16.0f) + f7;
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f10 = f(i10, this.f13596f[this.f13593a.f13413b]);
        float f11 = f(i11, this.f13596f[this.f13593a.f13413b]);
        Path path = this.F;
        path.rewind();
        path.moveTo(dpf2, f7 - f10);
        path.lineTo(dpf2, dp - min);
        float f12 = min * 2.0f;
        float f13 = dp - f12;
        RectF rectF = this.E;
        rectF.set(dpf2, f13, dpf2 + f12, dp);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(dpf22 - min, dp);
        rectF.set(dpf22 - f12, f13, dpf22, dp);
        path.arcTo(rectF, 90.0f, -90.0f);
        path.lineTo(dpf22, f7 - f11);
        if (f11 > 0.0f) {
            float f14 = f11 * 2.0f;
            rectF.set(dpf22 - f14, f7 - f14, dpf22, f7);
            path.arcTo(rectF, 0.0f, 90.0f);
        } else {
            path.lineTo(dpf22, f7);
        }
        path.lineTo(dpf2 + f10, f7);
        if (f10 > 0.0f) {
            float f15 = f10 * 2.0f;
            rectF.set(dpf2, f7 - f15, f15 + dpf2, f7);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(dpf2, f7);
        }
        path.close();
        canvas.drawPath(path, this.f13601x);
    }

    public m6 getModel() {
        return this.f13593a;
    }

    public final void h(Canvas canvas, int i10, int i11) {
        float dpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i11;
        float dp = this.e[0] - AndroidUtilities.dp(16.0f);
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f7 = f(this.e[0], i10);
        float f10 = f(this.e[0], i11);
        Path path = this.F;
        path.rewind();
        path.moveTo(this.e[0] + f7, dpf2);
        path.lineTo(dp + min, dpf2);
        float f11 = min * 2.0f;
        float f12 = dp + f11;
        RectF rectF = this.E;
        rectF.set(dp, dpf2, f12, dpf2 + f11);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(dp, dpf22 - min);
        rectF.set(dp, dpf22 - f11, f12, dpf22);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.e[0] + f10, dpf22);
        if (f10 > 0.0f) {
            int i12 = this.e[0];
            float f13 = f10 * 2.0f;
            rectF.set(i12, dpf22 - f13, i12 + f13, dpf22);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], dpf22);
        }
        path.lineTo(this.e[0], dpf2 + f7);
        if (f7 > 0.0f) {
            int i13 = this.e[0];
            float f14 = f7 * 2.0f;
            rectF.set(i13, dpf2, i13 + f14, f14 + dpf2);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], dpf2);
        }
        path.close();
        canvas.drawPath(path, this.f13601x);
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
        if (i11 == this.f13596f[0]) {
            f11 = i11 + f12;
        } else {
            f11 = i11 - f12;
        }
        RectF rectF = this.E;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
        canvas.drawArc(rectF, f7, 90.0f, false, this.v);
    }

    public final int j() {
        for (int i10 = 0; i10 < this.f13593a.f13414c; i10++) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i10 = 0; i10 < this.f13593a.f13413b; i10++) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean l() {
        m6 m6Var = this.f13593a;
        if (m6Var != null && this.h != null) {
            ArrayList arrayList = m6Var.f13416g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((LinkedHashSet) ((m5) this.h).f13411b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final x5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof x5) {
                x5 x5Var = (x5) childAt;
                if (x5Var.f13659b == pagetablecell) {
                    return x5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i10) {
        if (i10 < 0 || i10 >= this.f13593a.f13414c) {
            return false;
        }
        for (int i11 = 0; i11 < this.f13593a.f13413b; i11++) {
            if (!p(i11, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i10) {
        if (i10 < 0 || i10 >= this.f13593a.f13413b) {
            return false;
        }
        for (int i11 = 0; i11 < this.f13593a.f13414c; i11++) {
            if (!p(i10, i11)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f13593a != null) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt instanceof x5) {
                    x5 x5Var = (x5) childAt;
                    int b10 = this.f13593a.b(x5Var.f13659b);
                    int a2 = this.f13593a.a(x5Var.f13659b);
                    if (b10 >= 0 && a2 >= 0) {
                        int i15 = this.e[a2];
                        int i16 = this.f13596f[b10];
                        x5Var.layout(i15, i16, x5Var.getMeasuredWidth() + i15, x5Var.getMeasuredHeight() + i16);
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
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int dp3 = AndroidUtilities.dp(4.0f);
        int dp4 = AndroidUtilities.dp(10.0f);
        m6 m6Var = this.f13593a;
        int i20 = 0;
        if (m6Var != null && m6Var.f13413b != 0 && m6Var.f13414c != 0) {
            int size = (View.MeasureSpec.getSize(i10) - dp) - dp3;
            m6 m6Var2 = this.f13593a;
            int i21 = m6Var2.f13413b;
            int i22 = m6Var2.f13414c;
            this.f13595c = new int[i22];
            this.d = new int[i21];
            if (!m6Var2.f13412a.compact) {
                f7 = 50.0f;
            }
            int dp5 = AndroidUtilities.dp(f7);
            if (this.f13593a.f13412a.compact) {
                i12 = 5;
            } else {
                i12 = 12;
            }
            if (i22 == 2) {
                max = org.telegram.messenger.q.c(i12 * 4, size / 2, 0);
            } else {
                max = Math.max(0, Math.round(size / 1.5f));
            }
            float f10 = i12 * 2;
            int z10 = org.telegram.messenger.q.z(f10, max, dp5);
            for (int i23 = 0; i23 < i22; i23++) {
                this.f13595c[i23] = dp5;
            }
            int i24 = 0;
            while (true) {
                i13 = 1;
                if (i24 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i24);
                if (childAt instanceof x5) {
                    x5 x5Var = (x5) childAt;
                    h1 h1Var = x5Var.f13658a;
                    if (m6.n(x5Var.f13659b) == 1 && (a2 = this.f13593a.a(x5Var.f13659b)) >= 0 && a2 < i22) {
                        int dp6 = AndroidUtilities.dp(f10) + Math.round(Layout.getDesiredWidth(h1Var.getText(), h1Var.getPaint()));
                        int[] iArr = this.f13595c;
                        iArr[a2] = Math.max(iArr[a2], Math.min(z10, dp6));
                    }
                }
                i24++;
            }
            int i25 = 0;
            while (i25 < getChildCount()) {
                View childAt2 = getChildAt(i25);
                if (childAt2 instanceof x5) {
                    x5 x5Var2 = (x5) childAt2;
                    h1 h1Var2 = x5Var2.f13658a;
                    int n10 = m6.n(x5Var2.f13659b);
                    if (n10 > i13) {
                        i18 = i13;
                        int a10 = this.f13593a.a(x5Var2.f13659b);
                        int min = Math.min(i22, n10 + a10);
                        if (a10 >= 0 && a10 < min) {
                            int i26 = i20;
                            for (int i27 = a10; i27 < min; i27++) {
                                i26 += this.f13595c[i27];
                            }
                            int min2 = Math.min((min - a10) * z10, AndroidUtilities.dp(f10) + Math.round(Layout.getDesiredWidth(h1Var2.getText(), h1Var2.getPaint()))) - i26;
                            while (a10 < min && min2 > 0) {
                                int i28 = ((min2 + i19) - 1) / (min - a10);
                                int[] iArr2 = this.f13595c;
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
            for (int i31 : this.f13595c) {
                i30 += i31;
            }
            if (i30 < size && i22 > 0) {
                int i32 = size - i30;
                for (int i33 = 0; i33 < i22; i33++) {
                    if (i33 == i22 - 1) {
                        round = i32;
                    } else {
                        round = Math.round((this.f13595c[i33] * i32) / i30);
                    }
                    int[] iArr3 = this.f13595c;
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
                if (!(childAt3 instanceof x5)) {
                    i17 = i35;
                } else {
                    x5 x5Var3 = (x5) childAt3;
                    int b10 = this.f13593a.b(x5Var3.f13659b);
                    int a11 = this.f13593a.a(x5Var3.f13659b);
                    int n11 = m6.n(x5Var3.f13659b);
                    i17 = i35;
                    int i36 = 0;
                    for (int i37 = a11; i37 < a11 + n11 && i37 < i22; i37++) {
                        i36 += this.f13595c[i37];
                    }
                    x5Var3.measure(View.MeasureSpec.makeMeasureSpec(i36, 1073741824), makeMeasureSpec);
                    if (m6.o(x5Var3.f13659b) == i29) {
                        int measuredHeight = x5Var3.getMeasuredHeight();
                        int[] iArr4 = this.d;
                        if (measuredHeight > iArr4[b10]) {
                            iArr4[b10] = x5Var3.getMeasuredHeight();
                        }
                    }
                }
                i35 = i17 + 1;
                i29 = 1;
            }
            for (int i38 = 0; i38 < getChildCount(); i38++) {
                View childAt4 = getChildAt(i38);
                if (childAt4 instanceof x5) {
                    x5 x5Var4 = (x5) childAt4;
                    int b11 = this.f13593a.b(x5Var4.f13659b);
                    int o10 = m6.o(x5Var4.f13659b);
                    if (o10 > 1) {
                        int i39 = b11;
                        int i40 = 0;
                        while (true) {
                            i15 = b11 + o10;
                            if (i39 >= i15 || i39 >= i21) {
                                break;
                            }
                            i40 += this.d[i39];
                            i39++;
                        }
                        int measuredHeight2 = x5Var4.getMeasuredHeight();
                        if (measuredHeight2 > i40) {
                            int i41 = measuredHeight2 - i40;
                            int max2 = i41 / Math.max(o10, 1);
                            int max3 = i41 % Math.max(o10, 1);
                            while (b11 < i15 && b11 < i21) {
                                int[] iArr5 = this.d;
                                int i42 = iArr5[b11];
                                if (max3 > 0) {
                                    i16 = 1;
                                } else {
                                    i16 = 0;
                                }
                                iArr5[b11] = max2 + i16 + i42;
                                if (max3 > 0) {
                                    max3--;
                                }
                                b11++;
                            }
                        }
                    }
                }
            }
            int i43 = 0;
            while (i43 < getChildCount()) {
                View childAt5 = getChildAt(i43);
                if (!(childAt5 instanceof x5)) {
                    i14 = i43;
                } else {
                    x5 x5Var5 = (x5) childAt5;
                    int b12 = this.f13593a.b(x5Var5.f13659b);
                    int a12 = this.f13593a.a(x5Var5.f13659b);
                    int n12 = m6.n(x5Var5.f13659b);
                    int o11 = m6.o(x5Var5.f13659b);
                    i14 = i43;
                    int i44 = 0;
                    for (int i45 = a12; i45 < a12 + n12 && i45 < i22; i45++) {
                        i44 += this.f13595c[i45];
                    }
                    int i46 = 0;
                    for (int i47 = b12; i47 < b12 + o11 && i47 < i21; i47++) {
                        i46 += this.d[i47];
                    }
                    x5Var5.measure(View.MeasureSpec.makeMeasureSpec(i44, 1073741824), View.MeasureSpec.makeMeasureSpec(i46, 1073741824));
                }
                i43 = i14 + 1;
            }
            int[] iArr6 = new int[i22 + 1];
            this.e = iArr6;
            iArr6[0] = dp;
            int i48 = 0;
            while (i48 < i22) {
                int[] iArr7 = this.e;
                int i49 = i48 + 1;
                iArr7[i49] = iArr7[i48] + this.f13595c[i48];
                i48 = i49;
            }
            int[] iArr8 = new int[i21 + 1];
            this.f13596f = iArr8;
            iArr8[0] = dp2;
            int i50 = 0;
            while (i50 < i21) {
                int[] iArr9 = this.f13596f;
                int i51 = i50 + 1;
                iArr9[i51] = iArr9[i50] + this.d[i50];
                i50 = i51;
            }
            setMeasuredDimension(Math.max(this.e[i22] + dp3, size + dp + dp3), this.f13596f[i21] + dp4);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), dp2 + dp4);
        this.f13595c = new int[0];
        this.d = new int[0];
        this.e = new int[0];
        this.f13596f = new int[0];
    }

    public final boolean p(int i10, int i11) {
        v5 v5Var;
        m6 m6Var = this.f13593a;
        if (m6Var == null || (v5Var = this.h) == null || i10 < 0 || i10 >= m6Var.f13413b || i11 < 0 || i11 >= m6Var.f13414c) {
            return false;
        }
        return ((LinkedHashSet) ((m5) v5Var).f13411b).contains(m6Var.d[i10][i11]);
    }

    public final int q() {
        for (int i10 = this.f13593a.f13414c - 1; i10 >= 0; i10--) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i10 = this.f13593a.f13413b - 1; i10 >= 0; i10--) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof x5) {
                removeViewAt(childCount);
            }
        }
        m6 m6Var = this.f13593a;
        if (m6Var != null) {
            int size = m6Var.f13416g.size();
            for (int i10 = 0; i10 < size; i10++) {
                x5 x5Var = new x5(getContext(), this.f13594b);
                x5Var.setCompact(this.f13593a.f13412a.compact);
                x5Var.b((TL_iv.pageTableCell) this.f13593a.f13416g.get(i10));
                addView(x5Var);
            }
        }
    }

    public void setModel(m6 m6Var) {
        this.f13593a = m6Var;
        s();
    }

    public void setSelectionProvider(v5 v5Var) {
        this.h = v5Var;
        invalidate();
    }

    public final boolean t(int i10) {
        if (i10 >= 0 && i10 < this.f13593a.f13413b) {
            for (int i11 = 0; i11 < this.f13593a.f13414c; i11++) {
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
