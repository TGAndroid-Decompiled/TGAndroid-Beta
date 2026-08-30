package d9;

import androidx.biometric.f0;
import java.util.concurrent.ExecutorService;
public final class e implements Runnable {
    public final int f4282a;
    public final g f4283b;
    public final Runnable f4284c;
    public final f0 d;

    public e(g gVar, Runnable runnable, f0 f0Var, int i10) {
        this.f4282a = i10;
        this.f4283b = gVar;
        this.f4284c = runnable;
        this.d = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f4282a) {
            case 0:
                ExecutorService executorService = this.f4283b.f4288a;
                final Runnable runnable = this.f4284c;
                final f0 f0Var = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) f0Var.f483b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e6) {
                                    ((i) f0Var.f483b).l(e6);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) f0Var.f483b;
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
                ExecutorService executorService2 = this.f4283b.f4288a;
                final Runnable runnable2 = this.f4284c;
                final f0 f0Var2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) f0Var2.f483b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e6) {
                                    ((i) f0Var2.f483b).l(e6);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) f0Var2.f483b;
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
                ExecutorService executorService3 = this.f4283b.f4288a;
                final Runnable runnable3 = this.f4284c;
                final f0 f0Var3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) f0Var3.f483b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e6) {
                                    ((i) f0Var3.f483b).l(e6);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) f0Var3.f483b;
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
