package defpackage;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.SessionsActivity;
public final class vp8 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public vp8(r7a r7aVar, d7a d7aVar, File file, r47 r47Var) {
        this.a = (byte) 15;
        this.b = r7aVar;
        this.c = d7aVar;
        this.e = file;
        this.d = r47Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp8.run():void");
    }

    public vp8(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public vp8(SessionsActivity sessionsActivity, id idVar, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.c = sessionsActivity;
        this.b = idVar;
        this.d = tL_error;
        this.e = tLObject;
    }
}
