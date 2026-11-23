package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class o implements Runnable {
    public final int f1346a;
    public final t f1347b;

    public o(t tVar, int i7) {
        this.f1346a = i7;
        this.f1347b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f1346a) {
            case 0:
                DictationAsr.F(this.f1347b);
                return;
            default:
                DictationAsr.F(this.f1347b);
                return;
        }
    }
}
