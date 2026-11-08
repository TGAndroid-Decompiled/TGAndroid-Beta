package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uj implements Runnable {
    public final int f25859a;
    public final qp f25860b;
    public final TLRPC.User f25861c;

    public uj(qp qpVar, TLRPC.User user, int i7) {
        this.f25859a = i7;
        this.f25860b = qpVar;
        this.f25861c = user;
    }

    @Override
    public final void run() {
        switch (this.f25859a) {
            case 0:
                this.f25860b.f24871q1.remove(Long.valueOf(this.f25861c.f27105id));
                return;
            default:
                this.f25860b.getContactsController().a(this.f25861c);
                return;
        }
    }
}
