package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class l implements Runnable {
    public final int f1326a;
    public final q f1327b;

    public l(q qVar, int i7) {
        this.f1326a = i7;
        this.f1327b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f1326a) {
            case 0:
                DictationAsr.I(this.f1327b);
                return;
            default:
                DictationAsr.I(this.f1327b);
                return;
        }
    }
}
