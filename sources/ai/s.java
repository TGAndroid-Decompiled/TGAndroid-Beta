package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class s implements Runnable {
    public final int f1500a;
    public final boolean[] f1501b;

    public s(int i7, boolean[] zArr) {
        this.f1500a = i7;
        this.f1501b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f1500a) {
            case 0:
                boolean[] zArr = this.f1501b;
                t[] tVarArr = DictationAsr.f42579a;
                zArr[0] = true;
                return;
            default:
                this.f1501b[0] = true;
                return;
        }
    }
}
