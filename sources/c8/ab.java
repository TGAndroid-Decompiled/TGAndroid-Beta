package c8;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
public abstract class ab {
    public static int[] f4482a;

    public static int a(ArrayList arrayList, ca.q qVar) {
        int size = arrayList.size();
        ArrayList arrayList2 = qVar.f5141a;
        int size2 = arrayList2.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj = arrayList2.get(i7);
            i7++;
            org.telegram.ui.Wallet.x3 x3Var = (org.telegram.ui.Wallet.x3) obj;
            ?? obj2 = new Object();
            obj2.f45248a = x3Var.f45248a;
            obj2.f45249b = x3Var.f45249b;
            obj2.f45250c = x3Var.f45250c;
            obj2.d = new int[x3Var.d.length];
            int i10 = 0;
            while (true) {
                int[] iArr = x3Var.d;
                if (i10 < iArr.length) {
                    obj2.d[i10] = iArr[i10] + size;
                    i10++;
                }
            }
            arrayList.add(obj2);
        }
        return qVar.f5142b + size;
    }

    public static ca.q b(byte[] bArr) {
        boolean z10;
        if (c(0, 4, bArr) == -1242653582) {
            int i7 = bArr[4];
            if ((i7 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = i7 & 7;
            int i11 = bArr[5] & 255;
            int c10 = c(6, i10, bArr);
            int i12 = 6 + i10;
            int c11 = c(i12, i10, bArr);
            int i13 = i12 + i10 + i10 + i11;
            if (c11 == 1) {
                int c12 = c(i13, i10, bArr);
                int i14 = i13 + i10;
                if (z10) {
                    i14 += i11 * c10;
                }
                ?? obj = new Object();
                obj.f5141a = new ArrayList();
                obj.f5142b = c12;
                for (int i15 = 0; i15 < c10; i15++) {
                    ?? obj2 = new Object();
                    int i16 = i14 + 1;
                    int i17 = bArr[i14];
                    obj2.f45248a = i17 & 255;
                    int i18 = i14 + 2;
                    int i19 = bArr[i16] & 255;
                    obj2.f45249b = i19;
                    if ((i17 & 16) == 0) {
                        int i20 = i17 & 7;
                        int i21 = (i19 + 1) / 2;
                        byte[] bArr2 = new byte[i21];
                        obj2.f45250c = bArr2;
                        System.arraycopy(bArr, i18, bArr2, 0, i21);
                        i14 = i18 + i21;
                        obj2.d = new int[i20];
                        for (int i22 = 0; i22 < i20; i22++) {
                            obj2.d[i22] = c(i14, i10, bArr);
                            i14 += i10;
                        }
                        obj.f5141a.add(obj2);
                    } else {
                        throw new IllegalArgumentException("Cells with cached hashes are not supported");
                    }
                }
                return obj;
            }
            throw new IllegalArgumentException("Expected one root cell");
        }
        throw new IllegalArgumentException("Unsupported BOC");
    }

    public static int c(int i7, int i10, byte[] bArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 << 8) | (bArr[i7 + i12] & 255);
        }
        return i11;
    }

    public static void d(ByteArrayOutputStream byteArrayOutputStream, int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            byteArrayOutputStream.write((i7 >>> (i11 * 8)) & 255);
        }
    }
}
