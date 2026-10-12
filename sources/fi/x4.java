package fi;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fo;
public final class x4 implements Runnable {
    public final int f9665a;
    public final int f9666b;
    public final int f9667c;
    public final Object d;
    public final Object e;
    public final Object f9668f;

    public x4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f9665a = 7;
        this.d = mediaController;
        this.f9666b = i10;
        this.e = tL_error;
        this.f9668f = tLObject;
        this.f9667c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fi.x4.run():void");
    }

    public x4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.q qVar) {
        this.f9665a = 0;
        this.f9666b = i10;
        this.d = user;
        this.e = document;
        this.f9667c = i11;
        this.f9668f = qVar;
    }

    public x4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f9665a = i12;
        this.d = obj;
        this.e = obj2;
        this.f9666b = i10;
        this.f9668f = obj3;
        this.f9667c = i11;
    }

    public x4(fo foVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var) {
        this.f9665a = 8;
        this.d = foVar;
        this.f9666b = i10;
        this.f9667c = i11;
        this.e = characterStyle;
        this.f9668f = u1Var;
    }
}
