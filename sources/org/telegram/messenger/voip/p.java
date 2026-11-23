package org.telegram.messenger.voip;

import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.utils.twidget.p1;
public final class p implements Runnable {
    public final int f27524a = 0;
    public final int f27525b;
    public final long f27526c;
    public final boolean d;
    public final Object f27527e;
    public final Object f27528f;
    public final Object h;

    public p(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i7, long j3, boolean z10) {
        this.f27527e = intent;
        this.f27528f = phoneCall;
        this.h = context;
        this.f27525b = i7;
        this.f27526c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.p.run():void");
    }

    public p(p1 p1Var, int i7, long j3, JSONObject jSONObject, String str, boolean z10) {
        this.f27527e = p1Var;
        this.f27525b = i7;
        this.f27526c = j3;
        this.f27528f = jSONObject;
        this.h = str;
        this.d = z10;
    }

    public p(qi.i iVar, long j3, qi.f fVar, int i7, boolean z10, ji.l lVar) {
        this.f27527e = iVar;
        this.f27526c = j3;
        this.f27528f = fVar;
        this.f27525b = i7;
        this.d = z10;
        this.h = lVar;
    }
}
