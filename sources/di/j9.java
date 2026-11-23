package di;

import android.content.Context;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.x60;
import org.telegram.ui.bn;
public final class j9 implements Runnable {
    public final int f9084a = 0;
    public final int f9085b;
    public final long f9086c;
    public final long d;
    public final Object f9087e;
    public final Object f9088f;
    public final Object h;

    public j9(int i7, Context context, long j3, long j10, org.telegram.ui.ActionBar.w2[] w2VarArr, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f9085b = i7;
        this.f9087e = context;
        this.f9086c = j3;
        this.d = j10;
        this.f9088f = w2VarArr;
        this.h = i6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.j9.run():void");
    }

    public j9(fi.t0 t0Var, int i7, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f9087e = t0Var;
        this.f9085b = i7;
        this.f9088f = tL_error;
        this.f9086c = j3;
        this.d = j10;
        this.h = tL_textWithEntities;
    }

    public j9(ri riVar, long j3, long j10, TL_bots.BotInfo botInfo, w10 w10Var, int i7) {
        this.f9087e = riVar;
        this.f9086c = j3;
        this.d = j10;
        this.f9088f = botInfo;
        this.h = w10Var;
        this.f9085b = i7;
    }

    public j9(mp mpVar, long j3, long j10, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        this.f9087e = mpVar;
        this.f9086c = j3;
        this.d = j10;
        this.f9088f = inputPeer;
        this.f9085b = i7;
        this.h = iArr;
    }

    public j9(tr trVar, int i7, long j3, String str, long j10, String str2) {
        this.f9087e = trVar;
        this.f9085b = i7;
        this.f9086c = j3;
        this.f9088f = str;
        this.d = j10;
        this.h = str2;
    }

    public j9(tr trVar, long j3, String str, long j10, int i7, bi.d5 d5Var) {
        this.f9087e = trVar;
        this.f9086c = j3;
        this.f9088f = str;
        this.d = j10;
        this.f9085b = i7;
        this.h = d5Var;
    }

    public j9(x60 x60Var, int i7, long j3, long j10, bn bnVar, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f9087e = x60Var;
        this.f9085b = i7;
        this.f9086c = j3;
        this.d = j10;
        this.f9088f = bnVar;
        this.h = i6Var;
    }
}
