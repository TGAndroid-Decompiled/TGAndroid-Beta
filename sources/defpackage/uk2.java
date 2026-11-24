package defpackage;

import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.utils.twidget.z;
public final class uk2 implements Runnable {
    public final byte a = 1;
    public final int b;
    public final long c;
    public final boolean d;
    public final Object e;
    public final Object f;
    public final Object h;

    public uk2(dl2 dl2Var, long j, al2 al2Var, int i, boolean z, wm4 wm4Var) {
        this.e = dl2Var;
        this.c = j;
        this.f = al2Var;
        this.b = i;
        this.d = z;
        this.h = wm4Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk2.run():void");
    }

    public uk2(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i, long j, boolean z) {
        this.e = intent;
        this.f = phoneCall;
        this.h = context;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public uk2(z zVar, int i, long j, JSONObject jSONObject, String str, boolean z) {
        this.e = zVar;
        this.b = i;
        this.c = j;
        this.f = jSONObject;
        this.h = str;
        this.d = z;
    }
}
