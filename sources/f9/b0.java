package f9;

import java.util.Arrays;
import java.util.Collection;
public abstract class b0 extends c0 {
    public Object[] f10257a;
    public int f10258b;
    public boolean f10259c;

    public b0(int i10) {
        o.f(i10, "initialCapacity");
        this.f10257a = new Object[i10];
        this.f10258b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f10257a;
        int i10 = this.f10258b;
        this.f10258b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof d0) {
                this.f10258b = ((d0) collection).m(this.f10258b, this.f10257a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i10) {
        Object[] objArr = this.f10257a;
        int b10 = c0.b(objArr.length, this.f10258b + i10);
        if (b10 <= objArr.length && !this.f10259c) {
            return;
        }
        this.f10257a = Arrays.copyOf(this.f10257a, b10);
        this.f10259c = false;
    }
}
