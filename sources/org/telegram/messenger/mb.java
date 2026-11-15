package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class mb implements Runnable {
    public final int f25015a;
    public final boolean f25016b;
    public final int f25017c;
    public final Object d;
    public final Object f25018e;

    public mb(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
        this.f25015a = i10;
        this.d = obj;
        this.f25018e = tLObject;
        this.f25016b = z10;
        this.f25017c = i7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mb.run():void");
    }

    public mb(pb pbVar, int i7, String str, boolean z10) {
        this.f25015a = 0;
        this.d = pbVar;
        this.f25017c = i7;
        this.f25018e = str;
        this.f25016b = z10;
    }

    public mb(si siVar, int i7, boolean z10, z10 z10Var) {
        this.f25015a = 2;
        this.d = siVar;
        this.f25017c = i7;
        this.f25016b = z10;
        this.f25018e = z10Var;
    }
}
