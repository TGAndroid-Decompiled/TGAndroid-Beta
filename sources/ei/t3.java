package ei;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.qk;
public final class t3 implements Runnable {
    public final int f8619a = 0;
    public final int f8620b;
    public final TLRPC.TL_error f8621c;
    public final TLObject d;
    public final boolean e;
    public final long f8622f;
    public final long h;
    public final Object f8623n;
    public final Object f8624r;
    public final Object f8625s;
    public final Object v;
    public final Object f8626w;
    public final Object f8627x;

    public t3(ci.d dVar, TLObject tLObject, int i10, long j3, org.telegram.ui.ActionBar.e3 e3Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, d6 d6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f8623n = dVar;
        this.d = tLObject;
        this.f8620b = i10;
        this.f8622f = j3;
        this.f8624r = e3Var;
        this.f8625s = starrefprogram;
        this.h = j10;
        this.e = z10;
        this.v = context;
        this.f8626w = d6Var;
        this.f8627x = user;
        this.f8621c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.t3.run():void");
    }

    public t3(qk qkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f8623n = qkVar;
        this.f8620b = i10;
        this.f8621c = tL_error;
        this.d = tLObject;
        this.f8624r = accountInstance;
        this.e = z10;
        this.f8625s = str;
        this.v = arrayList;
        this.f8622f = j3;
        this.h = j10;
        this.f8626w = arrayList2;
        this.f8627x = arrayList3;
    }
}
