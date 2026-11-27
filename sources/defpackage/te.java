package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public te(c51 c51Var, TLObject tLObject, nx0[] nx0VarArr, vnb vnbVar, int i, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.a = (byte) 11;
        this.c = c51Var;
        this.d = tLObject;
        this.e = nx0VarArr;
        this.h = vnbVar;
        this.b = i;
        this.f = tL_messages_checkChatInvite;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te.run():void");
    }

    public te(u7b u7bVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i) {
        this.a = (byte) 12;
        this.c = u7bVar;
        this.d = tLObject;
        this.e = obj;
        this.f = arrayList;
        this.h = zArr;
        this.b = i;
    }

    public te(KeyEvent.Callback callback, Object obj, int i, Object obj2, Object obj3, TLObject tLObject, byte b) {
        this.a = b;
        this.c = callback;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.f = obj3;
        this.h = tLObject;
    }

    public te(Object obj, int i, TLObject tLObject, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = tLObject;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
    }

    public te(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
        this.f = obj4;
        this.h = obj5;
    }

    public te(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
        this.h = obj5;
    }

    public te(TLObject tLObject, int i, id idVar, Context context, vnb vnbVar, gc5 gc5Var) {
        this.a = (byte) 4;
        this.c = tLObject;
        this.b = i;
        this.d = idVar;
        this.e = context;
        this.h = vnbVar;
        this.f = gc5Var;
    }
}
