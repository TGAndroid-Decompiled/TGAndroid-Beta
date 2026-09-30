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
    public static final p f7595i = t.f7606a;
    public static final q f7596j = t.f7607b;
    public final ThreadLocal f7597a = new ThreadLocal();
    public final ConcurrentHashMap f7598b = new ConcurrentHashMap();
    public final of.b f7599c;
    public final gb.j d;
    public final List e;
    public final boolean f7600f;
    public final c f7601g;

    public g(fb.f fVar, HashMap hashMap, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, t tVar, t tVar2, ArrayList arrayList4) {
        gb.p pVar;
        gb.p pVar2;
        of.b bVar = new of.b(hashMap, arrayList4, false, 17);
        this.f7599c = bVar;
        this.f7600f = true;
        this.f7601g = cVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(h1.A);
        if (tVar == t.f7606a) {
            pVar = gb.r.f9577c;
        } else {
            pVar = new gb.p(tVar, 1);
        }
        arrayList5.add(pVar);
        arrayList5.add(fVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(h1.f9557p);
        arrayList5.add(h1.f9549g);
        arrayList5.add(h1.d);
        arrayList5.add(h1.e);
        arrayList5.add(h1.f9548f);
        c0 c0Var = h1.f9552k;
        arrayList5.add(new y0(Long.TYPE, Long.class, c0Var));
        arrayList5.add(new y0(Double.TYPE, Double.class, new d(0)));
        arrayList5.add(new y0(Float.TYPE, Float.class, new d(1)));
        if (tVar2 == t.f7607b) {
            pVar2 = gb.q.f9575b;
        } else {
            pVar2 = new gb.p(new gb.q(tVar2), 0);
        }
        arrayList5.add(pVar2);
        arrayList5.add(h1.h);
        arrayList5.add(h1.f9550i);
        arrayList5.add(new x0(AtomicLong.class, new e(c0Var, 0).nullSafe(), 0));
        arrayList5.add(new x0(AtomicLongArray.class, new e(c0Var, 1).nullSafe(), 0));
        arrayList5.add(h1.f9551j);
        arrayList5.add(h1.f9553l);
        arrayList5.add(h1.f9558q);
        arrayList5.add(h1.f9559r);
        arrayList5.add(new x0(BigDecimal.class, h1.f9554m, 0));
        arrayList5.add(new x0(BigInteger.class, h1.f9555n, 0));
        arrayList5.add(new x0(fb.h.class, h1.f9556o, 0));
        arrayList5.add(h1.f9560s);
        arrayList5.add(h1.f9561t);
        arrayList5.add(h1.v);
        arrayList5.add(h1.f9563w);
        arrayList5.add(h1.f9565y);
        arrayList5.add(h1.f9562u);
        arrayList5.add(h1.f9546b);
        arrayList5.add(gb.h.f9542c);
        arrayList5.add(h1.f9564x);
        if (jb.f.f12954a) {
            arrayList5.add(jb.f.f12956c);
            arrayList5.add(jb.f.f12955b);
            arrayList5.add(jb.f.d);
        }
        arrayList5.add(gb.b.f9532c);
        arrayList5.add(h1.f9545a);
        arrayList5.add(new gb.d(bVar, 0));
        arrayList5.add(new gb.d(bVar, 1));
        gb.j jVar = new gb.j(bVar);
        this.d = jVar;
        arrayList5.add(jVar);
        arrayList5.add(h1.B);
        arrayList5.add(new x(bVar, fVar, jVar, arrayList4));
        this.e = DesugarCollections.unmodifiableList(arrayList5);
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
        ConcurrentHashMap concurrentHashMap = this.f7598b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.f7597a;
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
            Iterator it = this.e.iterator();
            u uVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uVar3 = ((v) it.next()).create(this, aVar);
                if (uVar3 != null) {
                    if (fVar.f7594a == null) {
                        fVar.f7594a = uVar3;
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
        bVar.k(this.f7601g);
        bVar.f14205r = this.f7600f;
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
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Class cls = tLObject.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            f(tLObject, cls, d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final void f(Object obj, Class cls, lb.b bVar) {
        u b10 = b(new kb.a(cls));
        int i10 = bVar.f14204n;
        if (i10 == 2) {
            bVar.f14204n = 1;
        }
        boolean z10 = bVar.f14205r;
        boolean z11 = bVar.v;
        bVar.f14205r = this.f7600f;
        bVar.v = false;
        try {
            try {
                b10.write(bVar, obj);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (AssertionError e7) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e7.getMessage(), e7);
            }
        } finally {
            bVar.l(i10);
            bVar.f14205r = z10;
            bVar.v = z11;
        }
    }

    public final void g(lb.b bVar) {
        k kVar = k.f7603a;
        int i10 = bVar.f14204n;
        boolean z10 = bVar.f14205r;
        boolean z11 = bVar.v;
        bVar.f14205r = this.f7600f;
        bVar.v = false;
        if (i10 == 2) {
            bVar.f14204n = 1;
        }
        try {
            try {
                try {
                    fb.d.l(kVar, bVar);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (AssertionError e7) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e7.getMessage(), e7);
            }
        } finally {
            bVar.l(i10);
            bVar.f14205r = z10;
            bVar.v = z11;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.f7599c + "}";
    }
}
