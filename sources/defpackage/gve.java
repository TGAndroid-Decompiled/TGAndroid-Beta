package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
public final class gve extends fje implements vve, RandomAccess {
    public final ArrayList b;

    static {
        new gve(10).a = false;
    }

    public gve(int i) {
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
        if (collection instanceof vve) {
            collection = ((vve) collection).zzd();
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
    public final void e(jne jneVar) {
        h();
        this.b.add(jneVar);
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
        if (obj instanceof jne) {
            jne jneVar = (jne) obj;
            Charset charset = xse.a;
            if (jneVar.i() == 0) {
                str = "";
            } else {
                str = new String(jneVar.b, jneVar.m(), jneVar.i(), charset);
            }
            int m = jneVar.m();
            byte[] bArr = jneVar.b;
            if (h5f.a.c(m, jneVar.i() + m, bArr)) {
                arrayList.set(i, str);
            }
            return str;
        }
        byte[] bArr2 = (byte[]) obj;
        String str2 = new String(bArr2, xse.a);
        if (h5f.a.c(0, bArr2.length, bArr2)) {
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
        if (remove instanceof jne) {
            jne jneVar = (jne) remove;
            Charset charset = xse.a;
            if (jneVar.i() == 0) {
                return "";
            }
            return new String(jneVar.b, jneVar.m(), jneVar.i(), charset);
        }
        return new String((byte[]) remove, xse.a);
    }

    @Override
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof jne) {
            jne jneVar = (jne) obj2;
            Charset charset = xse.a;
            if (jneVar.i() == 0) {
                return "";
            }
            return new String(jneVar.b, jneVar.m(), jneVar.i(), charset);
        }
        return new String((byte[]) obj2, xse.a);
    }

    @Override
    public final int size() {
        return this.b.size();
    }

    @Override
    public final bue zza(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i);
            arrayList2.addAll(arrayList);
            return new gve(arrayList2);
        }
        iy8.d();
        return null;
    }

    @Override
    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override
    public final vve zze() {
        if (this.a) {
            return new l4f(this);
        }
        return this;
    }

    public gve(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
