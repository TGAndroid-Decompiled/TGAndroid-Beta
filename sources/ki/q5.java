package ki;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
public final class q5 extends ViewGroup {
    public final RectF E;
    public final Path F;
    public final org.telegram.ui.Components.f6 G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public g6 f15466a;
    public final org.telegram.ui.ActionBar.d6 f15467b;
    public int[] f15468c;
    public int[] d;
    public int[] e;
    public int[] f15469f;
    public p5 h;
    public final Paint f15470n;
    public final Paint f15471r;
    public final Paint f15472s;
    public final Paint v;
    public final Paint f15473w;
    public final Paint f15474x;
    public final RectF f15475y;

    public q5(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f15468c = new int[0];
        this.d = new int[0];
        this.e = new int[0];
        this.f15469f = new int[0];
        Paint paint = new Paint(1);
        this.f15470n = paint;
        this.f15471r = new Paint(1);
        this.f15472s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.f15473w = new Paint(1);
        this.f15474x = new Paint(1);
        this.f15475y = new RectF();
        this.E = new RectF();
        this.F = new Path();
        this.f15467b = d6Var;
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
        this.G = new org.telegram.ui.Components.f6(this, 0L, 220L, bs.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        ViewParent parent;
        TL_iv.pageTableCell pagetablecell;
        g6 g6Var = this.f15466a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (g6Var != null && g6Var.f15289b != 0 && g6Var.f15290c != 0) {
            View findFocus = findFocus();
            if (findFocus == null) {
                parent = null;
            } else {
                parent = findFocus.getParent();
            }
            while (parent != null && parent != this) {
                if (parent instanceof r5) {
                    pagetablecell = ((r5) parent).f15492b;
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
            ArrayList arrayList = this.f15466a.f15292g;
            int size = arrayList.size();
            int i10 = Integer.MAX_VALUE;
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((j5.b) this.h).f14255b).contains(pagetablecell3)) {
                    int b10 = this.f15466a.b(pagetablecell3);
                    int a2 = this.f15466a.a(pagetablecell3);
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
        int i10 = h6.f21238qh;
        org.telegram.ui.ActionBar.d6 d6Var = this.f15467b;
        this.f15470n.setColor(h6.w0(i10, d6Var));
        int w02 = h6.w0(h6.M6, d6Var);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        this.f15471r.setColor(h6.w0(h6.f21219ph, d6Var));
        this.f15472s.setColor(Color.argb(20, red, green, blue));
        this.H = 255;
        int i11 = h6.Oh;
        this.v.setColor(h6.w0(i11, d6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f15473w;
        paint.setStyle(style);
        this.O = h6.w0(h6.E6, d6Var);
        this.P = h6.w0(h6.Sh, d6Var);
        paint.setColor(this.O);
        Paint paint2 = this.f15474x;
        paint2.setStyle(style);
        paint2.setColor(h6.w0(i11, d6Var));
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
        throw new UnsupportedOperationException("Method not decompiled: ki.q5.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean e(int i10) {
        if (i10 >= 0 && i10 < this.f15466a.f15290c) {
            for (int i11 = 0; i11 < this.f15466a.f15289b; i11++) {
                if (p(i11, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i10, int i11) {
        int i12;
        g6 g6Var = this.f15466a;
        int i13 = g6Var.f15290c;
        int i14 = g6Var.f15289b;
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
        int[] iArr2 = this.f15469f;
        if (i11 != iArr2[0]) {
            if (i11 == iArr2[i14]) {
                i15 = i14 - 1;
            }
            return 0.0f;
        }
        if (i12 >= 0 && i15 >= 0 && p(i15, i12)) {
            return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.f15468c[i12], this.d[i15]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i10, int i11) {
        float dpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i11;
        float f7 = this.f15469f[this.f15466a.f15289b];
        float dp = AndroidUtilities.dp(16.0f) + f7;
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f10 = f(i10, this.f15469f[this.f15466a.f15289b]);
        float f11 = f(i11, this.f15469f[this.f15466a.f15289b]);
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
        canvas.drawPath(path, this.f15474x);
    }

    public g6 getModel() {
        return this.f15466a;
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
        canvas.drawPath(path, this.f15474x);
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
        if (i11 == this.f15469f[0]) {
            f11 = i11 + f12;
        } else {
            f11 = i11 - f12;
        }
        RectF rectF = this.E;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
        canvas.drawArc(rectF, f7, 90.0f, false, this.v);
    }

    public final int j() {
        for (int i10 = 0; i10 < this.f15466a.f15290c; i10++) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i10 = 0; i10 < this.f15466a.f15289b; i10++) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean l() {
        g6 g6Var = this.f15466a;
        if (g6Var != null && this.h != null) {
            ArrayList arrayList = g6Var.f15292g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((LinkedHashSet) ((j5.b) this.h).f14255b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final r5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof r5) {
                r5 r5Var = (r5) childAt;
                if (r5Var.f15492b == pagetablecell) {
                    return r5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i10) {
        if (i10 < 0 || i10 >= this.f15466a.f15290c) {
            return false;
        }
        for (int i11 = 0; i11 < this.f15466a.f15289b; i11++) {
            if (!p(i11, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i10) {
        if (i10 < 0 || i10 >= this.f15466a.f15289b) {
            return false;
        }
        for (int i11 = 0; i11 < this.f15466a.f15290c; i11++) {
            if (!p(i10, i11)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f15466a != null) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt instanceof r5) {
                    r5 r5Var = (r5) childAt;
                    int b10 = this.f15466a.b(r5Var.f15492b);
                    int a2 = this.f15466a.a(r5Var.f15492b);
                    if (b10 >= 0 && a2 >= 0) {
                        int i15 = this.e[a2];
                        int i16 = this.f15469f[b10];
                        r5Var.layout(i15, i16, r5Var.getMeasuredWidth() + i15, r5Var.getMeasuredHeight() + i16);
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
        g6 g6Var = this.f15466a;
        int i20 = 0;
        if (g6Var != null && g6Var.f15289b != 0 && g6Var.f15290c != 0) {
            int size = (View.MeasureSpec.getSize(i10) - dp) - dp3;
            g6 g6Var2 = this.f15466a;
            int i21 = g6Var2.f15289b;
            int i22 = g6Var2.f15290c;
            this.f15468c = new int[i22];
            this.d = new int[i21];
            if (!g6Var2.f15288a.compact) {
                f7 = 50.0f;
            }
            int dp5 = AndroidUtilities.dp(f7);
            if (this.f15466a.f15288a.compact) {
                i12 = 5;
            } else {
                i12 = 12;
            }
            if (i22 == 2) {
                max = org.telegram.messenger.g0.b(i12 * 4, size / 2, 0);
            } else {
                max = Math.max(0, Math.round(size / 1.5f));
            }
            float f10 = i12 * 2;
            int y3 = org.telegram.messenger.g0.y(f10, max, dp5);
            for (int i23 = 0; i23 < i22; i23++) {
                this.f15468c[i23] = dp5;
            }
            int i24 = 0;
            while (true) {
                i13 = 1;
                if (i24 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i24);
                if (childAt instanceof r5) {
                    r5 r5Var = (r5) childAt;
                    h1 h1Var = r5Var.f15491a;
                    if (g6.n(r5Var.f15492b) == 1 && (a2 = this.f15466a.a(r5Var.f15492b)) >= 0 && a2 < i22) {
                        int dp6 = AndroidUtilities.dp(f10) + Math.round(Layout.getDesiredWidth(h1Var.getText(), h1Var.getPaint()));
                        int[] iArr = this.f15468c;
                        iArr[a2] = Math.max(iArr[a2], Math.min(y3, dp6));
                    }
                }
                i24++;
            }
            int i25 = 0;
            while (i25 < getChildCount()) {
                View childAt2 = getChildAt(i25);
                if (childAt2 instanceof r5) {
                    r5 r5Var2 = (r5) childAt2;
                    h1 h1Var2 = r5Var2.f15491a;
                    int n10 = g6.n(r5Var2.f15492b);
                    if (n10 > i13) {
                        i18 = i13;
                        int a10 = this.f15466a.a(r5Var2.f15492b);
                        int min = Math.min(i22, n10 + a10);
                        if (a10 >= 0 && a10 < min) {
                            int i26 = i20;
                            for (int i27 = a10; i27 < min; i27++) {
                                i26 += this.f15468c[i27];
                            }
                            int min2 = Math.min((min - a10) * y3, AndroidUtilities.dp(f10) + Math.round(Layout.getDesiredWidth(h1Var2.getText(), h1Var2.getPaint()))) - i26;
                            while (a10 < min && min2 > 0) {
                                int i28 = ((min2 + i19) - 1) / (min - a10);
                                int[] iArr2 = this.f15468c;
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
            for (int i31 : this.f15468c) {
                i30 += i31;
            }
            if (i30 < size && i22 > 0) {
                int i32 = size - i30;
                for (int i33 = 0; i33 < i22; i33++) {
                    if (i33 == i22 - 1) {
                        round = i32;
                    } else {
                        round = Math.round((this.f15468c[i33] * i32) / i30);
                    }
                    int[] iArr3 = this.f15468c;
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
                if (!(childAt3 instanceof r5)) {
                    i17 = i35;
                } else {
                    r5 r5Var3 = (r5) childAt3;
                    int b10 = this.f15466a.b(r5Var3.f15492b);
                    int a11 = this.f15466a.a(r5Var3.f15492b);
                    int n11 = g6.n(r5Var3.f15492b);
                    i17 = i35;
                    int i36 = 0;
                    for (int i37 = a11; i37 < a11 + n11 && i37 < i22; i37++) {
                        i36 += this.f15468c[i37];
                    }
                    r5Var3.measure(View.MeasureSpec.makeMeasureSpec(i36, 1073741824), makeMeasureSpec);
                    if (g6.o(r5Var3.f15492b) == i29) {
                        int measuredHeight = r5Var3.getMeasuredHeight();
                        int[] iArr4 = this.d;
                        if (measuredHeight > iArr4[b10]) {
                            iArr4[b10] = r5Var3.getMeasuredHeight();
                        }
                    }
                }
                i35 = i17 + 1;
                i29 = 1;
            }
            for (int i38 = 0; i38 < getChildCount(); i38++) {
                View childAt4 = getChildAt(i38);
                if (childAt4 instanceof r5) {
                    r5 r5Var4 = (r5) childAt4;
                    int b11 = this.f15466a.b(r5Var4.f15492b);
                    int o10 = g6.o(r5Var4.f15492b);
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
                        int measuredHeight2 = r5Var4.getMeasuredHeight();
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
                if (!(childAt5 instanceof r5)) {
                    i14 = i43;
                } else {
                    r5 r5Var5 = (r5) childAt5;
                    int b12 = this.f15466a.b(r5Var5.f15492b);
                    int a12 = this.f15466a.a(r5Var5.f15492b);
                    int n12 = g6.n(r5Var5.f15492b);
                    int o11 = g6.o(r5Var5.f15492b);
                    i14 = i43;
                    int i44 = 0;
                    for (int i45 = a12; i45 < a12 + n12 && i45 < i22; i45++) {
                        i44 += this.f15468c[i45];
                    }
                    int i46 = 0;
                    for (int i47 = b12; i47 < b12 + o11 && i47 < i21; i47++) {
                        i46 += this.d[i47];
                    }
                    r5Var5.measure(View.MeasureSpec.makeMeasureSpec(i44, 1073741824), View.MeasureSpec.makeMeasureSpec(i46, 1073741824));
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
                iArr7[i49] = iArr7[i48] + this.f15468c[i48];
                i48 = i49;
            }
            int[] iArr8 = new int[i21 + 1];
            this.f15469f = iArr8;
            iArr8[0] = dp2;
            int i50 = 0;
            while (i50 < i21) {
                int[] iArr9 = this.f15469f;
                int i51 = i50 + 1;
                iArr9[i51] = iArr9[i50] + this.d[i50];
                i50 = i51;
            }
            setMeasuredDimension(Math.max(this.e[i22] + dp3, size + dp + dp3), this.f15469f[i21] + dp4);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), dp2 + dp4);
        this.f15468c = new int[0];
        this.d = new int[0];
        this.e = new int[0];
        this.f15469f = new int[0];
    }

    public final boolean p(int i10, int i11) {
        p5 p5Var;
        g6 g6Var = this.f15466a;
        if (g6Var == null || (p5Var = this.h) == null || i10 < 0 || i10 >= g6Var.f15289b || i11 < 0 || i11 >= g6Var.f15290c) {
            return false;
        }
        return ((LinkedHashSet) ((j5.b) p5Var).f14255b).contains(g6Var.d[i10][i11]);
    }

    public final int q() {
        for (int i10 = this.f15466a.f15290c - 1; i10 >= 0; i10--) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i10 = this.f15466a.f15289b - 1; i10 >= 0; i10--) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof r5) {
                removeViewAt(childCount);
            }
        }
        g6 g6Var = this.f15466a;
        if (g6Var != null) {
            int size = g6Var.f15292g.size();
            for (int i10 = 0; i10 < size; i10++) {
                r5 r5Var = new r5(getContext(), this.f15467b);
                r5Var.setCompact(this.f15466a.f15288a.compact);
                r5Var.b((TL_iv.pageTableCell) this.f15466a.f15292g.get(i10));
                addView(r5Var);
            }
        }
    }

    public void setModel(g6 g6Var) {
        this.f15466a = g6Var;
        s();
    }

    public void setSelectionProvider(p5 p5Var) {
        this.h = p5Var;
        invalidate();
    }

    public final boolean t(int i10) {
        if (i10 >= 0 && i10 < this.f15466a.f15289b) {
            for (int i11 = 0; i11 < this.f15466a.f15290c; i11++) {
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
