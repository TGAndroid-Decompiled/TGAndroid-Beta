package defpackage;

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
public abstract class f7d implements Map, Serializable, j$.util.Map {
    public final byte a;
    public transient AbstractCollection b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;

    public f7d(byte b) {
        this.a = b;
    }

    public static void b(java.util.Set r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f7d.b(java.util.Set):void");
    }

    @Override
    public final void clear() {
        switch (this.a) {
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
    public final Object compute(Object obj, BiFunction biFunction) {
        byte b = this.a;
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override
    public final Object computeIfAbsent(Object obj, Function function) {
        byte b = this.a;
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        byte b = this.a;
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override
    public final boolean containsKey(Object obj) {
        switch (this.a) {
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
        switch (this.a) {
            case 0:
                s8d s8dVar = (s8d) this.d;
                if (s8dVar == null) {
                    v8d v8dVar = (v8d) this;
                    s8d s8dVar2 = new s8d(1, v8dVar.h, v8dVar.f);
                    this.d = s8dVar2;
                    s8dVar = s8dVar2;
                }
                return s8dVar.contains(obj);
            case 1:
                jed jedVar = (jed) this.d;
                if (jedVar == null) {
                    jed jedVar2 = new jed(1, ((med) this).e);
                    this.d = jedVar2;
                    jedVar = jedVar2;
                }
                return jedVar.contains(obj);
            case 2:
                agd agdVar = (agd) this.d;
                if (agdVar == null) {
                    agd agdVar2 = new agd(1, ((ggd) this).e);
                    this.d = agdVar2;
                    agdVar = agdVar2;
                }
                return agdVar.contains(obj);
            case 3:
                kid kidVar = (kid) this.d;
                if (kidVar == null) {
                    qid qidVar = (qid) this;
                    kid kidVar2 = new kid(1, qidVar.h, qidVar.f);
                    this.d = kidVar2;
                    kidVar = kidVar2;
                }
                return kidVar.contains(obj);
            case 4:
                u6e u6eVar = (u6e) this.d;
                if (u6eVar == null) {
                    a7e a7eVar = (a7e) this;
                    u6e u6eVar2 = new u6e(1, a7eVar.h, a7eVar.f);
                    this.d = u6eVar2;
                    u6eVar = u6eVar2;
                }
                return u6eVar.contains(obj);
            case 5:
                thf thfVar = (thf) this.d;
                if (thfVar == null) {
                    thf thfVar2 = new thf(1, ((aif) this).e);
                    this.d = thfVar2;
                    thfVar = thfVar2;
                }
                return thfVar.contains(obj);
            default:
                s5d s5dVar = (s5d) this.d;
                if (s5dVar == null) {
                    s5d s5dVar2 = new s5d(1, ((c6d) this).e);
                    this.d = s5dVar2;
                    s5dVar = s5dVar2;
                }
                return s5dVar.contains(obj);
        }
    }

    @Override
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                l8d l8dVar = (l8d) this.b;
                if (l8dVar == null) {
                    v8d v8dVar = (v8d) this;
                    l8d l8dVar2 = new l8d(v8dVar, v8dVar.f, v8dVar.h);
                    this.b = l8dVar2;
                    return l8dVar2;
                }
                return l8dVar;
            case 1:
                ced cedVar = (ced) this.b;
                if (cedVar == null) {
                    med medVar = (med) this;
                    ced cedVar2 = new ced(medVar, medVar.e);
                    this.b = cedVar2;
                    return cedVar2;
                }
                return cedVar;
            case 2:
                rfd rfdVar = (rfd) this.b;
                if (rfdVar == null) {
                    ggd ggdVar = (ggd) this;
                    rfd rfdVar2 = new rfd(ggdVar, ggdVar.e);
                    this.b = rfdVar2;
                    return rfdVar2;
                }
                return rfdVar;
            case 3:
                bid bidVar = (bid) this.b;
                if (bidVar == null) {
                    qid qidVar = (qid) this;
                    bid bidVar2 = new bid(qidVar, qidVar.f, qidVar.h);
                    this.b = bidVar2;
                    return bidVar2;
                }
                return bidVar;
            case 4:
                u5e u5eVar = (u5e) this.b;
                if (u5eVar == null) {
                    a7e a7eVar = (a7e) this;
                    u5e u5eVar2 = new u5e(a7eVar, a7eVar.f, a7eVar.h);
                    this.b = u5eVar2;
                    return u5eVar2;
                }
                return u5eVar;
            case 5:
                vgf vgfVar = (vgf) this.b;
                if (vgfVar == null) {
                    aif aifVar = (aif) this;
                    vgf vgfVar2 = new vgf(aifVar, aifVar.e);
                    this.b = vgfVar2;
                    return vgfVar2;
                }
                return vgfVar;
            default:
                c5d c5dVar = (c5d) this.b;
                if (c5dVar == null) {
                    c6d c6dVar = (c6d) this;
                    c5d c5dVar2 = new c5d(c6dVar, c6dVar.e);
                    this.b = c5dVar2;
                    return c5dVar2;
                }
                return c5dVar;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.a) {
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
    public final void forEach(BiConsumer biConsumer) {
        byte b = this.a;
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override
    public abstract Object get(Object obj);

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.a) {
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
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        switch (this.a) {
            case 0:
                l8d l8dVar = (l8d) this.b;
                if (l8dVar == null) {
                    v8d v8dVar = (v8d) this;
                    l8d l8dVar2 = new l8d(v8dVar, v8dVar.f, v8dVar.h);
                    this.b = l8dVar2;
                    l8dVar = l8dVar2;
                }
                int i8 = 0;
                for (Object obj : l8dVar) {
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    i8 += i;
                }
                return i8;
            case 1:
                ced cedVar = (ced) this.b;
                if (cedVar == null) {
                    med medVar = (med) this;
                    ced cedVar2 = new ced(medVar, medVar.e);
                    this.b = cedVar2;
                    cedVar = cedVar2;
                }
                int i9 = 0;
                for (Object obj2 : cedVar) {
                    if (obj2 != null) {
                        i2 = obj2.hashCode();
                    } else {
                        i2 = 0;
                    }
                    i9 += i2;
                }
                return i9;
            case 2:
                rfd rfdVar = (rfd) this.b;
                if (rfdVar == null) {
                    ggd ggdVar = (ggd) this;
                    rfd rfdVar2 = new rfd(ggdVar, ggdVar.e);
                    this.b = rfdVar2;
                    rfdVar = rfdVar2;
                }
                int i10 = 0;
                for (Object obj3 : rfdVar) {
                    if (obj3 != null) {
                        i3 = obj3.hashCode();
                    } else {
                        i3 = 0;
                    }
                    i10 += i3;
                }
                return i10;
            case 3:
                bid bidVar = (bid) this.b;
                if (bidVar == null) {
                    qid qidVar = (qid) this;
                    bid bidVar2 = new bid(qidVar, qidVar.f, qidVar.h);
                    this.b = bidVar2;
                    bidVar = bidVar2;
                }
                int i11 = 0;
                for (Object obj4 : bidVar) {
                    if (obj4 != null) {
                        i4 = obj4.hashCode();
                    } else {
                        i4 = 0;
                    }
                    i11 += i4;
                }
                return i11;
            case 4:
                u5e u5eVar = (u5e) this.b;
                if (u5eVar == null) {
                    a7e a7eVar = (a7e) this;
                    u5e u5eVar2 = new u5e(a7eVar, a7eVar.f, a7eVar.h);
                    this.b = u5eVar2;
                    u5eVar = u5eVar2;
                }
                int i12 = 0;
                for (Object obj5 : u5eVar) {
                    if (obj5 != null) {
                        i5 = obj5.hashCode();
                    } else {
                        i5 = 0;
                    }
                    i12 += i5;
                }
                return i12;
            case 5:
                vgf vgfVar = (vgf) this.b;
                if (vgfVar == null) {
                    aif aifVar = (aif) this;
                    vgf vgfVar2 = new vgf(aifVar, aifVar.e);
                    this.b = vgfVar2;
                    vgfVar = vgfVar2;
                }
                int i13 = 0;
                for (Object obj6 : vgfVar) {
                    if (obj6 != null) {
                        i6 = obj6.hashCode();
                    } else {
                        i6 = 0;
                    }
                    i13 += i6;
                }
                return i13;
            default:
                c5d c5dVar = (c5d) this.b;
                if (c5dVar == null) {
                    c6d c6dVar = (c6d) this;
                    c5d c5dVar2 = new c5d(c6dVar, c6dVar.e);
                    this.b = c5dVar2;
                    c5dVar = c5dVar2;
                }
                int i14 = 0;
                for (Object obj7 : c5dVar) {
                    if (obj7 != null) {
                        i7 = obj7.hashCode();
                    } else {
                        i7 = 0;
                    }
                    i14 += i7;
                }
                return i14;
        }
    }

    @Override
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                if (((v8d) this).size() == 0) {
                    return true;
                }
                return false;
            case 1:
            case 2:
            case 5:
            default:
                return false;
            case 3:
                if (((qid) this).size() == 0) {
                    return true;
                }
                return false;
            case 4:
                if (((a7e) this).size() == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Set keySet() {
        switch (this.a) {
            case 0:
                n8d n8dVar = (n8d) this.c;
                if (n8dVar == null) {
                    v8d v8dVar = (v8d) this;
                    n8d n8dVar2 = new n8d(v8dVar, new s8d(0, v8dVar.h, v8dVar.f));
                    this.c = n8dVar2;
                    return n8dVar2;
                }
                return n8dVar;
            case 1:
                ged gedVar = (ged) this.c;
                if (gedVar == null) {
                    med medVar = (med) this;
                    ged gedVar2 = new ged(medVar, new jed(0, medVar.e));
                    this.c = gedVar2;
                    return gedVar2;
                }
                return gedVar;
            case 2:
                wfd wfdVar = (wfd) this.c;
                if (wfdVar == null) {
                    ggd ggdVar = (ggd) this;
                    wfd wfdVar2 = new wfd(ggdVar, new agd(0, ggdVar.e));
                    this.c = wfdVar2;
                    return wfdVar2;
                }
                return wfdVar;
            case 3:
                hid hidVar = (hid) this.c;
                if (hidVar == null) {
                    qid qidVar = (qid) this;
                    hid hidVar2 = new hid(qidVar, new kid(0, qidVar.h, qidVar.f));
                    this.c = hidVar2;
                    return hidVar2;
                }
                return hidVar;
            case 4:
                o6e o6eVar = (o6e) this.c;
                if (o6eVar == null) {
                    a7e a7eVar = (a7e) this;
                    o6e o6eVar2 = new o6e(a7eVar, new u6e(0, a7eVar.h, a7eVar.f));
                    this.c = o6eVar2;
                    return o6eVar2;
                }
                return o6eVar;
            case 5:
                khf khfVar = (khf) this.c;
                if (khfVar == null) {
                    aif aifVar = (aif) this;
                    khf khfVar2 = new khf(aifVar, new thf(0, aifVar.e));
                    this.c = khfVar2;
                    return khfVar2;
                }
                return khfVar;
            default:
                q5d q5dVar = (q5d) this.c;
                if (q5dVar == null) {
                    c6d c6dVar = (c6d) this;
                    q5d q5dVar2 = new q5d(c6dVar, new s5d(0, c6dVar.e));
                    this.c = q5dVar2;
                    return q5dVar2;
                }
                return q5dVar;
        }
    }

    @Override
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        byte b = this.a;
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        switch (this.a) {
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
        switch (this.a) {
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
    public final Object putIfAbsent(Object obj, Object obj2) {
        byte b = this.a;
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override
    public final Object remove(Object obj) {
        switch (this.a) {
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
    public final Object replace(Object obj, Object obj2) {
        byte b = this.a;
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override
    public final void replaceAll(BiFunction biFunction) {
        byte b = this.a;
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        boolean z = true;
        switch (this.a) {
            case 0:
                int i = ((v8d) this).h;
                if (i >= 0) {
                    StringBuilder sb = new StringBuilder((int) Math.min(i << 3, 1073741824L));
                    sb.append('{');
                    Iterator it = ((l8d) entrySet()).iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!z) {
                            sb.append(", ");
                        }
                        sb.append(entry.getKey());
                        sb.append('=');
                        sb.append(entry.getValue());
                        z = false;
                    }
                    sb.append('}');
                    return sb.toString();
                }
                w26.j(de9.k(i, "size cannot be negative but was: "));
                return null;
            case 1:
                StringBuilder sb2 = new StringBuilder((int) 8);
                sb2.append('{');
                Iterator it2 = ((ced) entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z = false;
                }
                sb2.append('}');
                return sb2.toString();
            case 2:
                StringBuilder sb3 = new StringBuilder((int) 8);
                sb3.append('{');
                Iterator it3 = ((rfd) entrySet()).iterator();
                while (it3.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it3.next();
                    if (!z) {
                        sb3.append(", ");
                    }
                    sb3.append(entry3.getKey());
                    sb3.append('=');
                    sb3.append(entry3.getValue());
                    z = false;
                }
                sb3.append('}');
                return sb3.toString();
            case 3:
                int i2 = ((qid) this).h;
                if (i2 >= 0) {
                    StringBuilder sb4 = new StringBuilder((int) Math.min(i2 << 3, 1073741824L));
                    sb4.append('{');
                    Iterator it4 = ((bid) entrySet()).iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry4 = (Map.Entry) it4.next();
                        if (!z) {
                            sb4.append(", ");
                        }
                        sb4.append(entry4.getKey());
                        sb4.append('=');
                        sb4.append(entry4.getValue());
                        z = false;
                    }
                    sb4.append('}');
                    return sb4.toString();
                }
                w26.j(de9.k(i2, "size cannot be negative but was: "));
                return null;
            case 4:
                int i3 = ((a7e) this).h;
                if (i3 >= 0) {
                    StringBuilder sb5 = new StringBuilder((int) Math.min(i3 << 3, 1073741824L));
                    sb5.append('{');
                    Iterator it5 = ((u5e) entrySet()).iterator();
                    while (it5.hasNext()) {
                        Map.Entry entry5 = (Map.Entry) it5.next();
                        if (!z) {
                            sb5.append(", ");
                        }
                        sb5.append(entry5.getKey());
                        sb5.append('=');
                        sb5.append(entry5.getValue());
                        z = false;
                    }
                    sb5.append('}');
                    return sb5.toString();
                }
                w26.j(de9.k(i3, "size cannot be negative but was: "));
                return null;
            case 5:
                StringBuilder sb6 = new StringBuilder((int) 8);
                sb6.append('{');
                Iterator it6 = ((vgf) entrySet()).iterator();
                while (it6.hasNext()) {
                    Map.Entry entry6 = (Map.Entry) it6.next();
                    if (!z) {
                        sb6.append(", ");
                    }
                    sb6.append(entry6.getKey());
                    sb6.append('=');
                    sb6.append(entry6.getValue());
                    z = false;
                }
                sb6.append('}');
                return sb6.toString();
            default:
                StringBuilder sb7 = new StringBuilder((int) 8);
                sb7.append('{');
                Iterator it7 = ((c5d) entrySet()).iterator();
                while (it7.hasNext()) {
                    Map.Entry entry7 = (Map.Entry) it7.next();
                    if (!z) {
                        sb7.append(", ");
                    }
                    sb7.append(entry7.getKey());
                    sb7.append('=');
                    sb7.append(entry7.getValue());
                    z = false;
                }
                sb7.append('}');
                return sb7.toString();
        }
    }

    @Override
    public final Collection values() {
        switch (this.a) {
            case 0:
                s8d s8dVar = (s8d) this.d;
                if (s8dVar == null) {
                    v8d v8dVar = (v8d) this;
                    s8d s8dVar2 = new s8d(1, v8dVar.h, v8dVar.f);
                    this.d = s8dVar2;
                    return s8dVar2;
                }
                return s8dVar;
            case 1:
                jed jedVar = (jed) this.d;
                if (jedVar == null) {
                    jed jedVar2 = new jed(1, ((med) this).e);
                    this.d = jedVar2;
                    return jedVar2;
                }
                return jedVar;
            case 2:
                agd agdVar = (agd) this.d;
                if (agdVar == null) {
                    agd agdVar2 = new agd(1, ((ggd) this).e);
                    this.d = agdVar2;
                    return agdVar2;
                }
                return agdVar;
            case 3:
                kid kidVar = (kid) this.d;
                if (kidVar == null) {
                    qid qidVar = (qid) this;
                    kid kidVar2 = new kid(1, qidVar.h, qidVar.f);
                    this.d = kidVar2;
                    return kidVar2;
                }
                return kidVar;
            case 4:
                u6e u6eVar = (u6e) this.d;
                if (u6eVar == null) {
                    a7e a7eVar = (a7e) this;
                    u6e u6eVar2 = new u6e(1, a7eVar.h, a7eVar.f);
                    this.d = u6eVar2;
                    return u6eVar2;
                }
                return u6eVar;
            case 5:
                thf thfVar = (thf) this.d;
                if (thfVar == null) {
                    thf thfVar2 = new thf(1, ((aif) this).e);
                    this.d = thfVar2;
                    return thfVar2;
                }
                return thfVar;
            default:
                s5d s5dVar = (s5d) this.d;
                if (s5dVar == null) {
                    s5d s5dVar2 = new s5d(1, ((c6d) this).e);
                    this.d = s5dVar2;
                    return s5dVar2;
                }
                return s5dVar;
        }
    }

    @Override
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        byte b = this.a;
        return Map.CC.$default$remove(this, obj, obj2);
    }
}
