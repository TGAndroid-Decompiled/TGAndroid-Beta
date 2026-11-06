package hi;

import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.a6;
import org.telegram.ui.Wallet.c6;
import org.telegram.ui.an;
public final class j4 implements Runnable {
    public final int f14740a;
    public final int f14741b;
    public final int f14742c;
    public final Object d;
    public final Object f14743e;
    public final Object f14744f;

    public j4(int i7, int i10, int i11, Object obj, Object obj2, TLObject tLObject) {
        this.f14740a = i11;
        this.d = obj;
        this.f14741b = i7;
        this.f14743e = tLObject;
        this.f14744f = obj2;
        this.f14742c = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.j4.run():void");
    }

    public j4(int i7, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.n nVar) {
        this.f14740a = 0;
        this.f14741b = i7;
        this.d = user;
        this.f14743e = document;
        this.f14742c = i10;
        this.f14744f = nVar;
    }

    public j4(Object obj, Object obj2, int i7, Object obj3, int i10, int i11) {
        this.f14740a = i11;
        this.d = obj;
        this.f14743e = obj2;
        this.f14741b = i7;
        this.f14744f = obj3;
        this.f14742c = i10;
    }

    public j4(an anVar, int i7, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var) {
        this.f14740a = 9;
        this.d = anVar;
        this.f14741b = i7;
        this.f14742c = i10;
        this.f14743e = characterStyle;
        this.f14744f = q1Var;
    }

    public j4(c6 c6Var, Context context, int i7, int i10, a6 a6Var) {
        this.f14740a = 10;
        this.d = c6Var;
        this.f14743e = context;
        this.f14741b = i7;
        this.f14742c = i10;
        this.f14744f = a6Var;
    }
}
