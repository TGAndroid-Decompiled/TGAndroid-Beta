package hi;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.uj;
public final class g3 implements Runnable {
    public final int f14674a = 0;
    public final int f14675b;
    public final TLRPC.TL_error f14676c;
    public final TLObject d;
    public final boolean f14677e;
    public final long f14678f;
    public final long h;
    public final Object f14679n;
    public final Object f14680r;
    public final Object f14681s;
    public final Object f14682w;
    public final Object f14683x;
    public final Object f14684y;

    public g3(fi.d dVar, TLObject tLObject, int i7, long j3, org.telegram.ui.ActionBar.v2 v2Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z9, Context context, g6 g6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f14679n = dVar;
        this.d = tLObject;
        this.f14675b = i7;
        this.f14678f = j3;
        this.f14680r = v2Var;
        this.f14681s = starrefprogram;
        this.h = j10;
        this.f14677e = z9;
        this.f14682w = context;
        this.f14683x = g6Var;
        this.f14684y = user;
        this.f14676c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.g3.run():void");
    }

    public g3(uj ujVar, int i7, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z9, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f14679n = ujVar;
        this.f14675b = i7;
        this.f14676c = tL_error;
        this.d = tLObject;
        this.f14680r = cVar;
        this.f14677e = z9;
        this.f14681s = str;
        this.f14682w = arrayList;
        this.f14678f = j3;
        this.h = j10;
        this.f14683x = arrayList2;
        this.f14684y = arrayList3;
    }
}
