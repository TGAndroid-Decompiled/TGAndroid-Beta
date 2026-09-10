package a0;

import java.util.Arrays;
public final class i implements Cloneable {
    public boolean f17a;
    public long[] f18b;
    public Object[] f19c;
    public int d;

    public i(int i10) {
        if (i10 == 0) {
            this.f18b = b0.a.f1577b;
            this.f19c = b0.a.f1578c;
            return;
        }
        int i11 = i10 * 8;
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
        int i14 = i11 / 8;
        this.f18b = new long[i14];
        this.f19c = new Object[i14];
    }

    public final void a(Long l4, long j3) {
        int i10 = this.d;
        if (i10 != 0 && j3 <= this.f18b[i10 - 1]) {
            k(l4, j3);
            return;
        }
        if (this.f17a) {
            long[] jArr = this.f18b;
            if (i10 >= jArr.length) {
                Object[] objArr = this.f19c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != j.f20a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f17a = false;
                this.d = i11;
            }
        }
        int i13 = this.d;
        if (i13 >= this.f18b.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            long[] copyOf = Arrays.copyOf(this.f18b, i17);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.f18b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f19c, i17);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.f19c = copyOf2;
        }
        this.f18b[i13] = j3;
        this.f19c[i13] = l4;
        this.d = i13 + 1;
    }

    public final void b() {
        int i10 = this.d;
        Object[] objArr = this.f19c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.d = 0;
        this.f17a = false;
    }

    public final i clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.i.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        i iVar = (i) clone;
        iVar.f18b = (long[]) this.f18b.clone();
        iVar.f19c = (Object[]) this.f19c.clone();
        return iVar;
    }

    public final boolean d(long j3) {
        if (h(j3) >= 0) {
            return true;
        }
        return false;
    }

    public final void e(long j3) {
        int b10 = b0.a.b(this.f18b, this.d, j3);
        if (b10 >= 0) {
            Object[] objArr = this.f19c;
            Object obj = objArr[b10];
            Object obj2 = j.f20a;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f17a = true;
            }
        }
    }

    public final Object f(long j3) {
        Object obj;
        int b10 = b0.a.b(this.f18b, this.d, j3);
        if (b10 >= 0 && (obj = this.f19c[b10]) != j.f20a) {
            return obj;
        }
        return null;
    }

    public final Object g(Object obj, long j3) {
        Object obj2;
        int b10 = b0.a.b(this.f18b, this.d, j3);
        if (b10 >= 0 && (obj2 = this.f19c[b10]) != j.f20a) {
            return obj2;
        }
        return obj;
    }

    public final int h(long j3) {
        if (this.f17a) {
            int i10 = this.d;
            long[] jArr = this.f18b;
            Object[] objArr = this.f19c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != j.f20a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f17a = false;
            this.d = i11;
        }
        return b0.a.b(this.f18b, this.d, j3);
    }

    public final boolean i() {
        if (m() == 0) {
            return true;
        }
        return false;
    }

    public final long j(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.d)) {
            if (this.f17a) {
                long[] jArr = this.f18b;
                Object[] objArr = this.f19c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != j.f20a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f17a = false;
                this.d = i12;
            }
            return this.f18b[i10];
        }
        throw new IllegalArgumentException(hc.b.j(i10, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final void k(Object obj, long j3) {
        Object obj2 = j.f20a;
        int b10 = b0.a.b(this.f18b, this.d, j3);
        if (b10 >= 0) {
            this.f19c[b10] = obj;
            return;
        }
        int i10 = ~b10;
        int i11 = this.d;
        if (i10 < i11) {
            Object[] objArr = this.f19c;
            if (objArr[i10] == obj2) {
                this.f18b[i10] = j3;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f17a) {
            long[] jArr = this.f18b;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f19c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f17a = false;
                this.d = i12;
                i10 = ~b0.a.b(this.f18b, i12, j3);
            }
        }
        int i14 = this.d;
        if (i14 >= this.f18b.length) {
            int i15 = (i14 + 1) * 8;
            int i16 = 4;
            while (true) {
                if (i16 >= 32) {
                    break;
                }
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
                i16++;
            }
            int i18 = i15 / 8;
            long[] copyOf = Arrays.copyOf(this.f18b, i18);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.f18b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f19c, i18);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.f19c = copyOf2;
        }
        int i19 = this.d - i10;
        if (i19 != 0) {
            long[] jArr2 = this.f18b;
            int i20 = i10 + 1;
            kotlin.jvm.internal.i.e(jArr2, "<this>");
            System.arraycopy(jArr2, i10, jArr2, i20, i19);
            Object[] objArr3 = this.f19c;
            hd.f.c(i20, i10, this.d, objArr3, objArr3);
        }
        this.f18b[i10] = j3;
        this.f19c[i10] = obj;
        this.d++;
    }

    public final void l(long j3) {
        int b10 = b0.a.b(this.f18b, this.d, j3);
        if (b10 >= 0) {
            Object[] objArr = this.f19c;
            Object obj = objArr[b10];
            Object obj2 = j.f20a;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f17a = true;
            }
        }
    }

    public final int m() {
        if (this.f17a) {
            int i10 = this.d;
            long[] jArr = this.f18b;
            Object[] objArr = this.f19c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != j.f20a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f17a = false;
            this.d = i11;
        }
        return this.d;
    }

    public final Object n(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.d)) {
            if (this.f17a) {
                long[] jArr = this.f18b;
                Object[] objArr = this.f19c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != j.f20a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f17a = false;
                this.d = i12;
            }
            return this.f19c[i10];
        }
        throw new IllegalArgumentException(hc.b.j(i10, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.d * 28);
        sb2.append('{');
        int i10 = this.d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i11));
            sb2.append('=');
            Object n10 = n(i11);
            if (n10 != sb2) {
                sb2.append(n10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public i() {
        this(10);
    }
}
