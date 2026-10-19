package e0;

import android.app.Notification;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.uz0;
public final class f0 implements j4.a0 {
    public final int f8096a;
    public int f8097b;
    public Object f8098c;
    public Object d;
    public Object e;
    public Object f8099f;

    public f0() {
        this.f8096a = 2;
    }

    public static void c(float[] fArr, int i10, float f7, float f10, float f11, float f12) {
        int i11 = i10 * 8;
        fArr[i11] = f7;
        fArr[i11 + 1] = f10;
        fArr[i11 + 2] = f11;
        fArr[i11 + 3] = f10;
        fArr[i11 + 4] = f11;
        fArr[i11 + 5] = f12;
        fArr[i11 + 6] = f7;
        fArr[i11 + 7] = f12;
    }

    public static void d(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override
    public void a(e2.x xVar) {
        e2.k0 k0Var;
        int i10;
        e2.k0 k0Var2;
        SparseArray sparseArray;
        int i11;
        a4.g gVar;
        int i12;
        char c10;
        j4.g0 a2;
        int i13;
        int i14;
        e2.k0 k0Var3;
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        a4.g gVar2 = (a4.g) this.f8098c;
        j4.d0 d0Var = (j4.d0) this.f8099f;
        SparseArray sparseArray3 = d0Var.h;
        SparseBooleanArray sparseBooleanArray = d0Var.f14021i;
        j4.f fVar = d0Var.f14019f;
        List list = d0Var.f14018c;
        int i15 = d0Var.f14016a;
        if (xVar.A() == 2) {
            if (i15 != 1 && i15 != 2 && d0Var.f14026n != 1) {
                k0Var = new e2.k0(((e2.k0) list.get(0)).d());
                list.add(k0Var);
            } else {
                k0Var = (e2.k0) list.get(0);
            }
            if ((xVar.A() & 128) != 0) {
                xVar.O(1);
                int H = xVar.H();
                xVar.O(3);
                xVar.k(0, 2, gVar2.f260b);
                gVar2.m(0);
                gVar2.o(3);
                d0Var.f14032t = gVar2.g(13);
                xVar.k(0, 2, gVar2.f260b);
                gVar2.m(0);
                gVar2.o(4);
                xVar.O(gVar2.g(12));
                if (i15 == 2 && d0Var.f14030r == null) {
                    j4.g0 a10 = fVar.a(21, new j6.l(21, null, 0, null, e2.m0.f8255b));
                    d0Var.f14030r = a10;
                    if (a10 != null) {
                        a10.b(k0Var, d0Var.f14025m, new j4.f0(H, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a11 = xVar.a();
                while (a11 > 0) {
                    xVar.k(0, 5, gVar2.f260b);
                    gVar2.m(0);
                    int g10 = gVar2.g(8);
                    gVar2.o(3);
                    int g11 = gVar2.g(13);
                    gVar2.o(4);
                    int g12 = gVar2.g(12);
                    int i16 = xVar.f8294b;
                    int i17 = i16 + g12;
                    int i18 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i19 = 0;
                    int i20 = a11;
                    while (true) {
                        if (xVar.f8294b < i17) {
                            int A = xVar.A();
                            gVar = gVar2;
                            int A2 = xVar.f8294b + xVar.A();
                            if (A2 > i17) {
                                break;
                            }
                            SparseArray sparseArray4 = sparseArray3;
                            if (A == 5) {
                                long C = xVar.C();
                                if (C == 1094921523) {
                                    i18 = 129;
                                } else if (C == 1161904947) {
                                    i18 = 135;
                                } else {
                                    if (C != 1094921524) {
                                        if (C == 1212503619) {
                                            i18 = 36;
                                        }
                                    }
                                    i18 = 172;
                                }
                                i13 = A2;
                                i14 = H;
                                k0Var3 = k0Var;
                            } else if (A == 106) {
                                i13 = A2;
                                i14 = H;
                                k0Var3 = k0Var;
                                i18 = 129;
                            } else if (A == 122) {
                                i14 = H;
                                k0Var3 = k0Var;
                                i18 = 135;
                                i13 = A2;
                            } else {
                                if (A == 127) {
                                    int A3 = xVar.A();
                                    if (A3 != 21) {
                                        if (A3 == 14) {
                                            i18 = 136;
                                        } else if (A3 == 33) {
                                            i18 = 139;
                                        }
                                    }
                                    i18 = 172;
                                } else if (A == 123) {
                                    i18 = 138;
                                } else if (A == 10) {
                                    str = xVar.y(3, StandardCharsets.UTF_8).trim();
                                    i13 = A2;
                                    i19 = xVar.A();
                                    i14 = H;
                                    k0Var3 = k0Var;
                                } else {
                                    if (A == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (xVar.f8294b < A2) {
                                            String trim = xVar.y(3, StandardCharsets.UTF_8).trim();
                                            xVar.A();
                                            e2.k0 k0Var4 = k0Var;
                                            byte[] bArr = new byte[4];
                                            xVar.k(0, 4, bArr);
                                            arrayList2.add(new j4.e0(trim, bArr));
                                            k0Var = k0Var4;
                                            A2 = A2;
                                            H = H;
                                        }
                                        i13 = A2;
                                        i14 = H;
                                        k0Var3 = k0Var;
                                        arrayList = arrayList2;
                                        i18 = 89;
                                    } else {
                                        i13 = A2;
                                        i14 = H;
                                        k0Var3 = k0Var;
                                        if (A == 111) {
                                            i18 = 257;
                                        }
                                    }
                                    xVar.O(i13 - xVar.f8294b);
                                    k0Var = k0Var3;
                                    gVar2 = gVar;
                                    sparseArray3 = sparseArray4;
                                    H = i14;
                                }
                                i13 = A2;
                                i14 = H;
                                k0Var3 = k0Var;
                            }
                            xVar.O(i13 - xVar.f8294b);
                            k0Var = k0Var3;
                            gVar2 = gVar;
                            sparseArray3 = sparseArray4;
                            H = i14;
                        } else {
                            gVar = gVar2;
                            break;
                        }
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i21 = H;
                    e2.k0 k0Var5 = k0Var;
                    xVar.N(i17);
                    j6.l lVar = new j6.l(i18, str, i19, arrayList, Arrays.copyOfRange(xVar.f8293a, i16, i17));
                    if (g10 == 6 || g10 == 5) {
                        g10 = i18;
                    }
                    int i22 = i20 - (g12 + 5);
                    if (i15 == 2) {
                        i12 = g10;
                    } else {
                        i12 = g11;
                    }
                    if (sparseBooleanArray.get(i12)) {
                        c10 = 21;
                    } else {
                        c10 = 21;
                        if (i15 == 2 && g10 == 21) {
                            a2 = d0Var.f14030r;
                        } else {
                            a2 = fVar.a(g10, lVar);
                        }
                        if (i15 != 2 || g11 < sparseIntArray.get(i12, 8192)) {
                            sparseIntArray.put(i12, g11);
                            sparseArray2.put(i12, a2);
                        }
                    }
                    a11 = i22;
                    k0Var = k0Var5;
                    gVar2 = gVar;
                    sparseArray3 = sparseArray5;
                    H = i21;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i23 = H;
                e2.k0 k0Var6 = k0Var;
                int size = sparseIntArray.size();
                int i24 = 0;
                while (i24 < size) {
                    int keyAt = sparseIntArray.keyAt(i24);
                    int valueAt = sparseIntArray.valueAt(i24);
                    sparseBooleanArray.put(keyAt, true);
                    d0Var.f14022j.put(valueAt, true);
                    j4.g0 g0Var = (j4.g0) sparseArray2.valueAt(i24);
                    if (g0Var != null) {
                        if (g0Var != d0Var.f14030r) {
                            i11 = i23;
                            k0Var2 = k0Var6;
                            g0Var.b(k0Var2, d0Var.f14025m, new j4.f0(i11, keyAt, 8192));
                        } else {
                            k0Var2 = k0Var6;
                            i11 = i23;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, g0Var);
                    } else {
                        k0Var2 = k0Var6;
                        sparseArray = sparseArray6;
                        i11 = i23;
                    }
                    i24++;
                    sparseArray6 = sparseArray;
                    i23 = i11;
                    k0Var6 = k0Var2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i15 == 2) {
                    if (!d0Var.f14027o) {
                        d0Var.f14025m.H();
                        d0Var.f14026n = 0;
                        d0Var.f14027o = true;
                        return;
                    }
                    return;
                }
                sparseArray7.remove(this.f8097b);
                if (i15 == 1) {
                    i10 = 0;
                } else {
                    i10 = d0Var.f14026n - 1;
                }
                d0Var.f14026n = i10;
                if (i10 == 0) {
                    d0Var.f14025m.H();
                    d0Var.f14027o = true;
                }
            }
        }
    }

    public void e(int i10, int i11) {
        int[] iArr = (int[]) this.f8099f;
        int i12 = i10 * 4;
        iArr[i12] = i11;
        iArr[i12 + 1] = i11;
        iArr[i12 + 2] = i11;
        iArr[i12 + 3] = i11;
    }

    public void f(int i10) {
        sz0[] sz0VarArr;
        int[] iArr = (int[]) this.e;
        if (iArr[i10] != 0) {
            return;
        }
        iArr[i10] = 1;
        for (sz0 sz0Var : ((sz0[][]) this.d)[i10]) {
            f(sz0Var.f30366a.f32788b);
            int i11 = this.f8097b;
            this.f8097b = i11 - 1;
            ((sz0[]) this.f8098c)[i11] = sz0Var;
        }
        iArr[i10] = 2;
    }

    public String toString() {
        switch (this.f8096a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(200);
                sb2.append("<<\n mode: ");
                sb2.append((ic.e) this.f8098c);
                sb2.append("\n ecLevel: ");
                sb2.append((ic.c) this.d);
                sb2.append("\n version: ");
                sb2.append((ic.f) this.e);
                sb2.append("\n maskPattern: ");
                sb2.append(this.f8097b);
                if (((kc.b) this.f8099f) == null) {
                    sb2.append("\n matrix: null\n");
                } else {
                    sb2.append("\n matrix:\n");
                    sb2.append((kc.b) this.f8099f);
                }
                sb2.append(">>\n");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public f0(int i10) {
        this.f8096a = 3;
        this.f8097b = i10;
        int i11 = i10 * 8;
        this.f8098c = new float[i11];
        this.d = new float[i11];
        this.e = new short[i10 * 6];
        this.f8099f = new int[i10 * 4];
        for (short s10 = 0; s10 < i10; s10 = (short) (s10 + 1)) {
            int i12 = s10 * 6;
            int i13 = s10 * 4;
            short[] sArr = (short[]) this.e;
            short s11 = (short) i13;
            sArr[i12] = s11;
            sArr[i12 + 1] = (short) (i13 + 1);
            short s12 = (short) (i13 + 2);
            sArr[i12 + 2] = s12;
            sArr[i12 + 3] = s12;
            sArr[i12 + 4] = (short) (i13 + 3);
            sArr[i12 + 5] = s11;
        }
    }

    public f0(e0.q r23) {
        throw new UnsupportedOperationException("Method not decompiled: e0.f0.<init>(e0.q):void");
    }

    @Override
    public void b(e2.k0 k0Var, c3.q qVar, j4.f0 f0Var) {
    }

    public f0(c3.a0 a0Var, c3.l0 l0Var, byte[] bArr, bi.a[] aVarArr, int i10) {
        this.f8096a = 5;
        this.f8098c = a0Var;
        this.d = l0Var;
        this.e = bArr;
        this.f8099f = aVarArr;
        this.f8097b = i10;
    }

    public f0(j4.d0 d0Var, int i10) {
        this.f8096a = 1;
        this.f8099f = d0Var;
        this.f8098c = new a4.g(new byte[5], 5);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.f8097b = i10;
    }

    public f0(uz0 uz0Var, sz0[] sz0VarArr) {
        this.f8096a = 4;
        this.f8099f = uz0Var;
        int length = sz0VarArr.length;
        this.f8098c = new sz0[length];
        this.f8097b = length - 1;
        int e = uz0Var.e() + 1;
        sz0[][] sz0VarArr2 = new sz0[e];
        int[] iArr = new int[e];
        for (sz0 sz0Var : sz0VarArr) {
            int i10 = sz0Var.f30366a.f32787a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < e; i11++) {
            sz0VarArr2[i11] = new sz0[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (sz0 sz0Var2 : sz0VarArr) {
            int i12 = sz0Var2.f30366a.f32787a;
            sz0[] sz0VarArr3 = sz0VarArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            sz0VarArr3[i13] = sz0Var2;
        }
        this.d = sz0VarArr2;
        this.e = new int[((uz0) this.f8099f).e() + 1];
    }
}
