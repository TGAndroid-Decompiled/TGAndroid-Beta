package h9;

import java.util.Arrays;
import java.util.Collection;
public abstract class b0 extends c0 {
    public Object[] f13964a;
    public int f13965b;
    public boolean f13966c;

    public b0(int i7) {
        o.g(i7, "initialCapacity");
        this.f13964a = new Object[i7];
        this.f13965b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f13964a;
        int i7 = this.f13965b;
        this.f13965b = i7 + 1;
        objArr[i7] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof d0) {
                this.f13965b = ((d0) collection).i(this.f13965b, this.f13964a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i7) {
        Object[] objArr = this.f13964a;
        int b10 = c0.b(objArr.length, this.f13965b + i7);
        if (b10 <= objArr.length && !this.f13966c) {
            return;
        }
        this.f13964a = Arrays.copyOf(this.f13964a, b10);
        this.f13966c = false;
    }
}
