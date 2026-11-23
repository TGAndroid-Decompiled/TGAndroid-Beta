package hi;
public final class ob implements Runnable {
    public final int f15172a;
    public final xb f15173b;

    public ob(xb xbVar, int i7) {
        this.f15172a = i7;
        this.f15173b = xbVar;
    }

    @Override
    public final void run() {
        switch (this.f15172a) {
            case 0:
                xb xbVar = this.f15173b;
                vb vbVar = xbVar.N;
                if (vbVar != null) {
                    long j3 = vbVar.f15618a;
                    if (j3 > 0) {
                        xbVar.I = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rb rbVar = this.f15173b.f15792a;
                if (rbVar != null) {
                    rbVar.p0();
                    return;
                }
                return;
            default:
                rb rbVar2 = this.f15173b.f15792a;
                if (rbVar2 != null) {
                    rbVar2.t();
                    return;
                }
                return;
        }
    }
}
