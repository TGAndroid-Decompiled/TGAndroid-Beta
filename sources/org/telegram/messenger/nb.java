package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class nb implements Runnable {
    public final int f24175a;
    public final boolean f24176b;
    public final int f24177c;
    public final Object d;
    public final Object f24178e;

    public nb(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
        this.f24175a = i10;
        this.d = obj;
        this.f24178e = tLObject;
        this.f24176b = z9;
        this.f24177c = i7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nb.run():void");
    }

    public nb(qb qbVar, int i7, String str, boolean z9) {
        this.f24175a = 0;
        this.d = qbVar;
        this.f24177c = i7;
        this.f24178e = str;
        this.f24176b = z9;
    }

    public nb(ui uiVar, int i7, boolean z9, c20 c20Var) {
        this.f24175a = 2;
        this.d = uiVar;
        this.f24177c = i7;
        this.f24176b = z9;
        this.f24178e = c20Var;
    }
}
