package eb;

import hb.c0;
import hb.h1;
import hb.x;
import hb.x0;
import hb.y0;
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
    public static final p f8686i = t.f8697a;
    public static final q f8687j = t.f8698b;
    public final ThreadLocal f8688a = new ThreadLocal();
    public final ConcurrentHashMap f8689b = new ConcurrentHashMap();
    public final qf.b f8690c;
    public final hb.j d;
    public final List e;
    public final boolean f8691f;
    public final c f8692g;

    public g(gb.h hVar, HashMap hashMap, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, t tVar, t tVar2, ArrayList arrayList4) {
        hb.p pVar;
        hb.p pVar2;
        qf.b bVar = new qf.b(22, hashMap, arrayList4);
        this.f8690c = bVar;
        this.f8691f = true;
        this.f8692g = cVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(h1.A);
        if (tVar == t.f8697a) {
            pVar = hb.r.f10450c;
        } else {
            pVar = new hb.p(tVar, 1);
        }
        arrayList5.add(pVar);
        arrayList5.add(hVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(h1.f10430p);
        arrayList5.add(h1.f10422g);
        arrayList5.add(h1.d);
        arrayList5.add(h1.e);
        arrayList5.add(h1.f10421f);
        c0 c0Var = h1.f10425k;
        arrayList5.add(new y0(Long.TYPE, Long.class, c0Var));
        arrayList5.add(new y0(Double.TYPE, Double.class, new d(0)));
        arrayList5.add(new y0(Float.TYPE, Float.class, new d(1)));
        if (tVar2 == t.f8698b) {
            pVar2 = hb.q.f10448b;
        } else {
            pVar2 = new hb.p(new hb.q(tVar2), 0);
        }
        arrayList5.add(pVar2);
        arrayList5.add(h1.h);
        arrayList5.add(h1.f10423i);
        arrayList5.add(new x0(AtomicLong.class, new e(c0Var, 0).nullSafe(), 0));
        arrayList5.add(new x0(AtomicLongArray.class, new e(c0Var, 1).nullSafe(), 0));
        arrayList5.add(h1.f10424j);
        arrayList5.add(h1.f10426l);
        arrayList5.add(h1.f10431q);
        arrayList5.add(h1.f10432r);
        arrayList5.add(new x0(BigDecimal.class, h1.f10427m, 0));
        arrayList5.add(new x0(BigInteger.class, h1.f10428n, 0));
        arrayList5.add(new x0(gb.j.class, h1.f10429o, 0));
        arrayList5.add(h1.f10433s);
        arrayList5.add(h1.f10434t);
        arrayList5.add(h1.v);
        arrayList5.add(h1.f10436w);
        arrayList5.add(h1.f10438y);
        arrayList5.add(h1.f10435u);
        arrayList5.add(h1.f10419b);
        arrayList5.add(hb.h.f10415c);
        arrayList5.add(h1.f10437x);
        if (kb.f.f14204a) {
            arrayList5.add(kb.f.f14206c);
            arrayList5.add(kb.f.f14205b);
            arrayList5.add(kb.f.d);
        }
        arrayList5.add(hb.b.f10405c);
        arrayList5.add(h1.f10418a);
        arrayList5.add(new hb.d(bVar, 0));
        arrayList5.add(new hb.d(bVar, 1));
        hb.j jVar = new hb.j(bVar);
        this.d = jVar;
        arrayList5.add(jVar);
        arrayList5.add(h1.B);
        arrayList5.add(new x(bVar, hVar, jVar, arrayList4));
        this.e = DesugarCollections.unmodifiableList(arrayList5);
    }

    public static void a(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return;
        }
        throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public final u b(lb.a aVar) {
        boolean z10;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f8689b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.f8688a;
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
                    if (fVar.f8685a == null) {
                        fVar.f8685a = uVar3;
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

    public final eb.u c(eb.v r7, lb.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: eb.g.c(eb.v, lb.a):eb.u");
    }

    public final mb.b d(Writer writer) {
        mb.b bVar = new mb.b(writer);
        bVar.k(this.f8692g);
        bVar.f15486r = this.f8691f;
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

    public final void f(Object obj, Class cls, mb.b bVar) {
        u b10 = b(new lb.a(cls));
        int i10 = bVar.f15485n;
        if (i10 == 2) {
            bVar.f15485n = 1;
        }
        boolean z10 = bVar.f15486r;
        boolean z11 = bVar.v;
        bVar.f15486r = this.f8691f;
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
            bVar.f15486r = z10;
            bVar.v = z11;
        }
    }

    public final void g(mb.b bVar) {
        k kVar = k.f8694a;
        int i10 = bVar.f15485n;
        boolean z10 = bVar.f15486r;
        boolean z11 = bVar.v;
        bVar.f15486r = this.f8691f;
        bVar.v = false;
        if (i10 == 2) {
            bVar.f15485n = 1;
        }
        try {
            try {
                try {
                    gb.d.l(kVar, bVar);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (AssertionError e7) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e7.getMessage(), e7);
            }
        } finally {
            bVar.l(i10);
            bVar.f15486r = z10;
            bVar.v = z11;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.f8690c + "}";
    }
}
