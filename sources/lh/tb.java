package lh;

public final class tb implements Runnable {

    public final int f16879a;

    public final cc f16880b;

    public tb(cc ccVar, int i10) {
        this.f16879a = i10;
        this.f16880b = ccVar;
    }

    @Override
    public final void run() {
        switch (this.f16879a) {
            case 0:
                cc ccVar = this.f16880b;
                ac acVar = ccVar.I;
                if (acVar != null) {
                    long j10 = acVar.f15657a;
                    if (j10 > 0) {
                        ccVar.D = j10;
                    }
                }
                break;
            case 1:
                wb wbVar = this.f16880b.f15764a;
                if (wbVar != null) {
                    wbVar.Y1();
                }
                break;
            default:
                wb wbVar2 = this.f16880b.f15764a;
                if (wbVar2 != null) {
                    wbVar2.g0();
                }
                break;
        }
    }
}
