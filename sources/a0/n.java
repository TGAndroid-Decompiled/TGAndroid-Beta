package a0;

import java.util.Arrays;
public final class n implements Cloneable {
    public int[] f34a;
    public Object[] f35b;
    public int f36c;

    public n() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f34a = new int[i13];
        this.f35b = new Object[i13];
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f36c;
        if (i11 != 0 && i10 <= this.f34a[i11 - 1]) {
            d(i10, obj);
            return;
        }
        if (i11 >= this.f34a.length) {
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
            int[] copyOf = Arrays.copyOf(this.f34a, i15);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.f34a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f35b, i15);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.f35b = copyOf2;
        }
        this.f34a[i11] = i10;
        this.f35b[i11] = obj;
        this.f36c = i11 + 1;
    }

    public final n clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.i.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        n nVar = (n) clone;
        nVar.f34a = (int[]) this.f34a.clone();
        nVar.f35b = (Object[]) this.f35b.clone();
        return nVar;
    }

    public final Object c(int i10) {
        Object obj;
        int a2 = b0.a.a(this.f36c, i10, this.f34a);
        if (a2 >= 0 && (obj = this.f35b[a2]) != j.f23b) {
            return obj;
        }
        return null;
    }

    public final void d(int i10, Object obj) {
        int a2 = b0.a.a(this.f36c, i10, this.f34a);
        if (a2 >= 0) {
            this.f35b[a2] = obj;
            return;
        }
        int i11 = ~a2;
        int i12 = this.f36c;
        if (i11 < i12) {
            Object[] objArr = this.f35b;
            if (objArr[i11] == j.f23b) {
                this.f34a[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.f34a.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] copyOf = Arrays.copyOf(this.f34a, i16);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.f34a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f35b, i16);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.f35b = copyOf2;
        }
        int i17 = this.f36c;
        if (i17 - i11 != 0) {
            int[] iArr = this.f34a;
            int i18 = i11 + 1;
            id.f.b(i18, i11, i17, iArr, iArr);
            Object[] objArr2 = this.f35b;
            id.f.c(i18, i11, this.f36c, objArr2, objArr2);
        }
        this.f34a[i11] = i10;
        this.f35b[i11] = obj;
        this.f36c++;
    }

    public final String toString() {
        int i10 = this.f36c;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append('{');
        int i11 = this.f36c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f34a[i12]);
            sb2.append('=');
            Object obj = this.f35b[i12];
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
