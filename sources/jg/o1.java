package jg;

import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.r6;
import org.telegram.ui.Wallet.t6;
import org.telegram.ui.bn;
public final class o1 implements Runnable {
    public final int f17704a;
    public final int f17705b;
    public final int f17706c;
    public final Object d;
    public final Object f17707e;
    public final Object f17708f;

    public o1(int i7, int i10, int i11, Object obj, Object obj2, TLObject tLObject) {
        this.f17704a = i11;
        this.d = obj;
        this.f17705b = i7;
        this.f17707e = tLObject;
        this.f17708f = obj2;
        this.f17706c = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: jg.o1.run():void");
    }

    public o1(int i7, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.o oVar) {
        this.f17704a = 1;
        this.f17705b = i7;
        this.d = user;
        this.f17707e = document;
        this.f17706c = i10;
        this.f17708f = oVar;
    }

    public o1(Object obj, Object obj2, int i7, Object obj3, int i10, int i11) {
        this.f17704a = i11;
        this.d = obj;
        this.f17707e = obj2;
        this.f17705b = i7;
        this.f17708f = obj3;
        this.f17706c = i10;
    }

    public o1(bn bnVar, int i7, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.r1 r1Var) {
        this.f17704a = 9;
        this.d = bnVar;
        this.f17705b = i7;
        this.f17706c = i10;
        this.f17707e = characterStyle;
        this.f17708f = r1Var;
    }

    public o1(t6 t6Var, Context context, int i7, int i10, r6 r6Var) {
        this.f17704a = 10;
        this.d = t6Var;
        this.f17707e = context;
        this.f17705b = i7;
        this.f17706c = i10;
        this.f17708f = r6Var;
    }
}
