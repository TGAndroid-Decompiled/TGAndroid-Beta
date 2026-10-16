package e9;

import java.util.Arrays;
import java.util.Collection;
public abstract class g0 extends h0 {
    public Object[] f8566a;
    public int f8567b;
    public boolean f8568c;

    public g0(int i10) {
        s.f(i10, "initialCapacity");
        this.f8566a = new Object[i10];
        this.f8567b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f8566a;
        int i10 = this.f8567b;
        this.f8567b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof i0) {
                this.f8567b = ((i0) collection).m(this.f8567b, this.f8566a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i10) {
        Object[] objArr = this.f8566a;
        int b10 = h0.b(objArr.length, this.f8567b + i10);
        if (b10 <= objArr.length && !this.f8568c) {
            return;
        }
        this.f8566a = Arrays.copyOf(this.f8566a, b10);
        this.f8568c = false;
    }
}
