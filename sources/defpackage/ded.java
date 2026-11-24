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
public abstract class ded {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static byte[] a(qf3[] qf3VarArr, byte[] bArr) {
        int i = 0;
        for (qf3 qf3Var : qf3VarArr) {
            i += ((((qf3Var.g << 1) + 7) & (-8)) / 8) + b(bArr, qf3Var.a, qf3Var.b).getBytes(StandardCharsets.UTF_8).length + 16 + (qf3Var.e << 1) + qf3Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        if (Arrays.equals(bArr, ked.c)) {
            for (qf3 qf3Var2 : qf3VarArr) {
                j(byteArrayOutputStream, qf3Var2, b(bArr, qf3Var2.a, qf3Var2.b));
                l(byteArrayOutputStream, qf3Var2);
                int[] iArr = qf3Var2.h;
                int length = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = iArr[i2];
                    lhe.f(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                k(byteArrayOutputStream, qf3Var2);
            }
        } else {
            for (qf3 qf3Var3 : qf3VarArr) {
                j(byteArrayOutputStream, qf3Var3, b(bArr, qf3Var3.a, qf3Var3.b));
            }
            for (qf3 qf3Var4 : qf3VarArr) {
                l(byteArrayOutputStream, qf3Var4);
                int[] iArr2 = qf3Var4.h;
                int length2 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = iArr2[i5];
                    lhe.f(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                k(byteArrayOutputStream, qf3Var4);
            }
        }
        if (byteArrayOutputStream.size() == i) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i);
    }

    public static String b(byte[] bArr, String str, String str2) {
        Object obj;
        byte[] bArr2 = ked.e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = ked.d;
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
                    return b10.j(new StringBuilder(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : ":", str2);
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
            i2 += (int) lhe.d(2, byteArrayInputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static qf3[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, qf3[] qf3VarArr) {
        byte[] bArr3 = ked.f;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(ked.a, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int d = (int) lhe.d(1, fileInputStream);
                    byte[] c = lhe.c(fileInputStream, (int) lhe.d(4, fileInputStream), (int) lhe.d(4, fileInputStream));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
                        try {
                            qf3[] e = e(byteArrayInputStream, d, qf3VarArr);
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
                    dq9.m("Content found after the end of file");
                    return null;
                }
                dq9.m("Unsupported meta version");
                return null;
            }
            dq9.m("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        } else if (Arrays.equals(bArr, ked.g)) {
            int d2 = (int) lhe.d(2, fileInputStream);
            byte[] c2 = lhe.c(fileInputStream, (int) lhe.d(4, fileInputStream), (int) lhe.d(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(c2);
                try {
                    qf3[] f = f(byteArrayInputStream2, bArr2, d2, qf3VarArr);
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
            dq9.m("Content found after the end of file");
            return null;
        } else {
            dq9.m("Unsupported meta version");
            return null;
        }
    }

    public static qf3[] e(ByteArrayInputStream byteArrayInputStream, int i, qf3[] qf3VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new qf3[0];
        }
        if (i == qf3VarArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = (int) lhe.d(2, byteArrayInputStream);
                strArr[i2] = new String(lhe.b((int) lhe.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            }
            for (int i3 = 0; i3 < i; i3++) {
                qf3 qf3Var = qf3VarArr[i3];
                if (qf3Var.b.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    qf3Var.e = i4;
                    qf3Var.h = c(byteArrayInputStream, i4);
                } else {
                    dq9.m("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return qf3VarArr;
        }
        dq9.m("Mismatched number of dex files found in metadata");
        return null;
    }

    public static qf3[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, qf3[] qf3VarArr) {
        qf3 qf3Var;
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new qf3[0];
        }
        if (i == qf3VarArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                lhe.d(2, byteArrayInputStream);
                String str2 = new String(lhe.b((int) lhe.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
                long d = lhe.d(4, byteArrayInputStream);
                int d2 = (int) lhe.d(2, byteArrayInputStream);
                if (qf3VarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i3 = 0; i3 < qf3VarArr.length; i3++) {
                        if (qf3VarArr[i3].b.equals(str)) {
                            qf3Var = qf3VarArr[i3];
                            break;
                        }
                    }
                }
                qf3Var = null;
                if (qf3Var != null) {
                    qf3Var.d = d;
                    int[] c = c(byteArrayInputStream, d2);
                    if (Arrays.equals(bArr, ked.e)) {
                        qf3Var.e = d2;
                        qf3Var.h = c;
                    }
                } else {
                    dq9.m("Missing profile key: ".concat(str2));
                    return null;
                }
            }
            return qf3VarArr;
        }
        dq9.m("Mismatched number of dex files found in metadata");
        return null;
    }

    public static qf3[] g(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, ked.b)) {
            int d = (int) lhe.d(1, fileInputStream);
            byte[] c = lhe.c(fileInputStream, (int) lhe.d(4, fileInputStream), (int) lhe.d(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
                try {
                    qf3[] h = h(byteArrayInputStream, str, d);
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
            dq9.m("Content found after the end of file");
            return null;
        }
        dq9.m("Unsupported version");
        return null;
    }

    public static qf3[] h(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2;
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new qf3[0];
        }
        qf3[] qf3VarArr = new qf3[i];
        for (int i4 = 0; i4 < i; i4++) {
            int d = (int) lhe.d(2, byteArrayInputStream);
            qf3VarArr[i4] = new qf3(str, new String(lhe.b((int) lhe.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8), lhe.d(4, byteArrayInputStream), d, (int) lhe.d(4, byteArrayInputStream), (int) lhe.d(4, byteArrayInputStream), new int[d], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i) {
            qf3 qf3Var = qf3VarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = qf3Var.f;
            int i7 = qf3Var.g;
            TreeMap treeMap = qf3Var.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) lhe.d(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(i9), 1);
                int d2 = (int) lhe.d(2, byteArrayInputStream);
                while (d2 > 0) {
                    lhe.d(2, byteArrayInputStream);
                    int d3 = (int) lhe.d(1, byteArrayInputStream);
                    if (d3 != 6 && d3 != 7) {
                        while (d3 > 0) {
                            lhe.d(1, byteArrayInputStream);
                            int i10 = i3;
                            int i11 = i5;
                            for (int d4 = (int) lhe.d(1, byteArrayInputStream); d4 > 0; d4--) {
                                lhe.d(2, byteArrayInputStream);
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
                qf3Var.h = c(byteArrayInputStream, qf3Var.e);
                BitSet valueOf = BitSet.valueOf(lhe.b((((i7 << 1) + 7) & (-8)) / 8, byteArrayInputStream));
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
                dq9.m("Read too much data during profile line parse");
                return null;
            }
        }
        return qf3VarArr;
    }

    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, qf3[] qf3VarArr) {
        int i;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = ked.a;
        int i2 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                lhe.f(byteArrayOutputStream2, qf3VarArr.length);
                int i3 = 2;
                for (qf3 qf3Var : qf3VarArr) {
                    lhe.e(byteArrayOutputStream2, qf3Var.c, 4);
                    lhe.e(byteArrayOutputStream2, qf3Var.d, 4);
                    lhe.e(byteArrayOutputStream2, qf3Var.g, 4);
                    String b2 = b(bArr2, qf3Var.a, qf3Var.b);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = b2.getBytes(charset).length;
                    lhe.f(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(b2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 == byteArray.length) {
                    u0d u0dVar = new u0d(1, false, byteArray);
                    byteArrayOutputStream2.close();
                    arrayList2.add(u0dVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < qf3VarArr.length) {
                        try {
                            qf3 qf3Var2 = qf3VarArr[i4];
                            lhe.f(byteArrayOutputStream3, i4);
                            lhe.f(byteArrayOutputStream3, qf3Var2.e);
                            i5 = i5 + 4 + (qf3Var2.e << 1);
                            int[] iArr = qf3Var2.h;
                            int length3 = iArr.length;
                            int i6 = i2;
                            while (i2 < length3) {
                                int i7 = iArr[i2];
                                lhe.f(byteArrayOutputStream3, i7 - i6);
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
                        u0d u0dVar2 = new u0d(3, true, byteArray2);
                        byteArrayOutputStream3.close();
                        arrayList2.add(u0dVar2);
                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < qf3VarArr.length) {
                            try {
                                qf3 qf3Var3 = qf3VarArr[i9];
                                int i11 = 0;
                                for (Map.Entry entry : qf3Var3.i.entrySet()) {
                                    i11 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                k(byteArrayOutputStream4, qf3Var3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                l(byteArrayOutputStream5, qf3Var3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                lhe.f(byteArrayOutputStream2, i9);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i12 = i10 + 6;
                                ArrayList arrayList4 = arrayList3;
                                lhe.e(byteArrayOutputStream2, length4, 4);
                                lhe.f(byteArrayOutputStream2, i11);
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
                            u0d u0dVar3 = new u0d(4, true, byteArray5);
                            byteArrayOutputStream2.close();
                            arrayList2.add(u0dVar3);
                            long size = 12 + (arrayList2.size() << 4);
                            lhe.e(byteArrayOutputStream, arrayList2.size(), 4);
                            int i13 = 0;
                            while (i13 < arrayList2.size()) {
                                u0d u0dVar4 = (u0d) arrayList2.get(i13);
                                int i14 = u0dVar4.a;
                                byte[] bArr3 = u0dVar4.b;
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
                                lhe.e(byteArrayOutputStream, i, 4);
                                lhe.e(byteArrayOutputStream, size, 4);
                                if (u0dVar4.c) {
                                    long length5 = bArr3.length;
                                    byte[] a2 = lhe.a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a2);
                                    lhe.e(byteArrayOutputStream, a2.length, 4);
                                    lhe.e(byteArrayOutputStream, length5, 4);
                                    length = a2.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    lhe.e(byteArrayOutputStream, bArr3.length, 4);
                                    lhe.e(byteArrayOutputStream, 0L, 4);
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
        byte[] bArr4 = ked.b;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] a3 = a(qf3VarArr, bArr4);
            lhe.e(byteArrayOutputStream, qf3VarArr.length, 1);
            lhe.e(byteArrayOutputStream, a3.length, 4);
            byte[] a4 = lhe.a(a3);
            lhe.e(byteArrayOutputStream, a4.length, 4);
            byteArrayOutputStream.write(a4);
            return true;
        }
        byte[] bArr5 = ked.d;
        if (Arrays.equals(bArr, bArr5)) {
            lhe.e(byteArrayOutputStream, qf3VarArr.length, 1);
            for (qf3 qf3Var4 : qf3VarArr) {
                String b3 = b(bArr5, qf3Var4.a, qf3Var4.b);
                Charset charset2 = StandardCharsets.UTF_8;
                lhe.f(byteArrayOutputStream, b3.getBytes(charset2).length);
                lhe.f(byteArrayOutputStream, qf3Var4.h.length);
                lhe.e(byteArrayOutputStream, qf3Var4.i.size() << 2, 4);
                lhe.e(byteArrayOutputStream, qf3Var4.c, 4);
                byteArrayOutputStream.write(b3.getBytes(charset2));
                for (Integer num : qf3Var4.i.keySet()) {
                    lhe.f(byteArrayOutputStream, num.intValue());
                    lhe.f(byteArrayOutputStream, 0);
                }
                for (int i16 : qf3Var4.h) {
                    lhe.f(byteArrayOutputStream, i16);
                }
            }
            return true;
        }
        byte[] bArr6 = ked.c;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] a5 = a(qf3VarArr, bArr6);
            lhe.e(byteArrayOutputStream, qf3VarArr.length, 1);
            lhe.e(byteArrayOutputStream, a5.length, 4);
            byte[] a6 = lhe.a(a5);
            lhe.e(byteArrayOutputStream, a6.length, 4);
            byteArrayOutputStream.write(a6);
            return true;
        }
        byte[] bArr7 = ked.e;
        if (Arrays.equals(bArr, bArr7)) {
            lhe.f(byteArrayOutputStream, qf3VarArr.length);
            for (qf3 qf3Var5 : qf3VarArr) {
                String str = qf3Var5.a;
                TreeMap treeMap = qf3Var5.i;
                String b4 = b(bArr7, str, qf3Var5.b);
                Charset charset3 = StandardCharsets.UTF_8;
                lhe.f(byteArrayOutputStream, b4.getBytes(charset3).length);
                lhe.f(byteArrayOutputStream, treeMap.size());
                lhe.f(byteArrayOutputStream, qf3Var5.h.length);
                lhe.e(byteArrayOutputStream, qf3Var5.c, 4);
                byteArrayOutputStream.write(b4.getBytes(charset3));
                for (Integer num2 : treeMap.keySet()) {
                    lhe.f(byteArrayOutputStream, num2.intValue());
                }
                for (int i17 : qf3Var5.h) {
                    lhe.f(byteArrayOutputStream, i17);
                }
            }
            return true;
        }
        return false;
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, qf3 qf3Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        lhe.f(byteArrayOutputStream, str.getBytes(charset).length);
        lhe.f(byteArrayOutputStream, qf3Var.e);
        lhe.e(byteArrayOutputStream, qf3Var.f, 4);
        lhe.e(byteArrayOutputStream, qf3Var.c, 4);
        lhe.e(byteArrayOutputStream, qf3Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, qf3 qf3Var) {
        byte[] bArr = new byte[(((qf3Var.g << 1) + 7) & (-8)) / 8];
        for (Map.Entry entry : qf3Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i = intValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i2 = intValue + qf3Var.g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (i2 % 8)));
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, qf3 qf3Var) {
        int i = 0;
        for (Map.Entry entry : qf3Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                lhe.f(byteArrayOutputStream, intValue - i);
                lhe.f(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }
}
