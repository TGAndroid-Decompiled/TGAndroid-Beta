package defpackage;

import org.telegram.ui.Dictation.DictationAsr;
public final class rl3 implements Runnable {
    public final byte a;
    public final vl3 b;

    public rl3(vl3 vl3Var, byte b) {
        this.a = b;
        this.b = vl3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vl3 vl3Var = this.b;
        switch (b) {
            case 0:
                DictationAsr.H(vl3Var);
                return;
            default:
                DictationAsr.H(vl3Var);
                return;
        }
    }
}
