package li;

import android.content.Context;
import android.content.Intent;
import n4.x;
import org.telegram.tgnet.tl.TL_phone;
public final class a implements Runnable {
    public final int f15602a = 1;
    public final int f15603b;
    public final long f15604c;
    public final boolean d;
    public final Object f15605e;
    public final Object f15606f;
    public final Object h;

    public a(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i10, long j3, boolean z10) {
        this.f15605e = intent;
        this.f15606f = phoneCall;
        this.h = context;
        this.f15603b = i10;
        this.f15604c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: li.a.run():void");
    }

    public a(j jVar, long j3, g gVar, int i10, boolean z10, x xVar) {
        this.f15605e = jVar;
        this.f15604c = j3;
        this.f15606f = gVar;
        this.f15603b = i10;
        this.d = z10;
        this.h = xVar;
    }
}
