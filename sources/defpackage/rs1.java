package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class rs1 implements l12 {
    public final zu1 a;

    public rs1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    @Override
    public final boolean E0() {
        return false;
    }

    @Override
    public final void O0(vq0 vq0Var) {
        this.a.z6(vq0Var);
    }

    @Override
    public final void V() {
        this.a.a0.U();
    }

    @Override
    public final void i0(TLRPC.User user) {
        String p = lbc.p(user);
        zu1 zu1Var = this.a;
        if (zu1Var.a0 != null && user != null && !TextUtils.isEmpty(p)) {
            nr1 nr1Var = zu1Var.a0;
            nr1Var.setFieldText("@" + p + " ");
            zu1Var.a0.o1();
        }
    }

    @Override
    public final boolean o() {
        return this.a.fa();
    }

    @Override
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        f41 f41Var;
        HashMap<Object, Object> hashMap;
        int i4;
        boolean z5;
        int i5;
        int i6;
        boolean z6;
        ArrayList arrayList;
        boolean z7;
        HashMap<Object, Object> hashMap2;
        boolean z8;
        String str;
        boolean z9;
        String str2;
        TLRPC.Message message;
        zu1 zu1Var = this.a;
        if (zu1Var.getParentActivity() != null && (f41Var = zu1Var.Y1) != null) {
            boolean z10 = f41Var.A1;
            r47 r47Var = f41Var.E3;
            zu1Var.H5 = r47Var;
            if (r47Var != null && (message = r47Var.k) != null) {
                message.invert_media = z3;
            }
            if (i != 8 && i != 7 && (i != 4 || f41Var.d2.getSelectedPhotos().isEmpty())) {
                f41 f41Var2 = zu1Var.Y1;
                if (f41Var2 != null) {
                    f41Var2.I(i);
                }
                zu1Var.Ta(i);
                return;
            }
            f41 f41Var3 = zu1Var.Y1;
            if (f41Var3 != null && i != 8) {
                f41Var3.a(true);
            }
            HashMap<Object, Object> selectedPhotos = zu1Var.Y1.d2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = zu1Var.Y1.d2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                int i7 = 0;
                while (i7 < ceil) {
                    int i8 = i7 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i8);
                    ArrayList arrayList2 = new ArrayList();
                    int i9 = 0;
                    while (i9 < min) {
                        int i10 = i8 + i9;
                        if (i10 >= selectedPhotosOrder.size()) {
                            hashMap2 = selectedPhotos;
                            z8 = z10;
                        } else {
                            no6 no6Var = (no6) selectedPhotos.get(selectedPhotosOrder.get(i10));
                            ?? obj = new Object();
                            obj.b = no6Var.h;
                            boolean d = no6Var.d();
                            obj.p = d;
                            boolean z11 = no6Var.b;
                            if (z10 && d) {
                                obj.p = false;
                                z11 = false;
                            }
                            if (!z11 && (str2 = no6Var.h) != null) {
                                obj.c = str2;
                                if (!z10 && no6Var.c()) {
                                    obj.y = no6Var.clone();
                                }
                            } else {
                                String str3 = no6Var.I;
                                if (str3 != null) {
                                    obj.c = str3;
                                }
                            }
                            obj.e = no6Var.c;
                            obj.f = no6Var.g;
                            obj.g = no6Var.e;
                            obj.o = z11;
                            obj.q = no6Var.j();
                            hashMap2 = selectedPhotos;
                            z8 = z10;
                            obj.z = no6Var.m;
                            obj.A = no6Var.P;
                            CharSequence charSequence = no6Var.a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.i = no6Var.n;
                            obj.j = no6Var.r;
                            obj.h = no6Var.x;
                            obj.k = no6Var.s;
                            obj.r = no6Var.L;
                            obj.t = r7a.h(no6Var.a);
                            obj.u = no6Var.M;
                            obj.w = no6Var.N;
                            if (!z8 && no6Var.c()) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            obj.x = z9;
                            arrayList2.add(obj);
                            no6Var.e();
                        }
                        i9++;
                        z10 = z8;
                        selectedPhotos = hashMap2;
                    }
                    HashMap<Object, Object> hashMap3 = selectedPhotos;
                    boolean z12 = z10;
                    if (i7 == 0) {
                        zu1Var.F6(((q7a) arrayList2.get(0)).d, ((q7a) arrayList2.get(0)).i);
                        z5 = ((q7a) arrayList2.get(0)).t;
                    } else {
                        z5 = false;
                    }
                    r47 r47Var2 = zu1Var.H5;
                    if (r47Var2 != null && r47Var2.o5()) {
                        b77 b77Var = zu1Var.y5;
                        if (b77Var == null) {
                            b77Var = b77.b(zu1Var.H5.k.suggested_post);
                        }
                        b77 b77Var2 = b77Var;
                        k5 accountInstance = zu1Var.getAccountInstance();
                        int i11 = ceil;
                        long j3 = zu1Var.l6;
                        r47 r47Var3 = zu1Var.H5;
                        int i12 = i7;
                        r47 r47Var4 = zu1Var.m4;
                        ou1 ou1Var = zu1Var.D5;
                        if (i != 4 && !z4) {
                            arrayList = arrayList2;
                            z7 = false;
                        } else {
                            arrayList = arrayList2;
                            z7 = true;
                        }
                        i5 = i11;
                        i6 = i12;
                        r7a.W(accountInstance, arrayList, j3, r47Var3, r47Var4, null, ou1Var, z7, z, null, null, z2, i2, i3, z5, null, zu1Var.X6(), j, z3, j2, zu1Var.k7(), b77Var2, null, false);
                    } else {
                        i5 = ceil;
                        i6 = i7;
                        k5 accountInstance2 = zu1Var.getAccountInstance();
                        long j4 = zu1Var.l6;
                        r47 r47Var5 = zu1Var.F5;
                        r47 r47Var6 = zu1Var.m4;
                        ou1 ou1Var2 = zu1Var.D5;
                        if (i != 4 && !z4) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        r7a.W(accountInstance2, arrayList2, j4, r47Var5, r47Var6, null, ou1Var2, z6, z, zu1Var.H5, null, z2, i2, i3, z5, null, zu1Var.X6(), j, z3, j2, zu1Var.k7(), zu1Var.y5, null, false);
                    }
                    i7 = i6 + 1;
                    z10 = z12;
                    selectedPhotos = hashMap3;
                    ceil = i5;
                }
                hashMap = selectedPhotos;
                i4 = 0;
                zu1Var.E4();
                zu1Var.a0.setFieldText("");
            } else {
                hashMap = selectedPhotos;
                i4 = 0;
            }
            if (i2 != 0) {
                int i13 = zu1Var.h4;
                if (i13 == -1) {
                    zu1Var.h4 = i4;
                    i13 = i4;
                }
                zu1Var.h4 = hashMap.size() + i13;
                zu1Var.md(true);
            }
        }
    }

    @Override
    public final void R() {
    }

    @Override
    public final void e0(Object obj) {
    }

    @Override
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
