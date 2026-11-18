package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class j implements Runnable {
    public final int f1245a;
    public final boolean[] f1246b;

    public j(int i7, boolean[] zArr) {
        this.f1245a = i7;
        this.f1246b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f1245a) {
            case 0:
                boolean[] zArr = this.f1246b;
                t[] tVarArr = DictationAsr.f43023a;
                zArr[0] = true;
                return;
            default:
                this.f1246b[0] = true;
                return;
        }
    }
}
