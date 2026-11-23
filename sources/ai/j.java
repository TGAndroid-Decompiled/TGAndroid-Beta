package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class j implements Runnable {
    public final int f1299a;
    public final p f1300b;

    public j(p pVar, int i7) {
        this.f1299a = i7;
        this.f1300b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f1299a) {
            case 0:
                DictationAsr.E(this.f1300b);
                return;
            default:
                DictationAsr.E(this.f1300b);
                return;
        }
    }
}
