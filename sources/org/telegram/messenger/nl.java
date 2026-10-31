package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class nl implements Runnable {
    public final int f17142a;
    public final vp f17143b;
    public final TLRPC.TL_error f17144c;
    public final long d;

    public nl(vp vpVar, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f17142a = i10;
        this.f17143b = vpVar;
        this.f17144c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f17142a;
        long j10 = this.d;
        TLRPC.TL_error tL_error = this.f17144c;
        vp vpVar = this.f17143b;
        switch (i10) {
            case 0:
                vpVar.F(j10, tL_error.text);
                zs.f(vpVar.currentAccount).k(333, Long.valueOf(j10));
                return;
            default:
                vpVar.getClass();
                vpVar.F(j10, tL_error.text);
                vpVar.f18895s1.remove(Long.valueOf(j10));
                return;
        }
    }
}
