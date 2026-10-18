package e9;

import java.util.Arrays;
import java.util.Collection;
public abstract class g0 extends h0 {
    public Object[] f8446a;
    public int f8447b;
    public boolean f8448c;

    public g0(int i10) {
        s.f(i10, "initialCapacity");
        this.f8446a = new Object[i10];
        this.f8447b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f8446a;
        int i10 = this.f8447b;
        this.f8447b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof i0) {
                this.f8447b = ((i0) collection).m(this.f8447b, this.f8446a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i10) {
        Object[] objArr = this.f8446a;
        int b10 = h0.b(objArr.length, this.f8447b + i10);
        if (b10 <= objArr.length && !this.f8448c) {
            return;
        }
        this.f8446a = Arrays.copyOf(this.f8446a, b10);
        this.f8448c = false;
    }
}
