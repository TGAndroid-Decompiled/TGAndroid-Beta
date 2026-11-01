package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ol implements Runnable {
    public final int f17479a;
    public final wp f17480b;
    public final TLRPC.TL_error f17481c;
    public final long d;

    public ol(wp wpVar, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f17479a = i10;
        this.f17480b = wpVar;
        this.f17481c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f17479a;
        long j10 = this.d;
        TLRPC.TL_error tL_error = this.f17481c;
        wp wpVar = this.f17480b;
        switch (i10) {
            case 0:
                wpVar.F(j10, tL_error.text);
                at.f(wpVar.currentAccount).k(333, Long.valueOf(j10));
                return;
            default:
                wpVar.getClass();
                wpVar.F(j10, tL_error.text);
                wpVar.f19238s1.remove(Long.valueOf(j10));
                return;
        }
    }
}
