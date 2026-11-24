package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ex7 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public ex7(h1a h1aVar, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.a = (byte) 20;
        this.c = h1aVar;
        this.d = tLObject;
        this.e = tL_inputStorePaymentGiftPremium;
        this.b = tL_error;
        this.f = tL_payments_canPurchaseStore;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex7.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex7.run():void");
    }

    public ex7(y28 y28Var, a5b a5bVar, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, w5b w5bVar) {
        this.a = (byte) 4;
        this.c = y28Var;
        this.d = a5bVar;
        this.b = tL_error;
        this.e = storyItem;
        this.f = w5bVar;
    }

    public ex7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public ex7(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.c = obj;
        this.d = tLObject;
        this.e = obj2;
        this.f = obj3;
        this.b = tL_error;
    }
}
