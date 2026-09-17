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
    public final int f10000a = 0;
    public final int f10001b;
    public final TLRPC.TL_error f10002c;
    public final TLObject d;
    public final boolean f10003e;
    public final long f10004f;
    public final long h;
    public final Object f10005n;
    public final Object f10006r;
    public final Object f10007s;
    public final Object v;
    public final Object f10008w;
    public final Object f10009x;

    public t3(di.d dVar, TLObject tLObject, int i10, long j3, org.telegram.ui.ActionBar.f3 f3Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, f6 f6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f10005n = dVar;
        this.d = tLObject;
        this.f10001b = i10;
        this.f10004f = j3;
        this.f10006r = f3Var;
        this.f10007s = starrefprogram;
        this.h = j10;
        this.f10003e = z10;
        this.v = context;
        this.f10008w = f6Var;
        this.f10009x = user;
        this.f10002c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fi.t3.run():void");
    }

    public t3(nk nkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f10005n = nkVar;
        this.f10001b = i10;
        this.f10002c = tL_error;
        this.d = tLObject;
        this.f10006r = accountInstance;
        this.f10003e = z10;
        this.f10007s = str;
        this.v = arrayList;
        this.f10004f = j3;
        this.h = j10;
        this.f10008w = arrayList2;
        this.f10009x = arrayList3;
    }
}
