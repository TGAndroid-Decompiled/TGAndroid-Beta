package ki;

import android.content.Context;
import android.content.Intent;
import n4.y;
import org.telegram.tgnet.tl.TL_phone;
public final class a implements Runnable {
    public final int f14871a = 1;
    public final int f14872b;
    public final long f14873c;
    public final boolean d;
    public final Object f14874e;
    public final Object f14875f;
    public final Object h;

    public a(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i10, long j3, boolean z10) {
        this.f14874e = intent;
        this.f14875f = phoneCall;
        this.h = context;
        this.f14872b = i10;
        this.f14873c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.a.run():void");
    }

    public a(j jVar, long j3, g gVar, int i10, boolean z10, y yVar) {
        this.f14874e = jVar;
        this.f14873c = j3;
        this.f14875f = gVar;
        this.f14872b = i10;
        this.d = z10;
        this.h = yVar;
    }
}
