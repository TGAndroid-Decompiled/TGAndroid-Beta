package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
public final class aif extends mff implements RandomAccess, chf, qif {
    public static final aif d = new aif(new long[0], 0, false);
    public long[] b;
    public int c;

    public aif(long[] jArr, int i, boolean z) {
        super(z);
        this.b = jArr;
        this.c = i;
    }

    @Override
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        h();
        if (i >= 0 && i <= (i2 = this.c)) {
            int i3 = i + 1;
            long[] jArr = this.b;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i3, i2 - i);
            } else {
                long[] jArr2 = new long[kt6.z(i2, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.b, i, jArr2, i3, this.c - i);
                this.b = jArr2;
            }
            this.b[i] = longValue;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        wa3.i(b10.g(i, this.c, "Index:", ", Size:"));
    }

    @Override
    public final boolean addAll(Collection collection) {
        h();
        Charset charset = fhf.a;
        collection.getClass();
        if (!(collection instanceof aif)) {
            return super.addAll(collection);
        }
        aif aifVar = (aif) collection;
        int i = aifVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.b;
            if (i3 > jArr.length) {
                jArr = Arrays.copyOf(jArr, i3);
                this.b = jArr;
            }
            System.arraycopy(aifVar.b, 0, jArr, this.c, aifVar.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aif)) {
            return super.equals(obj);
        }
        aif aifVar = (aif) obj;
        if (this.c != aifVar.c) {
            return false;
        }
        long[] jArr = aifVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int i) {
        i(i);
        return Long.valueOf(this.b[i]);
    }

    @Override
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            long j = this.b[i2];
            Charset charset = fhf.a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    public final void i(int i) {
        if (i >= 0 && i < this.c) {
            return;
        }
        wa3.i(b10.g(i, this.c, "Index:", ", Size:"));
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override
    public final Object remove(int i) {
        int i2;
        h();
        i(i);
        long[] jArr = this.b;
        long j = jArr[i];
        if (i < this.c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override
    public final void removeRange(int i, int i2) {
        h();
        if (i2 >= i) {
            long[] jArr = this.b;
            System.arraycopy(jArr, i2, jArr, i, this.c - i2);
            this.c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        wa3.i("toIndex < fromIndex");
    }

    @Override
    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        h();
        i(i);
        long[] jArr = this.b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override
    public final int size() {
        return this.c;
    }

    @Override
    public final ehf zzg(int i) {
        if (i >= this.c) {
            return new aif(Arrays.copyOf(this.b, i), this.c, true);
        }
        i98.g();
        return null;
    }

    @Override
    public final boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        h();
        int i = this.c;
        long[] jArr = this.b;
        if (i == jArr.length) {
            long[] jArr2 = new long[kt6.z(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.b = jArr2;
            jArr = jArr2;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        jArr[i2] = longValue;
        return true;
    }
}
