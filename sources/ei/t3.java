package ei;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.nk;
public final class t3 implements Runnable {
    public final int f8624a = 0;
    public final int f8625b;
    public final TLRPC.TL_error f8626c;
    public final TLObject d;
    public final boolean e;
    public final long f8627f;
    public final long h;
    public final Object f8628n;
    public final Object f8629r;
    public final Object f8630s;
    public final Object v;
    public final Object f8631w;
    public final Object f8632x;

    public t3(ci.d dVar, TLObject tLObject, int i10, long j3, org.telegram.ui.ActionBar.f3 f3Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, e6 e6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f8628n = dVar;
        this.d = tLObject;
        this.f8625b = i10;
        this.f8627f = j3;
        this.f8629r = f3Var;
        this.f8630s = starrefprogram;
        this.h = j10;
        this.e = z10;
        this.v = context;
        this.f8631w = e6Var;
        this.f8632x = user;
        this.f8626c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.t3.run():void");
    }

    public t3(nk nkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f8628n = nkVar;
        this.f8625b = i10;
        this.f8626c = tL_error;
        this.d = tLObject;
        this.f8629r = accountInstance;
        this.e = z10;
        this.f8630s = str;
        this.v = arrayList;
        this.f8627f = j3;
        this.h = j10;
        this.f8631w = arrayList2;
        this.f8632x = arrayList3;
    }
}
