package gi;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mk;
public final class j3 implements Runnable {
    public final int f11301a = 0;
    public final int f11302b;
    public final TLRPC.TL_error f11303c;
    public final TLObject d;
    public final boolean e;
    public final long f11304f;
    public final long h;
    public final Object f11305n;
    public final Object f11306r;
    public final Object f11307s;
    public final Object v;
    public final Object f11308w;
    public final Object f11309x;

    public j3(ei.d dVar, TLObject tLObject, int i10, long j10, org.telegram.ui.ActionBar.h3 h3Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, g6 g6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f11305n = dVar;
        this.d = tLObject;
        this.f11302b = i10;
        this.f11304f = j10;
        this.f11306r = h3Var;
        this.f11307s = starrefprogram;
        this.h = j11;
        this.e = z10;
        this.v = context;
        this.f11308w = g6Var;
        this.f11309x = user;
        this.f11303c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gi.j3.run():void");
    }

    public j3(mk mkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.f11305n = mkVar;
        this.f11302b = i10;
        this.f11303c = tL_error;
        this.d = tLObject;
        this.f11306r = accountInstance;
        this.e = z10;
        this.f11307s = str;
        this.v = arrayList;
        this.f11304f = j10;
        this.h = j11;
        this.f11308w = arrayList2;
        this.f11309x = arrayList3;
    }
}
