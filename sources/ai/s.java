package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class s implements Runnable {
    public final int f1450a;
    public final boolean[] f1451b;

    public s(int i7, boolean[] zArr) {
        this.f1450a = i7;
        this.f1451b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f1450a) {
            case 0:
                boolean[] zArr = this.f1451b;
                t[] tVarArr = DictationAsr.f43064a;
                zArr[0] = true;
                return;
            default:
                this.f1451b[0] = true;
                return;
        }
    }
}
