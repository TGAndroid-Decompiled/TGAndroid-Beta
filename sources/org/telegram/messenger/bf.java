package org.telegram.messenger;
public final class bf implements Runnable {
    public final int f14959a;
    public final df f14960b;
    public final int f14961c;

    public bf(df dfVar, int i10, int i11) {
        this.f14959a = i11;
        this.f14960b = dfVar;
        this.f14961c = i10;
    }

    @Override
    public final void run() {
        switch (this.f14959a) {
            case 0:
                df dfVar = this.f14960b;
                try {
                    dfVar.f15374b.o(this.f14961c);
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                df dfVar2 = this.f14960b;
                try {
                    dfVar2.f15374b.o(this.f14961c);
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 2:
                df dfVar3 = this.f14960b;
                try {
                    dfVar3.f15374b.o(this.f14961c);
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            default:
                df dfVar4 = this.f14960b;
                try {
                    dfVar4.f15374b.o(this.f14961c);
                    return;
                } catch (Exception e11) {
                    f8.g(e11, true);
                    return;
                }
        }
    }
}
