package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.tl.TL_iv;
public final class zib extends View {
    public static final lib T = new lib((byte) 0);
    public static final lib U = new lib((byte) 1);
    public static final lib V = new lib((byte) 3);
    public static final lib W = new lib((byte) 4);
    public int E;
    public int F;
    public int[] G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final ArrayList K;
    public final ArrayList L;
    public final Path M;
    public final RectF N;
    public final float[] O;
    public final yib P;
    public final ArrayList Q;
    public boolean R;
    public final xib S;
    public final amb a;
    public int b;
    public final pib c;
    public final pib d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public zib(Context context, yib yibVar, amb ambVar) {
        super(context);
        this.c = new pib(this, true);
        this.d = new pib(this, false);
        this.e = 0;
        this.f = false;
        this.h = 1;
        this.n = 0;
        this.r = hl.L(8.0f);
        this.s = hl.L(9.0f);
        this.w = hl.L(12.0f);
        this.y = true;
        this.G = new int[0];
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new Path();
        this.N = new RectF();
        this.O = new float[8];
        this.Q = new ArrayList();
        this.a = ambVar;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.P = yibVar;
        xib xibVar = new xib(this, this);
        this.S = xibVar;
        ihc.l(this, xibVar);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(str.concat(". "));
    }

    public static void k(uib uibVar, int i, int i2, int i3, int i4) {
        tib tibVar = new tib(i, i2 + i);
        wib wibVar = uibVar.a;
        uibVar.a = new wib(wibVar.a, tibVar, wibVar.c, wibVar.d);
        tib tibVar2 = new tib(i3, i4 + i3);
        wib wibVar2 = uibVar.b;
        uibVar.b = new wib(wibVar2.a, tibVar2, wibVar2.c, wibVar2.d);
    }

    public final void a(int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.Q;
        sib sibVar = new sib(this, arrayList.size());
        uib uibVar = new uib();
        tib tibVar = new tib(i2, i4 + i2);
        lib libVar = W;
        uibVar.a = new wib(false, tibVar, libVar, 0.0f);
        uibVar.b = new wib(false, new tib(i, i3 + i), libVar, 0.0f);
        sibVar.a = uibVar;
        sibVar.j = i2;
        arrayList.add(sibVar);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            i3 = 1;
        }
        ArrayList arrayList = this.Q;
        sib sibVar = new sib(this, arrayList.size());
        sibVar.c = pagetablecell;
        uib uibVar = new uib();
        int i5 = pagetablecell.rowspan;
        if (i5 == 0) {
            i5 = 1;
        }
        tib tibVar = new tib(i2, i5 + i2);
        lib libVar = W;
        uibVar.a = new wib(false, tibVar, libVar, 0.0f);
        uibVar.b = new wib(false, new tib(i, i3 + i), libVar, 1.0f);
        sibVar.a = uibVar;
        sibVar.j = i2;
        arrayList.add(sibVar);
        if (pagetablecell.rowspan > 1) {
            this.L.add(new PointF(i2, i2 + i4));
        }
        h();
    }

    public final void c() {
        boolean z;
        pib pibVar;
        wib wibVar;
        wib wibVar2;
        Throwable th;
        int i;
        int i2 = this.n;
        if (i2 == 0) {
            if (this.e == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                pibVar = this.c;
            } else {
                pibVar = this.d;
            }
            int i3 = pibVar.b;
            if (i3 == Integer.MIN_VALUE) {
                i3 = 0;
            }
            if (i3 >= 0 && i3 <= 1024) {
                int[] iArr = new int[i3];
                int childCount = getChildCount();
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < childCount; i6++) {
                    uib uibVar = d(i6).a;
                    if (z) {
                        wibVar = uibVar.a;
                    } else {
                        wibVar = uibVar.b;
                    }
                    tib tibVar = wibVar.b;
                    boolean z2 = wibVar.a;
                    int a = tibVar.a();
                    if (a > 0 && a <= 1024) {
                        if (z2) {
                            i4 = tibVar.a;
                        }
                        if (z) {
                            wibVar2 = uibVar.b;
                        } else {
                            wibVar2 = uibVar.a;
                        }
                        tib tibVar2 = wibVar2.b;
                        int a2 = tibVar2.a();
                        int i7 = tibVar2.a;
                        if (a2 > 0) {
                            th = null;
                            if (tibVar2.a() <= 1024) {
                                boolean z3 = wibVar2.a;
                                int a3 = tibVar2.a();
                                if (i3 != 0) {
                                    if (z3) {
                                        i = Math.min(i7, i3);
                                    } else {
                                        i = 0;
                                    }
                                    a3 = Math.min(a3, i3 - i);
                                }
                                if (z3) {
                                    i5 = i7;
                                }
                                if (i3 != 0) {
                                    if (!z2 || !z3) {
                                        while (true) {
                                            int i8 = i5 + a3;
                                            if (i8 <= i3) {
                                                for (int i9 = i5; i9 < i8; i9++) {
                                                    if (iArr[i9] <= i4) {
                                                    }
                                                }
                                                break;
                                            }
                                            if (z3) {
                                                i4++;
                                            } else if (i8 <= i3) {
                                                i5++;
                                            } else {
                                                i4++;
                                                i5 = 0;
                                            }
                                        }
                                    }
                                    Arrays.fill(iArr, Math.min(i5, i3), Math.min(i5 + a3, i3), i4 + a);
                                }
                                if (z) {
                                    k(uibVar, i4, a, i5, a3);
                                } else {
                                    k(uibVar, i5, a3, i4, a);
                                }
                                i5 += a3;
                            }
                        } else {
                            th = null;
                        }
                        g("Table row or column span out of bounds");
                        throw th;
                    }
                    g("Table row or column span out of bounds");
                    throw null;
                }
                int childCount2 = getChildCount();
                int i10 = 1;
                for (int i11 = 0; i11 < childCount2; i11++) {
                    i10 = (i10 * 31) + d(i11).a.hashCode();
                }
                this.n = i10;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i12 = 1;
        for (int i13 = 0; i13 < childCount3; i13++) {
            i12 = (i12 * 31) + d(i13).a.hashCode();
        }
        if (i2 != i12) {
            h();
            c();
        }
    }

    public final sib d(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.Q;
            if (i < arrayList.size()) {
                return (sib) arrayList.get(i);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        xib xibVar = this.S;
        if (xibVar != null && xibVar.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(sib sibVar, boolean z, boolean z2) {
        pib pibVar;
        int[] iArr;
        wib wibVar;
        int i;
        if (this.h == 1) {
            return f(sibVar, z, z2);
        }
        if (z) {
            pibVar = this.c;
        } else {
            pibVar = this.d;
        }
        if (z2) {
            if (pibVar.j == null) {
                pibVar.j = new int[pibVar.e() + 1];
            }
            if (!pibVar.k) {
                pibVar.b(true);
                pibVar.k = true;
            }
            iArr = pibVar.j;
        } else {
            if (pibVar.l == null) {
                pibVar.l = new int[pibVar.e() + 1];
            }
            if (!pibVar.m) {
                pibVar.b(false);
                pibVar.m = true;
            }
            iArr = pibVar.l;
        }
        uib uibVar = sibVar.a;
        if (z) {
            wibVar = uibVar.b;
        } else {
            wibVar = uibVar.a;
        }
        tib tibVar = wibVar.b;
        if (z2) {
            i = tibVar.a;
        } else {
            i = tibVar.b;
        }
        return iArr[i];
    }

    public final int f(sib sibVar, boolean z, boolean z2) {
        int i;
        wib wibVar;
        pib pibVar;
        boolean z3;
        uib uibVar = sibVar.a;
        if (z) {
            if (z2) {
                i = ((ViewGroup.MarginLayoutParams) uibVar).leftMargin;
            } else {
                i = ((ViewGroup.MarginLayoutParams) uibVar).rightMargin;
            }
        } else if (z2) {
            i = ((ViewGroup.MarginLayoutParams) uibVar).topMargin;
        } else {
            i = ((ViewGroup.MarginLayoutParams) uibVar).bottomMargin;
        }
        if (i == Integer.MIN_VALUE) {
            if (!this.f) {
                return 0;
            }
            if (z) {
                wibVar = uibVar.b;
                pibVar = this.c;
            } else {
                wibVar = uibVar.a;
                pibVar = this.d;
            }
            tib tibVar = wibVar.b;
            if (z && this.J) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != z2) {
                return 0;
            }
            pibVar.e();
            return 0;
        }
        return i;
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.Q.size();
    }

    public int getColumnCount() {
        return this.c.e();
    }

    public int getOrientation() {
        return this.e;
    }

    public int getRenderHeight() {
        return this.F;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f;
    }

    public final void h() {
        this.n = 0;
        pib pibVar = this.c;
        pibVar.k();
        pib pibVar2 = this.d;
        pibVar2.k();
        if (pibVar != null && pibVar2 != null) {
            pibVar.l();
            pibVar2.l();
        }
    }

    public final void i(sib sibVar, int i, int i2, boolean z) {
        sibVar.d(e(sibVar, true, false) + e(sibVar, true, true) + i, e(sibVar, false, false) + e(sibVar, false, true) + i2, z);
    }

    public final void j(int i, boolean z) {
        boolean z2;
        wib wibVar;
        pib pibVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TextPaint textPaint;
        CharSequence charSequence;
        jib jibVar;
        yib yibVar = this.P;
        int i7 = 0;
        if (z && this.R && this.e == 0) {
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i);
            int i8 = this.w << 1;
            if (this.b > 1) {
                i5 = Math.round(size * 0.8f);
            } else {
                i5 = size;
            }
            int max = Math.max(1, i5 - i8);
            ArrayList arrayList = new ArrayList(childCount);
            jib[] jibVarArr = new jib[childCount];
            int i9 = 0;
            while (i9 < childCount) {
                sib d = d(i9);
                uib uibVar = d.a;
                tib tibVar = uibVar.b.b;
                d.e(yibVar.c(d.c, max));
                if (d.b == null) {
                    ((ViewGroup.MarginLayoutParams) uibVar).width = i7;
                    ((ViewGroup.MarginLayoutParams) uibVar).height = i7;
                    i(d, i7, i7, true);
                } else {
                    ((ViewGroup.MarginLayoutParams) uibVar).height = Math.max(this.x, d.f + this.r + this.s);
                    int b = d.b.b();
                    if (b > 0) {
                        int i10 = tibVar.a;
                        int a = tibVar.a();
                        int i11 = ((ViewGroup.MarginLayoutParams) uibVar).height * b;
                        ?? obj = new Object();
                        obj.a = i10;
                        obj.b = Math.max(1, a);
                        obj.g = true;
                        int max2 = Math.max(0, i11);
                        obj.e = max2;
                        obj.d = max2;
                        jibVar = obj;
                    } else {
                        Layout a2 = d.b.a();
                        if (a2 != null) {
                            CharSequence text = a2.getText();
                            textPaint = a2.getPaint();
                            charSequence = text;
                        } else {
                            textPaint = null;
                            charSequence = null;
                        }
                        jibVar = sze.b(charSequence, textPaint, tibVar.a, tibVar.a(), i8, max, d.e);
                    }
                    jibVarArr[i9] = jibVar;
                    arrayList.add(jibVar);
                }
                i9++;
                i7 = 0;
            }
            int[] a3 = sze.a(this.b, size, 0, arrayList);
            for (int i12 = 0; i12 < childCount; i12++) {
                sib d2 = d(i12);
                jib jibVar2 = jibVarArr[i12];
                if (jibVar2 != null) {
                    uib uibVar2 = d2.a;
                    if (d2.b.b() > 0) {
                        i6 = jibVar2.e;
                        ((ViewGroup.MarginLayoutParams) uibVar2).width = i6;
                    } else {
                        tib tibVar2 = uibVar2.b.b;
                        int i13 = 0;
                        for (int max3 = Math.max(0, tibVar2.a); max3 < Math.min(this.b, tibVar2.b); max3++) {
                            i13 += a3[max3];
                        }
                        int max4 = Math.max(1, i13 - i8);
                        if (d2.e > max4) {
                            d2.e(yibVar.c(d2.c, max4));
                            ((ViewGroup.MarginLayoutParams) uibVar2).height = Math.max(this.x, d2.f + this.r + this.s);
                        }
                        i6 = d2.e + i8;
                        ((ViewGroup.MarginLayoutParams) uibVar2).width = i6;
                    }
                    i(d2, i6, ((ViewGroup.MarginLayoutParams) uibVar2).height, true);
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            sib d3 = d(i14);
            uib uibVar3 = d3.a;
            if (z) {
                float size2 = View.MeasureSpec.getSize(i);
                if (this.b == 2) {
                    i3 = ((int) (size2 / 2.0f)) - (this.w << 2);
                } else {
                    i3 = (int) (size2 / 1.5f);
                }
                d3.e(yibVar.c(d3.c, i3));
                if (d3.b != null) {
                    ((ViewGroup.MarginLayoutParams) uibVar3).height = Math.max(this.x, d3.f + this.r + this.s);
                    int b2 = d3.b.b();
                    if (b2 > 0) {
                        i4 = ((ViewGroup.MarginLayoutParams) uibVar3).height * b2;
                    } else {
                        i4 = d3.e + (this.w << 1);
                    }
                    ((ViewGroup.MarginLayoutParams) uibVar3).width = i4;
                } else {
                    ((ViewGroup.MarginLayoutParams) uibVar3).width = 0;
                    ((ViewGroup.MarginLayoutParams) uibVar3).height = 0;
                    i4 = 0;
                }
                i(d3, i4, ((ViewGroup.MarginLayoutParams) uibVar3).height, true);
            } else {
                if (this.e == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    wibVar = uibVar3.b;
                } else {
                    wibVar = uibVar3.a;
                }
                wib wibVar2 = wib.e;
                if (wibVar.a(z2) == W) {
                    tib tibVar3 = wibVar.b;
                    if (z2) {
                        pibVar = this.c;
                    } else {
                        pibVar = this.d;
                    }
                    int[] g = pibVar.g();
                    int e = (g[tibVar3.b] - g[tibVar3.a]) - (e(d3, z2, false) + e(d3, z2, true));
                    if (z2) {
                        rib ribVar = d3.b;
                        if (ribVar != null) {
                            i2 = ribVar.b();
                        } else {
                            i2 = 0;
                        }
                        if (i2 > 0) {
                            int max5 = Math.max(1, Math.round(e / i2));
                            ((ViewGroup.MarginLayoutParams) uibVar3).height = max5;
                            d3.m = max5;
                        }
                        i(d3, e, ((ViewGroup.MarginLayoutParams) uibVar3).height, false);
                    } else {
                        i(d3, ((ViewGroup.MarginLayoutParams) uibVar3).width, e, false);
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            d(i).a(canvas, this, true);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        c();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int f;
        int i6;
        zib zibVar = this;
        zibVar.c();
        pib pibVar = zibVar.d;
        pib pibVar2 = zibVar.c;
        if (pibVar2 != null && pibVar != null) {
            pibVar2.l();
            pibVar.l();
        }
        zibVar.b = 0;
        int childCount = zibVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            zibVar.b = Math.max(zibVar.b, zibVar.d(i7).a.b.b.b);
        }
        zibVar.j(i, true);
        if (zibVar.e == 0) {
            i3 = pibVar2.i(i);
            if (zibVar.y) {
                i3 = Math.max(i3, View.MeasureSpec.getSize(i));
                pibVar2.v.a = i3;
                pibVar2.w.a = -i3;
                pibVar2.q = false;
                pibVar2.g();
            }
            zibVar.j(i, false);
            i4 = pibVar.i(i2);
        } else {
            int i8 = pibVar.i(i2);
            zibVar.j(i, false);
            i3 = pibVar2.i(i);
            i4 = i8;
        }
        int max = Math.max(i4, zibVar.getSuggestedMinimumHeight());
        zibVar.setMeasuredDimension(i3, max);
        pibVar2.v.a = i3;
        pibVar2.w.a = -i3;
        pibVar2.q = false;
        pibVar2.g();
        pibVar.v.a = max;
        pibVar.w.a = -max;
        pibVar.q = false;
        pibVar.g();
        int[] g = pibVar2.g();
        int[] g2 = pibVar.g();
        int[] copyOf = Arrays.copyOf(g2, g2.length);
        ArrayList arrayList = zibVar.K;
        arrayList.clear();
        int i9 = g[g.length - 1];
        int childCount2 = zibVar.getChildCount();
        int i10 = 0;
        while (i10 < childCount2) {
            int i11 = i10;
            sib d = zibVar.d(i11);
            uib uibVar = d.a;
            wib wibVar = uibVar.b;
            wib wibVar2 = uibVar.a;
            tib tibVar = wibVar.b;
            tib tibVar2 = wibVar2.b;
            int i12 = childCount2;
            int i13 = g[tibVar.a];
            int i14 = g2[tibVar2.a];
            int i15 = g[tibVar.b] - i13;
            int i16 = g2[tibVar2.b] - i14;
            int i17 = d.k;
            pib pibVar3 = pibVar;
            int i18 = d.l;
            lib a = wibVar.a(true);
            lib a2 = wibVar2.a(false);
            ko9 f2 = pibVar2.f();
            qib qibVar = (qib) ((Object[]) f2.d)[((int[]) f2.b)[i11]];
            ko9 f3 = pibVar3.f();
            pib pibVar4 = pibVar2;
            qib qibVar2 = (qib) ((Object[]) f3.d)[((int[]) f3.b)[i11]];
            int b = a.b(d, i15 - qibVar.d(true));
            int b2 = a2.b(d, i16 - qibVar2.d(true));
            int e = zibVar.e(d, true, true);
            int e2 = zibVar.e(d, false, true);
            int e3 = zibVar.e(d, true, false);
            int i19 = e + e3;
            int e4 = e2 + zibVar.e(d, false, false);
            int a3 = qibVar.a(zibVar, d, a, i17 + i19, true);
            zibVar = this;
            int a4 = qibVar2.a(zibVar, d, a2, i18 + e4, false);
            int c = a.c(i17, i15 - i19);
            int c2 = a2.c(i18, i16 - e4);
            int i20 = i13 + b + a3;
            if (!zibVar.J) {
                f = e + i20;
            } else {
                f = qd4.f(i9, c, e3, i20);
            }
            int i21 = f;
            int i22 = i14 + b2 + a4 + e2;
            if (d.c != null) {
                if (c == d.k && c2 == d.l) {
                    i6 = 0;
                } else {
                    i6 = 0;
                    d.d(c, c2, false);
                }
                int i23 = d.m;
                if (i23 != 0 && i23 != c2) {
                    tib tibVar3 = d.a.a.b;
                    if (tibVar3.b - tibVar3.a <= 1) {
                        ArrayList arrayList2 = zibVar.L;
                        int size = arrayList2.size();
                        int i24 = i6;
                        while (true) {
                            if (i24 < size) {
                                PointF pointF = (PointF) arrayList2.get(i24);
                                float f4 = pointF.x;
                                float f5 = d.a.a.b.a;
                                if (f4 > f5 || pointF.y <= f5) {
                                    i24++;
                                }
                            } else {
                                arrayList.add(d);
                                break;
                            }
                        }
                    }
                }
            }
            d.p = i21;
            d.q = i22;
            i10 = i11 + 1;
            pibVar = pibVar3;
            childCount2 = i12;
            pibVar2 = pibVar4;
        }
        int size2 = arrayList.size();
        int i25 = 0;
        while (i25 < size2) {
            sib sibVar = (sib) arrayList.get(i25);
            int i26 = sibVar.l;
            int i27 = sibVar.d;
            int i28 = i26 - sibVar.m;
            ArrayList arrayList3 = zibVar.Q;
            int size3 = arrayList3.size();
            for (int i29 = i27 + 1; i29 < size3; i29++) {
                sib sibVar2 = (sib) arrayList3.get(i29);
                if (sibVar.a.a.b.a != sibVar2.a.a.b.a) {
                    break;
                }
                int i30 = sibVar.m;
                int i31 = sibVar2.m;
                if (i30 < i31) {
                    z = true;
                    break;
                }
                int i32 = sibVar2.l - i31;
                if (i32 > 0) {
                    i28 = Math.min(i28, i32);
                }
            }
            z = false;
            if (!z) {
                int i33 = i27 - 1;
                while (true) {
                    if (i33 < 0) {
                        break;
                    }
                    sib sibVar3 = (sib) arrayList3.get(i33);
                    if (sibVar.a.a.b.a != sibVar3.a.a.b.a) {
                        break;
                    }
                    int i34 = sibVar.m;
                    int i35 = sibVar3.m;
                    if (i34 < i35) {
                        z = true;
                        break;
                    }
                    int i36 = sibVar3.l - i35;
                    if (i36 > 0) {
                        i28 = Math.min(i28, i36);
                    }
                    i33--;
                }
            }
            if (!z) {
                sibVar.l = sibVar.m;
                sibVar.g();
                max -= i28;
                int i37 = sibVar.a.a.b.a;
                while (true) {
                    i37++;
                    if (i37 >= copyOf.length) {
                        break;
                    }
                    copyOf[i37] = copyOf[i37] - i28;
                }
                int size4 = arrayList3.size();
                int i38 = size2;
                int i39 = i25;
                int i40 = 0;
                while (i40 < size4) {
                    sib sibVar4 = (sib) arrayList3.get(i40);
                    if (sibVar == sibVar4) {
                        i5 = i40;
                    } else {
                        int i41 = sibVar.a.a.b.a;
                        int i42 = sibVar4.a.a.b.a;
                        if (i41 == i42) {
                            if (sibVar4.m != sibVar4.l) {
                                arrayList.remove(sibVar4);
                                if (sibVar4.d < i27) {
                                    i39--;
                                }
                                i38--;
                            }
                            int i43 = sibVar4.l - i28;
                            sibVar4.l = i43;
                            i5 = i40;
                            sibVar4.d(sibVar4.k, i43, true);
                        } else {
                            i5 = i40;
                            if (i41 < i42) {
                                sibVar4.q -= i28;
                            }
                        }
                    }
                    i40 = i5 + 1;
                }
                i25 = i39;
                size2 = i38;
            }
            i25++;
        }
        int childCount3 = zibVar.getChildCount();
        for (int i44 = 0; i44 < childCount3; i44++) {
            sib d2 = zibVar.d(i44);
            zibVar.P.g(d2.b, d2.c());
            d2.n = d2.p;
            d2.o = d2.k;
        }
        zibVar.E = i9;
        zibVar.F = max;
        zibVar.G = copyOf;
        zibVar.setMeasuredDimension(i9, max);
    }

    @Override
    public final void requestLayout() {
        pib pibVar;
        super.requestLayout();
        pib pibVar2 = this.c;
        if (pibVar2 != null && (pibVar = this.d) != null) {
            pibVar2.l();
            pibVar.l();
        }
    }

    public void setAlignmentMode(int i) {
        this.h = i;
        requestLayout();
    }

    public void setBalancedColumns(boolean z) {
        if (this.R == z) {
            return;
        }
        this.R = z;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.c.n(i);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        pib pibVar = this.c;
        pibVar.u = z;
        pibVar.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z) {
        this.H = z;
    }

    public void setFillWidth(boolean z) {
        if (this.y == z) {
            return;
        }
        this.y = z;
        requestLayout();
    }

    public void setMinimumCellHeight(int i) {
        this.x = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.e != i) {
            this.e = i;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i) {
        int i2;
        int i3;
        int measuredWidth = getMeasuredWidth();
        this.E = Math.max(measuredWidth, i);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            sib d = d(i4);
            if (measuredWidth > 0 && (i3 = this.E) != measuredWidth) {
                float f = measuredWidth;
                int round = Math.round((d.n * i3) / f);
                int round2 = Math.round(((d.n + d.o) * this.E) / f);
                d.p = round;
                d.k = Math.max(0, round2 - round);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            } else {
                int i5 = d.n;
                d.p = i5;
                d.k = Math.max(0, (d.o + i5) - i5);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            }
        }
        int[] iArr = this.G;
        if (iArr.length < 2) {
            this.F = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i6 = length - 1;
            int[] iArr2 = new int[i6];
            int i7 = 0;
            while (i7 < i6) {
                int[] iArr3 = this.G;
                int i8 = i7 + 1;
                iArr2[i7] = iArr3[i8] - iArr3[i7];
                i7 = i8;
            }
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                sib d2 = d(i9);
                rib ribVar = d2.b;
                if (ribVar != null) {
                    i2 = ribVar.b();
                } else {
                    i2 = 0;
                }
                if (i2 > 0) {
                    tib tibVar = d2.a.a.b;
                    int max = Math.max(0, tibVar.a);
                    int min = Math.min(i6, tibVar.b);
                    if (max < min) {
                        int i10 = 0;
                        for (int i11 = max; i11 < min; i11++) {
                            i10 += iArr2[i11];
                        }
                        int max2 = Math.max(1, Math.round(d2.k / i2)) - i10;
                        while (max < min && max2 > 0) {
                            int i12 = min - max;
                            int i13 = ((max2 + i12) - 1) / i12;
                            iArr2[max] = iArr2[max] + i13;
                            max2 -= i13;
                            max++;
                        }
                    }
                }
            }
            int[] iArr4 = new int[length];
            int i14 = 0;
            while (i14 < i6) {
                int i15 = i14 + 1;
                iArr4[i15] = iArr4[i14] + iArr2[i14];
                i14 = i15;
            }
            this.F = iArr4[i6];
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                sib d3 = d(i16);
                tib tibVar2 = d3.a.a.b;
                int max3 = Math.max(0, Math.min(i6, tibVar2.a));
                int max4 = Math.max(max3, Math.min(i6, tibVar2.b));
                int i17 = iArr4[max3];
                int i18 = iArr4[max4];
                d3.q = i17;
                d3.l = Math.max(0, i18 - i17);
                if (d3.c != null) {
                    d3.g();
                }
                this.P.g(d3.b, d3.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i) {
        this.d.n(i);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        pib pibVar = this.d;
        pibVar.u = z;
        pibVar.k();
        h();
        requestLayout();
    }

    public void setRtl(boolean z) {
        this.J = z;
    }

    public void setStriped(boolean z) {
        this.I = z;
    }

    public void setUseDefaultMargins(boolean z) {
        this.f = z;
        requestLayout();
    }
}
