package di;

import android.content.Context;
import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m60;
import org.telegram.ui.an;
public final class f9 implements Runnable {
    public final int f8561a = 0;
    public final int f8562b;
    public final long f8563c;
    public final long d;
    public final Object f8564e;
    public final Object f8565f;
    public final Object h;

    public f9(int i7, Context context, long j3, long j10, org.telegram.ui.ActionBar.u2[] u2VarArr, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f8562b = i7;
        this.f8564e = context;
        this.f8563c = j3;
        this.d = j10;
        this.f8565f = u2VarArr;
        this.h = e6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.f9.run():void");
    }

    public f9(fi.u0 u0Var, int i7, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f8564e = u0Var;
        this.f8562b = i7;
        this.f8565f = tL_error;
        this.f8563c = j3;
        this.d = j10;
        this.h = tL_textWithEntities;
    }

    public f9(np npVar, long j3, long j10, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        this.f8564e = npVar;
        this.f8563c = j3;
        this.d = j10;
        this.f8565f = inputPeer;
        this.f8562b = i7;
        this.h = iArr;
    }

    public f9(vr vrVar, int i7, long j3, String str, long j10, String str2) {
        this.f8564e = vrVar;
        this.f8562b = i7;
        this.f8563c = j3;
        this.f8565f = str;
        this.d = j10;
        this.h = str2;
    }

    public f9(m60 m60Var, int i7, long j3, long j10, an anVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f8564e = m60Var;
        this.f8562b = i7;
        this.f8563c = j3;
        this.d = j10;
        this.f8565f = anVar;
        this.h = e6Var;
    }
}
