package defpackage;

import java.util.ArrayList;
public final class mc0 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public mc0(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static mc0 a(ey7 ey7Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            ey7Var.O(4);
            int A = (ey7Var.A() & 3) + 1;
            if (A != 3) {
                ArrayList arrayList = new ArrayList();
                int A2 = ey7Var.A() & 31;
                for (int i9 = 0; i9 < A2; i9++) {
                    int H = ey7Var.H();
                    int i10 = ey7Var.b;
                    ey7Var.O(H);
                    byte[] bArr = ey7Var.a;
                    byte[] bArr2 = new byte[H + 4];
                    System.arraycopy(rk2.a, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i10, bArr2, 4, H);
                    arrayList.add(bArr2);
                }
                int A3 = ey7Var.A();
                for (int i11 = 0; i11 < A3; i11++) {
                    int H2 = ey7Var.H();
                    int i12 = ey7Var.b;
                    ey7Var.O(H2);
                    byte[] bArr3 = ey7Var.a;
                    byte[] bArr4 = new byte[H2 + 4];
                    System.arraycopy(rk2.a, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i12, bArr4, 4, H2);
                    arrayList.add(bArr4);
                }
                if (A2 > 0) {
                    gk7 k = rfd.k(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                    int i13 = k.e;
                    int i14 = k.f;
                    int i15 = k.p;
                    int i16 = k.q;
                    int i17 = k.r;
                    int i18 = k.s;
                    float f2 = k.g;
                    int i19 = k.a;
                    int i20 = k.b;
                    int i21 = k.c;
                    byte[] bArr5 = rk2.a;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i19), Integer.valueOf(i20), Integer.valueOf(i21));
                    i6 = i18;
                    f = f2;
                    i7 = i16;
                    i8 = i17;
                    i4 = k.i + 8;
                    i5 = i15;
                    i2 = i14;
                    i3 = k.h + 8;
                    i = i13;
                } else {
                    str = null;
                    i = -1;
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                    i5 = -1;
                    i6 = 16;
                    f = 1.0f;
                    i7 = -1;
                    i8 = -1;
                }
                return new mc0(arrayList, A, i, i2, i3, i4, i5, i7, i8, i6, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw hy7.a("Error parsing AVC config", e);
        }
    }
}
