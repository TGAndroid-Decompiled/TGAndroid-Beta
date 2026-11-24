package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x73 implements View.OnClickListener {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public x73(xz7 xz7Var, ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z) {
        this.a = (byte) 1;
        this.c = xz7Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z;
    }

    @Override
    public final void onClick(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x73.onClick(android.view.View):void");
    }

    public x73(h0b h0bVar, TLRPC.User user, int i, ylb ylbVar) {
        this.a = (byte) 6;
        this.c = h0bVar;
        this.d = user;
        this.b = i;
        this.e = ylbVar;
    }

    public x73(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
