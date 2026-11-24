package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class qt1 implements g22 {
    public final yv1 a;

    public qt1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    @Override
    public final boolean B() {
        return this.a.ea();
    }

    @Override
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        e51 e51Var;
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
        yv1 yv1Var = this.a;
        if (yv1Var.getParentActivity() != null && (e51Var = yv1Var.Y1) != null) {
            boolean z10 = e51Var.A1;
            k47 k47Var = e51Var.E3;
            yv1Var.H5 = k47Var;
            if (k47Var != null && (message = k47Var.k) != null) {
                message.invert_media = z3;
            }
            if (i != 8 && i != 7 && (i != 4 || e51Var.d2.getSelectedPhotos().isEmpty())) {
                e51 e51Var2 = yv1Var.Y1;
                if (e51Var2 != null) {
                    e51Var2.I(i);
                }
                yv1Var.Sa(i);
                return;
            }
            e51 e51Var3 = yv1Var.Y1;
            if (e51Var3 != null && i != 8) {
                e51Var3.a(true);
            }
            HashMap<Object, Object> selectedPhotos = yv1Var.Y1.d2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = yv1Var.Y1.d2.getSelectedPhotosOrder();
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
                            jo6 jo6Var = (jo6) selectedPhotos.get(selectedPhotosOrder.get(i9));
                            ?? obj = new Object();
                            obj.b = jo6Var.h;
                            boolean d = jo6Var.d();
                            obj.p = d;
                            boolean z11 = jo6Var.b;
                            if (z10 && d) {
                                obj.p = false;
                                z11 = false;
                            }
                            if (!z11 && (str2 = jo6Var.h) != null) {
                                obj.c = str2;
                                if (!z10 && jo6Var.c()) {
                                    obj.y = jo6Var.clone();
                                }
                            } else {
                                String str3 = jo6Var.I;
                                if (str3 != null) {
                                    obj.c = str3;
                                }
                            }
                            obj.e = jo6Var.c;
                            obj.f = jo6Var.g;
                            obj.g = jo6Var.e;
                            obj.o = z11;
                            obj.q = jo6Var.j();
                            hashMap2 = selectedPhotos;
                            z8 = z10;
                            obj.z = jo6Var.m;
                            obj.A = jo6Var.P;
                            CharSequence charSequence = jo6Var.a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.i = jo6Var.n;
                            obj.j = jo6Var.r;
                            obj.h = jo6Var.x;
                            obj.k = jo6Var.s;
                            obj.r = jo6Var.L;
                            obj.t = a6a.h(jo6Var.a);
                            obj.u = jo6Var.M;
                            obj.w = jo6Var.N;
                            if (!z8 && jo6Var.c()) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            obj.x = z9;
                            arrayList2.add(obj);
                            jo6Var.e();
                        }
                        i8++;
                        z10 = z8;
                        selectedPhotos = hashMap2;
                    }
                    HashMap<Object, Object> hashMap3 = selectedPhotos;
                    boolean z12 = z10;
                    if (i6 == 0) {
                        yv1Var.F6(((z5a) arrayList2.get(0)).d, ((z5a) arrayList2.get(0)).i);
                        z5 = ((z5a) arrayList2.get(0)).t;
                    } else {
                        z5 = false;
                    }
                    k47 k47Var2 = yv1Var.H5;
                    if (k47Var2 != null && k47Var2.o5()) {
                        v67 v67Var = yv1Var.y5;
                        if (v67Var == null) {
                            v67Var = v67.b(yv1Var.H5.k.suggested_post);
                        }
                        v67 v67Var2 = v67Var;
                        j5 accountInstance = yv1Var.getAccountInstance();
                        int i10 = ceil;
                        long j3 = yv1Var.l6;
                        k47 k47Var3 = yv1Var.H5;
                        int i11 = i6;
                        k47 k47Var4 = yv1Var.m4;
                        nv1 nv1Var = yv1Var.D5;
                        if (i != 4 && !z4) {
                            arrayList = arrayList2;
                            z7 = false;
                        } else {
                            arrayList = arrayList2;
                            z7 = true;
                        }
                        i5 = i11;
                        i4 = i10;
                        a6a.W(accountInstance, arrayList, j3, k47Var3, k47Var4, null, nv1Var, z7, z, null, null, z2, i2, i3, z5, null, yv1Var.X6(), j, z3, j2, yv1Var.k7(), v67Var2, null, false);
                    } else {
                        i4 = ceil;
                        i5 = i6;
                        j5 accountInstance2 = yv1Var.getAccountInstance();
                        long j4 = yv1Var.l6;
                        k47 k47Var5 = yv1Var.F5;
                        k47 k47Var6 = yv1Var.m4;
                        nv1 nv1Var2 = yv1Var.D5;
                        if (i != 4 && !z4) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        a6a.W(accountInstance2, arrayList2, j4, k47Var5, k47Var6, null, nv1Var2, z6, z, yv1Var.H5, null, z2, i2, i3, z5, null, yv1Var.X6(), j, z3, j2, yv1Var.k7(), yv1Var.y5, null, false);
                    }
                    i6 = i5 + 1;
                    ceil = i4;
                    z10 = z12;
                    selectedPhotos = hashMap3;
                }
                hashMap = selectedPhotos;
                yv1Var.E4();
                yv1Var.a0.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i2 != 0) {
                if (yv1Var.h4 == -1) {
                    yv1Var.h4 = 0;
                }
                yv1Var.h4 += hashMap.size();
                yv1Var.md(true);
            }
        }
    }

    @Override
    public final boolean K0() {
        return false;
    }

    @Override
    public final void a1(vr0 vr0Var) {
        this.a.z6(vr0Var);
    }

    @Override
    public final void b0() {
        this.a.a0.R();
    }

    @Override
    public final void z0(TLRPC.User user) {
        String p = m9c.p(user);
        yv1 yv1Var = this.a;
        if (yv1Var.a0 != null && user != null && !TextUtils.isEmpty(p)) {
            ms1 ms1Var = yv1Var.a0;
            ms1Var.setFieldText("@" + p + " ");
            yv1Var.a0.j1();
        }
    }

    @Override
    public final void I() {
    }

    @Override
    public final void f0(Object obj) {
    }

    @Override
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
