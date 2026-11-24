package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.c;
public final class nv0 implements jac {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public nv0(asc ascVar, c cVar, TLRPC.User user, String str) {
        this.a = (byte) 17;
        this.b = ascVar;
        this.c = cVar;
        this.e = user;
        this.d = str;
    }

    @Override
    public final void a(java.lang.Object r25, java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv0.a(java.lang.Object, java.lang.Object):void");
    }

    public nv0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public nv0(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = str;
        this.c = obj2;
        this.e = obj3;
    }
}
