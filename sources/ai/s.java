package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class s implements Runnable {
    public final int f1458a;
    public final boolean[] f1459b;

    public s(int i7, boolean[] zArr) {
        this.f1458a = i7;
        this.f1459b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f1458a) {
            case 0:
                boolean[] zArr = this.f1459b;
                t[] tVarArr = DictationAsr.f43067a;
                zArr[0] = true;
                return;
            default:
                this.f1459b[0] = true;
                return;
        }
    }
}
