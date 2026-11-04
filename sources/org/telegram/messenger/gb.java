package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class gb implements Runnable {
    public final int f22691a;
    public final boolean f22692b;
    public final int f22693c;
    public final Object d;
    public final Object f22694e;

    public gb(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
        this.f22691a = i10;
        this.d = obj;
        this.f22694e = tLObject;
        this.f22692b = z10;
        this.f22693c = i3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gb.run():void");
    }

    public gb(jb jbVar, int i3, String str, boolean z10) {
        this.f22691a = 0;
        this.d = jbVar;
        this.f22693c = i3;
        this.f22694e = str;
        this.f22692b = z10;
    }

    public gb(li liVar, int i3, boolean z10, u10 u10Var) {
        this.f22691a = 2;
        this.d = liVar;
        this.f22693c = i3;
        this.f22692b = z10;
        this.f22694e = u10Var;
    }
}
