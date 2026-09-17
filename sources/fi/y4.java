package fi;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.co;
public final class y4 implements Runnable {
    public final int f10118a;
    public final int f10119b;
    public final int f10120c;
    public final Object d;
    public final Object f10121e;
    public final Object f10122f;

    public y4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f10118a = 7;
        this.d = mediaController;
        this.f10119b = i10;
        this.f10121e = tL_error;
        this.f10122f = tLObject;
        this.f10120c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fi.y4.run():void");
    }

    public y4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.s sVar) {
        this.f10118a = 0;
        this.f10119b = i10;
        this.d = user;
        this.f10121e = document;
        this.f10120c = i11;
        this.f10122f = sVar;
    }

    public y4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f10118a = i12;
        this.d = obj;
        this.f10121e = obj2;
        this.f10119b = i10;
        this.f10122f = obj3;
        this.f10120c = i11;
    }

    public y4(co coVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var) {
        this.f10118a = 8;
        this.d = coVar;
        this.f10119b = i10;
        this.f10120c = i11;
        this.f10121e = characterStyle;
        this.f10122f = t1Var;
    }
}
