package ei;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bo;
public final class x4 implements Runnable {
    public final int f8729a;
    public final int f8730b;
    public final int f8731c;
    public final Object d;
    public final Object e;
    public final Object f8732f;

    public x4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f8729a = 7;
        this.d = mediaController;
        this.f8730b = i10;
        this.e = tL_error;
        this.f8732f = tLObject;
        this.f8731c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.x4.run():void");
    }

    public x4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.r rVar) {
        this.f8729a = 0;
        this.f8730b = i10;
        this.d = user;
        this.e = document;
        this.f8731c = i11;
        this.f8732f = rVar;
    }

    public x4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f8729a = i12;
        this.d = obj;
        this.e = obj2;
        this.f8730b = i10;
        this.f8732f = obj3;
        this.f8731c = i11;
    }

    public x4(bo boVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var) {
        this.f8729a = 8;
        this.d = boVar;
        this.f8730b = i10;
        this.f8731c = i11;
        this.e = characterStyle;
        this.f8732f = t1Var;
    }
}
