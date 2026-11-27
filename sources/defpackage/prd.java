package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
public interface prd extends Future {
    void c(Runnable runnable, Executor executor);
}
