package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sl implements Runnable {
    public final int f26838a;
    public final np f26839b;
    public final TLRPC.TL_error f26840c;
    public final long d;

    public sl(np npVar, TLRPC.TL_error tL_error, long j3, int i7) {
        this.f26838a = i7;
        this.f26839b = npVar;
        this.f26840c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26838a;
        long j3 = this.d;
        TLRPC.TL_error tL_error = this.f26840c;
        np npVar = this.f26839b;
        switch (i7) {
            case 0:
                npVar.F(j3, tL_error.text);
                ls.f(npVar.currentAccount).k(336, Long.valueOf(j3));
                return;
            default:
                npVar.getClass();
                npVar.F(j3, tL_error.text);
                npVar.f25944v1.remove(Long.valueOf(j3));
                return;
        }
    }
}
