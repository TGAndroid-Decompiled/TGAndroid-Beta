package ei;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.qk;
public final class u3 implements Runnable {
    public final int f9366a = 0;
    public final int f9367b;
    public final TLRPC.TL_error f9368c;
    public final TLObject d;
    public final boolean f9369e;
    public final long f9370f;
    public final long h;
    public final Object f9371n;
    public final Object f9372r;
    public final Object f9373s;
    public final Object v;
    public final Object f9374w;
    public final Object f9375x;

    public u3(ci.d dVar, TLObject tLObject, int i10, long j3, org.telegram.ui.ActionBar.f3 f3Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, d6 d6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f9371n = dVar;
        this.d = tLObject;
        this.f9367b = i10;
        this.f9370f = j3;
        this.f9372r = f3Var;
        this.f9373s = starrefprogram;
        this.h = j10;
        this.f9369e = z10;
        this.v = context;
        this.f9374w = d6Var;
        this.f9375x = user;
        this.f9368c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.u3.run():void");
    }

    public u3(qk qkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f9371n = qkVar;
        this.f9367b = i10;
        this.f9368c = tL_error;
        this.d = tLObject;
        this.f9372r = accountInstance;
        this.f9369e = z10;
        this.f9373s = str;
        this.v = arrayList;
        this.f9370f = j3;
        this.h = j10;
        this.f9374w = arrayList2;
        this.f9375x = arrayList3;
    }
}
