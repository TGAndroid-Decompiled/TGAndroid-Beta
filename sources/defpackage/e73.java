package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e73 implements View.OnClickListener {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public e73(b18 b18Var, ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z) {
        this.a = (byte) 1;
        this.c = b18Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z;
    }

    @Override
    public final void onClick(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e73.onClick(android.view.View):void");
    }

    public e73(g2b g2bVar, TLRPC.User user, int i, vnb vnbVar) {
        this.a = (byte) 6;
        this.c = g2bVar;
        this.d = user;
        this.b = i;
        this.e = vnbVar;
    }

    public e73(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
