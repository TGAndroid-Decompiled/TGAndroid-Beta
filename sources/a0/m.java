package a0;

import java.util.Arrays;
public final class m implements Cloneable {
    public int[] f32a;
    public Object[] f33b;
    public int f34c;

    public m() {
        int i3;
        int i10 = 4;
        while (true) {
            i3 = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i3 = i11;
                break;
            }
            i10++;
        }
        int i12 = i3 / 4;
        this.f32a = new int[i12];
        this.f33b = new Object[i12];
    }

    public final void a(int i3, Object obj) {
        int i10 = this.f34c;
        if (i10 != 0 && i3 <= this.f32a[i10 - 1]) {
            d(i3, obj);
            return;
        }
        if (i10 >= this.f32a.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] copyOf = Arrays.copyOf(this.f32a, i14);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f32a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f33b, i14);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f33b = copyOf2;
        }
        this.f32a[i10] = i3;
        this.f33b[i10] = obj;
        this.f34c = i10 + 1;
    }

    public final m clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.j.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        m mVar = (m) clone;
        mVar.f32a = (int[]) this.f32a.clone();
        mVar.f33b = (Object[]) this.f33b.clone();
        return mVar;
    }

    public final Object c(int i3) {
        Object obj;
        int a10 = b0.a.a(this.f34c, i3, this.f32a);
        if (a10 >= 0 && (obj = this.f33b[a10]) != i.f21b) {
            return obj;
        }
        return null;
    }

    public final void d(int i3, Object obj) {
        int a10 = b0.a.a(this.f34c, i3, this.f32a);
        if (a10 >= 0) {
            this.f33b[a10] = obj;
            return;
        }
        int i10 = ~a10;
        int i11 = this.f34c;
        if (i10 < i11) {
            Object[] objArr = this.f33b;
            if (objArr[i10] == i.f21b) {
                this.f32a[i10] = i3;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f32a.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] copyOf = Arrays.copyOf(this.f32a, i15);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f32a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f33b, i15);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f33b = copyOf2;
        }
        int i16 = this.f34c;
        if (i16 - i10 != 0) {
            int[] iArr = this.f32a;
            int i17 = i10 + 1;
            ed.f.b(i17, i10, i16, iArr, iArr);
            Object[] objArr2 = this.f33b;
            ed.f.c(i17, i10, this.f34c, objArr2, objArr2);
        }
        this.f32a[i10] = i3;
        this.f33b[i10] = obj;
        this.f34c++;
    }

    public final String toString() {
        int i3 = this.f34c;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i3 * 28);
        sb2.append('{');
        int i10 = this.f34c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f32a[i11]);
            sb2.append('=');
            Object obj = this.f33b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "buffer.toString()");
        return sb3;
    }
}
