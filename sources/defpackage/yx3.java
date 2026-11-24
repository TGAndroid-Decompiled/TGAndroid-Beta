package defpackage;

import java.util.concurrent.ThreadPoolExecutor;
public final class yx3 extends bhe {
    public final bhe a;
    public final ThreadPoolExecutor b;

    public yx3(bhe bheVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = bheVar;
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
    public final void b(e7a e7aVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(e7aVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
