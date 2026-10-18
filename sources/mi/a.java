package mi;

import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.tl.TL_phone;
public final class a implements Runnable {
    public final int f16940a = 1;
    public final int f16941b;
    public final long f16942c;
    public final boolean d;
    public final Object e;
    public final Object f16943f;
    public final Object h;

    public a(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i10, long j10, boolean z10) {
        this.e = intent;
        this.f16943f = phoneCall;
        this.h = context;
        this.f16941b = i10;
        this.f16942c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mi.a.run():void");
    }

    public a(j jVar, long j10, g gVar, int i10, boolean z10, q qVar) {
        this.e = jVar;
        this.f16942c = j10;
        this.f16943f = gVar;
        this.f16941b = i10;
        this.d = z10;
        this.h = qVar;
    }
}
