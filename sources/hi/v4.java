package hi;

import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.Wallet.r5;
import org.telegram.ui.un;
public final class v4 implements Runnable {
    public final int f13337a;
    public final int f13338b;
    public final int f13339c;
    public final Object d;
    public final Object e;
    public final Object f13340f;

    public v4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f13337a = 7;
        this.d = mediaController;
        this.f13338b = i10;
        this.e = tL_error;
        this.f13340f = tLObject;
        this.f13339c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.v4.run():void");
    }

    public v4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.r rVar) {
        this.f13337a = 0;
        this.f13338b = i10;
        this.d = user;
        this.e = document;
        this.f13339c = i11;
        this.f13340f = rVar;
    }

    public v4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f13337a = i12;
        this.d = obj;
        this.e = obj2;
        this.f13338b = i10;
        this.f13340f = obj3;
        this.f13339c = i11;
    }

    public v4(un unVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.s1 s1Var) {
        this.f13337a = 8;
        this.d = unVar;
        this.f13338b = i10;
        this.f13339c = i11;
        this.e = characterStyle;
        this.f13340f = s1Var;
    }

    public v4(r5 r5Var, Context context, int i10, int i11, o5 o5Var) {
        this.f13337a = 9;
        this.d = r5Var;
        this.e = context;
        this.f13338b = i10;
        this.f13339c = i11;
        this.f13340f = o5Var;
    }
}
