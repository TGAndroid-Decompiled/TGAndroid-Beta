package b8;

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
public abstract class m implements Map, Serializable, j$.util.Map {
    public final int f2742a;
    public transient AbstractCollection f2743b;
    public transient AbstractCollection f2744c;
    public transient AbstractCollection d;

    public m(int i3) {
        this.f2742a = i3;
    }

    public static void b(java.util.Set r18) {
        throw new UnsupportedOperationException("Method not decompiled: b8.m.b(java.util.Set):void");
    }

    @Override
    public final void clear() {
        switch (this.f2742a) {
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
        int i3 = this.f2742a;
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override
    public Object computeIfAbsent(Object obj, Function function) {
        int i3 = this.f2742a;
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        int i3 = this.f2742a;
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override
    public final boolean containsKey(Object obj) {
        switch (this.f2742a) {
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
        switch (this.f2742a) {
            case 0:
                v vVar = (v) this.d;
                if (vVar == null) {
                    v vVar2 = new v(1, ((w) this).f3101e);
                    this.d = vVar2;
                    vVar = vVar2;
                }
                return vVar.contains(obj);
            case 1:
                com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this.d;
                if (p0Var == null) {
                    com.google.android.gms.internal.cast.q0 q0Var = (com.google.android.gms.internal.cast.q0) this;
                    com.google.android.gms.internal.cast.p0 p0Var2 = new com.google.android.gms.internal.cast.p0(1, q0Var.h, q0Var.f7011f);
                    this.d = p0Var2;
                    p0Var = p0Var2;
                }
                return p0Var.contains(obj);
            case 2:
                com.google.android.gms.internal.play_billing.z zVar = (com.google.android.gms.internal.play_billing.z) this.d;
                if (zVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.z zVar2 = new com.google.android.gms.internal.play_billing.z(1, a0Var.h, a0Var.f7356f);
                    this.d = zVar2;
                    zVar = zVar2;
                }
                return zVar.contains(obj);
            case 3:
                v7.k kVar = (v7.k) this.d;
                if (kVar == null) {
                    v7.l lVar = (v7.l) this;
                    v7.k kVar2 = new v7.k(1, lVar.h, lVar.f56467f);
                    this.d = kVar2;
                    kVar = kVar2;
                }
                return kVar.contains(obj);
            case 4:
                x7.c cVar = (x7.c) this.d;
                if (cVar == null) {
                    x7.c cVar2 = new x7.c(1, ((x7.d) this).f58261e);
                    this.d = cVar2;
                    cVar = cVar2;
                }
                return cVar.contains(obj);
            case 5:
                y7.za zaVar = (y7.za) this.d;
                if (zaVar == null) {
                    y7.za zaVar2 = new y7.za(1, ((y7.ab) this).f59045e);
                    this.d = zaVar2;
                    zaVar = zaVar2;
                }
                return zaVar.contains(obj);
            default:
                z7.v vVar3 = (z7.v) this.d;
                if (vVar3 == null) {
                    z7.v vVar4 = new z7.v(1, ((z7.w) this).f60120e);
                    this.d = vVar4;
                    vVar3 = vVar4;
                }
                return vVar3.contains(obj);
        }
    }

    @Override
    public final Set entrySet() {
        switch (this.f2742a) {
            case 0:
                t tVar = (t) this.f2743b;
                if (tVar == null) {
                    w wVar = (w) this;
                    t tVar2 = new t(wVar, wVar.f3101e);
                    this.f2743b = tVar2;
                    return tVar2;
                }
                return tVar;
            case 1:
                com.google.android.gms.internal.cast.m0 m0Var = (com.google.android.gms.internal.cast.m0) this.f2743b;
                if (m0Var == null) {
                    com.google.android.gms.internal.cast.q0 q0Var = (com.google.android.gms.internal.cast.q0) this;
                    com.google.android.gms.internal.cast.m0 m0Var2 = new com.google.android.gms.internal.cast.m0(q0Var, q0Var.f7011f, q0Var.h);
                    this.f2743b = m0Var2;
                    return m0Var2;
                }
                return m0Var;
            case 2:
                com.google.android.gms.internal.play_billing.x xVar = (com.google.android.gms.internal.play_billing.x) this.f2743b;
                if (xVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.x xVar2 = new com.google.android.gms.internal.play_billing.x(a0Var, a0Var.f7356f, a0Var.h);
                    this.f2743b = xVar2;
                    return xVar2;
                }
                return xVar;
            case 3:
                v7.i iVar = (v7.i) this.f2743b;
                if (iVar == null) {
                    v7.l lVar = (v7.l) this;
                    v7.i iVar2 = new v7.i(lVar, lVar.f56467f, lVar.h);
                    this.f2743b = iVar2;
                    return iVar2;
                }
                return iVar;
            case 4:
                x7.a aVar = (x7.a) this.f2743b;
                if (aVar == null) {
                    x7.d dVar = (x7.d) this;
                    x7.a aVar2 = new x7.a(dVar, dVar.f58261e);
                    this.f2743b = aVar2;
                    return aVar2;
                }
                return aVar;
            case 5:
                y7.xa xaVar = (y7.xa) this.f2743b;
                if (xaVar == null) {
                    y7.ab abVar = (y7.ab) this;
                    y7.xa xaVar2 = new y7.xa(abVar, abVar.f59045e);
                    this.f2743b = xaVar2;
                    return xaVar2;
                }
                return xaVar;
            default:
                z7.t tVar3 = (z7.t) this.f2743b;
                if (tVar3 == null) {
                    z7.w wVar2 = (z7.w) this;
                    z7.t tVar4 = new z7.t(wVar2, wVar2.f60120e);
                    this.f2743b = tVar4;
                    return tVar4;
                }
                return tVar3;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f2742a) {
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
        int i3 = this.f2742a;
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override
    public abstract Object get(Object obj);

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f2742a) {
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
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f2742a) {
            case 0:
                t tVar = (t) this.f2743b;
                if (tVar == null) {
                    w wVar = (w) this;
                    t tVar2 = new t(wVar, wVar.f3101e);
                    this.f2743b = tVar2;
                    tVar = tVar2;
                }
                int i16 = 0;
                for (Object obj : tVar) {
                    if (obj != null) {
                        i3 = obj.hashCode();
                    } else {
                        i3 = 0;
                    }
                    i16 += i3;
                }
                return i16;
            case 1:
                com.google.android.gms.internal.cast.m0 m0Var = (com.google.android.gms.internal.cast.m0) this.f2743b;
                if (m0Var == null) {
                    com.google.android.gms.internal.cast.q0 q0Var = (com.google.android.gms.internal.cast.q0) this;
                    com.google.android.gms.internal.cast.m0 m0Var2 = new com.google.android.gms.internal.cast.m0(q0Var, q0Var.f7011f, q0Var.h);
                    this.f2743b = m0Var2;
                    m0Var = m0Var2;
                }
                int i17 = 0;
                for (Object obj2 : m0Var) {
                    if (obj2 != null) {
                        i10 = obj2.hashCode();
                    } else {
                        i10 = 0;
                    }
                    i17 += i10;
                }
                return i17;
            case 2:
                com.google.android.gms.internal.play_billing.x xVar = (com.google.android.gms.internal.play_billing.x) this.f2743b;
                if (xVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.x xVar2 = new com.google.android.gms.internal.play_billing.x(a0Var, a0Var.f7356f, a0Var.h);
                    this.f2743b = xVar2;
                    xVar = xVar2;
                }
                int i18 = 0;
                for (Object obj3 : xVar) {
                    if (obj3 != null) {
                        i11 = obj3.hashCode();
                    } else {
                        i11 = 0;
                    }
                    i18 += i11;
                }
                return i18;
            case 3:
                v7.i iVar = (v7.i) this.f2743b;
                if (iVar == null) {
                    v7.l lVar = (v7.l) this;
                    v7.i iVar2 = new v7.i(lVar, lVar.f56467f, lVar.h);
                    this.f2743b = iVar2;
                    iVar = iVar2;
                }
                int i19 = 0;
                for (Object obj4 : iVar) {
                    if (obj4 != null) {
                        i12 = obj4.hashCode();
                    } else {
                        i12 = 0;
                    }
                    i19 += i12;
                }
                return i19;
            case 4:
                x7.a aVar = (x7.a) this.f2743b;
                if (aVar == null) {
                    x7.d dVar = (x7.d) this;
                    x7.a aVar2 = new x7.a(dVar, dVar.f58261e);
                    this.f2743b = aVar2;
                    aVar = aVar2;
                }
                int i20 = 0;
                for (Object obj5 : aVar) {
                    if (obj5 != null) {
                        i13 = obj5.hashCode();
                    } else {
                        i13 = 0;
                    }
                    i20 += i13;
                }
                return i20;
            case 5:
                y7.xa xaVar = (y7.xa) this.f2743b;
                if (xaVar == null) {
                    y7.ab abVar = (y7.ab) this;
                    y7.xa xaVar2 = new y7.xa(abVar, abVar.f59045e);
                    this.f2743b = xaVar2;
                    xaVar = xaVar2;
                }
                int i21 = 0;
                for (Object obj6 : xaVar) {
                    if (obj6 != null) {
                        i14 = obj6.hashCode();
                    } else {
                        i14 = 0;
                    }
                    i21 += i14;
                }
                return i21;
            default:
                z7.t tVar3 = (z7.t) this.f2743b;
                if (tVar3 == null) {
                    z7.w wVar2 = (z7.w) this;
                    z7.t tVar4 = new z7.t(wVar2, wVar2.f60120e);
                    this.f2743b = tVar4;
                    tVar3 = tVar4;
                }
                int i22 = 0;
                for (Object obj7 : tVar3) {
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
        switch (this.f2742a) {
            case 0:
                return false;
            case 1:
                if (((com.google.android.gms.internal.cast.q0) this).size() == 0) {
                    return true;
                }
                return false;
            case 2:
                if (((com.google.android.gms.internal.play_billing.a0) this).size() == 0) {
                    return true;
                }
                return false;
            case 3:
                if (((v7.l) this).size() == 0) {
                    return true;
                }
                return false;
            case 4:
                return false;
            case 5:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final Set keySet() {
        switch (this.f2742a) {
            case 0:
                u uVar = (u) this.f2744c;
                if (uVar == null) {
                    w wVar = (w) this;
                    u uVar2 = new u(wVar, new v(0, wVar.f3101e));
                    this.f2744c = uVar2;
                    return uVar2;
                }
                return uVar;
            case 1:
                com.google.android.gms.internal.cast.o0 o0Var = (com.google.android.gms.internal.cast.o0) this.f2744c;
                if (o0Var == null) {
                    com.google.android.gms.internal.cast.q0 q0Var = (com.google.android.gms.internal.cast.q0) this;
                    com.google.android.gms.internal.cast.o0 o0Var2 = new com.google.android.gms.internal.cast.o0(q0Var, new com.google.android.gms.internal.cast.p0(0, q0Var.h, q0Var.f7011f));
                    this.f2744c = o0Var2;
                    return o0Var2;
                }
                return o0Var;
            case 2:
                com.google.android.gms.internal.play_billing.y yVar = (com.google.android.gms.internal.play_billing.y) this.f2744c;
                if (yVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.y yVar2 = new com.google.android.gms.internal.play_billing.y(a0Var, new com.google.android.gms.internal.play_billing.z(0, a0Var.h, a0Var.f7356f));
                    this.f2744c = yVar2;
                    return yVar2;
                }
                return yVar;
            case 3:
                v7.j jVar = (v7.j) this.f2744c;
                if (jVar == null) {
                    v7.l lVar = (v7.l) this;
                    v7.j jVar2 = new v7.j(lVar, new v7.k(0, lVar.h, lVar.f56467f));
                    this.f2744c = jVar2;
                    return jVar2;
                }
                return jVar;
            case 4:
                x7.b bVar = (x7.b) this.f2744c;
                if (bVar == null) {
                    x7.d dVar = (x7.d) this;
                    x7.b bVar2 = new x7.b(dVar, new x7.c(0, dVar.f58261e));
                    this.f2744c = bVar2;
                    return bVar2;
                }
                return bVar;
            case 5:
                y7.ya yaVar = (y7.ya) this.f2744c;
                if (yaVar == null) {
                    y7.ab abVar = (y7.ab) this;
                    y7.ya yaVar2 = new y7.ya(abVar, new y7.za(0, abVar.f59045e));
                    this.f2744c = yaVar2;
                    return yaVar2;
                }
                return yaVar;
            default:
                z7.u uVar3 = (z7.u) this.f2744c;
                if (uVar3 == null) {
                    z7.w wVar2 = (z7.w) this;
                    z7.u uVar4 = new z7.u(wVar2, new z7.v(0, wVar2.f60120e));
                    this.f2744c = uVar4;
                    return uVar4;
                }
                return uVar3;
        }
    }

    @Override
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i3 = this.f2742a;
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        switch (this.f2742a) {
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
        switch (this.f2742a) {
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
        int i3 = this.f2742a;
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        int i3 = this.f2742a;
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override
    public Object replace(Object obj, Object obj2) {
        int i3 = this.f2742a;
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override
    public void replaceAll(BiFunction biFunction) {
        int i3 = this.f2742a;
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        switch (this.f2742a) {
            case 0:
                boolean z10 = true;
                StringBuilder sb2 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb2.append('{');
                Iterator it = ((t) entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z10) {
                        sb2.append(", ");
                    }
                    sb2.append(entry.getKey());
                    sb2.append('=');
                    sb2.append(entry.getValue());
                    z10 = false;
                }
                sb2.append('}');
                return sb2.toString();
            case 1:
                int i3 = ((com.google.android.gms.internal.cast.q0) this).h;
                if (i3 >= 0) {
                    StringBuilder sb3 = new StringBuilder((int) Math.min(i3 * 8, 1073741824L));
                    sb3.append('{');
                    Iterator it2 = ((com.google.android.gms.internal.cast.m0) entrySet()).iterator();
                    boolean z11 = true;
                    while (it2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        if (!z11) {
                            sb3.append(", ");
                        }
                        sb3.append(entry2.getKey());
                        sb3.append('=');
                        sb3.append(entry2.getValue());
                        z11 = false;
                    }
                    sb3.append('}');
                    return sb3.toString();
                }
                throw new IllegalArgumentException(k2.p1.i(i3, "size cannot be negative but was: "));
            case 2:
                int i10 = ((com.google.android.gms.internal.play_billing.a0) this).h;
                if (i10 >= 0) {
                    StringBuilder sb4 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
                    sb4.append('{');
                    Iterator it3 = ((com.google.android.gms.internal.play_billing.x) entrySet()).iterator();
                    boolean z12 = true;
                    while (it3.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it3.next();
                        if (!z12) {
                            sb4.append(", ");
                        }
                        sb4.append(entry3.getKey());
                        sb4.append('=');
                        sb4.append(entry3.getValue());
                        z12 = false;
                    }
                    sb4.append('}');
                    return sb4.toString();
                }
                throw new IllegalArgumentException(k2.p1.i(i10, "size cannot be negative but was: "));
            case 3:
                int i11 = ((v7.l) this).h;
                if (i11 >= 0) {
                    StringBuilder sb5 = new StringBuilder((int) Math.min(i11 * 8, 1073741824L));
                    sb5.append('{');
                    Iterator it4 = ((v7.i) entrySet()).iterator();
                    boolean z13 = true;
                    while (it4.hasNext()) {
                        Map.Entry entry4 = (Map.Entry) it4.next();
                        if (!z13) {
                            sb5.append(", ");
                        }
                        sb5.append(entry4.getKey());
                        sb5.append('=');
                        sb5.append(entry4.getValue());
                        z13 = false;
                    }
                    sb5.append('}');
                    return sb5.toString();
                }
                throw new IllegalArgumentException(k2.p1.i(i11, "size cannot be negative but was: "));
            case 4:
                boolean z14 = true;
                StringBuilder sb6 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb6.append('{');
                Iterator it5 = ((x7.a) entrySet()).iterator();
                while (it5.hasNext()) {
                    Map.Entry entry5 = (Map.Entry) it5.next();
                    if (!z14) {
                        sb6.append(", ");
                    }
                    sb6.append(entry5.getKey());
                    sb6.append('=');
                    sb6.append(entry5.getValue());
                    z14 = false;
                }
                sb6.append('}');
                return sb6.toString();
            case 5:
                boolean z15 = true;
                StringBuilder sb7 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb7.append('{');
                Iterator it6 = ((y7.xa) entrySet()).iterator();
                while (it6.hasNext()) {
                    Map.Entry entry6 = (Map.Entry) it6.next();
                    if (!z15) {
                        sb7.append(", ");
                    }
                    sb7.append(entry6.getKey());
                    sb7.append('=');
                    sb7.append(entry6.getValue());
                    z15 = false;
                }
                sb7.append('}');
                return sb7.toString();
            default:
                boolean z16 = true;
                StringBuilder sb8 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb8.append('{');
                Iterator it7 = ((z7.t) entrySet()).iterator();
                while (it7.hasNext()) {
                    Map.Entry entry7 = (Map.Entry) it7.next();
                    if (!z16) {
                        sb8.append(", ");
                    }
                    sb8.append(entry7.getKey());
                    sb8.append('=');
                    sb8.append(entry7.getValue());
                    z16 = false;
                }
                sb8.append('}');
                return sb8.toString();
        }
    }

    @Override
    public final Collection values() {
        switch (this.f2742a) {
            case 0:
                v vVar = (v) this.d;
                if (vVar == null) {
                    v vVar2 = new v(1, ((w) this).f3101e);
                    this.d = vVar2;
                    return vVar2;
                }
                return vVar;
            case 1:
                com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this.d;
                if (p0Var == null) {
                    com.google.android.gms.internal.cast.q0 q0Var = (com.google.android.gms.internal.cast.q0) this;
                    com.google.android.gms.internal.cast.p0 p0Var2 = new com.google.android.gms.internal.cast.p0(1, q0Var.h, q0Var.f7011f);
                    this.d = p0Var2;
                    return p0Var2;
                }
                return p0Var;
            case 2:
                com.google.android.gms.internal.play_billing.z zVar = (com.google.android.gms.internal.play_billing.z) this.d;
                if (zVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.z zVar2 = new com.google.android.gms.internal.play_billing.z(1, a0Var.h, a0Var.f7356f);
                    this.d = zVar2;
                    return zVar2;
                }
                return zVar;
            case 3:
                v7.k kVar = (v7.k) this.d;
                if (kVar == null) {
                    v7.l lVar = (v7.l) this;
                    v7.k kVar2 = new v7.k(1, lVar.h, lVar.f56467f);
                    this.d = kVar2;
                    return kVar2;
                }
                return kVar;
            case 4:
                x7.c cVar = (x7.c) this.d;
                if (cVar == null) {
                    x7.c cVar2 = new x7.c(1, ((x7.d) this).f58261e);
                    this.d = cVar2;
                    return cVar2;
                }
                return cVar;
            case 5:
                y7.za zaVar = (y7.za) this.d;
                if (zaVar == null) {
                    y7.za zaVar2 = new y7.za(1, ((y7.ab) this).f59045e);
                    this.d = zaVar2;
                    return zaVar2;
                }
                return zaVar;
            default:
                z7.v vVar3 = (z7.v) this.d;
                if (vVar3 == null) {
                    z7.v vVar4 = new z7.v(1, ((z7.w) this).f60120e);
                    this.d = vVar4;
                    return vVar4;
                }
                return vVar3;
        }
    }

    @Override
    public final Object remove(Object obj) {
        switch (this.f2742a) {
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
        int i3 = this.f2742a;
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
