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
public class wl extends Drawable {
    public static SparseArray r;
    public static HashMap s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static final kc w = new kc((byte) 2);
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
    public nl k;
    public boolean m;
    public ColorFilter p;
    public ColorFilter q;
    public float l = 1.0f;
    public Boolean n = null;
    public Boolean o = null;

    public wl(int i, int i2, long j) {
        this.h = i2;
        this.g = i;
        x();
        this.f = j;
        g(i2).b(j, new ml(this, (byte) 0));
    }

    public static TLRPC.Document e(int i, long j) {
        HashMap hashMap = g(i).a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j));
    }

    public static int f() {
        if (xea.o() == 0) {
            return 0;
        }
        return 2;
    }

    public static sl g(int i) {
        HashMap hashMap = s;
        if (hashMap == null) {
            hashMap = new HashMap();
            s = hashMap;
        }
        sl slVar = (sl) hashMap.get(Integer.valueOf(i));
        if (slVar == null) {
            HashMap hashMap2 = s;
            Integer valueOf = Integer.valueOf(i);
            sl slVar2 = new sl(i);
            hashMap2.put(valueOf, slVar2);
            return slVar2;
        }
        return slVar;
    }

    public static wl l(int i, int i2, TLRPC.Document document) {
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
        wl wlVar = (wl) longSparseArray.get(document.id);
        if (wlVar == null) {
            long j = document.id;
            wl wlVar2 = new wl(i2, i, document);
            longSparseArray.put(j, wlVar2);
            return wlVar2;
        }
        return wlVar;
    }

    public static wl m(int i, long j, String str, int i2) {
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
        wl wlVar = (wl) longSparseArray.get(j);
        if (wlVar == null) {
            ?? drawable = new Drawable();
            drawable.l = 1.0f;
            drawable.n = null;
            drawable.o = null;
            drawable.h = i;
            drawable.g = i2;
            drawable.x();
            drawable.f = j;
            drawable.i = str;
            g(i).b(j, new ml(drawable, (byte) 1));
            longSparseArray.put(j, drawable);
            return drawable;
        }
        return wlVar;
    }

    public static void r(int i, boolean z) {
        LongSparseArray longSparseArray;
        nl nlVar;
        boolean z2 = !z;
        if (v != z2) {
            v = z2;
            if (r != null && (longSparseArray = (LongSparseArray) r.get(Objects.hash(Integer.valueOf(i), 25))) != null) {
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    wl wlVar = (wl) longSparseArray.valueAt(i2);
                    if (wlVar != null && (nlVar = wlVar.k) != null) {
                        if (z) {
                            nlVar.v0 = true;
                            nlVar.u0 = true;
                            nlVar.M(1);
                            lm m = nlVar.m();
                            if (m != null) {
                                boolean z3 = nlVar.w0;
                                if (!m.o0) {
                                    m.w0 = z3;
                                }
                                m.start();
                            } else {
                                b29 y = nlVar.y();
                                if (y != null) {
                                    y.start();
                                }
                            }
                        } else {
                            nlVar.u0 = false;
                            nlVar.v0 = false;
                            nlVar.M(0);
                            nlVar.x0();
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
                    wl wlVar = (wl) longSparseArray.get(keyAt);
                    if (wlVar != null && wlVar.a) {
                        wlVar.i(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void w() {
        t = i86.e(16388);
        u = i86.e(8200);
    }

    public final void a(em emVar) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList(10);
            this.c = arrayList;
        }
        this.m = false;
        if (!arrayList.contains(emVar)) {
            this.c.add(emVar);
        }
        u();
    }

    public final void b(View view) {
        if (!(view instanceof p0a)) {
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
        if (!k() && !r47.B4(this.e)) {
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
        nl nlVar = this.k;
        if (nlVar == null) {
            return;
        }
        nlVar.j0(getBounds());
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
        return hl.L(this.d);
    }

    @Override
    public int getIntrinsicWidth() {
        return hl.L(this.d);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl.i(boolean):void");
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
                em emVar = (em) this.c.get(i2);
                if (emVar != null) {
                    emVar.invalidate();
                }
            }
        }
    }

    public final boolean k() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl.k():boolean");
    }

    public final void n(em emVar) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(emVar);
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
        nl nlVar = this.k;
        if (nlVar != null) {
            if (this.g == 8) {
                j = 0;
            }
            nlVar.s = j;
        }
    }

    public final void q(String str) {
        nl nlVar;
        int i = this.g;
        if ((i != 20 && i != 21) || TextUtils.isEmpty(str) || (nlVar = this.k) != null) {
            return;
        }
        if (nlVar == null) {
            nlVar = new nl(this, (byte) 0);
            this.k = nlVar;
            nlVar.d = this.h;
            nlVar.A1 = true;
            if (i == 12) {
                nlVar.y = true;
            }
        }
        this.j = true;
        nlVar.g0(pv3.g(str));
        this.k.B0 = true;
    }

    public final void s(long j) {
        nl nlVar = this.k;
        if (nlVar != null) {
            if (this.g == 8) {
                j = 0;
            }
            if (nlVar.y() != null) {
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
        nl nlVar = this.k;
        if (nlVar != null) {
            nlVar.setAlpha(f);
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
            V = r47.V(document, null, null);
        }
        return c00.k(sb, V, "}");
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
                nl nlVar = this.k;
                if (z) {
                    nlVar.I();
                } else {
                    nlVar.K();
                }
                if (!this.a) {
                    kc kcVar = w;
                    hl.r(kcVar);
                    hl.d3(kcVar, 5000L);
                }
            }
        }
    }

    public final void v(nl nlVar) {
        int i = this.g;
        if (i != 7 && i != 9 && i != 10) {
            if (i != 11 && i != 18 && i != 14 && i != 6 && i != 5 && i != 22) {
                if (i == 17) {
                    nlVar.N(0);
                    return;
                }
                return;
            }
            nlVar.N(1);
            return;
        }
        nlVar.N(2);
    }

    public final void x() {
        int i = this.g;
        if (i != 0 && i != 26) {
            TextPaint[] textPaintArr = aob.y2;
            if (textPaintArr != null && (i == 1 || i == 4 || i == 19 || i == 20)) {
                this.d = (int) (((Math.abs(aob.y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / hl.p);
                return;
            } else if (textPaintArr != null && i == 8) {
                this.d = (int) (((Math.abs(aob.y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / hl.p);
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
        this.d = (int) (((Math.abs(aob.o2.descent()) + Math.abs(aob.o2.ascent())) * 1.15f) / hl.p);
    }

    public wl(int i, int i2, TLRPC.Document document) {
        this.g = i;
        this.h = i2;
        this.e = document;
        x();
        w();
        i(false);
    }
}
