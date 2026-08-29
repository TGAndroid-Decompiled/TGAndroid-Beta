package na;

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
import qa.c0;
import qa.h1;
import qa.x;
import qa.x0;
import qa.y0;
public final class g {
    public static final c h = c.d;
    public static final p f17184i = t.f17196a;
    public static final q f17185j = t.f17197b;
    public final ThreadLocal f17186a = new ThreadLocal();
    public final ConcurrentHashMap f17187b = new ConcurrentHashMap();
    public final oc.i f17188c;
    public final qa.j d;
    public final List f17189e;
    public final boolean f17190f;
    public final c f17191g;

    public g(pa.f fVar, HashMap hashMap, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, t tVar, t tVar2, ArrayList arrayList4) {
        qa.p pVar;
        qa.p pVar2;
        oc.i iVar = new oc.i(19, hashMap, arrayList4);
        this.f17188c = iVar;
        this.f17190f = true;
        this.f17191g = cVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(h1.A);
        if (tVar == t.f17196a) {
            pVar = qa.r.f46564c;
        } else {
            pVar = new qa.p(tVar, 1);
        }
        arrayList5.add(pVar);
        arrayList5.add(fVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(h1.f46544p);
        arrayList5.add(h1.f46536g);
        arrayList5.add(h1.d);
        arrayList5.add(h1.f46534e);
        arrayList5.add(h1.f46535f);
        c0 c0Var = h1.f46539k;
        arrayList5.add(new y0(Long.TYPE, Long.class, c0Var));
        arrayList5.add(new y0(Double.TYPE, Double.class, new d(0)));
        arrayList5.add(new y0(Float.TYPE, Float.class, new d(1)));
        if (tVar2 == t.f17197b) {
            pVar2 = qa.q.f46562b;
        } else {
            pVar2 = new qa.p(new qa.q(tVar2), 0);
        }
        arrayList5.add(pVar2);
        arrayList5.add(h1.h);
        arrayList5.add(h1.f46537i);
        arrayList5.add(new x0(AtomicLong.class, new e(c0Var, 0).nullSafe(), 0));
        arrayList5.add(new x0(AtomicLongArray.class, new e(c0Var, 1).nullSafe(), 0));
        arrayList5.add(h1.f46538j);
        arrayList5.add(h1.f46540l);
        arrayList5.add(h1.f46545q);
        arrayList5.add(h1.f46546r);
        arrayList5.add(new x0(BigDecimal.class, h1.f46541m, 0));
        arrayList5.add(new x0(BigInteger.class, h1.f46542n, 0));
        arrayList5.add(new x0(pa.h.class, h1.f46543o, 0));
        arrayList5.add(h1.f46547s);
        arrayList5.add(h1.f46548t);
        arrayList5.add(h1.v);
        arrayList5.add(h1.f46550w);
        arrayList5.add(h1.f46552y);
        arrayList5.add(h1.f46549u);
        arrayList5.add(h1.f46532b);
        arrayList5.add(qa.h.f46528c);
        arrayList5.add(h1.f46551x);
        if (ta.f.f48188a) {
            arrayList5.add(ta.f.f48190c);
            arrayList5.add(ta.f.f48189b);
            arrayList5.add(ta.f.d);
        }
        arrayList5.add(qa.b.f46518c);
        arrayList5.add(h1.f46531a);
        arrayList5.add(new qa.d(0, iVar));
        arrayList5.add(new qa.d(1, iVar));
        qa.j jVar = new qa.j(iVar);
        this.d = jVar;
        arrayList5.add(jVar);
        arrayList5.add(h1.B);
        arrayList5.add(new x(iVar, fVar, jVar, arrayList4));
        this.f17189e = DesugarCollections.unmodifiableList(arrayList5);
    }

    public static void a(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return;
        }
        throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public final u b(ua.a aVar) {
        boolean z10;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f17187b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.f17186a;
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
            Iterator it = this.f17189e.iterator();
            u uVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uVar3 = ((v) it.next()).create(this, aVar);
                if (uVar3 != null) {
                    if (fVar.f17183a == null) {
                        fVar.f17183a = uVar3;
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

    public final na.u c(na.v r7, ua.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: na.g.c(na.v, ua.a):na.u");
    }

    public final va.b d(Writer writer) {
        va.b bVar = new va.b(writer);
        bVar.k(this.f17191g);
        bVar.f49495r = this.f17190f;
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

    public final void f(Object obj, Class cls, va.b bVar) {
        u b10 = b(new ua.a(cls));
        int i10 = bVar.f49494n;
        if (i10 == 2) {
            bVar.f49494n = 1;
        }
        boolean z10 = bVar.f49495r;
        boolean z11 = bVar.v;
        bVar.f49495r = this.f17190f;
        bVar.v = false;
        try {
            try {
                b10.write(bVar, obj);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e11.getMessage(), e11);
            }
        } finally {
            bVar.l(i10);
            bVar.f49495r = z10;
            bVar.v = z11;
        }
    }

    public final void g(va.b bVar) {
        k kVar = k.f17193a;
        int i10 = bVar.f49494n;
        boolean z10 = bVar.f49495r;
        boolean z11 = bVar.v;
        bVar.f49495r = this.f17190f;
        bVar.v = false;
        if (i10 == 2) {
            bVar.f49494n = 1;
        }
        try {
            try {
                try {
                    pa.d.l(kVar, bVar);
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e11.getMessage(), e11);
            }
        } finally {
            bVar.l(i10);
            bVar.f49495r = z10;
            bVar.v = z11;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f17189e + ",instanceCreators:" + this.f17188c + "}";
    }
}
