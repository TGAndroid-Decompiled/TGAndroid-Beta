package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public class vl extends Drawable {
    public static SparseArray r;
    public static HashMap s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static final jc w = new jc((byte) 2);
    public static HashMap x;
    public boolean a;
    public ArrayList b;
    public ArrayList c;
    public int d;
    public TLRPC.Document e;
    public long f;
    public int g;
    public int h;
    public String i;
    public boolean j;
    public ml k;
    public boolean m;
    public ColorFilter p;
    public ColorFilter q;
    public float l = 1.0f;
    public Boolean n = null;
    public Boolean o = null;

    public vl(int i, int i2, long j) {
        this.h = i2;
        this.g = i;
        x();
        this.f = j;
        g(i2).b(j, new ll(this, (byte) 0));
    }

    public static TLRPC.Document e(int i, long j) {
        HashMap hashMap = g(i).a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j));
    }

    public static int f() {
        if (gba.o() == 0) {
            return 0;
        }
        return 2;
    }

    public static rl g(int i) {
        HashMap hashMap = s;
        if (hashMap == null) {
            hashMap = new HashMap();
            s = hashMap;
        }
        rl rlVar = (rl) hashMap.get(Integer.valueOf(i));
        if (rlVar == null) {
            HashMap hashMap2 = s;
            Integer valueOf = Integer.valueOf(i);
            rl rlVar2 = new rl(i);
            hashMap2.put(valueOf, rlVar2);
            return rlVar2;
        }
        return rlVar;
    }

    public static vl l(int i, int i2, TLRPC.Document document) {
        if (r == null) {
            r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i), Integer.valueOf(i2));
        LongSparseArray longSparseArray = (LongSparseArray) r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        vl vlVar = (vl) longSparseArray.get(document.id);
        if (vlVar == null) {
            long j = document.id;
            vl vlVar2 = new vl(i2, i, document);
            longSparseArray.put(j, vlVar2);
            return vlVar2;
        }
        return vlVar;
    }

    public static vl m(int i, long j, String str, int i2) {
        if (r == null) {
            r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i), Integer.valueOf(i2));
        LongSparseArray longSparseArray = (LongSparseArray) r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        vl vlVar = (vl) longSparseArray.get(j);
        if (vlVar == null) {
            ?? drawable = new Drawable();
            drawable.l = 1.0f;
            drawable.n = null;
            drawable.o = null;
            drawable.h = i;
            drawable.g = i2;
            drawable.x();
            drawable.f = j;
            drawable.i = str;
            g(i).b(j, new ll(drawable, (byte) 1));
            longSparseArray.put(j, drawable);
            return drawable;
        }
        return vlVar;
    }

    public static void r(int i, boolean z) {
        LongSparseArray longSparseArray;
        ml mlVar;
        boolean z2 = !z;
        if (v != z2) {
            v = z2;
            if (r != null && (longSparseArray = (LongSparseArray) r.get(Objects.hash(Integer.valueOf(i), 25))) != null) {
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    vl vlVar = (vl) longSparseArray.valueAt(i2);
                    if (vlVar != null && (mlVar = vlVar.k) != null) {
                        if (z) {
                            mlVar.v0 = true;
                            mlVar.u0 = true;
                            mlVar.M(1);
                            km m = mlVar.m();
                            if (m != null) {
                                boolean z3 = mlVar.w0;
                                if (!m.o0) {
                                    m.w0 = z3;
                                }
                                m.start();
                            } else {
                                oy8 y = mlVar.y();
                                if (y != null) {
                                    y.start();
                                }
                            }
                        } else {
                            mlVar.u0 = false;
                            mlVar.v0 = false;
                            mlVar.M(0);
                            mlVar.x0();
                        }
                    }
                }
            }
        }
    }

    public static void t() {
        if (r != null) {
            w();
            for (int i = 0; i < r.size(); i++) {
                LongSparseArray longSparseArray = (LongSparseArray) r.valueAt(i);
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    long keyAt = longSparseArray.keyAt(i2);
                    vl vlVar = (vl) longSparseArray.get(keyAt);
                    if (vlVar != null && vlVar.a) {
                        vlVar.i(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void w() {
        t = e66.e(16388);
        u = e66.e(8200);
    }

    public final void a(dm dmVar) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList(10);
            this.c = arrayList;
        }
        this.m = false;
        if (!arrayList.contains(dmVar)) {
            this.c.add(dmVar);
        }
        u();
    }

    public final void b(View view) {
        if (!(view instanceof ww9)) {
            this.m = false;
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                arrayList = new ArrayList(10);
                this.b = arrayList;
            }
            if (!arrayList.contains(view)) {
                this.b.add(view);
            }
            u();
            return;
        }
        throw new RuntimeException();
    }

    public final boolean c() {
        boolean z = true;
        if (this.g == 19) {
            return true;
        }
        Boolean bool = this.n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!k() && !k27.B4(this.e)) {
            z = false;
        }
        this.n = Boolean.valueOf(z);
        return z;
    }

    public final void d() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.m = false;
        u();
    }

    @Override
    public final void draw(Canvas canvas) {
        ml mlVar = this.k;
        if (mlVar == null) {
            return;
        }
        mlVar.j0(getBounds());
        this.k.setAlpha(this.l);
        this.k.h(canvas, null);
    }

    @Override
    public final int getAlpha() {
        return (int) (this.l * 255.0f);
    }

    @Override
    public final ColorFilter getColorFilter() {
        return this.q;
    }

    @Override
    public int getIntrinsicHeight() {
        return gl.L(this.d);
    }

    @Override
    public int getIntrinsicWidth() {
        return gl.L(this.d);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final long h() {
        TLRPC.Document document = this.e;
        if (document != null) {
            return document.id;
        }
        return this.f;
    }

    public final void i(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl.i(boolean):void");
    }

    public final void j() {
        if (this.b != null) {
            for (int i = 0; i < this.b.size(); i++) {
                View view = (View) this.b.get(i);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.c != null) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                dm dmVar = (dm) this.c.get(i2);
                if (dmVar != null) {
                    dmVar.invalidate();
                }
            }
        }
    }

    public final boolean k() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl.k():boolean");
    }

    public final void n(dm dmVar) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(dmVar);
        }
        this.m = false;
        u();
    }

    public final void o(View view) {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.m = false;
        u();
    }

    public final void p(long j) {
        ml mlVar = this.k;
        if (mlVar != null) {
            if (this.g == 8) {
                j = 0;
            }
            mlVar.s = j;
        }
    }

    public final void q(String str) {
        ml mlVar;
        int i = this.g;
        if ((i != 20 && i != 21) || TextUtils.isEmpty(str) || (mlVar = this.k) != null) {
            return;
        }
        if (mlVar == null) {
            mlVar = new ml(this, (byte) 0);
            this.k = mlVar;
            mlVar.d = this.h;
            mlVar.A1 = true;
            if (i == 12) {
                mlVar.y = true;
            }
        }
        this.j = true;
        mlVar.g0(vu3.g(str));
        this.k.B0 = true;
    }

    public final void s(long j) {
        ml mlVar = this.k;
        if (mlVar != null) {
            if (this.g == 8) {
                j = 0;
            }
            if (mlVar.y() != null) {
                this.k.y().Q(j);
            }
            if (this.k.m() != null) {
                this.k.m().D(j);
            }
        }
    }

    @Override
    public final void setAlpha(int i) {
        float f = i / 255.0f;
        this.l = f;
        ml mlVar = this.k;
        if (mlVar != null) {
            mlVar.setAlpha(f);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.q = colorFilter;
        if (this.k != null && this.e != null) {
            if (c()) {
                this.k.p1 = colorFilter;
                return;
            }
            return;
        }
        this.p = colorFilter;
    }

    public final String toString() {
        String V;
        StringBuilder sb = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.e;
        if (document == null) {
            V = "null";
        } else {
            V = k27.V(document, null, null);
        }
        return b00.j(sb, V, "}");
    }

    public final void u() {
        ArrayList arrayList;
        boolean z;
        if (this.k != null) {
            ArrayList arrayList2 = this.b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.c) != null && arrayList.size() > 0) || this.m)) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.a) {
                this.a = z;
                ml mlVar = this.k;
                if (z) {
                    mlVar.I();
                } else {
                    mlVar.K();
                }
                if (!this.a) {
                    jc jcVar = w;
                    gl.r(jcVar);
                    gl.e3(jcVar, 5000L);
                }
            }
        }
    }

    public final void v(ml mlVar) {
        int i = this.g;
        if (i != 7 && i != 9 && i != 10) {
            if (i != 11 && i != 18 && i != 14 && i != 6 && i != 5 && i != 22) {
                if (i == 17) {
                    mlVar.N(0);
                    return;
                }
                return;
            }
            mlVar.N(1);
            return;
        }
        mlVar.N(2);
    }

    public final void x() {
        int i = this.g;
        if (i != 0 && i != 26) {
            TextPaint[] textPaintArr = bkb.x2;
            if (textPaintArr != null && (i == 1 || i == 4 || i == 19 || i == 20)) {
                this.d = (int) (((Math.abs(bkb.x2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / gl.p);
                return;
            } else if (textPaintArr != null && i == 8) {
                this.d = (int) (((Math.abs(bkb.x2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / gl.p);
                return;
            } else if (i != 14 && i != 15 && i != 17) {
                if (i != 11 && i != 22) {
                    if (i == 27) {
                        this.d = 50;
                        return;
                    } else if (i == 24) {
                        this.d = 140;
                        return;
                    } else if (i == 23) {
                        this.d = 14;
                        return;
                    } else if (i == 21) {
                        this.d = 90;
                        return;
                    } else {
                        this.d = 34;
                        return;
                    }
                }
                this.d = 56;
                return;
            } else {
                this.d = 100;
                return;
            }
        }
        this.d = (int) (((Math.abs(bkb.n2.descent()) + Math.abs(bkb.n2.ascent())) * 1.15f) / gl.p);
    }

    public vl(int i, int i2, TLRPC.Document document) {
        this.g = i;
        this.h = i2;
        this.e = document;
        x();
        w();
        i(false);
    }
}
