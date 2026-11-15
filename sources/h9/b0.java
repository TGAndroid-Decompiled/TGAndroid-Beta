package h9;

import java.util.Arrays;
import java.util.Collection;
public abstract class b0 extends c0 {
    public Object[] f13655a;
    public int f13656b;
    public boolean f13657c;

    public b0(int i7) {
        o.g(i7, "initialCapacity");
        this.f13655a = new Object[i7];
        this.f13656b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f13655a;
        int i7 = this.f13656b;
        this.f13656b = i7 + 1;
        objArr[i7] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof d0) {
                this.f13656b = ((d0) collection).i(this.f13656b, this.f13655a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i7) {
        Object[] objArr = this.f13655a;
        int b10 = c0.b(objArr.length, this.f13656b + i7);
        if (b10 <= objArr.length && !this.f13657c) {
            return;
        }
        this.f13655a = Arrays.copyOf(this.f13655a, b10);
        this.f13657c = false;
    }
}
