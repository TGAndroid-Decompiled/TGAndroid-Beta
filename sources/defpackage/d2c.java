package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class d2c implements ly9 {
    public final byte a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public d2c(pib pibVar, nib[] nibVarArr) {
        this.a = (byte) 4;
        this.f = pibVar;
        int length = nibVarArr.length;
        this.c = new nib[length];
        this.b = length - 1;
        int e = pibVar.e() + 1;
        nib[][] nibVarArr2 = new nib[e];
        int[] iArr = new int[e];
        for (nib nibVar : nibVarArr) {
            int i = nibVar.a.a;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < e; i2++) {
            nibVarArr2[i2] = new nib[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (nib nibVar2 : nibVarArr) {
            int i3 = nibVar2.a.a;
            nib[] nibVarArr3 = nibVarArr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            nibVarArr3[i4] = nibVar2;
        }
        this.d = nibVarArr2;
        this.e = new int[((pib) this.f).e() + 1];
    }

    public static void d(float[] fArr, int i, float f, float f2, float f3, float f4) {
        int i2 = i << 3;
        fArr[i2] = f;
        fArr[i2 + 1] = f2;
        fArr[i2 + 2] = f3;
        fArr[i2 + 3] = f2;
        fArr[i2 + 4] = f3;
        fArr[i2 + 5] = f4;
        fArr[i2 + 6] = f;
        fArr[i2 + 7] = f4;
    }

    public static void m(d2c d2cVar, String str, int i, int i2) {
        String str2;
        if ((i2 & 2) != 0) {
            i = d2cVar.b;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        } else {
            str2 = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";
        }
        d2cVar.l(i, str, str2);
        throw null;
    }

    public final int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.b = i;
            if (i2 < charSequence.length()) {
                return a(this.b, charSequence);
            }
            m(this, "Unexpected EOF during unicode escape", 0, 6);
            throw null;
        }
        ((StringBuilder) this.e).append((char) (o(i + 3, charSequence) + (o(i, charSequence) << 12) + (o(i + 1, charSequence) << 8) + (o(i + 2, charSequence) << 4)));
        return i2;
    }

    @Override
    public final void b(ey7 ey7Var) {
        usb usbVar;
        int i;
        usb usbVar2;
        SparseArray sparseArray;
        int i2;
        zd1 zd1Var;
        int i3;
        m6c c0;
        int i4;
        int i5;
        usb usbVar3;
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        zd1 zd1Var2 = (zd1) this.c;
        j6c j6cVar = (j6c) this.f;
        SparseArray sparseArray3 = j6cVar.h;
        SparseBooleanArray sparseBooleanArray = j6cVar.i;
        ed edVar = j6cVar.f;
        List list = j6cVar.c;
        byte b = j6cVar.a;
        if (ey7Var.A() == 2) {
            if (b != 1 && b != 2 && j6cVar.n != 1) {
                usbVar = new usb(((usb) list.get(0)).d());
                list.add(usbVar);
            } else {
                usbVar = (usb) list.get(0);
            }
            if ((ey7Var.A() & 128) != 0) {
                ey7Var.O(1);
                int H = ey7Var.H();
                ey7Var.O(3);
                ey7Var.k(0, 2, zd1Var2.b);
                zd1Var2.l(0);
                zd1Var2.n(3);
                j6cVar.t = zd1Var2.f(13);
                ey7Var.k(0, 2, zd1Var2.b);
                zd1Var2.l(0);
                zd1Var2.n(4);
                ey7Var.O(zd1Var2.f(12));
                if (b == 2 && j6cVar.r == null) {
                    m6c c02 = edVar.c0(21, new sx8(21, null, 0, null, gcc.b));
                    j6cVar.r = c02;
                    if (c02 != null) {
                        c02.c(usbVar, j6cVar.m, new l6c(H, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a = ey7Var.a();
                while (a > 0) {
                    ey7Var.k(0, 5, zd1Var2.b);
                    zd1Var2.l(0);
                    int f = zd1Var2.f(8);
                    zd1Var2.n(3);
                    int f2 = zd1Var2.f(13);
                    zd1Var2.n(4);
                    int f3 = zd1Var2.f(12);
                    int i6 = ey7Var.b;
                    int i7 = i6 + f3;
                    int i8 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i9 = 0;
                    int i10 = a;
                    while (true) {
                        if (ey7Var.b < i7) {
                            int A = ey7Var.A();
                            zd1Var = zd1Var2;
                            int A2 = ey7Var.b + ey7Var.A();
                            if (A2 > i7) {
                                break;
                            }
                            SparseArray sparseArray4 = sparseArray3;
                            if (A == 5) {
                                long C = ey7Var.C();
                                if (C == 1094921523) {
                                    i8 = 129;
                                } else if (C == 1161904947) {
                                    i8 = 135;
                                } else {
                                    if (C != 1094921524) {
                                        if (C == 1212503619) {
                                            i8 = 36;
                                        }
                                    }
                                    i8 = 172;
                                }
                                i4 = A2;
                                i5 = H;
                                usbVar3 = usbVar;
                            } else if (A == 106) {
                                i4 = A2;
                                i5 = H;
                                usbVar3 = usbVar;
                                i8 = 129;
                            } else if (A == 122) {
                                i5 = H;
                                usbVar3 = usbVar;
                                i8 = 135;
                                i4 = A2;
                            } else {
                                if (A == 127) {
                                    int A3 = ey7Var.A();
                                    if (A3 != 21) {
                                        if (A3 == 14) {
                                            i8 = 136;
                                        } else if (A3 == 33) {
                                            i8 = 139;
                                        }
                                    }
                                    i8 = 172;
                                } else if (A == 123) {
                                    i8 = 138;
                                } else if (A == 10) {
                                    str = ey7Var.y(3, StandardCharsets.UTF_8).trim();
                                    i4 = A2;
                                    i9 = ey7Var.A();
                                    i5 = H;
                                    usbVar3 = usbVar;
                                } else if (A == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (ey7Var.b < A2) {
                                        String trim = ey7Var.y(3, StandardCharsets.UTF_8).trim();
                                        ey7Var.A();
                                        usb usbVar4 = usbVar;
                                        byte[] bArr = new byte[4];
                                        ey7Var.k(0, 4, bArr);
                                        arrayList2.add(new k6c(trim, bArr));
                                        usbVar = usbVar4;
                                        A2 = A2;
                                        H = H;
                                    }
                                    i4 = A2;
                                    i5 = H;
                                    usbVar3 = usbVar;
                                    arrayList = arrayList2;
                                    i8 = 89;
                                } else {
                                    i4 = A2;
                                    i5 = H;
                                    usbVar3 = usbVar;
                                    if (A == 111) {
                                        i8 = 257;
                                    }
                                }
                                i4 = A2;
                                i5 = H;
                                usbVar3 = usbVar;
                            }
                            ey7Var.O(i4 - ey7Var.b);
                            usbVar = usbVar3;
                            zd1Var2 = zd1Var;
                            sparseArray3 = sparseArray4;
                            H = i5;
                        } else {
                            zd1Var = zd1Var2;
                            break;
                        }
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i11 = H;
                    usb usbVar5 = usbVar;
                    ey7Var.N(i7);
                    sx8 sx8Var = new sx8(i8, str, i9, arrayList, Arrays.copyOfRange(ey7Var.a, i6, i7));
                    if (f == 6 || f == 5) {
                        f = i8;
                    }
                    int i12 = i10 - (f3 + 5);
                    if (b == 2) {
                        i3 = f;
                    } else {
                        i3 = f2;
                    }
                    if (!sparseBooleanArray.get(i3)) {
                        if (b == 2 && f == 21) {
                            c0 = j6cVar.r;
                        } else {
                            c0 = edVar.c0(f, sx8Var);
                        }
                        if (b != 2 || f2 < sparseIntArray.get(i3, 8192)) {
                            sparseIntArray.put(i3, f2);
                            sparseArray2.put(i3, c0);
                        }
                    }
                    a = i12;
                    usbVar = usbVar5;
                    zd1Var2 = zd1Var;
                    sparseArray3 = sparseArray5;
                    H = i11;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i13 = H;
                usb usbVar6 = usbVar;
                int size = sparseIntArray.size();
                int i14 = 0;
                while (i14 < size) {
                    int keyAt = sparseIntArray.keyAt(i14);
                    int valueAt = sparseIntArray.valueAt(i14);
                    sparseBooleanArray.put(keyAt, true);
                    j6cVar.j.put(valueAt, true);
                    m6c m6cVar = (m6c) sparseArray2.valueAt(i14);
                    if (m6cVar != null) {
                        if (m6cVar != j6cVar.r) {
                            i2 = i13;
                            usbVar2 = usbVar6;
                            m6cVar.c(usbVar2, j6cVar.m, new l6c(i2, keyAt, 8192));
                        } else {
                            usbVar2 = usbVar6;
                            i2 = i13;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, m6cVar);
                    } else {
                        usbVar2 = usbVar6;
                        sparseArray = sparseArray6;
                        i2 = i13;
                    }
                    i14++;
                    sparseArray6 = sparseArray;
                    i13 = i2;
                    usbVar6 = usbVar2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (b == 2) {
                    if (!j6cVar.o) {
                        j6cVar.m.D();
                        j6cVar.n = 0;
                        j6cVar.o = true;
                        return;
                    }
                    return;
                }
                sparseArray7.remove(this.b);
                if (b == 1) {
                    i = 0;
                } else {
                    i = j6cVar.n - 1;
                }
                j6cVar.n = i;
                if (i == 0) {
                    j6cVar.m.D();
                    j6cVar.o = true;
                }
            }
        }
    }

    public final boolean e() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i;
                if (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') {
                    return false;
                }
                return true;
            }
            i++;
        }
        this.b = i;
        return false;
    }

    public final void f(int i, String str) {
        String str2 = (String) this.f;
        if (str2.length() - i >= str.length()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                    m(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, 6);
                    throw null;
                }
            }
            this.b = str.length() + i;
            return;
        }
        m(this, "Unexpected end of boolean literal", 0, 6);
        throw null;
    }

    public final String g() {
        String str;
        char c;
        StringBuilder sb = (StringBuilder) this.e;
        String str2 = (String) this.f;
        h('\"');
        int i = this.b;
        int g = ddb.g(str2, '\"', i, 4);
        if (g != -1) {
            int i2 = i;
            while (i2 < g) {
                if (str2.charAt(i2) == '\\') {
                    int i3 = this.b;
                    char charAt = str2.charAt(i2);
                    boolean z = false;
                    while (charAt != '\"') {
                        if (charAt == '\\') {
                            sb.append((CharSequence) str2, i3, i2);
                            int r = r(i2 + 1);
                            if (r != -1) {
                                int i4 = r + 1;
                                char charAt2 = str2.charAt(r);
                                if (charAt2 == 'u') {
                                    i4 = a(i4, str2);
                                } else {
                                    if (charAt2 < 'u') {
                                        c = xj1.a[charAt2];
                                    } else {
                                        c = 0;
                                    }
                                    if (c != 0) {
                                        sb.append(c);
                                    } else {
                                        m(this, "Invalid escaped char '" + charAt2 + '\'', 0, 6);
                                        throw null;
                                    }
                                }
                                i3 = r(i4);
                                if (i3 == -1) {
                                    m(this, "Unexpected EOF", i3, 4);
                                    throw null;
                                }
                            } else {
                                m(this, "Expected escape sequence to continue, got EOF", 0, 6);
                                throw null;
                            }
                        } else {
                            i2++;
                            if (i2 >= str2.length()) {
                                sb.append((CharSequence) str2, i3, i2);
                                i3 = r(i2);
                                if (i3 == -1) {
                                    m(this, "Unexpected EOF", i3, 4);
                                    throw null;
                                }
                            } else {
                                continue;
                                charAt = str2.charAt(i2);
                            }
                        }
                        i2 = i3;
                        z = true;
                        charAt = str2.charAt(i2);
                    }
                    if (!z) {
                        str = str2.subSequence(i3, i2).toString();
                    } else {
                        sb.append((CharSequence) str2, i3, i2);
                        String sb2 = sb.toString();
                        sb.setLength(0);
                        str = sb2;
                    }
                    this.b = i2 + 1;
                    return str;
                }
                i2++;
            }
            this.b = g + 1;
            return str2.substring(i, g);
        }
        k();
        n((byte) 1, false);
        throw null;
    }

    public final void h(char c) {
        int i = this.b;
        if (i != -1) {
            String str = (String) this.f;
            while (i < str.length()) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.b = i2;
                    if (charAt == c) {
                        return;
                    }
                    v(c);
                    throw null;
                }
                i = i2;
            }
            this.b = -1;
            v(c);
            throw null;
        }
        v(c);
        throw null;
    }

    public final long i() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d2c.i():long");
    }

    public final String j() {
        String str = (String) this.d;
        if (str != null) {
            str.getClass();
            this.d = null;
            return str;
        }
        return g();
    }

    public final String k() {
        String str;
        StringBuilder sb = (StringBuilder) this.e;
        String str2 = (String) this.f;
        String str3 = (String) this.d;
        if (str3 != null) {
            str3.getClass();
            this.d = null;
            return str3;
        }
        int t = t();
        if (t < str2.length() && t != -1) {
            byte a = lpd.a(str2.charAt(t));
            if (a == 1) {
                return j();
            }
            if (a == 0) {
                boolean z = false;
                while (lpd.a(str2.charAt(t)) == 0) {
                    t++;
                    if (t >= str2.length()) {
                        sb.append((CharSequence) str2, this.b, t);
                        int r = r(t);
                        if (r == -1) {
                            this.b = t;
                            sb.append((CharSequence) str2, 0, 0);
                            String sb2 = sb.toString();
                            sb.setLength(0);
                            return sb2;
                        }
                        t = r;
                        z = true;
                    }
                }
                int i = this.b;
                if (!z) {
                    str = str2.subSequence(i, t).toString();
                } else {
                    sb.append((CharSequence) str2, i, t);
                    String sb3 = sb.toString();
                    sb.setLength(0);
                    str = sb3;
                }
                this.b = t;
                return str;
            }
            m(this, "Expected beginning of the string, but got " + str2.charAt(t), 0, 6);
            throw null;
        }
        m(this, "EOF", t, 4);
        throw null;
    }

    public final void l(int i, String str, String str2) {
        String concat;
        String str3;
        str2.getClass();
        if (str2.length() == 0) {
            concat = "";
        } else {
            concat = "\n".concat(str2);
        }
        StringBuilder l = c00.l(str, " at path: ");
        l.append(((lp) this.c).m());
        l.append(concat);
        String sb = l.toString();
        ((String) this.f).getClass();
        String str4 = sb + "\nJSON input: " + ((Object) hqe.b(i, str3));
        if (i >= 0) {
            str4 = dze.d("Unexpected JSON token at offset ", i, ": ", str4);
        }
        throw new IllegalArgumentException(str4);
    }

    public final void n(byte b, boolean z) {
        String str;
        int i;
        String str2;
        String str3 = (String) this.f;
        if (b == 1) {
            str = "quotation mark '\"'";
        } else if (b == 2) {
            str = "string escape sequence '\\'";
        } else if (b == 4) {
            str = "comma ','";
        } else if (b == 5) {
            str = "colon ':'";
        } else if (b == 6) {
            str = "start of the object '{'";
        } else if (b == 7) {
            str = "end of the object '}'";
        } else if (b == 8) {
            str = "start of the array '['";
        } else if (b == 9) {
            str = "end of the array ']'";
        } else if (b == 10) {
            str = "end of the input";
        } else if (b == Byte.MAX_VALUE) {
            str = "invalid token";
        } else {
            str = "valid token";
        }
        int i2 = this.b;
        if (z) {
            i = i2 - 1;
        } else {
            i = i2;
        }
        if (i2 != str3.length() && i >= 0) {
            str2 = String.valueOf(str3.charAt(i));
        } else {
            str2 = "EOF";
        }
        m(this, c00.j("Expected ", str, ", but had '", str2, "' instead"), i, 4);
        throw null;
    }

    public final int o(int i, CharSequence charSequence) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        m(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, 6);
        throw null;
    }

    public final boolean p(d2c d2cVar, int i) {
        if (Objects.equals(((qa9[]) this.c)[i], ((qa9[]) d2cVar.c)[i]) && Objects.equals(((e74[]) this.d)[i], ((e74[]) d2cVar.d)[i])) {
            return true;
        }
        return false;
    }

    public final boolean q(int i) {
        if (((qa9[]) this.c)[i] != null) {
            return true;
        }
        return false;
    }

    public final int r(int i) {
        if (i < ((String) this.f).length()) {
            return i;
        }
        return -1;
    }

    public final void s(int i, int i2) {
        int[] iArr = (int[]) this.f;
        int i3 = i << 2;
        iArr[i3] = i2;
        iArr[i3 + 1] = i2;
        iArr[i3 + 2] = i2;
        iArr[i3 + 3] = i2;
    }

    public final int t() {
        char charAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.b = i;
        return i;
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder(200);
                sb.append("<<\n mode: ");
                sb.append((pg7) this.c);
                sb.append("\n ecLevel: ");
                sb.append((r44) this.d);
                sb.append("\n version: ");
                sb.append((xdc) this.e);
                sb.append("\n maskPattern: ");
                sb.append(this.b);
                if (((sj0) this.f) == null) {
                    sb.append("\n matrix: null\n");
                } else {
                    sb.append("\n matrix:\n");
                    sb.append((sj0) this.f);
                }
                sb.append(">>\n");
                return sb.toString();
            case 3:
                return "JsonReader(source='" + ((Object) ((String) this.f)) + "', currentPosition=" + this.b + ')';
            default:
                return super.toString();
        }
    }

    public final boolean u() {
        int t = t();
        String str = (String) this.f;
        if (t >= str.length() || t == -1 || str.charAt(t) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public final void v(char c) {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String k = k();
                this.b = i;
                if (ur5.a(k, "null")) {
                    l(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        n(lpd.a(c), true);
        throw null;
    }

    public final void w(int i) {
        nib[] nibVarArr;
        int[] iArr = (int[]) this.e;
        if (iArr[i] != 0) {
            return;
        }
        iArr[i] = 1;
        for (nib nibVar : ((nib[][]) this.d)[i]) {
            w(nibVar.a.b);
            int i2 = this.b;
            this.b = i2 - 1;
            ((nib[]) this.c)[i2] = nibVar;
        }
        iArr[i] = 2;
    }

    @Override
    public final void c(usb usbVar, g84 g84Var, l6c l6cVar) {
    }

    public d2c(int i) {
        this.a = (byte) 1;
        this.b = i;
        int i2 = i << 3;
        this.c = new float[i2];
        this.d = new float[i2];
        this.e = new short[i * 6];
        this.f = new int[i << 2];
        for (short s = 0; s < i; s = (short) (s + 1)) {
            int i3 = s * 6;
            int i4 = s << 2;
            short[] sArr = (short[]) this.e;
            short s2 = (short) i4;
            sArr[i3] = s2;
            sArr[i3 + 1] = (short) (i4 + 1);
            short s3 = (short) (i4 + 2);
            sArr[i3 + 2] = s3;
            sArr[i3 + 3] = s3;
            sArr[i3 + 4] = (short) (i4 + 3);
            sArr[i3 + 5] = s2;
        }
    }

    public d2c(qa9[] qa9VarArr, e74[] e74VarArr, f2c f2cVar, lo loVar) {
        this.a = (byte) 0;
        yve.f(qa9VarArr.length == e74VarArr.length);
        this.c = qa9VarArr;
        this.d = (e74[]) e74VarArr.clone();
        this.e = f2cVar;
        this.f = loVar;
        this.b = qa9VarArr.length;
    }

    public d2c(String str) {
        this.a = (byte) 3;
        str.getClass();
        lp lpVar = new lp((byte) 6, false);
        lpVar.c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        lpVar.d = iArr;
        lpVar.b = -1;
        this.c = lpVar;
        this.e = new StringBuilder();
        this.f = str;
    }

    public d2c(j6c j6cVar, int i) {
        this.a = (byte) 5;
        this.f = j6cVar;
        this.c = new zd1(5, new byte[5]);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.b = i;
    }

    public d2c() {
        this.a = (byte) 2;
    }
}
