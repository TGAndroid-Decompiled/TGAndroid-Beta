package jg;

import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.a6;
import org.telegram.ui.Wallet.c6;
import org.telegram.ui.an;
public final class o1 implements Runnable {
    public final int f17225a;
    public final int f17226b;
    public final int f17227c;
    public final Object d;
    public final Object f17228e;
    public final Object f17229f;

    public o1(int i7, int i10, int i11, Object obj, Object obj2, TLObject tLObject) {
        this.f17225a = i11;
        this.d = obj;
        this.f17226b = i7;
        this.f17228e = tLObject;
        this.f17229f = obj2;
        this.f17227c = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: jg.o1.run():void");
    }

    public o1(int i7, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.o oVar) {
        this.f17225a = 1;
        this.f17226b = i7;
        this.d = user;
        this.f17228e = document;
        this.f17227c = i10;
        this.f17229f = oVar;
    }

    public o1(Object obj, Object obj2, int i7, Object obj3, int i10, int i11) {
        this.f17225a = i11;
        this.d = obj;
        this.f17228e = obj2;
        this.f17226b = i7;
        this.f17229f = obj3;
        this.f17227c = i10;
    }

    public o1(an anVar, int i7, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var) {
        this.f17225a = 9;
        this.d = anVar;
        this.f17226b = i7;
        this.f17227c = i10;
        this.f17228e = characterStyle;
        this.f17229f = q1Var;
    }

    public o1(c6 c6Var, Context context, int i7, int i10, a6 a6Var) {
        this.f17225a = 10;
        this.d = c6Var;
        this.f17228e = context;
        this.f17226b = i7;
        this.f17227c = i10;
        this.f17229f = a6Var;
    }
}
