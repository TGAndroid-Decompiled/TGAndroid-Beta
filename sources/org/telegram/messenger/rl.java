package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f26662a;
    public final mp f26663b;
    public final TLRPC.TL_error f26664c;
    public final long d;

    public rl(mp mpVar, TLRPC.TL_error tL_error, long j3, int i7) {
        this.f26662a = i7;
        this.f26663b = mpVar;
        this.f26664c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26662a;
        long j3 = this.d;
        TLRPC.TL_error tL_error = this.f26664c;
        mp mpVar = this.f26663b;
        switch (i7) {
            case 0:
                mpVar.F(j3, tL_error.text);
                ks.f(mpVar.currentAccount).k(335, Long.valueOf(j3));
                return;
            default:
                mpVar.getClass();
                mpVar.F(j3, tL_error.text);
                mpVar.f25783v1.remove(Long.valueOf(j3));
                return;
        }
    }
}
