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
    public static final p f7583i = t.f7594a;
    public static final q f7584j = t.f7595b;
    public final ThreadLocal f7585a = new ThreadLocal();
    public final ConcurrentHashMap f7586b = new ConcurrentHashMap();
    public final of.b f7587c;
    public final gb.j d;
    public final List e;
    public final boolean f7588f;
    public final c f7589g;

    public g(fb.f fVar, HashMap hashMap, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, t tVar, t tVar2, ArrayList arrayList4) {
        gb.p pVar;
        gb.p pVar2;
        of.b bVar = new of.b(hashMap, arrayList4, false, 17);
        this.f7587c = bVar;
        this.f7588f = true;
        this.f7589g = cVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(h1.A);
        if (tVar == t.f7594a) {
            pVar = gb.r.f9565c;
        } else {
            pVar = new gb.p(tVar, 1);
        }
        arrayList5.add(pVar);
        arrayList5.add(fVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(h1.f9545p);
        arrayList5.add(h1.f9537g);
        arrayList5.add(h1.d);
        arrayList5.add(h1.e);
        arrayList5.add(h1.f9536f);
        c0 c0Var = h1.f9540k;
        arrayList5.add(new y0(Long.TYPE, Long.class, c0Var));
        arrayList5.add(new y0(Double.TYPE, Double.class, new d(0)));
        arrayList5.add(new y0(Float.TYPE, Float.class, new d(1)));
        if (tVar2 == t.f7595b) {
            pVar2 = gb.q.f9563b;
        } else {
            pVar2 = new gb.p(new gb.q(tVar2), 0);
        }
        arrayList5.add(pVar2);
        arrayList5.add(h1.h);
        arrayList5.add(h1.f9538i);
        arrayList5.add(new x0(AtomicLong.class, new e(c0Var, 0).nullSafe(), 0));
        arrayList5.add(new x0(AtomicLongArray.class, new e(c0Var, 1).nullSafe(), 0));
        arrayList5.add(h1.f9539j);
        arrayList5.add(h1.f9541l);
        arrayList5.add(h1.f9546q);
        arrayList5.add(h1.f9547r);
        arrayList5.add(new x0(BigDecimal.class, h1.f9542m, 0));
        arrayList5.add(new x0(BigInteger.class, h1.f9543n, 0));
        arrayList5.add(new x0(fb.h.class, h1.f9544o, 0));
        arrayList5.add(h1.f9548s);
        arrayList5.add(h1.f9549t);
        arrayList5.add(h1.v);
        arrayList5.add(h1.f9551w);
        arrayList5.add(h1.f9553y);
        arrayList5.add(h1.f9550u);
        arrayList5.add(h1.f9534b);
        arrayList5.add(gb.h.f9530c);
        arrayList5.add(h1.f9552x);
        if (jb.f.f12939a) {
            arrayList5.add(jb.f.f12941c);
            arrayList5.add(jb.f.f12940b);
            arrayList5.add(jb.f.d);
        }
        arrayList5.add(gb.b.f9520c);
        arrayList5.add(h1.f9533a);
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
        ConcurrentHashMap concurrentHashMap = this.f7586b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.f7585a;
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
                    if (fVar.f7582a == null) {
                        fVar.f7582a = uVar3;
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
        bVar.k(this.f7589g);
        bVar.f14189r = this.f7588f;
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
        int i10 = bVar.f14188n;
        if (i10 == 2) {
            bVar.f14188n = 1;
        }
        boolean z10 = bVar.f14189r;
        boolean z11 = bVar.v;
        bVar.f14189r = this.f7588f;
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
            bVar.f14189r = z10;
            bVar.v = z11;
        }
    }

    public final void g(lb.b bVar) {
        k kVar = k.f7591a;
        int i10 = bVar.f14188n;
        boolean z10 = bVar.f14189r;
        boolean z11 = bVar.v;
        bVar.f14189r = this.f7588f;
        bVar.v = false;
        if (i10 == 2) {
            bVar.f14188n = 1;
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
            bVar.f14189r = z10;
            bVar.v = z11;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.f7587c + "}";
    }
}
