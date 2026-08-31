package i5;

import j3.r1;
import java.util.ArrayList;
public final class a {
    public final ArrayList f7797a;
    public final int f7798b;
    public final int f7799c;
    public final int d;
    public final int f7800e;
    public final int f7801f;
    public final int f7802g;
    public final float h;
    public final String f7803i;

    public a(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, float f10, String str) {
        this.f7797a = arrayList;
        this.f7798b = i10;
        this.f7799c = i11;
        this.d = i12;
        this.f7800e = i13;
        this.f7801f = i14;
        this.f7802g = i15;
        this.h = f10;
        this.f7803i = str;
    }

    public static a a(h5.w wVar) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        byte[] bArr = h5.a.f7216a;
        try {
            wVar.G(4);
            int u10 = (wVar.u() & 3) + 1;
            if (u10 != 3) {
                ArrayList arrayList = new ArrayList();
                int u11 = wVar.u() & 31;
                for (int i15 = 0; i15 < u11; i15++) {
                    int z4 = wVar.z();
                    int i16 = wVar.f7309b;
                    wVar.G(z4);
                    byte[] bArr2 = wVar.f7308a;
                    byte[] bArr3 = new byte[z4 + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i16, bArr3, 4, z4);
                    arrayList.add(bArr3);
                }
                int u12 = wVar.u();
                for (int i17 = 0; i17 < u12; i17++) {
                    int z10 = wVar.z();
                    int i18 = wVar.f7309b;
                    wVar.G(z10);
                    byte[] bArr4 = wVar.f7308a;
                    byte[] bArr5 = new byte[z10 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i18, bArr5, 4, z10);
                    arrayList.add(bArr5);
                }
                if (u11 > 0) {
                    h5.r C = h5.a.C(u10, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                    int i19 = C.f7286e;
                    int i20 = C.f7287f;
                    int i21 = C.f7294n;
                    int i22 = C.f7295o;
                    int i23 = C.f7296p;
                    float f11 = C.f7288g;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(C.f7283a), Integer.valueOf(C.f7284b), Integer.valueOf(C.f7285c));
                    i13 = i22;
                    i14 = i23;
                    f10 = f11;
                    i10 = i19;
                    i11 = i20;
                    i12 = i21;
                } else {
                    str = null;
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = -1;
                    f10 = 1.0f;
                }
                return new a(arrayList, u10, i10, i11, i12, i13, i14, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw r1.a("Error parsing AVC config", e6);
        }
    }
}
