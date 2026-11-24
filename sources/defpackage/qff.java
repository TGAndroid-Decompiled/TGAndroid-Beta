package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
public final class qff extends ldf implements RandomAccess, sff {
    public final List b;

    static {
        new qff();
    }

    public qff(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.b = arrayList;
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
        if (collection instanceof sff) {
            collection = ((sff) collection).zzh();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override
    public final Object b(int i) {
        return this.b.get(i);
    }

    @Override
    public final void clear() {
        h();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override
    public final String get(int i) {
        String str;
        List list = this.b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof xdf) {
            xdf xdfVar = (xdf) obj;
            Charset charset = eff.a;
            if (xdfVar.j() == 0) {
                str = "";
            } else {
                str = new String(xdfVar.b, 0, xdfVar.j(), charset);
            }
            int j = xdfVar.j();
            byte[] bArr = xdfVar.b;
            ihf.a.getClass();
            if (lbd.b(j, bArr)) {
                list.set(i, str);
            }
            return str;
        }
        byte[] bArr2 = (byte[]) obj;
        String str2 = new String(bArr2, eff.a);
        lbd lbdVar = ihf.a;
        int length = bArr2.length;
        lbdVar.getClass();
        if (lbd.b(length, bArr2)) {
            list.set(i, str2);
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
        if (remove instanceof xdf) {
            xdf xdfVar = (xdf) remove;
            Charset charset = eff.a;
            if (xdfVar.j() == 0) {
                return "";
            }
            return new String(xdfVar.b, 0, xdfVar.j(), charset);
        }
        return new String((byte[]) remove, eff.a);
    }

    @Override
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof xdf) {
            xdf xdfVar = (xdf) obj2;
            Charset charset = eff.a;
            if (xdfVar.j() == 0) {
                return "";
            }
            return new String(xdfVar.b, 0, xdfVar.j(), charset);
        }
        return new String((byte[]) obj2, eff.a);
    }

    @Override
    public final int size() {
        return this.b.size();
    }

    @Override
    public final sff zzd() {
        if (this.a) {
            return new ehf(this);
        }
        return this;
    }

    @Override
    public final dff zzg(int i) {
        List list = this.b;
        if (i >= list.size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(list);
            return new qff(arrayList);
        }
        sc8.e();
        return null;
    }

    @Override
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public qff(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public qff() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
