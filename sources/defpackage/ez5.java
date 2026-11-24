package defpackage;

import org.telegram.ui.LanguageSelectActivity;
public final class ez5 implements Runnable {
    public final byte a;
    public final LanguageSelectActivity b;

    public ez5(LanguageSelectActivity languageSelectActivity, byte b) {
        this.a = b;
        this.b = languageSelectActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        LanguageSelectActivity languageSelectActivity = this.b;
        switch (b) {
            case 0:
                languageSelectActivity.l0();
                return;
            case 1:
                languageSelectActivity.h0();
                return;
            default:
                languageSelectActivity.a.f();
                return;
        }
    }
}
