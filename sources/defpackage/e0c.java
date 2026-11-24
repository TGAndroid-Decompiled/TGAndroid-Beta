package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class e0c implements uw9 {
    public final byte a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public e0c(ugb ugbVar, sgb[] sgbVarArr) {
        this.a = (byte) 4;
        this.f = ugbVar;
        int length = sgbVarArr.length;
        this.c = new sgb[length];
        this.b = length - 1;
        int e = ugbVar.e() + 1;
        sgb[][] sgbVarArr2 = new sgb[e];
        int[] iArr = new int[e];
        for (sgb sgbVar : sgbVarArr) {
            int i = sgbVar.a.a;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < e; i2++) {
            sgbVarArr2[i2] = new sgb[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (sgb sgbVar2 : sgbVarArr) {
            int i3 = sgbVar2.a.a;
            sgb[] sgbVarArr3 = sgbVarArr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            sgbVarArr3[i4] = sgbVar2;
        }
        this.d = sgbVarArr2;
        this.e = new int[((ugb) this.f).e() + 1];
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

    public static void m(e0c e0cVar, String str, int i, int i2) {
        String str2;
        if ((i2 & 2) != 0) {
            i = e0cVar.b;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        } else {
            str2 = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";
        }
        e0cVar.l(i, str, str2);
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
    public final void b(yw7 yw7Var) {
        vqb vqbVar;
        int i;
        vqb vqbVar2;
        SparseArray sparseArray;
        int i2;
        ye1 ye1Var;
        int i3;
        m4c b0;
        int i4;
        int i5;
        vqb vqbVar3;
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        ye1 ye1Var2 = (ye1) this.c;
        j4c j4cVar = (j4c) this.f;
        SparseArray sparseArray3 = j4cVar.h;
        SparseBooleanArray sparseBooleanArray = j4cVar.i;
        de deVar = j4cVar.f;
        List list = j4cVar.c;
        byte b = j4cVar.a;
        if (yw7Var.A() == 2) {
            if (b != 1 && b != 2 && j4cVar.n != 1) {
                vqbVar = new vqb(((vqb) list.get(0)).d());
                list.add(vqbVar);
            } else {
                vqbVar = (vqb) list.get(0);
            }
            if ((yw7Var.A() & 128) != 0) {
                yw7Var.O(1);
                int H = yw7Var.H();
                yw7Var.O(3);
                yw7Var.k(0, 2, ye1Var2.b);
                ye1Var2.l(0);
                ye1Var2.n(3);
                j4cVar.t = ye1Var2.f(13);
                yw7Var.k(0, 2, ye1Var2.b);
                ye1Var2.l(0);
                ye1Var2.n(4);
                yw7Var.O(ye1Var2.f(12));
                if (b == 2 && j4cVar.r == null) {
                    m4c b02 = deVar.b0(21, new kw8(21, null, 0, null, hac.b));
                    j4cVar.r = b02;
                    if (b02 != null) {
                        b02.c(vqbVar, j4cVar.m, new l4c(H, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a = yw7Var.a();
                while (a > 0) {
                    yw7Var.k(0, 5, ye1Var2.b);
                    ye1Var2.l(0);
                    int f = ye1Var2.f(8);
                    ye1Var2.n(3);
                    int f2 = ye1Var2.f(13);
                    ye1Var2.n(4);
                    int f3 = ye1Var2.f(12);
                    int i6 = yw7Var.b;
                    int i7 = i6 + f3;
                    int i8 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i9 = 0;
                    int i10 = a;
                    while (true) {
                        if (yw7Var.b < i7) {
                            int A = yw7Var.A();
                            ye1Var = ye1Var2;
                            int A2 = yw7Var.b + yw7Var.A();
                            if (A2 > i7) {
                                break;
                            }
                            SparseArray sparseArray4 = sparseArray3;
                            if (A == 5) {
                                long C = yw7Var.C();
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
                                vqbVar3 = vqbVar;
                            } else if (A == 106) {
                                i4 = A2;
                                i5 = H;
                                vqbVar3 = vqbVar;
                                i8 = 129;
                            } else if (A == 122) {
                                i5 = H;
                                vqbVar3 = vqbVar;
                                i8 = 135;
                                i4 = A2;
                            } else {
                                if (A == 127) {
                                    int A3 = yw7Var.A();
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
                                    str = yw7Var.y(3, StandardCharsets.UTF_8).trim();
                                    i4 = A2;
                                    i9 = yw7Var.A();
                                    i5 = H;
                                    vqbVar3 = vqbVar;
                                } else if (A == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (yw7Var.b < A2) {
                                        String trim = yw7Var.y(3, StandardCharsets.UTF_8).trim();
                                        yw7Var.A();
                                        vqb vqbVar4 = vqbVar;
                                        byte[] bArr = new byte[4];
                                        yw7Var.k(0, 4, bArr);
                                        arrayList2.add(new k4c(trim, bArr));
                                        vqbVar = vqbVar4;
                                        A2 = A2;
                                        H = H;
                                    }
                                    i4 = A2;
                                    i5 = H;
                                    vqbVar3 = vqbVar;
                                    arrayList = arrayList2;
                                    i8 = 89;
                                } else {
                                    i4 = A2;
                                    i5 = H;
                                    vqbVar3 = vqbVar;
                                    if (A == 111) {
                                        i8 = 257;
                                    }
                                }
                                i4 = A2;
                                i5 = H;
                                vqbVar3 = vqbVar;
                            }
                            yw7Var.O(i4 - yw7Var.b);
                            vqbVar = vqbVar3;
                            ye1Var2 = ye1Var;
                            sparseArray3 = sparseArray4;
                            H = i5;
                        } else {
                            ye1Var = ye1Var2;
                            break;
                        }
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i11 = H;
                    vqb vqbVar5 = vqbVar;
                    yw7Var.N(i7);
                    kw8 kw8Var = new kw8(i8, str, i9, arrayList, Arrays.copyOfRange(yw7Var.a, i6, i7));
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
                            b0 = j4cVar.r;
                        } else {
                            b0 = deVar.b0(f, kw8Var);
                        }
                        if (b != 2 || f2 < sparseIntArray.get(i3, 8192)) {
                            sparseIntArray.put(i3, f2);
                            sparseArray2.put(i3, b0);
                        }
                    }
                    a = i12;
                    vqbVar = vqbVar5;
                    ye1Var2 = ye1Var;
                    sparseArray3 = sparseArray5;
                    H = i11;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i13 = H;
                vqb vqbVar6 = vqbVar;
                int size = sparseIntArray.size();
                int i14 = 0;
                while (i14 < size) {
                    int keyAt = sparseIntArray.keyAt(i14);
                    int valueAt = sparseIntArray.valueAt(i14);
                    sparseBooleanArray.put(keyAt, true);
                    j4cVar.j.put(valueAt, true);
                    m4c m4cVar = (m4c) sparseArray2.valueAt(i14);
                    if (m4cVar != null) {
                        if (m4cVar != j4cVar.r) {
                            i2 = i13;
                            vqbVar2 = vqbVar6;
                            m4cVar.c(vqbVar2, j4cVar.m, new l4c(i2, keyAt, 8192));
                        } else {
                            vqbVar2 = vqbVar6;
                            i2 = i13;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, m4cVar);
                    } else {
                        vqbVar2 = vqbVar6;
                        sparseArray = sparseArray6;
                        i2 = i13;
                    }
                    i14++;
                    sparseArray6 = sparseArray;
                    i13 = i2;
                    vqbVar6 = vqbVar2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (b == 2) {
                    if (!j4cVar.o) {
                        j4cVar.m.B();
                        j4cVar.n = 0;
                        j4cVar.o = true;
                        return;
                    }
                    return;
                }
                sparseArray7.remove(this.b);
                if (b == 1) {
                    i = 0;
                } else {
                    i = j4cVar.n - 1;
                }
                j4cVar.n = i;
                if (i == 0) {
                    j4cVar.m.B();
                    j4cVar.o = true;
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
        int g = hbb.g(str2, '\"', i, 4);
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
                                        c = wk1.a[charAt2];
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e0c.i():long");
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
            byte a = wmd.a(str2.charAt(t));
            if (a == 1) {
                return j();
            }
            if (a == 0) {
                boolean z = false;
                while (wmd.a(str2.charAt(t)) == 0) {
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
        StringBuilder k = b10.k(str, " at path: ");
        k.append(((kq) this.c).m());
        k.append(concat);
        String sb = k.toString();
        ((String) this.f).getClass();
        String str4 = sb + "\nJSON input: " + ((Object) rne.b(i, str3));
        if (i >= 0) {
            str4 = mle.d("Unexpected JSON token at offset ", i, ": ", str4);
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
        m(this, b10.i("Expected ", str, ", but had '", str2, "' instead"), i, 4);
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

    public final boolean p(e0c e0cVar, int i) {
        if (Objects.equals(((f99[]) this.c)[i], ((f99[]) e0cVar.c)[i]) && Objects.equals(((t74[]) this.d)[i], ((t74[]) e0cVar.d)[i])) {
            return true;
        }
        return false;
    }

    public final boolean q(int i) {
        if (((f99[]) this.c)[i] != null) {
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
                sb.append((ig7) this.c);
                sb.append("\n ecLevel: ");
                sb.append((g54) this.d);
                sb.append("\n version: ");
                sb.append((ybc) this.e);
                sb.append("\n maskPattern: ");
                sb.append(this.b);
                if (((rk0) this.f) == null) {
                    sb.append("\n matrix: null\n");
                } else {
                    sb.append("\n matrix:\n");
                    sb.append((rk0) this.f);
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
                if (rr5.a(k, "null")) {
                    l(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        n(wmd.a(c), true);
        throw null;
    }

    public final void w(int i) {
        sgb[] sgbVarArr;
        int[] iArr = (int[]) this.e;
        if (iArr[i] != 0) {
            return;
        }
        iArr[i] = 1;
        for (sgb sgbVar : ((sgb[][]) this.d)[i]) {
            w(sgbVar.a.b);
            int i2 = this.b;
            this.b = i2 - 1;
            ((sgb[]) this.c)[i2] = sgbVar;
        }
        iArr[i] = 2;
    }

    @Override
    public final void c(vqb vqbVar, u84 u84Var, l4c l4cVar) {
    }

    public e0c(int i) {
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

    public e0c(f99[] f99VarArr, t74[] t74VarArr, g0c g0cVar, kp kpVar) {
        this.a = (byte) 0;
        jte.f(f99VarArr.length == t74VarArr.length);
        this.c = f99VarArr;
        this.d = (t74[]) t74VarArr.clone();
        this.e = g0cVar;
        this.f = kpVar;
        this.b = f99VarArr.length;
    }

    public e0c(String str) {
        this.a = (byte) 3;
        str.getClass();
        kq kqVar = new kq((byte) 6, false);
        kqVar.c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        kqVar.d = iArr;
        kqVar.b = -1;
        this.c = kqVar;
        this.e = new StringBuilder();
        this.f = str;
    }

    public e0c(j4c j4cVar, int i) {
        this.a = (byte) 5;
        this.f = j4cVar;
        this.c = new ye1(5, new byte[5]);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.b = i;
    }

    public e0c() {
        this.a = (byte) 2;
    }
}
