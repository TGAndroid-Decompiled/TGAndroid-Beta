package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qm implements Runnable {
    public final int f24912a;
    public final so f24913b;
    public final TLRPC.TL_error f24914c;

    public qm(so soVar, TLRPC.TL_error tL_error, int i3) {
        this.f24912a = i3;
        this.f24913b = soVar;
        this.f24914c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24912a) {
            case 0:
                this.f24913b.a(this.f24914c);
                return;
            default:
                this.f24913b.a(this.f24914c);
                return;
        }
    }
}
