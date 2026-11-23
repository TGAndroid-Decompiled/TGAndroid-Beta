package ki;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.jk;
public final class y2 implements Runnable {
    public final int f19172a = 0;
    public final int f19173b;
    public final TLRPC.TL_error f19174c;
    public final TLObject d;
    public final boolean f19175e;
    public final long f19176f;
    public final long h;
    public final Object f19177n;
    public final Object f19178r;
    public final Object f19179s;
    public final Object f19180w;
    public final Object f19181x;
    public final Object f19182y;

    public y2(hi.e eVar, TLObject tLObject, int i7, long j3, org.telegram.ui.ActionBar.w2 w2Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, i6 i6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f19177n = eVar;
        this.d = tLObject;
        this.f19173b = i7;
        this.f19176f = j3;
        this.f19178r = w2Var;
        this.f19179s = starrefprogram;
        this.h = j10;
        this.f19175e = z10;
        this.f19180w = context;
        this.f19181x = i6Var;
        this.f19182y = user;
        this.f19174c = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ki.y2.run():void");
    }

    public y2(jk jkVar, int i7, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f19177n = jkVar;
        this.f19173b = i7;
        this.f19174c = tL_error;
        this.d = tLObject;
        this.f19178r = cVar;
        this.f19175e = z10;
        this.f19179s = str;
        this.f19180w = arrayList;
        this.f19176f = j3;
        this.h = j10;
        this.f19181x = arrayList2;
        this.f19182y = arrayList3;
    }
}
