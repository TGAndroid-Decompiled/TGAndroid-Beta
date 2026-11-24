package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class au0 implements p8c {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public au0(ChatActivityEnterView chatActivityEnterView, k27 k27Var, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, TLRPC.User user) {
        this.a = (byte) 3;
        this.b = chatActivityEnterView;
        this.c = k27Var;
        this.e = tL_buttonTypeRequestPeer;
        this.d = user;
    }

    @Override
    public final void a(java.lang.Object r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au0.a(java.lang.Object):void");
    }

    public au0(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = str;
        this.c = obj2;
        this.e = obj3;
    }

    public au0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
