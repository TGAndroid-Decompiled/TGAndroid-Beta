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
import org.telegram.ui.Components.pr;
public final class u5 extends ViewGroup {
    public final RectF E;
    public final Path F;
    public final org.telegram.ui.Components.e6 G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public k6 f14222a;
    public final org.telegram.ui.ActionBar.f6 f14223b;
    public int[] f14224c;
    public int[] d;
    public int[] f14225e;
    public int[] f14226f;
    public t5 h;
    public final Paint f14227n;
    public final Paint f14228r;
    public final Paint f14229s;
    public final Paint v;
    public final Paint f14230w;
    public final Paint f14231x;
    public final RectF f14232y;

    public u5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f14224c = new int[0];
        this.d = new int[0];
        this.f14225e = new int[0];
        this.f14226f = new int[0];
        Paint paint = new Paint(1);
        this.f14227n = paint;
        this.f14228r = new Paint(1);
        this.f14229s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.f14230w = new Paint(1);
        this.f14231x = new Paint(1);
        this.f14232y = new RectF();
        this.E = new RectF();
        this.F = new Path();
        this.f14223b = f6Var;
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
        this.G = new org.telegram.ui.Components.e6(this, 0L, 220L, pr.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        ViewParent parent;
        TL_iv.pageTableCell pagetablecell;
        k6 k6Var = this.f14222a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (k6Var != null && k6Var.f14024b != 0 && k6Var.f14025c != 0) {
            View findFocus = findFocus();
            if (findFocus == null) {
                parent = null;
            } else {
                parent = findFocus.getParent();
            }
            while (parent != null && parent != this) {
                if (parent instanceof v5) {
                    pagetablecell = ((v5) parent).f14278b;
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
            ArrayList arrayList = this.f14222a.f14028g;
            int size = arrayList.size();
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MAX_VALUE;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((k5) this.h).f14022b).contains(pagetablecell3)) {
                    int b10 = this.f14222a.b(pagetablecell3);
                    int a2 = this.f14222a.a(pagetablecell3);
                    if (b10 < i10 || (b10 == i10 && a2 < i11)) {
                        pagetablecell2 = pagetablecell3;
                        i10 = b10;
                        i11 = a2;
                    }
                }
            }
        }
        return pagetablecell2;
    }

    public final void b() {
        int i10 = org.telegram.ui.ActionBar.j6.f20908qh;
        org.telegram.ui.ActionBar.f6 f6Var = this.f14223b;
        this.f14227n.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.M6, f6Var);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.f14228r.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20890ph, f6Var));
        this.f14229s.setColor(Color.argb(20, red, green, blue));
        this.H = 255;
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        this.v.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f14230w;
        paint.setStyle(style);
        this.O = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E6, f6Var);
        this.P = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var);
        paint.setColor(this.O);
        Paint paint2 = this.f14231x;
        paint2.setStyle(style);
        paint2.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
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
        throw new UnsupportedOperationException("Method not decompiled: ji.u5.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean e(int i10) {
        if (i10 >= 0 && i10 < this.f14222a.f14025c) {
            for (int i11 = 0; i11 < this.f14222a.f14024b; i11++) {
                if (p(i11, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i10, int i11) {
        int i12;
        k6 k6Var = this.f14222a;
        int i13 = k6Var.f14025c;
        int i14 = k6Var.f14024b;
        int[] iArr = this.f14225e;
        int i15 = 0;
        if (i10 == iArr[0]) {
            i12 = 0;
        } else {
            if (i10 == iArr[i13]) {
                i12 = i13 - 1;
            }
            return 0.0f;
        }
        int[] iArr2 = this.f14226f;
        if (i11 != iArr2[0]) {
            if (i11 == iArr2[i14]) {
                i15 = i14 - 1;
            }
            return 0.0f;
        }
        if (i12 >= 0 && i15 >= 0 && p(i15, i12)) {
            return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.f14224c[i12], this.d[i15]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i10, int i11) {
        float dpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i11;
        float f7 = this.f14226f[this.f14222a.f14024b];
        float dp = AndroidUtilities.dp(16.0f) + f7;
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f10 = f(i10, this.f14226f[this.f14222a.f14024b]);
        float f11 = f(i11, this.f14226f[this.f14222a.f14024b]);
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
        canvas.drawPath(path, this.f14231x);
    }

    public k6 getModel() {
        return this.f14222a;
    }

    public final void h(Canvas canvas, int i10, int i11) {
        float dpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i11;
        float dp = this.f14225e[0] - AndroidUtilities.dp(16.0f);
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f7 = f(this.f14225e[0], i10);
        float f10 = f(this.f14225e[0], i11);
        Path path = this.F;
        path.rewind();
        path.moveTo(this.f14225e[0] + f7, dpf2);
        path.lineTo(dp + min, dpf2);
        float f11 = min * 2.0f;
        float f12 = dp + f11;
        RectF rectF = this.E;
        rectF.set(dp, dpf2, f12, dpf2 + f11);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(dp, dpf22 - min);
        rectF.set(dp, dpf22 - f11, f12, dpf22);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.f14225e[0] + f10, dpf22);
        if (f10 > 0.0f) {
            int i12 = this.f14225e[0];
            float f13 = f10 * 2.0f;
            rectF.set(i12, dpf22 - f13, i12 + f13, dpf22);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.f14225e[0], dpf22);
        }
        path.lineTo(this.f14225e[0], dpf2 + f7);
        if (f7 > 0.0f) {
            int i13 = this.f14225e[0];
            float f14 = f7 * 2.0f;
            rectF.set(i13, dpf2, i13 + f14, f14 + dpf2);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.f14225e[0], dpf2);
        }
        path.close();
        canvas.drawPath(path, this.f14231x);
    }

    public final void i(float f7, int i10, int i11, Canvas canvas) {
        float f10;
        float f11;
        float f12 = f(i10, i11);
        if (f12 <= 0.0f) {
            return;
        }
        if (i10 == this.f14225e[0]) {
            f10 = i10 + f12;
        } else {
            f10 = i10 - f12;
        }
        if (i11 == this.f14226f[0]) {
            f11 = i11 + f12;
        } else {
            f11 = i11 - f12;
        }
        RectF rectF = this.E;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
        canvas.drawArc(rectF, f7, 90.0f, false, this.v);
    }

    public final int j() {
        for (int i10 = 0; i10 < this.f14222a.f14025c; i10++) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i10 = 0; i10 < this.f14222a.f14024b; i10++) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean l() {
        k6 k6Var = this.f14222a;
        if (k6Var != null && this.h != null) {
            ArrayList arrayList = k6Var.f14028g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((LinkedHashSet) ((k5) this.h).f14022b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final v5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v5) {
                v5 v5Var = (v5) childAt;
                if (v5Var.f14278b == pagetablecell) {
                    return v5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i10) {
        if (i10 < 0 || i10 >= this.f14222a.f14025c) {
            return false;
        }
        for (int i11 = 0; i11 < this.f14222a.f14024b; i11++) {
            if (!p(i11, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i10) {
        if (i10 < 0 || i10 >= this.f14222a.f14024b) {
            return false;
        }
        for (int i11 = 0; i11 < this.f14222a.f14025c; i11++) {
            if (!p(i10, i11)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f14222a != null) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt instanceof v5) {
                    v5 v5Var = (v5) childAt;
                    int b10 = this.f14222a.b(v5Var.f14278b);
                    int a2 = this.f14222a.a(v5Var.f14278b);
                    if (b10 >= 0 && a2 >= 0) {
                        int i15 = this.f14225e[a2];
                        int i16 = this.f14226f[b10];
                        v5Var.layout(i15, i16, v5Var.getMeasuredWidth() + i15, v5Var.getMeasuredHeight() + i16);
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
        int a2;
        float f7 = 20.0f;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int dp3 = AndroidUtilities.dp(4.0f);
        int dp4 = AndroidUtilities.dp(10.0f);
        k6 k6Var = this.f14222a;
        if (k6Var != null && k6Var.f14024b != 0 && k6Var.f14025c != 0) {
            int size = (View.MeasureSpec.getSize(i10) - dp) - dp3;
            k6 k6Var2 = this.f14222a;
            int i19 = k6Var2.f14024b;
            int i20 = k6Var2.f14025c;
            this.f14224c = new int[i20];
            this.d = new int[i19];
            if (!k6Var2.f14023a.compact) {
                f7 = 50.0f;
            }
            int dp5 = AndroidUtilities.dp(f7);
            if (this.f14222a.f14023a.compact) {
                i12 = 5;
            } else {
                i12 = 12;
            }
            if (i20 == 2) {
                max = i2.g.f(i12 * 4, size / 2, 0);
            } else {
                max = Math.max(0, Math.round(size / 1.5f));
            }
            float f10 = i12 * 2;
            int b10 = org.telegram.messenger.w1.b(f10, max, dp5);
            for (int i21 = 0; i21 < i20; i21++) {
                this.f14224c[i21] = dp5;
            }
            int i22 = 0;
            while (true) {
                i13 = 1;
                if (i22 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i22);
                if (childAt instanceof v5) {
                    v5 v5Var = (v5) childAt;
                    h1 h1Var = v5Var.f14277a;
                    if (k6.n(v5Var.f14278b) == 1 && (a2 = this.f14222a.a(v5Var.f14278b)) >= 0 && a2 < i20) {
                        int dp6 = AndroidUtilities.dp(f10) + Math.round(Layout.getDesiredWidth(h1Var.getText(), h1Var.getPaint()));
                        int[] iArr = this.f14224c;
                        iArr[a2] = Math.max(iArr[a2], Math.min(b10, dp6));
                    }
                }
                i22++;
            }
            int i23 = 0;
            while (i23 < getChildCount()) {
                View childAt2 = getChildAt(i23);
                if (childAt2 instanceof v5) {
                    v5 v5Var2 = (v5) childAt2;
                    h1 h1Var2 = v5Var2.f14277a;
                    int n10 = k6.n(v5Var2.f14278b);
                    if (n10 > i13) {
                        int a10 = this.f14222a.a(v5Var2.f14278b);
                        int min = Math.min(i20, n10 + a10);
                        if (a10 >= 0 && a10 < min) {
                            int i24 = 0;
                            for (int i25 = a10; i25 < min; i25++) {
                                i24 += this.f14224c[i25];
                            }
                            int min2 = Math.min((min - a10) * b10, AndroidUtilities.dp(f10) + Math.round(Layout.getDesiredWidth(h1Var2.getText(), h1Var2.getPaint()))) - i24;
                            while (a10 < min && min2 > 0) {
                                int i26 = ((min2 + i18) - 1) / (min - a10);
                                int[] iArr2 = this.f14224c;
                                iArr2[a10] = iArr2[a10] + i26;
                                min2 -= i26;
                                a10++;
                            }
                        }
                        i23++;
                        i13 = 1;
                    }
                }
                i23++;
                i13 = 1;
            }
            int i27 = 0;
            for (int i28 : this.f14224c) {
                i27 += i28;
            }
            if (i27 < size && i20 > 0) {
                int i29 = size - i27;
                for (int i30 = 0; i30 < i20; i30++) {
                    if (i30 == i20 - 1) {
                        round = i29;
                    } else {
                        round = Math.round((this.f14224c[i30] * i29) / i27);
                    }
                    int[] iArr3 = this.f14224c;
                    int i31 = iArr3[i30] + round;
                    iArr3[i30] = i31;
                    i29 -= round;
                    i27 -= i31 - round;
                }
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int i32 = 0;
            while (i32 < getChildCount()) {
                View childAt3 = getChildAt(i32);
                if (!(childAt3 instanceof v5)) {
                    i17 = i32;
                } else {
                    v5 v5Var3 = (v5) childAt3;
                    int b11 = this.f14222a.b(v5Var3.f14278b);
                    int a11 = this.f14222a.a(v5Var3.f14278b);
                    int n11 = k6.n(v5Var3.f14278b);
                    i17 = i32;
                    int i33 = 0;
                    for (int i34 = a11; i34 < a11 + n11 && i34 < i20; i34++) {
                        i33 += this.f14224c[i34];
                    }
                    v5Var3.measure(View.MeasureSpec.makeMeasureSpec(i33, 1073741824), makeMeasureSpec);
                    if (k6.o(v5Var3.f14278b) == 1) {
                        int measuredHeight = v5Var3.getMeasuredHeight();
                        int[] iArr4 = this.d;
                        if (measuredHeight > iArr4[b11]) {
                            iArr4[b11] = v5Var3.getMeasuredHeight();
                        }
                    }
                }
                i32 = i17 + 1;
            }
            for (int i35 = 0; i35 < getChildCount(); i35++) {
                View childAt4 = getChildAt(i35);
                if (childAt4 instanceof v5) {
                    v5 v5Var4 = (v5) childAt4;
                    int b12 = this.f14222a.b(v5Var4.f14278b);
                    int o9 = k6.o(v5Var4.f14278b);
                    if (o9 > 1) {
                        int i36 = b12;
                        int i37 = 0;
                        while (true) {
                            i15 = b12 + o9;
                            if (i36 >= i15 || i36 >= i19) {
                                break;
                            }
                            i37 += this.d[i36];
                            i36++;
                        }
                        int measuredHeight2 = v5Var4.getMeasuredHeight();
                        if (measuredHeight2 > i37) {
                            int i38 = measuredHeight2 - i37;
                            int max2 = i38 / Math.max(o9, 1);
                            int max3 = i38 % Math.max(o9, 1);
                            while (b12 < i15 && b12 < i19) {
                                int[] iArr5 = this.d;
                                int i39 = iArr5[b12];
                                if (max3 > 0) {
                                    i16 = 1;
                                } else {
                                    i16 = 0;
                                }
                                iArr5[b12] = max2 + i16 + i39;
                                if (max3 > 0) {
                                    max3--;
                                }
                                b12++;
                            }
                        }
                    }
                }
            }
            int i40 = 0;
            while (i40 < getChildCount()) {
                View childAt5 = getChildAt(i40);
                if (!(childAt5 instanceof v5)) {
                    i14 = i40;
                } else {
                    v5 v5Var5 = (v5) childAt5;
                    int b13 = this.f14222a.b(v5Var5.f14278b);
                    int a12 = this.f14222a.a(v5Var5.f14278b);
                    int n12 = k6.n(v5Var5.f14278b);
                    int o10 = k6.o(v5Var5.f14278b);
                    i14 = i40;
                    int i41 = 0;
                    for (int i42 = a12; i42 < a12 + n12 && i42 < i20; i42++) {
                        i41 += this.f14224c[i42];
                    }
                    int i43 = 0;
                    for (int i44 = b13; i44 < b13 + o10 && i44 < i19; i44++) {
                        i43 += this.d[i44];
                    }
                    v5Var5.measure(View.MeasureSpec.makeMeasureSpec(i41, 1073741824), View.MeasureSpec.makeMeasureSpec(i43, 1073741824));
                }
                i40 = i14 + 1;
            }
            int[] iArr6 = new int[i20 + 1];
            this.f14225e = iArr6;
            iArr6[0] = dp;
            int i45 = 0;
            while (i45 < i20) {
                int[] iArr7 = this.f14225e;
                int i46 = i45 + 1;
                iArr7[i46] = iArr7[i45] + this.f14224c[i45];
                i45 = i46;
            }
            int[] iArr8 = new int[i19 + 1];
            this.f14226f = iArr8;
            iArr8[0] = dp2;
            int i47 = 0;
            while (i47 < i19) {
                int[] iArr9 = this.f14226f;
                int i48 = i47 + 1;
                iArr9[i48] = iArr9[i47] + this.d[i47];
                i47 = i48;
            }
            setMeasuredDimension(Math.max(this.f14225e[i20] + dp3, size + dp + dp3), this.f14226f[i19] + dp4);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), dp2 + dp4);
        this.f14224c = new int[0];
        this.d = new int[0];
        this.f14225e = new int[0];
        this.f14226f = new int[0];
    }

    public final boolean p(int i10, int i11) {
        t5 t5Var;
        k6 k6Var = this.f14222a;
        if (k6Var == null || (t5Var = this.h) == null || i10 < 0 || i10 >= k6Var.f14024b || i11 < 0 || i11 >= k6Var.f14025c) {
            return false;
        }
        return ((LinkedHashSet) ((k5) t5Var).f14022b).contains(k6Var.d[i10][i11]);
    }

    public final int q() {
        for (int i10 = this.f14222a.f14025c - 1; i10 >= 0; i10--) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i10 = this.f14222a.f14024b - 1; i10 >= 0; i10--) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof v5) {
                removeViewAt(childCount);
            }
        }
        k6 k6Var = this.f14222a;
        if (k6Var != null) {
            int size = k6Var.f14028g.size();
            for (int i10 = 0; i10 < size; i10++) {
                v5 v5Var = new v5(getContext(), this.f14223b);
                v5Var.setCompact(this.f14222a.f14023a.compact);
                v5Var.b((TL_iv.pageTableCell) this.f14222a.f14028g.get(i10));
                addView(v5Var);
            }
        }
    }

    public void setModel(k6 k6Var) {
        this.f14222a = k6Var;
        s();
    }

    public void setSelectionProvider(t5 t5Var) {
        this.h = t5Var;
        invalidate();
    }

    public final boolean t(int i10) {
        if (i10 >= 0 && i10 < this.f14222a.f14024b) {
            for (int i11 = 0; i11 < this.f14222a.f14025c; i11++) {
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
