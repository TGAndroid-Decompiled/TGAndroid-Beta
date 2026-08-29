package g5;

import j3.t1;
import java.util.ArrayList;
public final class a {
    public final ArrayList f7019a;
    public final int f7020b;
    public final int f7021c;
    public final int d;
    public final float f7022e;
    public final String f7023f;

    public a(ArrayList arrayList, int i10, int i11, int i12, float f9, String str) {
        this.f7019a = arrayList;
        this.f7020b = i10;
        this.f7021c = i11;
        this.d = i12;
        this.f7022e = f9;
        this.f7023f = str;
    }

    public static a a(f5.w wVar) {
        String str;
        int i10;
        int i11;
        float f9;
        byte[] bArr = f5.a.f6558a;
        try {
            wVar.D(4);
            int r6 = (wVar.r() & 3) + 1;
            if (r6 != 3) {
                ArrayList arrayList = new ArrayList();
                int r9 = wVar.r() & 31;
                for (int i12 = 0; i12 < r9; i12++) {
                    int w10 = wVar.w();
                    int i13 = wVar.f6641b;
                    wVar.D(w10);
                    byte[] bArr2 = wVar.f6640a;
                    byte[] bArr3 = new byte[w10 + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i13, bArr3, 4, w10);
                    arrayList.add(bArr3);
                }
                int r10 = wVar.r();
                for (int i14 = 0; i14 < r10; i14++) {
                    int w11 = wVar.w();
                    int i15 = wVar.f6641b;
                    wVar.D(w11);
                    byte[] bArr4 = wVar.f6640a;
                    byte[] bArr5 = new byte[w11 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i15, bArr5, 4, w11);
                    arrayList.add(bArr5);
                }
                if (r9 > 0) {
                    f5.r C = f5.a.C(r6, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                    int i16 = C.f6621e;
                    int i17 = C.f6622f;
                    float f10 = C.f6623g;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(C.f6618a), Integer.valueOf(C.f6619b), Integer.valueOf(C.f6620c));
                    i10 = i16;
                    i11 = i17;
                    f9 = f10;
                } else {
                    str = null;
                    i10 = -1;
                    i11 = -1;
                    f9 = 1.0f;
                }
                return new a(arrayList, r6, i10, i11, f9, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw t1.a("Error parsing AVC config", e10);
        }
    }
}
