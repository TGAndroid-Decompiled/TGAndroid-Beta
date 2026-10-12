package c3;

import b2.x0;
import java.util.ArrayList;
public final class d {
    public final ArrayList f4221a;
    public final int f4222b;
    public final int f4223c;
    public final int d;
    public final int e;
    public final int f4224f;
    public final int f4225g;
    public final int h;
    public final int f4226i;
    public final int f4227j;
    public final float f4228k;
    public final String f4229l;

    public d(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f7, String str) {
        this.f4221a = arrayList;
        this.f4222b = i10;
        this.f4223c = i11;
        this.d = i12;
        this.e = i13;
        this.f4224f = i14;
        this.f4225g = i15;
        this.h = i16;
        this.f4226i = i17;
        this.f4227j = i18;
        this.f4228k = f7;
        this.f4229l = str;
    }

    public static d a(e2.x xVar) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        int i16;
        int i17;
        try {
            xVar.O(4);
            int A = (xVar.A() & 3) + 1;
            if (A != 3) {
                ArrayList arrayList = new ArrayList();
                int A2 = xVar.A() & 31;
                for (int i18 = 0; i18 < A2; i18++) {
                    int H = xVar.H();
                    int i19 = xVar.f8412b;
                    xVar.O(H);
                    byte[] bArr = xVar.f8411a;
                    byte[] bArr2 = new byte[H + 4];
                    System.arraycopy(e2.g.f8346a, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i19, bArr2, 4, H);
                    arrayList.add(bArr2);
                }
                int A3 = xVar.A();
                for (int i20 = 0; i20 < A3; i20++) {
                    int H2 = xVar.H();
                    int i21 = xVar.f8412b;
                    xVar.O(H2);
                    byte[] bArr3 = xVar.f8411a;
                    byte[] bArr4 = new byte[H2 + 4];
                    System.arraycopy(e2.g.f8346a, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i21, bArr4, 4, H2);
                    arrayList.add(bArr4);
                }
                if (A2 > 0) {
                    f2.o m10 = f2.p.m(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                    int i22 = m10.e;
                    int i23 = m10.f8876f;
                    int i24 = m10.f8885p;
                    int i25 = m10.f8886q;
                    int i26 = m10.f8887r;
                    int i27 = m10.f8888s;
                    float f10 = m10.f8877g;
                    int i28 = m10.f8873a;
                    int i29 = m10.f8874b;
                    int i30 = m10.f8875c;
                    byte[] bArr5 = e2.g.f8346a;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i28), Integer.valueOf(i29), Integer.valueOf(i30));
                    i15 = i27;
                    f7 = f10;
                    i16 = i25;
                    i17 = i26;
                    i13 = m10.f8878i + 8;
                    i14 = i24;
                    i11 = i23;
                    i12 = m10.h + 8;
                    i10 = i22;
                } else {
                    str = null;
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = -1;
                    i15 = 16;
                    f7 = 1.0f;
                    i16 = -1;
                    i17 = -1;
                }
                return new d(arrayList, A, i10, i11, i12, i13, i14, i16, i17, i15, f7, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw x0.a(e, "Error parsing AVC config");
        }
    }
}
