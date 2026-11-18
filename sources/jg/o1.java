package jg;

import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.q6;
import org.telegram.ui.Wallet.s6;
import org.telegram.ui.bn;
public final class o1 implements Runnable {
    public final int f17608a;
    public final int f17609b;
    public final int f17610c;
    public final Object d;
    public final Object f17611e;
    public final Object f17612f;

    public o1(int i7, int i10, int i11, Object obj, Object obj2, TLObject tLObject) {
        this.f17608a = i11;
        this.d = obj;
        this.f17609b = i7;
        this.f17611e = tLObject;
        this.f17612f = obj2;
        this.f17610c = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: jg.o1.run():void");
    }

    public o1(int i7, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.o oVar) {
        this.f17608a = 1;
        this.f17609b = i7;
        this.d = user;
        this.f17611e = document;
        this.f17610c = i10;
        this.f17612f = oVar;
    }

    public o1(Object obj, Object obj2, int i7, Object obj3, int i10, int i11) {
        this.f17608a = i11;
        this.d = obj;
        this.f17611e = obj2;
        this.f17609b = i7;
        this.f17612f = obj3;
        this.f17610c = i10;
    }

    public o1(bn bnVar, int i7, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.r1 r1Var) {
        this.f17608a = 9;
        this.d = bnVar;
        this.f17609b = i7;
        this.f17610c = i10;
        this.f17611e = characterStyle;
        this.f17612f = r1Var;
    }

    public o1(s6 s6Var, Context context, int i7, int i10, q6 q6Var) {
        this.f17608a = 10;
        this.d = s6Var;
        this.f17611e = context;
        this.f17609b = i7;
        this.f17610c = i10;
        this.f17612f = q6Var;
    }
}
