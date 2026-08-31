package a0;

import java.util.Arrays;
public final class h implements Cloneable {
    public boolean f16a;
    public long[] f17b;
    public Object[] f18c;
    public int d;

    public h(int i10) {
        if (i10 == 0) {
            this.f17b = b0.a.f1367b;
            this.f18c = b0.a.f1368c;
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
        this.f17b = new long[i14];
        this.f18c = new Object[i14];
    }

    public final void a(Long l10, long j10) {
        int i10 = this.d;
        if (i10 != 0 && j10 <= this.f17b[i10 - 1]) {
            k(l10, j10);
            return;
        }
        if (this.f16a) {
            long[] jArr = this.f17b;
            if (i10 >= jArr.length) {
                Object[] objArr = this.f18c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != i.f19a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f16a = false;
                this.d = i11;
            }
        }
        int i13 = this.d;
        if (i13 >= this.f17b.length) {
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
            long[] copyOf = Arrays.copyOf(this.f17b, i17);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f17b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f18c, i17);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f18c = copyOf2;
        }
        this.f17b[i13] = j10;
        this.f18c[i13] = l10;
        this.d = i13 + 1;
    }

    public final void b() {
        int i10 = this.d;
        Object[] objArr = this.f18c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.d = 0;
        this.f16a = false;
    }

    public final h clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.j.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h hVar = (h) clone;
        hVar.f17b = (long[]) this.f17b.clone();
        hVar.f18c = (Object[]) this.f18c.clone();
        return hVar;
    }

    public final boolean d(long j10) {
        if (h(j10) >= 0) {
            return true;
        }
        return false;
    }

    public final void e(long j10) {
        int b10 = b0.a.b(this.f17b, this.d, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f18c;
            Object obj = objArr[b10];
            Object obj2 = i.f19a;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f16a = true;
            }
        }
    }

    public final Object f(long j10) {
        Object obj;
        int b10 = b0.a.b(this.f17b, this.d, j10);
        if (b10 >= 0 && (obj = this.f18c[b10]) != i.f19a) {
            return obj;
        }
        return null;
    }

    public final Object g(Object obj, long j10) {
        Object obj2;
        int b10 = b0.a.b(this.f17b, this.d, j10);
        if (b10 >= 0 && (obj2 = this.f18c[b10]) != i.f19a) {
            return obj2;
        }
        return obj;
    }

    public final int h(long j10) {
        if (this.f16a) {
            int i10 = this.d;
            long[] jArr = this.f17b;
            Object[] objArr = this.f18c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != i.f19a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f16a = false;
            this.d = i11;
        }
        return b0.a.b(this.f17b, this.d, j10);
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
            if (this.f16a) {
                long[] jArr = this.f17b;
                Object[] objArr = this.f18c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != i.f19a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f16a = false;
                this.d = i12;
            }
            return this.f17b[i10];
        }
        throw new IllegalArgumentException(l.d.j(i10, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final void k(Object obj, long j10) {
        Object obj2 = i.f19a;
        int b10 = b0.a.b(this.f17b, this.d, j10);
        if (b10 >= 0) {
            this.f18c[b10] = obj;
            return;
        }
        int i10 = ~b10;
        int i11 = this.d;
        if (i10 < i11) {
            Object[] objArr = this.f18c;
            if (objArr[i10] == obj2) {
                this.f17b[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f16a) {
            long[] jArr = this.f17b;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f18c;
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
                this.f16a = false;
                this.d = i12;
                i10 = ~b0.a.b(this.f17b, i12, j10);
            }
        }
        int i14 = this.d;
        if (i14 >= this.f17b.length) {
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
            long[] copyOf = Arrays.copyOf(this.f17b, i18);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f17b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f18c, i18);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f18c = copyOf2;
        }
        int i19 = this.d - i10;
        if (i19 != 0) {
            long[] jArr2 = this.f17b;
            int i20 = i10 + 1;
            kotlin.jvm.internal.j.e(jArr2, "<this>");
            System.arraycopy(jArr2, i10, jArr2, i20, i19);
            Object[] objArr3 = this.f18c;
            tc.f.c(i20, i10, this.d, objArr3, objArr3);
        }
        this.f17b[i10] = j10;
        this.f18c[i10] = obj;
        this.d++;
    }

    public final void l(long j10) {
        int b10 = b0.a.b(this.f17b, this.d, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f18c;
            Object obj = objArr[b10];
            Object obj2 = i.f19a;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f16a = true;
            }
        }
    }

    public final int m() {
        if (this.f16a) {
            int i10 = this.d;
            long[] jArr = this.f17b;
            Object[] objArr = this.f18c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != i.f19a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f16a = false;
            this.d = i11;
        }
        return this.d;
    }

    public final Object n(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.d)) {
            if (this.f16a) {
                long[] jArr = this.f17b;
                Object[] objArr = this.f18c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != i.f19a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f16a = false;
                this.d = i12;
            }
            return this.f18c[i10];
        }
        throw new IllegalArgumentException(l.d.j(i10, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i10 = this.d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(j(i11));
            sb.append('=');
            Object n10 = n(i11);
            if (n10 != sb) {
                sb.append(n10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public h() {
        this(10);
    }
}
