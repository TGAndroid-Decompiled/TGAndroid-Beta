package ei;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.ok;
public final class t3 implements Runnable {
    public final int f8608a = 0;
    public final int f8609b;
    public final TLRPC.TL_error f8610c;
    public final TLObject d;
    public final boolean e;
    public final long f8611f;
    public final long h;
    public final Object f8612n;
    public final Object f8613r;
    public final Object f8614s;
    public final Object v;
    public final Object f8615w;
    public final Object f8616x;

    public t3(ci.d dVar, TLObject tLObject, int i10, long j3, org.telegram.ui.ActionBar.f3 f3Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, d6 d6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f8612n = dVar;
        this.d = tLObject;
        this.f8609b = i10;
        this.f8611f = j3;
        this.f8613r = f3Var;
        this.f8614s = starrefprogram;
        this.h = j10;
        this.e = z10;
        this.v = context;
        this.f8615w = d6Var;
        this.f8616x = user;
        this.f8610c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.t3.run():void");
    }

    public t3(ok okVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f8612n = okVar;
        this.f8609b = i10;
        this.f8610c = tL_error;
        this.d = tLObject;
        this.f8613r = accountInstance;
        this.e = z10;
        this.f8614s = str;
        this.v = arrayList;
        this.f8611f = j3;
        this.h = j10;
        this.f8615w = arrayList2;
        this.f8616x = arrayList3;
    }
}
