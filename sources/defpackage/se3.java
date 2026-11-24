package defpackage;
public final class se3 implements Runnable {
    public final byte a;
    public final ue3 b;
    public final Runnable c;
    public final k6d d;

    public se3(ue3 ue3Var, Runnable runnable, k6d k6dVar, byte b) {
        this.a = b;
        this.b = ue3Var;
        this.c = runnable;
        this.d = k6dVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final k6d k6dVar = this.d;
        final Runnable runnable = this.c;
        ue3 ue3Var = this.b;
        switch (b) {
            case 0:
                ue3Var.a.execute(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        k6d k6dVar2 = k6dVar;
                        Runnable runnable2 = runnable;
                        switch (b2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((we3) k6dVar2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((we3) k6dVar2.b).l(e2);
                                    return;
                                }
                            default:
                                we3 we3Var = (we3) k6dVar2.b;
                                try {
                                    runnable2.run();
                                    we3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    we3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ue3Var.a.execute(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        k6d k6dVar2 = k6dVar;
                        Runnable runnable2 = runnable;
                        switch (b2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((we3) k6dVar2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((we3) k6dVar2.b).l(e2);
                                    return;
                                }
                            default:
                                we3 we3Var = (we3) k6dVar2.b;
                                try {
                                    runnable2.run();
                                    we3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    we3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ue3Var.a.execute(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        k6d k6dVar2 = k6dVar;
                        Runnable runnable2 = runnable;
                        switch (b2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((we3) k6dVar2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((we3) k6dVar2.b).l(e2);
                                    return;
                                }
                            default:
                                we3 we3Var = (we3) k6dVar2.b;
                                try {
                                    runnable2.run();
                                    we3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    we3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
