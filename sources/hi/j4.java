package hi;

import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.Wallet.d6;
import org.telegram.ui.cn;
public final class j4 implements Runnable {
    public final int f14745a;
    public final int f14746b;
    public final int f14747c;
    public final Object d;
    public final Object f14748e;
    public final Object f14749f;

    public j4(int i7, int i10, int i11, Object obj, Object obj2, TLObject tLObject) {
        this.f14745a = i11;
        this.d = obj;
        this.f14746b = i7;
        this.f14748e = tLObject;
        this.f14749f = obj2;
        this.f14747c = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.j4.run():void");
    }

    public j4(int i7, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.n nVar) {
        this.f14745a = 0;
        this.f14746b = i7;
        this.d = user;
        this.f14748e = document;
        this.f14747c = i10;
        this.f14749f = nVar;
    }

    public j4(Object obj, Object obj2, int i7, Object obj3, int i10, int i11) {
        this.f14745a = i11;
        this.d = obj;
        this.f14748e = obj2;
        this.f14746b = i7;
        this.f14749f = obj3;
        this.f14747c = i10;
    }

    public j4(cn cnVar, int i7, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var) {
        this.f14745a = 9;
        this.d = cnVar;
        this.f14746b = i7;
        this.f14747c = i10;
        this.f14748e = characterStyle;
        this.f14749f = q1Var;
    }

    public j4(d6 d6Var, Context context, int i7, int i10, b6 b6Var) {
        this.f14745a = 10;
        this.d = d6Var;
        this.f14748e = context;
        this.f14746b = i7;
        this.f14747c = i10;
        this.f14749f = b6Var;
    }
}
