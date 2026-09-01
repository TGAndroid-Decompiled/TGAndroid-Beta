package d9;

import java.util.concurrent.ExecutorService;
public final class e implements Runnable {
    public final int f4361a;
    public final g f4362b;
    public final Runnable f4363c;
    public final y5.h d;

    public e(g gVar, Runnable runnable, y5.h hVar, int i10) {
        this.f4361a = i10;
        this.f4362b = gVar;
        this.f4363c = runnable;
        this.d = hVar;
    }

    @Override
    public final void run() {
        switch (this.f4361a) {
            case 0:
                ExecutorService executorService = this.f4362b.f4367a;
                final Runnable runnable = this.f4363c;
                final y5.h hVar = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e6) {
                                    ((i) hVar.f50777b).l(e6);
                                    throw e6;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) hVar.f50777b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) hVar.f50777b;
                                try {
                                    runnable2.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    iVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f4362b.f4367a;
                final Runnable runnable2 = this.f4363c;
                final y5.h hVar2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e6) {
                                    ((i) hVar2.f50777b).l(e6);
                                    throw e6;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) hVar2.f50777b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) hVar2.f50777b;
                                try {
                                    runnable22.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    iVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f4362b.f4367a;
                final Runnable runnable3 = this.f4363c;
                final y5.h hVar3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e6) {
                                    ((i) hVar3.f50777b).l(e6);
                                    throw e6;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) hVar3.f50777b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) hVar3.f50777b;
                                try {
                                    runnable22.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    iVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
