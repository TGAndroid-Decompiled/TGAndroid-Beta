package defpackage;

import org.telegram.tgnet.TLRPC;
public final class tv0 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public tv0(cm1 cm1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        this.a = (byte) 24;
        this.d = cm1Var;
        this.c = tL_premiumGiftOption;
        this.b = str;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv0.run():void");
    }

    public tv0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
