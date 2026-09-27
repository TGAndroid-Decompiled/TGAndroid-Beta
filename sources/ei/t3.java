package ei;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.pk;
public final class t3 implements Runnable {
    public final int f8610a = 0;
    public final int f8611b;
    public final TLRPC.TL_error f8612c;
    public final TLObject d;
    public final boolean e;
    public final long f8613f;
    public final long h;
    public final Object f8614n;
    public final Object f8615r;
    public final Object f8616s;
    public final Object v;
    public final Object f8617w;
    public final Object f8618x;

    public t3(ci.d dVar, TLObject tLObject, int i10, long j3, org.telegram.ui.ActionBar.g3 g3Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, e6 e6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f8614n = dVar;
        this.d = tLObject;
        this.f8611b = i10;
        this.f8613f = j3;
        this.f8615r = g3Var;
        this.f8616s = starrefprogram;
        this.h = j10;
        this.e = z10;
        this.v = context;
        this.f8617w = e6Var;
        this.f8618x = user;
        this.f8612c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.t3.run():void");
    }

    public t3(pk pkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f8614n = pkVar;
        this.f8611b = i10;
        this.f8612c = tL_error;
        this.d = tLObject;
        this.f8615r = accountInstance;
        this.e = z10;
        this.f8616s = str;
        this.v = arrayList;
        this.f8613f = j3;
        this.h = j10;
        this.f8617w = arrayList2;
        this.f8618x = arrayList3;
    }
}
