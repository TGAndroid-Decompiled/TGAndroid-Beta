package jg;

import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.q6;
import org.telegram.ui.Wallet.s6;
import org.telegram.ui.bn;
public final class o1 implements Runnable {
    public final int f17633a;
    public final int f17634b;
    public final int f17635c;
    public final Object d;
    public final Object f17636e;
    public final Object f17637f;

    public o1(int i7, int i10, int i11, Object obj, Object obj2, TLObject tLObject) {
        this.f17633a = i11;
        this.d = obj;
        this.f17634b = i7;
        this.f17636e = tLObject;
        this.f17637f = obj2;
        this.f17635c = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: jg.o1.run():void");
    }

    public o1(int i7, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.o oVar) {
        this.f17633a = 1;
        this.f17634b = i7;
        this.d = user;
        this.f17636e = document;
        this.f17635c = i10;
        this.f17637f = oVar;
    }

    public o1(Object obj, Object obj2, int i7, Object obj3, int i10, int i11) {
        this.f17633a = i11;
        this.d = obj;
        this.f17636e = obj2;
        this.f17634b = i7;
        this.f17637f = obj3;
        this.f17635c = i10;
    }

    public o1(bn bnVar, int i7, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.r1 r1Var) {
        this.f17633a = 9;
        this.d = bnVar;
        this.f17634b = i7;
        this.f17635c = i10;
        this.f17636e = characterStyle;
        this.f17637f = r1Var;
    }

    public o1(s6 s6Var, Context context, int i7, int i10, q6 q6Var) {
        this.f17633a = 10;
        this.d = s6Var;
        this.f17636e = context;
        this.f17634b = i7;
        this.f17635c = i10;
        this.f17637f = q6Var;
    }
}
