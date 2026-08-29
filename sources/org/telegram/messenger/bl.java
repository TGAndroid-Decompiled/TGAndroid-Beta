package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class bl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f19845a;
    public final MessageObject f19846b;
    public final long f19847c;
    public final int d;

    public bl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f19845a = translateController;
        this.f19846b = messageObject;
        this.f19847c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f19845a.lambda$checkLanguage$15(this.f19846b, this.f19847c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f19847c;
        int i10 = this.d;
        this.f19845a.lambda$checkLanguage$13(this.f19846b, j10, i10, str);
    }
}
