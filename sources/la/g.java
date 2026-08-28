package la;

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
import oa.c0;
import oa.h1;
import oa.x;
import oa.x0;
import oa.y0;
import org.telegram.tgnet.TLObject;
public final class g {
    public static final c h = c.d;
    public static final p f16717i = t.f16729a;
    public static final q f16718j = t.f16730b;
    public final ThreadLocal f16719a = new ThreadLocal();
    public final ConcurrentHashMap f16720b = new ConcurrentHashMap();
    public final g5.b f16721c;
    public final oa.j d;
    public final List f16722e;
    public final boolean f16723f;
    public final c f16724g;

    public g(na.g gVar, HashMap hashMap, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, t tVar, t tVar2, ArrayList arrayList4) {
        oa.p pVar;
        oa.p pVar2;
        g5.b bVar = new g5.b(26, hashMap, arrayList4);
        this.f16721c = bVar;
        this.f16723f = true;
        this.f16724g = cVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(h1.A);
        if (tVar == t.f16729a) {
            pVar = oa.r.f19158c;
        } else {
            pVar = new oa.p(tVar, 1);
        }
        arrayList5.add(pVar);
        arrayList5.add(gVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(h1.f19138p);
        arrayList5.add(h1.f19130g);
        arrayList5.add(h1.d);
        arrayList5.add(h1.f19128e);
        arrayList5.add(h1.f19129f);
        c0 c0Var = h1.f19133k;
        arrayList5.add(new y0(Long.TYPE, Long.class, c0Var));
        arrayList5.add(new y0(Double.TYPE, Double.class, new d(0)));
        arrayList5.add(new y0(Float.TYPE, Float.class, new d(1)));
        if (tVar2 == t.f16730b) {
            pVar2 = oa.q.f19156b;
        } else {
            pVar2 = new oa.p(new oa.q(tVar2), 0);
        }
        arrayList5.add(pVar2);
        arrayList5.add(h1.h);
        arrayList5.add(h1.f19131i);
        arrayList5.add(new x0(AtomicLong.class, new e(c0Var, 0).nullSafe(), 0));
        arrayList5.add(new x0(AtomicLongArray.class, new e(c0Var, 1).nullSafe(), 0));
        arrayList5.add(h1.f19132j);
        arrayList5.add(h1.f19134l);
        arrayList5.add(h1.f19139q);
        arrayList5.add(h1.f19140r);
        arrayList5.add(new x0(BigDecimal.class, h1.f19135m, 0));
        arrayList5.add(new x0(BigInteger.class, h1.f19136n, 0));
        arrayList5.add(new x0(na.i.class, h1.f19137o, 0));
        arrayList5.add(h1.f19141s);
        arrayList5.add(h1.f19142t);
        arrayList5.add(h1.v);
        arrayList5.add(h1.f19144w);
        arrayList5.add(h1.f19146y);
        arrayList5.add(h1.f19143u);
        arrayList5.add(h1.f19126b);
        arrayList5.add(oa.h.f19122c);
        arrayList5.add(h1.f19145x);
        if (ra.f.f47105a) {
            arrayList5.add(ra.f.f47107c);
            arrayList5.add(ra.f.f47106b);
            arrayList5.add(ra.f.d);
        }
        arrayList5.add(oa.b.f19112c);
        arrayList5.add(h1.f19125a);
        arrayList5.add(new oa.d(bVar, 0));
        arrayList5.add(new oa.d(bVar, 1));
        oa.j jVar = new oa.j(bVar);
        this.d = jVar;
        arrayList5.add(jVar);
        arrayList5.add(h1.B);
        arrayList5.add(new x(bVar, gVar, jVar, arrayList4));
        this.f16722e = DesugarCollections.unmodifiableList(arrayList5);
    }

    public static void a(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return;
        }
        throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public final u b(sa.a aVar) {
        boolean z10;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f16720b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.f16719a;
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
            Iterator it = this.f16722e.iterator();
            u uVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uVar3 = ((v) it.next()).create(this, aVar);
                if (uVar3 != null) {
                    if (fVar.f16716a == null) {
                        fVar.f16716a = uVar3;
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
        } catch (Throwable th) {
            if (z10) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final la.u c(la.v r7, sa.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: la.g.c(la.v, sa.a):la.u");
    }

    public final ta.c d(Writer writer) {
        ta.c cVar = new ta.c(writer);
        cVar.k(this.f16724g);
        cVar.f47765r = this.f16723f;
        cVar.l(2);
        cVar.v = false;
        return cVar;
    }

    public final String e(TLObject tLObject) {
        if (tLObject == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(d(stringWriter));
                return stringWriter.toString();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        Class cls = tLObject.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            f(tLObject, cls, d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final void f(Object obj, Class cls, ta.c cVar) {
        u b10 = b(new sa.a(cls));
        int i9 = cVar.f47764n;
        if (i9 == 2) {
            cVar.f47764n = 1;
        }
        boolean z10 = cVar.f47765r;
        boolean z11 = cVar.v;
        cVar.f47765r = this.f16723f;
        cVar.v = false;
        try {
            try {
                b10.write(cVar, obj);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e11.getMessage(), e11);
            }
        } finally {
            cVar.l(i9);
            cVar.f47765r = z10;
            cVar.v = z11;
        }
    }

    public final void g(ta.c cVar) {
        k kVar = k.f16726a;
        int i9 = cVar.f47764n;
        boolean z10 = cVar.f47765r;
        boolean z11 = cVar.v;
        cVar.f47765r = this.f16723f;
        cVar.v = false;
        if (i9 == 2) {
            cVar.f47764n = 1;
        }
        try {
            try {
                try {
                    na.d.l(kVar, cVar);
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e11.getMessage(), e11);
            }
        } finally {
            cVar.l(i9);
            cVar.f47765r = z10;
            cVar.v = z11;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f16722e + ",instanceCreators:" + this.f16721c + "}";
    }
}
