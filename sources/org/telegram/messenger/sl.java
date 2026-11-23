package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sl implements Runnable {
    public final int f26874a;
    public final np f26875b;
    public final TLRPC.TL_error f26876c;
    public final long d;

    public sl(np npVar, TLRPC.TL_error tL_error, long j3, int i7) {
        this.f26874a = i7;
        this.f26875b = npVar;
        this.f26876c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26874a;
        long j3 = this.d;
        TLRPC.TL_error tL_error = this.f26876c;
        np npVar = this.f26875b;
        switch (i7) {
            case 0:
                npVar.F(j3, tL_error.text);
                ls.f(npVar.currentAccount).k(336, Long.valueOf(j3));
                return;
            default:
                npVar.getClass();
                npVar.F(j3, tL_error.text);
                npVar.f25980v1.remove(Long.valueOf(j3));
                return;
        }
    }
}
