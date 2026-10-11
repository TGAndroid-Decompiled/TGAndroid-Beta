package li;

import android.content.Context;
import android.content.Intent;
import n4.x;
import org.telegram.tgnet.tl.TL_phone;
public final class a implements Runnable {
    public final int f15638a = 1;
    public final int f15639b;
    public final long f15640c;
    public final boolean d;
    public final Object f15641e;
    public final Object f15642f;
    public final Object h;

    public a(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i10, long j3, boolean z10) {
        this.f15641e = intent;
        this.f15642f = phoneCall;
        this.h = context;
        this.f15639b = i10;
        this.f15640c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: li.a.run():void");
    }

    public a(j jVar, long j3, g gVar, int i10, boolean z10, x xVar) {
        this.f15641e = jVar;
        this.f15640c = j3;
        this.f15642f = gVar;
        this.f15639b = i10;
        this.d = z10;
        this.h = xVar;
    }
}
