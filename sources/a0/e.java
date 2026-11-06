package a0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
public final class e implements Collection {
    public final int f10a = 0;
    public final Object f11b;

    public e(Object[] values) {
        kotlin.jvm.internal.j.e(values, "values");
        this.f11b = values;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f10a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.f10a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final void clear() {
        switch (this.f10a) {
            case 0:
                ((f) this.f11b).clear();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f10a) {
            case 0:
                if (((f) this.f11b).b(obj) >= 0) {
                    return true;
                }
                return false;
            default:
                return hd.e.a((Object[]) this.f11b, obj);
        }
    }

    @Override
    public final boolean containsAll(Collection elements) {
        switch (this.f10a) {
            case 0:
                for (Object obj : elements) {
                    if (!contains(obj)) {
                        return false;
                    }
                }
                return true;
            default:
                kotlin.jvm.internal.j.e(elements, "elements");
                Collection<Object> collection = elements;
                if (collection.isEmpty()) {
                    return true;
                }
                for (Object obj2 : collection) {
                    if (!hd.e.a((Object[]) this.f11b, obj2)) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final boolean isEmpty() {
        switch (this.f10a) {
            case 0:
                return ((f) this.f11b).isEmpty();
            default:
                if (((Object[]) this.f11b).length == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f10a) {
            case 0:
                return new b((f) this.f11b, 1);
            default:
                Object[] array = (Object[]) this.f11b;
                kotlin.jvm.internal.j.e(array, "array");
                return new cd.b(array);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f10a) {
            case 0:
                f fVar = (f) this.f11b;
                int b10 = fVar.b(obj);
                if (b10 >= 0) {
                    fVar.g(b10);
                    return true;
                }
                return false;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.f10a) {
            case 0:
                f fVar = (f) this.f11b;
                int i7 = fVar.f31c;
                int i10 = 0;
                boolean z9 = false;
                while (i10 < i7) {
                    if (collection.contains(fVar.i(i10))) {
                        fVar.g(i10);
                        i10--;
                        i7--;
                        z9 = true;
                    }
                    i10++;
                }
                return z9;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.f10a) {
            case 0:
                f fVar = (f) this.f11b;
                int i7 = fVar.f31c;
                int i10 = 0;
                boolean z9 = false;
                while (i10 < i7) {
                    if (!collection.contains(fVar.i(i10))) {
                        fVar.g(i10);
                        i10--;
                        i7--;
                        z9 = true;
                    }
                    i10++;
                }
                return z9;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final int size() {
        switch (this.f10a) {
            case 0:
                return ((f) this.f11b).f31c;
            default:
                return ((Object[]) this.f11b).length;
        }
    }

    @Override
    public final Object[] toArray(Object[] array) {
        switch (this.f10a) {
            case 0:
                f fVar = (f) this.f11b;
                int i7 = fVar.f31c;
                if (array.length < i7) {
                    array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i7);
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    array[i10] = fVar.i(i10);
                }
                if (array.length > i7) {
                    array[i7] = null;
                }
                return array;
            default:
                kotlin.jvm.internal.j.e(array, "array");
                return kotlin.jvm.internal.j.j(this, array);
        }
    }

    public e(f fVar) {
        this.f11b = fVar;
    }

    @Override
    public final Object[] toArray() {
        switch (this.f10a) {
            case 0:
                f fVar = (f) this.f11b;
                int i7 = fVar.f31c;
                Object[] objArr = new Object[i7];
                for (int i10 = 0; i10 < i7; i10++) {
                    objArr[i10] = fVar.i(i10);
                }
                return objArr;
            default:
                Object[] objArr2 = (Object[]) this.f11b;
                kotlin.jvm.internal.j.e(objArr2, "<this>");
                Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length, Object[].class);
                kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
                return copyOf;
        }
    }
}
