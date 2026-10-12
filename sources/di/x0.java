package di;

import org.telegram.messenger.MessagesStorage;
public final class x0 implements Runnable {
    public final int f8077a;
    public final boolean f8078b;
    public final Object f8079c;
    public final Object d;

    public x0(ig.y yVar, MessagesStorage messagesStorage, boolean z10) {
        this.f8077a = 2;
        this.d = yVar;
        this.f8079c = messagesStorage;
        this.f8078b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.x0.run():void");
    }

    public x0(Object obj, Object obj2, boolean z10, int i10) {
        this.f8077a = i10;
        this.f8079c = obj;
        this.d = obj2;
        this.f8078b = z10;
    }

    public x0(Object obj, boolean z10, Object obj2, int i10) {
        this.f8077a = i10;
        this.f8079c = obj;
        this.f8078b = z10;
        this.d = obj2;
    }
}
