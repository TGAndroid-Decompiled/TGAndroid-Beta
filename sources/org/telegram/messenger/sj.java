package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sj implements Runnable {
    public final int f26518a;
    public final np f26519b;
    public final TLRPC.User f26520c;

    public sj(np npVar, TLRPC.User user, int i7) {
        this.f26518a = i7;
        this.f26519b = npVar;
        this.f26520c = user;
    }

    @Override
    public final void run() {
        switch (this.f26518a) {
            case 0:
                this.f26519b.f25377r1.remove(Long.valueOf(this.f26520c.f28200id));
                return;
            default:
                this.f26519b.getContactsController().a(this.f26520c);
                return;
        }
    }
}
