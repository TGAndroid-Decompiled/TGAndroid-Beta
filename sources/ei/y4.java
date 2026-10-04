package ei;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yn;
public final class y4 implements Runnable {
    public final int f9489a;
    public final int f9490b;
    public final int f9491c;
    public final Object d;
    public final Object f9492e;
    public final Object f9493f;

    public y4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f9489a = 7;
        this.d = mediaController;
        this.f9490b = i10;
        this.f9492e = tL_error;
        this.f9493f = tLObject;
        this.f9491c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.y4.run():void");
    }

    public y4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.q qVar) {
        this.f9489a = 0;
        this.f9490b = i10;
        this.d = user;
        this.f9492e = document;
        this.f9491c = i11;
        this.f9493f = qVar;
    }

    public y4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f9489a = i12;
        this.d = obj;
        this.f9492e = obj2;
        this.f9490b = i10;
        this.f9493f = obj3;
        this.f9491c = i11;
    }

    public y4(yn ynVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var) {
        this.f9489a = 8;
        this.d = ynVar;
        this.f9490b = i10;
        this.f9491c = i11;
        this.f9492e = characterStyle;
        this.f9493f = u1Var;
    }
}
