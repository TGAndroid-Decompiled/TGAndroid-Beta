package ai;

import kg.t1;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f1121a;
    public final Object f1122b;
    public final int f1123c;
    public final Object d;
    public final Object f1124e;

    public a1(int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.f1121a = i10;
        this.f1123c = i7;
        this.f1122b = obj;
        this.d = obj2;
        this.f1124e = obj3;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ai.a1.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.a1.run():void");
    }

    public a1(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f1121a = i10;
        this.f1122b = obj;
        this.f1123c = i7;
        this.d = obj2;
        this.f1124e = obj3;
    }

    public a1(Object obj, int i7, Object obj2, String str, int i10) {
        this.f1121a = i10;
        this.f1122b = obj;
        this.f1123c = i7;
        this.f1124e = obj2;
        this.d = str;
    }

    public a1(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f1121a = i10;
        this.f1122b = obj;
        this.d = obj2;
        this.f1123c = i7;
        this.f1124e = obj3;
    }

    public a1(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f1121a = i10;
        this.f1122b = obj;
        this.d = obj2;
        this.f1124e = obj3;
        this.f1123c = i7;
    }

    public a1(t1 t1Var, TLRPC.Message message, String str, int i7) {
        this.f1121a = 9;
        this.f1122b = t1Var;
        this.f1124e = message;
        this.d = str;
        this.f1123c = i7;
    }
}
