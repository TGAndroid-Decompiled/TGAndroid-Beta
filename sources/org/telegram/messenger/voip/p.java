package org.telegram.messenger.voip;

import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.utils.twidget.p1;
public final class p implements Runnable {
    public final int f27561a = 0;
    public final int f27562b;
    public final long f27563c;
    public final boolean d;
    public final Object f27564e;
    public final Object f27565f;
    public final Object h;

    public p(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i7, long j3, boolean z10) {
        this.f27564e = intent;
        this.f27565f = phoneCall;
        this.h = context;
        this.f27562b = i7;
        this.f27563c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.p.run():void");
    }

    public p(p1 p1Var, int i7, long j3, JSONObject jSONObject, String str, boolean z10) {
        this.f27564e = p1Var;
        this.f27562b = i7;
        this.f27563c = j3;
        this.f27565f = jSONObject;
        this.h = str;
        this.d = z10;
    }

    public p(qi.i iVar, long j3, qi.f fVar, int i7, boolean z10, ji.l lVar) {
        this.f27564e = iVar;
        this.f27563c = j3;
        this.f27565f = fVar;
        this.f27562b = i7;
        this.d = z10;
        this.h = lVar;
    }
}
