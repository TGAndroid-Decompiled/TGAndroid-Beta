package jg;

import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.q6;
import org.telegram.ui.Wallet.s6;
import org.telegram.ui.bn;
public final class o1 implements Runnable {
    public final int f17611a;
    public final int f17612b;
    public final int f17613c;
    public final Object d;
    public final Object f17614e;
    public final Object f17615f;

    public o1(int i7, int i10, int i11, Object obj, Object obj2, TLObject tLObject) {
        this.f17611a = i11;
        this.d = obj;
        this.f17612b = i7;
        this.f17614e = tLObject;
        this.f17615f = obj2;
        this.f17613c = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: jg.o1.run():void");
    }

    public o1(int i7, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.o oVar) {
        this.f17611a = 1;
        this.f17612b = i7;
        this.d = user;
        this.f17614e = document;
        this.f17613c = i10;
        this.f17615f = oVar;
    }

    public o1(Object obj, Object obj2, int i7, Object obj3, int i10, int i11) {
        this.f17611a = i11;
        this.d = obj;
        this.f17614e = obj2;
        this.f17612b = i7;
        this.f17615f = obj3;
        this.f17613c = i10;
    }

    public o1(bn bnVar, int i7, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var) {
        this.f17611a = 9;
        this.d = bnVar;
        this.f17612b = i7;
        this.f17613c = i10;
        this.f17614e = characterStyle;
        this.f17615f = q1Var;
    }

    public o1(s6 s6Var, Context context, int i7, int i10, q6 q6Var) {
        this.f17611a = 10;
        this.d = s6Var;
        this.f17614e = context;
        this.f17612b = i7;
        this.f17613c = i10;
        this.f17615f = q6Var;
    }
}
