package c3;

import b2.w0;
import java.util.ArrayList;
public final class d {
    public final ArrayList f4600a;
    public final int f4601b;
    public final int f4602c;
    public final int d;
    public final int e;
    public final int f4603f;
    public final int f4604g;
    public final int h;
    public final int f4605i;
    public final int f4606j;
    public final float f4607k;
    public final String f4608l;

    public d(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f7, String str) {
        this.f4600a = arrayList;
        this.f4601b = i10;
        this.f4602c = i11;
        this.d = i12;
        this.e = i13;
        this.f4603f = i14;
        this.f4604g = i15;
        this.h = i16;
        this.f4605i = i17;
        this.f4606j = i18;
        this.f4607k = f7;
        this.f4608l = str;
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
                    int i19 = xVar.f8299b;
                    xVar.O(H);
                    byte[] bArr = xVar.f8298a;
                    byte[] bArr2 = new byte[H + 4];
                    System.arraycopy(e2.g.f8233a, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i19, bArr2, 4, H);
                    arrayList.add(bArr2);
                }
                int A3 = xVar.A();
                for (int i20 = 0; i20 < A3; i20++) {
                    int H2 = xVar.H();
                    int i21 = xVar.f8299b;
                    xVar.O(H2);
                    byte[] bArr3 = xVar.f8298a;
                    byte[] bArr4 = new byte[H2 + 4];
                    System.arraycopy(e2.g.f8233a, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i21, bArr4, 4, H2);
                    arrayList.add(bArr4);
                }
                if (A2 > 0) {
                    f2.p m10 = f2.q.m(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                    int i22 = m10.e;
                    int i23 = m10.f10339f;
                    int i24 = m10.f10348p;
                    int i25 = m10.f10349q;
                    int i26 = m10.f10350r;
                    int i27 = m10.f10351s;
                    float f10 = m10.f10340g;
                    int i28 = m10.f10336a;
                    int i29 = m10.f10337b;
                    int i30 = m10.f10338c;
                    byte[] bArr5 = e2.g.f8233a;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i28), Integer.valueOf(i29), Integer.valueOf(i30));
                    i15 = i27;
                    f7 = f10;
                    i16 = i25;
                    i17 = i26;
                    i13 = m10.f10341i + 8;
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
            throw w0.a(e, "Error parsing AVC config");
        }
    }
}
