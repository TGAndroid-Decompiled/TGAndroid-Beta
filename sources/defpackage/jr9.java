package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class jr9 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public jr9(wua wuaVar, Runnable runnable, l01 l01Var, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.a = (byte) 24;
        this.d = runnable;
        this.b = l01Var;
        this.c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr9.run():void");
    }

    public jr9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public jr9(Runnable runnable, TLRPC.Document document, CharSequence charSequence) {
        this.a = (byte) 25;
        this.d = runnable;
        this.b = document;
        this.c = charSequence;
    }
}
