package e9;

import java.util.Arrays;
import java.util.Collection;
public abstract class g0 extends h0 {
    public Object[] f8448a;
    public int f8449b;
    public boolean f8450c;

    public g0(int i10) {
        s.f(i10, "initialCapacity");
        this.f8448a = new Object[i10];
        this.f8449b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f8448a;
        int i10 = this.f8449b;
        this.f8449b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof i0) {
                this.f8449b = ((i0) collection).m(this.f8449b, this.f8448a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i10) {
        Object[] objArr = this.f8448a;
        int b10 = h0.b(objArr.length, this.f8449b + i10);
        if (b10 <= objArr.length && !this.f8450c) {
            return;
        }
        this.f8448a = Arrays.copyOf(this.f8448a, b10);
        this.f8450c = false;
    }
}
