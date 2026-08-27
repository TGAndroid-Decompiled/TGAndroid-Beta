package e5;

import d5.z;
import h3.t1;
import java.util.ArrayList;

public final class a {

    public final ArrayList f5222a;

    public final int f5223b;

    public final int f5224c;
    public final int d;

    public final float f5225e;

    public final String f5226f;

    public a(ArrayList arrayList, int i10, int i11, int i12, float f10, String str) {
        this.f5222a = arrayList;
        this.f5223b = i10;
        this.f5224c = i11;
        this.d = i12;
        this.f5225e = f10;
        this.f5226f = str;
    }

    public static a a(z zVar) throws t1 {
        String str;
        int i10;
        int i11;
        float f10;
        byte[] bArr = d5.a.f4763a;
        try {
            zVar.D(4);
            int iR = (zVar.r() & 3) + 1;
            if (iR == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iR2 = zVar.r() & 31;
            for (int i12 = 0; i12 < iR2; i12++) {
                int iW = zVar.w();
                int i13 = zVar.f4859b;
                zVar.D(iW);
                byte[] bArr2 = zVar.f4858a;
                byte[] bArr3 = new byte[iW + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i13, bArr3, 4, iW);
                arrayList.add(bArr3);
            }
            int iR3 = zVar.r();
            for (int i14 = 0; i14 < iR3; i14++) {
                int iW2 = zVar.w();
                int i15 = zVar.f4859b;
                zVar.D(iW2);
                byte[] bArr4 = zVar.f4858a;
                byte[] bArr5 = new byte[iW2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i15, bArr5, 4, iW2);
                arrayList.add(bArr5);
            }
            if (iR2 > 0) {
                d5.t tVarC = d5.a.C(iR, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i16 = tVarC.f4836e;
                int i17 = tVarC.f4837f;
                float f11 = tVarC.f4838g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(tVarC.f4833a), Integer.valueOf(tVarC.f4834b), Integer.valueOf(tVarC.f4835c));
                i10 = i16;
                i11 = i17;
                f10 = f11;
            } else {
                str = null;
                i10 = -1;
                i11 = -1;
                f10 = 1.0f;
            }
            return new a(arrayList, iR, i10, i11, f10, str);
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw t1.a("Error parsing AVC config", e9);
        }
    }
}
