package o8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
public final class w {
    public Object[] f19097a;
    public int f19098b;
    public boolean f19099c;

    public w() {
        l.a(4, "initialCapacity");
        this.f19097a = new Object[4];
        this.f19098b = 0;
    }

    public static int d(int i9, int i10) {
        if (i10 >= 0) {
            int i11 = i9 + (i9 >> 1) + 1;
            if (i11 < i10) {
                i11 = Integer.highestOneBit(i10 - 1) << 1;
            }
            if (i11 < 0) {
                return Integer.MAX_VALUE;
            }
            return i11;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public final void a(Object obj) {
        obj.getClass();
        e(this.f19098b + 1);
        Object[] objArr = this.f19097a;
        int i9 = this.f19098b;
        this.f19098b = i9 + 1;
        objArr[i9] = obj;
    }

    public final void b(List list) {
        if (list instanceof Collection) {
            List list2 = list;
            e(list2.size() + this.f19098b);
            if (list2 instanceof u) {
                this.f19098b = ((u) list2).n(this.f19098b, this.f19097a);
                return;
            }
        }
        for (Object obj : list) {
            a(obj);
        }
    }

    public final l0 c() {
        this.f19099c = true;
        return z.s(this.f19098b, this.f19097a);
    }

    public final void e(int i9) {
        Object[] objArr = this.f19097a;
        if (objArr.length < i9) {
            this.f19097a = Arrays.copyOf(objArr, d(objArr.length, i9));
            this.f19099c = false;
        } else if (this.f19099c) {
            this.f19097a = (Object[]) objArr.clone();
            this.f19099c = false;
        }
    }
}
