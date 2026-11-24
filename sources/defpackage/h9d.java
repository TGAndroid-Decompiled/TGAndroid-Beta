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
public abstract class h9d implements Map, Serializable, j$.util.Map {
    public final byte a;
    public transient AbstractCollection b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;

    public h9d(byte b) {
        this.a = b;
    }

    public static void b(java.util.Set r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h9d.b(java.util.Set):void");
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
                uad uadVar = (uad) this.d;
                if (uadVar == null) {
                    xad xadVar = (xad) this;
                    uad uadVar2 = new uad(1, xadVar.h, xadVar.f);
                    this.d = uadVar2;
                    uadVar = uadVar2;
                }
                return uadVar.contains(obj);
            case 1:
                kgd kgdVar = (kgd) this.d;
                if (kgdVar == null) {
                    kgd kgdVar2 = new kgd(1, ((ngd) this).e);
                    this.d = kgdVar2;
                    kgdVar = kgdVar2;
                }
                return kgdVar.contains(obj);
            case 2:
                bid bidVar = (bid) this.d;
                if (bidVar == null) {
                    bid bidVar2 = new bid(1, ((hid) this).e);
                    this.d = bidVar2;
                    bidVar = bidVar2;
                }
                return bidVar.contains(obj);
            case 3:
                mkd mkdVar = (mkd) this.d;
                if (mkdVar == null) {
                    skd skdVar = (skd) this;
                    mkd mkdVar2 = new mkd(1, skdVar.h, skdVar.f);
                    this.d = mkdVar2;
                    mkdVar = mkdVar2;
                }
                return mkdVar.contains(obj);
            case 4:
                v8e v8eVar = (v8e) this.d;
                if (v8eVar == null) {
                    b9e b9eVar = (b9e) this;
                    v8e v8eVar2 = new v8e(1, b9eVar.h, b9eVar.f);
                    this.d = v8eVar2;
                    v8eVar = v8eVar2;
                }
                return v8eVar.contains(obj);
            case 5:
                ujf ujfVar = (ujf) this.d;
                if (ujfVar == null) {
                    ujf ujfVar2 = new ujf(1, ((bkf) this).e);
                    this.d = ujfVar2;
                    ujfVar = ujfVar2;
                }
                return ujfVar.contains(obj);
            default:
                u7d u7dVar = (u7d) this.d;
                if (u7dVar == null) {
                    u7d u7dVar2 = new u7d(1, ((e8d) this).e);
                    this.d = u7dVar2;
                    u7dVar = u7dVar2;
                }
                return u7dVar.contains(obj);
        }
    }

    @Override
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                nad nadVar = (nad) this.b;
                if (nadVar == null) {
                    xad xadVar = (xad) this;
                    nad nadVar2 = new nad(xadVar, xadVar.f, xadVar.h);
                    this.b = nadVar2;
                    return nadVar2;
                }
                return nadVar;
            case 1:
                dgd dgdVar = (dgd) this.b;
                if (dgdVar == null) {
                    ngd ngdVar = (ngd) this;
                    dgd dgdVar2 = new dgd(ngdVar, ngdVar.e);
                    this.b = dgdVar2;
                    return dgdVar2;
                }
                return dgdVar;
            case 2:
                shd shdVar = (shd) this.b;
                if (shdVar == null) {
                    hid hidVar = (hid) this;
                    shd shdVar2 = new shd(hidVar, hidVar.e);
                    this.b = shdVar2;
                    return shdVar2;
                }
                return shdVar;
            case 3:
                ckd ckdVar = (ckd) this.b;
                if (ckdVar == null) {
                    skd skdVar = (skd) this;
                    ckd ckdVar2 = new ckd(skdVar, skdVar.f, skdVar.h);
                    this.b = ckdVar2;
                    return ckdVar2;
                }
                return ckdVar;
            case 4:
                x7e x7eVar = (x7e) this.b;
                if (x7eVar == null) {
                    b9e b9eVar = (b9e) this;
                    x7e x7eVar2 = new x7e(b9eVar, b9eVar.f, b9eVar.h);
                    this.b = x7eVar2;
                    return x7eVar2;
                }
                return x7eVar;
            case 5:
                wif wifVar = (wif) this.b;
                if (wifVar == null) {
                    bkf bkfVar = (bkf) this;
                    wif wifVar2 = new wif(bkfVar, bkfVar.e);
                    this.b = wifVar2;
                    return wifVar2;
                }
                return wifVar;
            default:
                e7d e7dVar = (e7d) this.b;
                if (e7dVar == null) {
                    e8d e8dVar = (e8d) this;
                    e7d e7dVar2 = new e7d(e8dVar, e8dVar.e);
                    this.b = e7dVar2;
                    return e7dVar2;
                }
                return e7dVar;
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
                nad nadVar = (nad) this.b;
                if (nadVar == null) {
                    xad xadVar = (xad) this;
                    nad nadVar2 = new nad(xadVar, xadVar.f, xadVar.h);
                    this.b = nadVar2;
                    nadVar = nadVar2;
                }
                int i8 = 0;
                for (Object obj : nadVar) {
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    i8 += i;
                }
                return i8;
            case 1:
                dgd dgdVar = (dgd) this.b;
                if (dgdVar == null) {
                    ngd ngdVar = (ngd) this;
                    dgd dgdVar2 = new dgd(ngdVar, ngdVar.e);
                    this.b = dgdVar2;
                    dgdVar = dgdVar2;
                }
                int i9 = 0;
                for (Object obj2 : dgdVar) {
                    if (obj2 != null) {
                        i2 = obj2.hashCode();
                    } else {
                        i2 = 0;
                    }
                    i9 += i2;
                }
                return i9;
            case 2:
                shd shdVar = (shd) this.b;
                if (shdVar == null) {
                    hid hidVar = (hid) this;
                    shd shdVar2 = new shd(hidVar, hidVar.e);
                    this.b = shdVar2;
                    shdVar = shdVar2;
                }
                int i10 = 0;
                for (Object obj3 : shdVar) {
                    if (obj3 != null) {
                        i3 = obj3.hashCode();
                    } else {
                        i3 = 0;
                    }
                    i10 += i3;
                }
                return i10;
            case 3:
                ckd ckdVar = (ckd) this.b;
                if (ckdVar == null) {
                    skd skdVar = (skd) this;
                    ckd ckdVar2 = new ckd(skdVar, skdVar.f, skdVar.h);
                    this.b = ckdVar2;
                    ckdVar = ckdVar2;
                }
                int i11 = 0;
                for (Object obj4 : ckdVar) {
                    if (obj4 != null) {
                        i4 = obj4.hashCode();
                    } else {
                        i4 = 0;
                    }
                    i11 += i4;
                }
                return i11;
            case 4:
                x7e x7eVar = (x7e) this.b;
                if (x7eVar == null) {
                    b9e b9eVar = (b9e) this;
                    x7e x7eVar2 = new x7e(b9eVar, b9eVar.f, b9eVar.h);
                    this.b = x7eVar2;
                    x7eVar = x7eVar2;
                }
                int i12 = 0;
                for (Object obj5 : x7eVar) {
                    if (obj5 != null) {
                        i5 = obj5.hashCode();
                    } else {
                        i5 = 0;
                    }
                    i12 += i5;
                }
                return i12;
            case 5:
                wif wifVar = (wif) this.b;
                if (wifVar == null) {
                    bkf bkfVar = (bkf) this;
                    wif wifVar2 = new wif(bkfVar, bkfVar.e);
                    this.b = wifVar2;
                    wifVar = wifVar2;
                }
                int i13 = 0;
                for (Object obj6 : wifVar) {
                    if (obj6 != null) {
                        i6 = obj6.hashCode();
                    } else {
                        i6 = 0;
                    }
                    i13 += i6;
                }
                return i13;
            default:
                e7d e7dVar = (e7d) this.b;
                if (e7dVar == null) {
                    e8d e8dVar = (e8d) this;
                    e7d e7dVar2 = new e7d(e8dVar, e8dVar.e);
                    this.b = e7dVar2;
                    e7dVar = e7dVar2;
                }
                int i14 = 0;
                for (Object obj7 : e7dVar) {
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
                if (((xad) this).size() == 0) {
                    return true;
                }
                return false;
            case 1:
            case 2:
            case 5:
            default:
                return false;
            case 3:
                if (((skd) this).size() == 0) {
                    return true;
                }
                return false;
            case 4:
                if (((b9e) this).size() == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Set keySet() {
        switch (this.a) {
            case 0:
                pad padVar = (pad) this.c;
                if (padVar == null) {
                    xad xadVar = (xad) this;
                    pad padVar2 = new pad(xadVar, new uad(0, xadVar.h, xadVar.f));
                    this.c = padVar2;
                    return padVar2;
                }
                return padVar;
            case 1:
                hgd hgdVar = (hgd) this.c;
                if (hgdVar == null) {
                    ngd ngdVar = (ngd) this;
                    hgd hgdVar2 = new hgd(ngdVar, new kgd(0, ngdVar.e));
                    this.c = hgdVar2;
                    return hgdVar2;
                }
                return hgdVar;
            case 2:
                xhd xhdVar = (xhd) this.c;
                if (xhdVar == null) {
                    hid hidVar = (hid) this;
                    xhd xhdVar2 = new xhd(hidVar, new bid(0, hidVar.e));
                    this.c = xhdVar2;
                    return xhdVar2;
                }
                return xhdVar;
            case 3:
                jkd jkdVar = (jkd) this.c;
                if (jkdVar == null) {
                    skd skdVar = (skd) this;
                    jkd jkdVar2 = new jkd(skdVar, new mkd(0, skdVar.h, skdVar.f));
                    this.c = jkdVar2;
                    return jkdVar2;
                }
                return jkdVar;
            case 4:
                p8e p8eVar = (p8e) this.c;
                if (p8eVar == null) {
                    b9e b9eVar = (b9e) this;
                    p8e p8eVar2 = new p8e(b9eVar, new v8e(0, b9eVar.h, b9eVar.f));
                    this.c = p8eVar2;
                    return p8eVar2;
                }
                return p8eVar;
            case 5:
                ljf ljfVar = (ljf) this.c;
                if (ljfVar == null) {
                    bkf bkfVar = (bkf) this;
                    ljf ljfVar2 = new ljf(bkfVar, new ujf(0, bkfVar.e));
                    this.c = ljfVar2;
                    return ljfVar2;
                }
                return ljfVar;
            default:
                s7d s7dVar = (s7d) this.c;
                if (s7dVar == null) {
                    e8d e8dVar = (e8d) this;
                    s7d s7dVar2 = new s7d(e8dVar, new u7d(0, e8dVar.e));
                    this.c = s7dVar2;
                    return s7dVar2;
                }
                return s7dVar;
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
                int i = ((xad) this).h;
                if (i >= 0) {
                    StringBuilder sb = new StringBuilder((int) Math.min(i << 3, 1073741824L));
                    sb.append('{');
                    Iterator it = ((nad) entrySet()).iterator();
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
                u36.j(hg9.j(i, "size cannot be negative but was: "));
                return null;
            case 1:
                StringBuilder sb2 = new StringBuilder((int) 8);
                sb2.append('{');
                Iterator it2 = ((dgd) entrySet()).iterator();
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
                Iterator it3 = ((shd) entrySet()).iterator();
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
                int i2 = ((skd) this).h;
                if (i2 >= 0) {
                    StringBuilder sb4 = new StringBuilder((int) Math.min(i2 << 3, 1073741824L));
                    sb4.append('{');
                    Iterator it4 = ((ckd) entrySet()).iterator();
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
                u36.j(hg9.j(i2, "size cannot be negative but was: "));
                return null;
            case 4:
                int i3 = ((b9e) this).h;
                if (i3 >= 0) {
                    StringBuilder sb5 = new StringBuilder((int) Math.min(i3 << 3, 1073741824L));
                    sb5.append('{');
                    Iterator it5 = ((x7e) entrySet()).iterator();
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
                u36.j(hg9.j(i3, "size cannot be negative but was: "));
                return null;
            case 5:
                StringBuilder sb6 = new StringBuilder((int) 8);
                sb6.append('{');
                Iterator it6 = ((wif) entrySet()).iterator();
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
                Iterator it7 = ((e7d) entrySet()).iterator();
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
                uad uadVar = (uad) this.d;
                if (uadVar == null) {
                    xad xadVar = (xad) this;
                    uad uadVar2 = new uad(1, xadVar.h, xadVar.f);
                    this.d = uadVar2;
                    return uadVar2;
                }
                return uadVar;
            case 1:
                kgd kgdVar = (kgd) this.d;
                if (kgdVar == null) {
                    kgd kgdVar2 = new kgd(1, ((ngd) this).e);
                    this.d = kgdVar2;
                    return kgdVar2;
                }
                return kgdVar;
            case 2:
                bid bidVar = (bid) this.d;
                if (bidVar == null) {
                    bid bidVar2 = new bid(1, ((hid) this).e);
                    this.d = bidVar2;
                    return bidVar2;
                }
                return bidVar;
            case 3:
                mkd mkdVar = (mkd) this.d;
                if (mkdVar == null) {
                    skd skdVar = (skd) this;
                    mkd mkdVar2 = new mkd(1, skdVar.h, skdVar.f);
                    this.d = mkdVar2;
                    return mkdVar2;
                }
                return mkdVar;
            case 4:
                v8e v8eVar = (v8e) this.d;
                if (v8eVar == null) {
                    b9e b9eVar = (b9e) this;
                    v8e v8eVar2 = new v8e(1, b9eVar.h, b9eVar.f);
                    this.d = v8eVar2;
                    return v8eVar2;
                }
                return v8eVar;
            case 5:
                ujf ujfVar = (ujf) this.d;
                if (ujfVar == null) {
                    ujf ujfVar2 = new ujf(1, ((bkf) this).e);
                    this.d = ujfVar2;
                    return ujfVar2;
                }
                return ujfVar;
            default:
                u7d u7dVar = (u7d) this.d;
                if (u7dVar == null) {
                    u7d u7dVar2 = new u7d(1, ((e8d) this).e);
                    this.d = u7dVar2;
                    return u7dVar2;
                }
                return u7dVar;
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
