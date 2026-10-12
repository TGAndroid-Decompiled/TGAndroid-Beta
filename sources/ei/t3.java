package ei;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.tk;
public final class t3 implements Runnable {
    public final int f9365a = 0;
    public final int f9366b;
    public final TLRPC.TL_error f9367c;
    public final TLObject d;
    public final boolean f9368e;
    public final long f9369f;
    public final long h;
    public final Object f9370n;
    public final Object f9371r;
    public final Object f9372s;
    public final Object v;
    public final Object f9373w;
    public final Object f9374x;

    public t3(ci.d dVar, TLObject tLObject, int i10, long j3, org.telegram.ui.ActionBar.e3 e3Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, c6 c6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f9370n = dVar;
        this.d = tLObject;
        this.f9366b = i10;
        this.f9369f = j3;
        this.f9371r = e3Var;
        this.f9372s = starrefprogram;
        this.h = j10;
        this.f9368e = z10;
        this.v = context;
        this.f9373w = c6Var;
        this.f9374x = user;
        this.f9367c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.t3.run():void");
    }

    public t3(tk tkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f9370n = tkVar;
        this.f9366b = i10;
        this.f9367c = tL_error;
        this.d = tLObject;
        this.f9371r = accountInstance;
        this.f9368e = z10;
        this.f9372s = str;
        this.v = arrayList;
        this.f9369f = j3;
        this.h = j10;
        this.f9373w = arrayList2;
        this.f9374x = arrayList3;
    }
}
