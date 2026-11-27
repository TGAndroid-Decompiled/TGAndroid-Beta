package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
public final class l1f extends fje implements RandomAccess {
    public static final l1f d;
    public Object[] b;
    public int c;

    static {
        l1f l1fVar = new l1f(0, new Object[0]);
        d = l1fVar;
        l1fVar.a = false;
    }

    public l1f(int i, Object[] objArr) {
        this.b = objArr;
        this.c = i;
    }

    @Override
    public final void add(int i, Object obj) {
        int i2;
        h();
        if (i >= 0 && i <= (i2 = this.c)) {
            Object[] objArr = this.b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[qu6.y(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.b, i, objArr2, i + 1, this.c - i);
                this.b = objArr2;
            }
            this.b[i] = obj;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        su3.g(j(i));
    }

    @Override
    public final Object get(int i) {
        i(i);
        return this.b[i];
    }

    public final void i(int i) {
        if (i >= 0 && i < this.c) {
            return;
        }
        su3.g(j(i));
    }

    public final String j(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override
    public final Object remove(int i) {
        int i2;
        h();
        i(i);
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i < this.c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override
    public final Object set(int i, Object obj) {
        h();
        i(i);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override
    public final int size() {
        return this.c;
    }

    @Override
    public final bue zza(int i) {
        if (i >= this.c) {
            return new l1f(this.c, Arrays.copyOf(this.b, i));
        }
        iy8.d();
        return null;
    }

    @Override
    public final boolean add(Object obj) {
        h();
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
            this.b = objArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
