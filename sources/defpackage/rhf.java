package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
public final class rhf extends mff implements RandomAccess, thf {
    public final List b;

    static {
        new rhf();
    }

    public rhf(int i) {
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
        if (collection instanceof thf) {
            collection = ((thf) collection).zzh();
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
        if (obj instanceof yff) {
            yff yffVar = (yff) obj;
            Charset charset = fhf.a;
            if (yffVar.j() == 0) {
                str = "";
            } else {
                str = new String(yffVar.b, 0, yffVar.j(), charset);
            }
            int j = yffVar.j();
            byte[] bArr = yffVar.b;
            jjf.a.getClass();
            if (ndd.b(j, bArr)) {
                list.set(i, str);
            }
            return str;
        }
        byte[] bArr2 = (byte[]) obj;
        String str2 = new String(bArr2, fhf.a);
        ndd nddVar = jjf.a;
        int length = bArr2.length;
        nddVar.getClass();
        if (ndd.b(length, bArr2)) {
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
        if (remove instanceof yff) {
            yff yffVar = (yff) remove;
            Charset charset = fhf.a;
            if (yffVar.j() == 0) {
                return "";
            }
            return new String(yffVar.b, 0, yffVar.j(), charset);
        }
        return new String((byte[]) remove, fhf.a);
    }

    @Override
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof yff) {
            yff yffVar = (yff) obj2;
            Charset charset = fhf.a;
            if (yffVar.j() == 0) {
                return "";
            }
            return new String(yffVar.b, 0, yffVar.j(), charset);
        }
        return new String((byte[]) obj2, fhf.a);
    }

    @Override
    public final int size() {
        return this.b.size();
    }

    @Override
    public final thf zzd() {
        if (this.a) {
            return new fjf(this);
        }
        return this;
    }

    @Override
    public final ehf zzg(int i) {
        List list = this.b;
        if (i >= list.size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(list);
            return new rhf(arrayList);
        }
        i98.g();
        return null;
    }

    @Override
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public rhf(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public rhf() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
