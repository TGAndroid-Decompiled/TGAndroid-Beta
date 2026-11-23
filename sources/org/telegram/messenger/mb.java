package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class mb implements Runnable {
    public final int f25557a;
    public final boolean f25558b;
    public final int f25559c;
    public final Object d;
    public final Object f25560e;

    public mb(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
        this.f25557a = i10;
        this.d = obj;
        this.f25560e = tLObject;
        this.f25558b = z10;
        this.f25559c = i7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mb.run():void");
    }

    public mb(pb pbVar, int i7, String str, boolean z10) {
        this.f25557a = 0;
        this.d = pbVar;
        this.f25559c = i7;
        this.f25560e = str;
        this.f25558b = z10;
    }

    public mb(si siVar, int i7, boolean z10, y10 y10Var) {
        this.f25557a = 2;
        this.d = siVar;
        this.f25559c = i7;
        this.f25558b = z10;
        this.f25560e = y10Var;
    }
}
