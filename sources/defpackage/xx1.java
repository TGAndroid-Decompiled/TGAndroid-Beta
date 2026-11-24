package defpackage;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xx1 implements gj, ed {
    public final String a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public xx1(ay1 ay1Var, View view, Object obj, String str, Object obj2, jm6 jm6Var, boolean z) {
        this.c = ay1Var;
        this.d = view;
        this.e = obj;
        this.a = str;
        this.f = obj2;
        this.h = jm6Var;
        this.b = z;
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        boolean z2 = this.b;
        ((ay1) this.c).B((View) this.d, this.e, this.a, this.f, z, i, i2, (jm6) this.h, z2);
    }

    @Override
    public final void u(hd hdVar, int i) {
        kf2 kf2Var = (kf2) this.c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        kf2Var.getClass();
        long j = ((TLRPC.User) this.d).id;
        int i2 = 1;
        if (kf2Var.e1 == 1) {
            i2 = 0;
        }
        kf2Var.w0(j, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.a, this.b, i2, false);
    }

    public xx1(kf2 kf2Var, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        this.c = kf2Var;
        this.d = user;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.a = str;
        this.b = z;
    }
}
