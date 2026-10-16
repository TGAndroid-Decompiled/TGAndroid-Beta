package fi;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fo;
public final class x4 implements Runnable {
    public final int f9668a;
    public final int f9669b;
    public final int f9670c;
    public final Object d;
    public final Object e;
    public final Object f9671f;

    public x4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f9668a = 7;
        this.d = mediaController;
        this.f9669b = i10;
        this.e = tL_error;
        this.f9671f = tLObject;
        this.f9670c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fi.x4.run():void");
    }

    public x4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.q qVar) {
        this.f9668a = 0;
        this.f9669b = i10;
        this.d = user;
        this.e = document;
        this.f9670c = i11;
        this.f9671f = qVar;
    }

    public x4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f9668a = i12;
        this.d = obj;
        this.e = obj2;
        this.f9669b = i10;
        this.f9671f = obj3;
        this.f9670c = i11;
    }

    public x4(fo foVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var) {
        this.f9668a = 8;
        this.d = foVar;
        this.f9669b = i10;
        this.f9670c = i11;
        this.e = characterStyle;
        this.f9671f = u1Var;
    }
}
