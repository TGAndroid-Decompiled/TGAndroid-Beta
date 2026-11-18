package di;

import android.content.Context;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.y60;
import org.telegram.ui.bn;
public final class i9 implements Runnable {
    public final int f9032a = 0;
    public final int f9033b;
    public final long f9034c;
    public final long d;
    public final Object f9035e;
    public final Object f9036f;
    public final Object h;

    public i9(int i7, Context context, long j3, long j10, org.telegram.ui.ActionBar.x2[] x2VarArr, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f9033b = i7;
        this.f9035e = context;
        this.f9034c = j3;
        this.d = j10;
        this.f9036f = x2VarArr;
        this.h = i6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.i9.run():void");
    }

    public i9(fi.t0 t0Var, int i7, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f9035e = t0Var;
        this.f9033b = i7;
        this.f9036f = tL_error;
        this.f9034c = j3;
        this.d = j10;
        this.h = tL_textWithEntities;
    }

    public i9(ri riVar, long j3, long j10, TL_bots.BotInfo botInfo, x10 x10Var, int i7) {
        this.f9035e = riVar;
        this.f9034c = j3;
        this.d = j10;
        this.f9036f = botInfo;
        this.h = x10Var;
        this.f9033b = i7;
    }

    public i9(mp mpVar, long j3, long j10, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        this.f9035e = mpVar;
        this.f9034c = j3;
        this.d = j10;
        this.f9036f = inputPeer;
        this.f9033b = i7;
        this.h = iArr;
    }

    public i9(tr trVar, int i7, long j3, String str, long j10, String str2) {
        this.f9035e = trVar;
        this.f9033b = i7;
        this.f9034c = j3;
        this.f9036f = str;
        this.d = j10;
        this.h = str2;
    }

    public i9(tr trVar, long j3, String str, long j10, int i7, bi.x4 x4Var) {
        this.f9035e = trVar;
        this.f9034c = j3;
        this.f9036f = str;
        this.d = j10;
        this.f9033b = i7;
        this.h = x4Var;
    }

    public i9(y60 y60Var, int i7, long j3, long j10, bn bnVar, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f9035e = y60Var;
        this.f9033b = i7;
        this.f9034c = j3;
        this.d = j10;
        this.f9036f = bnVar;
        this.h = i6Var;
    }
}
