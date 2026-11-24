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
public final class ehb extends View {
    public static final qgb T = new qgb((byte) 0);
    public static final qgb U = new qgb((byte) 1);
    public static final qgb V = new qgb((byte) 3);
    public static final qgb W = new qgb((byte) 4);
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
    public final dhb P;
    public final ArrayList Q;
    public boolean R;
    public final chb S;
    public final gkb a;
    public int b;
    public final ugb c;
    public final ugb d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public ehb(Context context, dhb dhbVar, gkb gkbVar) {
        super(context);
        this.c = new ugb(this, true);
        this.d = new ugb(this, false);
        this.e = 0;
        this.f = false;
        this.h = 1;
        this.n = 0;
        this.r = gm.L(8.0f);
        this.s = gm.L(9.0f);
        this.w = gm.L(12.0f);
        this.y = true;
        this.G = new int[0];
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new Path();
        this.N = new RectF();
        this.O = new float[8];
        this.Q = new ArrayList();
        this.a = gkbVar;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.P = dhbVar;
        chb chbVar = new chb(this, this);
        this.S = chbVar;
        kfc.k(this, chbVar);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(str.concat(". "));
    }

    public static void k(zgb zgbVar, int i, int i2, int i3, int i4) {
        ygb ygbVar = new ygb(i, i2 + i);
        bhb bhbVar = zgbVar.a;
        zgbVar.a = new bhb(bhbVar.a, ygbVar, bhbVar.c, bhbVar.d);
        ygb ygbVar2 = new ygb(i3, i4 + i3);
        bhb bhbVar2 = zgbVar.b;
        zgbVar.b = new bhb(bhbVar2.a, ygbVar2, bhbVar2.c, bhbVar2.d);
    }

    public final void a(int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.Q;
        xgb xgbVar = new xgb(this, arrayList.size());
        zgb zgbVar = new zgb();
        ygb ygbVar = new ygb(i2, i4 + i2);
        qgb qgbVar = W;
        zgbVar.a = new bhb(false, ygbVar, qgbVar, 0.0f);
        zgbVar.b = new bhb(false, new ygb(i, i3 + i), qgbVar, 0.0f);
        xgbVar.a = zgbVar;
        xgbVar.j = i2;
        arrayList.add(xgbVar);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            i3 = 1;
        }
        ArrayList arrayList = this.Q;
        xgb xgbVar = new xgb(this, arrayList.size());
        xgbVar.c = pagetablecell;
        zgb zgbVar = new zgb();
        int i5 = pagetablecell.rowspan;
        if (i5 == 0) {
            i5 = 1;
        }
        ygb ygbVar = new ygb(i2, i5 + i2);
        qgb qgbVar = W;
        zgbVar.a = new bhb(false, ygbVar, qgbVar, 0.0f);
        zgbVar.b = new bhb(false, new ygb(i, i3 + i), qgbVar, 1.0f);
        xgbVar.a = zgbVar;
        xgbVar.j = i2;
        arrayList.add(xgbVar);
        if (pagetablecell.rowspan > 1) {
            this.L.add(new PointF(i2, i2 + i4));
        }
        h();
    }

    public final void c() {
        boolean z;
        ugb ugbVar;
        bhb bhbVar;
        bhb bhbVar2;
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
                ugbVar = this.c;
            } else {
                ugbVar = this.d;
            }
            int i3 = ugbVar.b;
            if (i3 == Integer.MIN_VALUE) {
                i3 = 0;
            }
            if (i3 >= 0 && i3 <= 1024) {
                int[] iArr = new int[i3];
                int childCount = getChildCount();
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < childCount; i6++) {
                    zgb zgbVar = d(i6).a;
                    if (z) {
                        bhbVar = zgbVar.a;
                    } else {
                        bhbVar = zgbVar.b;
                    }
                    ygb ygbVar = bhbVar.b;
                    boolean z2 = bhbVar.a;
                    int a = ygbVar.a();
                    if (a > 0 && a <= 1024) {
                        if (z2) {
                            i4 = ygbVar.a;
                        }
                        if (z) {
                            bhbVar2 = zgbVar.b;
                        } else {
                            bhbVar2 = zgbVar.a;
                        }
                        ygb ygbVar2 = bhbVar2.b;
                        int a2 = ygbVar2.a();
                        int i7 = ygbVar2.a;
                        if (a2 > 0) {
                            th = null;
                            if (ygbVar2.a() <= 1024) {
                                boolean z3 = bhbVar2.a;
                                int a3 = ygbVar2.a();
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
                                    k(zgbVar, i4, a, i5, a3);
                                } else {
                                    k(zgbVar, i5, a3, i4, a);
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

    public final xgb d(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.Q;
            if (i < arrayList.size()) {
                return (xgb) arrayList.get(i);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        chb chbVar = this.S;
        if (chbVar != null && chbVar.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(xgb xgbVar, boolean z, boolean z2) {
        ugb ugbVar;
        int[] iArr;
        bhb bhbVar;
        int i;
        if (this.h == 1) {
            return f(xgbVar, z, z2);
        }
        if (z) {
            ugbVar = this.c;
        } else {
            ugbVar = this.d;
        }
        if (z2) {
            if (ugbVar.j == null) {
                ugbVar.j = new int[ugbVar.e() + 1];
            }
            if (!ugbVar.k) {
                ugbVar.b(true);
                ugbVar.k = true;
            }
            iArr = ugbVar.j;
        } else {
            if (ugbVar.l == null) {
                ugbVar.l = new int[ugbVar.e() + 1];
            }
            if (!ugbVar.m) {
                ugbVar.b(false);
                ugbVar.m = true;
            }
            iArr = ugbVar.l;
        }
        zgb zgbVar = xgbVar.a;
        if (z) {
            bhbVar = zgbVar.b;
        } else {
            bhbVar = zgbVar.a;
        }
        ygb ygbVar = bhbVar.b;
        if (z2) {
            i = ygbVar.a;
        } else {
            i = ygbVar.b;
        }
        return iArr[i];
    }

    public final int f(xgb xgbVar, boolean z, boolean z2) {
        int i;
        bhb bhbVar;
        ugb ugbVar;
        boolean z3;
        zgb zgbVar = xgbVar.a;
        if (z) {
            if (z2) {
                i = ((ViewGroup.MarginLayoutParams) zgbVar).leftMargin;
            } else {
                i = ((ViewGroup.MarginLayoutParams) zgbVar).rightMargin;
            }
        } else if (z2) {
            i = ((ViewGroup.MarginLayoutParams) zgbVar).topMargin;
        } else {
            i = ((ViewGroup.MarginLayoutParams) zgbVar).bottomMargin;
        }
        if (i == Integer.MIN_VALUE) {
            if (!this.f) {
                return 0;
            }
            if (z) {
                bhbVar = zgbVar.b;
                ugbVar = this.c;
            } else {
                bhbVar = zgbVar.a;
                ugbVar = this.d;
            }
            ygb ygbVar = bhbVar.b;
            if (z && this.J) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != z2) {
                return 0;
            }
            ugbVar.e();
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
        ugb ugbVar = this.c;
        ugbVar.k();
        ugb ugbVar2 = this.d;
        ugbVar2.k();
        if (ugbVar != null && ugbVar2 != null) {
            ugbVar.l();
            ugbVar2.l();
        }
    }

    public final void i(xgb xgbVar, int i, int i2, boolean z) {
        xgbVar.d(e(xgbVar, true, false) + e(xgbVar, true, true) + i, e(xgbVar, false, false) + e(xgbVar, false, true) + i2, z);
    }

    public final void j(int i, boolean z) {
        boolean z2;
        bhb bhbVar;
        ugb ugbVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TextPaint textPaint;
        CharSequence charSequence;
        ogb ogbVar;
        dhb dhbVar = this.P;
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
            ogb[] ogbVarArr = new ogb[childCount];
            int i9 = 0;
            while (i9 < childCount) {
                xgb d = d(i9);
                zgb zgbVar = d.a;
                ygb ygbVar = zgbVar.b.b;
                d.e(dhbVar.c(d.c, max));
                if (d.b == null) {
                    ((ViewGroup.MarginLayoutParams) zgbVar).width = i7;
                    ((ViewGroup.MarginLayoutParams) zgbVar).height = i7;
                    i(d, i7, i7, true);
                } else {
                    ((ViewGroup.MarginLayoutParams) zgbVar).height = Math.max(this.x, d.f + this.r + this.s);
                    int b = d.b.b();
                    if (b > 0) {
                        int i10 = ygbVar.a;
                        int a = ygbVar.a();
                        int i11 = ((ViewGroup.MarginLayoutParams) zgbVar).height * b;
                        ?? obj = new Object();
                        obj.a = i10;
                        obj.b = Math.max(1, a);
                        obj.g = true;
                        int max2 = Math.max(0, i11);
                        obj.e = max2;
                        obj.d = max2;
                        ogbVar = obj;
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
                        ogbVar = cxe.b(charSequence, textPaint, ygbVar.a, ygbVar.a(), i8, max, d.e);
                    }
                    ogbVarArr[i9] = ogbVar;
                    arrayList.add(ogbVar);
                }
                i9++;
                i7 = 0;
            }
            int[] a3 = cxe.a(this.b, size, 0, arrayList);
            for (int i12 = 0; i12 < childCount; i12++) {
                xgb d2 = d(i12);
                ogb ogbVar2 = ogbVarArr[i12];
                if (ogbVar2 != null) {
                    zgb zgbVar2 = d2.a;
                    if (d2.b.b() > 0) {
                        i6 = ogbVar2.e;
                        ((ViewGroup.MarginLayoutParams) zgbVar2).width = i6;
                    } else {
                        ygb ygbVar2 = zgbVar2.b.b;
                        int i13 = 0;
                        for (int max3 = Math.max(0, ygbVar2.a); max3 < Math.min(this.b, ygbVar2.b); max3++) {
                            i13 += a3[max3];
                        }
                        int max4 = Math.max(1, i13 - i8);
                        if (d2.e > max4) {
                            d2.e(dhbVar.c(d2.c, max4));
                            ((ViewGroup.MarginLayoutParams) zgbVar2).height = Math.max(this.x, d2.f + this.r + this.s);
                        }
                        i6 = d2.e + i8;
                        ((ViewGroup.MarginLayoutParams) zgbVar2).width = i6;
                    }
                    i(d2, i6, ((ViewGroup.MarginLayoutParams) zgbVar2).height, true);
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            xgb d3 = d(i14);
            zgb zgbVar3 = d3.a;
            if (z) {
                float size2 = View.MeasureSpec.getSize(i);
                if (this.b == 2) {
                    i3 = ((int) (size2 / 2.0f)) - (this.w << 2);
                } else {
                    i3 = (int) (size2 / 1.5f);
                }
                d3.e(dhbVar.c(d3.c, i3));
                if (d3.b != null) {
                    ((ViewGroup.MarginLayoutParams) zgbVar3).height = Math.max(this.x, d3.f + this.r + this.s);
                    int b2 = d3.b.b();
                    if (b2 > 0) {
                        i4 = ((ViewGroup.MarginLayoutParams) zgbVar3).height * b2;
                    } else {
                        i4 = d3.e + (this.w << 1);
                    }
                    ((ViewGroup.MarginLayoutParams) zgbVar3).width = i4;
                } else {
                    ((ViewGroup.MarginLayoutParams) zgbVar3).width = 0;
                    ((ViewGroup.MarginLayoutParams) zgbVar3).height = 0;
                    i4 = 0;
                }
                i(d3, i4, ((ViewGroup.MarginLayoutParams) zgbVar3).height, true);
            } else {
                if (this.e == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    bhbVar = zgbVar3.b;
                } else {
                    bhbVar = zgbVar3.a;
                }
                bhb bhbVar2 = bhb.e;
                if (bhbVar.a(z2) == W) {
                    ygb ygbVar3 = bhbVar.b;
                    if (z2) {
                        ugbVar = this.c;
                    } else {
                        ugbVar = this.d;
                    }
                    int[] g = ugbVar.g();
                    int e = (g[ygbVar3.b] - g[ygbVar3.a]) - (e(d3, z2, false) + e(d3, z2, true));
                    if (z2) {
                        wgb wgbVar = d3.b;
                        if (wgbVar != null) {
                            i2 = wgbVar.b();
                        } else {
                            i2 = 0;
                        }
                        if (i2 > 0) {
                            int max5 = Math.max(1, Math.round(e / i2));
                            ((ViewGroup.MarginLayoutParams) zgbVar3).height = max5;
                            d3.m = max5;
                        }
                        i(d3, e, ((ViewGroup.MarginLayoutParams) zgbVar3).height, false);
                    } else {
                        i(d3, ((ViewGroup.MarginLayoutParams) zgbVar3).width, e, false);
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
        ehb ehbVar = this;
        ehbVar.c();
        ugb ugbVar = ehbVar.d;
        ugb ugbVar2 = ehbVar.c;
        if (ugbVar2 != null && ugbVar != null) {
            ugbVar2.l();
            ugbVar.l();
        }
        ehbVar.b = 0;
        int childCount = ehbVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ehbVar.b = Math.max(ehbVar.b, ehbVar.d(i7).a.b.b.b);
        }
        ehbVar.j(i, true);
        if (ehbVar.e == 0) {
            i3 = ugbVar2.i(i);
            if (ehbVar.y) {
                i3 = Math.max(i3, View.MeasureSpec.getSize(i));
                ugbVar2.v.a = i3;
                ugbVar2.w.a = -i3;
                ugbVar2.q = false;
                ugbVar2.g();
            }
            ehbVar.j(i, false);
            i4 = ugbVar.i(i2);
        } else {
            int i8 = ugbVar.i(i2);
            ehbVar.j(i, false);
            i3 = ugbVar2.i(i);
            i4 = i8;
        }
        int max = Math.max(i4, ehbVar.getSuggestedMinimumHeight());
        ehbVar.setMeasuredDimension(i3, max);
        ugbVar2.v.a = i3;
        ugbVar2.w.a = -i3;
        ugbVar2.q = false;
        ugbVar2.g();
        ugbVar.v.a = max;
        ugbVar.w.a = -max;
        ugbVar.q = false;
        ugbVar.g();
        int[] g = ugbVar2.g();
        int[] g2 = ugbVar.g();
        int[] copyOf = Arrays.copyOf(g2, g2.length);
        ArrayList arrayList = ehbVar.K;
        arrayList.clear();
        int i9 = g[g.length - 1];
        int childCount2 = ehbVar.getChildCount();
        int i10 = 0;
        while (i10 < childCount2) {
            int i11 = i10;
            xgb d = ehbVar.d(i11);
            zgb zgbVar = d.a;
            bhb bhbVar = zgbVar.b;
            bhb bhbVar2 = zgbVar.a;
            ygb ygbVar = bhbVar.b;
            ygb ygbVar2 = bhbVar2.b;
            int i12 = childCount2;
            int i13 = g[ygbVar.a];
            int i14 = g2[ygbVar2.a];
            int i15 = g[ygbVar.b] - i13;
            int i16 = g2[ygbVar2.b] - i14;
            int i17 = d.k;
            ugb ugbVar3 = ugbVar;
            int i18 = d.l;
            qgb a = bhbVar.a(true);
            qgb a2 = bhbVar2.a(false);
            wm9 f2 = ugbVar2.f();
            vgb vgbVar = (vgb) ((Object[]) f2.d)[((int[]) f2.b)[i11]];
            wm9 f3 = ugbVar3.f();
            ugb ugbVar4 = ugbVar2;
            vgb vgbVar2 = (vgb) ((Object[]) f3.d)[((int[]) f3.b)[i11]];
            int b = a.b(d, i15 - vgbVar.d(true));
            int b2 = a2.b(d, i16 - vgbVar2.d(true));
            int e = ehbVar.e(d, true, true);
            int e2 = ehbVar.e(d, false, true);
            int e3 = ehbVar.e(d, true, false);
            int i19 = e + e3;
            int e4 = e2 + ehbVar.e(d, false, false);
            int a3 = vgbVar.a(ehbVar, d, a, i17 + i19, true);
            ehbVar = this;
            int a4 = vgbVar2.a(ehbVar, d, a2, i18 + e4, false);
            int c = a.c(i17, i15 - i19);
            int c2 = a2.c(i18, i16 - e4);
            int i20 = i13 + b + a3;
            if (!ehbVar.J) {
                f = e + i20;
            } else {
                f = td4.f(i9, c, e3, i20);
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
                    ygb ygbVar3 = d.a.a.b;
                    if (ygbVar3.b - ygbVar3.a <= 1) {
                        ArrayList arrayList2 = ehbVar.L;
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
            ugbVar = ugbVar3;
            childCount2 = i12;
            ugbVar2 = ugbVar4;
        }
        int size2 = arrayList.size();
        int i25 = 0;
        while (i25 < size2) {
            xgb xgbVar = (xgb) arrayList.get(i25);
            int i26 = xgbVar.l;
            int i27 = xgbVar.d;
            int i28 = i26 - xgbVar.m;
            ArrayList arrayList3 = ehbVar.Q;
            int size3 = arrayList3.size();
            for (int i29 = i27 + 1; i29 < size3; i29++) {
                xgb xgbVar2 = (xgb) arrayList3.get(i29);
                if (xgbVar.a.a.b.a != xgbVar2.a.a.b.a) {
                    break;
                }
                int i30 = xgbVar.m;
                int i31 = xgbVar2.m;
                if (i30 < i31) {
                    z = true;
                    break;
                }
                int i32 = xgbVar2.l - i31;
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
                    xgb xgbVar3 = (xgb) arrayList3.get(i33);
                    if (xgbVar.a.a.b.a != xgbVar3.a.a.b.a) {
                        break;
                    }
                    int i34 = xgbVar.m;
                    int i35 = xgbVar3.m;
                    if (i34 < i35) {
                        z = true;
                        break;
                    }
                    int i36 = xgbVar3.l - i35;
                    if (i36 > 0) {
                        i28 = Math.min(i28, i36);
                    }
                    i33--;
                }
            }
            if (!z) {
                xgbVar.l = xgbVar.m;
                xgbVar.g();
                max -= i28;
                int i37 = xgbVar.a.a.b.a;
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
                    xgb xgbVar4 = (xgb) arrayList3.get(i40);
                    if (xgbVar == xgbVar4) {
                        i5 = i40;
                    } else {
                        int i41 = xgbVar.a.a.b.a;
                        int i42 = xgbVar4.a.a.b.a;
                        if (i41 == i42) {
                            if (xgbVar4.m != xgbVar4.l) {
                                arrayList.remove(xgbVar4);
                                if (xgbVar4.d < i27) {
                                    i39--;
                                }
                                i38--;
                            }
                            int i43 = xgbVar4.l - i28;
                            xgbVar4.l = i43;
                            i5 = i40;
                            xgbVar4.d(xgbVar4.k, i43, true);
                        } else {
                            i5 = i40;
                            if (i41 < i42) {
                                xgbVar4.q -= i28;
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
        int childCount3 = ehbVar.getChildCount();
        for (int i44 = 0; i44 < childCount3; i44++) {
            xgb d2 = ehbVar.d(i44);
            ehbVar.P.g(d2.b, d2.c());
            d2.n = d2.p;
            d2.o = d2.k;
        }
        ehbVar.E = i9;
        ehbVar.F = max;
        ehbVar.G = copyOf;
        ehbVar.setMeasuredDimension(i9, max);
    }

    @Override
    public final void requestLayout() {
        ugb ugbVar;
        super.requestLayout();
        ugb ugbVar2 = this.c;
        if (ugbVar2 != null && (ugbVar = this.d) != null) {
            ugbVar2.l();
            ugbVar.l();
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
        ugb ugbVar = this.c;
        ugbVar.u = z;
        ugbVar.k();
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
            xgb d = d(i4);
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
                xgb d2 = d(i9);
                wgb wgbVar = d2.b;
                if (wgbVar != null) {
                    i2 = wgbVar.b();
                } else {
                    i2 = 0;
                }
                if (i2 > 0) {
                    ygb ygbVar = d2.a.a.b;
                    int max = Math.max(0, ygbVar.a);
                    int min = Math.min(i6, ygbVar.b);
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
                xgb d3 = d(i16);
                ygb ygbVar2 = d3.a.a.b;
                int max3 = Math.max(0, Math.min(i6, ygbVar2.a));
                int max4 = Math.max(max3, Math.min(i6, ygbVar2.b));
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
        ugb ugbVar = this.d;
        ugbVar.u = z;
        ugbVar.k();
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
