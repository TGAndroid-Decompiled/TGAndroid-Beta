package ni;

import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.tl.TL_phone;
public final class b implements Runnable {
    public final int f20608a = 1;
    public final int f20609b;
    public final long f20610c;
    public final boolean d;
    public final Object f20611e;
    public final Object f20612f;
    public final Object h;

    public b(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i7, long j3, boolean z9) {
        this.f20611e = intent;
        this.f20612f = phoneCall;
        this.h = context;
        this.f20609b = i7;
        this.f20610c = j3;
        this.d = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ni.b.run():void");
    }

    public b(l lVar, long j3, i iVar, int i7, boolean z9, j2.n nVar) {
        this.f20611e = lVar;
        this.f20610c = j3;
        this.f20612f = iVar;
        this.f20609b = i7;
        this.d = z9;
        this.h = nVar;
    }
}
