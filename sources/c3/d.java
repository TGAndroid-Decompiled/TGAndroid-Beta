package c3;

import b2.s0;
import java.util.ArrayList;
public final class d {
    public final ArrayList f3741a;
    public final int f3742b;
    public final int f3743c;
    public final int d;
    public final int e;
    public final int f3744f;
    public final int f3745g;
    public final int h;
    public final int f3746i;
    public final int f3747j;
    public final float f3748k;
    public final String f3749l;

    public d(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f7, String str) {
        this.f3741a = arrayList;
        this.f3742b = i10;
        this.f3743c = i11;
        this.d = i12;
        this.e = i13;
        this.f3744f = i14;
        this.f3745g = i15;
        this.h = i16;
        this.f3746i = i17;
        this.f3747j = i18;
        this.f3748k = f7;
        this.f3749l = str;
    }

    public static d a(e2.v vVar) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f7;
        try {
            vVar.K(4);
            int x10 = (vVar.x() & 3) + 1;
            if (x10 != 3) {
                ArrayList arrayList = new ArrayList();
                int x11 = vVar.x() & 31;
                for (int i18 = 0; i18 < x11; i18++) {
                    int D = vVar.D();
                    int i19 = vVar.f7934b;
                    vVar.K(D);
                    byte[] bArr = vVar.f7933a;
                    byte[] bArr2 = new byte[D + 4];
                    System.arraycopy(e2.e.f7896a, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i19, bArr2, 4, D);
                    arrayList.add(bArr2);
                }
                int x12 = vVar.x();
                for (int i20 = 0; i20 < x12; i20++) {
                    int D2 = vVar.D();
                    int i21 = vVar.f7934b;
                    vVar.K(D2);
                    byte[] bArr3 = vVar.f7933a;
                    byte[] bArr4 = new byte[D2 + 4];
                    System.arraycopy(e2.e.f7896a, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i21, bArr4, 4, D2);
                    arrayList.add(bArr4);
                }
                if (x11 > 0) {
                    f2.n j3 = f2.o.j(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                    int i22 = j3.e;
                    int i23 = j3.f8836f;
                    int i24 = j3.f8845p;
                    int i25 = j3.f8846q;
                    int i26 = j3.f8847r;
                    int i27 = j3.f8848s;
                    float f10 = j3.f8837g;
                    int i28 = j3.f8833a;
                    int i29 = j3.f8834b;
                    int i30 = j3.f8835c;
                    byte[] bArr5 = e2.e.f7896a;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i28), Integer.valueOf(i29), Integer.valueOf(i30));
                    i17 = i27;
                    f7 = f10;
                    i15 = i25;
                    i16 = i26;
                    i13 = j3.f8838i + 8;
                    i14 = i24;
                    i11 = i23;
                    i12 = j3.h + 8;
                    i10 = i22;
                } else {
                    str = null;
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = -1;
                    i15 = -1;
                    i16 = -1;
                    i17 = 16;
                    f7 = 1.0f;
                }
                return new d(arrayList, x10, i10, i11, i12, i13, i14, i15, i16, i17, f7, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw s0.a(e, "Error parsing AVC config");
        }
    }
}
