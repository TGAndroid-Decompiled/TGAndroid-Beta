package ni;

import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.tl.TL_phone;
public final class a implements Runnable {
    public final int f18866a = 1;
    public final int f18867b;
    public final long f18868c;
    public final boolean d;
    public final Object e;
    public final Object f18869f;
    public final Object h;

    public a(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i10, long j10, boolean z10) {
        this.e = intent;
        this.f18869f = phoneCall;
        this.h = context;
        this.f18867b = i10;
        this.f18868c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ni.a.run():void");
    }

    public a(j jVar, long j10, g gVar, int i10, boolean z10, m4.c cVar) {
        this.e = jVar;
        this.f18868c = j10;
        this.f18869f = gVar;
        this.f18867b = i10;
        this.d = z10;
        this.h = cVar;
    }
}
