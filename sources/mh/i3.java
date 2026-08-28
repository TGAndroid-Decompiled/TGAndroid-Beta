package mh;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.ek;
public final class i3 implements Runnable {
    public final int f17901a = 0;
    public final int f17902b;
    public final TLRPC.TL_error f17903c;
    public final TLObject d;
    public final boolean f17904e;
    public final long f17905f;
    public final long h;
    public final Object f17906n;
    public final Object f17907r;
    public final Object f17908s;
    public final Object v;
    public final Object f17909w;
    public final Object f17910x;

    public i3(kh.d dVar, TLObject tLObject, int i9, long j10, org.telegram.ui.ActionBar.f3 f3Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, b6 b6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f17906n = dVar;
        this.d = tLObject;
        this.f17902b = i9;
        this.f17905f = j10;
        this.f17907r = f3Var;
        this.f17908s = starrefprogram;
        this.h = j11;
        this.f17904e = z10;
        this.v = context;
        this.f17909w = b6Var;
        this.f17910x = user;
        this.f17903c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mh.i3.run():void");
    }

    public i3(ek ekVar, int i9, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.f17906n = ekVar;
        this.f17902b = i9;
        this.f17903c = tL_error;
        this.d = tLObject;
        this.f17907r = accountInstance;
        this.f17904e = z10;
        this.f17908s = str;
        this.v = arrayList;
        this.f17905f = j10;
        this.h = j11;
        this.f17909w = arrayList2;
        this.f17910x = arrayList3;
    }
}
