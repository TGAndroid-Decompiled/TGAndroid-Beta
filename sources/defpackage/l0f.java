package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
public abstract class l0f {
    public static int[] a;

    public static int a(ArrayList arrayList, ed edVar) {
        int size = arrayList.size();
        ArrayList arrayList2 = (ArrayList) edVar.c;
        int size2 = arrayList2.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            twb twbVar = (twb) obj;
            ?? obj2 = new Object();
            obj2.a = twbVar.a;
            obj2.b = twbVar.b;
            obj2.c = twbVar.c;
            obj2.d = new int[twbVar.d.length];
            int i2 = 0;
            while (true) {
                int[] iArr = twbVar.d;
                if (i2 < iArr.length) {
                    obj2.d[i2] = iArr[i2] + size;
                    i2++;
                }
            }
            arrayList.add(obj2);
        }
        return edVar.b + size;
    }

    public static ed b(byte[] bArr) {
        boolean z;
        if (c(0, 4, bArr) == -1242653582) {
            int i = bArr[4];
            if ((i & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = i & 7;
            int i3 = bArr[5] & 255;
            int c = c(6, i2, bArr);
            int i4 = 6 + i2;
            int c2 = c(i4, i2, bArr);
            int i5 = i4 + i2 + i2 + i3;
            if (c2 == 1) {
                int c3 = c(i5, i2, bArr);
                int i6 = i5 + i2;
                if (z) {
                    i6 += i3 * c;
                }
                ed edVar = new ed((byte) 19, false);
                edVar.c = new ArrayList();
                edVar.b = c3;
                for (int i7 = 0; i7 < c; i7++) {
                    ?? obj = new Object();
                    int i8 = i6 + 1;
                    int i9 = bArr[i6];
                    obj.a = i9 & 255;
                    int i10 = i6 + 2;
                    int i11 = bArr[i8] & 255;
                    obj.b = i11;
                    if ((i9 & 16) == 0) {
                        int i12 = i9 & 7;
                        int i13 = (i11 + 1) / 2;
                        byte[] bArr2 = new byte[i13];
                        obj.c = bArr2;
                        System.arraycopy(bArr, i10, bArr2, 0, i13);
                        i6 = i10 + i13;
                        obj.d = new int[i12];
                        for (int i14 = 0; i14 < i12; i14++) {
                            obj.d[i14] = c(i6, i2, bArr);
                            i6 += i2;
                        }
                        ((ArrayList) edVar.c).add(obj);
                    } else {
                        lq5.j("Cells with cached hashes are not supported");
                        return null;
                    }
                }
                return edVar;
            }
            lq5.j("Expected one root cell");
            return null;
        }
        lq5.j("Unsupported BOC");
        return null;
    }

    public static int c(int i, int i2, byte[] bArr) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 << 8) | (bArr[i + i4] & 255);
        }
        return i3;
    }

    public static void d(ByteArrayOutputStream byteArrayOutputStream, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            byteArrayOutputStream.write((i >>> (i3 << 3)) & 255);
        }
    }
}
