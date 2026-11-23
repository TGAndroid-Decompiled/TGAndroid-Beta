package jg;

import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.q6;
import org.telegram.ui.Wallet.s6;
import org.telegram.ui.bn;
public final class o1 implements Runnable {
    public final int f17602a;
    public final int f17603b;
    public final int f17604c;
    public final Object d;
    public final Object f17605e;
    public final Object f17606f;

    public o1(int i7, int i10, int i11, Object obj, Object obj2, TLObject tLObject) {
        this.f17602a = i11;
        this.d = obj;
        this.f17603b = i7;
        this.f17605e = tLObject;
        this.f17606f = obj2;
        this.f17604c = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: jg.o1.run():void");
    }

    public o1(int i7, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.o oVar) {
        this.f17602a = 1;
        this.f17603b = i7;
        this.d = user;
        this.f17605e = document;
        this.f17604c = i10;
        this.f17606f = oVar;
    }

    public o1(Object obj, Object obj2, int i7, Object obj3, int i10, int i11) {
        this.f17602a = i11;
        this.d = obj;
        this.f17605e = obj2;
        this.f17603b = i7;
        this.f17606f = obj3;
        this.f17604c = i10;
    }

    public o1(bn bnVar, int i7, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.r1 r1Var) {
        this.f17602a = 9;
        this.d = bnVar;
        this.f17603b = i7;
        this.f17604c = i10;
        this.f17605e = characterStyle;
        this.f17606f = r1Var;
    }

    public o1(s6 s6Var, Context context, int i7, int i10, q6 q6Var) {
        this.f17602a = 10;
        this.d = s6Var;
        this.f17605e = context;
        this.f17603b = i7;
        this.f17604c = i10;
        this.f17606f = q6Var;
    }
}
