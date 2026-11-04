package e3;

import d2.v0;
import java.util.ArrayList;
public final class d {
    public final ArrayList f9439a;
    public final int f9440b;
    public final int f9441c;
    public final int d;
    public final int f9442e;
    public final int f9443f;
    public final int f9444g;
    public final int h;
    public final int f9445i;
    public final int f9446j;
    public final float f9447k;
    public final String f9448l;

    public d(ArrayList arrayList, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.f9439a = arrayList;
        this.f9440b = i3;
        this.f9441c = i10;
        this.d = i11;
        this.f9442e = i12;
        this.f9443f = i13;
        this.f9444g = i14;
        this.h = i15;
        this.f9445i = i16;
        this.f9446j = i17;
        this.f9447k = f10;
        this.f9448l = str;
    }

    public static d a(g2.y yVar) {
        String str;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        try {
            yVar.O(4);
            int A = (yVar.A() & 3) + 1;
            if (A != 3) {
                ArrayList arrayList = new ArrayList();
                int A2 = yVar.A() & 31;
                for (int i17 = 0; i17 < A2; i17++) {
                    int H = yVar.H();
                    int i18 = yVar.f11924b;
                    yVar.O(H);
                    byte[] bArr = yVar.f11923a;
                    byte[] bArr2 = new byte[H + 4];
                    System.arraycopy(g2.h.f11846a, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i18, bArr2, 4, H);
                    arrayList.add(bArr2);
                }
                int A3 = yVar.A();
                for (int i19 = 0; i19 < A3; i19++) {
                    int H2 = yVar.H();
                    int i20 = yVar.f11924b;
                    yVar.O(H2);
                    byte[] bArr3 = yVar.f11923a;
                    byte[] bArr4 = new byte[H2 + 4];
                    System.arraycopy(g2.h.f11846a, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i20, bArr4, 4, H2);
                    arrayList.add(bArr4);
                }
                if (A2 > 0) {
                    h2.n m10 = h2.o.m(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                    int i21 = m10.f14144e;
                    int i22 = m10.f14145f;
                    int i23 = m10.f14154p;
                    int i24 = m10.f14155q;
                    int i25 = m10.f14156r;
                    int i26 = m10.f14157s;
                    float f11 = m10.f14146g;
                    int i27 = m10.f14141a;
                    int i28 = m10.f14142b;
                    int i29 = m10.f14143c;
                    byte[] bArr5 = g2.h.f11846a;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i27), Integer.valueOf(i28), Integer.valueOf(i29));
                    i14 = i26;
                    f10 = f11;
                    i15 = i24;
                    i16 = i25;
                    i12 = m10.f14147i + 8;
                    i13 = i23;
                    i10 = i22;
                    i11 = m10.h + 8;
                    i3 = i21;
                } else {
                    str = null;
                    i3 = -1;
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = 16;
                    f10 = 1.0f;
                    i15 = -1;
                    i16 = -1;
                }
                return new d(arrayList, A, i3, i10, i11, i12, i13, i15, i16, i14, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw v0.a(e10, "Error parsing AVC config");
        }
    }
}
