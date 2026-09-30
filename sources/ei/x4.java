package ei;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wn;
public final class x4 implements Runnable {
    public final int f8728a;
    public final int f8729b;
    public final int f8730c;
    public final Object d;
    public final Object e;
    public final Object f8731f;

    public x4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f8728a = 7;
        this.d = mediaController;
        this.f8729b = i10;
        this.e = tL_error;
        this.f8731f = tLObject;
        this.f8730c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.x4.run():void");
    }

    public x4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.q qVar) {
        this.f8728a = 0;
        this.f8729b = i10;
        this.d = user;
        this.e = document;
        this.f8730c = i11;
        this.f8731f = qVar;
    }

    public x4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f8728a = i12;
        this.d = obj;
        this.e = obj2;
        this.f8729b = i10;
        this.f8731f = obj3;
        this.f8730c = i11;
    }

    public x4(wn wnVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var) {
        this.f8728a = 8;
        this.d = wnVar;
        this.f8729b = i10;
        this.f8730c = i11;
        this.e = characterStyle;
        this.f8731f = u1Var;
    }
}
