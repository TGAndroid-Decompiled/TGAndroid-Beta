package defpackage;

import java.util.concurrent.ThreadPoolExecutor;
public final class ix3 extends rje {
    public final rje a;
    public final ThreadPoolExecutor b;

    public ix3(rje rjeVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = rjeVar;
        this.b = threadPoolExecutor;
    }

    @Override
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override
    public final void b(u8a u8aVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(u8aVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
