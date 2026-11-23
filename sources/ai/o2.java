package ai;

import java.io.Serializable;
import org.telegram.ui.n6;
import org.telegram.ui.x6;
public final class o2 implements Runnable {
    public final int f1376a;
    public final long f1377b;
    public final boolean f1378c;
    public final Object d;
    public final Object f1379e;

    public o2(Object obj, long j3, Serializable serializable, boolean z10, int i7) {
        this.f1376a = i7;
        this.d = obj;
        this.f1377b = j3;
        this.f1379e = serializable;
        this.f1378c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.o2.run():void");
    }

    public o2(Object obj, long j3, boolean z10, Object obj2, int i7) {
        this.f1376a = i7;
        this.d = obj;
        this.f1377b = j3;
        this.f1378c = z10;
        this.f1379e = obj2;
    }

    public o2(x6 x6Var, boolean z10, long j3, n6 n6Var) {
        this.f1376a = 2;
        this.d = x6Var;
        this.f1378c = z10;
        this.f1377b = j3;
        this.f1379e = n6Var;
    }
}
