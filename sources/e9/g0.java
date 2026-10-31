package e9;

import java.util.Arrays;
import java.util.Collection;
public abstract class g0 extends h0 {
    public Object[] f6361a;
    public int f6362b;
    public boolean f6363c;

    public g0(int i10) {
        s.f(i10, "initialCapacity");
        this.f6361a = new Object[i10];
        this.f6362b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f6361a;
        int i10 = this.f6362b;
        this.f6362b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof i0) {
                this.f6362b = ((i0) collection).m(this.f6362b, this.f6361a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i10) {
        Object[] objArr = this.f6361a;
        int b10 = h0.b(objArr.length, this.f6362b + i10);
        if (b10 <= objArr.length && !this.f6363c) {
            return;
        }
        this.f6361a = Arrays.copyOf(this.f6361a, b10);
        this.f6363c = false;
    }
}
