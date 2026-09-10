package hi;

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
import org.telegram.ui.Components.wr;
public final class t5 extends ViewGroup {
    public final RectF E;
    public final Path F;
    public final org.telegram.ui.Components.d6 G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public l6 f9866a;
    public final org.telegram.ui.ActionBar.f6 f9867b;
    public int[] f9868c;
    public int[] d;
    public int[] e;
    public int[] f9869f;
    public s5 h;
    public final Paint f9870n;
    public final Paint f9871r;
    public final Paint f9872s;
    public final Paint v;
    public final Paint f9873w;
    public final Paint f9874x;
    public final RectF f9875y;

    public t5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f9868c = new int[0];
        this.d = new int[0];
        this.e = new int[0];
        this.f9869f = new int[0];
        Paint paint = new Paint(1);
        this.f9870n = paint;
        this.f9871r = new Paint(1);
        this.f9872s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.f9873w = new Paint(1);
        this.f9874x = new Paint(1);
        this.f9875y = new RectF();
        this.E = new RectF();
        this.F = new Path();
        this.f9867b = f6Var;
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
        this.G = new org.telegram.ui.Components.d6(this, 0L, 220L, wr.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        ViewParent parent;
        TL_iv.pageTableCell pagetablecell;
        l6 l6Var = this.f9866a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (l6Var != null && l6Var.f9730b != 0 && l6Var.f9731c != 0) {
            View findFocus = findFocus();
            if (findFocus == null) {
                parent = null;
            } else {
                parent = findFocus.getParent();
            }
            while (parent != null && parent != this) {
                if (parent instanceof u5) {
                    pagetablecell = ((u5) parent).f9893b;
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
            ArrayList arrayList = this.f9866a.f9733g;
            int size = arrayList.size();
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MAX_VALUE;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((y1) this.h).f9976b).contains(pagetablecell3)) {
                    int b10 = this.f9866a.b(pagetablecell3);
                    int a2 = this.f9866a.a(pagetablecell3);
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
        int i10 = org.telegram.ui.ActionBar.j6.f18172qh;
        org.telegram.ui.ActionBar.f6 f6Var = this.f9867b;
        this.f9870n.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.M6, f6Var);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.f9871r.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18154ph, f6Var));
        this.f9872s.setColor(Color.argb(20, red, green, blue));
        this.H = 255;
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        this.v.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f9873w;
        paint.setStyle(style);
        this.O = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E6, f6Var);
        this.P = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var);
        paint.setColor(this.O);
        Paint paint2 = this.f9874x;
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
        throw new UnsupportedOperationException("Method not decompiled: hi.t5.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean e(int i10) {
        if (i10 >= 0 && i10 < this.f9866a.f9731c) {
            for (int i11 = 0; i11 < this.f9866a.f9730b; i11++) {
                if (p(i11, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i10, int i11) {
        int i12;
        l6 l6Var = this.f9866a;
        int i13 = l6Var.f9731c;
        int i14 = l6Var.f9730b;
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
        int[] iArr2 = this.f9869f;
        if (i11 != iArr2[0]) {
            if (i11 == iArr2[i14]) {
                i15 = i14 - 1;
            }
            return 0.0f;
        }
        if (i12 >= 0 && i15 >= 0 && p(i15, i12)) {
            return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.f9868c[i12], this.d[i15]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i10, int i11) {
        float dpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i11;
        float f7 = this.f9869f[this.f9866a.f9730b];
        float dp = AndroidUtilities.dp(16.0f) + f7;
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f10 = f(i10, this.f9869f[this.f9866a.f9730b]);
        float f11 = f(i11, this.f9869f[this.f9866a.f9730b]);
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
        canvas.drawPath(path, this.f9874x);
    }

    public l6 getModel() {
        return this.f9866a;
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
        canvas.drawPath(path, this.f9874x);
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
        if (i11 == this.f9869f[0]) {
            f11 = i11 + f12;
        } else {
            f11 = i11 - f12;
        }
        RectF rectF = this.E;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
        canvas.drawArc(rectF, f7, 90.0f, false, this.v);
    }

    public final int j() {
        for (int i10 = 0; i10 < this.f9866a.f9731c; i10++) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i10 = 0; i10 < this.f9866a.f9730b; i10++) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean l() {
        l6 l6Var = this.f9866a;
        if (l6Var != null && this.h != null) {
            ArrayList arrayList = l6Var.f9733g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((LinkedHashSet) ((y1) this.h).f9976b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final u5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof u5) {
                u5 u5Var = (u5) childAt;
                if (u5Var.f9893b == pagetablecell) {
                    return u5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i10) {
        if (i10 < 0 || i10 >= this.f9866a.f9731c) {
            return false;
        }
        for (int i11 = 0; i11 < this.f9866a.f9730b; i11++) {
            if (!p(i11, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i10) {
        if (i10 < 0 || i10 >= this.f9866a.f9730b) {
            return false;
        }
        for (int i11 = 0; i11 < this.f9866a.f9731c; i11++) {
            if (!p(i10, i11)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f9866a != null) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt instanceof u5) {
                    u5 u5Var = (u5) childAt;
                    int b10 = this.f9866a.b(u5Var.f9893b);
                    int a2 = this.f9866a.a(u5Var.f9893b);
                    if (b10 >= 0 && a2 >= 0) {
                        int i15 = this.e[a2];
                        int i16 = this.f9869f[b10];
                        u5Var.layout(i15, i16, u5Var.getMeasuredWidth() + i15, u5Var.getMeasuredHeight() + i16);
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
        l6 l6Var = this.f9866a;
        if (l6Var != null && l6Var.f9730b != 0 && l6Var.f9731c != 0) {
            int size = (View.MeasureSpec.getSize(i10) - dp) - dp3;
            l6 l6Var2 = this.f9866a;
            int i19 = l6Var2.f9730b;
            int i20 = l6Var2.f9731c;
            this.f9868c = new int[i20];
            this.d = new int[i19];
            if (!l6Var2.f9729a.compact) {
                f7 = 50.0f;
            }
            int dp5 = AndroidUtilities.dp(f7);
            if (this.f9866a.f9729a.compact) {
                i12 = 5;
            } else {
                i12 = 12;
            }
            if (i20 == 2) {
                max = hc.b.g(i12 * 4, size / 2, 0);
            } else {
                max = Math.max(0, Math.round(size / 1.5f));
            }
            float f10 = i12 * 2;
            int b10 = org.telegram.messenger.a2.b(f10, max, dp5);
            for (int i21 = 0; i21 < i20; i21++) {
                this.f9868c[i21] = dp5;
            }
            int i22 = 0;
            while (true) {
                i13 = 1;
                if (i22 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i22);
                if (childAt instanceof u5) {
                    u5 u5Var = (u5) childAt;
                    k1 k1Var = u5Var.f9892a;
                    if (l6.n(u5Var.f9893b) == 1 && (a2 = this.f9866a.a(u5Var.f9893b)) >= 0 && a2 < i20) {
                        int dp6 = AndroidUtilities.dp(f10) + Math.round(Layout.getDesiredWidth(k1Var.getText(), k1Var.getPaint()));
                        int[] iArr = this.f9868c;
                        iArr[a2] = Math.max(iArr[a2], Math.min(b10, dp6));
                    }
                }
                i22++;
            }
            int i23 = 0;
            while (i23 < getChildCount()) {
                View childAt2 = getChildAt(i23);
                if (childAt2 instanceof u5) {
                    u5 u5Var2 = (u5) childAt2;
                    k1 k1Var2 = u5Var2.f9892a;
                    int n10 = l6.n(u5Var2.f9893b);
                    if (n10 > i13) {
                        int a10 = this.f9866a.a(u5Var2.f9893b);
                        int min = Math.min(i20, n10 + a10);
                        if (a10 >= 0 && a10 < min) {
                            int i24 = 0;
                            for (int i25 = a10; i25 < min; i25++) {
                                i24 += this.f9868c[i25];
                            }
                            int min2 = Math.min((min - a10) * b10, AndroidUtilities.dp(f10) + Math.round(Layout.getDesiredWidth(k1Var2.getText(), k1Var2.getPaint()))) - i24;
                            while (a10 < min && min2 > 0) {
                                int i26 = ((min2 + i18) - 1) / (min - a10);
                                int[] iArr2 = this.f9868c;
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
            for (int i28 : this.f9868c) {
                i27 += i28;
            }
            if (i27 < size && i20 > 0) {
                int i29 = size - i27;
                for (int i30 = 0; i30 < i20; i30++) {
                    if (i30 == i20 - 1) {
                        round = i29;
                    } else {
                        round = Math.round((this.f9868c[i30] * i29) / i27);
                    }
                    int[] iArr3 = this.f9868c;
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
                if (!(childAt3 instanceof u5)) {
                    i17 = i32;
                } else {
                    u5 u5Var3 = (u5) childAt3;
                    int b11 = this.f9866a.b(u5Var3.f9893b);
                    int a11 = this.f9866a.a(u5Var3.f9893b);
                    int n11 = l6.n(u5Var3.f9893b);
                    i17 = i32;
                    int i33 = 0;
                    for (int i34 = a11; i34 < a11 + n11 && i34 < i20; i34++) {
                        i33 += this.f9868c[i34];
                    }
                    u5Var3.measure(View.MeasureSpec.makeMeasureSpec(i33, 1073741824), makeMeasureSpec);
                    if (l6.o(u5Var3.f9893b) == 1) {
                        int measuredHeight = u5Var3.getMeasuredHeight();
                        int[] iArr4 = this.d;
                        if (measuredHeight > iArr4[b11]) {
                            iArr4[b11] = u5Var3.getMeasuredHeight();
                        }
                    }
                }
                i32 = i17 + 1;
            }
            for (int i35 = 0; i35 < getChildCount(); i35++) {
                View childAt4 = getChildAt(i35);
                if (childAt4 instanceof u5) {
                    u5 u5Var4 = (u5) childAt4;
                    int b12 = this.f9866a.b(u5Var4.f9893b);
                    int o9 = l6.o(u5Var4.f9893b);
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
                        int measuredHeight2 = u5Var4.getMeasuredHeight();
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
                if (!(childAt5 instanceof u5)) {
                    i14 = i40;
                } else {
                    u5 u5Var5 = (u5) childAt5;
                    int b13 = this.f9866a.b(u5Var5.f9893b);
                    int a12 = this.f9866a.a(u5Var5.f9893b);
                    int n12 = l6.n(u5Var5.f9893b);
                    int o10 = l6.o(u5Var5.f9893b);
                    i14 = i40;
                    int i41 = 0;
                    for (int i42 = a12; i42 < a12 + n12 && i42 < i20; i42++) {
                        i41 += this.f9868c[i42];
                    }
                    int i43 = 0;
                    for (int i44 = b13; i44 < b13 + o10 && i44 < i19; i44++) {
                        i43 += this.d[i44];
                    }
                    u5Var5.measure(View.MeasureSpec.makeMeasureSpec(i41, 1073741824), View.MeasureSpec.makeMeasureSpec(i43, 1073741824));
                }
                i40 = i14 + 1;
            }
            int[] iArr6 = new int[i20 + 1];
            this.e = iArr6;
            iArr6[0] = dp;
            int i45 = 0;
            while (i45 < i20) {
                int[] iArr7 = this.e;
                int i46 = i45 + 1;
                iArr7[i46] = iArr7[i45] + this.f9868c[i45];
                i45 = i46;
            }
            int[] iArr8 = new int[i19 + 1];
            this.f9869f = iArr8;
            iArr8[0] = dp2;
            int i47 = 0;
            while (i47 < i19) {
                int[] iArr9 = this.f9869f;
                int i48 = i47 + 1;
                iArr9[i48] = iArr9[i47] + this.d[i47];
                i47 = i48;
            }
            setMeasuredDimension(Math.max(this.e[i20] + dp3, size + dp + dp3), this.f9869f[i19] + dp4);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), dp2 + dp4);
        this.f9868c = new int[0];
        this.d = new int[0];
        this.e = new int[0];
        this.f9869f = new int[0];
    }

    public final boolean p(int i10, int i11) {
        s5 s5Var;
        l6 l6Var = this.f9866a;
        if (l6Var == null || (s5Var = this.h) == null || i10 < 0 || i10 >= l6Var.f9730b || i11 < 0 || i11 >= l6Var.f9731c) {
            return false;
        }
        return ((LinkedHashSet) ((y1) s5Var).f9976b).contains(l6Var.d[i10][i11]);
    }

    public final int q() {
        for (int i10 = this.f9866a.f9731c - 1; i10 >= 0; i10--) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i10 = this.f9866a.f9730b - 1; i10 >= 0; i10--) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof u5) {
                removeViewAt(childCount);
            }
        }
        l6 l6Var = this.f9866a;
        if (l6Var != null) {
            int size = l6Var.f9733g.size();
            for (int i10 = 0; i10 < size; i10++) {
                u5 u5Var = new u5(getContext(), this.f9867b);
                u5Var.setCompact(this.f9866a.f9729a.compact);
                u5Var.b((TL_iv.pageTableCell) this.f9866a.f9733g.get(i10));
                addView(u5Var);
            }
        }
    }

    public void setModel(l6 l6Var) {
        this.f9866a = l6Var;
        s();
    }

    public void setSelectionProvider(s5 s5Var) {
        this.h = s5Var;
        invalidate();
    }

    public final boolean t(int i10) {
        if (i10 >= 0 && i10 < this.f9866a.f9730b) {
            for (int i11 = 0; i11 < this.f9866a.f9731c; i11++) {
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
