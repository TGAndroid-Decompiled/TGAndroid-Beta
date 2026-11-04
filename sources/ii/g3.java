package ii;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.tj;
public final class g3 implements Runnable {
    public final int f14953a = 0;
    public final int f14954b;
    public final TLRPC.TL_error f14955c;
    public final TLObject d;
    public final boolean f14956e;
    public final long f14957f;
    public final long h;
    public final Object f14958n;
    public final Object f14959r;
    public final Object f14960s;
    public final Object f14961w;
    public final Object f14962x;
    public final Object f14963y;

    public g3(gi.d dVar, TLObject tLObject, int i3, long j10, org.telegram.ui.ActionBar.t2 t2Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, e6 e6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f14958n = dVar;
        this.d = tLObject;
        this.f14954b = i3;
        this.f14957f = j10;
        this.f14959r = t2Var;
        this.f14960s = starrefprogram;
        this.h = j11;
        this.f14956e = z10;
        this.f14961w = context;
        this.f14962x = e6Var;
        this.f14963y = user;
        this.f14955c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.g3.run():void");
    }

    public g3(tj tjVar, int i3, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.f14958n = tjVar;
        this.f14954b = i3;
        this.f14955c = tL_error;
        this.d = tLObject;
        this.f14959r = cVar;
        this.f14956e = z10;
        this.f14960s = str;
        this.f14961w = arrayList;
        this.f14957f = j10;
        this.h = j11;
        this.f14962x = arrayList2;
        this.f14963y = arrayList3;
    }
}
