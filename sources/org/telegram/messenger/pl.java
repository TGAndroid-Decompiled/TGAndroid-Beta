package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pl implements Runnable {
    public final int f24774a;
    public final hp f24775b;
    public final TLRPC.TL_error f24776c;
    public final long d;

    public pl(hp hpVar, TLRPC.TL_error tL_error, long j10, int i3) {
        this.f24774a = i3;
        this.f24775b = hpVar;
        this.f24776c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i3 = this.f24774a;
        long j10 = this.d;
        TLRPC.TL_error tL_error = this.f24776c;
        hp hpVar = this.f24775b;
        switch (i3) {
            case 0:
                hpVar.F(j10, tL_error.text);
                hs.f(hpVar.currentAccount).k(333, Long.valueOf(j10));
                return;
            default:
                hpVar.getClass();
                hpVar.F(j10, tL_error.text);
                hpVar.f23123t1.remove(Long.valueOf(j10));
                return;
        }
    }
}
