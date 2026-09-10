package di;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.sk;
public final class w3 implements Runnable {
    public final int f6978a = 0;
    public final int f6979b;
    public final TLRPC.TL_error f6980c;
    public final TLObject d;
    public final boolean e;
    public final long f6981f;
    public final long h;
    public final Object f6982n;
    public final Object f6983r;
    public final Object f6984s;
    public final Object v;
    public final Object f6985w;
    public final Object f6986x;

    public w3(bi.d dVar, TLObject tLObject, int i10, long j3, org.telegram.ui.ActionBar.h3 h3Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, f6 f6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f6982n = dVar;
        this.d = tLObject;
        this.f6979b = i10;
        this.f6981f = j3;
        this.f6983r = h3Var;
        this.f6984s = starrefprogram;
        this.h = j10;
        this.e = z10;
        this.v = context;
        this.f6985w = f6Var;
        this.f6986x = user;
        this.f6980c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.w3.run():void");
    }

    public w3(sk skVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f6982n = skVar;
        this.f6979b = i10;
        this.f6980c = tL_error;
        this.d = tLObject;
        this.f6983r = accountInstance;
        this.e = z10;
        this.f6984s = str;
        this.v = arrayList;
        this.f6981f = j3;
        this.h = j10;
        this.f6985w = arrayList2;
        this.f6986x = arrayList3;
    }
}
