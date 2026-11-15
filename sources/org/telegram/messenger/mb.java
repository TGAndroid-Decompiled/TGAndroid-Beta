package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class mb implements Runnable {
    public final int f25009a;
    public final boolean f25010b;
    public final int f25011c;
    public final Object d;
    public final Object f25012e;

    public mb(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
        this.f25009a = i10;
        this.d = obj;
        this.f25012e = tLObject;
        this.f25010b = z10;
        this.f25011c = i7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mb.run():void");
    }

    public mb(pb pbVar, int i7, String str, boolean z10) {
        this.f25009a = 0;
        this.d = pbVar;
        this.f25011c = i7;
        this.f25012e = str;
        this.f25010b = z10;
    }

    public mb(si siVar, int i7, boolean z10, z10 z10Var) {
        this.f25009a = 2;
        this.d = siVar;
        this.f25011c = i7;
        this.f25010b = z10;
        this.f25012e = z10Var;
    }
}
