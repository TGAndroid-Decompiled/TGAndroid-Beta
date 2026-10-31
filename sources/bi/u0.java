package bi;

import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.un;
public final class u0 implements Runnable {
    public final int f3372a;
    public final Object f3373b;
    public final int f3374c;
    public final Object d;
    public final int e;
    public final Object f3375f;

    public u0(int i10, int i11, int i12, Object obj, Object obj2, TLObject tLObject) {
        this.f3372a = i12;
        this.f3375f = obj;
        this.f3374c = i10;
        this.f3373b = tLObject;
        this.d = obj2;
        this.e = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.u0.run():void");
    }

    public u0(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.o oVar) {
        this.f3372a = 9;
        this.f3374c = i10;
        this.f3375f = user;
        this.f3373b = document;
        this.e = i11;
        this.d = oVar;
    }

    public u0(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f3372a = i12;
        this.f3375f = obj;
        this.f3373b = obj2;
        this.f3374c = i10;
        this.d = obj3;
        this.e = i11;
    }

    public u0(un unVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var) {
        this.f3372a = 7;
        this.f3375f = unVar;
        this.f3374c = i10;
        this.e = i11;
        this.f3373b = characterStyle;
        this.d = q1Var;
    }

    public u0(org.telegram.ui.Wallet.g6 g6Var, Context context, int i10, int i11, org.telegram.ui.Wallet.d6 d6Var) {
        this.f3372a = 8;
        this.f3375f = g6Var;
        this.f3373b = context;
        this.f3374c = i10;
        this.e = i11;
        this.d = d6Var;
    }
}
