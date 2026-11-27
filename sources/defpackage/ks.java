package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
public final class ks implements Collection {
    public final byte a = 1;
    public final Object b;

    public ks(Object[] objArr) {
        objArr.getClass();
        this.b = objArr;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((qs) this.b).clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ts.a((Object[]) obj2, obj);
            default:
                if (((qs) obj2).b(obj) >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                Collection<Object> collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                for (Object obj : collection2) {
                    if (!ts.a((Object[]) this.b, obj)) {
                        return false;
                    }
                }
                return true;
            default:
                for (Object obj2 : collection) {
                    if (!contains(obj2)) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final boolean isEmpty() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (((Object[]) obj).length == 0) {
                    return true;
                }
                return false;
            default:
                return ((qs) obj).isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                return new w2(objArr);
            default:
                return new ns((qs) obj, (byte) 1);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                qs qsVar = (qs) this.b;
                int b = qsVar.b(obj);
                if (b >= 0) {
                    qsVar.g(b);
                    return true;
                }
                return false;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                qs qsVar = (qs) this.b;
                int i = qsVar.c;
                int i2 = 0;
                boolean z = false;
                while (i2 < i) {
                    if (collection.contains(qsVar.i(i2))) {
                        qsVar.g(i2);
                        i2--;
                        i--;
                        z = true;
                    }
                    i2++;
                }
                return z;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                qs qsVar = (qs) this.b;
                int i = qsVar.c;
                int i2 = 0;
                boolean z = false;
                while (i2 < i) {
                    if (!collection.contains(qsVar.i(i2))) {
                        qsVar.g(i2);
                        i2--;
                        i--;
                        z = true;
                    }
                    i2++;
                }
                return z;
        }
    }

    @Override
    public final int size() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((Object[]) obj).length;
            default:
                return ((qs) obj).c;
        }
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                objArr.getClass();
                return l93.c(this, objArr);
            default:
                qs qsVar = (qs) this.b;
                int i = qsVar.c;
                if (objArr.length < i) {
                    objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
                }
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = qsVar.i(i2);
                }
                if (objArr.length > i) {
                    objArr[i] = null;
                }
                return objArr;
        }
    }

    public ks(qs qsVar) {
        this.b = qsVar;
    }

    @Override
    public final Object[] toArray() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
                copyOf.getClass();
                return copyOf;
            default:
                qs qsVar = (qs) obj;
                int i = qsVar.c;
                Object[] objArr2 = new Object[i];
                for (int i2 = 0; i2 < i; i2++) {
                    objArr2[i2] = qsVar.i(i2);
                }
                return objArr2;
        }
    }
}
