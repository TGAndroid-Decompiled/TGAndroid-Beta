package ei;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.eo;
public final class w4 implements Runnable {
    public final int f9462a;
    public final int f9463b;
    public final int f9464c;
    public final Object d;
    public final Object f9465e;
    public final Object f9466f;

    public w4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f9462a = 7;
        this.d = mediaController;
        this.f9463b = i10;
        this.f9465e = tL_error;
        this.f9466f = tLObject;
        this.f9464c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.w4.run():void");
    }

    public w4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.q qVar) {
        this.f9462a = 0;
        this.f9463b = i10;
        this.d = user;
        this.f9465e = document;
        this.f9464c = i11;
        this.f9466f = qVar;
    }

    public w4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f9462a = i12;
        this.d = obj;
        this.f9465e = obj2;
        this.f9463b = i10;
        this.f9466f = obj3;
        this.f9464c = i11;
    }

    public w4(eo eoVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var) {
        this.f9462a = 8;
        this.d = eoVar;
        this.f9463b = i10;
        this.f9464c = i11;
        this.f9465e = characterStyle;
        this.f9466f = u1Var;
    }
}
