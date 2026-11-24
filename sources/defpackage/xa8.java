package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class xa8 extends jb8 {
    public final jn5 a;
    public final pb8 b;
    public final k47 c;
    public final jo6 d;
    public final boolean e;
    public final boolean f;
    public final PhotoViewer g;

    public xa8(PhotoViewer photoViewer, pb8 pb8Var, k47 k47Var, jo6 jo6Var, boolean z, boolean z2) {
        this.g = photoViewer;
        this.b = pb8Var;
        this.c = k47Var;
        this.d = jo6Var;
        this.e = z;
        this.f = z2;
        this.a = photoViewer.B4.p();
    }

    @Override
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        e0(rccVar, z, i2, false, z2);
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        pb8 pb8Var = this.b;
        if (pb8Var != null) {
            return pb8Var.N(this.c, null, 0, z, false);
        }
        return null;
    }

    @Override
    public final k47 W() {
        return this.c;
    }

    @Override
    public final void c(rcc rccVar) {
        jo6 jo6Var = this.d;
        if (!jo6Var.w && !jo6Var.v && !jo6Var.u && rccVar == null && TextUtils.isEmpty(jo6Var.a)) {
            return;
        }
        e0(rccVar, false, 0, true, false);
    }

    public final void e0(rcc rccVar, boolean z, int i, boolean z2, boolean z3) {
        k47 k47Var;
        PhotoViewer photoViewer = this.g;
        if (photoViewer.k4 != null) {
            nv1 nv1Var = null;
            k47 k47Var2 = this.c;
            if (z2) {
                k47Var = k47Var2;
            } else {
                k47Var = null;
            }
            jo6 jo6Var = this.d;
            if (k47Var != null && !TextUtils.isEmpty(jo6Var.a)) {
                k47Var.y1 = jo6Var.a;
                k47Var.z1 = jo6Var.n;
            }
            if (z2 || k47Var2 == null) {
                yv1 yv1Var = photoViewer.k4;
                k47Var2 = yv1Var.F5;
                nv1Var = yv1Var.D5;
            }
            nv1 nv1Var2 = nv1Var;
            k47 k47Var3 = k47Var2;
            if (jo6Var.b) {
                yv1 yv1Var2 = photoViewer.k4;
                if (rccVar != null) {
                    j5 accountInstance = yv1Var2.getAccountInstance();
                    String str = jo6Var.I;
                    long a = photoViewer.k4.a();
                    yv1 yv1Var3 = photoViewer.k4;
                    k47 k47Var4 = yv1Var3.m4;
                    ArrayList arrayList = jo6Var.n;
                    k47 k47Var5 = k47Var;
                    int i2 = jo6Var.x;
                    boolean z4 = jo6Var.M;
                    a6a.a0(i2, i, a, 0L, 0L, photoViewer.k4.k7(), accountInstance, nv1Var2, k47Var3, k47Var4, k47Var5, photoViewer.k4.y5, yv1Var3.X6(), rccVar, jo6Var.a, str, null, arrayList, null, null, z, z3, z4);
                    return;
                }
                k47 k47Var6 = k47Var;
                j5 accountInstance2 = yv1Var2.getAccountInstance();
                String str2 = jo6Var.I;
                long a2 = photoViewer.k4.a();
                yv1 yv1Var4 = photoViewer.k4;
                k47 k47Var7 = yv1Var4.m4;
                ArrayList arrayList2 = jo6Var.n;
                int i3 = jo6Var.x;
                boolean z5 = jo6Var.M;
                a6a.a0(i3, i, a2, 0L, 0L, photoViewer.k4.k7(), accountInstance2, nv1Var2, k47Var3, k47Var7, k47Var6, photoViewer.k4.y5, yv1Var4.X6(), null, jo6Var.a, str2, null, arrayList2, null, null, z, z3, z5);
                return;
            }
            k47 k47Var8 = k47Var;
            if (jo6Var.h != null) {
                j5 accountInstance3 = photoViewer.k4.getAccountInstance();
                String str3 = jo6Var.h;
                String str4 = jo6Var.c;
                long a3 = photoViewer.k4.a();
                yv1 yv1Var5 = photoViewer.k4;
                a6a.Y(accountInstance3, str3, str4, null, a3, k47Var3, yv1Var5.m4, nv1Var2, jo6Var.n, jo6Var.r, null, jo6Var.x, k47Var8, rccVar, z, i, z3, jo6Var.a, yv1Var5.X6(), 0L, 0L, photoViewer.k4.k7(), photoViewer.k4.y5);
            } else if (jo6Var.I != null) {
                j5 accountInstance4 = photoViewer.k4.getAccountInstance();
                String str5 = jo6Var.I;
                String str6 = jo6Var.c;
                long a4 = photoViewer.k4.a();
                yv1 yv1Var6 = photoViewer.k4;
                a6a.Y(accountInstance4, str5, str6, null, a4, k47Var3, yv1Var6.m4, nv1Var2, jo6Var.n, jo6Var.r, null, jo6Var.x, k47Var8, rccVar, z, i, z3, jo6Var.a, yv1Var6.X6(), 0L, 0L, photoViewer.k4.k7(), photoViewer.k4.y5);
            }
        }
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final jn5 k(int i) {
        return this.a;
    }

    @Override
    public final boolean o() {
        if (this.b != null && this.e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean q() {
        if (this.b != null && this.f) {
            return true;
        }
        return false;
    }
}
