package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class mb implements Runnable {
    public final int f25521a;
    public final boolean f25522b;
    public final int f25523c;
    public final Object d;
    public final Object f25524e;

    public mb(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
        this.f25521a = i10;
        this.d = obj;
        this.f25524e = tLObject;
        this.f25522b = z10;
        this.f25523c = i7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mb.run():void");
    }

    public mb(pb pbVar, int i7, String str, boolean z10) {
        this.f25521a = 0;
        this.d = pbVar;
        this.f25523c = i7;
        this.f25524e = str;
        this.f25522b = z10;
    }

    public mb(si siVar, int i7, boolean z10, y10 y10Var) {
        this.f25521a = 2;
        this.d = siVar;
        this.f25523c = i7;
        this.f25522b = z10;
        this.f25524e = y10Var;
    }
}
