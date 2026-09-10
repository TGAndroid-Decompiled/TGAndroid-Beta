package di;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.eo;
public final class b5 implements Runnable {
    public final int f6548a;
    public final int f6549b;
    public final int f6550c;
    public final Object d;
    public final Object e;
    public final Object f6551f;

    public b5(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f6548a = 7;
        this.d = mediaController;
        this.f6549b = i10;
        this.e = tL_error;
        this.f6551f = tLObject;
        this.f6550c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.b5.run():void");
    }

    public b5(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.r rVar) {
        this.f6548a = 0;
        this.f6549b = i10;
        this.d = user;
        this.e = document;
        this.f6550c = i11;
        this.f6551f = rVar;
    }

    public b5(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f6548a = i12;
        this.d = obj;
        this.e = obj2;
        this.f6549b = i10;
        this.f6551f = obj3;
        this.f6550c = i11;
    }

    public b5(eo eoVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var) {
        this.f6548a = 8;
        this.d = eoVar;
        this.f6549b = i10;
        this.f6550c = i11;
        this.e = characterStyle;
        this.f6551f = t1Var;
    }
}
