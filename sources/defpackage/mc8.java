package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class mc8 extends yc8 {
    public final mn5 a;
    public final ed8 b;
    public final r47 c;
    public final no6 d;
    public final boolean e;
    public final boolean f;
    public final PhotoViewer g;

    public mc8(PhotoViewer photoViewer, ed8 ed8Var, r47 r47Var, no6 no6Var, boolean z, boolean z2) {
        this.g = photoViewer;
        this.b = ed8Var;
        this.c = r47Var;
        this.d = no6Var;
        this.e = z;
        this.f = z2;
        this.a = photoViewer.B4.p();
    }

    @Override
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        e0(oecVar, z, i2, false, z2);
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ed8 ed8Var = this.b;
        if (ed8Var != null) {
            return ed8Var.M(this.c, null, 0, z, false);
        }
        return null;
    }

    @Override
    public final r47 V() {
        return this.c;
    }

    @Override
    public final void c(oec oecVar) {
        no6 no6Var = this.d;
        if (!no6Var.w && !no6Var.v && !no6Var.u && oecVar == null && TextUtils.isEmpty(no6Var.a)) {
            return;
        }
        e0(oecVar, false, 0, true, false);
    }

    public final void e0(oec oecVar, boolean z, int i, boolean z2, boolean z3) {
        r47 r47Var;
        PhotoViewer photoViewer = this.g;
        if (photoViewer.k4 != null) {
            ou1 ou1Var = null;
            r47 r47Var2 = this.c;
            if (z2) {
                r47Var = r47Var2;
            } else {
                r47Var = null;
            }
            no6 no6Var = this.d;
            if (r47Var != null && !TextUtils.isEmpty(no6Var.a)) {
                r47Var.y1 = no6Var.a;
                r47Var.z1 = no6Var.n;
            }
            if (z2 || r47Var2 == null) {
                zu1 zu1Var = photoViewer.k4;
                r47Var2 = zu1Var.F5;
                ou1Var = zu1Var.D5;
            }
            ou1 ou1Var2 = ou1Var;
            r47 r47Var3 = r47Var2;
            if (no6Var.b) {
                zu1 zu1Var2 = photoViewer.k4;
                if (oecVar != null) {
                    k5 accountInstance = zu1Var2.getAccountInstance();
                    String str = no6Var.I;
                    long a = photoViewer.k4.a();
                    zu1 zu1Var3 = photoViewer.k4;
                    r47 r47Var4 = zu1Var3.m4;
                    ArrayList arrayList = no6Var.n;
                    r47 r47Var5 = r47Var;
                    int i2 = no6Var.x;
                    boolean z4 = no6Var.M;
                    r7a.a0(i2, i, a, 0L, 0L, photoViewer.k4.k7(), accountInstance, ou1Var2, r47Var3, r47Var4, r47Var5, photoViewer.k4.y5, zu1Var3.X6(), oecVar, no6Var.a, str, null, arrayList, null, null, z, z3, z4);
                    return;
                }
                r47 r47Var6 = r47Var;
                k5 accountInstance2 = zu1Var2.getAccountInstance();
                String str2 = no6Var.I;
                long a2 = photoViewer.k4.a();
                zu1 zu1Var4 = photoViewer.k4;
                r47 r47Var7 = zu1Var4.m4;
                ArrayList arrayList2 = no6Var.n;
                int i3 = no6Var.x;
                boolean z5 = no6Var.M;
                r7a.a0(i3, i, a2, 0L, 0L, photoViewer.k4.k7(), accountInstance2, ou1Var2, r47Var3, r47Var7, r47Var6, photoViewer.k4.y5, zu1Var4.X6(), null, no6Var.a, str2, null, arrayList2, null, null, z, z3, z5);
                return;
            }
            r47 r47Var8 = r47Var;
            if (no6Var.h != null) {
                k5 accountInstance3 = photoViewer.k4.getAccountInstance();
                String str3 = no6Var.h;
                String str4 = no6Var.c;
                long a3 = photoViewer.k4.a();
                zu1 zu1Var5 = photoViewer.k4;
                r7a.Y(accountInstance3, str3, str4, null, a3, r47Var3, zu1Var5.m4, ou1Var2, no6Var.n, no6Var.r, null, no6Var.x, r47Var8, oecVar, z, i, z3, no6Var.a, zu1Var5.X6(), 0L, 0L, photoViewer.k4.k7(), photoViewer.k4.y5);
            } else if (no6Var.I != null) {
                k5 accountInstance4 = photoViewer.k4.getAccountInstance();
                String str5 = no6Var.I;
                String str6 = no6Var.c;
                long a4 = photoViewer.k4.a();
                zu1 zu1Var6 = photoViewer.k4;
                r7a.Y(accountInstance4, str5, str6, null, a4, r47Var3, zu1Var6.m4, ou1Var2, no6Var.n, no6Var.r, null, no6Var.x, r47Var8, oecVar, z, i, z3, no6Var.a, zu1Var6.X6(), 0L, 0L, photoViewer.k4.k7(), photoViewer.k4.y5);
            }
        }
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final mn5 k(int i) {
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
