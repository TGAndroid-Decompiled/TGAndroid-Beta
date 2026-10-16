package di;

import org.telegram.messenger.MessagesStorage;
public final class x0 implements Runnable {
    public final int f8080a;
    public final boolean f8081b;
    public final Object f8082c;
    public final Object d;

    public x0(ig.y yVar, MessagesStorage messagesStorage, boolean z10) {
        this.f8080a = 2;
        this.d = yVar;
        this.f8082c = messagesStorage;
        this.f8081b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.x0.run():void");
    }

    public x0(Object obj, Object obj2, boolean z10, int i10) {
        this.f8080a = i10;
        this.f8082c = obj;
        this.d = obj2;
        this.f8081b = z10;
    }

    public x0(Object obj, boolean z10, Object obj2, int i10) {
        this.f8080a = i10;
        this.f8082c = obj;
        this.f8081b = z10;
        this.d = obj2;
    }
}
