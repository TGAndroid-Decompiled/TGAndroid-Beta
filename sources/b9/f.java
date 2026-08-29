package b9;

import java.util.concurrent.ExecutorService;
public final class f implements Runnable {
    public final int f2006a;
    public final h f2007b;
    public final Runnable f2008c;
    public final ha.c d;

    public f(h hVar, Runnable runnable, ha.c cVar, int i10) {
        this.f2006a = i10;
        this.f2007b = hVar;
        this.f2008c = runnable;
        this.d = cVar;
    }

    @Override
    public final void run() {
        switch (this.f2006a) {
            case 0:
                ExecutorService executorService = this.f2007b.f2012a;
                final Runnable runnable = this.f2008c;
                final ha.c cVar = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((j) cVar.f7981b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((j) cVar.f7981b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                j jVar = (j) cVar.f7981b;
                                try {
                                    runnable2.run();
                                    jVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    jVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f2007b.f2012a;
                final Runnable runnable2 = this.f2008c;
                final ha.c cVar2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((j) cVar2.f7981b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((j) cVar2.f7981b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                j jVar = (j) cVar2.f7981b;
                                try {
                                    runnable22.run();
                                    jVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    jVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f2007b.f2012a;
                final Runnable runnable3 = this.f2008c;
                final ha.c cVar3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((j) cVar3.f7981b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((j) cVar3.f7981b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                j jVar = (j) cVar3.f7981b;
                                try {
                                    runnable22.run();
                                    jVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    jVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
