package defpackage;

import org.telegram.ui.Dictation.DictationAsr;
public final class cn3 implements Runnable {
    public final byte a;
    public final gn3 b;

    public cn3(gn3 gn3Var, byte b) {
        this.a = b;
        this.b = gn3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        gn3 gn3Var = this.b;
        switch (b) {
            case 0:
                DictationAsr.H(gn3Var);
                return;
            default:
                DictationAsr.H(gn3Var);
                return;
        }
    }
}
