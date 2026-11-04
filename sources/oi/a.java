package oi;

import android.content.Context;
import android.content.Intent;
import mi.h0;
import org.telegram.tgnet.tl.TL_phone;
public final class a implements Runnable {
    public final int f21128a = 1;
    public final int f21129b;
    public final long f21130c;
    public final boolean d;
    public final Object f21131e;
    public final Object f21132f;
    public final Object h;

    public a(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i3, long j10, boolean z10) {
        this.f21131e = intent;
        this.f21132f = phoneCall;
        this.h = context;
        this.f21129b = i3;
        this.f21130c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: oi.a.run():void");
    }

    public a(j jVar, long j10, g gVar, int i3, boolean z10, h0 h0Var) {
        this.f21131e = jVar;
        this.f21130c = j10;
        this.f21132f = gVar;
        this.f21129b = i3;
        this.d = z10;
        this.h = h0Var;
    }
}
