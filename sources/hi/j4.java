package hi;

import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.Wallet.z5;
import org.telegram.ui.an;
public final class j4 implements Runnable {
    public final int f14743a;
    public final int f14744b;
    public final int f14745c;
    public final Object d;
    public final Object f14746e;
    public final Object f14747f;

    public j4(int i7, int i10, int i11, Object obj, Object obj2, TLObject tLObject) {
        this.f14743a = i11;
        this.d = obj;
        this.f14744b = i7;
        this.f14746e = tLObject;
        this.f14747f = obj2;
        this.f14745c = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.j4.run():void");
    }

    public j4(int i7, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.n nVar) {
        this.f14743a = 0;
        this.f14744b = i7;
        this.d = user;
        this.f14746e = document;
        this.f14745c = i10;
        this.f14747f = nVar;
    }

    public j4(Object obj, Object obj2, int i7, Object obj3, int i10, int i11) {
        this.f14743a = i11;
        this.d = obj;
        this.f14746e = obj2;
        this.f14744b = i7;
        this.f14747f = obj3;
        this.f14745c = i10;
    }

    public j4(an anVar, int i7, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var) {
        this.f14743a = 9;
        this.d = anVar;
        this.f14744b = i7;
        this.f14745c = i10;
        this.f14746e = characterStyle;
        this.f14747f = q1Var;
    }

    public j4(b6 b6Var, Context context, int i7, int i10, z5 z5Var) {
        this.f14743a = 10;
        this.d = b6Var;
        this.f14746e = context;
        this.f14744b = i7;
        this.f14745c = i10;
        this.f14747f = z5Var;
    }
}
