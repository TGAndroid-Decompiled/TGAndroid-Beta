package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class gl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17354a;
    public final MessageObject f17355b;
    public final long f17356c;
    public final int d;

    public gl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f17354a = translateController;
        this.f17355b = messageObject;
        this.f17356c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17354a.lambda$checkLanguage$15(this.f17355b, this.f17356c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f17356c;
        int i10 = this.d;
        this.f17354a.lambda$checkLanguage$13(this.f17355b, j10, i10, str);
    }
}
