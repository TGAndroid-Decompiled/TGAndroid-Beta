package ai;

import java.io.Serializable;
import org.telegram.ui.n6;
import org.telegram.ui.x6;
public final class n2 implements Runnable {
    public final int f1356a;
    public final long f1357b;
    public final boolean f1358c;
    public final Object d;
    public final Object f1359e;

    public n2(Object obj, long j3, Serializable serializable, boolean z10, int i7) {
        this.f1356a = i7;
        this.d = obj;
        this.f1357b = j3;
        this.f1359e = serializable;
        this.f1358c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.n2.run():void");
    }

    public n2(Object obj, long j3, boolean z10, Object obj2, int i7) {
        this.f1356a = i7;
        this.d = obj;
        this.f1357b = j3;
        this.f1358c = z10;
        this.f1359e = obj2;
    }

    public n2(x6 x6Var, boolean z10, long j3, n6 n6Var) {
        this.f1356a = 2;
        this.d = x6Var;
        this.f1358c = z10;
        this.f1357b = j3;
        this.f1359e = n6Var;
    }
}
