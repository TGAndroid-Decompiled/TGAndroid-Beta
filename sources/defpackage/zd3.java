package defpackage;
public final class zd3 implements Runnable {
    public final byte a;
    public final be3 b;
    public final Runnable c;
    public final z8d d;

    public zd3(be3 be3Var, Runnable runnable, z8d z8dVar, byte b) {
        this.a = b;
        this.b = be3Var;
        this.c = runnable;
        this.d = z8dVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final z8d z8dVar = this.d;
        final Runnable runnable = this.c;
        be3 be3Var = this.b;
        switch (b) {
            case 0:
                be3Var.a.execute(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        z8d z8dVar2 = z8dVar;
                        Runnable runnable2 = runnable;
                        switch (b2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((de3) z8dVar2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((de3) z8dVar2.b).l(e2);
                                    return;
                                }
                            default:
                                de3 de3Var = (de3) z8dVar2.b;
                                try {
                                    runnable2.run();
                                    de3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    de3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                be3Var.a.execute(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        z8d z8dVar2 = z8dVar;
                        Runnable runnable2 = runnable;
                        switch (b2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((de3) z8dVar2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((de3) z8dVar2.b).l(e2);
                                    return;
                                }
                            default:
                                de3 de3Var = (de3) z8dVar2.b;
                                try {
                                    runnable2.run();
                                    de3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    de3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                be3Var.a.execute(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        z8d z8dVar2 = z8dVar;
                        Runnable runnable2 = runnable;
                        switch (b2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((de3) z8dVar2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((de3) z8dVar2.b).l(e2);
                                    return;
                                }
                            default:
                                de3 de3Var = (de3) z8dVar2.b;
                                try {
                                    runnable2.run();
                                    de3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    de3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
