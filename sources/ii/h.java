package ii;

import org.telegram.ui.cn;
public final class h implements Runnable {
    public final int f15541a;
    public final p f15542b;
    public final long f15543c;

    public h(p pVar, long j3, int i7) {
        this.f15541a = i7;
        this.f15542b = pVar;
        this.f15543c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15541a) {
            case 0:
                p.c0(this.f15542b, this.f15543c);
                return;
            default:
                p pVar = this.f15542b;
                pVar.getClass();
                pVar.presentFragment(cn.ta(this.f15543c));
                return;
        }
    }
}
