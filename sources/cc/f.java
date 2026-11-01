package cc;

import a4.g;
import a4.l;
import ac.h;
import android.app.Notification;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c3.m0;
import c3.q;
import c3.z;
import e2.k0;
import e2.l0;
import e2.x;
import j4.b0;
import j4.e0;
import j4.f0;
import j4.g0;
import j4.h0;
import j6.m;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.gy0;
public final class f implements b0 {
    public final int f4115a;
    public int f4116b;
    public Object f4117c;
    public Object d;
    public Object e;
    public Object f4118f;

    public f() {
        this.f4115a = 0;
    }

    public static void a(float[] fArr, int i10, float f7, float f10, float f11, float f12) {
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

    public static void e(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public void b() {
        ((Canvas) this.f4117c).restore();
        ((Matrix) this.d).set((Matrix) i0.a.v(1, (ArrayList) this.e));
        this.f4116b--;
    }

    @Override
    public void c(x xVar) {
        k0 k0Var;
        int i10;
        k0 k0Var2;
        SparseArray sparseArray;
        int i11;
        g gVar;
        int i12;
        char c10;
        h0 a2;
        int i13;
        int i14;
        k0 k0Var3;
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        g gVar2 = (g) this.f4117c;
        e0 e0Var = (e0) this.f4118f;
        SparseArray sparseArray3 = e0Var.h;
        SparseBooleanArray sparseBooleanArray = e0Var.f9460i;
        j4.f fVar = e0Var.f9458f;
        List list = e0Var.f9457c;
        int i15 = e0Var.f9455a;
        if (xVar.A() == 2) {
            if (i15 != 1 && i15 != 2 && e0Var.f9465n != 1) {
                k0Var = new k0(((k0) list.get(0)).d());
                list.add(k0Var);
            } else {
                k0Var = (k0) list.get(0);
            }
            if ((xVar.A() & 128) != 0) {
                xVar.O(1);
                int H = xVar.H();
                xVar.O(3);
                xVar.k(0, 2, (byte[]) gVar2.f260b);
                gVar2.d0(0);
                gVar2.f0(3);
                e0Var.f9471t = gVar2.i(13);
                xVar.k(0, 2, (byte[]) gVar2.f260b);
                gVar2.d0(0);
                gVar2.f0(4);
                xVar.O(gVar2.i(12));
                if (i15 == 2 && e0Var.f9469r == null) {
                    h0 a10 = fVar.a(21, new m(21, null, 0, null, l0.f6166b));
                    e0Var.f9469r = a10;
                    if (a10 != null) {
                        a10.d(k0Var, e0Var.f9464m, new g0(H, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a11 = xVar.a();
                while (a11 > 0) {
                    xVar.k(0, 5, (byte[]) gVar2.f260b);
                    gVar2.d0(0);
                    int i16 = gVar2.i(8);
                    gVar2.f0(3);
                    int i17 = gVar2.i(13);
                    gVar2.f0(4);
                    int i18 = gVar2.i(12);
                    int i19 = xVar.f6208b;
                    int i20 = i19 + i18;
                    int i21 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i22 = 0;
                    int i23 = a11;
                    while (true) {
                        if (xVar.f6208b < i20) {
                            int A = xVar.A();
                            gVar = gVar2;
                            int A2 = xVar.f6208b + xVar.A();
                            if (A2 > i20) {
                                break;
                            }
                            SparseArray sparseArray4 = sparseArray3;
                            if (A == 5) {
                                long C = xVar.C();
                                if (C == 1094921523) {
                                    i21 = 129;
                                } else if (C == 1161904947) {
                                    i21 = 135;
                                } else {
                                    if (C != 1094921524) {
                                        if (C == 1212503619) {
                                            i21 = 36;
                                        }
                                    }
                                    i21 = 172;
                                }
                                i13 = A2;
                                i14 = H;
                                k0Var3 = k0Var;
                            } else if (A == 106) {
                                i13 = A2;
                                i14 = H;
                                k0Var3 = k0Var;
                                i21 = 129;
                            } else if (A == 122) {
                                i14 = H;
                                k0Var3 = k0Var;
                                i21 = 135;
                                i13 = A2;
                            } else {
                                if (A == 127) {
                                    int A3 = xVar.A();
                                    if (A3 != 21) {
                                        if (A3 == 14) {
                                            i21 = 136;
                                        } else if (A3 == 33) {
                                            i21 = 139;
                                        }
                                    }
                                    i21 = 172;
                                } else if (A == 123) {
                                    i21 = 138;
                                } else if (A == 10) {
                                    str = xVar.y(3, StandardCharsets.UTF_8).trim();
                                    i13 = A2;
                                    i22 = xVar.A();
                                    i14 = H;
                                    k0Var3 = k0Var;
                                } else {
                                    if (A == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (xVar.f6208b < A2) {
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
                                        i13 = A2;
                                        i14 = H;
                                        k0Var3 = k0Var;
                                        arrayList = arrayList2;
                                        i21 = 89;
                                    } else {
                                        i13 = A2;
                                        i14 = H;
                                        k0Var3 = k0Var;
                                        if (A == 111) {
                                            i21 = 257;
                                        }
                                    }
                                    xVar.O(i13 - xVar.f6208b);
                                    k0Var = k0Var3;
                                    gVar2 = gVar;
                                    sparseArray3 = sparseArray4;
                                    H = i14;
                                }
                                i13 = A2;
                                i14 = H;
                                k0Var3 = k0Var;
                            }
                            xVar.O(i13 - xVar.f6208b);
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
                    int i24 = H;
                    k0 k0Var5 = k0Var;
                    xVar.N(i20);
                    m mVar = new m(i21, str, i22, arrayList, Arrays.copyOfRange(xVar.f6207a, i19, i20));
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
                            a2 = e0Var.f9469r;
                        } else {
                            a2 = fVar.a(i16, mVar);
                        }
                        if (i15 != 2 || i17 < sparseIntArray.get(i12, 8192)) {
                            sparseIntArray.put(i12, i17);
                            sparseArray2.put(i12, a2);
                        }
                    }
                    a11 = i25;
                    k0Var = k0Var5;
                    gVar2 = gVar;
                    sparseArray3 = sparseArray5;
                    H = i24;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i26 = H;
                k0 k0Var6 = k0Var;
                int size = sparseIntArray.size();
                int i27 = 0;
                while (i27 < size) {
                    int keyAt = sparseIntArray.keyAt(i27);
                    int valueAt = sparseIntArray.valueAt(i27);
                    sparseBooleanArray.put(keyAt, true);
                    e0Var.f9461j.put(valueAt, true);
                    h0 h0Var = (h0) sparseArray2.valueAt(i27);
                    if (h0Var != null) {
                        if (h0Var != e0Var.f9469r) {
                            i11 = i26;
                            k0Var2 = k0Var6;
                            h0Var.d(k0Var2, e0Var.f9464m, new g0(i11, keyAt, 8192));
                        } else {
                            k0Var2 = k0Var6;
                            i11 = i26;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, h0Var);
                    } else {
                        k0Var2 = k0Var6;
                        sparseArray = sparseArray6;
                        i11 = i26;
                    }
                    i27++;
                    sparseArray6 = sparseArray;
                    i26 = i11;
                    k0Var6 = k0Var2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i15 == 2) {
                    if (!e0Var.f9466o) {
                        e0Var.f9464m.Q0();
                        e0Var.f9465n = 0;
                        e0Var.f9466o = true;
                        return;
                    }
                    return;
                }
                sparseArray7.remove(this.f4116b);
                if (i15 == 1) {
                    i10 = 0;
                } else {
                    i10 = e0Var.f9465n - 1;
                }
                e0Var.f9465n = i10;
                if (i10 == 0) {
                    e0Var.f9464m.Q0();
                    e0Var.f9466o = true;
                }
            }
        }
    }

    public void f(int i10, int i11) {
        int[] iArr = (int[]) this.f4118f;
        int i12 = i10 * 4;
        iArr[i12] = i11;
        iArr[i12 + 1] = i11;
        iArr[i12 + 2] = i11;
        iArr[i12 + 3] = i11;
    }

    public void g(int i10) {
        ey0[] ey0VarArr;
        int[] iArr = (int[]) this.e;
        if (iArr[i10] != 0) {
            return;
        }
        iArr[i10] = 1;
        for (ey0 ey0Var : ((ey0[][]) this.d)[i10]) {
            g(ey0Var.f25970a.f27988b);
            int i11 = this.f4116b;
            this.f4116b = i11 - 1;
            ((ey0[]) this.f4117c)[i11] = ey0Var;
        }
        iArr[i10] = 2;
    }

    public String toString() {
        switch (this.f4115a) {
            case 0:
                StringBuilder sb2 = new StringBuilder(200);
                sb2.append("<<\n mode: ");
                sb2.append((ac.f) this.f4117c);
                sb2.append("\n ecLevel: ");
                sb2.append((ac.d) this.d);
                sb2.append("\n version: ");
                sb2.append((h) this.e);
                sb2.append("\n maskPattern: ");
                sb2.append(this.f4116b);
                if (((b4.d) this.f4118f) == null) {
                    sb2.append("\n matrix: null\n");
                } else {
                    sb2.append("\n matrix:\n");
                    sb2.append((b4.d) this.f4118f);
                }
                sb2.append(">>\n");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public f(int i10) {
        this.f4115a = 3;
        this.f4116b = i10;
        int i11 = i10 * 8;
        this.f4117c = new float[i11];
        this.d = new float[i11];
        this.e = new short[i10 * 6];
        this.f4118f = new int[i10 * 4];
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

    public f(e0.r r23) {
        throw new UnsupportedOperationException("Method not decompiled: cc.f.<init>(e0.r):void");
    }

    @Override
    public void d(k0 k0Var, q qVar, g0 g0Var) {
    }

    public f(z zVar, l lVar, byte[] bArr, m0[] m0VarArr, int i10) {
        this.f4115a = 6;
        this.f4117c = zVar;
        this.d = lVar;
        this.e = bArr;
        this.f4118f = m0VarArr;
        this.f4116b = i10;
    }

    public f(Canvas canvas) {
        this.f4115a = 5;
        this.d = new Matrix();
        this.e = new ArrayList();
        this.f4118f = new ArrayList();
        this.f4117c = canvas;
    }

    public f(e0 e0Var, int i10) {
        this.f4115a = 2;
        this.f4118f = e0Var;
        this.f4117c = new g(new byte[5], 5);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.f4116b = i10;
    }

    public f(gy0 gy0Var, ey0[] ey0VarArr) {
        this.f4115a = 4;
        this.f4118f = gy0Var;
        int length = ey0VarArr.length;
        this.f4117c = new ey0[length];
        this.f4116b = length - 1;
        int e = gy0Var.e() + 1;
        ey0[][] ey0VarArr2 = new ey0[e];
        int[] iArr = new int[e];
        for (ey0 ey0Var : ey0VarArr) {
            int i10 = ey0Var.f25970a.f27987a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < e; i11++) {
            ey0VarArr2[i11] = new ey0[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (ey0 ey0Var2 : ey0VarArr) {
            int i12 = ey0Var2.f25970a.f27987a;
            ey0[] ey0VarArr3 = ey0VarArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            ey0VarArr3[i13] = ey0Var2;
        }
        this.d = ey0VarArr2;
        this.e = new int[((gy0) this.f4118f).e() + 1];
    }
}
