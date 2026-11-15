package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sj implements Runnable {
    public final int f26528a;
    public final np f26529b;
    public final TLRPC.User f26530c;

    public sj(np npVar, TLRPC.User user, int i7) {
        this.f26528a = i7;
        this.f26529b = npVar;
        this.f26530c = user;
    }

    @Override
    public final void run() {
        switch (this.f26528a) {
            case 0:
                this.f26529b.f25380r1.remove(Long.valueOf(this.f26530c.f28200id));
                return;
            default:
                this.f26529b.getContactsController().a(this.f26530c);
                return;
        }
    }
}
