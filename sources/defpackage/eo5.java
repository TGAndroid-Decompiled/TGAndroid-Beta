package defpackage;

import java.util.Arrays;
import java.util.Collection;
public abstract class eo5 extends fo5 {
    public Object[] a;
    public int b;
    public boolean c;

    public eo5(int i) {
        ntd.b(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof go5) {
                this.b = ((go5) collection).i(this.b, this.a);
                return;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
    }

    public final void e(int i) {
        Object[] objArr = this.a;
        int b = fo5.b(objArr.length, this.b + i);
        if (b <= objArr.length && !this.c) {
            return;
        }
        this.a = Arrays.copyOf(this.a, b);
        this.c = false;
    }
}
