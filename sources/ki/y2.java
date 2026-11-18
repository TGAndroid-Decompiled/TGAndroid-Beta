package ki;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.jk;
public final class y2 implements Runnable {
    public final int f19063a = 0;
    public final int f19064b;
    public final TLRPC.TL_error f19065c;
    public final TLObject d;
    public final boolean f19066e;
    public final long f19067f;
    public final long h;
    public final Object f19068n;
    public final Object f19069r;
    public final Object f19070s;
    public final Object f19071w;
    public final Object f19072x;
    public final Object f19073y;

    public y2(hi.d dVar, TLObject tLObject, int i7, long j3, org.telegram.ui.ActionBar.x2 x2Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, i6 i6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f19068n = dVar;
        this.d = tLObject;
        this.f19064b = i7;
        this.f19067f = j3;
        this.f19069r = x2Var;
        this.f19070s = starrefprogram;
        this.h = j10;
        this.f19066e = z10;
        this.f19071w = context;
        this.f19072x = i6Var;
        this.f19073y = user;
        this.f19065c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.y2.run():void");
    }

    public y2(jk jkVar, int i7, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f19068n = jkVar;
        this.f19064b = i7;
        this.f19065c = tL_error;
        this.d = tLObject;
        this.f19069r = cVar;
        this.f19066e = z10;
        this.f19070s = str;
        this.f19071w = arrayList;
        this.f19067f = j3;
        this.h = j10;
        this.f19072x = arrayList2;
        this.f19073y = arrayList3;
    }
}
