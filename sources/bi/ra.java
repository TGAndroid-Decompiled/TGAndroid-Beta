package bi;

import android.content.Context;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l60;
import org.telegram.ui.cn;
public final class ra implements Runnable {
    public final int f4636a = 0;
    public final int f4637b;
    public final long f4638c;
    public final long d;
    public final Object f4639e;
    public final Object f4640f;
    public final Object h;

    public ra(int i7, Context context, long j3, long j10, org.telegram.ui.ActionBar.v2[] v2VarArr, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f4637b = i7;
        this.f4639e = context;
        this.f4638c = j3;
        this.d = j10;
        this.f4640f = v2VarArr;
        this.h = g6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.ra.run():void");
    }

    public ra(di.u0 u0Var, int i7, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f4639e = u0Var;
        this.f4637b = i7;
        this.f4640f = tL_error;
        this.f4638c = j3;
        this.d = j10;
        this.h = tL_textWithEntities;
    }

    public ra(qp qpVar, long j3, long j10, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        this.f4639e = qpVar;
        this.f4638c = j3;
        this.d = j10;
        this.f4640f = inputPeer;
        this.f4637b = i7;
        this.h = iArr;
    }

    public ra(yr yrVar, int i7, long j3, String str, long j10, String str2) {
        this.f4639e = yrVar;
        this.f4637b = i7;
        this.f4638c = j3;
        this.f4640f = str;
        this.d = j10;
        this.h = str2;
    }

    public ra(l60 l60Var, int i7, long j3, long j10, cn cnVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f4639e = l60Var;
        this.f4637b = i7;
        this.f4638c = j3;
        this.d = j10;
        this.f4640f = cnVar;
        this.h = g6Var;
    }
}
