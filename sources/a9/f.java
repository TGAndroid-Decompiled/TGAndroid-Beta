package a9;

import java.util.concurrent.ExecutorService;

public final class f implements Runnable {

    public final int f172a;

    public final h f173b;

    public final Runnable f174c;
    public final i d;

    public f(h hVar, Runnable runnable, i iVar, int i10) {
        this.f172a = i10;
        this.f173b = hVar;
        this.f174c = runnable;
        this.d = iVar;
    }

    @Override
    public final void run() {
        switch (this.f172a) {
            case 0:
                ExecutorService executorService = this.f173b.f178a;
                final int i10 = 0;
                final Runnable runnable = this.f174c;
                final i iVar = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e9) {
                                    ((k) iVar.f181b).l(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((k) iVar.f181b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                k kVar = (k) iVar.f181b;
                                try {
                                    runnable2.run();
                                    kVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    kVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f173b.f178a;
                final int i11 = 2;
                final Runnable runnable2 = this.f174c;
                final i iVar2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e9) {
                                    ((k) iVar2.f181b).l(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((k) iVar2.f181b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                k kVar = (k) iVar2.f181b;
                                try {
                                    runnable3.run();
                                    kVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    kVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f173b.f178a;
                final int i12 = 1;
                final Runnable runnable3 = this.f174c;
                final i iVar3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() throws Exception {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e9) {
                                    ((k) iVar3.f181b).l(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((k) iVar3.f181b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                k kVar = (k) iVar3.f181b;
                                try {
                                    runnable4.run();
                                    kVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    kVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
