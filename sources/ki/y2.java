package ki;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.jk;
public final class y2 implements Runnable {
    public final int f19066a = 0;
    public final int f19067b;
    public final TLRPC.TL_error f19068c;
    public final TLObject d;
    public final boolean f19069e;
    public final long f19070f;
    public final long h;
    public final Object f19071n;
    public final Object f19072r;
    public final Object f19073s;
    public final Object f19074w;
    public final Object f19075x;
    public final Object f19076y;

    public y2(hi.d dVar, TLObject tLObject, int i7, long j3, org.telegram.ui.ActionBar.x2 x2Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, i6 i6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f19071n = dVar;
        this.d = tLObject;
        this.f19067b = i7;
        this.f19070f = j3;
        this.f19072r = x2Var;
        this.f19073s = starrefprogram;
        this.h = j10;
        this.f19069e = z10;
        this.f19074w = context;
        this.f19075x = i6Var;
        this.f19076y = user;
        this.f19068c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.y2.run():void");
    }

    public y2(jk jkVar, int i7, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f19071n = jkVar;
        this.f19067b = i7;
        this.f19068c = tL_error;
        this.d = tLObject;
        this.f19072r = cVar;
        this.f19069e = z10;
        this.f19073s = str;
        this.f19074w = arrayList;
        this.f19070f = j3;
        this.h = j10;
        this.f19075x = arrayList2;
        this.f19076y = arrayList3;
    }
}
