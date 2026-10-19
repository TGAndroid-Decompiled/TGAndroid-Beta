package e9;

import java.util.Arrays;
import java.util.Collection;
public abstract class g0 extends h0 {
    public Object[] f8447a;
    public int f8448b;
    public boolean f8449c;

    public g0(int i10) {
        s.f(i10, "initialCapacity");
        this.f8447a = new Object[i10];
        this.f8448b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f8447a;
        int i10 = this.f8448b;
        this.f8448b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof i0) {
                this.f8448b = ((i0) collection).m(this.f8448b, this.f8447a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i10) {
        Object[] objArr = this.f8447a;
        int b10 = h0.b(objArr.length, this.f8448b + i10);
        if (b10 <= objArr.length && !this.f8449c) {
            return;
        }
        this.f8447a = Arrays.copyOf(this.f8447a, b10);
        this.f8449c = false;
    }
}
