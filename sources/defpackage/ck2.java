package defpackage;

import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.utils.twidget.z;
public final class ck2 implements Runnable {
    public final byte a = 1;
    public final int b;
    public final long c;
    public final boolean d;
    public final Object e;
    public final Object f;
    public final Object h;

    public ck2(lk2 lk2Var, long j, ik2 ik2Var, int i, boolean z, um4 um4Var) {
        this.e = lk2Var;
        this.c = j;
        this.f = ik2Var;
        this.b = i;
        this.d = z;
        this.h = um4Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.run():void");
    }

    public ck2(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i, long j, boolean z) {
        this.e = intent;
        this.f = phoneCall;
        this.h = context;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public ck2(z zVar, int i, long j, JSONObject jSONObject, String str, boolean z) {
        this.e = zVar;
        this.b = i;
        this.c = j;
        this.f = jSONObject;
        this.h = str;
        this.d = z;
    }
}
