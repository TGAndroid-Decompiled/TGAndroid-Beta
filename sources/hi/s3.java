package hi;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.mk;
public final class s3 implements Runnable {
    public final int f13267a = 0;
    public final int f13268b;
    public final TLRPC.TL_error f13269c;
    public final TLObject d;
    public final boolean e;
    public final long f13270f;
    public final long h;
    public final Object f13271n;
    public final Object f13272r;
    public final Object f13273s;
    public final Object v;
    public final Object f13274w;
    public final Object f13275x;

    public s3(fi.d dVar, TLObject tLObject, int i10, long j10, org.telegram.ui.ActionBar.k3 k3Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, u6 u6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f13271n = dVar;
        this.d = tLObject;
        this.f13268b = i10;
        this.f13270f = j10;
        this.f13272r = k3Var;
        this.f13273s = starrefprogram;
        this.h = j11;
        this.e = z10;
        this.v = context;
        this.f13274w = u6Var;
        this.f13275x = user;
        this.f13269c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.s3.run():void");
    }

    public s3(mk mkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.f13271n = mkVar;
        this.f13268b = i10;
        this.f13269c = tL_error;
        this.d = tLObject;
        this.f13272r = accountInstance;
        this.e = z10;
        this.f13273s = str;
        this.v = arrayList;
        this.f13270f = j10;
        this.h = j11;
        this.f13274w = arrayList2;
        this.f13275x = arrayList3;
    }
}
