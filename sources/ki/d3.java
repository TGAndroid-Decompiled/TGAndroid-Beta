package ki;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ck;
public final class d3 implements Runnable {
    public final int f18255a = 0;
    public final int f18256b;
    public final TLRPC.TL_error f18257c;
    public final TLObject d;
    public final boolean f18258e;
    public final long f18259f;
    public final long h;
    public final Object f18260n;
    public final Object f18261r;
    public final Object f18262s;
    public final Object f18263w;
    public final Object f18264x;
    public final Object f18265y;

    public d3(hi.d dVar, TLObject tLObject, int i7, long j3, org.telegram.ui.ActionBar.u2 u2Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, e6 e6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f18260n = dVar;
        this.d = tLObject;
        this.f18256b = i7;
        this.f18259f = j3;
        this.f18261r = u2Var;
        this.f18262s = starrefprogram;
        this.h = j10;
        this.f18258e = z10;
        this.f18263w = context;
        this.f18264x = e6Var;
        this.f18265y = user;
        this.f18257c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.d3.run():void");
    }

    public d3(ck ckVar, int i7, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f18260n = ckVar;
        this.f18256b = i7;
        this.f18257c = tL_error;
        this.d = tLObject;
        this.f18261r = cVar;
        this.f18258e = z10;
        this.f18262s = str;
        this.f18263w = arrayList;
        this.f18259f = j3;
        this.h = j10;
        this.f18264x = arrayList2;
        this.f18265y = arrayList3;
    }
}
