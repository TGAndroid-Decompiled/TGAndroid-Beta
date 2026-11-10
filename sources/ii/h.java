package ii;

import org.telegram.ui.cn;
public final class h implements Runnable {
    public final int f15540a;
    public final p f15541b;
    public final long f15542c;

    public h(p pVar, long j3, int i7) {
        this.f15540a = i7;
        this.f15541b = pVar;
        this.f15542c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15540a) {
            case 0:
                p.c0(this.f15541b, this.f15542c);
                return;
            default:
                p pVar = this.f15541b;
                pVar.getClass();
                pVar.presentFragment(cn.ta(this.f15542c));
                return;
        }
    }
}
