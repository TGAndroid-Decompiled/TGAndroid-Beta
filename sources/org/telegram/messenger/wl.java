package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wl implements Runnable {
    public final int f27360a;
    public final np f27361b;
    public final TLRPC.TL_error f27362c;
    public final long d;

    public wl(np npVar, TLRPC.TL_error tL_error, long j3, int i7) {
        this.f27360a = i7;
        this.f27361b = npVar;
        this.f27362c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f27360a;
        long j3 = this.d;
        TLRPC.TL_error tL_error = this.f27362c;
        np npVar = this.f27361b;
        switch (i7) {
            case 0:
                npVar.F(j3, tL_error.text);
                ns.f(npVar.currentAccount).k(333, Long.valueOf(j3));
                return;
            default:
                npVar.getClass();
                npVar.F(j3, tL_error.text);
                npVar.f25395t1.remove(Long.valueOf(j3));
                return;
        }
    }
}
