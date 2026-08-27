package ma;

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
import pa.c0;
import pa.h1;
import pa.x;
import pa.x0;
import pa.y0;

public final class g {
    public static final c h = c.d;

    public static final p f17901i = t.f17913a;

    public static final q f17902j = t.f17914b;

    public final ThreadLocal f17903a = new ThreadLocal();

    public final ConcurrentHashMap f17904b = new ConcurrentHashMap();

    public final g5.b f17905c;
    public final pa.j d;

    public final List f17906e;

    public final boolean f17907f;

    public final c f17908g;

    public g(oa.f fVar, HashMap map, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, t tVar, t tVar2, ArrayList arrayList4) {
        g5.b bVar = new g5.b(28, map, arrayList4);
        this.f17905c = bVar;
        this.f17907f = true;
        this.f17908g = cVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(h1.A);
        arrayList5.add(tVar == t.f17913a ? pa.r.f45657c : new pa.p(tVar, 1));
        arrayList5.add(fVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(h1.f45637p);
        arrayList5.add(h1.f45629g);
        arrayList5.add(h1.d);
        arrayList5.add(h1.f45627e);
        arrayList5.add(h1.f45628f);
        c0 c0Var = h1.f45632k;
        arrayList5.add(new y0(Long.TYPE, Long.class, c0Var));
        arrayList5.add(new y0(Double.TYPE, Double.class, new d(0)));
        arrayList5.add(new y0(Float.TYPE, Float.class, new d(1)));
        arrayList5.add(tVar2 == t.f17914b ? pa.q.f45655b : new pa.p(new pa.q(tVar2), 0));
        arrayList5.add(h1.h);
        arrayList5.add(h1.f45630i);
        arrayList5.add(new x0(AtomicLong.class, new e(c0Var, 0).nullSafe(), 0));
        int i10 = 0;
        arrayList5.add(new x0(AtomicLongArray.class, new e(c0Var, 1).nullSafe(), i10));
        arrayList5.add(h1.f45631j);
        arrayList5.add(h1.f45633l);
        arrayList5.add(h1.f45638q);
        arrayList5.add(h1.f45639r);
        arrayList5.add(new x0(BigDecimal.class, h1.f45634m, i10));
        arrayList5.add(new x0(BigInteger.class, h1.f45635n, i10));
        arrayList5.add(new x0(oa.h.class, h1.f45636o, i10));
        arrayList5.add(h1.f45640s);
        arrayList5.add(h1.f45641t);
        arrayList5.add(h1.v);
        arrayList5.add(h1.f45643w);
        arrayList5.add(h1.f45645y);
        arrayList5.add(h1.f45642u);
        arrayList5.add(h1.f45625b);
        arrayList5.add(pa.h.f45621c);
        arrayList5.add(h1.f45644x);
        if (sa.f.f47825a) {
            arrayList5.add(sa.f.f47827c);
            arrayList5.add(sa.f.f47826b);
            arrayList5.add(sa.f.d);
        }
        arrayList5.add(pa.b.f45611c);
        arrayList5.add(h1.f45624a);
        arrayList5.add(new pa.d(bVar, 0));
        arrayList5.add(new pa.d(bVar, 1));
        pa.j jVar = new pa.j(bVar);
        this.d = jVar;
        arrayList5.add(jVar);
        arrayList5.add(h1.B);
        arrayList5.add(new x(bVar, fVar, jVar, arrayList4));
        this.f17906e = DesugarCollections.unmodifiableList(arrayList5);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final u b(ta.a aVar) {
        boolean z10;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f17904b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.f17903a;
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
            Iterator it = this.f17906e.iterator();
            u uVarCreate = null;
            while (it.hasNext()) {
                uVarCreate = ((v) it.next()).create(this, aVar);
                if (uVarCreate != null) {
                    if (fVar.f17900a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    fVar.f17900a = uVarCreate;
                    map.put(aVar, uVarCreate);
                    break;
                }
            }
            if (z10) {
                threadLocal.remove();
            }
            if (uVarCreate != null) {
                if (z10) {
                    concurrentHashMap.putAll(map);
                }
                return uVarCreate;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + aVar);
        } catch (Throwable th) {
            if (z10) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final u c(v vVar, ta.a aVar) {
        Objects.requireNonNull(vVar, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        pa.j jVar = this.d;
        jVar.getClass();
        ConcurrentHashMap concurrentHashMap = jVar.f45649b;
        if (vVar == pa.j.f45647c) {
            vVar = jVar;
        } else {
            Class cls = aVar.f48151a;
            v vVar2 = (v) concurrentHashMap.get(cls);
            if (vVar2 == null) {
                na.a aVar2 = (na.a) cls.getAnnotation(na.a.class);
                if (aVar2 != null) {
                    Class clsValue = aVar2.value();
                    if (v.class.isAssignableFrom(clsValue)) {
                        v vVar3 = (v) jVar.f45648a.l(new ta.a(clsValue)).f2();
                        v vVar4 = (v) concurrentHashMap.putIfAbsent(cls, vVar3);
                        if (vVar4 != null) {
                            vVar3 = vVar4;
                        }
                        if (vVar3 == vVar) {
                            vVar = jVar;
                        }
                    }
                }
            } else if (vVar2 == vVar) {
                vVar = jVar;
            }
        }
        boolean z10 = false;
        for (v vVar5 : this.f17906e) {
            if (z10) {
                u uVarCreate = vVar5.create(this, aVar);
                if (uVarCreate != null) {
                    return uVarCreate;
                }
            } else if (vVar5 == vVar) {
                z10 = true;
            }
        }
        if (!z10) {
            return b(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public final ua.b d(Writer writer) {
        ua.b bVar = new ua.b(writer);
        bVar.k(this.f17908g);
        bVar.f48487r = this.f17907f;
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
            } catch (IOException e9) {
                throw new j(e9);
            }
        }
        Class cls = tLObject.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            f(tLObject, cls, d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e10) {
            throw new j(e10);
        }
    }

    public final void f(Object obj, Class cls, ua.b bVar) {
        u uVarB = b(new ta.a(cls));
        int i10 = bVar.f48486n;
        if (i10 == 2) {
            bVar.f48486n = 1;
        }
        boolean z10 = bVar.f48487r;
        boolean z11 = bVar.v;
        bVar.f48487r = this.f17907f;
        bVar.v = false;
        try {
            try {
                uVarB.write(bVar, obj);
                bVar.l(i10);
                bVar.f48487r = z10;
                bVar.v = z11;
            } catch (IOException e9) {
                throw new j(e9);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
            }
        } catch (Throwable th) {
            bVar.l(i10);
            bVar.f48487r = z10;
            bVar.v = z11;
            throw th;
        }
    }

    public final void g(ua.b bVar) {
        k kVar = k.f17910a;
        int i10 = bVar.f48486n;
        boolean z10 = bVar.f48487r;
        boolean z11 = bVar.v;
        bVar.f48487r = this.f17907f;
        bVar.v = false;
        if (i10 == 2) {
            bVar.f48486n = 1;
        }
        try {
            try {
                try {
                    oa.d.l(kVar, bVar);
                    bVar.l(i10);
                    bVar.f48487r = z10;
                    bVar.v = z11;
                } catch (IOException e9) {
                    throw new j(e9);
                }
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
            }
        } catch (Throwable th) {
            bVar.l(i10);
            bVar.f48487r = z10;
            bVar.v = z11;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f17906e + ",instanceCreators:" + this.f17905c + "}";
    }
}
