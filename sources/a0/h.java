package a0;

import java.util.Arrays;
import k2.p1;
public final class h implements Cloneable {
    public boolean f17a;
    public long[] f18b;
    public Object[] f19c;
    public int d;

    public h(int i3) {
        if (i3 == 0) {
            this.f18b = b0.a.f2321b;
            this.f19c = b0.a.f2322c;
            return;
        }
        int i10 = i3 * 8;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f18b = new long[i13];
        this.f19c = new Object[i13];
    }

    public final void a(long j10, Long l10) {
        int i3 = this.d;
        if (i3 != 0 && j10 <= this.f18b[i3 - 1]) {
            k(l10, j10);
            return;
        }
        if (this.f17a) {
            long[] jArr = this.f18b;
            if (i3 >= jArr.length) {
                Object[] objArr = this.f19c;
                int i10 = 0;
                for (int i11 = 0; i11 < i3; i11++) {
                    Object obj = objArr[i11];
                    if (obj != i.f20a) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f17a = false;
                this.d = i10;
            }
        }
        int i12 = this.d;
        if (i12 >= this.f18b.length) {
            int i13 = (i12 + 1) * 8;
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
            int i16 = i13 / 8;
            long[] copyOf = Arrays.copyOf(this.f18b, i16);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f18b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f19c, i16);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f19c = copyOf2;
        }
        this.f18b[i12] = j10;
        this.f19c[i12] = l10;
        this.d = i12 + 1;
    }

    public final void b() {
        int i3 = this.d;
        Object[] objArr = this.f19c;
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = null;
        }
        this.d = 0;
        this.f17a = false;
    }

    public final h clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.j.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h hVar = (h) clone;
        hVar.f18b = (long[]) this.f18b.clone();
        hVar.f19c = (Object[]) this.f19c.clone();
        return hVar;
    }

    public final boolean d(long j10) {
        if (h(j10) >= 0) {
            return true;
        }
        return false;
    }

    public final void e(long j10) {
        int b10 = b0.a.b(this.f18b, this.d, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f19c;
            Object obj = objArr[b10];
            Object obj2 = i.f20a;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f17a = true;
            }
        }
    }

    public final Object f(long j10) {
        Object obj;
        int b10 = b0.a.b(this.f18b, this.d, j10);
        if (b10 >= 0 && (obj = this.f19c[b10]) != i.f20a) {
            return obj;
        }
        return null;
    }

    public final Object g(Object obj, long j10) {
        Object obj2;
        int b10 = b0.a.b(this.f18b, this.d, j10);
        if (b10 >= 0 && (obj2 = this.f19c[b10]) != i.f20a) {
            return obj2;
        }
        return obj;
    }

    public final int h(long j10) {
        if (this.f17a) {
            int i3 = this.d;
            long[] jArr = this.f18b;
            Object[] objArr = this.f19c;
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                Object obj = objArr[i11];
                if (obj != i.f20a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f17a = false;
            this.d = i10;
        }
        return b0.a.b(this.f18b, this.d, j10);
    }

    public final boolean i() {
        if (m() == 0) {
            return true;
        }
        return false;
    }

    public final long j(int i3) {
        int i10;
        if (i3 >= 0 && i3 < (i10 = this.d)) {
            if (this.f17a) {
                long[] jArr = this.f18b;
                Object[] objArr = this.f19c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != i.f20a) {
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
            return this.f18b[i3];
        }
        throw new IllegalArgumentException(p1.i(i3, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final void k(Object obj, long j10) {
        Object obj2 = i.f20a;
        int b10 = b0.a.b(this.f18b, this.d, j10);
        if (b10 >= 0) {
            this.f19c[b10] = obj;
            return;
        }
        int i3 = ~b10;
        int i10 = this.d;
        if (i3 < i10) {
            Object[] objArr = this.f19c;
            if (objArr[i3] == obj2) {
                this.f18b[i3] = j10;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f17a) {
            long[] jArr = this.f18b;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f19c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f17a = false;
                this.d = i11;
                i3 = ~b0.a.b(this.f18b, i11, j10);
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
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f18b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f19c, i17);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f19c = copyOf2;
        }
        int i18 = this.d - i3;
        if (i18 != 0) {
            long[] jArr2 = this.f18b;
            int i19 = i3 + 1;
            kotlin.jvm.internal.j.e(jArr2, "<this>");
            System.arraycopy(jArr2, i3, jArr2, i19, i18);
            Object[] objArr3 = this.f19c;
            ed.f.c(i19, i3, this.d, objArr3, objArr3);
        }
        this.f18b[i3] = j10;
        this.f19c[i3] = obj;
        this.d++;
    }

    public final void l(long j10) {
        int b10 = b0.a.b(this.f18b, this.d, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f19c;
            Object obj = objArr[b10];
            Object obj2 = i.f20a;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f17a = true;
            }
        }
    }

    public final int m() {
        if (this.f17a) {
            int i3 = this.d;
            long[] jArr = this.f18b;
            Object[] objArr = this.f19c;
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                Object obj = objArr[i11];
                if (obj != i.f20a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f17a = false;
            this.d = i10;
        }
        return this.d;
    }

    public final Object n(int i3) {
        int i10;
        if (i3 >= 0 && i3 < (i10 = this.d)) {
            if (this.f17a) {
                long[] jArr = this.f18b;
                Object[] objArr = this.f19c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != i.f20a) {
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
            return this.f19c[i3];
        }
        throw new IllegalArgumentException(p1.i(i3, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.d * 28);
        sb2.append('{');
        int i3 = this.d;
        for (int i10 = 0; i10 < i3; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i10));
            sb2.append('=');
            Object n4 = n(i10);
            if (n4 != sb2) {
                sb2.append(n4);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public h() {
        this(10);
    }
}
