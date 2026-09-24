package e0;

import android.app.Notification;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.kz0;
public final class i0 implements j4.a0 {
    public int f7771a;
    public final Object f7772b;
    public final Object f7773c;
    public final Object d;
    public final Object e;

    public i0(int i10) {
        this.f7771a = i10;
        int i11 = i10 * 8;
        this.f7772b = new float[i11];
        this.f7773c = new float[i11];
        this.d = new short[i10 * 6];
        this.e = new int[i10 * 4];
        for (short s10 = 0; s10 < i10; s10 = (short) (s10 + 1)) {
            int i12 = s10 * 6;
            int i13 = s10 * 4;
            short[] sArr = (short[]) this.d;
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
    public void a(e2.v vVar) {
        e2.b0 b0Var;
        int i10;
        e2.b0 b0Var2;
        SparseArray sparseArray;
        int i11;
        a4.h hVar;
        int i12;
        j4.g0 a2;
        int i13;
        int i14;
        e2.b0 b0Var3;
        SparseArray sparseArray2 = (SparseArray) this.f7773c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.d;
        a4.h hVar2 = (a4.h) this.f7772b;
        j4.d0 d0Var = (j4.d0) this.e;
        SparseArray sparseArray3 = d0Var.h;
        SparseBooleanArray sparseBooleanArray = d0Var.f12635i;
        j4.f fVar = d0Var.f12633f;
        List list = d0Var.f12632c;
        int i15 = d0Var.f12630a;
        if (vVar.x() == 2) {
            if (i15 != 1 && i15 != 2 && d0Var.f12640n != 1) {
                b0Var = new e2.b0(((e2.b0) list.get(0)).d());
                list.add(b0Var);
            } else {
                b0Var = (e2.b0) list.get(0);
            }
            if ((vVar.x() & 128) != 0) {
                vVar.K(1);
                int D = vVar.D();
                vVar.K(3);
                vVar.h(0, 2, hVar2.f256b);
                hVar2.q(0);
                hVar2.t(3);
                d0Var.f12646t = hVar2.i(13);
                vVar.h(0, 2, hVar2.f256b);
                hVar2.q(0);
                hVar2.t(4);
                vVar.K(hVar2.i(12));
                if (i15 == 2 && d0Var.f12644r == null) {
                    j4.g0 a10 = fVar.a(21, new j6.l(21, null, 0, null, e2.d0.f7871b));
                    d0Var.f12644r = a10;
                    if (a10 != null) {
                        a10.b(b0Var, d0Var.f12639m, new j4.f0(D, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a11 = vVar.a();
                while (a11 > 0) {
                    vVar.h(0, 5, hVar2.f256b);
                    hVar2.q(0);
                    int i16 = hVar2.i(8);
                    hVar2.t(3);
                    int i17 = hVar2.i(13);
                    hVar2.t(4);
                    int i18 = hVar2.i(12);
                    int i19 = vVar.f7917b;
                    int i20 = i19 + i18;
                    int i21 = a11;
                    String str = null;
                    ArrayList arrayList = null;
                    int i22 = -1;
                    int i23 = 0;
                    while (true) {
                        if (vVar.f7917b < i20) {
                            int x10 = vVar.x();
                            hVar = hVar2;
                            int x11 = vVar.f7917b + vVar.x();
                            if (x11 > i20) {
                                break;
                            }
                            SparseArray sparseArray4 = sparseArray3;
                            if (x10 == 5) {
                                long z10 = vVar.z();
                                if (z10 == 1094921523) {
                                    i22 = 129;
                                } else if (z10 == 1161904947) {
                                    i22 = 135;
                                } else {
                                    if (z10 != 1094921524) {
                                        if (z10 == 1212503619) {
                                            i22 = 36;
                                        }
                                    }
                                    i22 = 172;
                                }
                                i13 = x11;
                                i14 = D;
                                b0Var3 = b0Var;
                            } else if (x10 == 106) {
                                i13 = x11;
                                i14 = D;
                                b0Var3 = b0Var;
                                i22 = 129;
                            } else if (x10 == 122) {
                                i13 = x11;
                                i14 = D;
                                b0Var3 = b0Var;
                                i22 = 135;
                            } else if (x10 == 127) {
                                int x12 = vVar.x();
                                if (x12 != 21) {
                                    if (x12 == 14) {
                                        i22 = 136;
                                    } else if (x12 == 33) {
                                        i22 = 139;
                                    }
                                    i13 = x11;
                                    i14 = D;
                                    b0Var3 = b0Var;
                                }
                                i22 = 172;
                                i13 = x11;
                                i14 = D;
                                b0Var3 = b0Var;
                            } else if (x10 == 123) {
                                i13 = x11;
                                i14 = D;
                                b0Var3 = b0Var;
                                i22 = 138;
                            } else if (x10 == 10) {
                                str = vVar.v(3, StandardCharsets.UTF_8).trim();
                                i13 = x11;
                                i23 = vVar.x();
                                i14 = D;
                                b0Var3 = b0Var;
                            } else if (x10 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (vVar.f7917b < x11) {
                                    String trim = vVar.v(3, StandardCharsets.UTF_8).trim();
                                    vVar.x();
                                    e2.b0 b0Var4 = b0Var;
                                    byte[] bArr = new byte[4];
                                    vVar.h(0, 4, bArr);
                                    arrayList2.add(new j4.e0(trim, bArr));
                                    b0Var = b0Var4;
                                    x11 = x11;
                                    D = D;
                                }
                                i13 = x11;
                                i14 = D;
                                b0Var3 = b0Var;
                                arrayList = arrayList2;
                                i22 = 89;
                            } else {
                                i13 = x11;
                                i14 = D;
                                b0Var3 = b0Var;
                                if (x10 == 111) {
                                    i22 = 257;
                                }
                            }
                            vVar.K(i13 - vVar.f7917b);
                            b0Var = b0Var3;
                            hVar2 = hVar;
                            sparseArray3 = sparseArray4;
                            D = i14;
                        } else {
                            hVar = hVar2;
                            break;
                        }
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i24 = D;
                    e2.b0 b0Var5 = b0Var;
                    vVar.J(i20);
                    j6.l lVar = new j6.l(i22, str, i23, arrayList, Arrays.copyOfRange(vVar.f7916a, i19, i20));
                    if (i16 == 6 || i16 == 5) {
                        i16 = i22;
                    }
                    int i25 = i21 - (i18 + 5);
                    if (i15 == 2) {
                        i12 = i16;
                    } else {
                        i12 = i17;
                    }
                    if (!sparseBooleanArray.get(i12)) {
                        if (i15 == 2 && i16 == 21) {
                            a2 = d0Var.f12644r;
                        } else {
                            a2 = fVar.a(i16, lVar);
                        }
                        if (i15 != 2 || i17 < sparseIntArray.get(i12, 8192)) {
                            sparseIntArray.put(i12, i17);
                            sparseArray2.put(i12, a2);
                        }
                    }
                    a11 = i25;
                    b0Var = b0Var5;
                    hVar2 = hVar;
                    sparseArray3 = sparseArray5;
                    D = i24;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i26 = D;
                e2.b0 b0Var6 = b0Var;
                int size = sparseIntArray.size();
                int i27 = 0;
                while (i27 < size) {
                    int keyAt = sparseIntArray.keyAt(i27);
                    int valueAt = sparseIntArray.valueAt(i27);
                    sparseBooleanArray.put(keyAt, true);
                    d0Var.f12636j.put(valueAt, true);
                    j4.g0 g0Var = (j4.g0) sparseArray2.valueAt(i27);
                    if (g0Var != null) {
                        if (g0Var != d0Var.f12644r) {
                            i11 = i26;
                            b0Var2 = b0Var6;
                            g0Var.b(b0Var2, d0Var.f12639m, new j4.f0(i11, keyAt, 8192));
                        } else {
                            b0Var2 = b0Var6;
                            i11 = i26;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, g0Var);
                    } else {
                        b0Var2 = b0Var6;
                        sparseArray = sparseArray6;
                        i11 = i26;
                    }
                    i27++;
                    sparseArray6 = sparseArray;
                    i26 = i11;
                    b0Var6 = b0Var2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i15 == 2) {
                    if (!d0Var.f12641o) {
                        d0Var.f12639m.e1();
                        d0Var.f12640n = 0;
                        d0Var.f12641o = true;
                        return;
                    }
                    return;
                }
                sparseArray7.remove(this.f7771a);
                if (i15 == 1) {
                    i10 = 0;
                } else {
                    i10 = d0Var.f12640n - 1;
                }
                d0Var.f12640n = i10;
                if (i10 == 0) {
                    d0Var.f12639m.e1();
                    d0Var.f12641o = true;
                }
            }
        }
    }

    public void e(int i10, int i11) {
        int[] iArr = (int[]) this.e;
        int i12 = i10 * 4;
        iArr[i12] = i11;
        iArr[i12 + 1] = i11;
        iArr[i12 + 2] = i11;
        iArr[i12 + 3] = i11;
    }

    public void f(int i10) {
        iz0[] iz0VarArr;
        int[] iArr = (int[]) this.d;
        if (iArr[i10] != 0) {
            return;
        }
        iArr[i10] = 1;
        for (iz0 iz0Var : ((iz0[][]) this.f7773c)[i10]) {
            f(iz0Var.f25175a.f27206b);
            int i11 = this.f7771a;
            this.f7771a = i11 - 1;
            ((iz0[]) this.f7772b)[i11] = iz0Var;
        }
        iArr[i10] = 2;
    }

    public i0(e0.t r23) {
        throw new UnsupportedOperationException("Method not decompiled: e0.i0.<init>(e0.t):void");
    }

    @Override
    public void b(e2.b0 b0Var, c3.q qVar, j4.f0 f0Var) {
    }

    public i0(c3.z zVar, c3.j0 j0Var, byte[] bArr, c3.k0[] k0VarArr, int i10) {
        this.f7772b = zVar;
        this.f7773c = j0Var;
        this.d = bArr;
        this.e = k0VarArr;
        this.f7771a = i10;
    }

    public i0(j4.d0 d0Var, int i10) {
        this.e = d0Var;
        this.f7772b = new a4.h(new byte[5], 5);
        this.f7773c = new SparseArray();
        this.d = new SparseIntArray();
        this.f7771a = i10;
    }

    public i0(kz0 kz0Var, iz0[] iz0VarArr) {
        this.e = kz0Var;
        int length = iz0VarArr.length;
        this.f7772b = new iz0[length];
        this.f7771a = length - 1;
        int e = kz0Var.e() + 1;
        iz0[][] iz0VarArr2 = new iz0[e];
        int[] iArr = new int[e];
        for (iz0 iz0Var : iz0VarArr) {
            int i10 = iz0Var.f25175a.f27205a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < e; i11++) {
            iz0VarArr2[i11] = new iz0[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (iz0 iz0Var2 : iz0VarArr) {
            int i12 = iz0Var2.f25175a.f27205a;
            iz0[] iz0VarArr3 = iz0VarArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            iz0VarArr3[i13] = iz0Var2;
        }
        this.f7773c = iz0VarArr2;
        this.d = new int[((kz0) this.e).e() + 1];
    }
}
