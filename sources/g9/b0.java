package g9;

import java.util.Arrays;
import java.util.Collection;
public abstract class b0 extends c0 {
    public Object[] f12052a;
    public int f12053b;
    public boolean f12054c;

    public b0(int i3) {
        o.g(i3, "initialCapacity");
        this.f12052a = new Object[i3];
        this.f12053b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f12052a;
        int i3 = this.f12053b;
        this.f12053b = i3 + 1;
        objArr[i3] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof d0) {
                this.f12053b = ((d0) collection).i(this.f12053b, this.f12052a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i3) {
        Object[] objArr = this.f12052a;
        int b10 = c0.b(objArr.length, this.f12053b + i3);
        if (b10 <= objArr.length && !this.f12054c) {
            return;
        }
        this.f12052a = Arrays.copyOf(this.f12052a, b10);
        this.f12054c = false;
    }
}
