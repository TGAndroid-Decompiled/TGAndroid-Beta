package e2;

import android.content.pm.PackageInfo;
import j3.r0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
public abstract class e {
    public static final wa.a f4809a = new wa.a(5);
    public static final byte[] f4810b = {112, 114, 111, 0};
    public static final byte[] f4811c = {112, 114, 109, 0};
    public static final byte[] d = {48, 49, 53, 0};
    public static final byte[] f4812e = {48, 49, 48, 0};
    public static final byte[] f4813f = {48, 48, 57, 0};
    public static final byte[] f4814g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] f4815i = {48, 48, 49, 0};
    public static final byte[] f4816j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) {
        int i9 = 0;
        for (b bVar : bVarArr) {
            i9 += ((((bVar.f4807g * 2) + 7) & (-8)) / 8) + (bVar.f4805e * 2) + d(bVar.f4802a, bVar.f4803b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f4806f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i9);
        if (Arrays.equals(bArr, f4813f)) {
            for (b bVar2 : bVarArr) {
                p(byteArrayOutputStream, bVar2, d(bVar2.f4802a, bVar2.f4803b, bArr));
                r(byteArrayOutputStream, bVar2);
                int[] iArr = bVar2.h;
                int length = iArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = iArr[i10];
                    u(byteArrayOutputStream, i12 - i11);
                    i10++;
                    i11 = i12;
                }
                q(byteArrayOutputStream, bVar2);
            }
        } else {
            for (b bVar3 : bVarArr) {
                p(byteArrayOutputStream, bVar3, d(bVar3.f4802a, bVar3.f4803b, bArr));
            }
            for (b bVar4 : bVarArr) {
                r(byteArrayOutputStream, bVar4);
                int[] iArr2 = bVar4.h;
                int length2 = iArr2.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = iArr2[i13];
                    u(byteArrayOutputStream, i15 - i14);
                    i13++;
                    i14 = i15;
                }
                q(byteArrayOutputStream, bVar4);
            }
        }
        if (byteArrayOutputStream.size() == i9) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i9);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z10 = true;
            for (File file2 : listFiles) {
                if (c(file2) && z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            return z10;
        }
        file.delete();
        return true;
    }

    public static String d(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f4814g;
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
                    return aa.d.r(c.n(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : ":", str2);
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

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static byte[] f(int i9, InputStream inputStream) {
        byte[] bArr = new byte[i9];
        int i10 = 0;
        while (i10 < i9) {
            int read = inputStream.read(bArr, i10, i9 - i10);
            if (read >= 0) {
                i10 += read;
            } else {
                throw new IllegalStateException(r0.l(i9, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i9) {
        int[] iArr = new int[i9];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 += (int) m(2, byteArrayInputStream);
            iArr[i11] = i10;
        }
        return iArr;
    }

    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: e2.e.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = f4815i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m10 = (int) m(1, fileInputStream);
                    byte[] h10 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
                        try {
                            b[] j10 = j(byteArrayInputStream, m10, bVarArr);
                            byteArrayInputStream.close();
                            return j10;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, f4816j)) {
            int m11 = (int) m(2, fileInputStream);
            byte[] h11 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h11);
                try {
                    b[] k10 = k(byteArrayInputStream2, bArr2, m11, bVarArr);
                    byteArrayInputStream2.close();
                    return k10;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i9, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i9 == bVarArr.length) {
            String[] strArr = new String[i9];
            int[] iArr = new int[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                int m10 = (int) m(2, byteArrayInputStream);
                iArr[i10] = (int) m(2, byteArrayInputStream);
                strArr[i10] = new String(f(m10, byteArrayInputStream), StandardCharsets.UTF_8);
            }
            for (int i11 = 0; i11 < i9; i11++) {
                b bVar = bVarArr[i11];
                if (bVar.f4803b.equals(strArr[i11])) {
                    int i12 = iArr[i11];
                    bVar.f4805e = i12;
                    bVar.h = g(byteArrayInputStream, i12);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i9, b[] bVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i9 == bVarArr.length) {
            for (int i10 = 0; i10 < i9; i10++) {
                m(2, byteArrayInputStream);
                String str2 = new String(f((int) m(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
                long m10 = m(4, byteArrayInputStream);
                int m11 = (int) m(2, byteArrayInputStream);
                b bVar = null;
                if (bVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 >= bVarArr.length) {
                            break;
                        } else if (bVarArr[i11].f4803b.equals(str)) {
                            bVar = bVarArr[i11];
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (bVar != null) {
                    bVar.d = m10;
                    int[] g10 = g(byteArrayInputStream, m11);
                    if (Arrays.equals(bArr, h)) {
                        bVar.f4805e = m11;
                        bVar.h = g10;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f4812e)) {
            int m10 = (int) m(1, fileInputStream);
            byte[] h10 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
                try {
                    b[] n10 = n(byteArrayInputStream, str, m10);
                    byteArrayInputStream.close();
                    return n10;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static long m(int i9, InputStream inputStream) {
        byte[] f10 = f(i9, inputStream);
        long j10 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j10 += (f10[i10] & 255) << (i10 * 8);
        }
        return j10;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i9) {
        int i10;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            int m10 = (int) m(2, byteArrayInputStream);
            bVarArr[i11] = new b(str, new String(f((int) m(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8), m(4, byteArrayInputStream), m10, (int) m(4, byteArrayInputStream), (int) m(4, byteArrayInputStream), new int[m10], new TreeMap());
        }
        int i12 = 0;
        while (i12 < i9) {
            b bVar = bVarArr[i12];
            int available = byteArrayInputStream.available();
            int i13 = bVar.f4806f;
            int i14 = bVar.f4807g;
            TreeMap treeMap = bVar.f4808i;
            int i15 = available - i13;
            int i16 = 0;
            while (byteArrayInputStream.available() > i15) {
                i16 += (int) m(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(i16), 1);
                int m11 = (int) m(2, byteArrayInputStream);
                while (m11 > 0) {
                    m(2, byteArrayInputStream);
                    int m12 = (int) m(1, byteArrayInputStream);
                    if (m12 != 6 && m12 != 7) {
                        while (m12 > 0) {
                            m(1, byteArrayInputStream);
                            int i17 = i12;
                            for (int m13 = (int) m(1, byteArrayInputStream); m13 > 0; m13--) {
                                m(2, byteArrayInputStream);
                            }
                            m12--;
                            i12 = i17;
                        }
                    }
                    m11--;
                    i12 = i12;
                }
            }
            int i18 = i12;
            if (byteArrayInputStream.available() == i15) {
                bVar.h = g(byteArrayInputStream, bVar.f4805e);
                BitSet valueOf = BitSet.valueOf(f((((i14 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
                for (int i19 = 0; i19 < i14; i19++) {
                    if (valueOf.get(i19)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    if (valueOf.get(i19 + i14)) {
                        i10 |= 4;
                    }
                    if (i10 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i19));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i19), Integer.valueOf(i10 | num.intValue()));
                    }
                }
                i12 = i18 + 1;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return bVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        long j10;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = d;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                u(byteArrayOutputStream2, bVarArr.length);
                int i9 = 2;
                for (b bVar : bVarArr) {
                    t(byteArrayOutputStream2, bVar.f4804c, 4);
                    t(byteArrayOutputStream2, bVar.d, 4);
                    t(byteArrayOutputStream2, bVar.f4807g, 4);
                    String d9 = d(bVar.f4802a, bVar.f4803b, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d9.getBytes(charset).length;
                    u(byteArrayOutputStream2, length2);
                    i9 = i9 + 14 + length2;
                    byteArrayOutputStream2.write(d9.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i9 == byteArray.length) {
                    l lVar = new l(1, false, byteArray);
                    byteArrayOutputStream2.close();
                    arrayList2.add(lVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i10 = 0;
                    for (int i11 = 0; i11 < bVarArr.length; i11++) {
                        try {
                            b bVar2 = bVarArr[i11];
                            u(byteArrayOutputStream3, i11);
                            u(byteArrayOutputStream3, bVar2.f4805e);
                            i10 = i10 + 4 + (bVar2.f4805e * 2);
                            int[] iArr = bVar2.h;
                            int length3 = iArr.length;
                            int i12 = 0;
                            int i13 = 0;
                            while (i12 < length3) {
                                int i14 = iArr[i12];
                                u(byteArrayOutputStream3, i14 - i13);
                                i12++;
                                i13 = i14;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i10 == byteArray2.length) {
                        l lVar2 = new l(3, true, byteArray2);
                        byteArrayOutputStream3.close();
                        arrayList2.add(lVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < bVarArr.length) {
                            try {
                                b bVar3 = bVarArr[i15];
                                int i17 = 0;
                                for (Map.Entry entry : bVar3.f4808i.entrySet()) {
                                    i17 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                q(byteArrayOutputStream4, bVar3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                r(byteArrayOutputStream5, bVar3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                u(byteArrayOutputStream3, i15);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i18 = i16 + 6;
                                ArrayList arrayList4 = arrayList3;
                                t(byteArrayOutputStream3, length4, 4);
                                u(byteArrayOutputStream3, i17);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i16 = i18 + length4;
                                i15++;
                                arrayList3 = arrayList4;
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i16 == byteArray5.length) {
                            l lVar3 = new l(4, true, byteArray5);
                            byteArrayOutputStream3.close();
                            arrayList2.add(lVar3);
                            long j11 = 4;
                            long size = j11 + j11 + 4 + (arrayList2.size() * 16);
                            t(byteArrayOutputStream, arrayList2.size(), 4);
                            int i19 = 0;
                            while (i19 < arrayList2.size()) {
                                l lVar4 = (l) arrayList2.get(i19);
                                int i20 = lVar4.f4825a;
                                byte[] bArr3 = lVar4.f4826b;
                                if (i20 != 1) {
                                    if (i20 != 2) {
                                        if (i20 != 3) {
                                            if (i20 != 4) {
                                                if (i20 == 5) {
                                                    j10 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j10 = 3;
                                            }
                                        } else {
                                            j10 = 2;
                                        }
                                    } else {
                                        j10 = 1;
                                    }
                                } else {
                                    j10 = 0;
                                }
                                t(byteArrayOutputStream, j10, 4);
                                t(byteArrayOutputStream, size, 4);
                                if (lVar4.f4827c) {
                                    byte[] a2 = a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a2);
                                    t(byteArrayOutputStream, a2.length, 4);
                                    t(byteArrayOutputStream, bArr3.length, 4);
                                    length = a2.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    t(byteArrayOutputStream, bArr3.length, 4);
                                    t(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i19++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i21));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        byte[] bArr4 = f4812e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] b10 = b(bVarArr, bArr4);
            t(byteArrayOutputStream, bVarArr.length, 1);
            t(byteArrayOutputStream, b10.length, 4);
            byte[] a3 = a(b10);
            t(byteArrayOutputStream, a3.length, 4);
            byteArrayOutputStream.write(a3);
            return true;
        }
        byte[] bArr5 = f4814g;
        if (Arrays.equals(bArr, bArr5)) {
            t(byteArrayOutputStream, bVarArr.length, 1);
            for (b bVar4 : bVarArr) {
                String d10 = d(bVar4.f4802a, bVar4.f4803b, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d10.getBytes(charset2).length);
                u(byteArrayOutputStream, bVar4.h.length);
                t(byteArrayOutputStream, bVar4.f4808i.size() * 4, 4);
                t(byteArrayOutputStream, bVar4.f4804c, 4);
                byteArrayOutputStream.write(d10.getBytes(charset2));
                for (Integer num : bVar4.f4808i.keySet()) {
                    u(byteArrayOutputStream, num.intValue());
                    u(byteArrayOutputStream, 0);
                }
                for (int i22 : bVar4.h) {
                    u(byteArrayOutputStream, i22);
                }
            }
            return true;
        }
        byte[] bArr6 = f4813f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] b11 = b(bVarArr, bArr6);
            t(byteArrayOutputStream, bVarArr.length, 1);
            t(byteArrayOutputStream, b11.length, 4);
            byte[] a10 = a(b11);
            t(byteArrayOutputStream, a10.length, 4);
            byteArrayOutputStream.write(a10);
            return true;
        }
        byte[] bArr7 = h;
        if (Arrays.equals(bArr, bArr7)) {
            u(byteArrayOutputStream, bVarArr.length);
            for (b bVar5 : bVarArr) {
                String str = bVar5.f4802a;
                TreeMap treeMap = bVar5.f4808i;
                String d11 = d(str, bVar5.f4803b, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d11.getBytes(charset3).length);
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, bVar5.h.length);
                t(byteArrayOutputStream, bVar5.f4804c, 4);
                byteArrayOutputStream.write(d11.getBytes(charset3));
                for (Integer num2 : treeMap.keySet()) {
                    u(byteArrayOutputStream, num2.intValue());
                }
                for (int i23 : bVar5.h) {
                    u(byteArrayOutputStream, i23);
                }
            }
            return true;
        }
        return false;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, bVar.f4805e);
        t(byteArrayOutputStream, bVar.f4806f, 4);
        t(byteArrayOutputStream, bVar.f4804c, 4);
        t(byteArrayOutputStream, bVar.f4807g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        byte[] bArr = new byte[(((bVar.f4807g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f4808i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i9 = intValue / 8;
                bArr[i9] = (byte) (bArr[i9] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i10 = intValue + bVar.f4807g;
                int i11 = i10 / 8;
                bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i9 = 0;
        for (Map.Entry entry : bVar.f4808i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i9);
                u(byteArrayOutputStream, 0);
                i9 = intValue;
            }
        }
    }

    public static void s(android.content.Context r18, java.util.concurrent.Executor r19, e2.d r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: e2.e.s(android.content.Context, java.util.concurrent.Executor, e2.d, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j10, int i9) {
        byte[] bArr = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr[i10] = (byte) ((j10 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i9) {
        t(byteArrayOutputStream, i9, 2);
    }
}
