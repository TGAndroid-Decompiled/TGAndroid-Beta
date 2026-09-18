package ei;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zn;
public final class x4 implements Runnable {
    public final int f8733a;
    public final int f8734b;
    public final int f8735c;
    public final Object d;
    public final Object e;
    public final Object f8736f;

    public x4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f8733a = 7;
        this.d = mediaController;
        this.f8734b = i10;
        this.e = tL_error;
        this.f8736f = tLObject;
        this.f8735c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.x4.run():void");
    }

    public x4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.r rVar) {
        this.f8733a = 0;
        this.f8734b = i10;
        this.d = user;
        this.e = document;
        this.f8735c = i11;
        this.f8736f = rVar;
    }

    public x4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f8733a = i12;
        this.d = obj;
        this.e = obj2;
        this.f8734b = i10;
        this.f8736f = obj3;
        this.f8735c = i11;
    }

    public x4(zn znVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var) {
        this.f8733a = 8;
        this.d = znVar;
        this.f8734b = i10;
        this.f8735c = i11;
        this.e = characterStyle;
        this.f8736f = u1Var;
    }
}
