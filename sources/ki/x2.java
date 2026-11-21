package ki;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.lk;
public final class x2 implements Runnable {
    public final int f19073a = 0;
    public final int f19074b;
    public final TLRPC.TL_error f19075c;
    public final TLObject d;
    public final boolean f19076e;
    public final long f19077f;
    public final long h;
    public final Object f19078n;
    public final Object f19079r;
    public final Object f19080s;
    public final Object f19081w;
    public final Object f19082x;
    public final Object f19083y;

    public x2(hi.e eVar, TLObject tLObject, int i7, long j3, org.telegram.ui.ActionBar.w2 w2Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, h6 h6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f19078n = eVar;
        this.d = tLObject;
        this.f19074b = i7;
        this.f19077f = j3;
        this.f19079r = w2Var;
        this.f19080s = starrefprogram;
        this.h = j10;
        this.f19076e = z10;
        this.f19081w = context;
        this.f19082x = h6Var;
        this.f19083y = user;
        this.f19075c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.x2.run():void");
    }

    public x2(lk lkVar, int i7, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f19078n = lkVar;
        this.f19074b = i7;
        this.f19075c = tL_error;
        this.d = tLObject;
        this.f19079r = cVar;
        this.f19076e = z10;
        this.f19080s = str;
        this.f19081w = arrayList;
        this.f19077f = j3;
        this.h = j10;
        this.f19082x = arrayList2;
        this.f19083y = arrayList3;
    }
}
