package e0;

import android.app.Notification;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.zz0;
public final class g0 implements j4.a0 {
    public int f8412a;
    public final Object f8413b;
    public final Object f8414c;
    public final Object d;
    public final Object f8415e;

    public g0(int i10) {
        this.f8412a = i10;
        int i11 = i10 * 8;
        this.f8413b = new float[i11];
        this.f8414c = new float[i11];
        this.d = new short[i10 * 6];
        this.f8415e = new int[i10 * 4];
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
        a4.g gVar;
        int i12;
        char c10;
        j4.g0 a2;
        int i13;
        int i14;
        e2.b0 b0Var3;
        SparseArray sparseArray2 = (SparseArray) this.f8414c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.d;
        a4.g gVar2 = (a4.g) this.f8413b;
        j4.d0 d0Var = (j4.d0) this.f8415e;
        SparseArray sparseArray3 = d0Var.h;
        SparseBooleanArray sparseBooleanArray = d0Var.f13769i;
        j4.f fVar = d0Var.f13767f;
        List list = d0Var.f13765c;
        int i15 = d0Var.f13763a;
        if (vVar.x() == 2) {
            if (i15 != 1 && i15 != 2 && d0Var.f13774n != 1) {
                b0Var = new e2.b0(((e2.b0) list.get(0)).d());
                list.add(b0Var);
            } else {
                b0Var = (e2.b0) list.get(0);
            }
            if ((vVar.x() & 128) != 0) {
                vVar.K(1);
                int D = vVar.D();
                vVar.K(3);
                vVar.h(0, 2, gVar2.f276b);
                gVar2.q(0);
                gVar2.t(3);
                d0Var.f13780t = gVar2.i(13);
                vVar.h(0, 2, gVar2.f276b);
                gVar2.q(0);
                gVar2.t(4);
                vVar.K(gVar2.i(12));
                if (i15 == 2 && d0Var.f13778r == null) {
                    j4.g0 a10 = fVar.a(21, new j6.l(21, null, 0, null, e2.d0.f8533b));
                    d0Var.f13778r = a10;
                    if (a10 != null) {
                        a10.b(b0Var, d0Var.f13773m, new j4.f0(D, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a11 = vVar.a();
                while (a11 > 0) {
                    vVar.h(0, 5, gVar2.f276b);
                    gVar2.q(0);
                    int i16 = gVar2.i(8);
                    gVar2.t(3);
                    int i17 = gVar2.i(13);
                    gVar2.t(4);
                    int i18 = gVar2.i(12);
                    int i19 = vVar.f8585b;
                    int i20 = i19 + i18;
                    int i21 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i22 = 0;
                    int i23 = a11;
                    while (true) {
                        if (vVar.f8585b < i20) {
                            int x10 = vVar.x();
                            gVar = gVar2;
                            int x11 = vVar.f8585b + vVar.x();
                            if (x11 > i20) {
                                break;
                            }
                            SparseArray sparseArray4 = sparseArray3;
                            if (x10 == 5) {
                                long z10 = vVar.z();
                                if (z10 == 1094921523) {
                                    i21 = 129;
                                } else if (z10 == 1161904947) {
                                    i21 = 135;
                                } else {
                                    if (z10 != 1094921524) {
                                        if (z10 == 1212503619) {
                                            i21 = 36;
                                        }
                                    }
                                    i21 = 172;
                                }
                                i13 = x11;
                                i14 = D;
                                b0Var3 = b0Var;
                            } else if (x10 == 106) {
                                i13 = x11;
                                i14 = D;
                                b0Var3 = b0Var;
                                i21 = 129;
                            } else if (x10 == 122) {
                                i14 = D;
                                b0Var3 = b0Var;
                                i21 = 135;
                                i13 = x11;
                            } else {
                                if (x10 == 127) {
                                    int x12 = vVar.x();
                                    if (x12 != 21) {
                                        if (x12 == 14) {
                                            i21 = 136;
                                        } else if (x12 == 33) {
                                            i21 = 139;
                                        }
                                    }
                                    i21 = 172;
                                } else if (x10 == 123) {
                                    i21 = 138;
                                } else if (x10 == 10) {
                                    str = vVar.v(3, StandardCharsets.UTF_8).trim();
                                    i13 = x11;
                                    i22 = vVar.x();
                                    i14 = D;
                                    b0Var3 = b0Var;
                                } else {
                                    if (x10 == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (vVar.f8585b < x11) {
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
                                        i21 = 89;
                                    } else {
                                        i13 = x11;
                                        i14 = D;
                                        b0Var3 = b0Var;
                                        if (x10 == 111) {
                                            i21 = 257;
                                        }
                                    }
                                    vVar.K(i13 - vVar.f8585b);
                                    b0Var = b0Var3;
                                    gVar2 = gVar;
                                    sparseArray3 = sparseArray4;
                                    D = i14;
                                }
                                i13 = x11;
                                i14 = D;
                                b0Var3 = b0Var;
                            }
                            vVar.K(i13 - vVar.f8585b);
                            b0Var = b0Var3;
                            gVar2 = gVar;
                            sparseArray3 = sparseArray4;
                            D = i14;
                        } else {
                            gVar = gVar2;
                            break;
                        }
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i24 = D;
                    e2.b0 b0Var5 = b0Var;
                    vVar.J(i20);
                    j6.l lVar = new j6.l(i21, str, i22, arrayList, Arrays.copyOfRange(vVar.f8584a, i19, i20));
                    if (i16 == 6 || i16 == 5) {
                        i16 = i21;
                    }
                    int i25 = i23 - (i18 + 5);
                    if (i15 == 2) {
                        i12 = i16;
                    } else {
                        i12 = i17;
                    }
                    if (sparseBooleanArray.get(i12)) {
                        c10 = 21;
                    } else {
                        c10 = 21;
                        if (i15 == 2 && i16 == 21) {
                            a2 = d0Var.f13778r;
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
                    gVar2 = gVar;
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
                    d0Var.f13770j.put(valueAt, true);
                    j4.g0 g0Var = (j4.g0) sparseArray2.valueAt(i27);
                    if (g0Var != null) {
                        if (g0Var != d0Var.f13778r) {
                            i11 = i26;
                            b0Var2 = b0Var6;
                            g0Var.b(b0Var2, d0Var.f13773m, new j4.f0(i11, keyAt, 8192));
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
                    if (!d0Var.f13775o) {
                        d0Var.f13773m.k1();
                        d0Var.f13774n = 0;
                        d0Var.f13775o = true;
                        return;
                    }
                    return;
                }
                sparseArray7.remove(this.f8412a);
                if (i15 == 1) {
                    i10 = 0;
                } else {
                    i10 = d0Var.f13774n - 1;
                }
                d0Var.f13774n = i10;
                if (i10 == 0) {
                    d0Var.f13773m.k1();
                    d0Var.f13775o = true;
                }
            }
        }
    }

    public void e(int i10, int i11) {
        int[] iArr = (int[]) this.f8415e;
        int i12 = i10 * 4;
        iArr[i12] = i11;
        iArr[i12 + 1] = i11;
        iArr[i12 + 2] = i11;
        iArr[i12 + 3] = i11;
    }

    public void f(int i10) {
        zz0[] zz0VarArr;
        int[] iArr = (int[]) this.d;
        if (iArr[i10] != 0) {
            return;
        }
        iArr[i10] = 1;
        for (zz0 zz0Var : ((zz0[][]) this.f8414c)[i10]) {
            f(zz0Var.f33688a.f26206b);
            int i11 = this.f8412a;
            this.f8412a = i11 - 1;
            ((zz0[]) this.f8413b)[i11] = zz0Var;
        }
        iArr[i10] = 2;
    }

    public g0(e0.r r23) {
        throw new UnsupportedOperationException("Method not decompiled: e0.g0.<init>(e0.r):void");
    }

    @Override
    public void b(e2.b0 b0Var, c3.q qVar, j4.f0 f0Var) {
    }

    public g0(c3.z zVar, a4.l lVar, byte[] bArr, c3.j0[] j0VarArr, int i10) {
        this.f8413b = zVar;
        this.f8414c = lVar;
        this.d = bArr;
        this.f8415e = j0VarArr;
        this.f8412a = i10;
    }

    public g0(j4.d0 d0Var, int i10) {
        this.f8415e = d0Var;
        this.f8413b = new a4.g(new byte[5], 5);
        this.f8414c = new SparseArray();
        this.d = new SparseIntArray();
        this.f8412a = i10;
    }

    public g0(b01 b01Var, zz0[] zz0VarArr) {
        this.f8415e = b01Var;
        int length = zz0VarArr.length;
        this.f8413b = new zz0[length];
        this.f8412a = length - 1;
        int e7 = b01Var.e() + 1;
        zz0[][] zz0VarArr2 = new zz0[e7];
        int[] iArr = new int[e7];
        for (zz0 zz0Var : zz0VarArr) {
            int i10 = zz0Var.f33688a.f26205a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < e7; i11++) {
            zz0VarArr2[i11] = new zz0[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (zz0 zz0Var2 : zz0VarArr) {
            int i12 = zz0Var2.f33688a.f26205a;
            zz0[] zz0VarArr3 = zz0VarArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            zz0VarArr3[i13] = zz0Var2;
        }
        this.f8414c = zz0VarArr2;
        this.d = new int[((b01) this.f8415e).e() + 1];
    }
}
