package ei;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zn;
public final class w4 implements Runnable {
    public final int f9465a;
    public final int f9466b;
    public final int f9467c;
    public final Object d;
    public final Object f9468e;
    public final Object f9469f;

    public w4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f9465a = 7;
        this.d = mediaController;
        this.f9466b = i10;
        this.f9468e = tL_error;
        this.f9469f = tLObject;
        this.f9467c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.w4.run():void");
    }

    public w4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.q qVar) {
        this.f9465a = 0;
        this.f9466b = i10;
        this.d = user;
        this.f9468e = document;
        this.f9467c = i11;
        this.f9469f = qVar;
    }

    public w4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f9465a = i12;
        this.d = obj;
        this.f9468e = obj2;
        this.f9466b = i10;
        this.f9469f = obj3;
        this.f9467c = i11;
    }

    public w4(zn znVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var) {
        this.f9465a = 8;
        this.d = znVar;
        this.f9466b = i10;
        this.f9467c = i11;
        this.f9468e = characterStyle;
        this.f9469f = u1Var;
    }
}
