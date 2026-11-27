package defpackage;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ny1 implements hj, fd {
    public final String a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public ny1(qy1 qy1Var, View view, Object obj, String str, Object obj2, no6 no6Var, boolean z) {
        this.c = qy1Var;
        this.d = view;
        this.e = obj;
        this.a = str;
        this.f = obj2;
        this.h = no6Var;
        this.b = z;
    }

    @Override
    public final void w(id idVar, int i) {
        bg2 bg2Var = (bg2) this.c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        bg2Var.getClass();
        long j = ((TLRPC.User) this.d).id;
        int i2 = 1;
        if (bg2Var.e1 == 1) {
            i2 = 0;
        }
        bg2Var.x0(j, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.a, this.b, i2, false);
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        boolean z2 = this.b;
        ((qy1) this.c).B((View) this.d, this.e, this.a, this.f, z, i, i2, (no6) this.h, z2);
    }

    public ny1(bg2 bg2Var, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        this.c = bg2Var;
        this.d = user;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.a = str;
        this.b = z;
    }
}
