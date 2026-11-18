package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class p implements Runnable {
    public final int f1415a;
    public final t f1416b;

    public p(t tVar, int i7) {
        this.f1415a = i7;
        this.f1416b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f1415a) {
            case 0:
                DictationAsr.D(this.f1416b);
                return;
            default:
                DictationAsr.D(this.f1416b);
                return;
        }
    }
}
