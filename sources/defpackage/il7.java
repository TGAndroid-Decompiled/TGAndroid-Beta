package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
public final class il7 {
    public final WeakReference a;
    public final Executor b;
    public final yv2 c;

    public il7(yv2 yv2Var, ka3 ka3Var, Executor executor) {
        this.c = yv2Var;
        this.a = new WeakReference(ka3Var);
        this.b = executor;
    }
}
