package fi;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.co;
public final class y4 implements Runnable {
    public final int f10146a;
    public final int f10147b;
    public final int f10148c;
    public final Object d;
    public final Object f10149e;
    public final Object f10150f;

    public y4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f10146a = 7;
        this.d = mediaController;
        this.f10147b = i10;
        this.f10149e = tL_error;
        this.f10150f = tLObject;
        this.f10148c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fi.y4.run():void");
    }

    public y4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.s sVar) {
        this.f10146a = 0;
        this.f10147b = i10;
        this.d = user;
        this.f10149e = document;
        this.f10148c = i11;
        this.f10150f = sVar;
    }

    public y4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f10146a = i12;
        this.d = obj;
        this.f10149e = obj2;
        this.f10147b = i10;
        this.f10150f = obj3;
        this.f10148c = i11;
    }

    public y4(co coVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var) {
        this.f10146a = 8;
        this.d = coVar;
        this.f10147b = i10;
        this.f10148c = i11;
        this.f10149e = characterStyle;
        this.f10150f = t1Var;
    }
}
