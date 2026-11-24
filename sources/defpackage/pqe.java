package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
public final class pqe extends oee implements ere, RandomAccess {
    public final ArrayList b;

    static {
        new pqe(10).a = false;
    }

    public pqe(int i) {
        this(new ArrayList(i));
    }

    @Override
    public final void add(int i, Object obj) {
        h();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(int i, Collection collection) {
        h();
        if (collection instanceof ere) {
            collection = ((ere) collection).zzd();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override
    public final void clear() {
        h();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object d(int i) {
        return this.b.get(i);
    }

    @Override
    public final void e(sie sieVar) {
        h();
        this.b.add(sieVar);
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof sie) {
            sie sieVar = (sie) obj;
            Charset charset = foe.a;
            if (sieVar.i() == 0) {
                str = "";
            } else {
                str = new String(sieVar.b, sieVar.m(), sieVar.i(), charset);
            }
            int m = sieVar.m();
            byte[] bArr = sieVar.b;
            if (q0f.a.c(m, sieVar.i() + m, bArr)) {
                arrayList.set(i, str);
            }
            return str;
        }
        byte[] bArr2 = (byte[]) obj;
        String str2 = new String(bArr2, foe.a);
        if (q0f.a.c(0, bArr2.length, bArr2)) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override
    public final Object remove(int i) {
        h();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof sie) {
            sie sieVar = (sie) remove;
            Charset charset = foe.a;
            if (sieVar.i() == 0) {
                return "";
            }
            return new String(sieVar.b, sieVar.m(), sieVar.i(), charset);
        }
        return new String((byte[]) remove, foe.a);
    }

    @Override
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof sie) {
            sie sieVar = (sie) obj2;
            Charset charset = foe.a;
            if (sieVar.i() == 0) {
                return "";
            }
            return new String(sieVar.b, sieVar.m(), sieVar.i(), charset);
        }
        return new String((byte[]) obj2, foe.a);
    }

    @Override
    public final int size() {
        return this.b.size();
    }

    @Override
    public final kpe zza(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i);
            arrayList2.addAll(arrayList);
            return new pqe(arrayList2);
        }
        sc8.e();
        return null;
    }

    @Override
    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override
    public final ere zze() {
        if (this.a) {
            return new uze(this);
        }
        return this;
    }

    public pqe(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
