package org.telegram.messenger;

import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tn;
public final class o6 implements Runnable {
    public final int f21118a;
    public final int f21119b;
    public final int f21120c;
    public final Object d;
    public final Object f21121e;
    public final Object f21122f;

    public o6(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21118a = 0;
        this.d = mediaController;
        this.f21119b = i10;
        this.f21121e = tL_error;
        this.f21122f = tLObject;
        this.f21120c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.o6.run():void");
    }

    public o6(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.s sVar) {
        this.f21118a = 2;
        this.f21119b = i10;
        this.d = user;
        this.f21121e = document;
        this.f21120c = i11;
        this.f21122f = sVar;
    }

    public o6(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f21118a = i12;
        this.d = obj;
        this.f21121e = obj2;
        this.f21119b = i10;
        this.f21122f = obj3;
        this.f21120c = i11;
    }

    public o6(tn tnVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.s1 s1Var) {
        this.f21118a = 1;
        this.d = tnVar;
        this.f21119b = i10;
        this.f21120c = i11;
        this.f21121e = characterStyle;
        this.f21122f = s1Var;
    }
}
