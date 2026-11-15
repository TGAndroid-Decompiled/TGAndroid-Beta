package di;

import android.content.Context;
import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m60;
import org.telegram.ui.an;
public final class g9 implements Runnable {
    public final int f8617a = 0;
    public final int f8618b;
    public final long f8619c;
    public final long d;
    public final Object f8620e;
    public final Object f8621f;
    public final Object h;

    public g9(int i7, Context context, long j3, long j10, org.telegram.ui.ActionBar.u2[] u2VarArr, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f8618b = i7;
        this.f8620e = context;
        this.f8619c = j3;
        this.d = j10;
        this.f8621f = u2VarArr;
        this.h = e6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.g9.run():void");
    }

    public g9(fi.u0 u0Var, int i7, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f8620e = u0Var;
        this.f8618b = i7;
        this.f8621f = tL_error;
        this.f8619c = j3;
        this.d = j10;
        this.h = tL_textWithEntities;
    }

    public g9(np npVar, long j3, long j10, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        this.f8620e = npVar;
        this.f8619c = j3;
        this.d = j10;
        this.f8621f = inputPeer;
        this.f8618b = i7;
        this.h = iArr;
    }

    public g9(vr vrVar, int i7, long j3, String str, long j10, String str2) {
        this.f8620e = vrVar;
        this.f8618b = i7;
        this.f8619c = j3;
        this.f8621f = str;
        this.d = j10;
        this.h = str2;
    }

    public g9(m60 m60Var, int i7, long j3, long j10, an anVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f8620e = m60Var;
        this.f8618b = i7;
        this.f8619c = j3;
        this.d = j10;
        this.f8621f = anVar;
        this.h = e6Var;
    }
}
