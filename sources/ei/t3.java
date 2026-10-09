package ei;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.rk;
public final class t3 implements Runnable {
    public final int f9368a = 0;
    public final int f9369b;
    public final TLRPC.TL_error f9370c;
    public final TLObject d;
    public final boolean f9371e;
    public final long f9372f;
    public final long h;
    public final Object f9373n;
    public final Object f9374r;
    public final Object f9375s;
    public final Object v;
    public final Object f9376w;
    public final Object f9377x;

    public t3(ci.d dVar, TLObject tLObject, int i10, long j3, org.telegram.ui.ActionBar.f3 f3Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, e6 e6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f9373n = dVar;
        this.d = tLObject;
        this.f9369b = i10;
        this.f9372f = j3;
        this.f9374r = f3Var;
        this.f9375s = starrefprogram;
        this.h = j10;
        this.f9371e = z10;
        this.v = context;
        this.f9376w = e6Var;
        this.f9377x = user;
        this.f9370c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.t3.run():void");
    }

    public t3(rk rkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f9373n = rkVar;
        this.f9369b = i10;
        this.f9370c = tL_error;
        this.d = tLObject;
        this.f9374r = accountInstance;
        this.f9371e = z10;
        this.f9375s = str;
        this.v = arrayList;
        this.f9372f = j3;
        this.h = j10;
        this.f9376w = arrayList2;
        this.f9377x = arrayList3;
    }
}
