package c3;

import b2.x0;
import java.util.ArrayList;
public final class d {
    public final ArrayList f6033a;
    public final int f6034b;
    public final int f6035c;
    public final int d;
    public final int e;
    public final int f6036f;
    public final int f6037g;
    public final int h;
    public final int f6038i;
    public final int f6039j;
    public final float f6040k;
    public final String f6041l;

    public d(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f7, String str) {
        this.f6033a = arrayList;
        this.f6034b = i10;
        this.f6035c = i11;
        this.d = i12;
        this.e = i13;
        this.f6036f = i14;
        this.f6037g = i15;
        this.h = i16;
        this.f6038i = i17;
        this.f6039j = i18;
        this.f6040k = f7;
        this.f6041l = str;
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
                    int i19 = xVar.f9733b;
                    xVar.O(H);
                    byte[] bArr = xVar.f9732a;
                    byte[] bArr2 = new byte[H + 4];
                    System.arraycopy(e2.g.f9661a, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i19, bArr2, 4, H);
                    arrayList.add(bArr2);
                }
                int A3 = xVar.A();
                for (int i20 = 0; i20 < A3; i20++) {
                    int H2 = xVar.H();
                    int i21 = xVar.f9733b;
                    xVar.O(H2);
                    byte[] bArr3 = xVar.f9732a;
                    byte[] bArr4 = new byte[H2 + 4];
                    System.arraycopy(e2.g.f9661a, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i21, bArr4, 4, H2);
                    arrayList.add(bArr4);
                }
                if (A2 > 0) {
                    f2.p m10 = f2.q.m(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                    int i22 = m10.e;
                    int i23 = m10.f10098f;
                    int i24 = m10.f10107p;
                    int i25 = m10.f10108q;
                    int i26 = m10.f10109r;
                    int i27 = m10.f10110s;
                    float f10 = m10.f10099g;
                    int i28 = m10.f10095a;
                    int i29 = m10.f10096b;
                    int i30 = m10.f10097c;
                    byte[] bArr5 = e2.g.f9661a;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i28), Integer.valueOf(i29), Integer.valueOf(i30));
                    i15 = i27;
                    f7 = f10;
                    i16 = i25;
                    i17 = i26;
                    i13 = m10.f10100i + 8;
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
