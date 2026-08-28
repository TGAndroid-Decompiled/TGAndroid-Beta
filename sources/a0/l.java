package a0;

import java.util.Arrays;
public final class l implements Cloneable {
    public int[] f29a;
    public Object[] f30b;
    public int f31c;

    public l() {
        int i9;
        int i10 = 4;
        while (true) {
            i9 = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i9 = i11;
                break;
            }
            i10++;
        }
        int i12 = i9 / 4;
        this.f29a = new int[i12];
        this.f30b = new Object[i12];
    }

    public final void a(int i9, Object obj) {
        int i10 = this.f31c;
        if (i10 != 0 && i9 <= this.f29a[i10 - 1]) {
            d(i9, obj);
            return;
        }
        if (i10 >= this.f29a.length) {
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
            int[] copyOf = Arrays.copyOf(this.f29a, i14);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.f29a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f30b, i14);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.f30b = copyOf2;
        }
        this.f29a[i10] = i9;
        this.f30b[i10] = obj;
        this.f31c = i10 + 1;
    }

    public final l clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.i.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        l lVar = (l) clone;
        lVar.f29a = (int[]) this.f29a.clone();
        lVar.f30b = (Object[]) this.f30b.clone();
        return lVar;
    }

    public final Object c(int i9) {
        Object obj;
        int a2 = b0.a.a(this.f31c, i9, this.f29a);
        if (a2 >= 0 && (obj = this.f30b[a2]) != i.f20b) {
            return obj;
        }
        return null;
    }

    public final void d(int i9, Object obj) {
        int a2 = b0.a.a(this.f31c, i9, this.f29a);
        if (a2 >= 0) {
            this.f30b[a2] = obj;
            return;
        }
        int i10 = ~a2;
        int i11 = this.f31c;
        if (i10 < i11) {
            Object[] objArr = this.f30b;
            if (objArr[i10] == i.f20b) {
                this.f29a[i10] = i9;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f29a.length) {
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
            int[] copyOf = Arrays.copyOf(this.f29a, i15);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.f29a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f30b, i15);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.f30b = copyOf2;
        }
        int i16 = this.f31c;
        if (i16 - i10 != 0) {
            int[] iArr = this.f29a;
            int i17 = i10 + 1;
            pc.f.b(i17, i10, i16, iArr, iArr);
            Object[] objArr2 = this.f30b;
            pc.f.c(i17, i10, this.f31c, objArr2, objArr2);
        }
        this.f29a[i10] = i9;
        this.f30b[i10] = obj;
        this.f31c++;
    }

    public final String toString() {
        int i9 = this.f31c;
        if (i9 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i9 * 28);
        sb2.append('{');
        int i10 = this.f31c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f29a[i11]);
            sb2.append('=');
            Object obj = this.f30b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.d(sb3, "buffer.toString()");
        return sb3;
    }
}
