package c3;

import b2.s0;
import java.util.ArrayList;
public final class d {
    public final ArrayList f4085a;
    public final int f4086b;
    public final int f4087c;
    public final int d;
    public final int f4088e;
    public final int f4089f;
    public final int f4090g;
    public final int h;
    public final int f4091i;
    public final int f4092j;
    public final float f4093k;
    public final String f4094l;

    public d(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f7, String str) {
        this.f4085a = arrayList;
        this.f4086b = i10;
        this.f4087c = i11;
        this.d = i12;
        this.f4088e = i13;
        this.f4089f = i14;
        this.f4090g = i15;
        this.h = i16;
        this.f4091i = i17;
        this.f4092j = i18;
        this.f4093k = f7;
        this.f4094l = str;
    }

    public static d a(e2.v vVar) {
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
            vVar.K(4);
            int x10 = (vVar.x() & 3) + 1;
            if (x10 != 3) {
                ArrayList arrayList = new ArrayList();
                int x11 = vVar.x() & 31;
                for (int i18 = 0; i18 < x11; i18++) {
                    int D = vVar.D();
                    int i19 = vVar.f8582b;
                    vVar.K(D);
                    byte[] bArr = vVar.f8581a;
                    byte[] bArr2 = new byte[D + 4];
                    System.arraycopy(e2.e.f8539a, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i19, bArr2, 4, D);
                    arrayList.add(bArr2);
                }
                int x12 = vVar.x();
                for (int i20 = 0; i20 < x12; i20++) {
                    int D2 = vVar.D();
                    int i21 = vVar.f8582b;
                    vVar.K(D2);
                    byte[] bArr3 = vVar.f8581a;
                    byte[] bArr4 = new byte[D2 + 4];
                    System.arraycopy(e2.e.f8539a, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i21, bArr4, 4, D2);
                    arrayList.add(bArr4);
                }
                if (x11 > 0) {
                    f2.o j3 = f2.p.j(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                    int i22 = j3.f9600e;
                    int i23 = j3.f9601f;
                    int i24 = j3.f9610p;
                    int i25 = j3.f9611q;
                    int i26 = j3.f9612r;
                    int i27 = j3.f9613s;
                    float f10 = j3.f9602g;
                    int i28 = j3.f9597a;
                    int i29 = j3.f9598b;
                    int i30 = j3.f9599c;
                    byte[] bArr5 = e2.e.f8539a;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i28), Integer.valueOf(i29), Integer.valueOf(i30));
                    i15 = i27;
                    f7 = f10;
                    i16 = i25;
                    i17 = i26;
                    i13 = j3.f9603i + 8;
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
                    i15 = 16;
                    f7 = 1.0f;
                    i16 = -1;
                    i17 = -1;
                }
                return new d(arrayList, x10, i10, i11, i12, i13, i14, i16, i17, i15, f7, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw s0.a(e7, "Error parsing AVC config");
        }
    }
}
