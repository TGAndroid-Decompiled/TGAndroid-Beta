package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
public final class d8 implements Runnable {
    public final int f22163a = 0;
    public final int f22164b;
    public final long f22165c;
    public final int d;
    public final int f22166e;
    public final Object f22167f;
    public final Serializable h;

    public d8(f8 f8Var, long j10, int i3, int i10, String str, int i11) {
        this.f22167f = f8Var;
        this.f22165c = j10;
        this.f22164b = i3;
        this.d = i10;
        this.h = str;
        this.f22166e = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d8.run():void");
    }

    public d8(qr qrVar, int i3, long j10, int i10, ArrayList arrayList, int i11) {
        this.f22167f = qrVar;
        this.f22164b = i3;
        this.f22165c = j10;
        this.d = i10;
        this.h = arrayList;
        this.f22166e = i11;
    }
}
