package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class nb implements Runnable {
    public final int f24165a;
    public final boolean f24166b;
    public final int f24167c;
    public final Object d;
    public final Object f24168e;

    public nb(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
        this.f24165a = i10;
        this.d = obj;
        this.f24168e = tLObject;
        this.f24166b = z9;
        this.f24167c = i7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nb.run():void");
    }

    public nb(qb qbVar, int i7, String str, boolean z9) {
        this.f24165a = 0;
        this.d = qbVar;
        this.f24167c = i7;
        this.f24168e = str;
        this.f24166b = z9;
    }

    public nb(ui uiVar, int i7, boolean z9, c20 c20Var) {
        this.f24165a = 2;
        this.d = uiVar;
        this.f24167c = i7;
        this.f24166b = z9;
        this.f24168e = c20Var;
    }
}
