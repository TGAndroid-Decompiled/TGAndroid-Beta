package defpackage;

import org.telegram.ui.Dictation.DictationAsr;
public final class km3 implements Runnable {
    public final byte a;
    public final nm3 b;

    public km3(nm3 nm3Var, byte b) {
        this.a = b;
        this.b = nm3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nm3 nm3Var = this.b;
        switch (b) {
            case 0:
                DictationAsr.J(nm3Var);
                return;
            default:
                DictationAsr.J(nm3Var);
                return;
        }
    }
}
