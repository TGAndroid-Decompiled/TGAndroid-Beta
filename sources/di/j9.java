package di;

import android.content.Context;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.a70;
import org.telegram.ui.bn;
public final class j9 implements Runnable {
    public final int f9123a = 0;
    public final int f9124b;
    public final long f9125c;
    public final long d;
    public final Object f9126e;
    public final Object f9127f;
    public final Object h;

    public j9(int i7, Context context, long j3, long j10, org.telegram.ui.ActionBar.w2[] w2VarArr, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f9124b = i7;
        this.f9126e = context;
        this.f9125c = j3;
        this.d = j10;
        this.f9127f = w2VarArr;
        this.h = h6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.j9.run():void");
    }

    public j9(fi.t0 t0Var, int i7, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f9126e = t0Var;
        this.f9124b = i7;
        this.f9127f = tL_error;
        this.f9125c = j3;
        this.d = j10;
        this.h = tL_textWithEntities;
    }

    public j9(si siVar, long j3, long j10, TL_bots.BotInfo botInfo, y10 y10Var, int i7) {
        this.f9126e = siVar;
        this.f9125c = j3;
        this.d = j10;
        this.f9127f = botInfo;
        this.h = y10Var;
        this.f9124b = i7;
    }

    public j9(np npVar, long j3, long j10, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        this.f9126e = npVar;
        this.f9125c = j3;
        this.d = j10;
        this.f9127f = inputPeer;
        this.f9124b = i7;
        this.h = iArr;
    }

    public j9(ur urVar, int i7, long j3, String str, long j10, String str2) {
        this.f9126e = urVar;
        this.f9124b = i7;
        this.f9125c = j3;
        this.f9127f = str;
        this.d = j10;
        this.h = str2;
    }

    public j9(ur urVar, long j3, String str, long j10, int i7, bi.a5 a5Var) {
        this.f9126e = urVar;
        this.f9125c = j3;
        this.f9127f = str;
        this.d = j10;
        this.f9124b = i7;
        this.h = a5Var;
    }

    public j9(a70 a70Var, int i7, long j3, long j10, bn bnVar, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f9126e = a70Var;
        this.f9124b = i7;
        this.f9125c = j3;
        this.d = j10;
        this.f9127f = bnVar;
        this.h = h6Var;
    }
}
