package ai;

import jg.c2;
import org.telegram.tgnet.TLRPC;
public final class h1 implements Runnable {
    public final int f1542a;
    public final Object f1543b;
    public final int f1544c;
    public final Object d;
    public final Object e;

    public h1(int i10, Object obj, Object obj2, Object obj3, int i11) {
        this.f1542a = i11;
        this.f1544c = i10;
        this.f1543b = obj;
        this.d = obj2;
        this.e = obj3;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ai.h1.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.h1.run():void");
    }

    public h1(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1542a = i11;
        this.f1543b = obj;
        this.f1544c = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public h1(Object obj, int i10, Object obj2, String str, int i11) {
        this.f1542a = i11;
        this.f1543b = obj;
        this.f1544c = i10;
        this.e = obj2;
        this.d = str;
    }

    public h1(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f1542a = i11;
        this.f1543b = obj;
        this.d = obj2;
        this.f1544c = i10;
        this.e = obj3;
    }

    public h1(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f1542a = i11;
        this.f1543b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1544c = i10;
    }

    public h1(c2 c2Var, TLRPC.Message message, String str, int i10) {
        this.f1542a = 8;
        this.f1543b = c2Var;
        this.e = message;
        this.d = str;
        this.f1544c = i10;
    }
}
