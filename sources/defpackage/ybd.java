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
public abstract class ybd implements Map, Serializable, j$.util.Map {
    public final byte a;
    public transient AbstractCollection b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;

    public ybd(byte b) {
        this.a = b;
    }

    public static void b(java.util.Set r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybd.b(java.util.Set):void");
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
                ldd lddVar = (ldd) this.d;
                if (lddVar == null) {
                    odd oddVar = (odd) this;
                    ldd lddVar2 = new ldd(1, oddVar.h, oddVar.f);
                    this.d = lddVar2;
                    lddVar = lddVar2;
                }
                return lddVar.contains(obj);
            case 1:
                ajd ajdVar = (ajd) this.d;
                if (ajdVar == null) {
                    ajd ajdVar2 = new ajd(1, ((djd) this).e);
                    this.d = ajdVar2;
                    ajdVar = ajdVar2;
                }
                return ajdVar.contains(obj);
            case 2:
                rkd rkdVar = (rkd) this.d;
                if (rkdVar == null) {
                    rkd rkdVar2 = new rkd(1, ((xkd) this).e);
                    this.d = rkdVar2;
                    rkdVar = rkdVar2;
                }
                return rkdVar.contains(obj);
            case 3:
                bnd bndVar = (bnd) this.d;
                if (bndVar == null) {
                    hnd hndVar = (hnd) this;
                    bnd bndVar2 = new bnd(1, hndVar.h, hndVar.f);
                    this.d = bndVar2;
                    bndVar = bndVar2;
                }
                return bndVar.contains(obj);
            case 4:
                kbe kbeVar = (kbe) this.d;
                if (kbeVar == null) {
                    qbe qbeVar = (qbe) this;
                    kbe kbeVar2 = new kbe(1, qbeVar.h, qbeVar.f);
                    this.d = kbeVar2;
                    kbeVar = kbeVar2;
                }
                return kbeVar.contains(obj);
            case 5:
                jmf jmfVar = (jmf) this.d;
                if (jmfVar == null) {
                    jmf jmfVar2 = new jmf(1, ((qmf) this).e);
                    this.d = jmfVar2;
                    jmfVar = jmfVar2;
                }
                return jmfVar.contains(obj);
            default:
                lad ladVar = (lad) this.d;
                if (ladVar == null) {
                    lad ladVar2 = new lad(1, ((vad) this).e);
                    this.d = ladVar2;
                    ladVar = ladVar2;
                }
                return ladVar.contains(obj);
        }
    }

    @Override
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                edd eddVar = (edd) this.b;
                if (eddVar == null) {
                    odd oddVar = (odd) this;
                    edd eddVar2 = new edd(oddVar, oddVar.f, oddVar.h);
                    this.b = eddVar2;
                    return eddVar2;
                }
                return eddVar;
            case 1:
                tid tidVar = (tid) this.b;
                if (tidVar == null) {
                    djd djdVar = (djd) this;
                    tid tidVar2 = new tid(djdVar, djdVar.e);
                    this.b = tidVar2;
                    return tidVar2;
                }
                return tidVar;
            case 2:
                ikd ikdVar = (ikd) this.b;
                if (ikdVar == null) {
                    xkd xkdVar = (xkd) this;
                    ikd ikdVar2 = new ikd(xkdVar, xkdVar.e);
                    this.b = ikdVar2;
                    return ikdVar2;
                }
                return ikdVar;
            case 3:
                smd smdVar = (smd) this.b;
                if (smdVar == null) {
                    hnd hndVar = (hnd) this;
                    smd smdVar2 = new smd(hndVar, hndVar.f, hndVar.h);
                    this.b = smdVar2;
                    return smdVar2;
                }
                return smdVar;
            case 4:
                kae kaeVar = (kae) this.b;
                if (kaeVar == null) {
                    qbe qbeVar = (qbe) this;
                    kae kaeVar2 = new kae(qbeVar, qbeVar.f, qbeVar.h);
                    this.b = kaeVar2;
                    return kaeVar2;
                }
                return kaeVar;
            case 5:
                llf llfVar = (llf) this.b;
                if (llfVar == null) {
                    qmf qmfVar = (qmf) this;
                    llf llfVar2 = new llf(qmfVar, qmfVar.e);
                    this.b = llfVar2;
                    return llfVar2;
                }
                return llfVar;
            default:
                v9d v9dVar = (v9d) this.b;
                if (v9dVar == null) {
                    vad vadVar = (vad) this;
                    v9d v9dVar2 = new v9d(vadVar, vadVar.e);
                    this.b = v9dVar2;
                    return v9dVar2;
                }
                return v9dVar;
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
                edd eddVar = (edd) this.b;
                if (eddVar == null) {
                    odd oddVar = (odd) this;
                    edd eddVar2 = new edd(oddVar, oddVar.f, oddVar.h);
                    this.b = eddVar2;
                    eddVar = eddVar2;
                }
                int i8 = 0;
                for (Object obj : eddVar) {
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    i8 += i;
                }
                return i8;
            case 1:
                tid tidVar = (tid) this.b;
                if (tidVar == null) {
                    djd djdVar = (djd) this;
                    tid tidVar2 = new tid(djdVar, djdVar.e);
                    this.b = tidVar2;
                    tidVar = tidVar2;
                }
                int i9 = 0;
                for (Object obj2 : tidVar) {
                    if (obj2 != null) {
                        i2 = obj2.hashCode();
                    } else {
                        i2 = 0;
                    }
                    i9 += i2;
                }
                return i9;
            case 2:
                ikd ikdVar = (ikd) this.b;
                if (ikdVar == null) {
                    xkd xkdVar = (xkd) this;
                    ikd ikdVar2 = new ikd(xkdVar, xkdVar.e);
                    this.b = ikdVar2;
                    ikdVar = ikdVar2;
                }
                int i10 = 0;
                for (Object obj3 : ikdVar) {
                    if (obj3 != null) {
                        i3 = obj3.hashCode();
                    } else {
                        i3 = 0;
                    }
                    i10 += i3;
                }
                return i10;
            case 3:
                smd smdVar = (smd) this.b;
                if (smdVar == null) {
                    hnd hndVar = (hnd) this;
                    smd smdVar2 = new smd(hndVar, hndVar.f, hndVar.h);
                    this.b = smdVar2;
                    smdVar = smdVar2;
                }
                int i11 = 0;
                for (Object obj4 : smdVar) {
                    if (obj4 != null) {
                        i4 = obj4.hashCode();
                    } else {
                        i4 = 0;
                    }
                    i11 += i4;
                }
                return i11;
            case 4:
                kae kaeVar = (kae) this.b;
                if (kaeVar == null) {
                    qbe qbeVar = (qbe) this;
                    kae kaeVar2 = new kae(qbeVar, qbeVar.f, qbeVar.h);
                    this.b = kaeVar2;
                    kaeVar = kaeVar2;
                }
                int i12 = 0;
                for (Object obj5 : kaeVar) {
                    if (obj5 != null) {
                        i5 = obj5.hashCode();
                    } else {
                        i5 = 0;
                    }
                    i12 += i5;
                }
                return i12;
            case 5:
                llf llfVar = (llf) this.b;
                if (llfVar == null) {
                    qmf qmfVar = (qmf) this;
                    llf llfVar2 = new llf(qmfVar, qmfVar.e);
                    this.b = llfVar2;
                    llfVar = llfVar2;
                }
                int i13 = 0;
                for (Object obj6 : llfVar) {
                    if (obj6 != null) {
                        i6 = obj6.hashCode();
                    } else {
                        i6 = 0;
                    }
                    i13 += i6;
                }
                return i13;
            default:
                v9d v9dVar = (v9d) this.b;
                if (v9dVar == null) {
                    vad vadVar = (vad) this;
                    v9d v9dVar2 = new v9d(vadVar, vadVar.e);
                    this.b = v9dVar2;
                    v9dVar = v9dVar2;
                }
                int i14 = 0;
                for (Object obj7 : v9dVar) {
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
                if (((odd) this).size() == 0) {
                    return true;
                }
                return false;
            case 1:
            case 2:
            case 5:
            default:
                return false;
            case 3:
                if (((hnd) this).size() == 0) {
                    return true;
                }
                return false;
            case 4:
                if (((qbe) this).size() == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Set keySet() {
        switch (this.a) {
            case 0:
                gdd gddVar = (gdd) this.c;
                if (gddVar == null) {
                    odd oddVar = (odd) this;
                    gdd gddVar2 = new gdd(oddVar, new ldd(0, oddVar.h, oddVar.f));
                    this.c = gddVar2;
                    return gddVar2;
                }
                return gddVar;
            case 1:
                xid xidVar = (xid) this.c;
                if (xidVar == null) {
                    djd djdVar = (djd) this;
                    xid xidVar2 = new xid(djdVar, new ajd(0, djdVar.e));
                    this.c = xidVar2;
                    return xidVar2;
                }
                return xidVar;
            case 2:
                nkd nkdVar = (nkd) this.c;
                if (nkdVar == null) {
                    xkd xkdVar = (xkd) this;
                    nkd nkdVar2 = new nkd(xkdVar, new rkd(0, xkdVar.e));
                    this.c = nkdVar2;
                    return nkdVar2;
                }
                return nkdVar;
            case 3:
                ymd ymdVar = (ymd) this.c;
                if (ymdVar == null) {
                    hnd hndVar = (hnd) this;
                    ymd ymdVar2 = new ymd(hndVar, new bnd(0, hndVar.h, hndVar.f));
                    this.c = ymdVar2;
                    return ymdVar2;
                }
                return ymdVar;
            case 4:
                ebe ebeVar = (ebe) this.c;
                if (ebeVar == null) {
                    qbe qbeVar = (qbe) this;
                    ebe ebeVar2 = new ebe(qbeVar, new kbe(0, qbeVar.h, qbeVar.f));
                    this.c = ebeVar2;
                    return ebeVar2;
                }
                return ebeVar;
            case 5:
                amf amfVar = (amf) this.c;
                if (amfVar == null) {
                    qmf qmfVar = (qmf) this;
                    amf amfVar2 = new amf(qmfVar, new jmf(0, qmfVar.e));
                    this.c = amfVar2;
                    return amfVar2;
                }
                return amfVar;
            default:
                jad jadVar = (jad) this.c;
                if (jadVar == null) {
                    vad vadVar = (vad) this;
                    jad jadVar2 = new jad(vadVar, new lad(0, vadVar.e));
                    this.c = jadVar2;
                    return jadVar2;
                }
                return jadVar;
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
                int i = ((odd) this).h;
                if (i >= 0) {
                    StringBuilder sb = new StringBuilder((int) Math.min(i << 3, 1073741824L));
                    sb.append('{');
                    Iterator it = ((edd) entrySet()).iterator();
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
                lq5.j(uh9.k(i, "size cannot be negative but was: "));
                return null;
            case 1:
                StringBuilder sb2 = new StringBuilder((int) 8);
                sb2.append('{');
                Iterator it2 = ((tid) entrySet()).iterator();
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
                Iterator it3 = ((ikd) entrySet()).iterator();
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
                int i2 = ((hnd) this).h;
                if (i2 >= 0) {
                    StringBuilder sb4 = new StringBuilder((int) Math.min(i2 << 3, 1073741824L));
                    sb4.append('{');
                    Iterator it4 = ((smd) entrySet()).iterator();
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
                lq5.j(uh9.k(i2, "size cannot be negative but was: "));
                return null;
            case 4:
                int i3 = ((qbe) this).h;
                if (i3 >= 0) {
                    StringBuilder sb5 = new StringBuilder((int) Math.min(i3 << 3, 1073741824L));
                    sb5.append('{');
                    Iterator it5 = ((kae) entrySet()).iterator();
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
                lq5.j(uh9.k(i3, "size cannot be negative but was: "));
                return null;
            case 5:
                StringBuilder sb6 = new StringBuilder((int) 8);
                sb6.append('{');
                Iterator it6 = ((llf) entrySet()).iterator();
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
                Iterator it7 = ((v9d) entrySet()).iterator();
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
                ldd lddVar = (ldd) this.d;
                if (lddVar == null) {
                    odd oddVar = (odd) this;
                    ldd lddVar2 = new ldd(1, oddVar.h, oddVar.f);
                    this.d = lddVar2;
                    return lddVar2;
                }
                return lddVar;
            case 1:
                ajd ajdVar = (ajd) this.d;
                if (ajdVar == null) {
                    ajd ajdVar2 = new ajd(1, ((djd) this).e);
                    this.d = ajdVar2;
                    return ajdVar2;
                }
                return ajdVar;
            case 2:
                rkd rkdVar = (rkd) this.d;
                if (rkdVar == null) {
                    rkd rkdVar2 = new rkd(1, ((xkd) this).e);
                    this.d = rkdVar2;
                    return rkdVar2;
                }
                return rkdVar;
            case 3:
                bnd bndVar = (bnd) this.d;
                if (bndVar == null) {
                    hnd hndVar = (hnd) this;
                    bnd bndVar2 = new bnd(1, hndVar.h, hndVar.f);
                    this.d = bndVar2;
                    return bndVar2;
                }
                return bndVar;
            case 4:
                kbe kbeVar = (kbe) this.d;
                if (kbeVar == null) {
                    qbe qbeVar = (qbe) this;
                    kbe kbeVar2 = new kbe(1, qbeVar.h, qbeVar.f);
                    this.d = kbeVar2;
                    return kbeVar2;
                }
                return kbeVar;
            case 5:
                jmf jmfVar = (jmf) this.d;
                if (jmfVar == null) {
                    jmf jmfVar2 = new jmf(1, ((qmf) this).e);
                    this.d = jmfVar2;
                    return jmfVar2;
                }
                return jmfVar;
            default:
                lad ladVar = (lad) this.d;
                if (ladVar == null) {
                    lad ladVar2 = new lad(1, ((vad) this).e);
                    this.d = ladVar2;
                    return ladVar2;
                }
                return ladVar;
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
