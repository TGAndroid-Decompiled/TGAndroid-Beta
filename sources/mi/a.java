package mi;

import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.tl.TL_phone;
public final class a implements Runnable {
    public final int f16935a = 1;
    public final int f16936b;
    public final long f16937c;
    public final boolean d;
    public final Object e;
    public final Object f16938f;
    public final Object h;

    public a(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i10, long j10, boolean z10) {
        this.e = intent;
        this.f16938f = phoneCall;
        this.h = context;
        this.f16936b = i10;
        this.f16937c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mi.a.run():void");
    }

    public a(j jVar, long j10, g gVar, int i10, boolean z10, q qVar) {
        this.e = jVar;
        this.f16937c = j10;
        this.f16938f = gVar;
        this.f16936b = i10;
        this.d = z10;
        this.h = qVar;
    }
}
