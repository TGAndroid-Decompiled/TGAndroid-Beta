package fi;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.ok;
public final class u3 implements Runnable {
    public final int f9583a = 0;
    public final int f9584b;
    public final TLRPC.TL_error f9585c;
    public final TLObject d;
    public final boolean e;
    public final long f9586f;
    public final long h;
    public final Object f9587n;
    public final Object f9588r;
    public final Object f9589s;
    public final Object v;
    public final Object f9590w;
    public final Object f9591x;

    public u3(di.d dVar, TLObject tLObject, int i10, long j10, org.telegram.ui.ActionBar.e3 e3Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, c6 c6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f9587n = dVar;
        this.d = tLObject;
        this.f9584b = i10;
        this.f9586f = j10;
        this.f9588r = e3Var;
        this.f9589s = starrefprogram;
        this.h = j11;
        this.e = z10;
        this.v = context;
        this.f9590w = c6Var;
        this.f9591x = user;
        this.f9585c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fi.u3.run():void");
    }

    public u3(ok okVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.f9587n = okVar;
        this.f9584b = i10;
        this.f9585c = tL_error;
        this.d = tLObject;
        this.f9588r = accountInstance;
        this.e = z10;
        this.f9589s = str;
        this.v = arrayList;
        this.f9586f = j10;
        this.h = j11;
        this.f9590w = arrayList2;
        this.f9591x = arrayList3;
    }
}
