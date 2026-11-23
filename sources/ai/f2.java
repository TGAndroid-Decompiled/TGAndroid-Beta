package ai;

import java.io.Serializable;
import org.telegram.ui.o6;
import org.telegram.ui.y6;
public final class f2 implements Runnable {
    public final int f1195a;
    public final long f1196b;
    public final boolean f1197c;
    public final Object d;
    public final Object f1198e;

    public f2(Object obj, long j3, Serializable serializable, boolean z10, int i7) {
        this.f1195a = i7;
        this.d = obj;
        this.f1196b = j3;
        this.f1198e = serializable;
        this.f1197c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.f2.run():void");
    }

    public f2(Object obj, long j3, boolean z10, Object obj2, int i7) {
        this.f1195a = i7;
        this.d = obj;
        this.f1196b = j3;
        this.f1197c = z10;
        this.f1198e = obj2;
    }

    public f2(y6 y6Var, boolean z10, long j3, o6 o6Var) {
        this.f1195a = 2;
        this.d = y6Var;
        this.f1197c = z10;
        this.f1196b = j3;
        this.f1198e = o6Var;
    }
}
