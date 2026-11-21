package di;

import android.content.Context;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.a70;
import org.telegram.ui.bn;
public final class j9 implements Runnable {
    public final int f9120a = 0;
    public final int f9121b;
    public final long f9122c;
    public final long d;
    public final Object f9123e;
    public final Object f9124f;
    public final Object h;

    public j9(int i7, Context context, long j3, long j10, org.telegram.ui.ActionBar.w2[] w2VarArr, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f9121b = i7;
        this.f9123e = context;
        this.f9122c = j3;
        this.d = j10;
        this.f9124f = w2VarArr;
        this.h = h6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.j9.run():void");
    }

    public j9(fi.t0 t0Var, int i7, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f9123e = t0Var;
        this.f9121b = i7;
        this.f9124f = tL_error;
        this.f9122c = j3;
        this.d = j10;
        this.h = tL_textWithEntities;
    }

    public j9(ri riVar, long j3, long j10, TL_bots.BotInfo botInfo, x10 x10Var, int i7) {
        this.f9123e = riVar;
        this.f9122c = j3;
        this.d = j10;
        this.f9124f = botInfo;
        this.h = x10Var;
        this.f9121b = i7;
    }

    public j9(mp mpVar, long j3, long j10, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        this.f9123e = mpVar;
        this.f9122c = j3;
        this.d = j10;
        this.f9124f = inputPeer;
        this.f9121b = i7;
        this.h = iArr;
    }

    public j9(tr trVar, int i7, long j3, String str, long j10, String str2) {
        this.f9123e = trVar;
        this.f9121b = i7;
        this.f9122c = j3;
        this.f9124f = str;
        this.d = j10;
        this.h = str2;
    }

    public j9(tr trVar, long j3, String str, long j10, int i7, bi.b5 b5Var) {
        this.f9123e = trVar;
        this.f9122c = j3;
        this.f9124f = str;
        this.d = j10;
        this.f9121b = i7;
        this.h = b5Var;
    }

    public j9(a70 a70Var, int i7, long j3, long j10, bn bnVar, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f9123e = a70Var;
        this.f9121b = i7;
        this.f9122c = j3;
        this.d = j10;
        this.f9124f = bnVar;
        this.h = h6Var;
    }
}
