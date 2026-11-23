package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f26761a;
    public final mp f26762b;
    public final TLRPC.TL_error f26763c;
    public final long d;

    public rl(mp mpVar, TLRPC.TL_error tL_error, long j3, int i7) {
        this.f26761a = i7;
        this.f26762b = mpVar;
        this.f26763c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26761a;
        long j3 = this.d;
        TLRPC.TL_error tL_error = this.f26763c;
        mp mpVar = this.f26762b;
        switch (i7) {
            case 0:
                mpVar.F(j3, tL_error.text);
                ks.f(mpVar.currentAccount).k(336, Long.valueOf(j3));
                return;
            default:
                mpVar.getClass();
                mpVar.F(j3, tL_error.text);
                mpVar.f25876v1.remove(Long.valueOf(j3));
                return;
        }
    }
}
