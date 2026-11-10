package hi;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.tj;
public final class g3 implements Runnable {
    public final int f14676a = 0;
    public final int f14677b;
    public final TLRPC.TL_error f14678c;
    public final TLObject d;
    public final boolean f14679e;
    public final long f14680f;
    public final long h;
    public final Object f14681n;
    public final Object f14682r;
    public final Object f14683s;
    public final Object f14684w;
    public final Object f14685x;
    public final Object f14686y;

    public g3(fi.d dVar, TLObject tLObject, int i7, long j3, org.telegram.ui.ActionBar.w2 w2Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z9, Context context, h6 h6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f14681n = dVar;
        this.d = tLObject;
        this.f14677b = i7;
        this.f14680f = j3;
        this.f14682r = w2Var;
        this.f14683s = starrefprogram;
        this.h = j10;
        this.f14679e = z9;
        this.f14684w = context;
        this.f14685x = h6Var;
        this.f14686y = user;
        this.f14678c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.g3.run():void");
    }

    public g3(tj tjVar, int i7, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z9, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f14681n = tjVar;
        this.f14677b = i7;
        this.f14678c = tL_error;
        this.d = tLObject;
        this.f14682r = cVar;
        this.f14679e = z9;
        this.f14683s = str;
        this.f14684w = arrayList;
        this.f14680f = j3;
        this.h = j10;
        this.f14685x = arrayList2;
        this.f14686y = arrayList3;
    }
}
