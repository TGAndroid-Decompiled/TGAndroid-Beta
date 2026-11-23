package ki;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.lk;
public final class x2 implements Runnable {
    public final int f19042a = 0;
    public final int f19043b;
    public final TLRPC.TL_error f19044c;
    public final TLObject d;
    public final boolean f19045e;
    public final long f19046f;
    public final long h;
    public final Object f19047n;
    public final Object f19048r;
    public final Object f19049s;
    public final Object f19050w;
    public final Object f19051x;
    public final Object f19052y;

    public x2(hi.d dVar, TLObject tLObject, int i7, long j3, org.telegram.ui.ActionBar.w2 w2Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, h6 h6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f19047n = dVar;
        this.d = tLObject;
        this.f19043b = i7;
        this.f19046f = j3;
        this.f19048r = w2Var;
        this.f19049s = starrefprogram;
        this.h = j10;
        this.f19045e = z10;
        this.f19050w = context;
        this.f19051x = h6Var;
        this.f19052y = user;
        this.f19044c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.x2.run():void");
    }

    public x2(lk lkVar, int i7, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f19047n = lkVar;
        this.f19043b = i7;
        this.f19044c = tL_error;
        this.d = tLObject;
        this.f19048r = cVar;
        this.f19045e = z10;
        this.f19049s = str;
        this.f19050w = arrayList;
        this.f19046f = j3;
        this.h = j10;
        this.f19051x = arrayList2;
        this.f19052y = arrayList3;
    }
}
