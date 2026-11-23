package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class i implements Runnable {
    public final int f1219a;
    public final boolean[] f1220b;

    public i(int i7, boolean[] zArr) {
        this.f1219a = i7;
        this.f1220b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f1219a) {
            case 0:
                boolean[] zArr = this.f1220b;
                q[] qVarArr = DictationAsr.f43143a;
                zArr[0] = true;
                return;
            case 1:
                boolean[] zArr2 = this.f1220b;
                q[] qVarArr2 = DictationAsr.f43143a;
                zArr2[0] = true;
                return;
            default:
                this.f1220b[0] = true;
                return;
        }
    }
}
