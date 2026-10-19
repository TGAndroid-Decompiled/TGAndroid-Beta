package gi;

import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.q5;
import org.telegram.ui.Wallet.s5;
import org.telegram.ui.qn;
public final class m4 implements Runnable {
    public final int f11337a;
    public final int f11338b;
    public final int f11339c;
    public final Object d;
    public final Object e;
    public final Object f11340f;

    public m4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f11337a = 7;
        this.d = mediaController;
        this.f11338b = i10;
        this.e = tL_error;
        this.f11340f = tLObject;
        this.f11339c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gi.m4.run():void");
    }

    public m4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.r rVar) {
        this.f11337a = 0;
        this.f11338b = i10;
        this.d = user;
        this.e = document;
        this.f11339c = i11;
        this.f11340f = rVar;
    }

    public m4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f11337a = i12;
        this.d = obj;
        this.e = obj2;
        this.f11338b = i10;
        this.f11340f = obj3;
        this.f11339c = i11;
    }

    public m4(qn qnVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var) {
        this.f11337a = 8;
        this.d = qnVar;
        this.f11338b = i10;
        this.f11339c = i11;
        this.e = characterStyle;
        this.f11340f = u1Var;
    }

    public m4(s5 s5Var, Context context, int i10, int i11, q5 q5Var) {
        this.f11337a = 9;
        this.d = s5Var;
        this.e = context;
        this.f11338b = i10;
        this.f11339c = i11;
        this.f11340f = q5Var;
    }
}
