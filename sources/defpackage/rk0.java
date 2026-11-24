package defpackage;

import android.util.SparseArray;
import java.lang.reflect.Array;
public final class rk0 implements tz0 {
    public final byte a = 2;
    public int b;
    public int c;
    public final Object d;

    public rk0(ph7 ph7Var, go4 go4Var) {
        yw7 yw7Var = ph7Var.e;
        this.d = yw7Var;
        yw7Var.N(12);
        int E = yw7Var.E();
        if ("audio/raw".equals(go4Var.t)) {
            int u = hac.u(go4Var.Q) * go4Var.N;
            if (E % u != 0) {
                ncd.f("BoxParsers", "Audio sample size mismatch. stsd sample size: " + u + ", stsz sample size: " + E);
                E = u;
            }
        }
        this.b = E == 0 ? -1 : E;
        this.c = yw7Var.E();
    }

    @Override
    public final int a() {
        return this.b;
    }

    @Override
    public final int b() {
        return this.c;
    }

    @Override
    public final int c() {
        int i = this.b;
        if (i == -1) {
            return ((yw7) this.d).E();
        }
        return i;
    }

    public final int d() {
        return ((((byte[]) this.d).length - this.b) << 3) - this.c;
    }

    public final byte e(int i, int i2) {
        return ((byte[][]) this.d)[i2][i];
    }

    public final int f(int i) {
        byte[] bArr = (byte[]) this.d;
        int i2 = 0;
        if (i >= 1 && i <= 32 && i <= d()) {
            int i3 = this.c;
            if (i3 > 0) {
                int i4 = 8 - i3;
                int min = Math.min(i, i4);
                int i5 = i4 - min;
                int i6 = this.b;
                int i7 = (bArr[i6] & ((255 >> (8 - min)) << i5)) >> i5;
                i -= min;
                int i8 = this.c + min;
                this.c = i8;
                if (i8 == 8) {
                    this.c = 0;
                    this.b = i6 + 1;
                }
                i2 = i7;
            }
            if (i > 0) {
                while (i >= 8) {
                    int i9 = this.b;
                    i2 = (i2 << 8) | (bArr[i9] & 255);
                    this.b = i9 + 1;
                    i -= 8;
                }
                if (i > 0) {
                    int i10 = 8 - i;
                    int i11 = (i2 << i) | ((bArr[this.b] & ((255 >> i10) << i10)) >> i10);
                    this.c += i;
                    return i11;
                }
                return i2;
            }
            return i2;
        }
        u36.j(String.valueOf(i));
        return 0;
    }

    public final void g(int i, int i2, int i3) {
        ((byte[][]) this.d)[i2][i] = (byte) i3;
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                int i = this.b;
                int i2 = this.c;
                StringBuilder sb = new StringBuilder(((i << 1) * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.d)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b != 0) {
                            if (b != 1) {
                                sb.append("  ");
                            } else {
                                sb.append(" 1");
                            }
                        } else {
                            sb.append(" 0");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public rk0(byte[] bArr) {
        this.d = bArr;
    }

    public rk0(int i, int i2, SparseArray sparseArray) {
        this.b = i;
        this.c = i2;
        this.d = sparseArray;
    }

    public rk0(int i, int i2) {
        this.d = (byte[][]) Array.newInstance(Byte.TYPE, i2, i);
        this.b = i;
        this.c = i2;
    }
}
