package ei;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.nk;
public final class t3 implements Runnable {
    public final int f8625a = 0;
    public final int f8626b;
    public final TLRPC.TL_error f8627c;
    public final TLObject d;
    public final boolean e;
    public final long f8628f;
    public final long h;
    public final Object f8629n;
    public final Object f8630r;
    public final Object f8631s;
    public final Object v;
    public final Object f8632w;
    public final Object f8633x;

    public t3(ci.d dVar, TLObject tLObject, int i10, long j3, org.telegram.ui.ActionBar.g3 g3Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, f6 f6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f8629n = dVar;
        this.d = tLObject;
        this.f8626b = i10;
        this.f8628f = j3;
        this.f8630r = g3Var;
        this.f8631s = starrefprogram;
        this.h = j10;
        this.e = z10;
        this.v = context;
        this.f8632w = f6Var;
        this.f8633x = user;
        this.f8627c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.t3.run():void");
    }

    public t3(nk nkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f8629n = nkVar;
        this.f8626b = i10;
        this.f8627c = tL_error;
        this.d = tLObject;
        this.f8630r = accountInstance;
        this.e = z10;
        this.f8631s = str;
        this.v = arrayList;
        this.f8628f = j3;
        this.h = j10;
        this.f8632w = arrayList2;
        this.f8633x = arrayList3;
    }
}
