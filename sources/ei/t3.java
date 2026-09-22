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
    public final int f8622a = 0;
    public final int f8623b;
    public final TLRPC.TL_error f8624c;
    public final TLObject d;
    public final boolean e;
    public final long f8625f;
    public final long h;
    public final Object f8626n;
    public final Object f8627r;
    public final Object f8628s;
    public final Object v;
    public final Object f8629w;
    public final Object f8630x;

    public t3(ci.d dVar, TLObject tLObject, int i10, long j3, org.telegram.ui.ActionBar.f3 f3Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, e6 e6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f8626n = dVar;
        this.d = tLObject;
        this.f8623b = i10;
        this.f8625f = j3;
        this.f8627r = f3Var;
        this.f8628s = starrefprogram;
        this.h = j10;
        this.e = z10;
        this.v = context;
        this.f8629w = e6Var;
        this.f8630x = user;
        this.f8624c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.t3.run():void");
    }

    public t3(nk nkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f8626n = nkVar;
        this.f8623b = i10;
        this.f8624c = tL_error;
        this.d = tLObject;
        this.f8627r = accountInstance;
        this.e = z10;
        this.f8628s = str;
        this.v = arrayList;
        this.f8625f = j3;
        this.h = j10;
        this.f8629w = arrayList2;
        this.f8630x = arrayList3;
    }
}
