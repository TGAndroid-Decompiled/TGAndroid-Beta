package a8;

import java.util.concurrent.Callable;
public final class pa implements Callable {
    public final int f582a;
    public final pb.k f583b;

    public pa(pb.k kVar, int i7) {
        this.f582a = i7;
        this.f583b = kVar;
    }

    @Override
    public final Object call() {
        switch (this.f582a) {
            case 0:
                return this.f583b.a();
            case 1:
                return this.f583b.a();
            case 2:
                return this.f583b.a();
            case 3:
                return this.f583b.a();
            default:
                return this.f583b.a();
        }
    }
}
