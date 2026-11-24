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
public abstract class bcd {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static byte[] a(fe3[] fe3VarArr, byte[] bArr) {
        int i = 0;
        for (fe3 fe3Var : fe3VarArr) {
            i += ((((fe3Var.g << 1) + 7) & (-8)) / 8) + b(bArr, fe3Var.a, fe3Var.b).getBytes(StandardCharsets.UTF_8).length + 16 + (fe3Var.e << 1) + fe3Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        if (Arrays.equals(bArr, icd.c)) {
            for (fe3 fe3Var2 : fe3VarArr) {
                j(byteArrayOutputStream, fe3Var2, b(bArr, fe3Var2.a, fe3Var2.b));
                l(byteArrayOutputStream, fe3Var2);
                int[] iArr = fe3Var2.h;
                int length = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = iArr[i2];
                    kfe.f(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                k(byteArrayOutputStream, fe3Var2);
            }
        } else {
            for (fe3 fe3Var3 : fe3VarArr) {
                j(byteArrayOutputStream, fe3Var3, b(bArr, fe3Var3.a, fe3Var3.b));
            }
            for (fe3 fe3Var4 : fe3VarArr) {
                l(byteArrayOutputStream, fe3Var4);
                int[] iArr2 = fe3Var4.h;
                int length2 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = iArr2[i5];
                    kfe.f(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                k(byteArrayOutputStream, fe3Var4);
            }
        }
        if (byteArrayOutputStream.size() == i) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i);
    }

    public static String b(byte[] bArr, String str, String str2) {
        Object obj;
        byte[] bArr2 = icd.e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = icd.d;
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
                    return b00.j(new StringBuilder(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : ":", str2);
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
            i2 += (int) kfe.d(2, byteArrayInputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static fe3[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, fe3[] fe3VarArr) {
        byte[] bArr3 = icd.f;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(icd.a, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int d = (int) kfe.d(1, fileInputStream);
                    byte[] c = kfe.c(fileInputStream, (int) kfe.d(4, fileInputStream), (int) kfe.d(4, fileInputStream));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
                        try {
                            fe3[] e = e(byteArrayInputStream, d, fe3VarArr);
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
                    sc8.j("Content found after the end of file");
                    return null;
                }
                sc8.j("Unsupported meta version");
                return null;
            }
            sc8.j("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        } else if (Arrays.equals(bArr, icd.g)) {
            int d2 = (int) kfe.d(2, fileInputStream);
            byte[] c2 = kfe.c(fileInputStream, (int) kfe.d(4, fileInputStream), (int) kfe.d(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(c2);
                try {
                    fe3[] f = f(byteArrayInputStream2, bArr2, d2, fe3VarArr);
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
            sc8.j("Content found after the end of file");
            return null;
        } else {
            sc8.j("Unsupported meta version");
            return null;
        }
    }

    public static fe3[] e(ByteArrayInputStream byteArrayInputStream, int i, fe3[] fe3VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new fe3[0];
        }
        if (i == fe3VarArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = (int) kfe.d(2, byteArrayInputStream);
                strArr[i2] = new String(kfe.b((int) kfe.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            }
            for (int i3 = 0; i3 < i; i3++) {
                fe3 fe3Var = fe3VarArr[i3];
                if (fe3Var.b.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    fe3Var.e = i4;
                    fe3Var.h = c(byteArrayInputStream, i4);
                } else {
                    sc8.j("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return fe3VarArr;
        }
        sc8.j("Mismatched number of dex files found in metadata");
        return null;
    }

    public static fe3[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, fe3[] fe3VarArr) {
        fe3 fe3Var;
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new fe3[0];
        }
        if (i == fe3VarArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                kfe.d(2, byteArrayInputStream);
                String str2 = new String(kfe.b((int) kfe.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
                long d = kfe.d(4, byteArrayInputStream);
                int d2 = (int) kfe.d(2, byteArrayInputStream);
                if (fe3VarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i3 = 0; i3 < fe3VarArr.length; i3++) {
                        if (fe3VarArr[i3].b.equals(str)) {
                            fe3Var = fe3VarArr[i3];
                            break;
                        }
                    }
                }
                fe3Var = null;
                if (fe3Var != null) {
                    fe3Var.d = d;
                    int[] c = c(byteArrayInputStream, d2);
                    if (Arrays.equals(bArr, icd.e)) {
                        fe3Var.e = d2;
                        fe3Var.h = c;
                    }
                } else {
                    sc8.j("Missing profile key: ".concat(str2));
                    return null;
                }
            }
            return fe3VarArr;
        }
        sc8.j("Mismatched number of dex files found in metadata");
        return null;
    }

    public static fe3[] g(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, icd.b)) {
            int d = (int) kfe.d(1, fileInputStream);
            byte[] c = kfe.c(fileInputStream, (int) kfe.d(4, fileInputStream), (int) kfe.d(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
                try {
                    fe3[] h = h(byteArrayInputStream, str, d);
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
            sc8.j("Content found after the end of file");
            return null;
        }
        sc8.j("Unsupported version");
        return null;
    }

    public static fe3[] h(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2;
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new fe3[0];
        }
        fe3[] fe3VarArr = new fe3[i];
        for (int i4 = 0; i4 < i; i4++) {
            int d = (int) kfe.d(2, byteArrayInputStream);
            fe3VarArr[i4] = new fe3(str, new String(kfe.b((int) kfe.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8), kfe.d(4, byteArrayInputStream), d, (int) kfe.d(4, byteArrayInputStream), (int) kfe.d(4, byteArrayInputStream), new int[d], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i) {
            fe3 fe3Var = fe3VarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = fe3Var.f;
            int i7 = fe3Var.g;
            TreeMap treeMap = fe3Var.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) kfe.d(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(i9), 1);
                int d2 = (int) kfe.d(2, byteArrayInputStream);
                while (d2 > 0) {
                    kfe.d(2, byteArrayInputStream);
                    int d3 = (int) kfe.d(1, byteArrayInputStream);
                    if (d3 != 6 && d3 != 7) {
                        while (d3 > 0) {
                            kfe.d(1, byteArrayInputStream);
                            int i10 = i3;
                            int i11 = i5;
                            for (int d4 = (int) kfe.d(1, byteArrayInputStream); d4 > 0; d4--) {
                                kfe.d(2, byteArrayInputStream);
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
                fe3Var.h = c(byteArrayInputStream, fe3Var.e);
                BitSet valueOf = BitSet.valueOf(kfe.b((((i7 << 1) + 7) & (-8)) / 8, byteArrayInputStream));
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
                sc8.j("Read too much data during profile line parse");
                return null;
            }
        }
        return fe3VarArr;
    }

    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, fe3[] fe3VarArr) {
        int i;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = icd.a;
        int i2 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                kfe.f(byteArrayOutputStream2, fe3VarArr.length);
                int i3 = 2;
                for (fe3 fe3Var : fe3VarArr) {
                    kfe.e(byteArrayOutputStream2, fe3Var.c, 4);
                    kfe.e(byteArrayOutputStream2, fe3Var.d, 4);
                    kfe.e(byteArrayOutputStream2, fe3Var.g, 4);
                    String b2 = b(bArr2, fe3Var.a, fe3Var.b);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = b2.getBytes(charset).length;
                    kfe.f(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(b2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 == byteArray.length) {
                    tyc tycVar = new tyc(1, false, byteArray);
                    byteArrayOutputStream2.close();
                    arrayList2.add(tycVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < fe3VarArr.length) {
                        try {
                            fe3 fe3Var2 = fe3VarArr[i4];
                            kfe.f(byteArrayOutputStream3, i4);
                            kfe.f(byteArrayOutputStream3, fe3Var2.e);
                            i5 = i5 + 4 + (fe3Var2.e << 1);
                            int[] iArr = fe3Var2.h;
                            int length3 = iArr.length;
                            int i6 = i2;
                            while (i2 < length3) {
                                int i7 = iArr[i2];
                                kfe.f(byteArrayOutputStream3, i7 - i6);
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
                        tyc tycVar2 = new tyc(3, true, byteArray2);
                        byteArrayOutputStream3.close();
                        arrayList2.add(tycVar2);
                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < fe3VarArr.length) {
                            try {
                                fe3 fe3Var3 = fe3VarArr[i9];
                                int i11 = 0;
                                for (Map.Entry entry : fe3Var3.i.entrySet()) {
                                    i11 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                k(byteArrayOutputStream4, fe3Var3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                l(byteArrayOutputStream5, fe3Var3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                kfe.f(byteArrayOutputStream2, i9);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i12 = i10 + 6;
                                ArrayList arrayList4 = arrayList3;
                                kfe.e(byteArrayOutputStream2, length4, 4);
                                kfe.f(byteArrayOutputStream2, i11);
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
                            tyc tycVar3 = new tyc(4, true, byteArray5);
                            byteArrayOutputStream2.close();
                            arrayList2.add(tycVar3);
                            long size = 12 + (arrayList2.size() << 4);
                            kfe.e(byteArrayOutputStream, arrayList2.size(), 4);
                            int i13 = 0;
                            while (i13 < arrayList2.size()) {
                                tyc tycVar4 = (tyc) arrayList2.get(i13);
                                int i14 = tycVar4.a;
                                byte[] bArr3 = tycVar4.b;
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
                                kfe.e(byteArrayOutputStream, i, 4);
                                kfe.e(byteArrayOutputStream, size, 4);
                                if (tycVar4.c) {
                                    long length5 = bArr3.length;
                                    byte[] a2 = kfe.a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a2);
                                    kfe.e(byteArrayOutputStream, a2.length, 4);
                                    kfe.e(byteArrayOutputStream, length5, 4);
                                    length = a2.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    kfe.e(byteArrayOutputStream, bArr3.length, 4);
                                    kfe.e(byteArrayOutputStream, 0L, 4);
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
        byte[] bArr4 = icd.b;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] a3 = a(fe3VarArr, bArr4);
            kfe.e(byteArrayOutputStream, fe3VarArr.length, 1);
            kfe.e(byteArrayOutputStream, a3.length, 4);
            byte[] a4 = kfe.a(a3);
            kfe.e(byteArrayOutputStream, a4.length, 4);
            byteArrayOutputStream.write(a4);
            return true;
        }
        byte[] bArr5 = icd.d;
        if (Arrays.equals(bArr, bArr5)) {
            kfe.e(byteArrayOutputStream, fe3VarArr.length, 1);
            for (fe3 fe3Var4 : fe3VarArr) {
                String b3 = b(bArr5, fe3Var4.a, fe3Var4.b);
                Charset charset2 = StandardCharsets.UTF_8;
                kfe.f(byteArrayOutputStream, b3.getBytes(charset2).length);
                kfe.f(byteArrayOutputStream, fe3Var4.h.length);
                kfe.e(byteArrayOutputStream, fe3Var4.i.size() << 2, 4);
                kfe.e(byteArrayOutputStream, fe3Var4.c, 4);
                byteArrayOutputStream.write(b3.getBytes(charset2));
                for (Integer num : fe3Var4.i.keySet()) {
                    kfe.f(byteArrayOutputStream, num.intValue());
                    kfe.f(byteArrayOutputStream, 0);
                }
                for (int i16 : fe3Var4.h) {
                    kfe.f(byteArrayOutputStream, i16);
                }
            }
            return true;
        }
        byte[] bArr6 = icd.c;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] a5 = a(fe3VarArr, bArr6);
            kfe.e(byteArrayOutputStream, fe3VarArr.length, 1);
            kfe.e(byteArrayOutputStream, a5.length, 4);
            byte[] a6 = kfe.a(a5);
            kfe.e(byteArrayOutputStream, a6.length, 4);
            byteArrayOutputStream.write(a6);
            return true;
        }
        byte[] bArr7 = icd.e;
        if (Arrays.equals(bArr, bArr7)) {
            kfe.f(byteArrayOutputStream, fe3VarArr.length);
            for (fe3 fe3Var5 : fe3VarArr) {
                String str = fe3Var5.a;
                TreeMap treeMap = fe3Var5.i;
                String b4 = b(bArr7, str, fe3Var5.b);
                Charset charset3 = StandardCharsets.UTF_8;
                kfe.f(byteArrayOutputStream, b4.getBytes(charset3).length);
                kfe.f(byteArrayOutputStream, treeMap.size());
                kfe.f(byteArrayOutputStream, fe3Var5.h.length);
                kfe.e(byteArrayOutputStream, fe3Var5.c, 4);
                byteArrayOutputStream.write(b4.getBytes(charset3));
                for (Integer num2 : treeMap.keySet()) {
                    kfe.f(byteArrayOutputStream, num2.intValue());
                }
                for (int i17 : fe3Var5.h) {
                    kfe.f(byteArrayOutputStream, i17);
                }
            }
            return true;
        }
        return false;
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, fe3 fe3Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        kfe.f(byteArrayOutputStream, str.getBytes(charset).length);
        kfe.f(byteArrayOutputStream, fe3Var.e);
        kfe.e(byteArrayOutputStream, fe3Var.f, 4);
        kfe.e(byteArrayOutputStream, fe3Var.c, 4);
        kfe.e(byteArrayOutputStream, fe3Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, fe3 fe3Var) {
        byte[] bArr = new byte[(((fe3Var.g << 1) + 7) & (-8)) / 8];
        for (Map.Entry entry : fe3Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i = intValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i2 = intValue + fe3Var.g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (i2 % 8)));
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, fe3 fe3Var) {
        int i = 0;
        for (Map.Entry entry : fe3Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                kfe.f(byteArrayOutputStream, intValue - i);
                kfe.f(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }
}
