package db;

import gb.c0;
import gb.h1;
import gb.x;
import gb.x0;
import gb.y0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.telegram.tgnet.TLObject;
public final class g {
    public static final c h = c.d;
    public static final p f6673i = t.f6685a;
    public static final q f6674j = t.f6686b;
    public final ThreadLocal f6675a = new ThreadLocal();
    public final ConcurrentHashMap f6676b = new ConcurrentHashMap();
    public final pf.b f6677c;
    public final gb.j d;
    public final List f6678e;
    public final boolean f6679f;
    public final c f6680g;

    public g(fb.f fVar, HashMap hashMap, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, t tVar, t tVar2, ArrayList arrayList4) {
        gb.p pVar;
        gb.p pVar2;
        pf.b bVar = new pf.b(hashMap, arrayList4, false, 17);
        this.f6677c = bVar;
        this.f6679f = true;
        this.f6680g = cVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(h1.A);
        if (tVar == t.f6685a) {
            pVar = gb.r.f10549c;
        } else {
            pVar = new gb.p(tVar, 1);
        }
        arrayList5.add(pVar);
        arrayList5.add(fVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(h1.f10529p);
        arrayList5.add(h1.f10521g);
        arrayList5.add(h1.d);
        arrayList5.add(h1.f10519e);
        arrayList5.add(h1.f10520f);
        c0 c0Var = h1.f10524k;
        arrayList5.add(new y0(Long.TYPE, Long.class, c0Var));
        arrayList5.add(new y0(Double.TYPE, Double.class, new d(0)));
        arrayList5.add(new y0(Float.TYPE, Float.class, new d(1)));
        if (tVar2 == t.f6686b) {
            pVar2 = gb.q.f10547b;
        } else {
            pVar2 = new gb.p(new gb.q(tVar2), 0);
        }
        arrayList5.add(pVar2);
        arrayList5.add(h1.h);
        arrayList5.add(h1.f10522i);
        arrayList5.add(new x0(AtomicLong.class, new e(c0Var, 0).nullSafe(), 0));
        arrayList5.add(new x0(AtomicLongArray.class, new e(c0Var, 1).nullSafe(), 0));
        arrayList5.add(h1.f10523j);
        arrayList5.add(h1.f10525l);
        arrayList5.add(h1.f10530q);
        arrayList5.add(h1.f10531r);
        arrayList5.add(new x0(BigDecimal.class, h1.f10526m, 0));
        arrayList5.add(new x0(BigInteger.class, h1.f10527n, 0));
        arrayList5.add(new x0(fb.h.class, h1.f10528o, 0));
        arrayList5.add(h1.f10532s);
        arrayList5.add(h1.f10533t);
        arrayList5.add(h1.v);
        arrayList5.add(h1.f10535w);
        arrayList5.add(h1.f10537y);
        arrayList5.add(h1.f10534u);
        arrayList5.add(h1.f10517b);
        arrayList5.add(gb.h.f10513c);
        arrayList5.add(h1.f10536x);
        if (jb.f.f13592a) {
            arrayList5.add(jb.f.f13594c);
            arrayList5.add(jb.f.f13593b);
            arrayList5.add(jb.f.d);
        }
        arrayList5.add(gb.b.f10503c);
        arrayList5.add(h1.f10516a);
        arrayList5.add(new gb.d(bVar, 0));
        arrayList5.add(new gb.d(bVar, 1));
        gb.j jVar = new gb.j(bVar);
        this.d = jVar;
        arrayList5.add(jVar);
        arrayList5.add(h1.B);
        arrayList5.add(new x(bVar, fVar, jVar, arrayList4));
        this.f6678e = DesugarCollections.unmodifiableList(arrayList5);
    }

    public static void a(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return;
        }
        throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public final u b(kb.a aVar) {
        boolean z10;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f6676b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.f6675a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z10 = true;
        } else {
            u uVar2 = (u) map.get(aVar);
            if (uVar2 != null) {
                return uVar2;
            }
            z10 = false;
        }
        try {
            f fVar = new f();
            map.put(aVar, fVar);
            Iterator it = this.f6678e.iterator();
            u uVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uVar3 = ((v) it.next()).create(this, aVar);
                if (uVar3 != null) {
                    if (fVar.f6672a == null) {
                        fVar.f6672a = uVar3;
                        map.put(aVar, uVar3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (z10) {
                threadLocal.remove();
            }
            if (uVar3 != null) {
                if (z10) {
                    concurrentHashMap.putAll(map);
                }
                return uVar3;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + aVar);
        } catch (Throwable th2) {
            if (z10) {
                threadLocal.remove();
            }
            throw th2;
        }
    }

    public final db.u c(db.v r7, kb.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: db.g.c(db.v, kb.a):db.u");
    }

    public final lb.b d(Writer writer) {
        lb.b bVar = new lb.b(writer);
        bVar.k(this.f6680g);
        bVar.f15357r = this.f6679f;
        bVar.l(2);
        bVar.v = false;
        return bVar;
    }

    public final String e(TLObject tLObject) {
        if (tLObject == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(d(stringWriter));
                return stringWriter.toString();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
        Class cls = tLObject.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            f(tLObject, cls, d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void f(Object obj, Class cls, lb.b bVar) {
        u b10 = b(new kb.a(cls));
        int i10 = bVar.f15356n;
        if (i10 == 2) {
            bVar.f15356n = 1;
        }
        boolean z10 = bVar.f15357r;
        boolean z11 = bVar.v;
        bVar.f15357r = this.f6679f;
        bVar.v = false;
        try {
            try {
                b10.write(bVar, obj);
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
            }
        } finally {
            bVar.l(i10);
            bVar.f15357r = z10;
            bVar.v = z11;
        }
    }

    public final void g(lb.b bVar) {
        k kVar = k.f6682a;
        int i10 = bVar.f15356n;
        boolean z10 = bVar.f15357r;
        boolean z11 = bVar.v;
        bVar.f15357r = this.f6679f;
        bVar.v = false;
        if (i10 == 2) {
            bVar.f15356n = 1;
        }
        try {
            try {
                try {
                    fb.d.l(kVar, bVar);
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
            }
        } finally {
            bVar.l(i10);
            bVar.f15357r = z10;
            bVar.v = z11;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f6678e + ",instanceCreators:" + this.f6677c + "}";
    }
}
