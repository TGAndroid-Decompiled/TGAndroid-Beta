package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
public interface bpd extends Future {
    void c(Runnable runnable, Executor executor);
}
