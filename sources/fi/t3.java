package fi;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.nk;
public final class t3 implements Runnable {
    public final int f9972a = 0;
    public final int f9973b;
    public final TLRPC.TL_error f9974c;
    public final TLObject d;
    public final boolean f9975e;
    public final long f9976f;
    public final long h;
    public final Object f9977n;
    public final Object f9978r;
    public final Object f9979s;
    public final Object v;
    public final Object f9980w;
    public final Object f9981x;

    public t3(di.d dVar, TLObject tLObject, int i10, long j3, org.telegram.ui.ActionBar.f3 f3Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, f6 f6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f9977n = dVar;
        this.d = tLObject;
        this.f9973b = i10;
        this.f9976f = j3;
        this.f9978r = f3Var;
        this.f9979s = starrefprogram;
        this.h = j10;
        this.f9975e = z10;
        this.v = context;
        this.f9980w = f6Var;
        this.f9981x = user;
        this.f9974c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fi.t3.run():void");
    }

    public t3(nk nkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f9977n = nkVar;
        this.f9973b = i10;
        this.f9974c = tL_error;
        this.d = tLObject;
        this.f9978r = accountInstance;
        this.f9975e = z10;
        this.f9979s = str;
        this.v = arrayList;
        this.f9976f = j3;
        this.h = j10;
        this.f9980w = arrayList2;
        this.f9981x = arrayList3;
    }
}
