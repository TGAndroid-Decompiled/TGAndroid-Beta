package org.telegram.messenger;

import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xn;
public final class p6 implements Runnable {
    public final int f18081a;
    public final int f18082b;
    public final int f18083c;
    public final Object d;
    public final Object e;
    public final Object f18084f;

    public p6(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18081a = 0;
        this.d = mediaController;
        this.f18082b = i10;
        this.e = tL_error;
        this.f18084f = tLObject;
        this.f18083c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.p6.run():void");
    }

    public p6(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.s sVar) {
        this.f18081a = 2;
        this.f18082b = i10;
        this.d = user;
        this.e = document;
        this.f18083c = i11;
        this.f18084f = sVar;
    }

    public p6(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f18081a = i12;
        this.d = obj;
        this.e = obj2;
        this.f18082b = i10;
        this.f18084f = obj3;
        this.f18083c = i11;
    }

    public p6(xn xnVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var) {
        this.f18081a = 1;
        this.d = xnVar;
        this.f18082b = i10;
        this.f18083c = i11;
        this.e = characterStyle;
        this.f18084f = t1Var;
    }
}
