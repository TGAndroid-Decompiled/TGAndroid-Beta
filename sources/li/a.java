package li;

import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.tl.TL_phone;
public final class a implements Runnable {
    public final int f14741a = 1;
    public final int f14742b;
    public final long f14743c;
    public final boolean d;
    public final Object e;
    public final Object f14744f;
    public final Object h;

    public a(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i10, long j10, boolean z10) {
        this.e = intent;
        this.f14744f = phoneCall;
        this.h = context;
        this.f14742b = i10;
        this.f14743c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: li.a.run():void");
    }

    public a(j jVar, long j10, g gVar, int i10, boolean z10, n4.s sVar) {
        this.e = jVar;
        this.f14743c = j10;
        this.f14744f = gVar;
        this.f14742b = i10;
        this.d = z10;
        this.h = sVar;
    }
}
