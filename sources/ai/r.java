package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class r implements Runnable {
    public final int f1491a;
    public final boolean[] f1492b;

    public r(int i7, boolean[] zArr) {
        this.f1491a = i7;
        this.f1492b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f1491a) {
            case 0:
                boolean[] zArr = this.f1492b;
                s[] sVarArr = DictationAsr.f42579a;
                zArr[0] = true;
                return;
            default:
                this.f1492b[0] = true;
                return;
        }
    }
}
