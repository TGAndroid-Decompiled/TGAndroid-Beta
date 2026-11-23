package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rj implements Runnable {
    public final int f26620a;
    public final np f26621b;
    public final TLRPC.User f26622c;

    public rj(np npVar, TLRPC.User user, int i7) {
        this.f26620a = i7;
        this.f26621b = npVar;
        this.f26622c = user;
    }

    @Override
    public final void run() {
        switch (this.f26620a) {
            case 0:
                np npVar = this.f26621b;
                npVar.c3(this.f26622c, npVar.f25971u1, true, null);
                return;
            case 1:
                this.f26621b.f25945r1.remove(Long.valueOf(this.f26622c.f28583id));
                return;
            default:
                this.f26621b.getContactsController().a(this.f26622c);
                return;
        }
    }
}
