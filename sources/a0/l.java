package a0;

import java.util.Arrays;

public final class l implements Cloneable {

    public int[] f29a;

    public Object[] f30b;

    public int f31c;

    public l() {
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
        this.f29a = new int[i13];
        this.f30b = new Object[i13];
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f31c;
        if (i11 != 0 && i10 <= this.f29a[i11 - 1]) {
            d(i10, obj);
            return;
        }
        if (i11 >= this.f29a.length) {
            int i12 = (i11 + 1) * 4;
            for (int i13 = 4; i13 < 32; i13++) {
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
            }
            int i15 = i12 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f29a, i15);
            kotlin.jvm.internal.j.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f29a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f30b, i15);
            kotlin.jvm.internal.j.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f30b = objArrCopyOf;
        }
        this.f29a[i11] = i10;
        this.f30b[i11] = obj;
        this.f31c = i11 + 1;
    }

    public final l clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.j.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        l lVar = (l) objClone;
        lVar.f29a = (int[]) this.f29a.clone();
        lVar.f30b = (Object[]) this.f30b.clone();
        return lVar;
    }

    public final Object c(int i10) {
        Object obj;
        int iA = b0.a.a(this.f31c, i10, this.f29a);
        if (iA < 0 || (obj = this.f30b[iA]) == i.f20b) {
            return null;
        }
        return obj;
    }

    public final void d(int i10, Object obj) {
        int iA = b0.a.a(this.f31c, i10, this.f29a);
        if (iA >= 0) {
            this.f30b[iA] = obj;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f31c;
        if (i11 < i12) {
            Object[] objArr = this.f30b;
            if (objArr[i11] == i.f20b) {
                this.f29a[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.f29a.length) {
            int i13 = (i12 + 1) * 4;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f29a, i16);
            kotlin.jvm.internal.j.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f29a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f30b, i16);
            kotlin.jvm.internal.j.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f30b = objArrCopyOf;
        }
        int i17 = this.f31c;
        if (i17 - i11 != 0) {
            int[] iArr = this.f29a;
            int i18 = i11 + 1;
            qc.f.b(i18, i11, i17, iArr, iArr);
            Object[] objArr2 = this.f30b;
            qc.f.c(i18, i11, this.f31c, objArr2, objArr2);
        }
        this.f29a[i11] = i10;
        this.f30b[i11] = obj;
        this.f31c++;
    }

    public final String toString() {
        int i10 = this.f31c;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append('{');
        int i11 = this.f31c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f29a[i12]);
            sb2.append('=');
            Object obj = this.f30b[i12];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.j.d(string, "buffer.toString()");
        return string;
    }
}
