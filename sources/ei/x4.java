package ei;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bo;
public final class x4 implements Runnable {
    public final int f8734a;
    public final int f8735b;
    public final int f8736c;
    public final Object d;
    public final Object e;
    public final Object f8737f;

    public x4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f8734a = 7;
        this.d = mediaController;
        this.f8735b = i10;
        this.e = tL_error;
        this.f8737f = tLObject;
        this.f8736c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.x4.run():void");
    }

    public x4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.r rVar) {
        this.f8734a = 0;
        this.f8735b = i10;
        this.d = user;
        this.e = document;
        this.f8736c = i11;
        this.f8737f = rVar;
    }

    public x4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f8734a = i12;
        this.d = obj;
        this.e = obj2;
        this.f8735b = i10;
        this.f8737f = obj3;
        this.f8736c = i11;
    }

    public x4(bo boVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var) {
        this.f8734a = 8;
        this.d = boVar;
        this.f8735b = i10;
        this.f8736c = i11;
        this.e = characterStyle;
        this.f8737f = t1Var;
    }
}
