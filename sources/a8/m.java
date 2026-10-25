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
public abstract class m implements Map, Serializable, j$.util.Map {
    public final int f601a;
    public transient AbstractCollection f602b;
    public transient AbstractCollection f603c;
    public transient AbstractCollection d;

    public m(int i10) {
        this.f601a = i10;
    }

    public static void a(java.util.Set r18) {
        throw new UnsupportedOperationException("Method not decompiled: a8.m.a(java.util.Set):void");
    }

    @Override
    public final void clear() {
        switch (this.f601a) {
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
        int i10 = this.f601a;
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override
    public Object computeIfAbsent(Object obj, Function function) {
        int i10 = this.f601a;
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        int i10 = this.f601a;
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override
    public final boolean containsKey(Object obj) {
        switch (this.f601a) {
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
        switch (this.f601a) {
            case 0:
                v vVar = (v) this.d;
                if (vVar == null) {
                    v vVar2 = new v(1, ((w) this).e);
                    this.d = vVar2;
                    vVar = vVar2;
                }
                return vVar.contains(obj);
            case 1:
                com.google.android.gms.internal.cast.o0 o0Var = (com.google.android.gms.internal.cast.o0) this.d;
                if (o0Var == null) {
                    com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                    com.google.android.gms.internal.cast.o0 o0Var2 = new com.google.android.gms.internal.cast.o0(1, p0Var.h, p0Var.f6852f);
                    this.d = o0Var2;
                    o0Var = o0Var2;
                }
                return o0Var.contains(obj);
            case 2:
                com.google.android.gms.internal.play_billing.z zVar = (com.google.android.gms.internal.play_billing.z) this.d;
                if (zVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.z zVar2 = new com.google.android.gms.internal.play_billing.z(1, a0Var.h, a0Var.f7179f);
                    this.d = zVar2;
                    zVar = zVar2;
                }
                return zVar.contains(obj);
            case 3:
                u7.k kVar = (u7.k) this.d;
                if (kVar == null) {
                    u7.l lVar = (u7.l) this;
                    u7.k kVar2 = new u7.k(1, lVar.h, lVar.f49605f);
                    this.d = kVar2;
                    kVar = kVar2;
                }
                return kVar.contains(obj);
            case 4:
                w7.c cVar = (w7.c) this.d;
                if (cVar == null) {
                    w7.c cVar2 = new w7.c(1, ((w7.d) this).e);
                    this.d = cVar2;
                    cVar = cVar2;
                }
                return cVar.contains(obj);
            case 5:
                x7.za zaVar = (x7.za) this.d;
                if (zaVar == null) {
                    x7.za zaVar2 = new x7.za(1, ((x7.ab) this).e);
                    this.d = zaVar2;
                    zaVar = zaVar2;
                }
                return zaVar.contains(obj);
            default:
                y7.v vVar3 = (y7.v) this.d;
                if (vVar3 == null) {
                    y7.v vVar4 = new y7.v(1, ((y7.w) this).e);
                    this.d = vVar4;
                    vVar3 = vVar4;
                }
                return vVar3.contains(obj);
        }
    }

    @Override
    public final Set entrySet() {
        switch (this.f601a) {
            case 0:
                t tVar = (t) this.f602b;
                if (tVar == null) {
                    w wVar = (w) this;
                    t tVar2 = new t(wVar, wVar.e);
                    this.f602b = tVar2;
                    return tVar2;
                }
                return tVar;
            case 1:
                com.google.android.gms.internal.cast.l0 l0Var = (com.google.android.gms.internal.cast.l0) this.f602b;
                if (l0Var == null) {
                    com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                    com.google.android.gms.internal.cast.l0 l0Var2 = new com.google.android.gms.internal.cast.l0(p0Var, p0Var.f6852f, p0Var.h);
                    this.f602b = l0Var2;
                    return l0Var2;
                }
                return l0Var;
            case 2:
                com.google.android.gms.internal.play_billing.x xVar = (com.google.android.gms.internal.play_billing.x) this.f602b;
                if (xVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.x xVar2 = new com.google.android.gms.internal.play_billing.x(a0Var, a0Var.f7179f, a0Var.h);
                    this.f602b = xVar2;
                    return xVar2;
                }
                return xVar;
            case 3:
                u7.i iVar = (u7.i) this.f602b;
                if (iVar == null) {
                    u7.l lVar = (u7.l) this;
                    u7.i iVar2 = new u7.i(lVar, lVar.f49605f, lVar.h);
                    this.f602b = iVar2;
                    return iVar2;
                }
                return iVar;
            case 4:
                w7.a aVar = (w7.a) this.f602b;
                if (aVar == null) {
                    w7.d dVar = (w7.d) this;
                    w7.a aVar2 = new w7.a(dVar, dVar.e);
                    this.f602b = aVar2;
                    return aVar2;
                }
                return aVar;
            case 5:
                x7.xa xaVar = (x7.xa) this.f602b;
                if (xaVar == null) {
                    x7.ab abVar = (x7.ab) this;
                    x7.xa xaVar2 = new x7.xa(abVar, abVar.e);
                    this.f602b = xaVar2;
                    return xaVar2;
                }
                return xaVar;
            default:
                y7.t tVar3 = (y7.t) this.f602b;
                if (tVar3 == null) {
                    y7.w wVar2 = (y7.w) this;
                    y7.t tVar4 = new y7.t(wVar2, wVar2.e);
                    this.f602b = tVar4;
                    return tVar4;
                }
                return tVar3;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.f601a) {
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
        int i10 = this.f601a;
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override
    public abstract Object get(Object obj);

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f601a) {
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
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f601a) {
            case 0:
                t tVar = (t) this.f602b;
                if (tVar == null) {
                    w wVar = (w) this;
                    t tVar2 = new t(wVar, wVar.e);
                    this.f602b = tVar2;
                    tVar = tVar2;
                }
                int i17 = 0;
                for (Object obj : tVar) {
                    if (obj != null) {
                        i10 = obj.hashCode();
                    } else {
                        i10 = 0;
                    }
                    i17 += i10;
                }
                return i17;
            case 1:
                com.google.android.gms.internal.cast.l0 l0Var = (com.google.android.gms.internal.cast.l0) this.f602b;
                if (l0Var == null) {
                    com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                    com.google.android.gms.internal.cast.l0 l0Var2 = new com.google.android.gms.internal.cast.l0(p0Var, p0Var.f6852f, p0Var.h);
                    this.f602b = l0Var2;
                    l0Var = l0Var2;
                }
                int i18 = 0;
                for (Object obj2 : l0Var) {
                    if (obj2 != null) {
                        i11 = obj2.hashCode();
                    } else {
                        i11 = 0;
                    }
                    i18 += i11;
                }
                return i18;
            case 2:
                com.google.android.gms.internal.play_billing.x xVar = (com.google.android.gms.internal.play_billing.x) this.f602b;
                if (xVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.x xVar2 = new com.google.android.gms.internal.play_billing.x(a0Var, a0Var.f7179f, a0Var.h);
                    this.f602b = xVar2;
                    xVar = xVar2;
                }
                int i19 = 0;
                for (Object obj3 : xVar) {
                    if (obj3 != null) {
                        i12 = obj3.hashCode();
                    } else {
                        i12 = 0;
                    }
                    i19 += i12;
                }
                return i19;
            case 3:
                u7.i iVar = (u7.i) this.f602b;
                if (iVar == null) {
                    u7.l lVar = (u7.l) this;
                    u7.i iVar2 = new u7.i(lVar, lVar.f49605f, lVar.h);
                    this.f602b = iVar2;
                    iVar = iVar2;
                }
                int i20 = 0;
                for (Object obj4 : iVar) {
                    if (obj4 != null) {
                        i13 = obj4.hashCode();
                    } else {
                        i13 = 0;
                    }
                    i20 += i13;
                }
                return i20;
            case 4:
                w7.a aVar = (w7.a) this.f602b;
                if (aVar == null) {
                    w7.d dVar = (w7.d) this;
                    w7.a aVar2 = new w7.a(dVar, dVar.e);
                    this.f602b = aVar2;
                    aVar = aVar2;
                }
                int i21 = 0;
                for (Object obj5 : aVar) {
                    if (obj5 != null) {
                        i14 = obj5.hashCode();
                    } else {
                        i14 = 0;
                    }
                    i21 += i14;
                }
                return i21;
            case 5:
                x7.xa xaVar = (x7.xa) this.f602b;
                if (xaVar == null) {
                    x7.ab abVar = (x7.ab) this;
                    x7.xa xaVar2 = new x7.xa(abVar, abVar.e);
                    this.f602b = xaVar2;
                    xaVar = xaVar2;
                }
                int i22 = 0;
                for (Object obj6 : xaVar) {
                    if (obj6 != null) {
                        i15 = obj6.hashCode();
                    } else {
                        i15 = 0;
                    }
                    i22 += i15;
                }
                return i22;
            default:
                y7.t tVar3 = (y7.t) this.f602b;
                if (tVar3 == null) {
                    y7.w wVar2 = (y7.w) this;
                    y7.t tVar4 = new y7.t(wVar2, wVar2.e);
                    this.f602b = tVar4;
                    tVar3 = tVar4;
                }
                int i23 = 0;
                for (Object obj7 : tVar3) {
                    if (obj7 != null) {
                        i16 = obj7.hashCode();
                    } else {
                        i16 = 0;
                    }
                    i23 += i16;
                }
                return i23;
        }
    }

    @Override
    public final boolean isEmpty() {
        switch (this.f601a) {
            case 0:
                return false;
            case 1:
                if (((com.google.android.gms.internal.cast.p0) this).size() == 0) {
                    return true;
                }
                return false;
            case 2:
                if (((com.google.android.gms.internal.play_billing.a0) this).size() == 0) {
                    return true;
                }
                return false;
            case 3:
                if (((u7.l) this).size() == 0) {
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
        switch (this.f601a) {
            case 0:
                u uVar = (u) this.f603c;
                if (uVar == null) {
                    w wVar = (w) this;
                    u uVar2 = new u(wVar, new v(0, wVar.e));
                    this.f603c = uVar2;
                    return uVar2;
                }
                return uVar;
            case 1:
                com.google.android.gms.internal.cast.n0 n0Var = (com.google.android.gms.internal.cast.n0) this.f603c;
                if (n0Var == null) {
                    com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                    com.google.android.gms.internal.cast.n0 n0Var2 = new com.google.android.gms.internal.cast.n0(p0Var, new com.google.android.gms.internal.cast.o0(0, p0Var.h, p0Var.f6852f));
                    this.f603c = n0Var2;
                    return n0Var2;
                }
                return n0Var;
            case 2:
                com.google.android.gms.internal.play_billing.y yVar = (com.google.android.gms.internal.play_billing.y) this.f603c;
                if (yVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.y yVar2 = new com.google.android.gms.internal.play_billing.y(a0Var, new com.google.android.gms.internal.play_billing.z(0, a0Var.h, a0Var.f7179f));
                    this.f603c = yVar2;
                    return yVar2;
                }
                return yVar;
            case 3:
                u7.j jVar = (u7.j) this.f603c;
                if (jVar == null) {
                    u7.l lVar = (u7.l) this;
                    u7.j jVar2 = new u7.j(lVar, new u7.k(0, lVar.h, lVar.f49605f));
                    this.f603c = jVar2;
                    return jVar2;
                }
                return jVar;
            case 4:
                w7.b bVar = (w7.b) this.f603c;
                if (bVar == null) {
                    w7.d dVar = (w7.d) this;
                    w7.b bVar2 = new w7.b(dVar, new w7.c(0, dVar.e));
                    this.f603c = bVar2;
                    return bVar2;
                }
                return bVar;
            case 5:
                x7.ya yaVar = (x7.ya) this.f603c;
                if (yaVar == null) {
                    x7.ab abVar = (x7.ab) this;
                    x7.ya yaVar2 = new x7.ya(abVar, new x7.za(0, abVar.e));
                    this.f603c = yaVar2;
                    return yaVar2;
                }
                return yaVar;
            default:
                y7.u uVar3 = (y7.u) this.f603c;
                if (uVar3 == null) {
                    y7.w wVar2 = (y7.w) this;
                    y7.u uVar4 = new y7.u(wVar2, new y7.v(0, wVar2.e));
                    this.f603c = uVar4;
                    return uVar4;
                }
                return uVar3;
        }
    }

    @Override
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i10 = this.f601a;
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        switch (this.f601a) {
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
        switch (this.f601a) {
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
        int i10 = this.f601a;
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        int i10 = this.f601a;
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override
    public Object replace(Object obj, Object obj2) {
        int i10 = this.f601a;
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override
    public void replaceAll(BiFunction biFunction) {
        int i10 = this.f601a;
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        switch (this.f601a) {
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
                int i10 = ((com.google.android.gms.internal.cast.p0) this).h;
                if (i10 >= 0) {
                    StringBuilder sb3 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
                    sb3.append('{');
                    Iterator it2 = ((com.google.android.gms.internal.cast.l0) entrySet()).iterator();
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
                throw new IllegalArgumentException(ic.a.i(i10, "size cannot be negative but was: "));
            case 2:
                int i11 = ((com.google.android.gms.internal.play_billing.a0) this).h;
                if (i11 >= 0) {
                    StringBuilder sb4 = new StringBuilder((int) Math.min(i11 * 8, 1073741824L));
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
                throw new IllegalArgumentException(ic.a.i(i11, "size cannot be negative but was: "));
            case 3:
                int i12 = ((u7.l) this).h;
                if (i12 >= 0) {
                    StringBuilder sb5 = new StringBuilder((int) Math.min(i12 * 8, 1073741824L));
                    sb5.append('{');
                    Iterator it4 = ((u7.i) entrySet()).iterator();
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
                throw new IllegalArgumentException(ic.a.i(i12, "size cannot be negative but was: "));
            case 4:
                boolean z14 = true;
                StringBuilder sb6 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb6.append('{');
                Iterator it5 = ((w7.a) entrySet()).iterator();
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
                Iterator it6 = ((x7.xa) entrySet()).iterator();
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
                Iterator it7 = ((y7.t) entrySet()).iterator();
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
        switch (this.f601a) {
            case 0:
                v vVar = (v) this.d;
                if (vVar == null) {
                    v vVar2 = new v(1, ((w) this).e);
                    this.d = vVar2;
                    return vVar2;
                }
                return vVar;
            case 1:
                com.google.android.gms.internal.cast.o0 o0Var = (com.google.android.gms.internal.cast.o0) this.d;
                if (o0Var == null) {
                    com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                    com.google.android.gms.internal.cast.o0 o0Var2 = new com.google.android.gms.internal.cast.o0(1, p0Var.h, p0Var.f6852f);
                    this.d = o0Var2;
                    return o0Var2;
                }
                return o0Var;
            case 2:
                com.google.android.gms.internal.play_billing.z zVar = (com.google.android.gms.internal.play_billing.z) this.d;
                if (zVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.z zVar2 = new com.google.android.gms.internal.play_billing.z(1, a0Var.h, a0Var.f7179f);
                    this.d = zVar2;
                    return zVar2;
                }
                return zVar;
            case 3:
                u7.k kVar = (u7.k) this.d;
                if (kVar == null) {
                    u7.l lVar = (u7.l) this;
                    u7.k kVar2 = new u7.k(1, lVar.h, lVar.f49605f);
                    this.d = kVar2;
                    return kVar2;
                }
                return kVar;
            case 4:
                w7.c cVar = (w7.c) this.d;
                if (cVar == null) {
                    w7.c cVar2 = new w7.c(1, ((w7.d) this).e);
                    this.d = cVar2;
                    return cVar2;
                }
                return cVar;
            case 5:
                x7.za zaVar = (x7.za) this.d;
                if (zaVar == null) {
                    x7.za zaVar2 = new x7.za(1, ((x7.ab) this).e);
                    this.d = zaVar2;
                    return zaVar2;
                }
                return zaVar;
            default:
                y7.v vVar3 = (y7.v) this.d;
                if (vVar3 == null) {
                    y7.v vVar4 = new y7.v(1, ((y7.w) this).e);
                    this.d = vVar4;
                    return vVar4;
                }
                return vVar3;
        }
    }

    @Override
    public final Object remove(Object obj) {
        switch (this.f601a) {
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
        int i10 = this.f601a;
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
