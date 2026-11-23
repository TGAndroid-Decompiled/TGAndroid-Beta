package ki;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.lk;
public final class x2 implements Runnable {
    public final int f19076a = 0;
    public final int f19077b;
    public final TLRPC.TL_error f19078c;
    public final TLObject d;
    public final boolean f19079e;
    public final long f19080f;
    public final long h;
    public final Object f19081n;
    public final Object f19082r;
    public final Object f19083s;
    public final Object f19084w;
    public final Object f19085x;
    public final Object f19086y;

    public x2(hi.e eVar, TLObject tLObject, int i7, long j3, org.telegram.ui.ActionBar.w2 w2Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, h6 h6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f19081n = eVar;
        this.d = tLObject;
        this.f19077b = i7;
        this.f19080f = j3;
        this.f19082r = w2Var;
        this.f19083s = starrefprogram;
        this.h = j10;
        this.f19079e = z10;
        this.f19084w = context;
        this.f19085x = h6Var;
        this.f19086y = user;
        this.f19078c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.x2.run():void");
    }

    public x2(lk lkVar, int i7, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f19081n = lkVar;
        this.f19077b = i7;
        this.f19078c = tL_error;
        this.d = tLObject;
        this.f19082r = cVar;
        this.f19079e = z10;
        this.f19083s = str;
        this.f19084w = arrayList;
        this.f19080f = j3;
        this.h = j10;
        this.f19085x = arrayList2;
        this.f19086y = arrayList3;
    }
}
