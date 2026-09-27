package ei;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xn;
public final class x4 implements Runnable {
    public final int f8719a;
    public final int f8720b;
    public final int f8721c;
    public final Object d;
    public final Object e;
    public final Object f8722f;

    public x4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f8719a = 7;
        this.d = mediaController;
        this.f8720b = i10;
        this.e = tL_error;
        this.f8722f = tLObject;
        this.f8721c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.x4.run():void");
    }

    public x4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.q qVar) {
        this.f8719a = 0;
        this.f8720b = i10;
        this.d = user;
        this.e = document;
        this.f8721c = i11;
        this.f8722f = qVar;
    }

    public x4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f8719a = i12;
        this.d = obj;
        this.e = obj2;
        this.f8720b = i10;
        this.f8722f = obj3;
        this.f8721c = i11;
    }

    public x4(xn xnVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var) {
        this.f8719a = 8;
        this.d = xnVar;
        this.f8720b = i10;
        this.f8721c = i11;
        this.e = characterStyle;
        this.f8722f = u1Var;
    }
}
