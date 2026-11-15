package org.telegram.messenger;

import java.util.ArrayList;
public final class op implements Runnable {
    public final int f25789a;
    public final vr f25790b;
    public final int f25791c;
    public final ArrayList d;

    public op(vr vrVar, int i7, ArrayList arrayList, int i10) {
        this.f25789a = i10;
        this.f25790b = vrVar;
        this.f25791c = i7;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.op.run():void");
    }

    public op(vr vrVar, ArrayList arrayList, int i7) {
        this.f25789a = 3;
        this.f25790b = vrVar;
        this.d = arrayList;
        this.f25791c = i7;
    }
}
