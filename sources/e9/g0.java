package e9;

import java.util.Arrays;
import java.util.Collection;
public abstract class g0 extends h0 {
    public Object[] f8563a;
    public int f8564b;
    public boolean f8565c;

    public g0(int i10) {
        s.f(i10, "initialCapacity");
        this.f8563a = new Object[i10];
        this.f8564b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f8563a;
        int i10 = this.f8564b;
        this.f8564b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof i0) {
                this.f8564b = ((i0) collection).m(this.f8564b, this.f8563a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i10) {
        Object[] objArr = this.f8563a;
        int b10 = h0.b(objArr.length, this.f8564b + i10);
        if (b10 <= objArr.length && !this.f8565c) {
            return;
        }
        this.f8563a = Arrays.copyOf(this.f8563a, b10);
        this.f8565c = false;
    }
}
