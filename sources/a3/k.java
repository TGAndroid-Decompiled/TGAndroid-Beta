package a3;
public final class k implements Comparable {
    public final boolean f100a;
    public final boolean f101b;

    public k(e2.u uVar, int i7) {
        this.f100a = (uVar.f10602e & 1) != 0;
        this.f101b = jg.g.c(i7, false);
    }

    @Override
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        return h9.w.f14407a.c(this.f101b, kVar.f101b).c(this.f100a, kVar.f100a).e();
    }
}
