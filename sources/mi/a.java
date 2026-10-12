package mi;

import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.tl.TL_phone;
public final class a implements Runnable {
    public final int f15848a = 1;
    public final int f15849b;
    public final long f15850c;
    public final boolean d;
    public final Object e;
    public final Object f15851f;
    public final Object h;

    public a(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i10, long j10, boolean z10) {
        this.e = intent;
        this.f15851f = phoneCall;
        this.h = context;
        this.f15849b = i10;
        this.f15850c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mi.a.run():void");
    }

    public a(j jVar, long j10, g gVar, int i10, boolean z10, m4.c cVar) {
        this.e = jVar;
        this.f15850c = j10;
        this.f15851f = gVar;
        this.f15849b = i10;
        this.d = z10;
        this.h = cVar;
    }
}
