package fi;
public final class tb implements Runnable {
    public final int f11725a;
    public final cc f11726b;

    public tb(cc ccVar, int i10) {
        this.f11725a = i10;
        this.f11726b = ccVar;
    }

    @Override
    public final void run() {
        switch (this.f11725a) {
            case 0:
                cc ccVar = this.f11726b;
                ac acVar = ccVar.M;
                if (acVar != null) {
                    long j10 = acVar.f10526a;
                    if (j10 > 0) {
                        ccVar.H = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                wb wbVar = this.f11726b.f10621a;
                if (wbVar != null) {
                    wbVar.I();
                    return;
                }
                return;
            default:
                wb wbVar2 = this.f11726b.f10621a;
                if (wbVar2 != null) {
                    wbVar2.m();
                    return;
                }
                return;
        }
    }
}
