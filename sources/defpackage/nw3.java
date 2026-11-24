package defpackage;

import java.util.concurrent.ThreadPoolExecutor;
public final class nw3 extends afe {
    public final afe a;
    public final ThreadPoolExecutor b;

    public nw3(afe afeVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = afeVar;
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
    public final void b(wtc wtcVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(wtcVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
