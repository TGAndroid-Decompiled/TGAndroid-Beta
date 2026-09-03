package org.telegram.messenger;

import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.r;
import org.telegram.ui.zn;
public final class p6 implements Runnable {
    public final int f18059a;
    public final int f18060b;
    public final int f18061c;
    public final Object d;
    public final Object e;
    public final Object f18062f;

    public p6(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18059a = 0;
        this.d = mediaController;
        this.f18060b = i10;
        this.e = tL_error;
        this.f18062f = tLObject;
        this.f18061c = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.p6.run():void");
    }

    public p6(int i10, TLRPC.User user, TLRPC.Document document, int i11, r rVar) {
        this.f18059a = 2;
        this.f18060b = i10;
        this.d = user;
        this.e = document;
        this.f18061c = i11;
        this.f18062f = rVar;
    }

    public p6(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f18059a = i12;
        this.d = obj;
        this.e = obj2;
        this.f18060b = i10;
        this.f18062f = obj3;
        this.f18061c = i11;
    }

    public p6(zn znVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.s1 s1Var) {
        this.f18059a = 1;
        this.d = znVar;
        this.f18060b = i10;
        this.f18061c = i11;
        this.e = characterStyle;
        this.f18062f = s1Var;
    }
}
