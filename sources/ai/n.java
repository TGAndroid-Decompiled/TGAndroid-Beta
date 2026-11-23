package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class n implements Runnable {
    public final int f1378a;
    public final boolean[] f1379b;

    public n(int i7, boolean[] zArr) {
        this.f1378a = i7;
        this.f1379b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f1378a) {
            case 0:
                boolean[] zArr = this.f1379b;
                p[] pVarArr = DictationAsr.f43033a;
                zArr[0] = true;
                return;
            default:
                this.f1379b[0] = true;
                return;
        }
    }
}
