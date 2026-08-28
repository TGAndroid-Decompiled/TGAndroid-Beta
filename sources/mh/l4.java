package mh;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qn;
public final class l4 implements Runnable {
    public final int f17969a;
    public final int f17970b;
    public final int f17971c;
    public final Object d;
    public final Object f17972e;
    public final Object f17973f;

    public l4(int i9, int i10, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17969a = 2;
        this.d = mediaController;
        this.f17970b = i9;
        this.f17972e = tL_error;
        this.f17973f = tLObject;
        this.f17971c = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mh.l4.run():void");
    }

    public l4(int i9, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.r rVar) {
        this.f17969a = 0;
        this.f17970b = i9;
        this.d = user;
        this.f17972e = document;
        this.f17971c = i10;
        this.f17973f = rVar;
    }

    public l4(Object obj, Object obj2, int i9, Object obj3, int i10, int i11) {
        this.f17969a = i11;
        this.d = obj;
        this.f17972e = obj2;
        this.f17970b = i9;
        this.f17973f = obj3;
        this.f17971c = i10;
    }

    public l4(qn qnVar, int i9, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var) {
        this.f17969a = 3;
        this.d = qnVar;
        this.f17970b = i9;
        this.f17971c = i10;
        this.f17972e = characterStyle;
        this.f17973f = t1Var;
    }
}
