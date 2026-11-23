package org.telegram.messenger;

import java.util.ArrayList;
public final class up implements Runnable {
    public final int f27203a;
    public final ur f27204b;
    public final ArrayList f27205c;
    public final int d;

    public up(ur urVar, int i7, ArrayList arrayList, int i10) {
        this.f27203a = i10;
        this.f27204b = urVar;
        this.d = i7;
        this.f27205c = arrayList;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.up.run():void");
    }

    public up(ur urVar, ArrayList arrayList, int i7) {
        this.f27203a = 1;
        this.f27204b = urVar;
        this.f27205c = arrayList;
        this.d = i7;
    }
}
