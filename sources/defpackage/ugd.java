package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
public abstract class ugd {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static byte[] a(ze3[] ze3VarArr, byte[] bArr) {
        int i = 0;
        for (ze3 ze3Var : ze3VarArr) {
            i += ((((ze3Var.g << 1) + 7) & (-8)) / 8) + b(bArr, ze3Var.a, ze3Var.b).getBytes(StandardCharsets.UTF_8).length + 16 + (ze3Var.e << 1) + ze3Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        if (Arrays.equals(bArr, bhd.c)) {
            for (ze3 ze3Var2 : ze3VarArr) {
                j(byteArrayOutputStream, ze3Var2, b(bArr, ze3Var2.a, ze3Var2.b));
                l(byteArrayOutputStream, ze3Var2);
                int[] iArr = ze3Var2.h;
                int length = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = iArr[i2];
                    bke.f(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                k(byteArrayOutputStream, ze3Var2);
            }
        } else {
            for (ze3 ze3Var3 : ze3VarArr) {
                j(byteArrayOutputStream, ze3Var3, b(bArr, ze3Var3.a, ze3Var3.b));
            }
            for (ze3 ze3Var4 : ze3VarArr) {
                l(byteArrayOutputStream, ze3Var4);
                int[] iArr2 = ze3Var4.h;
                int length2 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = iArr2[i5];
                    bke.f(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                k(byteArrayOutputStream, ze3Var4);
            }
        }
        if (byteArrayOutputStream.size() == i) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i);
    }

    public static String b(byte[] bArr, String str, String str2) {
        Object obj;
        byte[] bArr2 = bhd.e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = bhd.d;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    return c00.k(new StringBuilder(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : ":", str2);
                }
            } else if ("!".equals(obj)) {
                return str2.replace(":", "!");
            } else {
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) bke.d(2, byteArrayInputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static ze3[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, ze3[] ze3VarArr) {
        byte[] bArr3 = bhd.f;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bhd.a, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int d = (int) bke.d(1, fileInputStream);
                    byte[] c = bke.c(fileInputStream, (int) bke.d(4, fileInputStream), (int) bke.d(4, fileInputStream));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
                        try {
                            ze3[] e = e(byteArrayInputStream, d, ze3VarArr);
                            byteArrayInputStream.close();
                            return e;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    grb.i("Content found after the end of file");
                    return null;
                }
                grb.i("Unsupported meta version");
                return null;
            }
            grb.i("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        } else if (Arrays.equals(bArr, bhd.g)) {
            int d2 = (int) bke.d(2, fileInputStream);
            byte[] c2 = bke.c(fileInputStream, (int) bke.d(4, fileInputStream), (int) bke.d(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(c2);
                try {
                    ze3[] f = f(byteArrayInputStream2, bArr2, d2, ze3VarArr);
                    byteArrayInputStream2.close();
                    return f;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            grb.i("Content found after the end of file");
            return null;
        } else {
            grb.i("Unsupported meta version");
            return null;
        }
    }

    public static ze3[] e(ByteArrayInputStream byteArrayInputStream, int i, ze3[] ze3VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new ze3[0];
        }
        if (i == ze3VarArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = (int) bke.d(2, byteArrayInputStream);
                strArr[i2] = new String(bke.b((int) bke.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            }
            for (int i3 = 0; i3 < i; i3++) {
                ze3 ze3Var = ze3VarArr[i3];
                if (ze3Var.b.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    ze3Var.e = i4;
                    ze3Var.h = c(byteArrayInputStream, i4);
                } else {
                    grb.i("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return ze3VarArr;
        }
        grb.i("Mismatched number of dex files found in metadata");
        return null;
    }

    public static ze3[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, ze3[] ze3VarArr) {
        ze3 ze3Var;
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new ze3[0];
        }
        if (i == ze3VarArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                bke.d(2, byteArrayInputStream);
                String str2 = new String(bke.b((int) bke.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
                long d = bke.d(4, byteArrayInputStream);
                int d2 = (int) bke.d(2, byteArrayInputStream);
                if (ze3VarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i3 = 0; i3 < ze3VarArr.length; i3++) {
                        if (ze3VarArr[i3].b.equals(str)) {
                            ze3Var = ze3VarArr[i3];
                            break;
                        }
                    }
                }
                ze3Var = null;
                if (ze3Var != null) {
                    ze3Var.d = d;
                    int[] c = c(byteArrayInputStream, d2);
                    if (Arrays.equals(bArr, bhd.e)) {
                        ze3Var.e = d2;
                        ze3Var.h = c;
                    }
                } else {
                    grb.i("Missing profile key: ".concat(str2));
                    return null;
                }
            }
            return ze3VarArr;
        }
        grb.i("Mismatched number of dex files found in metadata");
        return null;
    }

    public static ze3[] g(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, bhd.b)) {
            int d = (int) bke.d(1, fileInputStream);
            byte[] c = bke.c(fileInputStream, (int) bke.d(4, fileInputStream), (int) bke.d(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
                try {
                    ze3[] h = h(byteArrayInputStream, str, d);
                    byteArrayInputStream.close();
                    return h;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            grb.i("Content found after the end of file");
            return null;
        }
        grb.i("Unsupported version");
        return null;
    }

    public static ze3[] h(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2;
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new ze3[0];
        }
        ze3[] ze3VarArr = new ze3[i];
        for (int i4 = 0; i4 < i; i4++) {
            int d = (int) bke.d(2, byteArrayInputStream);
            ze3VarArr[i4] = new ze3(str, new String(bke.b((int) bke.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8), bke.d(4, byteArrayInputStream), d, (int) bke.d(4, byteArrayInputStream), (int) bke.d(4, byteArrayInputStream), new int[d], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i) {
            ze3 ze3Var = ze3VarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = ze3Var.f;
            int i7 = ze3Var.g;
            TreeMap treeMap = ze3Var.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) bke.d(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(i9), 1);
                int d2 = (int) bke.d(2, byteArrayInputStream);
                while (d2 > 0) {
                    bke.d(2, byteArrayInputStream);
                    int d3 = (int) bke.d(1, byteArrayInputStream);
                    if (d3 != 6 && d3 != 7) {
                        while (d3 > 0) {
                            bke.d(1, byteArrayInputStream);
                            int i10 = i3;
                            int i11 = i5;
                            for (int d4 = (int) bke.d(1, byteArrayInputStream); d4 > 0; d4--) {
                                bke.d(2, byteArrayInputStream);
                            }
                            d3--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    d2--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() == i8) {
                ze3Var.h = c(byteArrayInputStream, ze3Var.e);
                BitSet valueOf = BitSet.valueOf(bke.b((((i7 << 1) + 7) & (-8)) / 8, byteArrayInputStream));
                for (int i14 = i12; i14 < i7; i14++) {
                    if (valueOf.get(i14)) {
                        i2 = 2;
                    } else {
                        i2 = i12;
                    }
                    if (valueOf.get(i14 + i7)) {
                        i2 |= 4;
                    }
                    if (i2 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                        if (num == null) {
                            num = Integer.valueOf(i12);
                        }
                        treeMap.put(Integer.valueOf(i14), Integer.valueOf(num.intValue() | i2));
                    }
                }
                i5 = i13 + 1;
                i3 = i12;
            } else {
                grb.i("Read too much data during profile line parse");
                return null;
            }
        }
        return ze3VarArr;
    }

    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, ze3[] ze3VarArr) {
        int i;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = bhd.a;
        int i2 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                bke.f(byteArrayOutputStream2, ze3VarArr.length);
                int i3 = 2;
                for (ze3 ze3Var : ze3VarArr) {
                    bke.e(byteArrayOutputStream2, ze3Var.c, 4);
                    bke.e(byteArrayOutputStream2, ze3Var.d, 4);
                    bke.e(byteArrayOutputStream2, ze3Var.g, 4);
                    String b2 = b(bArr2, ze3Var.a, ze3Var.b);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = b2.getBytes(charset).length;
                    bke.f(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(b2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 == byteArray.length) {
                    j3d j3dVar = new j3d(1, false, byteArray);
                    byteArrayOutputStream2.close();
                    arrayList2.add(j3dVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < ze3VarArr.length) {
                        try {
                            ze3 ze3Var2 = ze3VarArr[i4];
                            bke.f(byteArrayOutputStream3, i4);
                            bke.f(byteArrayOutputStream3, ze3Var2.e);
                            i5 = i5 + 4 + (ze3Var2.e << 1);
                            int[] iArr = ze3Var2.h;
                            int length3 = iArr.length;
                            int i6 = i2;
                            while (i2 < length3) {
                                int i7 = iArr[i2];
                                bke.f(byteArrayOutputStream3, i7 - i6);
                                i2++;
                                i6 = i7;
                            }
                            i4++;
                            i2 = 0;
                        } finally {
                        }
                    }
                    int i8 = 2;
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i5 == byteArray2.length) {
                        j3d j3dVar2 = new j3d(3, true, byteArray2);
                        byteArrayOutputStream3.close();
                        arrayList2.add(j3dVar2);
                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < ze3VarArr.length) {
                            try {
                                ze3 ze3Var3 = ze3VarArr[i9];
                                int i11 = 0;
                                for (Map.Entry entry : ze3Var3.i.entrySet()) {
                                    i11 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                k(byteArrayOutputStream4, ze3Var3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                l(byteArrayOutputStream5, ze3Var3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                bke.f(byteArrayOutputStream2, i9);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i12 = i10 + 6;
                                ArrayList arrayList4 = arrayList3;
                                bke.e(byteArrayOutputStream2, length4, 4);
                                bke.f(byteArrayOutputStream2, i11);
                                byteArrayOutputStream2.write(byteArray3);
                                byteArrayOutputStream2.write(byteArray4);
                                i10 = i12 + length4;
                                i9++;
                                arrayList3 = arrayList4;
                            } finally {
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream2.toByteArray();
                        if (i10 == byteArray5.length) {
                            j3d j3dVar3 = new j3d(4, true, byteArray5);
                            byteArrayOutputStream2.close();
                            arrayList2.add(j3dVar3);
                            long size = 12 + (arrayList2.size() << 4);
                            bke.e(byteArrayOutputStream, arrayList2.size(), 4);
                            int i13 = 0;
                            while (i13 < arrayList2.size()) {
                                j3d j3dVar4 = (j3d) arrayList2.get(i13);
                                int i14 = j3dVar4.a;
                                byte[] bArr3 = j3dVar4.b;
                                if (i14 != 1) {
                                    if (i14 != i8) {
                                        if (i14 != 3) {
                                            if (i14 != 4) {
                                                if (i14 == 5) {
                                                    i = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                i = 3;
                                            }
                                        } else {
                                            i = 2;
                                        }
                                    } else {
                                        i = 1;
                                    }
                                } else {
                                    i = 0;
                                }
                                bke.e(byteArrayOutputStream, i, 4);
                                bke.e(byteArrayOutputStream, size, 4);
                                if (j3dVar4.c) {
                                    long length5 = bArr3.length;
                                    byte[] a2 = bke.a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a2);
                                    bke.e(byteArrayOutputStream, a2.length, 4);
                                    bke.e(byteArrayOutputStream, length5, 4);
                                    length = a2.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    bke.e(byteArrayOutputStream, bArr3.length, 4);
                                    bke.e(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i13++;
                                arrayList5 = arrayList;
                                i8 = 2;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i15));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            } finally {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        byte[] bArr4 = bhd.b;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] a3 = a(ze3VarArr, bArr4);
            bke.e(byteArrayOutputStream, ze3VarArr.length, 1);
            bke.e(byteArrayOutputStream, a3.length, 4);
            byte[] a4 = bke.a(a3);
            bke.e(byteArrayOutputStream, a4.length, 4);
            byteArrayOutputStream.write(a4);
            return true;
        }
        byte[] bArr5 = bhd.d;
        if (Arrays.equals(bArr, bArr5)) {
            bke.e(byteArrayOutputStream, ze3VarArr.length, 1);
            for (ze3 ze3Var4 : ze3VarArr) {
                String b3 = b(bArr5, ze3Var4.a, ze3Var4.b);
                Charset charset2 = StandardCharsets.UTF_8;
                bke.f(byteArrayOutputStream, b3.getBytes(charset2).length);
                bke.f(byteArrayOutputStream, ze3Var4.h.length);
                bke.e(byteArrayOutputStream, ze3Var4.i.size() << 2, 4);
                bke.e(byteArrayOutputStream, ze3Var4.c, 4);
                byteArrayOutputStream.write(b3.getBytes(charset2));
                for (Integer num : ze3Var4.i.keySet()) {
                    bke.f(byteArrayOutputStream, num.intValue());
                    bke.f(byteArrayOutputStream, 0);
                }
                for (int i16 : ze3Var4.h) {
                    bke.f(byteArrayOutputStream, i16);
                }
            }
            return true;
        }
        byte[] bArr6 = bhd.c;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] a5 = a(ze3VarArr, bArr6);
            bke.e(byteArrayOutputStream, ze3VarArr.length, 1);
            bke.e(byteArrayOutputStream, a5.length, 4);
            byte[] a6 = bke.a(a5);
            bke.e(byteArrayOutputStream, a6.length, 4);
            byteArrayOutputStream.write(a6);
            return true;
        }
        byte[] bArr7 = bhd.e;
        if (Arrays.equals(bArr, bArr7)) {
            bke.f(byteArrayOutputStream, ze3VarArr.length);
            for (ze3 ze3Var5 : ze3VarArr) {
                String str = ze3Var5.a;
                TreeMap treeMap = ze3Var5.i;
                String b4 = b(bArr7, str, ze3Var5.b);
                Charset charset3 = StandardCharsets.UTF_8;
                bke.f(byteArrayOutputStream, b4.getBytes(charset3).length);
                bke.f(byteArrayOutputStream, treeMap.size());
                bke.f(byteArrayOutputStream, ze3Var5.h.length);
                bke.e(byteArrayOutputStream, ze3Var5.c, 4);
                byteArrayOutputStream.write(b4.getBytes(charset3));
                for (Integer num2 : treeMap.keySet()) {
                    bke.f(byteArrayOutputStream, num2.intValue());
                }
                for (int i17 : ze3Var5.h) {
                    bke.f(byteArrayOutputStream, i17);
                }
            }
            return true;
        }
        return false;
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, ze3 ze3Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        bke.f(byteArrayOutputStream, str.getBytes(charset).length);
        bke.f(byteArrayOutputStream, ze3Var.e);
        bke.e(byteArrayOutputStream, ze3Var.f, 4);
        bke.e(byteArrayOutputStream, ze3Var.c, 4);
        bke.e(byteArrayOutputStream, ze3Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, ze3 ze3Var) {
        byte[] bArr = new byte[(((ze3Var.g << 1) + 7) & (-8)) / 8];
        for (Map.Entry entry : ze3Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i = intValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i2 = intValue + ze3Var.g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (i2 % 8)));
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, ze3 ze3Var) {
        int i = 0;
        for (Map.Entry entry : ze3Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                bke.f(byteArrayOutputStream, intValue - i);
                bke.f(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }
}
