package defpackage;
public final class xyb implements Runnable {
    public final byte a;
    public final mzb b;

    public xyb(mzb mzbVar, byte b) {
        this.a = b;
        this.b = mzbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mzb mzbVar = this.b;
        switch (b) {
            case 0:
                if (mzbVar.i()) {
                    mzbVar.j();
                    return;
                }
                return;
            default:
                czb czbVar = mzbVar.K;
                czbVar.z1(true);
                azb azbVar = mzbVar.y;
                azbVar.z1(true);
                mzbVar.N.a(true, true);
                gm.V3(azbVar);
                gm.V3(czbVar);
                return;
        }
    }
}
