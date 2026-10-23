package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class bl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18057a;
    public final MessageObject f18058b;
    public final long f18059c;
    public final int d;

    public bl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f18057a = translateController;
        this.f18058b = messageObject;
        this.f18059c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f18057a.lambda$checkLanguage$15(this.f18058b, this.f18059c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f18059c;
        int i10 = this.d;
        this.f18057a.lambda$checkLanguage$13(this.f18058b, j10, i10, str);
    }
}
