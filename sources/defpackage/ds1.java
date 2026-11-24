package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class ds1 implements v02 {
    public final mu1 a;

    public ds1(mu1 mu1Var) {
        this.a = mu1Var;
    }

    @Override
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        x31 x31Var;
        HashMap<Object, Object> hashMap;
        boolean z5;
        int i4;
        int i5;
        boolean z6;
        ArrayList arrayList;
        boolean z7;
        HashMap<Object, Object> hashMap2;
        boolean z8;
        String str;
        boolean z9;
        String str2;
        TLRPC.Message message;
        mu1 mu1Var = this.a;
        if (mu1Var.getParentActivity() != null && (x31Var = mu1Var.Y1) != null) {
            boolean z10 = x31Var.A1;
            k27 k27Var = x31Var.E3;
            mu1Var.H5 = k27Var;
            if (k27Var != null && (message = k27Var.k) != null) {
                message.invert_media = z3;
            }
            if (i != 8 && i != 7 && (i != 4 || x31Var.d2.getSelectedPhotos().isEmpty())) {
                x31 x31Var2 = mu1Var.Y1;
                if (x31Var2 != null) {
                    x31Var2.J(i);
                }
                mu1Var.Ga(i);
                return;
            }
            x31 x31Var3 = mu1Var.Y1;
            if (x31Var3 != null && i != 8) {
                x31Var3.a(true);
            }
            HashMap<Object, Object> selectedPhotos = mu1Var.Y1.d2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = mu1Var.Y1.d2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                int i6 = 0;
                while (i6 < ceil) {
                    int i7 = i6 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i7);
                    ArrayList arrayList2 = new ArrayList();
                    int i8 = 0;
                    while (i8 < min) {
                        int i9 = i7 + i8;
                        if (i9 >= selectedPhotosOrder.size()) {
                            hashMap2 = selectedPhotos;
                            z8 = z10;
                        } else {
                            jm6 jm6Var = (jm6) selectedPhotos.get(selectedPhotosOrder.get(i9));
                            ?? obj = new Object();
                            obj.b = jm6Var.h;
                            boolean d = jm6Var.d();
                            obj.p = d;
                            boolean z11 = jm6Var.b;
                            if (z10 && d) {
                                obj.p = false;
                                z11 = false;
                            }
                            if (!z11 && (str2 = jm6Var.h) != null) {
                                obj.c = str2;
                                if (!z10 && jm6Var.c()) {
                                    obj.y = jm6Var.clone();
                                }
                            } else {
                                String str3 = jm6Var.I;
                                if (str3 != null) {
                                    obj.c = str3;
                                }
                            }
                            obj.e = jm6Var.c;
                            obj.f = jm6Var.g;
                            obj.g = jm6Var.e;
                            obj.o = z11;
                            obj.q = jm6Var.j();
                            hashMap2 = selectedPhotos;
                            z8 = z10;
                            obj.z = jm6Var.m;
                            obj.A = jm6Var.P;
                            CharSequence charSequence = jm6Var.a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.i = jm6Var.n;
                            obj.j = jm6Var.r;
                            obj.h = jm6Var.x;
                            obj.k = jm6Var.s;
                            obj.r = jm6Var.L;
                            obj.t = z3a.h(jm6Var.a);
                            obj.u = jm6Var.M;
                            obj.w = jm6Var.N;
                            if (!z8 && jm6Var.c()) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            obj.x = z9;
                            arrayList2.add(obj);
                            jm6Var.e();
                        }
                        i8++;
                        z10 = z8;
                        selectedPhotos = hashMap2;
                    }
                    HashMap<Object, Object> hashMap3 = selectedPhotos;
                    boolean z12 = z10;
                    if (i6 == 0) {
                        mu1Var.w6(((y3a) arrayList2.get(0)).d, ((y3a) arrayList2.get(0)).i);
                        z5 = ((y3a) arrayList2.get(0)).t;
                    } else {
                        z5 = false;
                    }
                    k27 k27Var2 = mu1Var.H5;
                    if (k27Var2 != null && k27Var2.o5()) {
                        u47 u47Var = mu1Var.y5;
                        if (u47Var == null) {
                            u47Var = u47.b(mu1Var.H5.k.suggested_post);
                        }
                        u47 u47Var2 = u47Var;
                        j5 accountInstance = mu1Var.getAccountInstance();
                        int i10 = ceil;
                        long j3 = mu1Var.l6;
                        k27 k27Var3 = mu1Var.H5;
                        int i11 = i6;
                        k27 k27Var4 = mu1Var.m4;
                        bu1 bu1Var = mu1Var.D5;
                        if (i != 4 && !z4) {
                            arrayList = arrayList2;
                            z7 = false;
                        } else {
                            arrayList = arrayList2;
                            z7 = true;
                        }
                        i5 = i11;
                        i4 = i10;
                        z3a.W(accountInstance, arrayList, j3, k27Var3, k27Var4, null, bu1Var, z7, z, null, null, z2, i2, i3, z5, null, mu1Var.O6(), j, z3, j2, mu1Var.a7(), u47Var2, null, false);
                    } else {
                        i4 = ceil;
                        i5 = i6;
                        j5 accountInstance2 = mu1Var.getAccountInstance();
                        long j4 = mu1Var.l6;
                        k27 k27Var5 = mu1Var.F5;
                        k27 k27Var6 = mu1Var.m4;
                        bu1 bu1Var2 = mu1Var.D5;
                        if (i != 4 && !z4) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        z3a.W(accountInstance2, arrayList2, j4, k27Var5, k27Var6, null, bu1Var2, z6, z, mu1Var.H5, null, z2, i2, i3, z5, null, mu1Var.O6(), j, z3, j2, mu1Var.a7(), mu1Var.y5, null, false);
                    }
                    i6 = i5 + 1;
                    ceil = i4;
                    z10 = z12;
                    selectedPhotos = hashMap3;
                }
                hashMap = selectedPhotos;
                mu1Var.y4();
                mu1Var.a0.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i2 != 0) {
                if (mu1Var.h4 == -1) {
                    mu1Var.h4 = 0;
                }
                mu1Var.h4 += hashMap.size();
                mu1Var.Yc(true);
            }
        }
    }

    @Override
    public final void I0() {
        this.a.a0.S();
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final boolean f0() {
        return this.a.S9();
    }

    @Override
    public final void g1(TLRPC.User user) {
        String o = l7c.o(user);
        mu1 mu1Var = this.a;
        if (mu1Var.a0 != null && user != null && !TextUtils.isEmpty(o)) {
            ar1 ar1Var = mu1Var.a0;
            ar1Var.setFieldText("@" + o + " ");
            mu1Var.a0.h1();
        }
    }

    @Override
    public final void z2(vq0 vq0Var) {
        this.a.q6(vq0Var);
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void P0(Object obj) {
    }

    @Override
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
