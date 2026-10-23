package e9;

import java.util.Arrays;
import java.util.Collection;
public abstract class g0 extends h0 {
    public Object[] f8452a;
    public int f8453b;
    public boolean f8454c;

    public g0(int i10) {
        s.f(i10, "initialCapacity");
        this.f8452a = new Object[i10];
        this.f8453b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f8452a;
        int i10 = this.f8453b;
        this.f8453b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof i0) {
                this.f8453b = ((i0) collection).m(this.f8453b, this.f8452a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i10) {
        Object[] objArr = this.f8452a;
        int b10 = h0.b(objArr.length, this.f8453b + i10);
        if (b10 <= objArr.length && !this.f8454c) {
            return;
        }
        this.f8452a = Arrays.copyOf(this.f8452a, b10);
        this.f8454c = false;
    }
}
