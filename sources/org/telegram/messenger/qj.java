package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qj implements Runnable {
    public final int f26411a;
    public final mp f26412b;
    public final TLRPC.User f26413c;

    public qj(mp mpVar, TLRPC.User user, int i7) {
        this.f26411a = i7;
        this.f26412b = mpVar;
        this.f26413c = user;
    }

    @Override
    public final void run() {
        switch (this.f26411a) {
            case 0:
                mp mpVar = this.f26412b;
                mpVar.c3(this.f26413c, mpVar.f25774u1, true, null);
                return;
            case 1:
                this.f26412b.f25748r1.remove(Long.valueOf(this.f26413c.f28554id));
                return;
            default:
                this.f26412b.getContactsController().a(this.f26413c);
                return;
        }
    }
}
