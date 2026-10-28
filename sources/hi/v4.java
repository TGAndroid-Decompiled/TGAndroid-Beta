package hi;

import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.Wallet.r5;
import org.telegram.ui.wn;
public final class v4 implements Runnable {
    public final int f13336a;
    public final int f13337b;
    public final int f13338c;
    public final Object d;
    public final Object e;
    public final Object f13339f;

    public v4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f13336a = 7;
        this.d = mediaController;
        this.f13337b = i10;
        this.e = tL_error;
        this.f13339f = tLObject;
        this.f13338c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.v4.run():void");
    }

    public v4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.r rVar) {
        this.f13336a = 0;
        this.f13337b = i10;
        this.d = user;
        this.e = document;
        this.f13338c = i11;
        this.f13339f = rVar;
    }

    public v4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f13336a = i12;
        this.d = obj;
        this.e = obj2;
        this.f13337b = i10;
        this.f13339f = obj3;
        this.f13338c = i11;
    }

    public v4(wn wnVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.s1 s1Var) {
        this.f13336a = 8;
        this.d = wnVar;
        this.f13337b = i10;
        this.f13338c = i11;
        this.e = characterStyle;
        this.f13339f = s1Var;
    }

    public v4(r5 r5Var, Context context, int i10, int i11, o5 o5Var) {
        this.f13336a = 9;
        this.d = r5Var;
        this.e = context;
        this.f13337b = i10;
        this.f13338c = i11;
        this.f13339f = o5Var;
    }
}
