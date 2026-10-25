package fb;

import ib.c0;
import ib.h1;
import ib.x;
import ib.x0;
import ib.y0;
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
    public static final p f10388i = t.f10399a;
    public static final q f10389j = t.f10400b;
    public final ThreadLocal f10390a = new ThreadLocal();
    public final ConcurrentHashMap f10391b = new ConcurrentHashMap();
    public final rf.b f10392c;
    public final ib.j d;
    public final List e;
    public final boolean f10393f;
    public final c f10394g;

    public g(hb.g gVar, HashMap hashMap, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, t tVar, t tVar2, ArrayList arrayList4) {
        ib.p pVar;
        ib.p pVar2;
        rf.b bVar = new rf.b(23, hashMap, arrayList4);
        this.f10392c = bVar;
        this.f10393f = true;
        this.f10394g = cVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(h1.A);
        if (tVar == t.f10399a) {
            pVar = ib.r.f13955c;
        } else {
            pVar = new ib.p(tVar, 1);
        }
        arrayList5.add(pVar);
        arrayList5.add(gVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(h1.f13935p);
        arrayList5.add(h1.f13927g);
        arrayList5.add(h1.d);
        arrayList5.add(h1.e);
        arrayList5.add(h1.f13926f);
        c0 c0Var = h1.f13930k;
        arrayList5.add(new y0(Long.TYPE, Long.class, c0Var));
        arrayList5.add(new y0(Double.TYPE, Double.class, new d(0)));
        arrayList5.add(new y0(Float.TYPE, Float.class, new d(1)));
        if (tVar2 == t.f10400b) {
            pVar2 = ib.q.f13953b;
        } else {
            pVar2 = new ib.p(new ib.q(tVar2), 0);
        }
        arrayList5.add(pVar2);
        arrayList5.add(h1.h);
        arrayList5.add(h1.f13928i);
        arrayList5.add(new x0(AtomicLong.class, new e(c0Var, 0).nullSafe(), 0));
        arrayList5.add(new x0(AtomicLongArray.class, new e(c0Var, 1).nullSafe(), 0));
        arrayList5.add(h1.f13929j);
        arrayList5.add(h1.f13931l);
        arrayList5.add(h1.f13936q);
        arrayList5.add(h1.f13937r);
        arrayList5.add(new x0(BigDecimal.class, h1.f13932m, 0));
        arrayList5.add(new x0(BigInteger.class, h1.f13933n, 0));
        arrayList5.add(new x0(hb.i.class, h1.f13934o, 0));
        arrayList5.add(h1.f13938s);
        arrayList5.add(h1.f13939t);
        arrayList5.add(h1.v);
        arrayList5.add(h1.f13941w);
        arrayList5.add(h1.f13943y);
        arrayList5.add(h1.f13940u);
        arrayList5.add(h1.f13924b);
        arrayList5.add(ib.h.f13920c);
        arrayList5.add(h1.f13942x);
        if (lb.f.f16964a) {
            arrayList5.add(lb.f.f16966c);
            arrayList5.add(lb.f.f16965b);
            arrayList5.add(lb.f.d);
        }
        arrayList5.add(ib.b.f13910c);
        arrayList5.add(h1.f13923a);
        arrayList5.add(new ib.d(bVar, 0));
        arrayList5.add(new ib.d(bVar, 1));
        ib.j jVar = new ib.j(bVar);
        this.d = jVar;
        arrayList5.add(jVar);
        arrayList5.add(h1.B);
        arrayList5.add(new x(bVar, gVar, jVar, arrayList4));
        this.e = DesugarCollections.unmodifiableList(arrayList5);
    }

    public static void a(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return;
        }
        throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public final u b(mb.a aVar) {
        boolean z10;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f10391b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.f10390a;
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
                    if (fVar.f10387a == null) {
                        fVar.f10387a = uVar3;
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

    public final fb.u c(fb.v r7, mb.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: fb.g.c(fb.v, mb.a):fb.u");
    }

    public final nb.b d(Writer writer) {
        nb.b bVar = new nb.b(writer);
        bVar.k(this.f10394g);
        bVar.f18770r = this.f10393f;
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
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void f(Object obj, Class cls, nb.b bVar) {
        u b10 = b(new mb.a(cls));
        int i10 = bVar.f18769n;
        if (i10 == 2) {
            bVar.f18769n = 1;
        }
        boolean z10 = bVar.f18770r;
        boolean z11 = bVar.v;
        bVar.f18770r = this.f10393f;
        bVar.v = false;
        try {
            try {
                b10.write(bVar, obj);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
            }
        } finally {
            bVar.l(i10);
            bVar.f18770r = z10;
            bVar.v = z11;
        }
    }

    public final void g(nb.b bVar) {
        k kVar = k.f10396a;
        int i10 = bVar.f18769n;
        boolean z10 = bVar.f18770r;
        boolean z11 = bVar.v;
        bVar.f18770r = this.f10393f;
        bVar.v = false;
        if (i10 == 2) {
            bVar.f18769n = 1;
        }
        try {
            try {
                try {
                    hb.d.l(kVar, bVar);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
            }
        } finally {
            bVar.l(i10);
            bVar.f18770r = z10;
            bVar.v = z11;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.f10392c + "}";
    }
}
