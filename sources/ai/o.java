package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class o implements Runnable {
    public final int f1360a;
    public final t f1361b;

    public o(t tVar, int i7) {
        this.f1360a = i7;
        this.f1361b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f1360a) {
            case 0:
                DictationAsr.F(this.f1361b);
                return;
            default:
                DictationAsr.F(this.f1361b);
                return;
        }
    }
}
