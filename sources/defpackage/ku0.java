package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ku0 implements pcc {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ku0(ChatActivityEnterView chatActivityEnterView, r47 r47Var, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, TLRPC.User user) {
        this.a = (byte) 3;
        this.b = chatActivityEnterView;
        this.c = r47Var;
        this.e = tL_buttonTypeRequestPeer;
        this.d = user;
    }

    @Override
    public final void a(java.lang.Object r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku0.a(java.lang.Object):void");
    }

    public ku0(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = str;
        this.c = obj2;
        this.e = obj3;
    }

    public ku0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
