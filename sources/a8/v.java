package a8;

import j$.util.Map;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public abstract class v implements Map, Serializable, j$.util.Map {
    public final int f681a;
    public transient AbstractCollection f682b;
    public transient AbstractCollection f683c;
    public transient AbstractCollection d;

    public v(int i7) {
        this.f681a = i7;
    }

    public static void b(java.util.Set r18) {
        throw new UnsupportedOperationException("Method not decompiled: a8.v.b(java.util.Set):void");
    }

    @Override
    public final void clear() {
        switch (this.f681a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public Object compute(Object obj, BiFunction biFunction) {
        int i7 = this.f681a;
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override
    public Object computeIfAbsent(Object obj, Function function) {
        int i7 = this.f681a;
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        int i7 = this.f681a;
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override
    public final boolean containsKey(Object obj) {
        switch (this.f681a) {
            case 0:
                if (get(obj) != null) {
                    return true;
                }
                return false;
            case 1:
                if (get(obj) != null) {
                    return true;
                }
                return false;
            case 2:
                if (get(obj) != null) {
                    return true;
                }
                return false;
            case 3:
                if (get(obj) != null) {
                    return true;
                }
                return false;
            case 4:
                if (get(obj) != null) {
                    return true;
                }
                return false;
            case 5:
                if (get(obj) != null) {
                    return true;
                }
                return false;
            default:
                if (get(obj) != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final boolean containsValue(Object obj) {
        switch (this.f681a) {
            case 0:
                e0 e0Var = (e0) this.d;
                if (e0Var == null) {
                    e0 e0Var2 = new e0(1, ((f0) this).f391e);
                    this.d = e0Var2;
                    e0Var = e0Var2;
                }
                return e0Var.contains(obj);
            case 1:
                c8.q qVar = (c8.q) this.d;
                if (qVar == null) {
                    c8.q qVar2 = new c8.q(1, ((c8.r) this).f5821e);
                    this.d = qVar2;
                    qVar = qVar2;
                }
                return qVar.contains(obj);
            case 2:
                com.google.android.gms.internal.cast.o0 o0Var = (com.google.android.gms.internal.cast.o0) this.d;
                if (o0Var == null) {
                    com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                    com.google.android.gms.internal.cast.o0 o0Var2 = new com.google.android.gms.internal.cast.o0(1, p0Var.h, p0Var.f6945f);
                    this.d = o0Var2;
                    o0Var = o0Var2;
                }
                return o0Var.contains(obj);
            case 3:
                com.google.android.gms.internal.play_billing.z zVar = (com.google.android.gms.internal.play_billing.z) this.d;
                if (zVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.z zVar2 = new com.google.android.gms.internal.play_billing.z(1, a0Var.h, a0Var.f7301f);
                    this.d = zVar2;
                    zVar = zVar2;
                }
                return zVar.contains(obj);
            case 4:
                w7.k kVar = (w7.k) this.d;
                if (kVar == null) {
                    w7.l lVar = (w7.l) this;
                    w7.k kVar2 = new w7.k(1, lVar.h, lVar.f57511f);
                    this.d = kVar2;
                    kVar = kVar2;
                }
                return kVar.contains(obj);
            case 5:
                y7.c cVar = (y7.c) this.d;
                if (cVar == null) {
                    y7.c cVar2 = new y7.c(1, ((y7.d) this).f58907e);
                    this.d = cVar2;
                    cVar = cVar2;
                }
                return cVar.contains(obj);
            default:
                z7.za zaVar = (z7.za) this.d;
                if (zaVar == null) {
                    z7.za zaVar2 = new z7.za(1, ((z7.ab) this).f59627e);
                    this.d = zaVar2;
                    zaVar = zaVar2;
                }
                return zaVar.contains(obj);
        }
    }

    @Override
    public final Set entrySet() {
        switch (this.f681a) {
            case 0:
                c0 c0Var = (c0) this.f682b;
                if (c0Var == null) {
                    f0 f0Var = (f0) this;
                    c0 c0Var2 = new c0(f0Var, f0Var.f391e);
                    this.f682b = c0Var2;
                    return c0Var2;
                }
                return c0Var;
            case 1:
                c8.o oVar = (c8.o) this.f682b;
                if (oVar == null) {
                    c8.r rVar = (c8.r) this;
                    c8.o oVar2 = new c8.o(rVar, rVar.f5821e);
                    this.f682b = oVar2;
                    return oVar2;
                }
                return oVar;
            case 2:
                com.google.android.gms.internal.cast.l0 l0Var = (com.google.android.gms.internal.cast.l0) this.f682b;
                if (l0Var == null) {
                    com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                    com.google.android.gms.internal.cast.l0 l0Var2 = new com.google.android.gms.internal.cast.l0(p0Var, p0Var.f6945f, p0Var.h);
                    this.f682b = l0Var2;
                    return l0Var2;
                }
                return l0Var;
            case 3:
                com.google.android.gms.internal.play_billing.x xVar = (com.google.android.gms.internal.play_billing.x) this.f682b;
                if (xVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.x xVar2 = new com.google.android.gms.internal.play_billing.x(a0Var, a0Var.f7301f, a0Var.h);
                    this.f682b = xVar2;
                    return xVar2;
                }
                return xVar;
            case 4:
                w7.i iVar = (w7.i) this.f682b;
                if (iVar == null) {
                    w7.l lVar = (w7.l) this;
                    w7.i iVar2 = new w7.i(lVar, lVar.f57511f, lVar.h);
                    this.f682b = iVar2;
                    return iVar2;
                }
                return iVar;
            case 5:
                y7.a aVar = (y7.a) this.f682b;
                if (aVar == null) {
                    y7.d dVar = (y7.d) this;
                    y7.a aVar2 = new y7.a(dVar, dVar.f58907e);
                    this.f682b = aVar2;
                    return aVar2;
                }
                return aVar;
            default:
                z7.xa xaVar = (z7.xa) this.f682b;
                if (xaVar == null) {
                    z7.ab abVar = (z7.ab) this;
                    z7.xa xaVar2 = new z7.xa(abVar, abVar.f59627e);
                    this.f682b = xaVar2;
                    return xaVar2;
                }
                return xaVar;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f681a) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof java.util.Map)) {
                    return false;
                }
                return entrySet().equals(((java.util.Map) obj).entrySet());
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof java.util.Map)) {
                    return false;
                }
                return entrySet().equals(((java.util.Map) obj).entrySet());
            case 2:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof java.util.Map)) {
                    return false;
                }
                return entrySet().equals(((java.util.Map) obj).entrySet());
            case 3:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof java.util.Map)) {
                    return false;
                }
                return entrySet().equals(((java.util.Map) obj).entrySet());
            case 4:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof java.util.Map)) {
                    return false;
                }
                return entrySet().equals(((java.util.Map) obj).entrySet());
            case 5:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof java.util.Map)) {
                    return false;
                }
                return entrySet().equals(((java.util.Map) obj).entrySet());
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof java.util.Map)) {
                    return false;
                }
                return entrySet().equals(((java.util.Map) obj).entrySet());
        }
    }

    @Override
    public void forEach(BiConsumer biConsumer) {
        int i7 = this.f681a;
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override
    public abstract Object get(Object obj);

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f681a) {
            case 0:
                Object obj3 = get(obj);
                if (obj3 != null) {
                    return obj3;
                }
                return obj2;
            case 1:
                Object obj4 = get(obj);
                if (obj4 != null) {
                    return obj4;
                }
                return obj2;
            case 2:
                Object obj5 = get(obj);
                if (obj5 != null) {
                    return obj5;
                }
                return obj2;
            case 3:
                Object obj6 = get(obj);
                if (obj6 != null) {
                    return obj6;
                }
                return obj2;
            case 4:
                Object obj7 = get(obj);
                if (obj7 != null) {
                    return obj7;
                }
                return obj2;
            case 5:
                Object obj8 = get(obj);
                if (obj8 != null) {
                    return obj8;
                }
                return obj2;
            default:
                Object obj9 = get(obj);
                if (obj9 != null) {
                    return obj9;
                }
                return obj2;
        }
    }

    @Override
    public final int hashCode() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f681a) {
            case 0:
                c0 c0Var = (c0) this.f682b;
                if (c0Var == null) {
                    f0 f0Var = (f0) this;
                    c0 c0Var2 = new c0(f0Var, f0Var.f391e);
                    this.f682b = c0Var2;
                    c0Var = c0Var2;
                }
                int i16 = 0;
                for (Object obj : c0Var) {
                    if (obj != null) {
                        i7 = obj.hashCode();
                    } else {
                        i7 = 0;
                    }
                    i16 += i7;
                }
                return i16;
            case 1:
                c8.o oVar = (c8.o) this.f682b;
                if (oVar == null) {
                    c8.r rVar = (c8.r) this;
                    c8.o oVar2 = new c8.o(rVar, rVar.f5821e);
                    this.f682b = oVar2;
                    oVar = oVar2;
                }
                int i17 = 0;
                for (Object obj2 : oVar) {
                    if (obj2 != null) {
                        i10 = obj2.hashCode();
                    } else {
                        i10 = 0;
                    }
                    i17 += i10;
                }
                return i17;
            case 2:
                com.google.android.gms.internal.cast.l0 l0Var = (com.google.android.gms.internal.cast.l0) this.f682b;
                if (l0Var == null) {
                    com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                    com.google.android.gms.internal.cast.l0 l0Var2 = new com.google.android.gms.internal.cast.l0(p0Var, p0Var.f6945f, p0Var.h);
                    this.f682b = l0Var2;
                    l0Var = l0Var2;
                }
                int i18 = 0;
                for (Object obj3 : l0Var) {
                    if (obj3 != null) {
                        i11 = obj3.hashCode();
                    } else {
                        i11 = 0;
                    }
                    i18 += i11;
                }
                return i18;
            case 3:
                com.google.android.gms.internal.play_billing.x xVar = (com.google.android.gms.internal.play_billing.x) this.f682b;
                if (xVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.x xVar2 = new com.google.android.gms.internal.play_billing.x(a0Var, a0Var.f7301f, a0Var.h);
                    this.f682b = xVar2;
                    xVar = xVar2;
                }
                int i19 = 0;
                for (Object obj4 : xVar) {
                    if (obj4 != null) {
                        i12 = obj4.hashCode();
                    } else {
                        i12 = 0;
                    }
                    i19 += i12;
                }
                return i19;
            case 4:
                w7.i iVar = (w7.i) this.f682b;
                if (iVar == null) {
                    w7.l lVar = (w7.l) this;
                    w7.i iVar2 = new w7.i(lVar, lVar.f57511f, lVar.h);
                    this.f682b = iVar2;
                    iVar = iVar2;
                }
                int i20 = 0;
                for (Object obj5 : iVar) {
                    if (obj5 != null) {
                        i13 = obj5.hashCode();
                    } else {
                        i13 = 0;
                    }
                    i20 += i13;
                }
                return i20;
            case 5:
                y7.a aVar = (y7.a) this.f682b;
                if (aVar == null) {
                    y7.d dVar = (y7.d) this;
                    y7.a aVar2 = new y7.a(dVar, dVar.f58907e);
                    this.f682b = aVar2;
                    aVar = aVar2;
                }
                int i21 = 0;
                for (Object obj6 : aVar) {
                    if (obj6 != null) {
                        i14 = obj6.hashCode();
                    } else {
                        i14 = 0;
                    }
                    i21 += i14;
                }
                return i21;
            default:
                z7.xa xaVar = (z7.xa) this.f682b;
                if (xaVar == null) {
                    z7.ab abVar = (z7.ab) this;
                    z7.xa xaVar2 = new z7.xa(abVar, abVar.f59627e);
                    this.f682b = xaVar2;
                    xaVar = xaVar2;
                }
                int i22 = 0;
                for (Object obj7 : xaVar) {
                    if (obj7 != null) {
                        i15 = obj7.hashCode();
                    } else {
                        i15 = 0;
                    }
                    i22 += i15;
                }
                return i22;
        }
    }

    @Override
    public final boolean isEmpty() {
        switch (this.f681a) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                if (((com.google.android.gms.internal.cast.p0) this).size() == 0) {
                    return true;
                }
                return false;
            case 3:
                if (((com.google.android.gms.internal.play_billing.a0) this).size() == 0) {
                    return true;
                }
                return false;
            case 4:
                if (((w7.l) this).size() == 0) {
                    return true;
                }
                return false;
            case 5:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final Set keySet() {
        switch (this.f681a) {
            case 0:
                d0 d0Var = (d0) this.f683c;
                if (d0Var == null) {
                    f0 f0Var = (f0) this;
                    d0 d0Var2 = new d0(f0Var, new e0(0, f0Var.f391e));
                    this.f683c = d0Var2;
                    return d0Var2;
                }
                return d0Var;
            case 1:
                c8.p pVar = (c8.p) this.f683c;
                if (pVar == null) {
                    c8.r rVar = (c8.r) this;
                    c8.p pVar2 = new c8.p(rVar, new c8.q(0, rVar.f5821e));
                    this.f683c = pVar2;
                    return pVar2;
                }
                return pVar;
            case 2:
                com.google.android.gms.internal.cast.n0 n0Var = (com.google.android.gms.internal.cast.n0) this.f683c;
                if (n0Var == null) {
                    com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                    com.google.android.gms.internal.cast.n0 n0Var2 = new com.google.android.gms.internal.cast.n0(p0Var, new com.google.android.gms.internal.cast.o0(0, p0Var.h, p0Var.f6945f));
                    this.f683c = n0Var2;
                    return n0Var2;
                }
                return n0Var;
            case 3:
                com.google.android.gms.internal.play_billing.y yVar = (com.google.android.gms.internal.play_billing.y) this.f683c;
                if (yVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.y yVar2 = new com.google.android.gms.internal.play_billing.y(a0Var, new com.google.android.gms.internal.play_billing.z(0, a0Var.h, a0Var.f7301f));
                    this.f683c = yVar2;
                    return yVar2;
                }
                return yVar;
            case 4:
                w7.j jVar = (w7.j) this.f683c;
                if (jVar == null) {
                    w7.l lVar = (w7.l) this;
                    w7.j jVar2 = new w7.j(lVar, new w7.k(0, lVar.h, lVar.f57511f));
                    this.f683c = jVar2;
                    return jVar2;
                }
                return jVar;
            case 5:
                y7.b bVar = (y7.b) this.f683c;
                if (bVar == null) {
                    y7.d dVar = (y7.d) this;
                    y7.b bVar2 = new y7.b(dVar, new y7.c(0, dVar.f58907e));
                    this.f683c = bVar2;
                    return bVar2;
                }
                return bVar;
            default:
                z7.ya yaVar = (z7.ya) this.f683c;
                if (yaVar == null) {
                    z7.ab abVar = (z7.ab) this;
                    z7.ya yaVar2 = new z7.ya(abVar, new z7.za(0, abVar.f59627e));
                    this.f683c = yaVar2;
                    return yaVar2;
                }
                return yaVar;
        }
    }

    @Override
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i7 = this.f681a;
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        switch (this.f681a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void putAll(java.util.Map map) {
        switch (this.f681a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public Object putIfAbsent(Object obj, Object obj2) {
        int i7 = this.f681a;
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        int i7 = this.f681a;
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override
    public Object replace(Object obj, Object obj2) {
        int i7 = this.f681a;
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override
    public void replaceAll(BiFunction biFunction) {
        int i7 = this.f681a;
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        switch (this.f681a) {
            case 0:
                boolean z9 = true;
                StringBuilder sb2 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb2.append('{');
                Iterator it = ((c0) entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z9) {
                        sb2.append(", ");
                    }
                    sb2.append(entry.getKey());
                    sb2.append('=');
                    sb2.append(entry.getValue());
                    z9 = false;
                }
                sb2.append('}');
                return sb2.toString();
            case 1:
                boolean z10 = true;
                StringBuilder sb3 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb3.append('{');
                Iterator it2 = ((c8.o) entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z10) {
                        sb3.append(", ");
                    }
                    sb3.append(entry2.getKey());
                    sb3.append('=');
                    sb3.append(entry2.getValue());
                    z10 = false;
                }
                sb3.append('}');
                return sb3.toString();
            case 2:
                int i7 = ((com.google.android.gms.internal.cast.p0) this).h;
                if (i7 >= 0) {
                    StringBuilder sb4 = new StringBuilder((int) Math.min(i7 * 8, 1073741824L));
                    sb4.append('{');
                    Iterator it3 = ((com.google.android.gms.internal.cast.l0) entrySet()).iterator();
                    boolean z11 = true;
                    while (it3.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it3.next();
                        if (!z11) {
                            sb4.append(", ");
                        }
                        sb4.append(entry3.getKey());
                        sb4.append('=');
                        sb4.append(entry3.getValue());
                        z11 = false;
                    }
                    sb4.append('}');
                    return sb4.toString();
                }
                throw new IllegalArgumentException(jg.g.j(i7, "size cannot be negative but was: "));
            case 3:
                int i10 = ((com.google.android.gms.internal.play_billing.a0) this).h;
                if (i10 >= 0) {
                    StringBuilder sb5 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
                    sb5.append('{');
                    Iterator it4 = ((com.google.android.gms.internal.play_billing.x) entrySet()).iterator();
                    boolean z12 = true;
                    while (it4.hasNext()) {
                        Map.Entry entry4 = (Map.Entry) it4.next();
                        if (!z12) {
                            sb5.append(", ");
                        }
                        sb5.append(entry4.getKey());
                        sb5.append('=');
                        sb5.append(entry4.getValue());
                        z12 = false;
                    }
                    sb5.append('}');
                    return sb5.toString();
                }
                throw new IllegalArgumentException(jg.g.j(i10, "size cannot be negative but was: "));
            case 4:
                int i11 = ((w7.l) this).h;
                if (i11 >= 0) {
                    StringBuilder sb6 = new StringBuilder((int) Math.min(i11 * 8, 1073741824L));
                    sb6.append('{');
                    Iterator it5 = ((w7.i) entrySet()).iterator();
                    boolean z13 = true;
                    while (it5.hasNext()) {
                        Map.Entry entry5 = (Map.Entry) it5.next();
                        if (!z13) {
                            sb6.append(", ");
                        }
                        sb6.append(entry5.getKey());
                        sb6.append('=');
                        sb6.append(entry5.getValue());
                        z13 = false;
                    }
                    sb6.append('}');
                    return sb6.toString();
                }
                throw new IllegalArgumentException(jg.g.j(i11, "size cannot be negative but was: "));
            case 5:
                boolean z14 = true;
                StringBuilder sb7 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb7.append('{');
                Iterator it6 = ((y7.a) entrySet()).iterator();
                while (it6.hasNext()) {
                    Map.Entry entry6 = (Map.Entry) it6.next();
                    if (!z14) {
                        sb7.append(", ");
                    }
                    sb7.append(entry6.getKey());
                    sb7.append('=');
                    sb7.append(entry6.getValue());
                    z14 = false;
                }
                sb7.append('}');
                return sb7.toString();
            default:
                boolean z15 = true;
                StringBuilder sb8 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb8.append('{');
                Iterator it7 = ((z7.xa) entrySet()).iterator();
                while (it7.hasNext()) {
                    Map.Entry entry7 = (Map.Entry) it7.next();
                    if (!z15) {
                        sb8.append(", ");
                    }
                    sb8.append(entry7.getKey());
                    sb8.append('=');
                    sb8.append(entry7.getValue());
                    z15 = false;
                }
                sb8.append('}');
                return sb8.toString();
        }
    }

    @Override
    public final Collection values() {
        switch (this.f681a) {
            case 0:
                e0 e0Var = (e0) this.d;
                if (e0Var == null) {
                    e0 e0Var2 = new e0(1, ((f0) this).f391e);
                    this.d = e0Var2;
                    return e0Var2;
                }
                return e0Var;
            case 1:
                c8.q qVar = (c8.q) this.d;
                if (qVar == null) {
                    c8.q qVar2 = new c8.q(1, ((c8.r) this).f5821e);
                    this.d = qVar2;
                    return qVar2;
                }
                return qVar;
            case 2:
                com.google.android.gms.internal.cast.o0 o0Var = (com.google.android.gms.internal.cast.o0) this.d;
                if (o0Var == null) {
                    com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                    com.google.android.gms.internal.cast.o0 o0Var2 = new com.google.android.gms.internal.cast.o0(1, p0Var.h, p0Var.f6945f);
                    this.d = o0Var2;
                    return o0Var2;
                }
                return o0Var;
            case 3:
                com.google.android.gms.internal.play_billing.z zVar = (com.google.android.gms.internal.play_billing.z) this.d;
                if (zVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.z zVar2 = new com.google.android.gms.internal.play_billing.z(1, a0Var.h, a0Var.f7301f);
                    this.d = zVar2;
                    return zVar2;
                }
                return zVar;
            case 4:
                w7.k kVar = (w7.k) this.d;
                if (kVar == null) {
                    w7.l lVar = (w7.l) this;
                    w7.k kVar2 = new w7.k(1, lVar.h, lVar.f57511f);
                    this.d = kVar2;
                    return kVar2;
                }
                return kVar;
            case 5:
                y7.c cVar = (y7.c) this.d;
                if (cVar == null) {
                    y7.c cVar2 = new y7.c(1, ((y7.d) this).f58907e);
                    this.d = cVar2;
                    return cVar2;
                }
                return cVar;
            default:
                z7.za zaVar = (z7.za) this.d;
                if (zaVar == null) {
                    z7.za zaVar2 = new z7.za(1, ((z7.ab) this).f59627e);
                    this.d = zaVar2;
                    return zaVar2;
                }
                return zaVar;
        }
    }

    @Override
    public final Object remove(Object obj) {
        switch (this.f681a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean replace(Object obj, Object obj2, Object obj3) {
        int i7 = this.f681a;
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
