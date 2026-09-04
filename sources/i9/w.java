package i9;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
public interface w extends Future {
    void a(Runnable runnable, Executor executor);
}
