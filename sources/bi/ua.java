package bi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLObject;
public final class ua implements Runnable {
    public final int f3734a;
    public final Object f3735b;
    public final long f3736c;
    public final Object d;
    public final Object e;

    public ua(Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f3734a = i10;
        this.d = obj;
        this.f3736c = j3;
        this.e = obj2;
        this.f3735b = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.ua.run():void");
    }

    public ua(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f3734a = i10;
        this.d = obj;
        this.f3735b = obj2;
        this.f3736c = j3;
        this.e = obj3;
    }

    public ua(Object obj, Object obj2, long j3, Object obj3, int i10, boolean z10) {
        this.f3734a = i10;
        this.d = obj;
        this.e = obj2;
        this.f3736c = j3;
        this.f3735b = obj3;
    }

    public ua(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f3734a = i10;
        this.d = obj;
        this.e = obj2;
        this.f3735b = obj3;
        this.f3736c = j3;
    }

    public ua(Object obj, MessagesStorage messagesStorage, Object obj2, long j3, int i10) {
        this.f3734a = i10;
        this.d = obj;
        this.f3735b = messagesStorage;
        this.e = obj2;
        this.f3736c = j3;
    }

    public ua(MessagesStorage messagesStorage, long j3, Object obj, Object obj2, int i10) {
        this.f3734a = i10;
        this.f3735b = messagesStorage;
        this.f3736c = j3;
        this.d = obj;
        this.e = obj2;
    }

    public ua(MessagesStorage messagesStorage, Object obj, long j3, Object obj2, int i10) {
        this.f3734a = i10;
        this.f3735b = messagesStorage;
        this.d = obj;
        this.f3736c = j3;
        this.e = obj2;
    }

    public ua(MessagesStorage messagesStorage, TLObject tLObject, TLObject tLObject2, long j3, int i10) {
        this.f3734a = i10;
        this.f3735b = messagesStorage;
        this.d = tLObject;
        this.e = tLObject2;
        this.f3736c = j3;
    }
}
