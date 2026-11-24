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
public final class efb extends View {
    public static final qeb T = new qeb((byte) 0);
    public static final qeb U = new qeb((byte) 1);
    public static final qeb V = new qeb((byte) 3);
    public static final qeb W = new qeb((byte) 4);
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
    public final dfb P;
    public final ArrayList Q;
    public boolean R;
    public final cfb S;
    public final fib a;
    public int b;
    public final ueb c;
    public final ueb d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public efb(Context context, dfb dfbVar, fib fibVar) {
        super(context);
        this.c = new ueb(this, true);
        this.d = new ueb(this, false);
        this.e = 0;
        this.f = false;
        this.h = 1;
        this.n = 0;
        this.r = gl.L(8.0f);
        this.s = gl.L(9.0f);
        this.w = gl.L(12.0f);
        this.y = true;
        this.G = new int[0];
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new Path();
        this.N = new RectF();
        this.O = new float[8];
        this.Q = new ArrayList();
        this.a = fibVar;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.P = dfbVar;
        cfb cfbVar = new cfb(this, this);
        this.S = cfbVar;
        jdc.k(this, cfbVar);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(str.concat(". "));
    }

    public static void k(zeb zebVar, int i, int i2, int i3, int i4) {
        yeb yebVar = new yeb(i, i2 + i);
        bfb bfbVar = zebVar.a;
        zebVar.a = new bfb(bfbVar.a, yebVar, bfbVar.c, bfbVar.d);
        yeb yebVar2 = new yeb(i3, i4 + i3);
        bfb bfbVar2 = zebVar.b;
        zebVar.b = new bfb(bfbVar2.a, yebVar2, bfbVar2.c, bfbVar2.d);
    }

    public final void a(int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.Q;
        xeb xebVar = new xeb(this, arrayList.size());
        zeb zebVar = new zeb();
        yeb yebVar = new yeb(i2, i4 + i2);
        qeb qebVar = W;
        zebVar.a = new bfb(false, yebVar, qebVar, 0.0f);
        zebVar.b = new bfb(false, new yeb(i, i3 + i), qebVar, 0.0f);
        xebVar.a = zebVar;
        xebVar.j = i2;
        arrayList.add(xebVar);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            i3 = 1;
        }
        ArrayList arrayList = this.Q;
        xeb xebVar = new xeb(this, arrayList.size());
        xebVar.c = pagetablecell;
        zeb zebVar = new zeb();
        int i5 = pagetablecell.rowspan;
        if (i5 == 0) {
            i5 = 1;
        }
        yeb yebVar = new yeb(i2, i5 + i2);
        qeb qebVar = W;
        zebVar.a = new bfb(false, yebVar, qebVar, 0.0f);
        zebVar.b = new bfb(false, new yeb(i, i3 + i), qebVar, 1.0f);
        xebVar.a = zebVar;
        xebVar.j = i2;
        arrayList.add(xebVar);
        if (pagetablecell.rowspan > 1) {
            this.L.add(new PointF(i2, i2 + i4));
        }
        h();
    }

    public final void c() {
        boolean z;
        ueb uebVar;
        bfb bfbVar;
        bfb bfbVar2;
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
                uebVar = this.c;
            } else {
                uebVar = this.d;
            }
            int i3 = uebVar.b;
            if (i3 == Integer.MIN_VALUE) {
                i3 = 0;
            }
            if (i3 >= 0 && i3 <= 1024) {
                int[] iArr = new int[i3];
                int childCount = getChildCount();
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < childCount; i6++) {
                    zeb zebVar = d(i6).a;
                    if (z) {
                        bfbVar = zebVar.a;
                    } else {
                        bfbVar = zebVar.b;
                    }
                    yeb yebVar = bfbVar.b;
                    boolean z2 = bfbVar.a;
                    int a = yebVar.a();
                    if (a > 0 && a <= 1024) {
                        if (z2) {
                            i4 = yebVar.a;
                        }
                        if (z) {
                            bfbVar2 = zebVar.b;
                        } else {
                            bfbVar2 = zebVar.a;
                        }
                        yeb yebVar2 = bfbVar2.b;
                        int a2 = yebVar2.a();
                        int i7 = yebVar2.a;
                        if (a2 > 0) {
                            th = null;
                            if (yebVar2.a() <= 1024) {
                                boolean z3 = bfbVar2.a;
                                int a3 = yebVar2.a();
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
                                    k(zebVar, i4, a, i5, a3);
                                } else {
                                    k(zebVar, i5, a3, i4, a);
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

    public final xeb d(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.Q;
            if (i < arrayList.size()) {
                return (xeb) arrayList.get(i);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        cfb cfbVar = this.S;
        if (cfbVar != null && cfbVar.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(xeb xebVar, boolean z, boolean z2) {
        ueb uebVar;
        int[] iArr;
        bfb bfbVar;
        int i;
        if (this.h == 1) {
            return f(xebVar, z, z2);
        }
        if (z) {
            uebVar = this.c;
        } else {
            uebVar = this.d;
        }
        if (z2) {
            if (uebVar.j == null) {
                uebVar.j = new int[uebVar.e() + 1];
            }
            if (!uebVar.k) {
                uebVar.b(true);
                uebVar.k = true;
            }
            iArr = uebVar.j;
        } else {
            if (uebVar.l == null) {
                uebVar.l = new int[uebVar.e() + 1];
            }
            if (!uebVar.m) {
                uebVar.b(false);
                uebVar.m = true;
            }
            iArr = uebVar.l;
        }
        zeb zebVar = xebVar.a;
        if (z) {
            bfbVar = zebVar.b;
        } else {
            bfbVar = zebVar.a;
        }
        yeb yebVar = bfbVar.b;
        if (z2) {
            i = yebVar.a;
        } else {
            i = yebVar.b;
        }
        return iArr[i];
    }

    public final int f(xeb xebVar, boolean z, boolean z2) {
        int i;
        bfb bfbVar;
        ueb uebVar;
        boolean z3;
        zeb zebVar = xebVar.a;
        if (z) {
            if (z2) {
                i = ((ViewGroup.MarginLayoutParams) zebVar).leftMargin;
            } else {
                i = ((ViewGroup.MarginLayoutParams) zebVar).rightMargin;
            }
        } else if (z2) {
            i = ((ViewGroup.MarginLayoutParams) zebVar).topMargin;
        } else {
            i = ((ViewGroup.MarginLayoutParams) zebVar).bottomMargin;
        }
        if (i == Integer.MIN_VALUE) {
            if (!this.f) {
                return 0;
            }
            if (z) {
                bfbVar = zebVar.b;
                uebVar = this.c;
            } else {
                bfbVar = zebVar.a;
                uebVar = this.d;
            }
            yeb yebVar = bfbVar.b;
            if (z && this.J) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != z2) {
                return 0;
            }
            uebVar.e();
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
        ueb uebVar = this.c;
        uebVar.k();
        ueb uebVar2 = this.d;
        uebVar2.k();
        if (uebVar != null && uebVar2 != null) {
            uebVar.l();
            uebVar2.l();
        }
    }

    public final void i(xeb xebVar, int i, int i2, boolean z) {
        xebVar.d(e(xebVar, true, false) + e(xebVar, true, true) + i, e(xebVar, false, false) + e(xebVar, false, true) + i2, z);
    }

    public final void j(int i, boolean z) {
        boolean z2;
        bfb bfbVar;
        ueb uebVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TextPaint textPaint;
        CharSequence charSequence;
        oeb oebVar;
        dfb dfbVar = this.P;
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
            oeb[] oebVarArr = new oeb[childCount];
            int i9 = 0;
            while (i9 < childCount) {
                xeb d = d(i9);
                zeb zebVar = d.a;
                yeb yebVar = zebVar.b.b;
                d.e(dfbVar.c(d.c, max));
                if (d.b == null) {
                    ((ViewGroup.MarginLayoutParams) zebVar).width = i7;
                    ((ViewGroup.MarginLayoutParams) zebVar).height = i7;
                    i(d, i7, i7, true);
                } else {
                    ((ViewGroup.MarginLayoutParams) zebVar).height = Math.max(this.x, d.f + this.r + this.s);
                    int b = d.b.b();
                    if (b > 0) {
                        int i10 = yebVar.a;
                        int a = yebVar.a();
                        int i11 = ((ViewGroup.MarginLayoutParams) zebVar).height * b;
                        ?? obj = new Object();
                        obj.a = i10;
                        obj.b = Math.max(1, a);
                        obj.g = true;
                        int max2 = Math.max(0, i11);
                        obj.e = max2;
                        obj.d = max2;
                        oebVar = obj;
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
                        oebVar = ave.b(charSequence, textPaint, yebVar.a, yebVar.a(), i8, max, d.e);
                    }
                    oebVarArr[i9] = oebVar;
                    arrayList.add(oebVar);
                }
                i9++;
                i7 = 0;
            }
            int[] a3 = ave.a(this.b, size, 0, arrayList);
            for (int i12 = 0; i12 < childCount; i12++) {
                xeb d2 = d(i12);
                oeb oebVar2 = oebVarArr[i12];
                if (oebVar2 != null) {
                    zeb zebVar2 = d2.a;
                    if (d2.b.b() > 0) {
                        i6 = oebVar2.e;
                        ((ViewGroup.MarginLayoutParams) zebVar2).width = i6;
                    } else {
                        yeb yebVar2 = zebVar2.b.b;
                        int i13 = 0;
                        for (int max3 = Math.max(0, yebVar2.a); max3 < Math.min(this.b, yebVar2.b); max3++) {
                            i13 += a3[max3];
                        }
                        int max4 = Math.max(1, i13 - i8);
                        if (d2.e > max4) {
                            d2.e(dfbVar.c(d2.c, max4));
                            ((ViewGroup.MarginLayoutParams) zebVar2).height = Math.max(this.x, d2.f + this.r + this.s);
                        }
                        i6 = d2.e + i8;
                        ((ViewGroup.MarginLayoutParams) zebVar2).width = i6;
                    }
                    i(d2, i6, ((ViewGroup.MarginLayoutParams) zebVar2).height, true);
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            xeb d3 = d(i14);
            zeb zebVar3 = d3.a;
            if (z) {
                float size2 = View.MeasureSpec.getSize(i);
                if (this.b == 2) {
                    i3 = ((int) (size2 / 2.0f)) - (this.w << 2);
                } else {
                    i3 = (int) (size2 / 1.5f);
                }
                d3.e(dfbVar.c(d3.c, i3));
                if (d3.b != null) {
                    ((ViewGroup.MarginLayoutParams) zebVar3).height = Math.max(this.x, d3.f + this.r + this.s);
                    int b2 = d3.b.b();
                    if (b2 > 0) {
                        i4 = ((ViewGroup.MarginLayoutParams) zebVar3).height * b2;
                    } else {
                        i4 = d3.e + (this.w << 1);
                    }
                    ((ViewGroup.MarginLayoutParams) zebVar3).width = i4;
                } else {
                    ((ViewGroup.MarginLayoutParams) zebVar3).width = 0;
                    ((ViewGroup.MarginLayoutParams) zebVar3).height = 0;
                    i4 = 0;
                }
                i(d3, i4, ((ViewGroup.MarginLayoutParams) zebVar3).height, true);
            } else {
                if (this.e == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    bfbVar = zebVar3.b;
                } else {
                    bfbVar = zebVar3.a;
                }
                bfb bfbVar2 = bfb.e;
                if (bfbVar.a(z2) == W) {
                    yeb yebVar3 = bfbVar.b;
                    if (z2) {
                        uebVar = this.c;
                    } else {
                        uebVar = this.d;
                    }
                    int[] g = uebVar.g();
                    int e = (g[yebVar3.b] - g[yebVar3.a]) - (e(d3, z2, false) + e(d3, z2, true));
                    if (z2) {
                        web webVar = d3.b;
                        if (webVar != null) {
                            i2 = webVar.b();
                        } else {
                            i2 = 0;
                        }
                        if (i2 > 0) {
                            int max5 = Math.max(1, Math.round(e / i2));
                            ((ViewGroup.MarginLayoutParams) zebVar3).height = max5;
                            d3.m = max5;
                        }
                        i(d3, e, ((ViewGroup.MarginLayoutParams) zebVar3).height, false);
                    } else {
                        i(d3, ((ViewGroup.MarginLayoutParams) zebVar3).width, e, false);
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
        efb efbVar = this;
        efbVar.c();
        ueb uebVar = efbVar.d;
        ueb uebVar2 = efbVar.c;
        if (uebVar2 != null && uebVar != null) {
            uebVar2.l();
            uebVar.l();
        }
        efbVar.b = 0;
        int childCount = efbVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            efbVar.b = Math.max(efbVar.b, efbVar.d(i7).a.b.b.b);
        }
        efbVar.j(i, true);
        if (efbVar.e == 0) {
            i3 = uebVar2.i(i);
            if (efbVar.y) {
                i3 = Math.max(i3, View.MeasureSpec.getSize(i));
                uebVar2.v.a = i3;
                uebVar2.w.a = -i3;
                uebVar2.q = false;
                uebVar2.g();
            }
            efbVar.j(i, false);
            i4 = uebVar.i(i2);
        } else {
            int i8 = uebVar.i(i2);
            efbVar.j(i, false);
            i3 = uebVar2.i(i);
            i4 = i8;
        }
        int max = Math.max(i4, efbVar.getSuggestedMinimumHeight());
        efbVar.setMeasuredDimension(i3, max);
        uebVar2.v.a = i3;
        uebVar2.w.a = -i3;
        uebVar2.q = false;
        uebVar2.g();
        uebVar.v.a = max;
        uebVar.w.a = -max;
        uebVar.q = false;
        uebVar.g();
        int[] g = uebVar2.g();
        int[] g2 = uebVar.g();
        int[] copyOf = Arrays.copyOf(g2, g2.length);
        ArrayList arrayList = efbVar.K;
        arrayList.clear();
        int i9 = g[g.length - 1];
        int childCount2 = efbVar.getChildCount();
        int i10 = 0;
        while (i10 < childCount2) {
            int i11 = i10;
            xeb d = efbVar.d(i11);
            zeb zebVar = d.a;
            bfb bfbVar = zebVar.b;
            bfb bfbVar2 = zebVar.a;
            yeb yebVar = bfbVar.b;
            yeb yebVar2 = bfbVar2.b;
            int i12 = childCount2;
            int i13 = g[yebVar.a];
            int i14 = g2[yebVar2.a];
            int i15 = g[yebVar.b] - i13;
            int i16 = g2[yebVar2.b] - i14;
            int i17 = d.k;
            ueb uebVar3 = uebVar;
            int i18 = d.l;
            qeb a = bfbVar.a(true);
            qeb a2 = bfbVar2.a(false);
            vk9 f2 = uebVar2.f();
            veb vebVar = (veb) ((Object[]) f2.d)[((int[]) f2.b)[i11]];
            vk9 f3 = uebVar3.f();
            ueb uebVar4 = uebVar2;
            veb vebVar2 = (veb) ((Object[]) f3.d)[((int[]) f3.b)[i11]];
            int b = a.b(d, i15 - vebVar.d(true));
            int b2 = a2.b(d, i16 - vebVar2.d(true));
            int e = efbVar.e(d, true, true);
            int e2 = efbVar.e(d, false, true);
            int e3 = efbVar.e(d, true, false);
            int i19 = e + e3;
            int e4 = e2 + efbVar.e(d, false, false);
            int a3 = vebVar.a(efbVar, d, a, i17 + i19, true);
            efbVar = this;
            int a4 = vebVar2.a(efbVar, d, a2, i18 + e4, false);
            int c = a.c(i17, i15 - i19);
            int c2 = a2.c(i18, i16 - e4);
            int i20 = i13 + b + a3;
            if (!efbVar.J) {
                f = e + i20;
            } else {
                f = tb4.f(i9, c, e3, i20);
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
                    yeb yebVar3 = d.a.a.b;
                    if (yebVar3.b - yebVar3.a <= 1) {
                        ArrayList arrayList2 = efbVar.L;
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
            uebVar = uebVar3;
            childCount2 = i12;
            uebVar2 = uebVar4;
        }
        int size2 = arrayList.size();
        int i25 = 0;
        while (i25 < size2) {
            xeb xebVar = (xeb) arrayList.get(i25);
            int i26 = xebVar.l;
            int i27 = xebVar.d;
            int i28 = i26 - xebVar.m;
            ArrayList arrayList3 = efbVar.Q;
            int size3 = arrayList3.size();
            for (int i29 = i27 + 1; i29 < size3; i29++) {
                xeb xebVar2 = (xeb) arrayList3.get(i29);
                if (xebVar.a.a.b.a != xebVar2.a.a.b.a) {
                    break;
                }
                int i30 = xebVar.m;
                int i31 = xebVar2.m;
                if (i30 < i31) {
                    z = true;
                    break;
                }
                int i32 = xebVar2.l - i31;
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
                    xeb xebVar3 = (xeb) arrayList3.get(i33);
                    if (xebVar.a.a.b.a != xebVar3.a.a.b.a) {
                        break;
                    }
                    int i34 = xebVar.m;
                    int i35 = xebVar3.m;
                    if (i34 < i35) {
                        z = true;
                        break;
                    }
                    int i36 = xebVar3.l - i35;
                    if (i36 > 0) {
                        i28 = Math.min(i28, i36);
                    }
                    i33--;
                }
            }
            if (!z) {
                xebVar.l = xebVar.m;
                xebVar.g();
                max -= i28;
                int i37 = xebVar.a.a.b.a;
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
                    xeb xebVar4 = (xeb) arrayList3.get(i40);
                    if (xebVar == xebVar4) {
                        i5 = i40;
                    } else {
                        int i41 = xebVar.a.a.b.a;
                        int i42 = xebVar4.a.a.b.a;
                        if (i41 == i42) {
                            if (xebVar4.m != xebVar4.l) {
                                arrayList.remove(xebVar4);
                                if (xebVar4.d < i27) {
                                    i39--;
                                }
                                i38--;
                            }
                            int i43 = xebVar4.l - i28;
                            xebVar4.l = i43;
                            i5 = i40;
                            xebVar4.d(xebVar4.k, i43, true);
                        } else {
                            i5 = i40;
                            if (i41 < i42) {
                                xebVar4.q -= i28;
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
        int childCount3 = efbVar.getChildCount();
        for (int i44 = 0; i44 < childCount3; i44++) {
            xeb d2 = efbVar.d(i44);
            efbVar.P.h(d2.b, d2.c());
            d2.n = d2.p;
            d2.o = d2.k;
        }
        efbVar.E = i9;
        efbVar.F = max;
        efbVar.G = copyOf;
        efbVar.setMeasuredDimension(i9, max);
    }

    @Override
    public final void requestLayout() {
        ueb uebVar;
        super.requestLayout();
        ueb uebVar2 = this.c;
        if (uebVar2 != null && (uebVar = this.d) != null) {
            uebVar2.l();
            uebVar.l();
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
        ueb uebVar = this.c;
        uebVar.u = z;
        uebVar.k();
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
            xeb d = d(i4);
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
                xeb d2 = d(i9);
                web webVar = d2.b;
                if (webVar != null) {
                    i2 = webVar.b();
                } else {
                    i2 = 0;
                }
                if (i2 > 0) {
                    yeb yebVar = d2.a.a.b;
                    int max = Math.max(0, yebVar.a);
                    int min = Math.min(i6, yebVar.b);
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
                xeb d3 = d(i16);
                yeb yebVar2 = d3.a.a.b;
                int max3 = Math.max(0, Math.min(i6, yebVar2.a));
                int max4 = Math.max(max3, Math.min(i6, yebVar2.b));
                int i17 = iArr4[max3];
                int i18 = iArr4[max4];
                d3.q = i17;
                d3.l = Math.max(0, i18 - i17);
                if (d3.c != null) {
                    d3.g();
                }
                this.P.h(d3.b, d3.c());
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
        ueb uebVar = this.d;
        uebVar.u = z;
        uebVar.k();
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
