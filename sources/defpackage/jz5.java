package defpackage;

import org.telegram.ui.LanguageSelectActivity;
public final class jz5 implements Runnable {
    public final byte a;
    public final LanguageSelectActivity b;

    public jz5(LanguageSelectActivity languageSelectActivity, byte b) {
        this.a = b;
        this.b = languageSelectActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        LanguageSelectActivity languageSelectActivity = this.b;
        switch (b) {
            case 0:
                languageSelectActivity.k0();
                return;
            case 1:
                languageSelectActivity.a.f();
                return;
            default:
                languageSelectActivity.g0();
                return;
        }
    }
}
