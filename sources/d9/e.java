package d9;

import androidx.biometric.e0;
import java.util.concurrent.ExecutorService;
public final class e implements Runnable {
    public final int f4263a;
    public final g f4264b;
    public final Runnable f4265c;
    public final e0 d;

    public e(g gVar, Runnable runnable, e0 e0Var, int i10) {
        this.f4263a = i10;
        this.f4264b = gVar;
        this.f4265c = runnable;
        this.d = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f4263a) {
            case 0:
                ExecutorService executorService = this.f4264b.f4269a;
                final Runnable runnable = this.f4265c;
                final e0 e0Var = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) e0Var.f476b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e6) {
                                    ((i) e0Var.f476b).l(e6);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) e0Var.f476b;
                                try {
                                    runnable2.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    iVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f4264b.f4269a;
                final Runnable runnable2 = this.f4265c;
                final e0 e0Var2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) e0Var2.f476b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e6) {
                                    ((i) e0Var2.f476b).l(e6);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) e0Var2.f476b;
                                try {
                                    runnable22.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    iVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f4264b.f4269a;
                final Runnable runnable3 = this.f4265c;
                final e0 e0Var3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) e0Var3.f476b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e6) {
                                    ((i) e0Var3.f476b).l(e6);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) e0Var3.f476b;
                                try {
                                    runnable22.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    iVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
