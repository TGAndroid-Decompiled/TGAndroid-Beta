package hi;

import org.telegram.messenger.w10;
public final class y implements w10 {
    public final int f15852a;
    public final z f15853b;

    public y(z zVar, int i7) {
        this.f15852a = i7;
        this.f15853b = zVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f15852a) {
            case 0:
                this.f15853b.s2(((Long) obj).longValue());
                return;
            case 1:
                this.f15853b.w(((Boolean) obj).booleanValue());
                return;
            case 2:
                this.f15853b.s2(((Long) obj).longValue());
                return;
            case 3:
                this.f15853b.w(((Boolean) obj).booleanValue());
                return;
            default:
                this.f15853b.s2(((Long) obj).longValue());
                return;
        }
    }
}
