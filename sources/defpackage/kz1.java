package defpackage;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kz1 implements gk, ee {
    public final String a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public kz1(nz1 nz1Var, View view, Object obj, String str, Object obj2, jo6 jo6Var, boolean z) {
        this.c = nz1Var;
        this.d = view;
        this.e = obj;
        this.a = str;
        this.f = obj2;
        this.h = jo6Var;
        this.b = z;
    }

    @Override
    public final void r(he heVar, int i) {
        wg2 wg2Var = (wg2) this.c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        wg2Var.getClass();
        long j = ((TLRPC.User) this.d).id;
        int i2 = 1;
        if (wg2Var.e1 == 1) {
            i2 = 0;
        }
        wg2Var.x0(j, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.a, this.b, i2, false);
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        boolean z2 = this.b;
        ((nz1) this.c).B((View) this.d, this.e, this.a, this.f, z, i, i2, (jo6) this.h, z2);
    }

    public kz1(wg2 wg2Var, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        this.c = wg2Var;
        this.d = user;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.a = str;
        this.b = z;
    }
}
