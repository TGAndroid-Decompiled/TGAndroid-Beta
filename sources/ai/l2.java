package ai;

import java.io.Serializable;
import org.telegram.ui.n6;
import org.telegram.ui.x6;
public final class l2 implements Runnable {
    public final int f1331a;
    public final long f1332b;
    public final boolean f1333c;
    public final Object d;
    public final Object f1334e;

    public l2(Object obj, long j3, Serializable serializable, boolean z10, int i7) {
        this.f1331a = i7;
        this.d = obj;
        this.f1332b = j3;
        this.f1334e = serializable;
        this.f1333c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.l2.run():void");
    }

    public l2(Object obj, long j3, boolean z10, Object obj2, int i7) {
        this.f1331a = i7;
        this.d = obj;
        this.f1332b = j3;
        this.f1333c = z10;
        this.f1334e = obj2;
    }

    public l2(x6 x6Var, boolean z10, long j3, n6 n6Var) {
        this.f1331a = 2;
        this.d = x6Var;
        this.f1333c = z10;
        this.f1332b = j3;
        this.f1334e = n6Var;
    }
}
