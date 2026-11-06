package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uj implements Runnable {
    public final int f25848a;
    public final qp f25849b;
    public final TLRPC.User f25850c;

    public uj(qp qpVar, TLRPC.User user, int i7) {
        this.f25848a = i7;
        this.f25849b = qpVar;
        this.f25850c = user;
    }

    @Override
    public final void run() {
        switch (this.f25848a) {
            case 0:
                this.f25849b.f24856q1.remove(Long.valueOf(this.f25850c.f27101id));
                return;
            default:
                this.f25849b.getContactsController().a(this.f25850c);
                return;
        }
    }
}
