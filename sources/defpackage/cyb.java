package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class cyb implements ru9 {
    public final byte a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public cyb(ueb uebVar, seb[] sebVarArr) {
        this.a = (byte) 4;
        this.f = uebVar;
        int length = sebVarArr.length;
        this.c = new seb[length];
        this.b = length - 1;
        int e = uebVar.e() + 1;
        seb[][] sebVarArr2 = new seb[e];
        int[] iArr = new int[e];
        for (seb sebVar : sebVarArr) {
            int i = sebVar.a.a;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < e; i2++) {
            sebVarArr2[i2] = new seb[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (seb sebVar2 : sebVarArr) {
            int i3 = sebVar2.a.a;
            seb[] sebVarArr3 = sebVarArr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            sebVarArr3[i4] = sebVar2;
        }
        this.d = sebVarArr2;
        this.e = new int[((ueb) this.f).e() + 1];
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

    public static void m(cyb cybVar, String str, int i, int i2) {
        String str2;
        if ((i2 & 2) != 0) {
            i = cybVar.b;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        } else {
            str2 = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";
        }
        cybVar.l(i, str, str2);
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
    public final void b(xu7 xu7Var) {
        uob uobVar;
        int i;
        uob uobVar2;
        SparseArray sparseArray;
        int i2;
        qd1 qd1Var;
        int i3;
        m2c a0;
        int i4;
        int i5;
        uob uobVar3;
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        qd1 qd1Var2 = (qd1) this.c;
        j2c j2cVar = (j2c) this.f;
        SparseArray sparseArray3 = j2cVar.h;
        SparseBooleanArray sparseBooleanArray = j2cVar.i;
        dd ddVar = j2cVar.f;
        List list = j2cVar.c;
        byte b = j2cVar.a;
        if (xu7Var.A() == 2) {
            if (b != 1 && b != 2 && j2cVar.n != 1) {
                uobVar = new uob(((uob) list.get(0)).d());
                list.add(uobVar);
            } else {
                uobVar = (uob) list.get(0);
            }
            if ((xu7Var.A() & 128) != 0) {
                xu7Var.O(1);
                int H = xu7Var.H();
                xu7Var.O(3);
                xu7Var.k(0, 2, qd1Var2.b);
                qd1Var2.l(0);
                qd1Var2.n(3);
                j2cVar.t = qd1Var2.f(13);
                xu7Var.k(0, 2, qd1Var2.b);
                qd1Var2.l(0);
                qd1Var2.n(4);
                xu7Var.O(qd1Var2.f(12));
                if (b == 2 && j2cVar.r == null) {
                    m2c a02 = ddVar.a0(21, new ju8(21, null, 0, null, g8c.b));
                    j2cVar.r = a02;
                    if (a02 != null) {
                        a02.c(uobVar, j2cVar.m, new l2c(H, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a = xu7Var.a();
                while (a > 0) {
                    xu7Var.k(0, 5, qd1Var2.b);
                    qd1Var2.l(0);
                    int f = qd1Var2.f(8);
                    qd1Var2.n(3);
                    int f2 = qd1Var2.f(13);
                    qd1Var2.n(4);
                    int f3 = qd1Var2.f(12);
                    int i6 = xu7Var.b;
                    int i7 = i6 + f3;
                    int i8 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i9 = 0;
                    int i10 = a;
                    while (true) {
                        if (xu7Var.b < i7) {
                            int A = xu7Var.A();
                            qd1Var = qd1Var2;
                            int A2 = xu7Var.b + xu7Var.A();
                            if (A2 > i7) {
                                break;
                            }
                            SparseArray sparseArray4 = sparseArray3;
                            if (A == 5) {
                                long C = xu7Var.C();
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
                                uobVar3 = uobVar;
                            } else if (A == 106) {
                                i4 = A2;
                                i5 = H;
                                uobVar3 = uobVar;
                                i8 = 129;
                            } else if (A == 122) {
                                i5 = H;
                                uobVar3 = uobVar;
                                i8 = 135;
                                i4 = A2;
                            } else {
                                if (A == 127) {
                                    int A3 = xu7Var.A();
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
                                    str = xu7Var.y(3, StandardCharsets.UTF_8).trim();
                                    i4 = A2;
                                    i9 = xu7Var.A();
                                    i5 = H;
                                    uobVar3 = uobVar;
                                } else if (A == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (xu7Var.b < A2) {
                                        String trim = xu7Var.y(3, StandardCharsets.UTF_8).trim();
                                        xu7Var.A();
                                        uob uobVar4 = uobVar;
                                        byte[] bArr = new byte[4];
                                        xu7Var.k(0, 4, bArr);
                                        arrayList2.add(new k2c(trim, bArr));
                                        uobVar = uobVar4;
                                        A2 = A2;
                                        H = H;
                                    }
                                    i4 = A2;
                                    i5 = H;
                                    uobVar3 = uobVar;
                                    arrayList = arrayList2;
                                    i8 = 89;
                                } else {
                                    i4 = A2;
                                    i5 = H;
                                    uobVar3 = uobVar;
                                    if (A == 111) {
                                        i8 = 257;
                                    }
                                }
                                i4 = A2;
                                i5 = H;
                                uobVar3 = uobVar;
                            }
                            xu7Var.O(i4 - xu7Var.b);
                            uobVar = uobVar3;
                            qd1Var2 = qd1Var;
                            sparseArray3 = sparseArray4;
                            H = i5;
                        } else {
                            qd1Var = qd1Var2;
                            break;
                        }
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i11 = H;
                    uob uobVar5 = uobVar;
                    xu7Var.N(i7);
                    ju8 ju8Var = new ju8(i8, str, i9, arrayList, Arrays.copyOfRange(xu7Var.a, i6, i7));
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
                            a0 = j2cVar.r;
                        } else {
                            a0 = ddVar.a0(f, ju8Var);
                        }
                        if (b != 2 || f2 < sparseIntArray.get(i3, 8192)) {
                            sparseIntArray.put(i3, f2);
                            sparseArray2.put(i3, a0);
                        }
                    }
                    a = i12;
                    uobVar = uobVar5;
                    qd1Var2 = qd1Var;
                    sparseArray3 = sparseArray5;
                    H = i11;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i13 = H;
                uob uobVar6 = uobVar;
                int size = sparseIntArray.size();
                int i14 = 0;
                while (i14 < size) {
                    int keyAt = sparseIntArray.keyAt(i14);
                    int valueAt = sparseIntArray.valueAt(i14);
                    sparseBooleanArray.put(keyAt, true);
                    j2cVar.j.put(valueAt, true);
                    m2c m2cVar = (m2c) sparseArray2.valueAt(i14);
                    if (m2cVar != null) {
                        if (m2cVar != j2cVar.r) {
                            i2 = i13;
                            uobVar2 = uobVar6;
                            m2cVar.c(uobVar2, j2cVar.m, new l2c(i2, keyAt, 8192));
                        } else {
                            uobVar2 = uobVar6;
                            i2 = i13;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, m2cVar);
                    } else {
                        uobVar2 = uobVar6;
                        sparseArray = sparseArray6;
                        i2 = i13;
                    }
                    i14++;
                    sparseArray6 = sparseArray;
                    i13 = i2;
                    uobVar6 = uobVar2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (b == 2) {
                    if (!j2cVar.o) {
                        j2cVar.m.z();
                        j2cVar.n = 0;
                        j2cVar.o = true;
                        return;
                    }
                    return;
                }
                sparseArray7.remove(this.b);
                if (b == 1) {
                    i = 0;
                } else {
                    i = j2cVar.n - 1;
                }
                j2cVar.n = i;
                if (i == 0) {
                    j2cVar.m.z();
                    j2cVar.o = true;
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
        int g = f9b.g(str2, '\"', i, 4);
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
                                        c = oj1.a[charAt2];
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyb.i():long");
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
            byte a = ukd.a(str2.charAt(t));
            if (a == 1) {
                return j();
            }
            if (a == 0) {
                boolean z = false;
                while (ukd.a(str2.charAt(t)) == 0) {
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
        StringBuilder k = b00.k(str, " at path: ");
        k.append(((kp) this.c).m());
        k.append(concat);
        String sb = k.toString();
        ((String) this.f).getClass();
        String str4 = sb + "\nJSON input: " + ((Object) ple.b(i, str3));
        if (i >= 0) {
            str4 = mue.d("Unexpected JSON token at offset ", i, ": ", str4);
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
        m(this, b00.i("Expected ", str, ", but had '", str2, "' instead"), i, 4);
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

    public final boolean p(cyb cybVar, int i) {
        if (Objects.equals(((d79[]) this.c)[i], ((d79[]) cybVar.c)[i]) && Objects.equals(((k64[]) this.d)[i], ((k64[]) cybVar.d)[i])) {
            return true;
        }
        return false;
    }

    public final boolean q(int i) {
        if (((d79[]) this.c)[i] != null) {
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
                sb.append((ge7) this.c);
                sb.append("\n ecLevel: ");
                sb.append((w34) this.d);
                sb.append("\n version: ");
                sb.append((x9c) this.e);
                sb.append("\n maskPattern: ");
                sb.append(this.b);
                if (((rj0) this.f) == null) {
                    sb.append("\n matrix: null\n");
                } else {
                    sb.append("\n matrix:\n");
                    sb.append((rj0) this.f);
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
                if (rp5.a(k, "null")) {
                    l(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        n(ukd.a(c), true);
        throw null;
    }

    public final void w(int i) {
        seb[] sebVarArr;
        int[] iArr = (int[]) this.e;
        if (iArr[i] != 0) {
            return;
        }
        iArr[i] = 1;
        for (seb sebVar : ((seb[][]) this.d)[i]) {
            w(sebVar.a.b);
            int i2 = this.b;
            this.b = i2 - 1;
            ((seb[]) this.c)[i2] = sebVar;
        }
        iArr[i] = 2;
    }

    @Override
    public final void c(uob uobVar, l74 l74Var, l2c l2cVar) {
    }

    public cyb(int i) {
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

    public cyb(d79[] d79VarArr, k64[] k64VarArr, eyb eybVar, ko koVar) {
        this.a = (byte) 0;
        gre.f(d79VarArr.length == k64VarArr.length);
        this.c = d79VarArr;
        this.d = (k64[]) k64VarArr.clone();
        this.e = eybVar;
        this.f = koVar;
        this.b = d79VarArr.length;
    }

    public cyb(String str) {
        this.a = (byte) 3;
        str.getClass();
        kp kpVar = new kp((byte) 6, false);
        kpVar.c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        kpVar.d = iArr;
        kpVar.b = -1;
        this.c = kpVar;
        this.e = new StringBuilder();
        this.f = str;
    }

    public cyb(j2c j2cVar, int i) {
        this.a = (byte) 5;
        this.f = j2cVar;
        this.c = new qd1(5, new byte[5]);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.b = i;
    }

    public cyb() {
        this.a = (byte) 2;
    }
}
