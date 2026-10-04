package ei;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yn;
public final class y4 implements Runnable {
    public final int f9490a;
    public final int f9491b;
    public final int f9492c;
    public final Object d;
    public final Object f9493e;
    public final Object f9494f;

    public y4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f9490a = 7;
        this.d = mediaController;
        this.f9491b = i10;
        this.f9493e = tL_error;
        this.f9494f = tLObject;
        this.f9492c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.y4.run():void");
    }

    public y4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.q qVar) {
        this.f9490a = 0;
        this.f9491b = i10;
        this.d = user;
        this.f9493e = document;
        this.f9492c = i11;
        this.f9494f = qVar;
    }

    public y4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f9490a = i12;
        this.d = obj;
        this.f9493e = obj2;
        this.f9491b = i10;
        this.f9494f = obj3;
        this.f9492c = i11;
    }

    public y4(yn ynVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var) {
        this.f9490a = 8;
        this.d = ynVar;
        this.f9491b = i10;
        this.f9492c = i11;
        this.f9493e = characterStyle;
        this.f9494f = u1Var;
    }
}
