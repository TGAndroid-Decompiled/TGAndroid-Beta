package gi;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sn;
public final class m4 implements Runnable {
    public final int f11340a;
    public final int f11341b;
    public final int f11342c;
    public final Object d;
    public final Object e;
    public final Object f11343f;

    public m4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f11340a = 7;
        this.d = mediaController;
        this.f11341b = i10;
        this.e = tL_error;
        this.f11343f = tLObject;
        this.f11342c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gi.m4.run():void");
    }

    public m4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.r rVar) {
        this.f11340a = 0;
        this.f11341b = i10;
        this.d = user;
        this.e = document;
        this.f11342c = i11;
        this.f11343f = rVar;
    }

    public m4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f11340a = i12;
        this.d = obj;
        this.e = obj2;
        this.f11341b = i10;
        this.f11343f = obj3;
        this.f11342c = i11;
    }

    public m4(sn snVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var) {
        this.f11340a = 8;
        this.d = snVar;
        this.f11341b = i10;
        this.f11342c = i11;
        this.e = characterStyle;
        this.f11343f = u1Var;
    }
}
