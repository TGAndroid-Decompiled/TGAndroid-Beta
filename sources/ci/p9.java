package ci;

import android.content.Context;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f60;
import org.telegram.ui.wm;
public final class p9 implements Runnable {
    public final int f5769a = 0;
    public final int f5770b;
    public final long f5771c;
    public final long d;
    public final Object f5772e;
    public final Object f5773f;
    public final Object h;

    public p9(int i3, Context context, long j10, long j11, org.telegram.ui.ActionBar.t2[] t2VarArr, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f5770b = i3;
        this.f5772e = context;
        this.f5771c = j10;
        this.d = j11;
        this.f5773f = t2VarArr;
        this.h = e6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.p9.run():void");
    }

    public p9(ei.w0 w0Var, int i3, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f5772e = w0Var;
        this.f5770b = i3;
        this.f5773f = tL_error;
        this.f5771c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public p9(hp hpVar, long j10, long j11, TLRPC.InputPeer inputPeer, int i3, int[] iArr) {
        this.f5772e = hpVar;
        this.f5771c = j10;
        this.d = j11;
        this.f5773f = inputPeer;
        this.f5770b = i3;
        this.h = iArr;
    }

    public p9(qr qrVar, int i3, long j10, String str, long j11, String str2) {
        this.f5772e = qrVar;
        this.f5770b = i3;
        this.f5771c = j10;
        this.f5773f = str;
        this.d = j11;
        this.h = str2;
    }

    public p9(f60 f60Var, int i3, long j10, long j11, wm wmVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f5772e = f60Var;
        this.f5770b = i3;
        this.f5771c = j10;
        this.d = j11;
        this.f5773f = wmVar;
        this.h = e6Var;
    }
}
