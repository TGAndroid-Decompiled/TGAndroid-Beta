package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class y36 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public y36(int i, TLRPC.TL_error tL_error, e eVar, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = (byte) 21;
        this.b = i;
        this.c = tL_error;
        this.d = eVar;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y36.run():void");
    }

    public y36(lm7 lm7Var, int i, r47 r47Var, ArrayList arrayList) {
        this.a = (byte) 13;
        this.c = lm7Var;
        this.b = i;
        this.e = r47Var;
        this.d = arrayList;
    }

    public y36(xca xcaVar, tca tcaVar, int i, ArrayList arrayList) {
        this.a = (byte) 28;
        this.c = xcaVar;
        this.e = tcaVar;
        this.b = i;
        this.d = arrayList;
    }

    public y36(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public y36(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public y36(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
