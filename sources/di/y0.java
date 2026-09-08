package di;

import org.telegram.messenger.MessagesStorage;
public final class y0 implements Runnable {
    public final int f8473a;
    public final boolean f8474b;
    public final Object f8475c;
    public final Object d;

    public y0(ig.y yVar, MessagesStorage messagesStorage, boolean z10) {
        this.f8473a = 2;
        this.d = yVar;
        this.f8475c = messagesStorage;
        this.f8474b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.y0.run():void");
    }

    public y0(Object obj, Object obj2, boolean z10, int i10) {
        this.f8473a = i10;
        this.f8475c = obj;
        this.d = obj2;
        this.f8474b = z10;
    }

    public y0(Object obj, boolean z10, Object obj2, int i10) {
        this.f8473a = i10;
        this.f8475c = obj;
        this.f8474b = z10;
        this.d = obj2;
    }
}
