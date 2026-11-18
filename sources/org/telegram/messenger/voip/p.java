package org.telegram.messenger.voip;

import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.utils.twidget.p1;
public final class p implements Runnable {
    public final int f27535a = 0;
    public final int f27536b;
    public final long f27537c;
    public final boolean d;
    public final Object f27538e;
    public final Object f27539f;
    public final Object h;

    public p(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i7, long j3, boolean z10) {
        this.f27538e = intent;
        this.f27539f = phoneCall;
        this.h = context;
        this.f27536b = i7;
        this.f27537c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.p.run():void");
    }

    public p(p1 p1Var, int i7, long j3, JSONObject jSONObject, String str, boolean z10) {
        this.f27538e = p1Var;
        this.f27536b = i7;
        this.f27537c = j3;
        this.f27539f = jSONObject;
        this.h = str;
        this.d = z10;
    }

    public p(qi.i iVar, long j3, qi.f fVar, int i7, boolean z10, ji.j jVar) {
        this.f27538e = iVar;
        this.f27537c = j3;
        this.f27539f = fVar;
        this.f27536b = i7;
        this.d = z10;
        this.h = jVar;
    }
}
