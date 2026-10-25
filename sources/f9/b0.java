package f9;

import java.util.Arrays;
import java.util.Collection;
public abstract class b0 extends c0 {
    public Object[] f10258a;
    public int f10259b;
    public boolean f10260c;

    public b0(int i10) {
        o.f(i10, "initialCapacity");
        this.f10258a = new Object[i10];
        this.f10259b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f10258a;
        int i10 = this.f10259b;
        this.f10259b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof d0) {
                this.f10259b = ((d0) collection).m(this.f10259b, this.f10258a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i10) {
        Object[] objArr = this.f10258a;
        int b10 = c0.b(objArr.length, this.f10259b + i10);
        if (b10 <= objArr.length && !this.f10260c) {
            return;
        }
        this.f10258a = Arrays.copyOf(this.f10258a, b10);
        this.f10260c = false;
    }
}
