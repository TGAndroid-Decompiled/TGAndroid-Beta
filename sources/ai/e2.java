package ai;

import java.io.Serializable;
import org.telegram.ui.n6;
import org.telegram.ui.x6;
public final class e2 implements Runnable {
    public final int f1181a;
    public final long f1182b;
    public final boolean f1183c;
    public final Object d;
    public final Object f1184e;

    public e2(Object obj, long j3, Serializable serializable, boolean z10, int i7) {
        this.f1181a = i7;
        this.d = obj;
        this.f1182b = j3;
        this.f1184e = serializable;
        this.f1183c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.e2.run():void");
    }

    public e2(Object obj, long j3, boolean z10, Object obj2, int i7) {
        this.f1181a = i7;
        this.d = obj;
        this.f1182b = j3;
        this.f1183c = z10;
        this.f1184e = obj2;
    }

    public e2(x6 x6Var, boolean z10, long j3, n6 n6Var) {
        this.f1181a = 2;
        this.d = x6Var;
        this.f1183c = z10;
        this.f1182b = j3;
        this.f1184e = n6Var;
    }
}
