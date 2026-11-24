package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l63 implements View.OnClickListener {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public l63(vx7 vx7Var, ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z) {
        this.a = (byte) 1;
        this.c = vx7Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z;
    }

    @Override
    public final void onClick(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l63.onClick(android.view.View):void");
    }

    public l63(eya eyaVar, TLRPC.User user, int i, wjb wjbVar) {
        this.a = (byte) 6;
        this.c = eyaVar;
        this.d = user;
        this.b = i;
        this.e = wjbVar;
    }

    public l63(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
