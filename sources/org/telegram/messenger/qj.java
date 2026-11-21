package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qj implements Runnable {
    public final int f26437a;
    public final mp f26438b;
    public final TLRPC.User f26439c;

    public qj(mp mpVar, TLRPC.User user, int i7) {
        this.f26437a = i7;
        this.f26438b = mpVar;
        this.f26439c = user;
    }

    @Override
    public final void run() {
        switch (this.f26437a) {
            case 0:
                mp mpVar = this.f26438b;
                mpVar.c3(this.f26439c, mpVar.f25800u1, true, null);
                return;
            case 1:
                this.f26438b.f25774r1.remove(Long.valueOf(this.f26439c.f28580id));
                return;
            default:
                this.f26438b.getContactsController().a(this.f26439c);
                return;
        }
    }
}
