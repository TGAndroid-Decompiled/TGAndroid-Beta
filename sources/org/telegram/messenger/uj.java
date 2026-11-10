package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uj implements Runnable {
    public final int f25863a;
    public final qp f25864b;
    public final TLRPC.User f25865c;

    public uj(qp qpVar, TLRPC.User user, int i7) {
        this.f25863a = i7;
        this.f25864b = qpVar;
        this.f25865c = user;
    }

    @Override
    public final void run() {
        switch (this.f25863a) {
            case 0:
                this.f25864b.f24875q1.remove(Long.valueOf(this.f25865c.f27109id));
                return;
            default:
                this.f25864b.getContactsController().a(this.f25865c);
                return;
        }
    }
}
