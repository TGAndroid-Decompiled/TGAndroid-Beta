package ai;

import java.io.Serializable;
import org.telegram.ui.o6;
import org.telegram.ui.y6;
public final class l2 implements Runnable {
    public final int f1341a;
    public final long f1342b;
    public final boolean f1343c;
    public final Object d;
    public final Object f1344e;

    public l2(Object obj, long j3, Serializable serializable, boolean z10, int i7) {
        this.f1341a = i7;
        this.d = obj;
        this.f1342b = j3;
        this.f1344e = serializable;
        this.f1343c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.l2.run():void");
    }

    public l2(Object obj, long j3, boolean z10, Object obj2, int i7) {
        this.f1341a = i7;
        this.d = obj;
        this.f1342b = j3;
        this.f1343c = z10;
        this.f1344e = obj2;
    }

    public l2(y6 y6Var, boolean z10, long j3, o6 o6Var) {
        this.f1341a = 2;
        this.d = y6Var;
        this.f1343c = z10;
        this.f1342b = j3;
        this.f1344e = o6Var;
    }
}
