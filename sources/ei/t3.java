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
    public final int f8620a = 0;
    public final int f8621b;
    public final TLRPC.TL_error f8622c;
    public final TLObject d;
    public final boolean e;
    public final long f8623f;
    public final long h;
    public final Object f8624n;
    public final Object f8625r;
    public final Object f8626s;
    public final Object v;
    public final Object f8627w;
    public final Object f8628x;

    public t3(ci.d dVar, TLObject tLObject, int i10, long j3, org.telegram.ui.ActionBar.f3 f3Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, e6 e6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f8624n = dVar;
        this.d = tLObject;
        this.f8621b = i10;
        this.f8623f = j3;
        this.f8625r = f3Var;
        this.f8626s = starrefprogram;
        this.h = j10;
        this.e = z10;
        this.v = context;
        this.f8627w = e6Var;
        this.f8628x = user;
        this.f8622c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.t3.run():void");
    }

    public t3(nk nkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f8624n = nkVar;
        this.f8621b = i10;
        this.f8622c = tL_error;
        this.d = tLObject;
        this.f8625r = accountInstance;
        this.e = z10;
        this.f8626s = str;
        this.v = arrayList;
        this.f8623f = j3;
        this.h = j10;
        this.f8627w = arrayList2;
        this.f8628x = arrayList3;
    }
}
