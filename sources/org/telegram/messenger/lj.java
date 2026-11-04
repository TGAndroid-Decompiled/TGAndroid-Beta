package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f24068a;
    public final hp f24069b;
    public final TLRPC.User f24070c;

    public lj(hp hpVar, TLRPC.User user, int i3) {
        this.f24068a = i3;
        this.f24069b = hpVar;
        this.f24070c = user;
    }

    @Override
    public final void run() {
        switch (this.f24068a) {
            case 0:
                this.f24069b.f23106r1.remove(Long.valueOf(this.f24070c.f27150id));
                return;
            default:
                this.f24069b.getContactsController().a(this.f24070c);
                return;
        }
    }
}
