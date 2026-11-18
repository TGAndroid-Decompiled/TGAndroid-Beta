package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qj implements Runnable {
    public final int f26409a;
    public final mp f26410b;
    public final TLRPC.User f26411c;

    public qj(mp mpVar, TLRPC.User user, int i7) {
        this.f26409a = i7;
        this.f26410b = mpVar;
        this.f26411c = user;
    }

    @Override
    public final void run() {
        switch (this.f26409a) {
            case 0:
                mp mpVar = this.f26410b;
                mpVar.c3(this.f26411c, mpVar.f25772u1, true, null);
                return;
            case 1:
                this.f26410b.f25746r1.remove(Long.valueOf(this.f26411c.f28552id));
                return;
            default:
                this.f26410b.getContactsController().a(this.f26411c);
                return;
        }
    }
}
