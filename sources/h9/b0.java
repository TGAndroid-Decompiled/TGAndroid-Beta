package h9;

import java.util.Arrays;
import java.util.Collection;
public abstract class b0 extends c0 {
    public Object[] f14297a;
    public int f14298b;
    public boolean f14299c;

    public b0(int i7) {
        o.g(i7, "initialCapacity");
        this.f14297a = new Object[i7];
        this.f14298b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f14297a;
        int i7 = this.f14298b;
        this.f14298b = i7 + 1;
        objArr[i7] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof d0) {
                this.f14298b = ((d0) collection).i(this.f14298b, this.f14297a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i7) {
        Object[] objArr = this.f14297a;
        int b10 = c0.b(objArr.length, this.f14298b + i7);
        if (b10 <= objArr.length && !this.f14299c) {
            return;
        }
        this.f14297a = Arrays.copyOf(this.f14297a, b10);
        this.f14299c = false;
    }
}
