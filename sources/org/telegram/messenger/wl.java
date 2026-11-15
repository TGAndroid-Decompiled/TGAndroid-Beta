package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wl implements Runnable {
    public final int f27359a;
    public final np f27360b;
    public final TLRPC.TL_error f27361c;
    public final long d;

    public wl(np npVar, TLRPC.TL_error tL_error, long j3, int i7) {
        this.f27359a = i7;
        this.f27360b = npVar;
        this.f27361c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f27359a;
        long j3 = this.d;
        TLRPC.TL_error tL_error = this.f27361c;
        np npVar = this.f27360b;
        switch (i7) {
            case 0:
                npVar.F(j3, tL_error.text);
                ns.f(npVar.currentAccount).k(333, Long.valueOf(j3));
                return;
            default:
                npVar.getClass();
                npVar.F(j3, tL_error.text);
                npVar.f25398t1.remove(Long.valueOf(j3));
                return;
        }
    }
}
