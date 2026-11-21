package h9;

import java.util.Arrays;
import java.util.Collection;
public abstract class b0 extends c0 {
    public Object[] f14000a;
    public int f14001b;
    public boolean f14002c;

    public b0(int i7) {
        o.g(i7, "initialCapacity");
        this.f14000a = new Object[i7];
        this.f14001b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f14000a;
        int i7 = this.f14001b;
        this.f14001b = i7 + 1;
        objArr[i7] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof d0) {
                this.f14001b = ((d0) collection).i(this.f14001b, this.f14000a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i7) {
        Object[] objArr = this.f14000a;
        int b10 = c0.b(objArr.length, this.f14001b + i7);
        if (b10 <= objArr.length && !this.f14002c) {
            return;
        }
        this.f14000a = Arrays.copyOf(this.f14000a, b10);
        this.f14002c = false;
    }
}
