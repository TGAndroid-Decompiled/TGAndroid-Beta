package org.telegram.messenger;

import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xn;
public final class p6 implements Runnable {
    public final int f19633a;
    public final int f19634b;
    public final int f19635c;
    public final Object d;
    public final Object f19636e;
    public final Object f19637f;

    public p6(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19633a = 0;
        this.d = mediaController;
        this.f19634b = i10;
        this.f19636e = tL_error;
        this.f19637f = tLObject;
        this.f19635c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.p6.run():void");
    }

    public p6(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.s sVar) {
        this.f19633a = 2;
        this.f19634b = i10;
        this.d = user;
        this.f19636e = document;
        this.f19635c = i11;
        this.f19637f = sVar;
    }

    public p6(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f19633a = i12;
        this.d = obj;
        this.f19636e = obj2;
        this.f19634b = i10;
        this.f19637f = obj3;
        this.f19635c = i11;
    }

    public p6(xn xnVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var) {
        this.f19633a = 1;
        this.d = xnVar;
        this.f19634b = i10;
        this.f19635c = i11;
        this.f19636e = characterStyle;
        this.f19637f = t1Var;
    }
}
