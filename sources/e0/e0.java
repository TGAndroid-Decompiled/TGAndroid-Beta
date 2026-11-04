package e0;

import android.app.Notification;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import b8.kg;
import g2.n0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.zw0;
public class e0 implements l4.a0 {
    public final int f9224a;
    public int f9225b;
    public Object f9226c;
    public Object d;
    public Object f9227e;
    public Object f9228f;

    public e0() {
        this.f9224a = 1;
    }

    public static void d(float[] fArr, int i3, float f10, float f11, float f12, float f13) {
        int i10 = i3 * 8;
        fArr[i10] = f10;
        fArr[i10 + 1] = f11;
        fArr[i10 + 2] = f12;
        fArr[i10 + 3] = f11;
        fArr[i10 + 4] = f12;
        fArr[i10 + 5] = f13;
        fArr[i10 + 6] = f10;
        fArr[i10 + 7] = f13;
    }

    public static void n(e0 e0Var, String str, int i3, int i10) {
        String str2;
        if ((i10 & 2) != 0) {
            i3 = e0Var.f9225b;
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        } else {
            str2 = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";
        }
        e0Var.m(i3, str, str2);
        throw null;
    }

    public static void s(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public int a(int i3, CharSequence charSequence) {
        int i10 = i3 + 4;
        if (i10 >= charSequence.length()) {
            this.f9225b = i3;
            if (i10 < charSequence.length()) {
                return a(this.f9225b, charSequence);
            }
            n(this, "Unexpected EOF during unicode escape", 0, 6);
            throw null;
        }
        ((StringBuilder) this.f9227e).append((char) (p(i3 + 3, charSequence) + (p(i3, charSequence) << 12) + (p(i3 + 1, charSequence) << 8) + (p(i3 + 2, charSequence) << 4)));
        return i10;
    }

    @Override
    public void c(g2.y yVar) {
        g2.l0 l0Var;
        int i3;
        g2.l0 l0Var2;
        SparseArray sparseArray;
        int i10;
        c4.f fVar;
        int i11;
        char c2;
        l4.g0 a10;
        int i12;
        int i13;
        g2.l0 l0Var3;
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f9227e;
        c4.f fVar2 = (c4.f) this.f9226c;
        l4.d0 d0Var = (l4.d0) this.f9228f;
        SparseArray sparseArray3 = d0Var.h;
        SparseBooleanArray sparseBooleanArray = d0Var.f17783i;
        l4.f fVar3 = d0Var.f17781f;
        List list = d0Var.f17779c;
        int i14 = d0Var.f17777a;
        if (yVar.A() == 2) {
            if (i14 != 1 && i14 != 2 && d0Var.f17788n != 1) {
                l0Var = new g2.l0(((g2.l0) list.get(0)).d());
                list.add(l0Var);
            } else {
                l0Var = (g2.l0) list.get(0);
            }
            if ((yVar.A() & 128) != 0) {
                yVar.O(1);
                int H = yVar.H();
                yVar.O(3);
                yVar.k(0, 2, (byte[]) fVar2.f4190b);
                fVar2.J(0);
                fVar2.L(3);
                d0Var.f17794t = fVar2.j(13);
                yVar.k(0, 2, (byte[]) fVar2.f4190b);
                fVar2.J(0);
                fVar2.L(4);
                yVar.O(fVar2.j(12));
                if (i14 == 2 && d0Var.f17792r == null) {
                    l4.g0 a11 = fVar3.a(21, new l6.n(21, null, 0, null, n0.f11874b));
                    d0Var.f17792r = a11;
                    if (a11 != null) {
                        a11.b(l0Var, d0Var.f17787m, new l4.f0(H, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a12 = yVar.a();
                while (a12 > 0) {
                    yVar.k(0, 5, (byte[]) fVar2.f4190b);
                    fVar2.J(0);
                    int j10 = fVar2.j(8);
                    fVar2.L(3);
                    int j11 = fVar2.j(13);
                    fVar2.L(4);
                    int j12 = fVar2.j(12);
                    int i15 = yVar.f11924b;
                    int i16 = i15 + j12;
                    int i17 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i18 = 0;
                    int i19 = a12;
                    while (true) {
                        if (yVar.f11924b < i16) {
                            int A = yVar.A();
                            fVar = fVar2;
                            int A2 = yVar.f11924b + yVar.A();
                            if (A2 > i16) {
                                break;
                            }
                            SparseArray sparseArray4 = sparseArray3;
                            if (A == 5) {
                                long C = yVar.C();
                                if (C == 1094921523) {
                                    i17 = 129;
                                } else if (C == 1161904947) {
                                    i17 = 135;
                                } else {
                                    if (C != 1094921524) {
                                        if (C == 1212503619) {
                                            i17 = 36;
                                        }
                                    }
                                    i17 = 172;
                                }
                                i12 = A2;
                                i13 = H;
                                l0Var3 = l0Var;
                            } else if (A == 106) {
                                i12 = A2;
                                i13 = H;
                                l0Var3 = l0Var;
                                i17 = 129;
                            } else if (A == 122) {
                                i13 = H;
                                l0Var3 = l0Var;
                                i17 = 135;
                                i12 = A2;
                            } else {
                                if (A == 127) {
                                    int A3 = yVar.A();
                                    if (A3 != 21) {
                                        if (A3 == 14) {
                                            i17 = 136;
                                        } else if (A3 == 33) {
                                            i17 = 139;
                                        }
                                    }
                                    i17 = 172;
                                } else if (A == 123) {
                                    i17 = 138;
                                } else if (A == 10) {
                                    str = yVar.y(3, StandardCharsets.UTF_8).trim();
                                    i12 = A2;
                                    i18 = yVar.A();
                                    i13 = H;
                                    l0Var3 = l0Var;
                                } else {
                                    if (A == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (yVar.f11924b < A2) {
                                            String trim = yVar.y(3, StandardCharsets.UTF_8).trim();
                                            yVar.A();
                                            g2.l0 l0Var4 = l0Var;
                                            byte[] bArr = new byte[4];
                                            yVar.k(0, 4, bArr);
                                            arrayList2.add(new l4.e0(trim, bArr));
                                            l0Var = l0Var4;
                                            A2 = A2;
                                            H = H;
                                        }
                                        i12 = A2;
                                        i13 = H;
                                        l0Var3 = l0Var;
                                        arrayList = arrayList2;
                                        i17 = 89;
                                    } else {
                                        i12 = A2;
                                        i13 = H;
                                        l0Var3 = l0Var;
                                        if (A == 111) {
                                            i17 = 257;
                                        }
                                    }
                                    yVar.O(i12 - yVar.f11924b);
                                    l0Var = l0Var3;
                                    fVar2 = fVar;
                                    sparseArray3 = sparseArray4;
                                    H = i13;
                                }
                                i12 = A2;
                                i13 = H;
                                l0Var3 = l0Var;
                            }
                            yVar.O(i12 - yVar.f11924b);
                            l0Var = l0Var3;
                            fVar2 = fVar;
                            sparseArray3 = sparseArray4;
                            H = i13;
                        } else {
                            fVar = fVar2;
                            break;
                        }
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i20 = H;
                    g2.l0 l0Var5 = l0Var;
                    yVar.N(i16);
                    l6.n nVar = new l6.n(i17, str, i18, arrayList, Arrays.copyOfRange(yVar.f11923a, i15, i16));
                    if (j10 == 6 || j10 == 5) {
                        j10 = i17;
                    }
                    int i21 = i19 - (j12 + 5);
                    if (i14 == 2) {
                        i11 = j10;
                    } else {
                        i11 = j11;
                    }
                    if (sparseBooleanArray.get(i11)) {
                        c2 = 21;
                    } else {
                        c2 = 21;
                        if (i14 == 2 && j10 == 21) {
                            a10 = d0Var.f17792r;
                        } else {
                            a10 = fVar3.a(j10, nVar);
                        }
                        if (i14 != 2 || j11 < sparseIntArray.get(i11, 8192)) {
                            sparseIntArray.put(i11, j11);
                            sparseArray2.put(i11, a10);
                        }
                    }
                    a12 = i21;
                    l0Var = l0Var5;
                    fVar2 = fVar;
                    sparseArray3 = sparseArray5;
                    H = i20;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i22 = H;
                g2.l0 l0Var6 = l0Var;
                int size = sparseIntArray.size();
                int i23 = 0;
                while (i23 < size) {
                    int keyAt = sparseIntArray.keyAt(i23);
                    int valueAt = sparseIntArray.valueAt(i23);
                    sparseBooleanArray.put(keyAt, true);
                    d0Var.f17784j.put(valueAt, true);
                    l4.g0 g0Var = (l4.g0) sparseArray2.valueAt(i23);
                    if (g0Var != null) {
                        if (g0Var != d0Var.f17792r) {
                            i10 = i22;
                            l0Var2 = l0Var6;
                            g0Var.b(l0Var2, d0Var.f17787m, new l4.f0(i10, keyAt, 8192));
                        } else {
                            l0Var2 = l0Var6;
                            i10 = i22;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, g0Var);
                    } else {
                        l0Var2 = l0Var6;
                        sparseArray = sparseArray6;
                        i10 = i22;
                    }
                    i23++;
                    sparseArray6 = sparseArray;
                    i22 = i10;
                    l0Var6 = l0Var2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i14 == 2) {
                    if (!d0Var.f17789o) {
                        d0Var.f17787m.L();
                        d0Var.f17788n = 0;
                        d0Var.f17789o = true;
                        return;
                    }
                    return;
                }
                sparseArray7.remove(this.f9225b);
                if (i14 == 1) {
                    i3 = 0;
                } else {
                    i3 = d0Var.f17788n - 1;
                }
                d0Var.f17788n = i3;
                if (i3 == 0) {
                    d0Var.f17787m.L();
                    d0Var.f17789o = true;
                }
            }
        }
    }

    public boolean e() {
        int i3 = this.f9225b;
        if (i3 == -1) {
            return false;
        }
        String str = (String) this.f9228f;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f9225b = i3;
                if (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') {
                    return false;
                }
                return true;
            }
            i3++;
        }
        this.f9225b = i3;
        return false;
    }

    public void f(int i3, String str) {
        String str2 = (String) this.f9228f;
        if (str2.length() - i3 >= str.length()) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (str.charAt(i10) != (str2.charAt(i3 + i10) | ' ')) {
                    n(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, 6);
                    throw null;
                }
            }
            this.f9225b = str.length() + i3;
            return;
        }
        n(this, "Unexpected end of boolean literal", 0, 6);
        throw null;
    }

    public String g() {
        String l10;
        char c2;
        StringBuilder sb2 = (StringBuilder) this.f9227e;
        String str = (String) this.f9228f;
        h('\"');
        int i3 = this.f9225b;
        int h = ud.d.h('\"', i3, 4, str);
        if (h != -1) {
            int i10 = i3;
            while (i10 < h) {
                if (str.charAt(i10) == '\\') {
                    int i11 = this.f9225b;
                    char charAt = str.charAt(i10);
                    boolean z10 = false;
                    while (charAt != '\"') {
                        if (charAt == '\\') {
                            sb2.append((CharSequence) str, i11, i10);
                            int r5 = r(i10 + 1);
                            if (r5 != -1) {
                                int i12 = r5 + 1;
                                char charAt2 = str.charAt(r5);
                                if (charAt2 == 'u') {
                                    i12 = a(i12, str);
                                } else {
                                    if (charAt2 < 'u') {
                                        c2 = ne.c.f20346a[charAt2];
                                    } else {
                                        c2 = 0;
                                    }
                                    if (c2 != 0) {
                                        sb2.append(c2);
                                    } else {
                                        n(this, "Invalid escaped char '" + charAt2 + '\'', 0, 6);
                                        throw null;
                                    }
                                }
                                i11 = r(i12);
                                if (i11 == -1) {
                                    n(this, "Unexpected EOF", i11, 4);
                                    throw null;
                                }
                            } else {
                                n(this, "Expected escape sequence to continue, got EOF", 0, 6);
                                throw null;
                            }
                        } else {
                            i10++;
                            if (i10 >= str.length()) {
                                sb2.append((CharSequence) str, i11, i10);
                                i11 = r(i10);
                                if (i11 == -1) {
                                    n(this, "Unexpected EOF", i11, 4);
                                    throw null;
                                }
                            } else {
                                continue;
                                charAt = str.charAt(i10);
                            }
                        }
                        i10 = i11;
                        z10 = true;
                        charAt = str.charAt(i10);
                    }
                    if (!z10) {
                        l10 = str.subSequence(i11, i10).toString();
                    } else {
                        l10 = l(i11, i10);
                    }
                    this.f9225b = i10 + 1;
                    return l10;
                }
                i10++;
            }
            this.f9225b = h + 1;
            String substring = str.substring(i3, h);
            kotlin.jvm.internal.j.d(substring, "substring(...)");
            return substring;
        }
        k();
        o((byte) 1, false);
        throw null;
    }

    public void h(char c2) {
        int i3 = this.f9225b;
        if (i3 != -1) {
            String str = (String) this.f9228f;
            while (i3 < str.length()) {
                int i10 = i3 + 1;
                char charAt = str.charAt(i3);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f9225b = i10;
                    if (charAt == c2) {
                        return;
                    }
                    w(c2);
                    throw null;
                }
                i3 = i10;
            }
            this.f9225b = -1;
            w(c2);
            throw null;
        }
        w(c2);
        throw null;
    }

    public long i() {
        throw new UnsupportedOperationException("Method not decompiled: e0.e0.i():long");
    }

    public String j() {
        String str = (String) this.d;
        if (str != null) {
            kotlin.jvm.internal.j.b(str);
            this.d = null;
            return str;
        }
        return g();
    }

    public String k() {
        String l10;
        String str = (String) this.f9228f;
        String str2 = (String) this.d;
        if (str2 != null) {
            kotlin.jvm.internal.j.b(str2);
            this.d = null;
            return str2;
        }
        int u10 = u();
        if (u10 < str.length() && u10 != -1) {
            byte b10 = ne.f.b(str.charAt(u10));
            if (b10 == 1) {
                return j();
            }
            if (b10 == 0) {
                boolean z10 = false;
                while (ne.f.b(str.charAt(u10)) == 0) {
                    u10++;
                    if (u10 >= str.length()) {
                        ((StringBuilder) this.f9227e).append((CharSequence) str, this.f9225b, u10);
                        int r5 = r(u10);
                        if (r5 == -1) {
                            this.f9225b = u10;
                            return l(0, 0);
                        }
                        u10 = r5;
                        z10 = true;
                    }
                }
                if (!z10) {
                    l10 = str.subSequence(this.f9225b, u10).toString();
                } else {
                    l10 = l(this.f9225b, u10);
                }
                this.f9225b = u10;
                return l10;
            }
            n(this, "Expected beginning of the string, but got " + str.charAt(u10), 0, 6);
            throw null;
        }
        n(this, "EOF", u10, 4);
        throw null;
    }

    public String l(int i3, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f9227e;
        sb2.append((CharSequence) ((String) this.f9228f), i3, i10);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "toString(...)");
        sb2.setLength(0);
        return sb3;
    }

    public void m(int i3, String message, String hint) {
        String concat;
        kotlin.jvm.internal.j.e(message, "message");
        kotlin.jvm.internal.j.e(hint, "hint");
        if (hint.length() == 0) {
            concat = "";
        } else {
            concat = "\n".concat(hint);
        }
        StringBuilder h = t4.c.h(message, " at path: ");
        h.append(((kg) this.f9226c).n());
        h.append(concat);
        String message2 = h.toString();
        String input = (String) this.f9228f;
        kotlin.jvm.internal.j.e(message2, "message");
        kotlin.jvm.internal.j.e(input, "input");
        String message3 = message2 + "\nJSON input: " + ((Object) ne.f.d(i3, input));
        kotlin.jvm.internal.j.e(message3, "message");
        if (i3 >= 0) {
            message3 = "Unexpected JSON token at offset " + i3 + ": " + message3;
        }
        kotlin.jvm.internal.j.e(message3, "message");
        throw new IllegalArgumentException(message3);
    }

    public void o(byte b10, boolean z10) {
        String str;
        int i3;
        String str2;
        String str3 = (String) this.f9228f;
        if (b10 == 1) {
            str = "quotation mark '\"'";
        } else if (b10 == 2) {
            str = "string escape sequence '\\'";
        } else if (b10 == 4) {
            str = "comma ','";
        } else if (b10 == 5) {
            str = "colon ':'";
        } else if (b10 == 6) {
            str = "start of the object '{'";
        } else if (b10 == 7) {
            str = "end of the object '}'";
        } else if (b10 == 8) {
            str = "start of the array '['";
        } else if (b10 == 9) {
            str = "end of the array ']'";
        } else if (b10 == 10) {
            str = "end of the input";
        } else if (b10 == Byte.MAX_VALUE) {
            str = "invalid token";
        } else {
            str = "valid token";
        }
        if (z10) {
            i3 = this.f9225b - 1;
        } else {
            i3 = this.f9225b;
        }
        if (this.f9225b != str3.length() && i3 >= 0) {
            str2 = String.valueOf(str3.charAt(i3));
        } else {
            str2 = "EOF";
        }
        n(this, f1.q("Expected ", str, ", but had '", str2, "' instead"), i3, 4);
        throw null;
    }

    public int p(int i3, CharSequence charSequence) {
        char charAt = charSequence.charAt(i3);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        n(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, 6);
        throw null;
    }

    public void q() {
        ((Canvas) this.f9226c).restore();
        ((Matrix) this.d).set((Matrix) f1.o(1, (ArrayList) this.f9227e));
        this.f9225b--;
    }

    public int r(int i3) {
        if (i3 < ((String) this.f9228f).length()) {
            return i3;
        }
        return -1;
    }

    public void t(int i3, int i10) {
        int[] iArr = (int[]) this.f9228f;
        int i11 = i3 * 4;
        iArr[i11] = i10;
        iArr[i11 + 1] = i10;
        iArr[i11 + 2] = i10;
        iArr[i11 + 3] = i10;
    }

    public String toString() {
        switch (this.f9224a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(200);
                sb2.append("<<\n mode: ");
                sb2.append((dc.d) this.f9226c);
                sb2.append("\n ecLevel: ");
                sb2.append((dc.b) this.d);
                sb2.append("\n version: ");
                sb2.append((dc.e) this.f9227e);
                sb2.append("\n maskPattern: ");
                sb2.append(this.f9225b);
                if (((d4.d) this.f9228f) == null) {
                    sb2.append("\n matrix: null\n");
                } else {
                    sb2.append("\n matrix:\n");
                    sb2.append((d4.d) this.f9228f);
                }
                sb2.append(">>\n");
                return sb2.toString();
            case 2:
            default:
                return super.toString();
            case 3:
                return "JsonReader(source='" + ((Object) ((String) this.f9228f)) + "', currentPosition=" + this.f9225b + ')';
        }
    }

    public int u() {
        char charAt;
        int i3 = this.f9225b;
        if (i3 == -1) {
            return i3;
        }
        String str = (String) this.f9228f;
        while (i3 < str.length() && ((charAt = str.charAt(i3)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i3++;
        }
        this.f9225b = i3;
        return i3;
    }

    public boolean v() {
        int u10 = u();
        String str = (String) this.f9228f;
        if (u10 >= str.length() || u10 == -1 || str.charAt(u10) != ',') {
            return false;
        }
        this.f9225b++;
        return true;
    }

    public void w(char c2) {
        int i3 = this.f9225b;
        if (i3 > 0 && c2 == '\"') {
            try {
                this.f9225b = i3 - 1;
                String k10 = k();
                this.f9225b = i3;
                if (kotlin.jvm.internal.j.a(k10, "null")) {
                    m(this.f9225b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f9225b = i3;
                throw th2;
            }
        }
        o(ne.f.b(c2), true);
        throw null;
    }

    public void x(int i3) {
        zw0[] zw0VarArr;
        int[] iArr = (int[]) this.f9227e;
        if (iArr[i3] != 0) {
            return;
        }
        iArr[i3] = 1;
        for (zw0 zw0Var : ((zw0[][]) this.d)[i3]) {
            x(zw0Var.f41141a.f33881b);
            int i10 = this.f9225b;
            this.f9225b = i10 - 1;
            ((zw0[]) this.f9226c)[i10] = zw0Var;
        }
        iArr[i3] = 2;
    }

    public e0(int i3) {
        this.f9224a = 4;
        this.f9225b = i3;
        int i10 = i3 * 8;
        this.f9226c = new float[i10];
        this.d = new float[i10];
        this.f9227e = new short[i3 * 6];
        this.f9228f = new int[i3 * 4];
        for (short s6 = 0; s6 < i3; s6 = (short) (s6 + 1)) {
            int i11 = s6 * 6;
            int i12 = s6 * 4;
            short[] sArr = (short[]) this.f9227e;
            short s10 = (short) i12;
            sArr[i11] = s10;
            sArr[i11 + 1] = (short) (i12 + 1);
            short s11 = (short) (i12 + 2);
            sArr[i11 + 2] = s11;
            sArr[i11 + 3] = s11;
            sArr[i11 + 4] = (short) (i12 + 3);
            sArr[i11 + 5] = s10;
        }
    }

    public e0(e0.q r23) {
        throw new UnsupportedOperationException("Method not decompiled: e0.e0.<init>(e0.q):void");
    }

    @Override
    public void b(g2.l0 l0Var, e3.q qVar, l4.f0 f0Var) {
    }

    public e0(String source) {
        this.f9224a = 3;
        kotlin.jvm.internal.j.e(source, "source");
        kg kgVar = new kg((char) 0, 16);
        kgVar.f2723c = new Object[8];
        int[] iArr = new int[8];
        for (int i3 = 0; i3 < 8; i3++) {
            iArr[i3] = -1;
        }
        kgVar.d = iArr;
        kgVar.f2722b = -1;
        this.f9226c = kgVar;
        this.f9227e = new StringBuilder();
        this.f9228f = source;
    }

    public e0(e3.z zVar, e3.k0 k0Var, byte[] bArr, di.a[] aVarArr, int i3) {
        this.f9224a = 7;
        this.f9226c = zVar;
        this.d = k0Var;
        this.f9227e = bArr;
        this.f9228f = aVarArr;
        this.f9225b = i3;
    }

    public e0(Canvas canvas) {
        this.f9224a = 6;
        this.d = new Matrix();
        this.f9227e = new ArrayList();
        this.f9228f = new ArrayList();
        this.f9226c = canvas;
    }

    public e0(l4.d0 d0Var, int i3) {
        this.f9224a = 2;
        this.f9228f = d0Var;
        this.f9226c = new c4.f(new byte[5], 5);
        this.d = new SparseArray();
        this.f9227e = new SparseIntArray();
        this.f9225b = i3;
    }

    public e0(bx0 bx0Var, zw0[] zw0VarArr) {
        this.f9224a = 5;
        this.f9228f = bx0Var;
        int length = zw0VarArr.length;
        this.f9226c = new zw0[length];
        this.f9225b = length - 1;
        int e10 = bx0Var.e() + 1;
        zw0[][] zw0VarArr2 = new zw0[e10];
        int[] iArr = new int[e10];
        for (zw0 zw0Var : zw0VarArr) {
            int i3 = zw0Var.f41141a.f33880a;
            iArr[i3] = iArr[i3] + 1;
        }
        for (int i10 = 0; i10 < e10; i10++) {
            zw0VarArr2[i10] = new zw0[iArr[i10]];
        }
        Arrays.fill(iArr, 0);
        for (zw0 zw0Var2 : zw0VarArr) {
            int i11 = zw0Var2.f41141a.f33880a;
            zw0[] zw0VarArr3 = zw0VarArr2[i11];
            int i12 = iArr[i11];
            iArr[i11] = i12 + 1;
            zw0VarArr3[i12] = zw0Var2;
        }
        this.d = zw0VarArr2;
        this.f9227e = new int[((bx0) this.f9228f).e() + 1];
    }
}
