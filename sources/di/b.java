package di;

import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.tl.TL_phone;
public final class b implements Runnable {
    public final int f5953a = 1;
    public final int f5954b;
    public final long f5955c;
    public final boolean d;
    public final Object e;
    public final Object f5956f;
    public final Object h;

    public b(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i10, long j10, boolean z10) {
        this.e = intent;
        this.f5956f = phoneCall;
        this.h = context;
        this.f5954b = i10;
        this.f5955c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.b.run():void");
    }

    public b(k kVar, long j10, h hVar, int i10, boolean z10, n4.q qVar) {
        this.e = kVar;
        this.f5955c = j10;
        this.f5956f = hVar;
        this.f5954b = i10;
        this.d = z10;
        this.h = qVar;
    }
}
