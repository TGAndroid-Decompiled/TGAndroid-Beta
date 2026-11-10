package ni;

import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.utils.twidget.i1;
public final class b implements Runnable {
    public final int f20616a = 1;
    public final int f20617b;
    public final long f20618c;
    public final boolean d;
    public final Object f20619e;
    public final Object f20620f;
    public final Object h;

    public b(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i7, long j3, boolean z9) {
        this.f20619e = intent;
        this.f20620f = phoneCall;
        this.h = context;
        this.f20617b = i7;
        this.f20618c = j3;
        this.d = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ni.b.run():void");
    }

    public b(l lVar, long j3, i iVar, int i7, boolean z9, j2.n nVar) {
        this.f20619e = lVar;
        this.f20618c = j3;
        this.f20620f = iVar;
        this.f20617b = i7;
        this.d = z9;
        this.h = nVar;
    }

    public b(i1 i1Var, int i7, long j3, JSONObject jSONObject, String str, boolean z9) {
        this.f20619e = i1Var;
        this.f20617b = i7;
        this.f20618c = j3;
        this.f20620f = jSONObject;
        this.h = str;
        this.d = z9;
    }
}
