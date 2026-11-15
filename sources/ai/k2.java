package ai;

import java.io.Serializable;
import org.telegram.ui.o6;
import org.telegram.ui.y6;
public final class k2 implements Runnable {
    public final int f1333a;
    public final long f1334b;
    public final boolean f1335c;
    public final Object d;
    public final Object f1336e;

    public k2(Object obj, long j3, Serializable serializable, boolean z10, int i7) {
        this.f1333a = i7;
        this.d = obj;
        this.f1334b = j3;
        this.f1336e = serializable;
        this.f1335c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.k2.run():void");
    }

    public k2(Object obj, long j3, boolean z10, Object obj2, int i7) {
        this.f1333a = i7;
        this.d = obj;
        this.f1334b = j3;
        this.f1335c = z10;
        this.f1336e = obj2;
    }

    public k2(y6 y6Var, boolean z10, long j3, o6 o6Var) {
        this.f1333a = 2;
        this.d = y6Var;
        this.f1335c = z10;
        this.f1334b = j3;
        this.f1336e = o6Var;
    }
}
