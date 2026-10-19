package gi;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.mk;
public final class j3 implements Runnable {
    public final int f11279a = 0;
    public final int f11280b;
    public final TLRPC.TL_error f11281c;
    public final TLObject d;
    public final boolean e;
    public final long f11282f;
    public final long h;
    public final Object f11283n;
    public final Object f11284r;
    public final Object f11285s;
    public final Object v;
    public final Object f11286w;
    public final Object f11287x;

    public j3(ei.d dVar, TLObject tLObject, int i10, long j10, org.telegram.ui.ActionBar.f3 f3Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, d6 d6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f11283n = dVar;
        this.d = tLObject;
        this.f11280b = i10;
        this.f11282f = j10;
        this.f11284r = f3Var;
        this.f11285s = starrefprogram;
        this.h = j11;
        this.e = z10;
        this.v = context;
        this.f11286w = d6Var;
        this.f11287x = user;
        this.f11281c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gi.j3.run():void");
    }

    public j3(mk mkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.f11283n = mkVar;
        this.f11280b = i10;
        this.f11281c = tL_error;
        this.d = tLObject;
        this.f11284r = accountInstance;
        this.e = z10;
        this.f11285s = str;
        this.v = arrayList;
        this.f11282f = j10;
        this.h = j11;
        this.f11286w = arrayList2;
        this.f11287x = arrayList3;
    }
}
