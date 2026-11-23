package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qj implements Runnable {
    public final int f26521a;
    public final mp f26522b;
    public final TLRPC.User f26523c;

    public qj(mp mpVar, TLRPC.User user, int i7) {
        this.f26521a = i7;
        this.f26522b = mpVar;
        this.f26523c = user;
    }

    @Override
    public final void run() {
        switch (this.f26521a) {
            case 0:
                mp mpVar = this.f26522b;
                mpVar.c3(this.f26523c, mpVar.f25867u1, true, null);
                return;
            case 1:
                this.f26522b.f25841r1.remove(Long.valueOf(this.f26523c.f28641id));
                return;
            default:
                this.f26522b.getContactsController().a(this.f26523c);
                return;
        }
    }
}
