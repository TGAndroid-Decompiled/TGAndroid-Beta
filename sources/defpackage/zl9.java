package defpackage;

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
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.tl.TL_iv;
public final class zl9 extends ViewGroup {
    public final RectF E;
    public final RectF F;
    public final Path G;
    public final mm H;
    public short I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public ajb a;
    public final vnb b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int[] f;
    public yl9 h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final Paint y;

    public zl9(Context context, vnb vnbVar) {
        super(context);
        this.c = new int[0];
        this.d = new int[0];
        this.e = new int[0];
        this.f = new int[0];
        Paint paint = new Paint(1);
        this.n = paint;
        this.r = new Paint(1);
        this.s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.w = paint2;
        this.x = new Paint(1);
        this.y = new Paint(1);
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Path();
        this.b = vnbVar;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(hl.N(0.66f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(hl.L(2.0f));
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.H = new mm(this, 0L, 220L, k43.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        ViewParent parent;
        TL_iv.pageTableCell pagetablecell;
        ajb ajbVar = this.a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (ajbVar != null && ajbVar.b != 0 && ajbVar.c != 0) {
            View findFocus = findFocus();
            if (findFocus == null) {
                parent = null;
            } else {
                parent = findFocus.getParent();
            }
            while (parent != null && parent != this) {
                if (parent instanceof am9) {
                    pagetablecell = ((am9) parent).b;
                    break;
                }
                parent = parent.getParent();
            }
            pagetablecell = null;
            if (pagetablecell != null) {
                return pagetablecell;
            }
            if (this.h != null) {
                ArrayList arrayList = this.a.g;
                int size = arrayList.size();
                int i = Integer.MAX_VALUE;
                int i2 = 0;
                int i3 = Integer.MAX_VALUE;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                    if (((LinkedHashSet) ((ye9) this.h).b).contains(pagetablecell3)) {
                        int b = this.a.b(pagetablecell3);
                        int a = this.a.a(pagetablecell3);
                        if (b < i || (b == i && a < i3)) {
                            pagetablecell2 = pagetablecell3;
                            i = b;
                            i3 = a;
                        }
                    }
                }
            }
        }
        return pagetablecell2;
    }

    public final void b() {
        int i = aob.hi;
        vnb vnbVar = this.b;
        this.n.setColor(aob.v0(i, vnbVar));
        int v0 = aob.v0(aob.M6, vnbVar);
        int red = Color.red(v0);
        int green = Color.green(v0);
        int blue = Color.blue(v0);
        this.r.setColor(aob.v0(aob.gi, vnbVar));
        this.s.setColor(Color.argb(20, red, green, blue));
        this.I = (short) 255;
        int i2 = aob.Fi;
        this.w.setColor(aob.v0(i2, vnbVar));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.x;
        paint.setStyle(style);
        this.P = aob.v0(aob.E6, vnbVar);
        this.Q = aob.v0(aob.Ji, vnbVar);
        paint.setColor(this.P);
        Paint paint2 = this.y;
        paint2.setStyle(style);
        paint2.setColor(aob.v0(i2, vnbVar));
        invalidate();
    }

    public final boolean c(int i, int i2) {
        if (i < 0 || i2 < i) {
            return false;
        }
        while (i <= i2) {
            if (!n(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final boolean d(int i, int i2) {
        if (i < 0 || i2 < i) {
            return false;
        }
        while (i <= i2) {
            if (!o(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zl9.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean e(int i) {
        if (i >= 0 && i < this.a.c) {
            for (int i2 = 0; i2 < this.a.b; i2++) {
                if (p(i2, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i, int i2) {
        int i3;
        ajb ajbVar = this.a;
        int i4 = ajbVar.c;
        int i5 = ajbVar.b;
        int[] iArr = this.e;
        int i6 = 0;
        if (i == iArr[0]) {
            i3 = 0;
        } else {
            if (i == iArr[i4]) {
                i3 = i4 - 1;
            }
            return 0.0f;
        }
        int[] iArr2 = this.f;
        if (i2 != iArr2[0]) {
            if (i2 == iArr2[i5]) {
                i6 = i5 - 1;
            }
            return 0.0f;
        }
        if (i3 >= 0 && i6 >= 0 && p(i6, i3)) {
            return Math.min(hl.N(10.0f), Math.min(this.c[i3], this.d[i6]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i, int i2) {
        float N = i - hl.N(1.0f);
        float N2 = hl.N(1.0f) + i2;
        float f = this.f[this.a.b];
        float L = hl.L(16.0f) + f;
        float min = Math.min(hl.N(10.0f), (N2 - N) / 2.0f);
        float f2 = f(i, this.f[this.a.b]);
        float f3 = f(i2, this.f[this.a.b]);
        Path path = this.G;
        path.rewind();
        path.moveTo(N, f - f2);
        path.lineTo(N, L - min);
        float f4 = min * 2.0f;
        float f5 = L - f4;
        RectF rectF = this.F;
        rectF.set(N, f5, N + f4, L);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(N2 - min, L);
        rectF.set(N2 - f4, f5, N2, L);
        path.arcTo(rectF, 90.0f, -90.0f);
        path.lineTo(N2, f - f3);
        if (f3 > 0.0f) {
            float f6 = f3 * 2.0f;
            rectF.set(N2 - f6, f - f6, N2, f);
            path.arcTo(rectF, 0.0f, 90.0f);
        } else {
            path.lineTo(N2, f);
        }
        path.lineTo(N + f2, f);
        if (f2 > 0.0f) {
            float f7 = f2 * 2.0f;
            rectF.set(N, f - f7, f7 + N, f);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(N, f);
        }
        path.close();
        canvas.drawPath(path, this.y);
    }

    public ajb getModel() {
        return this.a;
    }

    public final void h(Canvas canvas, int i, int i2) {
        float N = i - hl.N(1.0f);
        float N2 = hl.N(1.0f) + i2;
        float L = this.e[0] - hl.L(16.0f);
        float min = Math.min(hl.N(10.0f), (N2 - N) / 2.0f);
        float f = f(this.e[0], i);
        float f2 = f(this.e[0], i2);
        Path path = this.G;
        path.rewind();
        path.moveTo(this.e[0] + f, N);
        path.lineTo(L + min, N);
        float f3 = min * 2.0f;
        float f4 = L + f3;
        RectF rectF = this.F;
        rectF.set(L, N, f4, N + f3);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(L, N2 - min);
        rectF.set(L, N2 - f3, f4, N2);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.e[0] + f2, N2);
        if (f2 > 0.0f) {
            int i3 = this.e[0];
            float f5 = f2 * 2.0f;
            rectF.set(i3, N2 - f5, i3 + f5, N2);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], N2);
        }
        path.lineTo(this.e[0], N + f);
        if (f > 0.0f) {
            int i4 = this.e[0];
            float f6 = f * 2.0f;
            rectF.set(i4, N, i4 + f6, f6 + N);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], N);
        }
        path.close();
        canvas.drawPath(path, this.y);
    }

    public final void i(float f, int i, int i2, Canvas canvas) {
        float f2;
        float f3;
        float f4 = f(i, i2);
        if (f4 <= 0.0f) {
            return;
        }
        if (i == this.e[0]) {
            f2 = i + f4;
        } else {
            f2 = i - f4;
        }
        if (i2 == this.f[0]) {
            f3 = i2 + f4;
        } else {
            f3 = i2 - f4;
        }
        RectF rectF = this.F;
        rectF.set(f2 - f4, f3 - f4, f2 + f4, f3 + f4);
        canvas.drawArc(rectF, f, 90.0f, false, this.w);
    }

    public final int j() {
        for (int i = 0; i < this.a.c; i++) {
            if (e(i)) {
                return i;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i = 0; i < this.a.b; i++) {
            if (t(i)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean l() {
        ajb ajbVar = this.a;
        if (ajbVar != null && this.h != null) {
            ArrayList arrayList = ajbVar.g;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((LinkedHashSet) ((ye9) this.h).b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final am9 m(TL_iv.pageTableCell pagetablecell) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof am9) {
                am9 am9Var = (am9) childAt;
                if (am9Var.b == pagetablecell) {
                    return am9Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i) {
        if (i < 0 || i >= this.a.c) {
            return false;
        }
        for (int i2 = 0; i2 < this.a.b; i2++) {
            if (!p(i2, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i) {
        if (i < 0 || i >= this.a.b) {
            return false;
        }
        for (int i2 = 0; i2 < this.a.c; i2++) {
            if (!p(i, i2)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a != null) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt instanceof am9) {
                    am9 am9Var = (am9) childAt;
                    int b = this.a.b(am9Var.b);
                    int a = this.a.a(am9Var.b);
                    if (b >= 0 && a >= 0) {
                        int i6 = this.e[a];
                        int i7 = this.f[b];
                        am9Var.layout(i6, i7, am9Var.getMeasuredWidth() + i6, am9Var.getMeasuredHeight() + i7);
                    }
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int round;
        int i7;
        int i8;
        int i9;
        int ceil;
        float f = 20.0f;
        int L = hl.L(20.0f);
        int L2 = hl.L(4.0f);
        int L3 = hl.L(4.0f);
        int L4 = hl.L(10.0f);
        ajb ajbVar = this.a;
        if (ajbVar != null && ajbVar.b != 0 && ajbVar.c != 0) {
            int size = (View.MeasureSpec.getSize(i) - L) - L3;
            ajb ajbVar2 = this.a;
            int i10 = ajbVar2.b;
            int i11 = ajbVar2.c;
            this.c = new int[i11];
            this.d = new int[i10];
            if (!ajbVar2.a.compact) {
                f = 50.0f;
            }
            int L5 = hl.L(f);
            if (this.a.a.compact) {
                i3 = 5;
            } else {
                i3 = 12;
            }
            int L6 = hl.L(i3 << 1);
            if (i11 > 1) {
                i4 = Math.round(size * 0.8f);
            } else {
                i4 = size;
            }
            int max = Math.max(1, Math.max(L5, i4) - L6);
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            while (i12 < getChildCount()) {
                View childAt = getChildAt(i12);
                if (childAt instanceof am9) {
                    am9 am9Var = (am9) childAt;
                    dg9 dg9Var = am9Var.a;
                    int a = this.a.a(am9Var.b);
                    if (a >= 0 && a < i11) {
                        int i13 = i12;
                        Editable text = dg9Var.getText();
                        if (text == null) {
                            i7 = L;
                            i8 = L3;
                            ceil = 0;
                        } else {
                            i7 = L;
                            i8 = L3;
                            ceil = (int) Math.ceil(Layout.getDesiredWidth(text, dg9Var.getPaint()));
                        }
                        i9 = i13;
                        arrayList.add(sze.b(text, dg9Var.getPaint(), a, ajb.n(am9Var.b), L6, max, ceil));
                        i12 = i9 + 1;
                        L = i7;
                        L3 = i8;
                    }
                }
                i7 = L;
                i8 = L3;
                i9 = i12;
                i12 = i9 + 1;
                L = i7;
                L3 = i8;
            }
            int i14 = L;
            int i15 = L3;
            System.arraycopy(sze.a(i11, size, L5, arrayList), 0, this.c, 0, i11);
            int i16 = 0;
            for (int i17 : this.c) {
                i16 += i17;
            }
            if (i16 < size && i11 > 0) {
                int i18 = size - i16;
                for (int i19 = 0; i19 < i11; i19++) {
                    if (i19 == i11 - 1) {
                        round = i18;
                    } else {
                        round = Math.round((this.c[i19] * i18) / i16);
                    }
                    int[] iArr = this.c;
                    int i20 = iArr[i19] + round;
                    iArr[i19] = i20;
                    i18 -= round;
                    i16 -= i20 - round;
                }
            }
            for (int i21 = 0; i21 < getChildCount(); i21++) {
                View childAt2 = getChildAt(i21);
                if (childAt2 instanceof am9) {
                    am9 am9Var2 = (am9) childAt2;
                    int b = this.a.b(am9Var2.b);
                    int a2 = this.a.a(am9Var2.b);
                    int n = ajb.n(am9Var2.b);
                    int i22 = 0;
                    for (int i23 = a2; i23 < a2 + n && i23 < i11; i23++) {
                        i22 += this.c[i23];
                    }
                    am9Var2.measure(View.MeasureSpec.makeMeasureSpec(i22, 1073741824), 0);
                    if (ajb.o(am9Var2.b) == 1) {
                        int measuredHeight = am9Var2.getMeasuredHeight();
                        int[] iArr2 = this.d;
                        if (measuredHeight > iArr2[b]) {
                            iArr2[b] = am9Var2.getMeasuredHeight();
                        }
                    }
                }
            }
            for (int i24 = 0; i24 < getChildCount(); i24++) {
                View childAt3 = getChildAt(i24);
                if (childAt3 instanceof am9) {
                    am9 am9Var3 = (am9) childAt3;
                    int b2 = this.a.b(am9Var3.b);
                    int o = ajb.o(am9Var3.b);
                    if (o > 1) {
                        int i25 = b2;
                        int i26 = 0;
                        while (true) {
                            i5 = b2 + o;
                            if (i25 >= i5 || i25 >= i10) {
                                break;
                            }
                            i26 += this.d[i25];
                            i25++;
                        }
                        int measuredHeight2 = am9Var3.getMeasuredHeight();
                        if (measuredHeight2 > i26) {
                            int i27 = measuredHeight2 - i26;
                            int max2 = i27 / Math.max(o, 1);
                            int max3 = i27 % Math.max(o, 1);
                            while (b2 < i5 && b2 < i10) {
                                int[] iArr3 = this.d;
                                int i28 = iArr3[b2];
                                if (max3 > 0) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                iArr3[b2] = i6 + max2 + i28;
                                if (max3 > 0) {
                                    max3--;
                                }
                                b2++;
                            }
                        }
                    }
                }
            }
            for (int i29 = 0; i29 < getChildCount(); i29++) {
                View childAt4 = getChildAt(i29);
                if (childAt4 instanceof am9) {
                    am9 am9Var4 = (am9) childAt4;
                    int b3 = this.a.b(am9Var4.b);
                    int a3 = this.a.a(am9Var4.b);
                    int n2 = ajb.n(am9Var4.b);
                    int o2 = ajb.o(am9Var4.b);
                    int i30 = 0;
                    for (int i31 = a3; i31 < a3 + n2 && i31 < i11; i31++) {
                        i30 += this.c[i31];
                    }
                    int i32 = 0;
                    for (int i33 = b3; i33 < b3 + o2 && i33 < i10; i33++) {
                        i32 += this.d[i33];
                    }
                    am9Var4.measure(View.MeasureSpec.makeMeasureSpec(i30, 1073741824), View.MeasureSpec.makeMeasureSpec(i32, 1073741824));
                }
            }
            int[] iArr4 = new int[i11 + 1];
            this.e = iArr4;
            iArr4[0] = i14;
            int i34 = 0;
            while (i34 < i11) {
                int[] iArr5 = this.e;
                int i35 = i34 + 1;
                iArr5[i35] = iArr5[i34] + this.c[i34];
                i34 = i35;
            }
            int[] iArr6 = new int[i10 + 1];
            this.f = iArr6;
            iArr6[0] = L2;
            int i36 = 0;
            while (i36 < i10) {
                int[] iArr7 = this.f;
                int i37 = i36 + 1;
                iArr7[i37] = iArr7[i36] + this.d[i36];
                i36 = i37;
            }
            setMeasuredDimension(Math.max(this.e[i11] + i15, size + i14 + i15), this.f[i10] + L4);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), L2 + L4);
        this.c = new int[0];
        this.d = new int[0];
        this.e = new int[0];
        this.f = new int[0];
    }

    public final boolean p(int i, int i2) {
        yl9 yl9Var;
        ajb ajbVar = this.a;
        if (ajbVar != null && (yl9Var = this.h) != null && i >= 0 && i < ajbVar.b && i2 >= 0 && i2 < ajbVar.c) {
            return ((LinkedHashSet) ((ye9) yl9Var).b).contains(ajbVar.d[i][i2]);
        }
        return false;
    }

    public final int q() {
        for (int i = this.a.c - 1; i >= 0; i--) {
            if (e(i)) {
                return i;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i = this.a.b - 1; i >= 0; i--) {
            if (t(i)) {
                return i;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof am9) {
                removeViewAt(childCount);
            }
        }
        ajb ajbVar = this.a;
        if (ajbVar != null) {
            int size = ajbVar.g.size();
            for (int i = 0; i < size; i++) {
                am9 am9Var = new am9(getContext(), this.b);
                am9Var.setCompact(this.a.a.compact);
                am9Var.b((TL_iv.pageTableCell) this.a.g.get(i));
                addView(am9Var);
            }
        }
    }

    public void setModel(ajb ajbVar) {
        this.a = ajbVar;
        s();
    }

    public void setSelectionProvider(yl9 yl9Var) {
        this.h = yl9Var;
        invalidate();
    }

    public final boolean t(int i) {
        if (i >= 0 && i < this.a.b) {
            for (int i2 = 0; i2 < this.a.c; i2++) {
                if (p(i, i2)) {
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
        boolean c = c(j(), q());
        if (d && !c) {
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
