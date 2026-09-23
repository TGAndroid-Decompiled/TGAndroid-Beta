package ei;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xn;
public final class x4 implements Runnable {
    public final int f8717a;
    public final int f8718b;
    public final int f8719c;
    public final Object d;
    public final Object e;
    public final Object f8720f;

    public x4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f8717a = 7;
        this.d = mediaController;
        this.f8718b = i10;
        this.e = tL_error;
        this.f8720f = tLObject;
        this.f8719c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.x4.run():void");
    }

    public x4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.q qVar) {
        this.f8717a = 0;
        this.f8718b = i10;
        this.d = user;
        this.e = document;
        this.f8719c = i11;
        this.f8720f = qVar;
    }

    public x4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f8717a = i12;
        this.d = obj;
        this.e = obj2;
        this.f8718b = i10;
        this.f8720f = obj3;
        this.f8719c = i11;
    }

    public x4(xn xnVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var) {
        this.f8717a = 8;
        this.d = xnVar;
        this.f8718b = i10;
        this.f8719c = i11;
        this.e = characterStyle;
        this.f8720f = t1Var;
    }
}
