package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rj implements Runnable {
    public final int f26584a;
    public final np f26585b;
    public final TLRPC.User f26586c;

    public rj(np npVar, TLRPC.User user, int i7) {
        this.f26584a = i7;
        this.f26585b = npVar;
        this.f26586c = user;
    }

    @Override
    public final void run() {
        switch (this.f26584a) {
            case 0:
                np npVar = this.f26585b;
                npVar.c3(this.f26586c, npVar.f25935u1, true, null);
                return;
            case 1:
                this.f26585b.f25909r1.remove(Long.valueOf(this.f26586c.f28547id));
                return;
            default:
                this.f26585b.getContactsController().a(this.f26586c);
                return;
        }
    }
}
