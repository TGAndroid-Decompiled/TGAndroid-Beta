package f3;

import e2.t0;
import java.util.ArrayList;
public final class d {
    public final ArrayList f11000a;
    public final int f11001b;
    public final int f11002c;
    public final int d;
    public final int f11003e;
    public final int f11004f;
    public final int f11005g;
    public final int h;
    public final int f11006i;
    public final int f11007j;
    public final float f11008k;
    public final String f11009l;

    public d(ArrayList arrayList, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.f11000a = arrayList;
        this.f11001b = i7;
        this.f11002c = i10;
        this.d = i11;
        this.f11003e = i12;
        this.f11004f = i13;
        this.f11005g = i14;
        this.h = i15;
        this.f11006i = i16;
        this.f11007j = i17;
        this.f11008k = f10;
        this.f11009l = str;
    }

    public static d a(h2.x xVar) {
        String str;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        try {
            xVar.O(4);
            int A = (xVar.A() & 3) + 1;
            if (A != 3) {
                ArrayList arrayList = new ArrayList();
                int A2 = xVar.A() & 31;
                for (int i17 = 0; i17 < A2; i17++) {
                    int H = xVar.H();
                    int i18 = xVar.f14163b;
                    xVar.O(H);
                    byte[] bArr = xVar.f14162a;
                    byte[] bArr2 = new byte[H + 4];
                    System.arraycopy(h2.g.f14085a, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i18, bArr2, 4, H);
                    arrayList.add(bArr2);
                }
                int A3 = xVar.A();
                for (int i19 = 0; i19 < A3; i19++) {
                    int H2 = xVar.H();
                    int i20 = xVar.f14163b;
                    xVar.O(H2);
                    byte[] bArr3 = xVar.f14162a;
                    byte[] bArr4 = new byte[H2 + 4];
                    System.arraycopy(h2.g.f14085a, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i20, bArr4, 4, H2);
                    arrayList.add(bArr4);
                }
                if (A2 > 0) {
                    i2.n m10 = i2.o.m(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                    int i21 = m10.f15188e;
                    int i22 = m10.f15189f;
                    int i23 = m10.f15198p;
                    int i24 = m10.f15199q;
                    int i25 = m10.f15200r;
                    int i26 = m10.f15201s;
                    float f11 = m10.f15190g;
                    int i27 = m10.f15185a;
                    int i28 = m10.f15186b;
                    int i29 = m10.f15187c;
                    byte[] bArr5 = h2.g.f14085a;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i27), Integer.valueOf(i28), Integer.valueOf(i29));
                    i14 = i26;
                    f10 = f11;
                    i15 = i24;
                    i16 = i25;
                    i12 = m10.f15191i + 8;
                    i13 = i23;
                    i10 = i22;
                    i11 = m10.h + 8;
                    i7 = i21;
                } else {
                    str = null;
                    i7 = -1;
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = 16;
                    f10 = 1.0f;
                    i15 = -1;
                    i16 = -1;
                }
                return new d(arrayList, A, i7, i10, i11, i12, i13, i15, i16, i14, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw t0.a(e10, "Error parsing AVC config");
        }
    }
}
