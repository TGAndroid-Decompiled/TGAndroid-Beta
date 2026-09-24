package ei;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wn;
public final class x4 implements Runnable {
    public final int f8716a;
    public final int f8717b;
    public final int f8718c;
    public final Object d;
    public final Object e;
    public final Object f8719f;

    public x4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f8716a = 7;
        this.d = mediaController;
        this.f8717b = i10;
        this.e = tL_error;
        this.f8719f = tLObject;
        this.f8718c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.x4.run():void");
    }

    public x4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.q qVar) {
        this.f8716a = 0;
        this.f8717b = i10;
        this.d = user;
        this.e = document;
        this.f8718c = i11;
        this.f8719f = qVar;
    }

    public x4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f8716a = i12;
        this.d = obj;
        this.e = obj2;
        this.f8717b = i10;
        this.f8719f = obj3;
        this.f8718c = i11;
    }

    public x4(wn wnVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var) {
        this.f8716a = 8;
        this.d = wnVar;
        this.f8717b = i10;
        this.f8718c = i11;
        this.e = characterStyle;
        this.f8719f = u1Var;
    }
}
