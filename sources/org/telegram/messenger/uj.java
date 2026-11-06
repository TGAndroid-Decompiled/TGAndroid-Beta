package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uj implements Runnable {
    public final int f25856a;
    public final qp f25857b;
    public final TLRPC.User f25858c;

    public uj(qp qpVar, TLRPC.User user, int i7) {
        this.f25856a = i7;
        this.f25857b = qpVar;
        this.f25858c = user;
    }

    @Override
    public final void run() {
        switch (this.f25856a) {
            case 0:
                this.f25857b.f24864q1.remove(Long.valueOf(this.f25858c.f27102id));
                return;
            default:
                this.f25857b.getContactsController().a(this.f25858c);
                return;
        }
    }
}
