package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
public final class sse extends pge implements hte, RandomAccess {
    public final ArrayList b;

    static {
        new sse(10).a = false;
    }

    public sse(int i) {
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
        if (collection instanceof hte) {
            collection = ((hte) collection).zzd();
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
    public final void e(tke tkeVar) {
        h();
        this.b.add(tkeVar);
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
        if (obj instanceof tke) {
            tke tkeVar = (tke) obj;
            Charset charset = iqe.a;
            if (tkeVar.i() == 0) {
                str = "";
            } else {
                str = new String(tkeVar.b, tkeVar.m(), tkeVar.i(), charset);
            }
            int m = tkeVar.m();
            byte[] bArr = tkeVar.b;
            if (s2f.a.c(m, tkeVar.i() + m, bArr)) {
                arrayList.set(i, str);
            }
            return str;
        }
        byte[] bArr2 = (byte[]) obj;
        String str2 = new String(bArr2, iqe.a);
        if (s2f.a.c(0, bArr2.length, bArr2)) {
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
        if (remove instanceof tke) {
            tke tkeVar = (tke) remove;
            Charset charset = iqe.a;
            if (tkeVar.i() == 0) {
                return "";
            }
            return new String(tkeVar.b, tkeVar.m(), tkeVar.i(), charset);
        }
        return new String((byte[]) remove, iqe.a);
    }

    @Override
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof tke) {
            tke tkeVar = (tke) obj2;
            Charset charset = iqe.a;
            if (tkeVar.i() == 0) {
                return "";
            }
            return new String(tkeVar.b, tkeVar.m(), tkeVar.i(), charset);
        }
        return new String((byte[]) obj2, iqe.a);
    }

    @Override
    public final int size() {
        return this.b.size();
    }

    @Override
    public final nre zza(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i);
            arrayList2.addAll(arrayList);
            return new sse(arrayList2);
        }
        i98.g();
        return null;
    }

    @Override
    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override
    public final hte zze() {
        if (this.a) {
            return new w1f(this);
        }
        return this;
    }

    public sse(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
