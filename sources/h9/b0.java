package h9;

import java.util.Arrays;
import java.util.Collection;
public abstract class b0 extends c0 {
    public Object[] f13974a;
    public int f13975b;
    public boolean f13976c;

    public b0(int i7) {
        o.g(i7, "initialCapacity");
        this.f13974a = new Object[i7];
        this.f13975b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f13974a;
        int i7 = this.f13975b;
        this.f13975b = i7 + 1;
        objArr[i7] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof d0) {
                this.f13975b = ((d0) collection).i(this.f13975b, this.f13974a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i7) {
        Object[] objArr = this.f13974a;
        int b10 = c0.b(objArr.length, this.f13975b + i7);
        if (b10 <= objArr.length && !this.f13976c) {
            return;
        }
        this.f13974a = Arrays.copyOf(this.f13974a, b10);
        this.f13976c = false;
    }
}
