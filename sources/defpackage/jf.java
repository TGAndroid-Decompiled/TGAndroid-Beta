package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jf implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public jf(u41 u41Var, TLObject tLObject, fx0[] fx0VarArr, wjb wjbVar, int i, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.a = (byte) 11;
        this.c = u41Var;
        this.d = tLObject;
        this.e = fx0VarArr;
        this.h = wjbVar;
        this.b = i;
        this.f = tL_messages_checkChatInvite;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf.run():void");
    }

    public jf(x3b x3bVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i) {
        this.a = (byte) 12;
        this.c = x3bVar;
        this.d = tLObject;
        this.e = obj;
        this.f = arrayList;
        this.h = zArr;
        this.b = i;
    }

    public jf(KeyEvent.Callback callback, Object obj, int i, Object obj2, Object obj3, TLObject tLObject, byte b) {
        this.a = b;
        this.c = callback;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.f = obj3;
        this.h = tLObject;
    }

    public jf(Object obj, int i, TLObject tLObject, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = tLObject;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
    }

    public jf(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
        this.f = obj4;
        this.h = obj5;
    }

    public jf(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
        this.h = obj5;
    }

    public jf(TLObject tLObject, int i, hd hdVar, Context context, wjb wjbVar, fa5 fa5Var) {
        this.a = (byte) 4;
        this.c = tLObject;
        this.b = i;
        this.d = hdVar;
        this.e = context;
        this.h = wjbVar;
        this.f = fa5Var;
    }
}
