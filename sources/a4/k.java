package a4;

import a8.wa;
import android.app.Notification;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import f3.l0;
import f3.q;
import h2.k0;
import h2.m0;
import h2.x;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m4.a0;
import m4.e0;
import m4.f0;
import m4.g0;
import m4.h0;
import m6.n;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.dx0;
public class k implements a0 {
    public final int f190a;
    public int f191b;
    public Object f192c;
    public Object d;
    public Object f193e;
    public Object f194f;

    public k() {
        this.f190a = 2;
    }

    public static void d(float[] fArr, int i7, float f10, float f11, float f12, float f13) {
        int i10 = i7 * 8;
        fArr[i10] = f10;
        fArr[i10 + 1] = f11;
        fArr[i10 + 2] = f12;
        fArr[i10 + 3] = f11;
        fArr[i10 + 4] = f12;
        fArr[i10 + 5] = f13;
        fArr[i10 + 6] = f10;
        fArr[i10 + 7] = f13;
    }

    public static void n(k kVar, String str, int i7, int i10) {
        String str2;
        if ((i10 & 2) != 0) {
            i7 = kVar.f191b;
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        } else {
            str2 = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";
        }
        kVar.m(i7, str, str2);
        throw null;
    }

    public static void s(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public int a(int i7, CharSequence charSequence) {
        int i10 = i7 + 4;
        if (i10 >= charSequence.length()) {
            this.f191b = i7;
            if (i10 < charSequence.length()) {
                return a(this.f191b, charSequence);
            }
            n(this, "Unexpected EOF during unicode escape", 0, 6);
            throw null;
        }
        ((StringBuilder) this.f193e).append((char) (p(i7 + 3, charSequence) + (p(i7, charSequence) << 12) + (p(i7 + 1, charSequence) << 8) + (p(i7 + 2, charSequence) << 4)));
        return i10;
    }

    @Override
    public void c(x xVar) {
        k0 k0Var;
        int i7;
        k0 k0Var2;
        SparseArray sparseArray;
        int i10;
        d4.f fVar;
        int i11;
        char c10;
        h0 a10;
        int i12;
        int i13;
        k0 k0Var3;
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f193e;
        d4.f fVar2 = (d4.f) this.f192c;
        e0 e0Var = (e0) this.f194f;
        SparseArray sparseArray3 = e0Var.h;
        SparseBooleanArray sparseBooleanArray = e0Var.f19640i;
        m4.f fVar3 = e0Var.f19638f;
        List list = e0Var.f19636c;
        int i14 = e0Var.f19634a;
        if (xVar.A() == 2) {
            if (i14 != 1 && i14 != 2 && e0Var.f19645n != 1) {
                k0Var = new k0(((k0) list.get(0)).d());
                list.add(k0Var);
            } else {
                k0Var = (k0) list.get(0);
            }
            if ((xVar.A() & 128) != 0) {
                xVar.O(1);
                int H = xVar.H();
                xVar.O(3);
                xVar.k(0, 2, (byte[]) fVar2.f8162b);
                fVar2.J(0);
                fVar2.L(3);
                e0Var.f19651t = fVar2.j(13);
                xVar.k(0, 2, (byte[]) fVar2.f8162b);
                fVar2.J(0);
                fVar2.L(4);
                xVar.O(fVar2.j(12));
                if (i14 == 2 && e0Var.f19649r == null) {
                    h0 a11 = fVar3.a(21, new n(21, null, 0, null, m0.f14113b));
                    e0Var.f19649r = a11;
                    if (a11 != null) {
                        a11.b(k0Var, e0Var.f19644m, new g0(H, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a12 = xVar.a();
                while (a12 > 0) {
                    xVar.k(0, 5, (byte[]) fVar2.f8162b);
                    fVar2.J(0);
                    int j3 = fVar2.j(8);
                    fVar2.L(3);
                    int j10 = fVar2.j(13);
                    fVar2.L(4);
                    int j11 = fVar2.j(12);
                    int i15 = xVar.f14163b;
                    int i16 = i15 + j11;
                    int i17 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i18 = 0;
                    int i19 = a12;
                    while (true) {
                        if (xVar.f14163b < i16) {
                            int A = xVar.A();
                            fVar = fVar2;
                            int A2 = xVar.f14163b + xVar.A();
                            if (A2 > i16) {
                                break;
                            }
                            SparseArray sparseArray4 = sparseArray3;
                            if (A == 5) {
                                long C = xVar.C();
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
                                k0Var3 = k0Var;
                            } else if (A == 106) {
                                i12 = A2;
                                i13 = H;
                                k0Var3 = k0Var;
                                i17 = 129;
                            } else if (A == 122) {
                                i13 = H;
                                k0Var3 = k0Var;
                                i17 = 135;
                                i12 = A2;
                            } else {
                                if (A == 127) {
                                    int A3 = xVar.A();
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
                                    str = xVar.y(3, StandardCharsets.UTF_8).trim();
                                    i12 = A2;
                                    i18 = xVar.A();
                                    i13 = H;
                                    k0Var3 = k0Var;
                                } else {
                                    if (A == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (xVar.f14163b < A2) {
                                            String trim = xVar.y(3, StandardCharsets.UTF_8).trim();
                                            xVar.A();
                                            k0 k0Var4 = k0Var;
                                            byte[] bArr = new byte[4];
                                            xVar.k(0, 4, bArr);
                                            arrayList2.add(new f0(trim, bArr));
                                            k0Var = k0Var4;
                                            A2 = A2;
                                            H = H;
                                        }
                                        i12 = A2;
                                        i13 = H;
                                        k0Var3 = k0Var;
                                        arrayList = arrayList2;
                                        i17 = 89;
                                    } else {
                                        i12 = A2;
                                        i13 = H;
                                        k0Var3 = k0Var;
                                        if (A == 111) {
                                            i17 = 257;
                                        }
                                    }
                                    xVar.O(i12 - xVar.f14163b);
                                    k0Var = k0Var3;
                                    fVar2 = fVar;
                                    sparseArray3 = sparseArray4;
                                    H = i13;
                                }
                                i12 = A2;
                                i13 = H;
                                k0Var3 = k0Var;
                            }
                            xVar.O(i12 - xVar.f14163b);
                            k0Var = k0Var3;
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
                    k0 k0Var5 = k0Var;
                    xVar.N(i16);
                    n nVar = new n(i17, str, i18, arrayList, Arrays.copyOfRange(xVar.f14162a, i15, i16));
                    if (j3 == 6 || j3 == 5) {
                        j3 = i17;
                    }
                    int i21 = i19 - (j11 + 5);
                    if (i14 == 2) {
                        i11 = j3;
                    } else {
                        i11 = j10;
                    }
                    if (sparseBooleanArray.get(i11)) {
                        c10 = 21;
                    } else {
                        c10 = 21;
                        if (i14 == 2 && j3 == 21) {
                            a10 = e0Var.f19649r;
                        } else {
                            a10 = fVar3.a(j3, nVar);
                        }
                        if (i14 != 2 || j10 < sparseIntArray.get(i11, 8192)) {
                            sparseIntArray.put(i11, j10);
                            sparseArray2.put(i11, a10);
                        }
                    }
                    a12 = i21;
                    k0Var = k0Var5;
                    fVar2 = fVar;
                    sparseArray3 = sparseArray5;
                    H = i20;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i22 = H;
                k0 k0Var6 = k0Var;
                int size = sparseIntArray.size();
                int i23 = 0;
                while (i23 < size) {
                    int keyAt = sparseIntArray.keyAt(i23);
                    int valueAt = sparseIntArray.valueAt(i23);
                    sparseBooleanArray.put(keyAt, true);
                    e0Var.f19641j.put(valueAt, true);
                    h0 h0Var = (h0) sparseArray2.valueAt(i23);
                    if (h0Var != null) {
                        if (h0Var != e0Var.f19649r) {
                            i10 = i22;
                            k0Var2 = k0Var6;
                            h0Var.b(k0Var2, e0Var.f19644m, new g0(i10, keyAt, 8192));
                        } else {
                            k0Var2 = k0Var6;
                            i10 = i22;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, h0Var);
                    } else {
                        k0Var2 = k0Var6;
                        sparseArray = sparseArray6;
                        i10 = i22;
                    }
                    i23++;
                    sparseArray6 = sparseArray;
                    i22 = i10;
                    k0Var6 = k0Var2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i14 == 2) {
                    if (!e0Var.f19646o) {
                        e0Var.f19644m.U0();
                        e0Var.f19645n = 0;
                        e0Var.f19646o = true;
                        return;
                    }
                    return;
                }
                sparseArray7.remove(this.f191b);
                if (i14 == 1) {
                    i7 = 0;
                } else {
                    i7 = e0Var.f19645n - 1;
                }
                e0Var.f19645n = i7;
                if (i7 == 0) {
                    e0Var.f19644m.U0();
                    e0Var.f19646o = true;
                }
            }
        }
    }

    public boolean e() {
        int i7 = this.f191b;
        if (i7 == -1) {
            return false;
        }
        String str = (String) this.f194f;
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f191b = i7;
                if (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') {
                    return false;
                }
                return true;
            }
            i7++;
        }
        this.f191b = i7;
        return false;
    }

    public void f(int i7, String str) {
        String str2 = (String) this.f194f;
        if (str2.length() - i7 >= str.length()) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (str.charAt(i10) != (str2.charAt(i7 + i10) | ' ')) {
                    n(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, 6);
                    throw null;
                }
            }
            this.f191b = str.length() + i7;
            return;
        }
        n(this, "Unexpected end of boolean literal", 0, 6);
        throw null;
    }

    public String g() {
        String l10;
        char c10;
        StringBuilder sb2 = (StringBuilder) this.f193e;
        String str = (String) this.f194f;
        h('\"');
        int i7 = this.f191b;
        int h = xd.d.h('\"', i7, 4, str);
        if (h != -1) {
            int i10 = i7;
            while (i10 < h) {
                if (str.charAt(i10) == '\\') {
                    int i11 = this.f191b;
                    char charAt = str.charAt(i10);
                    boolean z9 = false;
                    while (charAt != '\"') {
                        if (charAt == '\\') {
                            sb2.append((CharSequence) str, i11, i10);
                            int r10 = r(i10 + 1);
                            if (r10 != -1) {
                                int i12 = r10 + 1;
                                char charAt2 = str.charAt(r10);
                                if (charAt2 == 'u') {
                                    i12 = a(i12, str);
                                } else {
                                    if (charAt2 < 'u') {
                                        c10 = qe.c.f54103a[charAt2];
                                    } else {
                                        c10 = 0;
                                    }
                                    if (c10 != 0) {
                                        sb2.append(c10);
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
                        z9 = true;
                        charAt = str.charAt(i10);
                    }
                    if (!z9) {
                        l10 = str.subSequence(i11, i10).toString();
                    } else {
                        l10 = l(i11, i10);
                    }
                    this.f191b = i10 + 1;
                    return l10;
                }
                i10++;
            }
            this.f191b = h + 1;
            String substring = str.substring(i7, h);
            kotlin.jvm.internal.j.d(substring, "substring(...)");
            return substring;
        }
        k();
        o((byte) 1, false);
        throw null;
    }

    public void h(char c10) {
        int i7 = this.f191b;
        if (i7 != -1) {
            String str = (String) this.f194f;
            while (i7 < str.length()) {
                int i10 = i7 + 1;
                char charAt = str.charAt(i7);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f191b = i10;
                    if (charAt == c10) {
                        return;
                    }
                    w(c10);
                    throw null;
                }
                i7 = i10;
            }
            this.f191b = -1;
            w(c10);
            throw null;
        }
        w(c10);
        throw null;
    }

    public long i() {
        throw new UnsupportedOperationException("Method not decompiled: a4.k.i():long");
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
        String str = (String) this.f194f;
        String str2 = (String) this.d;
        if (str2 != null) {
            kotlin.jvm.internal.j.b(str2);
            this.d = null;
            return str2;
        }
        int u10 = u();
        if (u10 < str.length() && u10 != -1) {
            byte b10 = qe.f.b(str.charAt(u10));
            if (b10 == 1) {
                return j();
            }
            if (b10 == 0) {
                boolean z9 = false;
                while (qe.f.b(str.charAt(u10)) == 0) {
                    u10++;
                    if (u10 >= str.length()) {
                        ((StringBuilder) this.f193e).append((CharSequence) str, this.f191b, u10);
                        int r10 = r(u10);
                        if (r10 == -1) {
                            this.f191b = u10;
                            return l(0, 0);
                        }
                        u10 = r10;
                        z9 = true;
                    }
                }
                if (!z9) {
                    l10 = str.subSequence(this.f191b, u10).toString();
                } else {
                    l10 = l(this.f191b, u10);
                }
                this.f191b = u10;
                return l10;
            }
            n(this, "Expected beginning of the string, but got " + str.charAt(u10), 0, 6);
            throw null;
        }
        n(this, "EOF", u10, 4);
        throw null;
    }

    public String l(int i7, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f193e;
        sb2.append((CharSequence) ((String) this.f194f), i7, i10);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "toString(...)");
        sb2.setLength(0);
        return sb3;
    }

    public void m(int i7, String message, String hint) {
        String concat;
        kotlin.jvm.internal.j.e(message, "message");
        kotlin.jvm.internal.j.e(hint, "hint");
        if (hint.length() == 0) {
            concat = "";
        } else {
            concat = "\n".concat(hint);
        }
        StringBuilder j3 = rf.b.j(message, " at path: ");
        j3.append(((wa) this.f192c).m());
        j3.append(concat);
        String message2 = j3.toString();
        String input = (String) this.f194f;
        kotlin.jvm.internal.j.e(message2, "message");
        kotlin.jvm.internal.j.e(input, "input");
        String message3 = message2 + "\nJSON input: " + ((Object) qe.f.d(i7, input));
        kotlin.jvm.internal.j.e(message3, "message");
        if (i7 >= 0) {
            message3 = "Unexpected JSON token at offset " + i7 + ": " + message3;
        }
        kotlin.jvm.internal.j.e(message3, "message");
        throw new IllegalArgumentException(message3);
    }

    public void o(byte b10, boolean z9) {
        String str;
        int i7;
        String str2;
        String str3 = (String) this.f194f;
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
        if (z9) {
            i7 = this.f191b - 1;
        } else {
            i7 = this.f191b;
        }
        if (this.f191b != str3.length() && i7 >= 0) {
            str2 = String.valueOf(str3.charAt(i7));
        } else {
            str2 = "EOF";
        }
        n(this, f1.m("Expected ", str, ", but had '", str2, "' instead"), i7, 4);
        throw null;
    }

    public int p(int i7, CharSequence charSequence) {
        char charAt = charSequence.charAt(i7);
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
        ((Canvas) this.f192c).restore();
        ((Matrix) this.d).set((Matrix) f1.k(1, (ArrayList) this.f193e));
        this.f191b--;
    }

    public int r(int i7) {
        if (i7 < ((String) this.f194f).length()) {
            return i7;
        }
        return -1;
    }

    public void t(int i7, int i10) {
        int[] iArr = (int[]) this.f194f;
        int i11 = i7 * 4;
        iArr[i11] = i10;
        iArr[i11 + 1] = i10;
        iArr[i11 + 2] = i10;
        iArr[i11 + 3] = i10;
    }

    public String toString() {
        switch (this.f190a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(200);
                sb2.append("<<\n mode: ");
                sb2.append((gc.d) this.f192c);
                sb2.append("\n ecLevel: ");
                sb2.append((gc.b) this.d);
                sb2.append("\n version: ");
                sb2.append((gc.e) this.f193e);
                sb2.append("\n maskPattern: ");
                sb2.append(this.f191b);
                if (((cc.c) this.f194f) == null) {
                    sb2.append("\n matrix: null\n");
                } else {
                    sb2.append("\n matrix:\n");
                    sb2.append((cc.c) this.f194f);
                }
                sb2.append(">>\n");
                return sb2.toString();
            case 7:
                return "JsonReader(source='" + ((Object) ((String) this.f194f)) + "', currentPosition=" + this.f191b + ')';
            default:
                return super.toString();
        }
    }

    public int u() {
        char charAt;
        int i7 = this.f191b;
        if (i7 == -1) {
            return i7;
        }
        String str = (String) this.f194f;
        while (i7 < str.length() && ((charAt = str.charAt(i7)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i7++;
        }
        this.f191b = i7;
        return i7;
    }

    public boolean v() {
        int u10 = u();
        String str = (String) this.f194f;
        if (u10 >= str.length() || u10 == -1 || str.charAt(u10) != ',') {
            return false;
        }
        this.f191b++;
        return true;
    }

    public void w(char c10) {
        int i7 = this.f191b;
        if (i7 > 0 && c10 == '\"') {
            try {
                this.f191b = i7 - 1;
                String k10 = k();
                this.f191b = i7;
                if (kotlin.jvm.internal.j.a(k10, "null")) {
                    m(this.f191b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f191b = i7;
                throw th2;
            }
        }
        o(qe.f.b(c10), true);
        throw null;
    }

    public void x(int i7) {
        bx0[] bx0VarArr;
        int[] iArr = (int[]) this.f193e;
        if (iArr[i7] != 0) {
            return;
        }
        iArr[i7] = 1;
        for (bx0 bx0Var : ((bx0[][]) this.d)[i7]) {
            x(bx0Var.f32443a.f34404b);
            int i10 = this.f191b;
            this.f191b = i10 - 1;
            ((bx0[]) this.f192c)[i10] = bx0Var;
        }
        iArr[i7] = 2;
    }

    public k(int i7) {
        this.f190a = 4;
        this.f191b = i7;
        int i10 = i7 * 8;
        this.f192c = new float[i10];
        this.d = new float[i10];
        this.f193e = new short[i7 * 6];
        this.f194f = new int[i7 * 4];
        for (short s5 = 0; s5 < i7; s5 = (short) (s5 + 1)) {
            int i11 = s5 * 6;
            int i12 = s5 * 4;
            short[] sArr = (short[]) this.f193e;
            short s9 = (short) i12;
            sArr[i11] = s9;
            sArr[i11 + 1] = (short) (i12 + 1);
            short s10 = (short) (i12 + 2);
            sArr[i11 + 2] = s10;
            sArr[i11 + 3] = s10;
            sArr[i11 + 4] = (short) (i12 + 3);
            sArr[i11 + 5] = s9;
        }
    }

    public k(e0.q r23) {
        throw new UnsupportedOperationException("Method not decompiled: a4.k.<init>(e0.q):void");
    }

    @Override
    public void b(k0 k0Var, q qVar, g0 g0Var) {
    }

    public k(String source) {
        this.f190a = 7;
        kotlin.jvm.internal.j.e(source, "source");
        wa waVar = new wa((char) 0, 21);
        waVar.f701c = new Object[8];
        int[] iArr = new int[8];
        for (int i7 = 0; i7 < 8; i7++) {
            iArr[i7] = -1;
        }
        waVar.d = iArr;
        waVar.f700b = -1;
        this.f192c = waVar;
        this.f193e = new StringBuilder();
        this.f194f = source;
    }

    public k(f3.a0 a0Var, l0 l0Var, byte[] bArr, ci.a[] aVarArr, int i7) {
        this.f190a = 0;
        this.f192c = a0Var;
        this.d = l0Var;
        this.f193e = bArr;
        this.f194f = aVarArr;
        this.f191b = i7;
    }

    public k(Canvas canvas) {
        this.f190a = 6;
        this.d = new Matrix();
        this.f193e = new ArrayList();
        this.f194f = new ArrayList();
        this.f192c = canvas;
    }

    public k(e0 e0Var, int i7) {
        this.f190a = 3;
        this.f194f = e0Var;
        this.f192c = new d4.f(new byte[5], 5);
        this.d = new SparseArray();
        this.f193e = new SparseIntArray();
        this.f191b = i7;
    }

    public k(dx0 dx0Var, bx0[] bx0VarArr) {
        this.f190a = 5;
        this.f194f = dx0Var;
        int length = bx0VarArr.length;
        this.f192c = new bx0[length];
        this.f191b = length - 1;
        int e10 = dx0Var.e() + 1;
        bx0[][] bx0VarArr2 = new bx0[e10];
        int[] iArr = new int[e10];
        for (bx0 bx0Var : bx0VarArr) {
            int i7 = bx0Var.f32443a.f34403a;
            iArr[i7] = iArr[i7] + 1;
        }
        for (int i10 = 0; i10 < e10; i10++) {
            bx0VarArr2[i10] = new bx0[iArr[i10]];
        }
        Arrays.fill(iArr, 0);
        for (bx0 bx0Var2 : bx0VarArr) {
            int i11 = bx0Var2.f32443a.f34403a;
            bx0[] bx0VarArr3 = bx0VarArr2[i11];
            int i12 = iArr[i11];
            iArr[i11] = i12 + 1;
            bx0VarArr3[i12] = bx0Var2;
        }
        this.d = bx0VarArr2;
        this.f193e = new int[((dx0) this.f194f).e() + 1];
    }
}
