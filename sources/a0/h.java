package a0;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.u1;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z1;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s4.c0;
import s4.o0;
import s4.z0;
public final class h {
    public int f16a;
    public int f17b;
    public Object f18c;
    public int d;

    public h() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.d = highestOneBit - 1;
        this.f18c = new int[highestOneBit];
    }

    public static void V(int i10) {
        if ((i10 & 3) == 0) {
            return;
        }
        throw b0.e();
    }

    public static void W(int i10) {
        if ((i10 & 7) == 0) {
            return;
        }
        throw b0.e();
    }

    public void A(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!(list instanceof i0)) {
            int i10 = this.f16a & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Long.valueOf(hVar.m()));
                    } while (hVar.b() < b10);
                    S(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Long.valueOf(hVar.m()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f16a);
            this.d = z10;
            return;
        }
        throw new ClassCastException();
    }

    public Object B(b1 b1Var, androidx.datastore.preferences.protobuf.m mVar) {
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        int A = hVar.A();
        if (hVar.f1246a < 100) {
            int e7 = hVar.e(A);
            Object a2 = b1Var.a();
            hVar.f1246a++;
            b1Var.c(a2, this, mVar);
            b1Var.d(a2);
            hVar.a(0);
            hVar.f1246a--;
            hVar.d(e7);
            return a2;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public Object C(b1 b1Var, androidx.datastore.preferences.protobuf.m mVar) {
        T(2);
        return B(b1Var, mVar);
    }

    public int D() {
        T(5);
        return ((androidx.datastore.preferences.protobuf.h) this.f18c).v();
    }

    public void E(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!(list instanceof x)) {
            int i10 = this.f16a & 7;
            if (i10 != 2) {
                if (i10 == 5) {
                    do {
                        list.add(Integer.valueOf(hVar.v()));
                        if (!hVar.c()) {
                            z10 = hVar.z();
                        } else {
                            return;
                        }
                    } while (z10 == this.f16a);
                    this.d = z10;
                    return;
                }
                throw b0.b();
            }
            int A = hVar.A();
            V(A);
            int b10 = hVar.b() + A;
            do {
                list.add(Integer.valueOf(hVar.v()));
            } while (hVar.b() < b10);
            return;
        }
        throw new ClassCastException();
    }

    public long F() {
        T(1);
        return ((androidx.datastore.preferences.protobuf.h) this.f18c).w();
    }

    public void G(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!(list instanceof i0)) {
            int i10 = this.f16a & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int A = hVar.A();
                    W(A);
                    int b10 = hVar.b() + A;
                    do {
                        list.add(Long.valueOf(hVar.w()));
                    } while (hVar.b() < b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Long.valueOf(hVar.w()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f16a);
            this.d = z10;
            return;
        }
        throw new ClassCastException();
    }

    public int H() {
        T(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f18c).x();
    }

    public void I(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!(list instanceof x)) {
            int i10 = this.f16a & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Integer.valueOf(hVar.x()));
                    } while (hVar.b() < b10);
                    S(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Integer.valueOf(hVar.x()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f16a);
            this.d = z10;
            return;
        }
        throw new ClassCastException();
    }

    public long J() {
        T(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f18c).y();
    }

    public void K(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!(list instanceof i0)) {
            int i10 = this.f16a & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Long.valueOf(hVar.y()));
                    } while (hVar.b() < b10);
                    S(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Long.valueOf(hVar.y()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f16a);
            this.d = z10;
            return;
        }
        throw new ClassCastException();
    }

    public String L() {
        T(2);
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        byte[] bArr = hVar.d;
        int s10 = hVar.s();
        if (s10 > 0) {
            int i10 = hVar.f1249e;
            int i11 = hVar.f1251g;
            if (s10 <= i10 - i11) {
                String str = new String(bArr, i11, s10, z.f1336a);
                hVar.f1251g += s10;
                return str;
            }
        }
        if (s10 == 0) {
            return "";
        }
        if (s10 <= hVar.f1249e) {
            hVar.D(s10);
            String str2 = new String(bArr, hVar.f1251g, s10, z.f1336a);
            hVar.f1251g += s10;
            return str2;
        }
        return new String(hVar.n(s10), z.f1336a);
    }

    public void M(List list, boolean z10) {
        String L;
        int z11;
        int z12;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if ((this.f16a & 7) == 2) {
            if ((list instanceof e0) && !z10) {
                e0 e0Var = (e0) list;
                do {
                    e0Var.g(h());
                    if (!hVar.c()) {
                        z12 = hVar.z();
                    } else {
                        return;
                    }
                } while (z12 == this.f16a);
                this.d = z12;
                return;
            }
            do {
                if (z10) {
                    L = N();
                } else {
                    L = L();
                }
                list.add(L);
                if (hVar.c()) {
                    return;
                }
                z11 = hVar.z();
            } while (z11 == this.f16a);
            this.d = z11;
            return;
        }
        throw b0.b();
    }

    public String N() {
        T(2);
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        byte[] bArr = hVar.d;
        int s10 = hVar.s();
        int i10 = hVar.f1251g;
        int i11 = hVar.f1249e;
        if (s10 <= i11 - i10 && s10 > 0) {
            hVar.f1251g = i10 + s10;
        } else if (s10 == 0) {
            return "";
        } else {
            i10 = 0;
            if (s10 <= i11) {
                hVar.D(s10);
                hVar.f1251g = s10;
            } else {
                bArr = hVar.n(s10);
            }
        }
        return u1.f1330a.e(i10, s10, bArr);
    }

    public int O() {
        T(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f18c).A();
    }

    public void P(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!(list instanceof x)) {
            int i10 = this.f16a & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Integer.valueOf(hVar.A()));
                    } while (hVar.b() < b10);
                    S(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Integer.valueOf(hVar.A()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f16a);
            this.d = z10;
            return;
        }
        throw new ClassCastException();
    }

    public long Q() {
        T(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f18c).B();
    }

    public void R(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!(list instanceof i0)) {
            int i10 = this.f16a & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Long.valueOf(hVar.B()));
                    } while (hVar.b() < b10);
                    S(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Long.valueOf(hVar.B()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f16a);
            this.d = z10;
            return;
        }
        throw new ClassCastException();
    }

    public void S(int i10) {
        if (((androidx.datastore.preferences.protobuf.h) this.f18c).b() == i10) {
            return;
        }
        throw b0.f();
    }

    public void T(int i10) {
        if ((this.f16a & 7) == i10) {
            return;
        }
        throw b0.b();
    }

    public boolean U() {
        int i10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!hVar.c() && (i10 = this.f16a) != this.f17b) {
            return hVar.E(i10);
        }
        return false;
    }

    public void a(int i10) {
        int[] iArr = (int[]) this.f18c;
        int i11 = this.f17b;
        iArr[i11] = i10;
        int i12 = this.d & (i11 + 1);
        this.f17b = i12;
        int i13 = this.f16a;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            if (i15 >= 0) {
                int[] iArr2 = new int[i15];
                hd.f.b(0, i13, length, iArr, iArr2);
                hd.f.b(i14, 0, this.f16a, (int[]) this.f18c, iArr2);
                this.f18c = iArr2;
                this.f16a = 0;
                this.f17b = length;
                this.d = i15 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public void b(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                int i12 = this.d;
                int i13 = i12 * 2;
                int[] iArr = (int[]) this.f18c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f18c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i13 >= iArr.length) {
                    int[] iArr3 = new int[i12 * 4];
                    this.f18c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = (int[]) this.f18c;
                iArr4[i13] = i10;
                iArr4[i13 + 1] = i11;
                this.d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public void c(RecyclerView recyclerView, boolean z10) {
        boolean z11;
        int i10;
        this.d = 0;
        int[] iArr = (int[]) this.f18c;
        int i11 = -1;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        o0 o0Var = recyclerView.f1923x;
        if (recyclerView.f1921w != null && o0Var != null && o0Var.h) {
            if (z10) {
                if (!recyclerView.d.h()) {
                    int h = recyclerView.f1921w.h();
                    c0 c0Var = (c0) o0Var;
                    s4.b0 b0Var = c0Var.B;
                    if (b0Var != null && (i10 = b0Var.f45744a) >= 0) {
                        z11 = b0Var.f45746c;
                    } else {
                        c0Var.f1();
                        z11 = c0Var.v;
                        i10 = c0Var.f45763y;
                        if (i10 == -1) {
                            i10 = z11 ? h - 1 : 0;
                        }
                    }
                    if (!z11) {
                        i11 = 1;
                    }
                    for (int i12 = 0; i12 < c0Var.E && i10 >= 0 && i10 < h; i12++) {
                        b(i10, 0);
                        i10 += i11;
                    }
                }
            } else if (!recyclerView.Z()) {
                int i13 = this.f16a;
                int i14 = this.f17b;
                z0 z0Var = recyclerView.f1918t0;
                c0 c0Var2 = (c0) o0Var;
                if (c0Var2.f45754o != 0) {
                    i13 = i14;
                }
                if (c0Var2.r() != 0 && i13 != 0) {
                    c0Var2.G0();
                    if (i13 > 0) {
                        i11 = 1;
                    }
                    c0Var2.m1(i11, Math.abs(i13), true, z0Var);
                    c0Var2.A0(z0Var, c0Var2.f45755p, this);
                }
            }
            int i15 = this.d;
            if (i15 > o0Var.f45875i) {
                o0Var.f45875i = i15;
                o0Var.f45876j = z10;
                recyclerView.f1894b.l();
            }
        }
    }

    public int d() {
        int i10 = this.d;
        if (i10 != 0) {
            this.f16a = i10;
            this.d = 0;
        } else {
            this.f16a = ((androidx.datastore.preferences.protobuf.h) this.f18c).z();
        }
        int i11 = this.f16a;
        if (i11 != 0 && i11 != this.f17b) {
            return i11 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public int e() {
        return this.f16a;
    }

    public boolean f() {
        T(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f18c).f();
    }

    public void g(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!(list instanceof androidx.datastore.preferences.protobuf.d)) {
            int i10 = this.f16a & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Boolean.valueOf(hVar.f()));
                    } while (hVar.b() < b10);
                    S(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Boolean.valueOf(hVar.f()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f16a);
            this.d = z10;
            return;
        }
        throw new ClassCastException();
    }

    public androidx.datastore.preferences.protobuf.g h() {
        T(2);
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        byte[] bArr = hVar.d;
        int s10 = hVar.s();
        int i10 = hVar.f1249e;
        int i11 = hVar.f1251g;
        if (s10 <= i10 - i11 && s10 > 0) {
            androidx.datastore.preferences.protobuf.g i12 = androidx.datastore.preferences.protobuf.g.i(i11, s10, bArr);
            hVar.f1251g += s10;
            return i12;
        } else if (s10 == 0) {
            return androidx.datastore.preferences.protobuf.g.f1240c;
        } else {
            byte[] o9 = hVar.o(s10);
            if (o9 != null) {
                return androidx.datastore.preferences.protobuf.g.i(0, o9.length, o9);
            }
            int i13 = hVar.f1251g;
            int i14 = hVar.f1249e;
            int i15 = i14 - i13;
            hVar.f1252i += i14;
            hVar.f1251g = 0;
            hVar.f1249e = 0;
            ArrayList p5 = hVar.p(s10 - i15);
            byte[] bArr2 = new byte[s10];
            System.arraycopy(bArr, i13, bArr2, 0, i15);
            int size = p5.size();
            int i16 = 0;
            while (i16 < size) {
                Object obj = p5.get(i16);
                i16++;
                byte[] bArr3 = (byte[]) obj;
                System.arraycopy(bArr3, 0, bArr2, i15, bArr3.length);
                i15 += bArr3.length;
            }
            androidx.datastore.preferences.protobuf.g gVar = androidx.datastore.preferences.protobuf.g.f1240c;
            return new androidx.datastore.preferences.protobuf.g(bArr2);
        }
    }

    public void i(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if ((this.f16a & 7) == 2) {
            do {
                list.add(h());
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f16a);
            this.d = z10;
            return;
        }
        throw b0.b();
    }

    public double j() {
        T(1);
        return ((androidx.datastore.preferences.protobuf.h) this.f18c).g();
    }

    public void k(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!(list instanceof androidx.datastore.preferences.protobuf.k)) {
            int i10 = this.f16a & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int A = hVar.A();
                    W(A);
                    int b10 = hVar.b() + A;
                    do {
                        list.add(Double.valueOf(hVar.g()));
                    } while (hVar.b() < b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Double.valueOf(hVar.g()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f16a);
            this.d = z10;
            return;
        }
        throw new ClassCastException();
    }

    public int l() {
        T(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f18c).h();
    }

    public void m(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!(list instanceof x)) {
            int i10 = this.f16a & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Integer.valueOf(hVar.h()));
                    } while (hVar.b() < b10);
                    S(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Integer.valueOf(hVar.h()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f16a);
            this.d = z10;
            return;
        }
        throw new ClassCastException();
    }

    public Object n(z1 z1Var, Class cls, androidx.datastore.preferences.protobuf.m mVar) {
        switch (z1Var.ordinal()) {
            case 0:
                return Double.valueOf(j());
            case 1:
                return Float.valueOf(s());
            case 2:
                return Long.valueOf(z());
            case 3:
                return Long.valueOf(Q());
            case 4:
                return Integer.valueOf(x());
            case 5:
                return Long.valueOf(q());
            case 6:
                return Integer.valueOf(o());
            case 7:
                return Boolean.valueOf(f());
            case 8:
                return N();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                T(2);
                return B(y0.f1333c.a(cls), mVar);
            case 11:
                return h();
            case 12:
                return Integer.valueOf(O());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Integer.valueOf(D());
            case 15:
                return Long.valueOf(F());
            case 16:
                return Integer.valueOf(H());
            case 17:
                return Long.valueOf(J());
        }
    }

    public int o() {
        T(5);
        return ((androidx.datastore.preferences.protobuf.h) this.f18c).i();
    }

    public void p(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!(list instanceof x)) {
            int i10 = this.f16a & 7;
            if (i10 != 2) {
                if (i10 == 5) {
                    do {
                        list.add(Integer.valueOf(hVar.i()));
                        if (!hVar.c()) {
                            z10 = hVar.z();
                        } else {
                            return;
                        }
                    } while (z10 == this.f16a);
                    this.d = z10;
                    return;
                }
                throw b0.b();
            }
            int A = hVar.A();
            V(A);
            int b10 = hVar.b() + A;
            do {
                list.add(Integer.valueOf(hVar.i()));
            } while (hVar.b() < b10);
            return;
        }
        throw new ClassCastException();
    }

    public long q() {
        T(1);
        return ((androidx.datastore.preferences.protobuf.h) this.f18c).j();
    }

    public void r(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!(list instanceof i0)) {
            int i10 = this.f16a & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int A = hVar.A();
                    W(A);
                    int b10 = hVar.b() + A;
                    do {
                        list.add(Long.valueOf(hVar.j()));
                    } while (hVar.b() < b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Long.valueOf(hVar.j()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f16a);
            this.d = z10;
            return;
        }
        throw new ClassCastException();
    }

    public float s() {
        T(5);
        return ((androidx.datastore.preferences.protobuf.h) this.f18c).k();
    }

    public void t(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!(list instanceof s)) {
            int i10 = this.f16a & 7;
            if (i10 != 2) {
                if (i10 == 5) {
                    do {
                        list.add(Float.valueOf(hVar.k()));
                        if (!hVar.c()) {
                            z10 = hVar.z();
                        } else {
                            return;
                        }
                    } while (z10 == this.f16a);
                    this.d = z10;
                    return;
                }
                throw b0.b();
            }
            int A = hVar.A();
            V(A);
            int b10 = hVar.b() + A;
            do {
                list.add(Float.valueOf(hVar.k()));
            } while (hVar.b() < b10);
            return;
        }
        throw new ClassCastException();
    }

    public Object u(b1 b1Var, androidx.datastore.preferences.protobuf.m mVar) {
        int i10 = this.f17b;
        this.f17b = ((this.f16a >>> 3) << 3) | 4;
        try {
            Object a2 = b1Var.a();
            b1Var.c(a2, this, mVar);
            b1Var.d(a2);
            if (this.f16a == this.f17b) {
                return a2;
            }
            throw b0.e();
        } finally {
            this.f17b = i10;
        }
    }

    public Object v(b1 b1Var, androidx.datastore.preferences.protobuf.m mVar) {
        T(3);
        return u(b1Var, mVar);
    }

    public void w(List list, b1 b1Var, androidx.datastore.preferences.protobuf.m mVar) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        int i10 = this.f16a;
        if ((i10 & 7) == 3) {
            do {
                list.add(u(b1Var, mVar));
                if (!hVar.c() && this.d == 0) {
                    z10 = hVar.z();
                } else {
                    return;
                }
            } while (z10 == i10);
            this.d = z10;
            return;
        }
        throw b0.b();
    }

    public int x() {
        T(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f18c).l();
    }

    public void y(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f18c;
        if (!(list instanceof x)) {
            int i10 = this.f16a & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Integer.valueOf(hVar.l()));
                    } while (hVar.b() < b10);
                    S(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Integer.valueOf(hVar.l()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f16a);
            this.d = z10;
            return;
        }
        throw new ClassCastException();
    }

    public long z() {
        T(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f18c).m();
    }
}
